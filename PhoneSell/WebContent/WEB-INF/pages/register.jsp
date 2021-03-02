<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="./css/registerStyle.css">
</head>

<body>
    <section class="main">
        <h4>注册用户</h4>
        <form action="">
            <div class="name">
                <span>用户名：</span>
                <input type="text" placeholder="请输入用户名">
            </div>
            <div class="tel">
                <span>手机号：</span>
                <input type="text" placeholder="请输入手机号">
            </div>
            <div class="password">
                <span>密码：</span>
                <input type="text" placeholder="请输入密码">
            </div>
            <div class="sub">
                <input type="submit" value="注册">
            </div>
        </form>
        <div class="login">
            <span>已有账号？</span>
            <a href="login.html">点击登录</a>
        </div>
    </section>
</body>

</html>