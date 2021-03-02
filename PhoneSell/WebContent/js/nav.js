
var brand = document.querySelectorAll('.nav .container .menu a')
var search = document.querySelector('.nav .search a')
var searchInfo = document.querySelector('.nav .search input')
var register = document.querySelectorAll('.header a')
var toUser = document .querySelector('.header .user')
//var user=document.querySelector('.header .login span')

var userId = sessionStorage.getItem('userId')
if (userId) {
    console.log('已登录')
    register[2].style.display='none'
    register[1].style.display='none'
    toUser.style.visibility='visible'
    toUser.innerHTML=userId
    //    user.innerHTML=userId
} else {
    console.log('未登录')
    register[2].style.display=' '
    register[1].style.display=' '
    toUser.style.visibility='hidden'
}

var cart = document.querySelector('.header .cart')
cart.onclick = function () {
    if (userId) {
        var url = "cart.html"
        window.location.href = url
    } else {
        alert('请先登录')
    }
}
search.onclick = function () {
    var str = searchInfo.value
    var url = "vice.html?str=" + str
    window.location.href = url
    console.log(str)
}
brand[1].onclick = function () {
    var str = 'hw'
    var url = "vice.html?str=" + str
    window.location.href = url
}
brand[2].onclick = function () {
    var str = 'mi'
    var url = "vice.html?str=" + str
    window.location.href = url
}
brand[3].onclick = function () {
    var str = 'sam'
    var url = "vice.html?str=" + str
    window.location.href = url
}
brand[4].onclick = function () {
    var str = 'mei'
    var url = "vice.html?str=" + str
    window.location.href = url
}
brand[5].onclick = function () {
    var str = 'vivo'
    var url = "vice.html?str=" + str
    window.location.href = url
}