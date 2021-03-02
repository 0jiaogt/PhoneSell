<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="./css/cartStyle.css">
</head>

<body>
    <!-- 登录，注册以及购物车 -->
    <section class="header">
        <div class="container">
            <img src="./img/logo.png" alt="" class="sign">
            <div class="login">
                <a href="login.html">登录</a>
                <a href="register.html">注册</a>
                <a href="">购物车</a>
            </div>
        </div>
    </section>

    <!-- 手机品牌导航 -->
    <section class="nav">
        <div class="container">
            <div class="menu">
                <a href="">首页</a>
                <a href="">华为</a>
                <a href="">小米</a>
                <a href="">荣耀</a>
                <a href="">魅族</a>
                <a href="">vivo</a>
            </div>
            <div class="search">
                <input type="text">
                <a href="" class="">搜索</a>
            </div>
        </div>
    </section>

    <!-- 购物清单 -->
    <section class="list">
        <ul class="content">
            <li>
                <div>
                    <img src="./img/phone.jpg" alt="">
                    <h5>华为1</h5>
                    <p>数量:1</p>
                    <span>1799元</p>
                </div>
            </li>
        </ul>
        <div class="buy">
            合计：
            <span class="money">1799元</span>
            <span class="sure">确认购买</span>
        </div>
    </section>
    <br>
</body>

</html>