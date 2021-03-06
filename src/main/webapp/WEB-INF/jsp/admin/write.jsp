<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="/css/bootstrap.min.css"/>
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
    <link rel="stylesheet" href="/css/dataTables.bootstrap.min.css"/>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="/css/menu.css"/>

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
                <li class="treeview active">
                    <a href="#"><i class="fa fa-fw fa-book"></i> <span>文章</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="/b-admin/allArticle">所有文章</a></li>
                        <li  class="active"><a href="/b-admin/write">写文章</a></li>
                        <li><a href="/b-admin/classify">文章分类</a></li>
                    </ul>
                </li>
                <li><a href="/b-admin/comment"><i class="fa fa-fw fa-comments"></i> <span>评论</span></a></li>
                <li><a href="/b-admin/link"><i class="fa fa-link"></i> <span>友情链接</span></a></li>
                <li><a href="/b-admin/notice"><i class="fa fa-fw fa-calendar-minus-o"></i><span>公告</span></a>
                </li>
                <li><a href="/b-admin/information"><i class="fa fa-fw fa-gear"></i><span>博客信息</span></a></li>
                <li><a href="/"><i class="fa fa-fw fa-desktop"></i><span>返回首页</span></a></li>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- 风格结束 -->
    </aside>
    <!-- 右侧内容 -->
    <div id='home' class="content-wrapper">
        <section class="content-header">
            <h1>
                写文章
                <!--<small>Optional description</small>-->
            </h1>
            <!-- <ol class="breadcrumb">
              <li><a href="home.html"><i class="fa fa-dashboard"></i>home</a></li>
              <li class="active">Here</li>
            </ol> -->
        </section>

        <!-- /.content-wrapper -->
        <section class="content">
            <div class="form-group">
                <label for="article_title">你的标题</label>
                <input type="text" class="form-control" id="article_title" placeholder="标题">
            </div>
            <div id="editor">

            </div>
            <br>
            <br>
            <%--开始--%>
            <form class="form-inline">
                <div class="row">
                    <div class="col-md-4">
                        <div class="form-group">
                            <label>文章分类:</label>
                            <select class="form-control" id="selectClassify">
                            </select>
                        </div>
                    </div>
                    <div class="col-md-3 col-md-offset-2">
                        <div class="form-group">
                            <label class="sr-only"></label>
                            <button type="button" class="release btn btn-primary" id="release" data-status="1">发布</button>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="form-group">
                            <label class="sr-only"></label>
                            <button type="button" class="release btn btn-primary" id="draft" data-status="2">草稿</button>
                        </div>

                    </div>
                </div>
            </form>
            <%--结束--%>
        </section>
    </div>
    <!-- ./wrapper -->


</body>
<!-- jQuery 3 -->
<script src="/js/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="/js/adminlte.min.js"></script>
<script type="text/javascript" src="/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="../wangEditor/wangEditor.min.js"></script>
<script type="text/javascript">
    var listClasify;
    var E = window.wangEditor;
    var editor = new E('#editor');
    editor.create();
    //发布文章
    $(function () {
        $(".release").click(function (e) {
            var article_status = $(this).data("status");
            var article_title = $("#article_title").val();
            var article_classify_id = listClasify[$("#selectClassify").val()]["classify_id"];
            var jsonData = {"article_content": editor.txt.html(),"article_title":article_title,
            "article_classify_id":article_classify_id,"article_status":article_status};
            $.ajax({
                type: 'post',
                url: '/b-admin/newArticle',
                contentType: 'application/json;charset=utf-8',//指定为json类型
                //数据格式是json串，商品信息
                data: JSON.stringify(jsonData),
                success: function (data) {//返回json结果
                    if (data.status == "ok"){
                        alert("发布成功");
                        window.location.href="editWrite?article_id="+data.article_id+"";

                    }else {
                        alert("发布失败");
                    }
                }
            });
        });
    });
    $(function () {
        $.ajax({
            type: 'post',
            url: '/b-admin/listClassify',
            contentType: 'application/json;charset=utf-8',//指定为json类型
            success: function (data) {//返回json结果
                listClasify = data.classify;
                for (var i = 0; i < listClasify.length; i++) {
                    $("#selectClassify").append("<option value="+i+">"+listClasify[i]['classify_name']+"</option>");
                }
            }
        });
    });
</script>
</html>