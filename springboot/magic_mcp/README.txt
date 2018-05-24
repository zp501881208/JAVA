1.项目名称在配置文件中配置server.context-path=mcp
2.context-path配置导致前端a标签链接容易丢失项目名称路径，必须统一使用@{}的方式，如：<a th:href="@{${menu.functionUrl}}">
3.菜单icon图标在[font-awesome.min.css]中
4.菜单的选中样式在myPage.css中，js/myPage.js中控制菜单选中和自动匹配子菜单