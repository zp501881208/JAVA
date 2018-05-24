// (function(){
//     // var tDiv = document.getElementsByClassName("nav"),
//     index = 0;//默认第一个菜单项
//     // urla = location.href.split('?')[0].split('/');
//     var url = document.location.pathname;
//     // var url = urla[4]+"/"+urla[5]
//     // urla.pop();
//     // var url = urla.pop();
//     var links = new Array();
//     // links = $(".nav-list li a");
//     links = $(".submenu");
//
//     if(url){
//         for (var i=links.length; i--;) {
//             var b = links[i].attr("href").charAt('?');
//             var c = links[i].attr("href");
//             if(b>0){
//                 var a=links[i].href.split('?')[0].split('/');
//             }else{
//                 var a=links[i].href.split('/');
//             }
//             console.log(a);
//             a.pop();
//             a = a.pop();
//             if(a==url){
//                 index = i;
//                 break;
//             }
//         }
//     }
//     links.eq(index).closest("li").addClass("active").siblings().removeClass("active");
// })();

$(document).ready(function(){
    //默认选中第一个
    var cc = $(".nav-list").children(":first").addClass("active");
    //获取访问路径跟菜单functionUrl匹配
    var pathurl = document.location.pathname;
    // var links1 = $(".submenu");
    var links2 = $(".submenu").children("li").children("a");
    if(links2){
        for (var i=links2.length;i--;){
            var a = links2[i];
            var url = a.href;
            if(url.indexOf(pathurl)>0){
                var c = a.parentNode;
                $(c).addClass("active").siblings().removeClass("active");
                var d = c.parentNode.parentNode;
                $(d).addClass("active").siblings().removeClass("active");
            }
        }
    }

});


//confirm框
function confirmModal(conMsg,conHref){
    var conTitle = "确认", // 提示 标题
        //conMsg = "我是内容",//内容
        //conHref = "baidu.com",//确认按钮链接，警告框则不填
        conClose = true,//是否有关闭按钮
        conSubmit = true;//是否有提交按钮
    showMyModal(conTitle,conMsg,conHref,conClose,conSubmit);
}
//alert框
function alertModal(conMsg){
    var conTitle = "警告", // 提示 标题
        conHref = "",//确认按钮链接，警告框则不填
        conClose = true,//是否有关闭按钮
        conSubmit = false;//是否有提交按钮
    showMyModal(conTitle,conMsg,conHref,conClose,conSubmit);
}
function showMyModal(conTitle,conMsg,conHref,conClose,conSubmit){
    $(".mymodal").remove();
    $("body").append('<div class="modal fade mymodal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" data-keyboard="false"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><a class="close" data-dismiss="modal">&times;</a><h4 class="modal-title" id="myModalLabel">'+ conTitle +'</h4></div><div class="modal-body">'+ conMsg +'</div><div class="modal-footer"><a class="btn btn-default closebtn" data-dismiss="modal">关闭</a><a class="btn btn-primary consubmit" href="'+ conHref +'">确认</a></div></div></div></div>')
    if(conClose){
        $(".close").show();
        $(".closebtn").show();
    }else{
        $(".close").hide();
        $(".closebtn").hide();
    }
    if(conSubmit){
        $(".consubmit").show();
    }else{
        $(".consubmit").hide();
    }
    $('.mymodal').modal();
}

//cookie存储用户最近点击菜单，用于当前菜单高亮显示，展开二级菜单
// var currentMenuId=null;//当前菜单
// $(function () {
//     var menuId = $.cookie('the_cookie');
//     if(menuId!=undefined){
//         currentMenuId = menuId;
//     }
// });

function setCurrentMenu(e) {
    $(e).addClass("active").siblings().removeClass("active");
}