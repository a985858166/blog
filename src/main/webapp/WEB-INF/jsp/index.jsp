<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>博客首页</title>
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="css/AdminLTE.min.css">
  <link rel="stylesheet" href="css/skin/_all-skins.min.css">
  <link rel="stylesheet" href="css/skin/skin-black.min.css">
  <link rel="stylesheet" href="css/dataTables.bootstrap.min.css" />
  <link rel="stylesheet" href="css/menu.css" />
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
  

</head>
<body class="hold-transition skin-blue layout-top-nav">
  <!-- 页面主体，包含所有内容 -->
  <div class="wrapper">
    <!-- 页面头部 -->
    <header class="main-header">
      <!-- 导航栏 -->
        <nav class="navbar navbar-static-top">
            <!-- 页面两边收缩,使页面更美观 -->
            <div class="container">
                <!-- 博客LOGO -->
                <div class="navbar-header">
                    <a href="#" class="navbar-brand"><b>博客</b></a>
                </div>
                <!-- 导航栏的左侧部分，包含搜索和分类栏 -->
                <div class="collapse navbar-collapse pull-left" id="navbar-collapse">
                    <ul class="nav navbar-nav">
                      <li class="active"><a href="#">实用教程 <span class="sr-only">(current)</span></a></li>
                      <li><a href="#">编程技术</a></li>
                      <li><a href="#">系统运维</a></li>
                      <li><a href="#">资源分享</a></li>
                    </ul>
                    <form action="#" method="get" class=" navbar-form navbar-left">
                      <div class="input-group">
                        <input type="text" name="q" class="form-control" placeholder="搜索"/>
                            <span class="input-group-btn">
                              <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                              </button>
                            </span>
                      </div>
                    </form>
                </div>
                <!-- 导航栏左侧部分结束 -->
                <!-- 导航栏右侧部分 -->
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">

                                <c:choose>
                                    <c:when test="${not empty subject.principals}">
                                        <li><a href="/adminPage/information">后台管理</a></li>
                                        <li><a href="/doLogout">注销</a></li>
                                    </c:when>
                                    <c:otherwise>
                                        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>登录</a></li>

                                    </c:otherwise>
                                </c:choose>

                    </ul>
                  </div>
            </div>
        </nav>
    </header>
  </div>
</body>
<!-- jQuery 3 -->
<script src="js/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="js/adminlte.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js" ></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js" ></script>
</html>