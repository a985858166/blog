$(function () {
    $.ajax({
        type:"post",
        url:"/status",
        contentType:'application/json;charset=utf-8',
        success:function(data){//返回json结果
            $("#login").html(data.ul)
        }
    })
})
$(function () {
    $.ajax({
        type:"post",
        url:"/notice",
        contentType:'application/json;charset=utf-8',
        success:function(data){//返回json结果
            console.log(data.notice)
            $("#notice").html(data.notice)
        }
    })
})