function getData(url){
    $.ajax({
        type:'post',
        url:url,
        data:{u_id:22},
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
}