var article;
$(function () {
    $.ajax({
        type:"post",
        url:"/articleData",
        contentType:'application/json;charset=utf-8',
        success:function(data){
            console.log(data.article);
            article = data.article;
            $("#article_title").text(article.article_title);
            $("#article_content").append(article.article_content);
            listComment(1);
        }
    });
});
$("#comment_submit").click(function () {
    var comment = new Map();
    comment.comment_article_id = article.article_id;
    comment.comment_author_name = $("#comment_name").val();
    comment.comment_author_email = $("#comment_email").val();
    comment.comment_author_url = $("#comment_url").val();
    comment.comment_author_content = $("#comment_content").val();
    $.ajax({
        type:"post",
        url:"/addComment",
        contentType:'application/json;charset=utf-8',
        data:JSON.stringify(comment),
        success:function (data) {
            if (data.status == "ok"){
                listComment(1);
                $("#comment_content").val("");
                alert("评论成功")
            }else {
                alert("评论失败")
            }
        }
    });
});

function listComment (e) {
    var comment_article_id = Number(article.article_id);
    console.log(typeof comment_article_id)
    var temp = new Map();
    temp.comment_article_id = comment_article_id;
    temp.pageNum = e;
    $.ajax({
        type:"post",
        url:"/listComment",
        contentType:'application/json;charset=utf-8',
        data:JSON.stringify(temp),
        success:function (data) {
            console.log(data.list)
            $("#list_comment").html("");
            $("#paging").html("");
            var list = data.list;
            for (let i = list.length-1; i >= 0 ; i--) {
                $("#list_comment").append("<div class=\"page-header\">\n" +
                    "                                      <h4>"+list[i].comment_author_name+"<small>("+getDate(list[i].comment_author_date)+")</small></h4>\n" +
                    "                                      <p>"+list[i].comment_author_content+"</p>\n" +
                    "                                  </div>");
            }
            var pages = data.pages;
            var pageNum = data.pageNum;
            console.log(pages);
            if (pageNum != 1){
                $("#paging").append("<li><a href='javascript:void(0);' onclick='listComment(1)'>首页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='javascript:void(0);'>首页</a></li>");
            }
            if (pageNum > 1){
                $("#paging").append("<li><a href='javascript:void(0);' onclick='listComment("+(pageNum-1)+")'>上一页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='javascript:void(0);'>上一页</a></li>");
            }
            var i = 1;
            var endPage = pages;
            if (pageNum>3){
                $("#paging").append("<li class='disabled'><a href='javascript:void(0);'>...</a></li>");
                i = pageNum-3;
            }
            if (pageNum+3<pages){
                endPage = pageNum+3;
            }
            for (i; i <= endPage; i++) {
                if (i==pageNum) {
                    $("#paging").append("<li class='active'><a href='javascript:void(0);' onclick='listComment("+i+")'>"+i+"</a></li>");
                }else {
                    $("#paging").append("<li><a href='javascript:void(0);' onclick='listComment("+i+")'>"+i+"</a></li>");
                }

            }
            if (pageNum+3<pages){
                $("#paging").append("<li class='disabled'><a href='javascript:void(0);'>...</a></li>");
            }
            if (pageNum < pages){
                $("#paging").append("<li><a href='javascript:void(0);' onclick='listComment("+(pageNum+1)+")'>下一页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='javascript:void(0);'>下一页</a></li>");
            }
            if (pageNum < pages){
                $("#paging").append("<li><a href='javascript:void(0); onclick='listComment("+pages+")'>尾页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='javascript:void(0);'>尾页</a></li>");
            }


        }
    });
}


function getDate(obj) {
    var time = new Date(obj);
    var y = time.getFullYear();//年
    var m = time.getMonth() + 1;//月
    var d = time.getDate();//日
    var h = time.getHours();//时
    var mm = time.getMinutes();//分
    var s = time.getSeconds();//秒
    // return y+"-"+m+"-"+d+" "+h+":"+mm+":"+s;
    return y+"-"+m+"-"+d+" "+h+":"+mm+":"+s;
}



