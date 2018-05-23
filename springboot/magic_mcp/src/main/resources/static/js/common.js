// 样式出错暂不采用此方法统一引入css js文件

var ymLoadParts = {};
var pathName = document.location.pathname;
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);

ymLoadParts.loadCSS = function () {
    document.write('<link href='+projectName+'/assets/css/bootstrap.min.css th:href="@{/assets/css/bootstrap.min.css}" rel="stylesheet" />');
    document.write('<link rel="stylesheet" href='+projectName+'/assets/css/font-awesome.min.css th:href="@{/assets/css/font-awesome.min.css}"/>');
    document.write('<link rel="stylesheet" href='+projectName+'/assets/css/font-awesome-ie7.min.css/>');
    document.write('<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />');
    document.write('<link rel="stylesheet" href='+projectName+'/assets/css/ace.min.css th:href="@{/assets/css/ace.min.css}"/>');
    document.write('<link rel="stylesheet" href='+projectName+'/assets/css/ace-rtl.min.css th:href="@{/assets/css/ace-rtl.min.css}"/>');
    document.write('<link rel="stylesheet" href='+projectName+'/assets/css/ace-skins.min.css th:href="@{/assets/css/ace-skins.min.css}"/>');
    document.write('<link rel="stylesheet" href='+projectName+'/assets/css/ace-ie.min.css th:href="@{/assets/css/ace-ie.min.css}"/>');

};
/**
 * Created by zhang on 2017/5/27.
 */
ymLoadParts.loadCSS();
ymLoadParts.loadJS = function () {
    var _head = '';
    _head +=
        '<script src='+projectName+'/assets/js/ace-extra.min.js th:src="@{/assets/js/ace-extra.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/html5shiv.js th:src="@{/assets/js/html5shiv.js}"></script>'+
        '<script src='+projectName+'/assets/js/respond.min.js th:src="@{/assets/js/respond.min.js}"></script>'+
        // '<script src='+projectName+'/assets/js/jquery-2.0.3.min.js th:src="@{/assets/js/jquery-2.0.3.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/bootstrap.min.js th:src="@{/assets/js/bootstrap.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/typeahead-bs2.min.js th:src="@{/assets/js/typeahead-bs2.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/excanvas.min.js th:src="@{/assets/js/excanvas.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/jquery-ui-1.10.3.custom.min.js th:src="@{/assets/js/jquery-ui-1.10.3.custom.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/jquery.ui.touch-punch.min.js th:src="@{/assets/js/jquery.ui.touch-punch.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/jquery.slimscroll.min.js th:src="@{/assets/js/jquery.slimscroll.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/jquery.easy-pie-chart.min.js th:src="@{/assets/js/jquery.easy-pie-chart.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/jquery.sparkline.min.js th:src="@{/assets/js/jquery.sparkline.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/flot/jquery.flot.min.js th:src="@{/assets/js/flot/jquery.flot.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/flot/jquery.flot.pie.min.js th:src="@{/assets/js/flot/jquery.flot.pie.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/flot/jquery.flot.resize.min.js th:src="@{/assets/js/flot/jquery.flot.resize.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/ace-elements.min.js th:src="@{/assets/js/ace-elements.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/ace.min.js th:src="@{/assets/js/ace.min.js}"></script>'+
        '<script src='+projectName+'/assets/js/common.js th:src="@{/assets/js/common.js}"></script>'
    ;
    $('head').append(_head);
    if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
};
ymLoadParts.loadJS();
// $(function(){
    //引入共用头部 顶部 底部
    // $("#header").load("/include/header.html");
    // $("#loginFooter").load("/include/loginFooter.html");
    // $("#footer").load("/include/footer.html");
    // $("#account_menu").load("/include/account_menu.html");
// });

