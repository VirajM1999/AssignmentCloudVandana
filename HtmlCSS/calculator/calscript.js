//display
function dis(val){
    let v=document.getElementById("result");
    v.value +=val;

}


function solve() {
    var num1 = document.getElementById('result').value;
    var num2 = eval(num1);
    document.getElementById('result').value = num2;
 }

//clear function
function clr(){
    document.getElementById("result").value=""
}
//backspace
function back(){
    var backspace=document.getElementById("result");
    backspace.value=backspace.value.slice(0,-1);
}