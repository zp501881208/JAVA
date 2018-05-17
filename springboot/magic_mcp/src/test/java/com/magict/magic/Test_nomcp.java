package com.magict.magic;/**
 * @author ZP
 * @date 2018/5/149:17
 * @description:
 */

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author ZP
 * @date 2018/5/149:17
 * @description:
 */
public class Test_nomcp {

    public static void main(String[] args) {
        String rawPassword = "123456";//cdf4a007e2b02a0c49fc9b7ccfbb8a10c644f635e1765dcf2a7ab794ddc7edac
        String encodePass = DigestUtils.sha256Hex(DigestUtils.md5Hex(rawPassword.toString()));
        System.out.println("=======:"+encodePass);

    }
}
