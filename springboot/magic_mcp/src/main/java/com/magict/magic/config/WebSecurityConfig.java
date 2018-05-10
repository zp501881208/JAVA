package com.magict.magic.config;

import com.magict.magic.compoment.CustomAuthenticationSuccessHandler;
import com.magict.magic.compoment.SecurityCmpt;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author ZP
 * @date 2018/5/1020:32
 * @description:
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
    @Autowired
    SecurityCmpt securityCmpt;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //除home页面外其余页面需要登录才可访问
                .antMatchers("/home").permitAll()
                .anyRequest().authenticated()
                //登录
                .and().formLogin().loginPage("/login").successHandler(customAuthenticationSuccessHandler)
                .permitAll()
                //无权访问
                .and().exceptionHandling().accessDeniedPage("/unauthorize")
                .and().httpBasic();
    }


    /**
     * 排除静态页面拦截
     * @param web
     */
    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/assets/**","images/**","/css/**","/js/**","/upload/**");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityCmpt).passwordEncoder(passwordEncoder());
    }


    /**
     * 配置加密器
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence rawPassword) {
                return DigestUtils.sha256Hex(DigestUtils.md5Hex(rawPassword.toString()));
            }
            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                //先md5加密 再sha256加密
                return encode(rawPassword).equals(encodedPassword);
            }
        };
    }
}
