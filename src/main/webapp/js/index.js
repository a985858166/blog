
$(function () {
    $.ajax({
        type:"post",
        url:"/showArticleList",
        contentType:'application/json;charset=utf-8',
        success:function(data){//返回json结果
            console.log(data)
            articeList = data.articeList;
            for (var i = 0; i < articeList.length; i++) {
                $("#articeList").append("<div class=\"bs-example\" data-example-id=\"contextual-panels\">\n" +
                    "                          <div class=\"panel panel-info\">\n" +
                    "                              <div class=\"panel-heading\">\n" +
                    "                                  <h3 class=\"panel-title\">"+articeList[i].article_title+"</h3>\n" +
                    "                              </div>\n" +
                    "                              <div class=\"panel-body\">"+articeList[i].article_content+"</div>\n" +
                    "                              <div class=\"panel-footer\">\n" +
                    "                                  <div class=\"row\">\n" +
                    "                                      <div class=\"col-xs-3\">\n" +
                    "                                          <i class=\"fa fa-fw fa-commenting-o\"></i>评论\n" +
                    "                                      </div>\n" +
                    "                                      <div class=\"col-xs-3\">\n" +
                    "                                          <i class=\"fa fa-fw fa-calendar\"></i>"+getDate(articeList[i].article_date)+"\n" +
                    "                                      </div>\n" +
                    "                                      <div class=\"col-xs-3\">\n" +
                    "                                          <i class=\"fa fa-fw fa-user\"></i>"+articeList[i].user.user_username+"\n" +
                    "                                      </div>\n" +
                    "                                      <div class=\"col-xs-3\">\n" +
                    "                                          <i class=\"fa fa-fw fa-eye\"></i>29\n" +
                    "                                      </div>\n" +
                    "                                  </div>\n" +
                    "\n" +
                    "                              </div>\n" +
                    "                          </div>\n" +
                    "\n" +
                    "                      </div>");
            }
            var pages = data.pages;
            var pageNum = data.pageNum;
            if (pageNum != 1){
                $("#paging").append("<li><a href='/page/"+1+"'>首页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='#'>首页</a></li>");
            }
            if (pageNum > 1){
                $("#paging").append("<li><a href='/page/"+(pageNum-1)+"'>上一页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='#'>上一页</a></li>");
            }
            var i = 1;
            var endPage = pages;
            if (pageNum>3){
                $("#paging").append("<li class='disabled'><a href='#'>...</a></li>");
                i = pageNum-3;
            }
            if (pageNum+3<pages){
                endPage = pageNum+3;
            }
            for (i; i <= endPage; i++) {
                if (i==pageNum) {
                    $("#paging").append("<li class='active'><a href='/page/"+i+"'>"+i+"</a></li>");
                }else {
                    $("#paging").append("<li><a href='/page/"+i+"'>"+i+"</a></li>");
                }

            }
            if (pageNum+3<pages){
                $("#paging").append("<li class='disabled'><a href='#'>...</a></li>");
            }
            if (pageNum < pages){
                $("#paging").append("<li><a href='/page/"+(pageNum+1)+"'>下一页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='#'>下一页</a></li>");
            }
            if (pageNum != pages){
                $("#paging").append("<li><a href='/page/"+pages+"'>尾页</a></li>");
            }else {
                $("#paging").append("<li class='disabled'><a href='#'>尾页</a></li>");
            }
        }
    })
})
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