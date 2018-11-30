<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>博客首页</title>
  <link rel="stylesheet" href="/css/bootstrap.min.css" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/css/AdminLTE.min.css">
  <link rel="stylesheet" href="/css/skin/_all-skins.min.css">
  <link rel="stylesheet" href="/css/skin/skin-black.min.css">
  <link rel="stylesheet" href="/css/dataTables.bootstrap.min.css" />
  <link rel="stylesheet" href="/css/menu.css" />
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
  

</head>
<body class="hold-transition skin-blue layout-top-nav">
  <!-- 页面主体，包含所有内容 -->
  <div class="wrapper">

      <header class="main-header">
          <nav class="navbar navbar-static-top">
              <div class="container">
                  <div class="navbar-header">
                      <a href="/" class="navbar-brand"><b>博客</b></a>
                      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
                          <i class="fa fa-bars"></i>
                      </button>
                  </div>
                  <div class="collapse navbar-collapse" id="navbar-collapse">
                      <ul class="nav navbar-nav" id="classify_ul">
                          <%--<li><a href="#">实用教程 <span class="sr-only">(current)</span></a></li>--%>
                          <%--<li><a href="#">编程技术</a></li>--%>
                          <%--<li><a href="#">系统运维</a></li>--%>
                          <%--<li><a href="#">资源分享</a></li>--%>
                      </ul>
                      <form action="#" method="get" class=" navbar-form navbar-left">
                          <div class="input-group">
                              <input type="text" id="search" class="form-control" placeholder="搜索">
                              <span class="input-group-btn">
                      <button type="button" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                      </button>
                    </span>
                          </div>
                      </form>
                      <ul class="nav navbar-nav navbar-right" id="login">
                          <%--<li><a href="#">登录</a></li>--%>
                          <%--<li><a href="#">注册</a></li>--%>
                      </ul>
                  </div>
                  <!-- /.navbar-collapse -->

              </div>
              <!-- /.container-fluid -->
          </nav>
      </header>
      <!-- Full Width Column -->
      <div class="content-wrapper">
          <div class="container">
              <!-- 中间 -->
              <div class="row" style="margin-top:15px">
                  <!-- 左边主体 -->
                  <div class="col-md-8">
                      <div id="classify_info"></div>
                      <div id="articeList"></div>
                      <ul class="pagination" id="paging">

                      </ul>
                  </div>
                  <!-- 右边信息 -->
                  <div class="col-md-3 col-md-offset-1 visible-md-block visible-lg-block">
                      <div class="panel panel-primary">
                          <div class="panel-heading">公告</div>
                          <div class="panel-body" style="overflow:hidden;" id="notice">
                              公告为空
                          </div>
                      </div>
                      <div class="panel panel-primary">
                          <div class="panel-heading">友情链接</div>
                          <div class="panel-body" style="overflow:hidden;">
                              <ul class="nav nav-pills" id="link">

                              </ul>
                          </div>
                      </div>
                  </div>
              </div>


          </div>
          <!-- /.container -->
      </div>
      <!-- /.content-wrapper -->
      <footer class="main-footer">
          <div class="container">
              <strong>© 2018 zhenying的博客.|闽ICP备17000754号</strong>
          </div>
          <!-- /.container -->
      </footer>
  </div>
</body>
<!-- jQuery 3 -->
<script src="/js/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="/js/adminlte.min.js"></script>
<script type="text/javascript" src="/js/jquery.dataTables.min.js" ></script>
<script type="text/javascript" src="/js/dataTables.bootstrap.min.js" ></script>
<script type="text/javascript" src="/js/index.js"></script>
<script type="text/javascript" src="/js/status.js"></script>
</html>