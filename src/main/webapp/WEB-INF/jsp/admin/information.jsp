<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="../css/bootstrap.min.css" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="../css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../css/AdminLTE.min.css">
  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect. -->
  <link rel="stylesheet" href="../css/skin/skin-black.min.css">
<link rel="stylesheet" href="../css/dataTables.bootstrap.min.css" />
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  
  <link rel="stylesheet" href="../css/menu.css" />

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
        <a href="#" class="logo">
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
                <li><a href="./评论管理.html"><i class="fa fa-fw fa-comments"></i> <span>评论</span></a></li>
                <li><a href="/b-admin/link"><i class="fa fa-link"></i> <span>友情链接</span></a></li>
                <li><a href="/b-admin/notice"><i class="fa fa-fw fa-calendar-minus-o"></i><span>公告</span></a></li>
                <li class=" active"><a href="/b-admin/information"><i class="fa fa-fw fa-gear"></i><span>博客信息</span></a></li>
                <li><a href="/"><i class="fa fa-fw fa-desktop"></i><span>返回首页</span></a></li>
              </ul>
      <!-- /.sidebar-menu -->
          </section>
          <!-- 风格结束 -->
      </aside>
      <!-- 右侧内容 -->
      <div id='home' class="content-wrapper">
          <div class="row">
              <div class="col-xs-6">
                  <div class="box box-primary">
                      <div class="box-header with-border">
                        <h3 class="box-title">博客信息</h3>
                      </div>
                      <form role="form" method="post" action="/b-admin/setInformation">
                        <div class="box-body">
                          <div class="form-group">
                            <label for="blogName">博客名称</label>
                            <input type="text" class="form-control" id="blogName" name="blogName" value="${blogName}" placeholder="博客名称">
                          </div>
                          <div class="form-group">
                            <label for="blogDomain">博客域名</label>
                            <input type="text" class="form-control" id="blogDomain" name="blogDomain" value="${blogDomain}" placeholder="博客域名">
                          </div>
                        </div>
                        <div class="box-footer">
                          <button type="submit" class="btn btn-primary">更改</button>
                        </div>
                      </form>
                    </div>
              </div>
                    <div class="col-xs-6">
                        <div class="box box-primary">
                            <div class="box-header with-border">
                              <h3 class="box-title">管理员信息</h3>
                            </div>
                            <form role="form" action="/b-admin/setAdmin" method="post">
                              <div class="box-body">
                                <div class="form-group">
                                    <label for="blogUserName">用户名</label>
                                    <input type="text" class="form-control" value="${userName}" name="blogUserName" id="blogUserName" placeholder="管理员用户名">
                                </div>
                                <div class="form-group">
                                    <label for="blogOldPwd">旧密码</label>
                                    <input type="text" class="form-control" id="blogOldPwd" name="blogOldPwd" placeholder="请输入旧密码">
                                </div>
                                <div class="form-group">
                                    <label for="blogNewPwd">新密码</label>
                                    <input type="text" class="form-control" id="blogNewPwd" name="blogNewPwd" placeholder="请输入新密码">
                                </div>
                                <div class="form-group">
                                    <label for="confirmPwd">确认密码</label>
                                    <input type="text" class="form-control" id="confirmPwd" placeholder="请输入确认密码">
                                </div>
                              </div>
                                <h3 style="color: red">${info}</h3>
                              <div class="box-footer">
                                <button type="submit" class="btn btn-primary">更改</button>
                              </div>
                            </form>
                          </div>
              </div>
            </div>  
      </div>
      <!-- 右侧内容 -->
    </div>
    <!-- ./wrapper -->


  
</body>
<!-- jQuery 3 -->
<script src="../js/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="../js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="../js/adminlte.min.js"></script>
<script type="text/javascript" src="../js/jquery.dataTables.min.js" ></script>
<script type="text/javascript" src="../js/dataTables.bootstrap.min.js" ></script>
</html>