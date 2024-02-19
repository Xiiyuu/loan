$(function(){
	VerCode();//初始化生成随机数
});


//生成随机数
function VerCode(len){
    len = len || 4;
    var $chars = 'ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678';//默认去掉了容易混淆的字符oOLl,9gq,Vv,Uu,I1
    var maxPos = $chars.length;
    var Code = '';
    for (i = 0; i < len; i++) {
        Code += $chars.charAt(Math.floor(Math.random() * maxPos));
    }
    $(".VerCode").html(Code);
    // 生成随机颜色
    var colors = ["#d2c3d5", "#84709b", "#464879", "#5d7db3", "#b6cad7"];
    var randomColor = colors[Math.floor(Math.random() * colors.length)];

    // 更新元素的颜色
    var verCode = document.getElementById("ImgVerCode");
    verCode.style.color = randomColor;
}