function getData1(url){
    console.log("aaaaa");
    console.log("aaaaaddfg");
    $.ajax({
        type:'post',
        data:{u_id:1},
        url:url,
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
}



