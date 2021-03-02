<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="./css/indexStyle.css">
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

    <!-- 新品手机推荐 -->
    <section class="new">
        <div class="content">
            <ul class="list">
                <li>
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                </li>
                <li>
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                </li>
                <li>
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                </li>
                <li>
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                </li>
                <li>
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                </li>
            </ul>
            <div class="slider">
                <div class="container">
                    <a href="" class="picture1"></a>
                    <a href="" class="picture2"></a>
                    <a href="" class="picture3"></a>
                    <a href="" class="picture4"></a>
                    <a href="" class="picture5"></a>
                </div>
            </div>
        </div>
    </section>

    <!-- 热卖手机 -->
    <section class="hot">
        <ul class="content">
            <h3>热卖手机</h3>
            <li>
                <div>
                    <img src="./img/phone.jpg" alt="">
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                    <p class="price">1799元</p>
                </div>
            </li>
            <li>
                <div>
                    <img src="./img/phone.jpg" alt="">
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                    <p class="price">1799元</p>
                </div>
            </li>
            <li>
                <div>
                    <img src="./img/phone.jpg" alt="">
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                    <p class="price">1799元</p>
                </div>
            </li>
            <li>
                <div>
                    <img src="./img/phone.jpg" alt="">
                    <h5 class="name">华为1</h5>
                    <p class="info">超高性价比，更轻更薄</p>
                    <p class="price">1799元</p>
                </div>
            </li>
            <li>
                <div>
                    <a>更多手机</a>
                </div>
            </li>
        </ul>
    </section>

    <!-- 脚本 -->
    <script src="./js/index/new.js"></script>
</body>
<!-- var href;
var n = href.indexOf("?");
var s = href.substring(n);
s.split("&"); -->

</html>