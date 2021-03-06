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
                <li class="treeview active">
                  <a href="#"><i class="fa fa-fw fa-book"></i> <span>文章</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                  </a>
                  <ul class="treeview-menu">
                    <li><a href="/b-admin/allArticle">所有文章</a></li>
                    <li><a href="/b-admin/write">写文章</a></li>
                    <li class="active"><a href="/b-admin/classify">文章分类</a></li>
                  </ul>
                </li>
                <li><a href="/b-admin/comment"><i class="fa fa-fw fa-comments"></i> <span>评论</span></a></li>
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
                    <h3 class="box-title">文章分类</h3>

                    <div class="box-tools">
                        <a href="#" id="btn_add" class="btn btn-primary" data-toggle="modal" data-target="#addModal">添加</a>
                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered responsive table-hover" id="table" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th width="5%" class="min-mobile-l">id</th>
                                <th width="8%" class="min-mobile-l">分类名称</th>
                                <th width="5%" class="min-mobile-l">权重</th>
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
          <%--添加弹框--%>
          <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
              <div class="modal-dialog" role="document">
                  <div class="modal-content">
                      <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                          <h4 class="modal-title" id="myModalLabel">新增</h4>
                      </div>
                      <div class="modal-body">

                          <div class="form-group">
                              <label for="add_classify_name">分类名称</label>
                              <input type="text" name="classify_name" class="form-control" id="add_classify_name" placeholder="分类名称">
                              <h4 style="color: red" id="add_classify_name_info"></h4>
                          </div>
                          <div class="form-group">
                              <label for="add_classify_top">权重</label>
                              <input type="text" name="link_url" class="form-control" id="add_classify_top" placeholder="只能输入正整数">
                              <h4 style="color: red" id="add_classify_top_info"></h4>
                          </div>
                      </div>
                      <div class="modal-footer">
                          <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
                          <button type="button" id="add_submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存</button>
                      </div>
                  </div>
              </div>
          </div>
      </div>

        <%--编辑弹框--%>
        <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">编辑</h4>
                    </div>
                    <div class="modal-body">

                        <div class="form-group">
                            <label for="edit_classify_id">id</label>
                            <input type="text" name="classify_id" class="form-control" id="edit_classify_id" placeholder="网站id" disabled>
                            <h4 style="color: red" id="edit_classify_id_info"></h4>
                        </div>
                        <div class="form-group">
                            <label for="edit_classify_name">分类名称</label>
                            <input type="text" name="classify_name" class="form-control" id="edit_classify_name" placeholder="分类名称">
                            <h4 style="color: red" id="edit_classify_name_info"></h4>
                        </div>
                        <div class="form-group">
                            <label for="edit_classify_top">权重</label>
                            <input type="text" name="classify_top" class="form-control" id="edit_classify_top" placeholder="只能输入正整数">
                            <h4 style="color: red" id="edit_classify_top_info"></h4>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
                        <button type="button" id="edit_submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存</button>
                    </div>
                </div>
            </div>
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
            "url":"/b-admin/listClassify",
            "type":"post",
            "dataSrc":function (json) {
                console.log(JSON.stringify(json['classify']))
                return json['classify']
            }
        },
        processing:true,
        ordering:false,
        searching:false,
        columns:[
            {"visible":false, data: "classify_id"},
            {data:'classify_name'},
            {data:'classify_top'},
            {data:function () {
                    return "<button data-toggle='modal' data-target='#editUser-Modal' title='编辑友链' style='color:gray'  class='btn btn-link edit-classify' type='button'><i style='font-size:15px' class='fa fa-edit'></i></button><button title='删除友链'  style='color:gray' class='btn btn-link del-classify' type='button'><i style='font-size:15px' class='fa fa-trash-o'></i></button>";
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
    $(document).on('click', '.del-classify', function(e){

        //获取隐藏列的值
        var rowIndex = $(this).parents("tr").index();  //行号
        var id = table.row(rowIndex).data().classify_id;
        console.log(id);

        if (confirm("确定要删除该文章分类吗？")) {
            var jsonData = {
                "classify_id":id
            }
            $.ajax({
                type:'post',
                url:'/b-admin/delClassify',
                contentType:'application/json;charset=utf-8',//指定为json类型
                //数据格式是json串，商品信息
                data:JSON.stringify(jsonData),
                success:function(data){//返回json结果
                    console.log(data.status)
                    table.row(rowIndex).remove().draw();
                }
            });
        }
    });
    //编辑弹窗
    $(document).on('click', '.edit-classify', function(e){

        //获取隐藏列的值
        var rowIndex = $(this).parents("tr").index();  //行号
        var page = table.page.info().page;
        var pageLength = table.page.info().length;
        rowIndex = page*pageLength+rowIndex;
        var classify_id = table.row(rowIndex).data().classify_id;
        var classify_name = table.row(rowIndex).data().classify_name;
        var classify_top = table.row(rowIndex).data().classify_top;
        $("#edit_classify_id").val(classify_id)
        $("#edit_classify_name").val(classify_name)
        $("#edit_classify_top").val(classify_top)
        $('#editModal').modal();


    });

    //保存
    $("#add_submit").click(function (event) {
        var classify_name = $("#add_classify_name").val();
        var classify_top = $("#add_classify_top").val();
        if (classify_name == ""){
            $("#add_classify_name_info").text("分类名称不能为空");
            return
        }else {
            $("#add_classify_name_info").text("");
        }
        if (classify_top==""){
            $("#add_classify_top_info").text("权重不能为空");
            return
        }else {
            $("#add_classify_top_info").text("");
        }
        var jsonData = {"classify_name":classify_name,"classify_top":classify_top}
        $("#add_classify_name").val("")
        $("#add_classify_top").val("")
        $("#add_submit").attr("data-dismiss","modal")
        $.ajax({
            type:'post',
            url:'/b-admin/addClassify',
            contentType:'application/json;charset=utf-8',//指定为json类型
            //数据格式是json串，商品信息
            data:JSON.stringify(jsonData),
            success:function(data){//返回json结果
                console.log(data.status)
                table.ajax.reload();
            }
        });

    });

    //编辑

    $("#edit_submit").click(function (event) {
        var classify_id = $("#edit_classify_id").val();
        var classify_name = $("#edit_classify_name").val();
        var classify_top = $("#edit_classify_top").val();
        if (classify_name == ""){
            $("#edit_classify_name_info").text("文章分类名称不能为空");
            return
        }else {
            $("#edit_classify_name_info").text("");
        }
        if (classify_top==""){
            $("#edit_classify_top_info").text("权重不能为空");
            return
        }else {
            $("#edit_classify_top_info").text("");
        }
        var jsonData = {"classify_id":classify_id,"classify_name":classify_name,"classify_top":classify_top}
        $("#edit_submit").attr("data-dismiss","modal")
        $.ajax({
            type:'post',
            url:'/b-admin/editClassify',
            contentType:'application/json;charset=utf-8',//指定为json类型
            //数据格式是json串，商品信息
            data:JSON.stringify(jsonData),
            success:function(data){//返回json结果
                console.log(data.status)
                table.ajax.reload();
            }
        });

    });
</script>
</html>