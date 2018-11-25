$(function () {
    $.ajax({
        type:"post",
        url:"/articleData",
        contentType:'application/json;charset=utf-8',
        success:function(data){
            console.log(data.article);
            var article = data.article;
            $("#article_title").text(article.article_title);
            $("#article_content").append(article.article_content);
        }
    });
})



