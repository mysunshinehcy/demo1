
function getData(url){
    $.ajax({
        type:'post',
        url:url,
        data:{u_id:12},
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
}