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
//获取公告
$(function () {
    $.ajax({
        type:"post",
        url:"/notice",
        contentType:'application/json;charset=utf-8',
        success:function(data){//返回json结果
            $("#notice").html(data.notice)
        }
    })
})
//获取友情链接
$(function () {
    $.ajax({
        type:"post",
        url:"/link",
        contentType:'application/json;charset=utf-8',
        success:function(data){//返回json结果
            let link = data.link;
            console.log(link);
            for (let i = 0; i < link.length; i++) {
                $("#link").append("<li><a href='"+link[i].link_url+"'>"+link[i].link_name+"</a></li>");
            }

        }
    })
});
$(function () {
    $.ajax({
        type:"post",
        url:"/classifyList",
        contentType:'application/json;charset=utf-8',
        success:function(data){//返回json结果
            console.log(data.classify);
            // $("#classify_ul").html(data.classify)
            for (let i = 0; i < data.classify.length; i++) {
                if (data.classify[i].classify_id == data.classify_id){
                    $("#classify_ul").append("<li class='active'><a href='/classify/"+data.classify[i].classify_id+"'>"+data.classify[i].classify_name+"</a></li>");
                    $("#classify_info").html("<div class='panel panel-default'>\n" +
                        "    <div class='panel-body' style='overflow:hidden;'>                         \n" +
                        "  <a href='/'><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>主页</a>/"+data.classify[i].classify_name+"  " +
                        "</div>\n" +
                        "</div>");
                } else {
                    $("#classify_ul").append("<li><a href='/classify/"+data.classify[i].classify_id+"'>"+data.classify[i].classify_name+"</a></li>");
                }

            }
            if (data.search_status == "ok"){
                $("#classify_info").html("<div class='panel panel-default'>\n" +
                    "    <div class='panel-body' style='overflow:hidden;'>                         \n" +
                    "  <a href='/'><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>主页</a>/搜索  " +
                    "</div>\n" +
                    "</div>");
            }

        }
    });
});
$("#search-btn").click(function () {
    var search = $("#search").val();
    window.location.href="/search/"+search;

});