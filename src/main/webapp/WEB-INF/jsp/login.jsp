<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>login</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <style>
</style>
</head>
<body>
<div class="container">
<div class="login-box">
  <div class="login-logo text-center">
    
    <span style="font-size: 30px;">用户登录</span>
  </div>
  <div class="login-box-body col-md-6 col-md-offset-3">
    <form action="/login" method="post" class="form-horizontal" onsubmit="return check()">
        <div class="form-group input-lg">
                <input type="text" id="username" name="username" class="form-control" placeholder="用户名">
          </div>
          <div class="form-group input-lg">
                  <input type="password" id="password" name="password" class="form-control" placeholder="密码">
            </div>
            <div class="form-group">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" name="" id="" checked> 记住密码
                        </label>
                </div>
            </div>
            <h3 id="info" style="color:red;">
                ${error}
            </h3>
            <div class="form-group">
                    <button class="btn btn-primary btn-block">登录</button>
            </div>
    </form>

   </div>
  </div>
  </div>

<!-- jQuery 3 -->
<script src="js/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="js/icheck.min.js"></script>
<script type="text/javascript" src="js/login.js" ></script>
<script>

</script>
</body>
</html>
