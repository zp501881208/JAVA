(function(){
    var tDiv = document.getElementsByClassName("nav"),
        index = 0,//默认第一个菜单项
        urla = location.href.split('?')[0].split('/');
    urla.pop();
    var url = urla.pop();
    var links = new Array();
    links = $(".nav-list li a");
    if(url){
        for (var i=links.length; i--;) {
            var a=links[i].href.split('?')[0].split('/');
            a.pop();
            a = a.pop();
            if(a==url){
                index = i;
                break;
            }
        }
    }
    links.eq(index).closest("li").addClass("active").siblings().removeClass("active")
})();
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