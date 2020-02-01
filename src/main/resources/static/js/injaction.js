
$(document).ready(function () {

$("input[type=text],[type=password]").keypress(function(e){
    if (e.keyCode==39 || e.keyCode==37  )
    {
        return false ;
    }
});

});