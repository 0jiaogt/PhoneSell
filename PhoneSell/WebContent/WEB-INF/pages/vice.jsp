<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="./css/viceStyle.css">
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
                <a href="index.html">首页</a>
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
        <section class="showPhone">
            <ul class="content">
                <li>
                    <div>
                        <img src="./img/phone.jpg" alt="">
                        <h5>华为1</h5>
                        <p>超高性价比，更轻更薄</p>
                        <span>1799元</p>
                    </div>
                </li>
                <!-- <li>
                        <div>asds</div>
                    </li>
                    <li>
                        <div>asds</div>
                    </li>
                    <li>
                        <div>asds</div>
                    </li>
                    <li>
                        <div>asds
                            <a href="vice.html">更多手机</a>
                        </div>
                    </li> -->
            </ul>
        </section>
    </section>

    <script>
        // var current=0
        // var user=document.querySelector('.header .login')
        // var child=                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        // if (current==1) {
        //     user.removeChild()
        // }
        var id = window.location.href.split("=")[1]
        var current = 100
        var content = document.querySelector('.showPhone .content')
        var li
        var card
        var imge
        var phoneName
        var price
        var info
        for (var i = 0; i < current; i++) {
            li = document.createElement('li')
            content.appendChild(li)
            card = document.createElement('div')
            li.appendChild(card)
            imge=document.createElement('img')
            imge.src='./img/phone.jpg'
            card.appendChild(imge)
            phoneName=document.createElement('h5')
            info=document.createElement('p')
            price=document.createElement('span')
            // name.className='.name'
            phoneName.innerHTML='华为1'
            info.innerHTML='超高性价比，更轻更薄'
            price.innerHTML='1799元'
            // phoneName.className='.name'
            // info.className='.info'
            // price.className='.price'
            card.appendChild(phoneName)
            card.appendChild(info)
            card.appendChild(price)
        }
    </script>
</body>

</html>