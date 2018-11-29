<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="/css/bootstrap.min.css" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect. -->
  <link rel="stylesheet" href="/css/skin/skin-black.min.css">
<link rel="stylesheet" href="/css/dataTables.bootstrap.min.css" />
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  
  <link rel="stylesheet" href="/css/menu.css" />

  <!-- Google Font -->
  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
  <title>后台管理</title>
</head>
<body class="hold-transition skin-black sidebar-mini">
    <!-- 内容主体 -->
    <div class="wrapper">

       <!-- 导航栏 -->
    <header class="main-header">

        <!-- Logo -->
        <a href="/" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>博客</b></span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>基于SSM框架的博客</b></span>
        </a>
    
        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <!-- Navbar Right Menu -->
          <!-- <ul class="nav navbar-nav navbar-right">
              <li id="exit"><a href="#">安全退出</a></li>
          </ul> -->
    
        </nav>
      </header>
      <!-- 导航栏结束 -->

      <!-- 侧边导航栏 -->
      <aside class="main-sidebar">
        <!-- 风格 -->
          <section class="sidebar">
                    <!-- Sidebar Menu -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">菜单</li>
                <!-- Optionally, you can add icons to the links -->
                <!-- <li class="active"><a href="home.html"><i class="fa fa-link"></i> <span>博客信息</span></a></li> -->
                <li class="treeview">
                  <a href="#"><i class="fa fa-fw fa-book"></i> <span>文章</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                  </a>
                  <ul class="treeview-menu">
                    <li><a href="/b-admin/allArticle">所有文章</a></li>
                    <li><a href="/b-admin/write">写文章</a></li>
                    <li><a href="/b-admin/classify">文章分类</a></li>
                  </ul>
                </li>
                <li class="active"><a href="/b-admin/comment"><i class="fa fa-fw fa-comments"></i> <span>评论</span></a></li>
                <li><a href="/b-admin/link"><i class="fa fa-link"></i> <span>友情链接</span></a></li>
                <li><a href="/b-admin/notice"><i class="fa fa-fw fa-calendar-minus-o"></i><span>公告</span></a></li>
                <li><a href="/b-admin/information"><i class="fa fa-fw fa-gear"></i><span>博客信息</span></a></li>
                <li><a href="/"><i class="fa fa-fw fa-desktop"></i><span>返回首页</span></a></li>
              </ul>
      <!-- /.sidebar-menu -->
          </section>
          <!-- 风格结束 -->
      </aside>
      <!-- 右侧内容 -->
      <div id='home' class="content-wrapper">
        <%--<section class="content-header">--%>

        <%--</section>--%>
      
        <section class="content">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">评论管理</h3>

                    <div class="box-tools">

                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered responsive table-hover" id="table" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th width="8%" class="min-mobile-l">id</th>
                                <th width="8%" class="min-mobile-l">作者</th>
                                <th width="10%" class="min-mobile-l">评论</th>
                                <th width="8%" class="min-mobile-l">邮箱</th>
                                <th width="8%" class="min-mobile-l">网址</th>
                                <th width="8%" class="min-mobile-l">原文章</th>
                                <th width="8%" class="min-mobile-l">提交于</th>
                                <th width="8%" class="min-mobile-l">操作</th>
                            </tr>
                            </thead>
                        </table>
                    </div>
                </div>
                <!-- /.box-body -->
            </div>
            <!-- /.box -->
          
        </section>


      </div>
    </div>
    <!-- ./wrapper -->


  
</body>
<!-- jQuery 3 -->
<script src="/js/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="/js/adminlte.min.js"></script>
<script type="text/javascript" src="/js/jquery.dataTables.min.js" ></script>
<script type="text/javascript" src="/js/dataTables.bootstrap.min.js" ></script>
<script>
    var table;
    table = $("#table").DataTable({
        "ajax":{
            "url":"/b-admin/listComment",
            "type":"post",
            "dataSrc":function (data) {
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
                console.log(data.articleList);
                console.log(data.commentList);
                for (let i = 0; i < data.commentList.length; i++) {
                    data.commentList[i].article_title = data.articleList[i].article_title;
                    data.commentList[i].comment_author_date = getDate(data.commentList[i].comment_author_date);
                    data.commentList[i].article_title = "<a href='/article/"+data.commentList[i].comment_article_id+"'>"+data.commentList[i].article_title+"</a>"
                }
                return data.commentList;
            }
        },

        columns:[
            {"visible":false, data: "comment_id"},
            {data:'comment_author_name'},
            {data:'comment_author_content'},
            {data:'comment_author_email'},
            {data:'comment_author_url'},
            {data:'article_title'},
            {data:'comment_author_date'},
            {data:function (row) {
                    return "</button><button title='删除评论' data-id='"+row.comment_id+"'  style='color:gray' class='btn btn-link del-comment' type='button'><i style='font-size:15px' class='fa fa-trash-o'></i></button>";
                }}
        ],
        language: {
            "sProcessing": "处理中...",
            "sLengthMenu": "显示 _MENU_ 项结果",
            "sZeroRecords": "没有匹配结果",
            "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
            "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
            "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
            "sInfoPostFix": "",
            "sSearch": "搜索:",
            "sUrl": "",
            "sEmptyTable": "表中数据为空",
            "sLoadingRecords": "载入中...",
            "sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上页",
                "sNext": "下页",
                "sLast": "末页"
            },
            "oAria": {
                "sSortAscending": ": 以升序排列此列",
                "sSortDescending": ": 以降序排列此列"
            }
        }})
    //删除
    $(document).on('click', '.del-comment', function(e){

        //获取隐藏列的值
        var id = $(this).data("id");

        console.log(id);

        if (confirm("确定要删除该友情链接吗？")) {
            var jsonData = {
                "comment_id":id
            }
            $.ajax({
                type:'post',
                url:'/b-admin/delComment',
                contentType:'application/json;charset=utf-8',//指定为json类型
                //数据格式是json串，商品信息
                data:JSON.stringify(jsonData),
                success:function(data){//返回json结果
                    console.log(data.status)
                    table.ajax.reload();
                }
            });
        }
    });

</script>
</html>