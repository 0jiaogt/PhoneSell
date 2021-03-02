
var current = 0;
var content = document.querySelector('.new .content')
var list = content.querySelector('.list')
var lis = content.querySelectorAll('li')
var slider = content.querySelector('.slider')
var swiper = content.querySelector('.container')
var img = swiper.querySelectorAll('a')
var more = document.querySelector('.hot .content a')
var news = document.querySelectorAll('.new .content .slider a')
var hot = document.querySelectorAll('.hot .content img')
var cart = document.querySelector('.header .cart')
var user=document.querySelector('.header .login span')

var userId = sessionStorage.getItem('userId')
if (userId) {
    console.log('已登录')
//    user.innerHTML=userId
} else {
    console.log('未登录')
//    user.innerHTML='未登录'
}

cart.onclick = function () {
    if (userId) {
        var url = "cart.html" 
        window.location.href = url
    } else {
        alert('请先登录')
    }
}
news[0].onclick = function () {
    var str = '1'
    var url = "phone.html?str=" + str
    window.location.href = url
    console.log('0')
}
news[1].onclick = function () {
    var str = '2'
    var url = "phone.html?str=" + str
    window.location.href = url
}
news[2].onclick = function () {
    var str = '3'
    var url = "phone.html?str=" + str
    window.location.href = url
}
news[3].onclick = function () {
    var str = '4'
    var url = "phone.html?str=" + str
    window.location.href = url
}
news[4].onclick = function () {
    var str = '5'
    var url = "phone.html?str=" + str
    window.location.href = url
}
hot[0].onclick = function () {
    var str = '6'
    var url = "phone.html?str=" + str
    window.location.href = url
}
hot[1].onclick = function () {
    var str = '7'
    var url = "phone.html?str=" + str
    window.location.href = url

}
hot[2].onclick = function () {
    var str = '8'
    var url = "phone.html?str=" + str
    window.location.href = url

}
hot[3].onclick = function () {
    var str = '9'
    var url = "phone.html?str=" + str
    window.location.href = url

}
more.onclick = function () {
    var str = 'all'
    var url = "vice.html?str=" + str
    window.location.href = url
}
lis[current].style.background = 'orange';
function aotuShow() {
    lis[current].style.background = '#4284b4'
    current++
    current = (current > img.length - 1) ? 0 : current
    lis[current].style.background = 'orange'
    swiper.style.left = current * -slider.offsetWidth + 'px'
}
img[0].id = 12558
for (var i = 0; i < lis.length; i++) {
    lis[i].index = i
    lis[i].onmouseover = function () {
        lis[current].style.background = '#4284b4'
        current = this.index
        this.style.background = 'orange'
        swiper.style.left = current * -slider.offsetWidth + 'px'
    }
}

var time = setInterval(aotuShow, 3500)

list.onmouseover = function () {
    clearInterval(time)
}

list.onmouseout = function () {
    time = setInterval(aotuShow, 3500)
}