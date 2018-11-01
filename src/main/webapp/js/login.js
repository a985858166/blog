function check() {
    var username = $("#username").val();
    var password = $("#password").val();
    if (username == "") {
        $("#info").text("用户名不能为空！");
        return false;
    }
    if (password == "") {
        $("#info").text("密码不能为空！");
        return false;
    }
    return true;
}