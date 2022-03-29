

  function getData(url){
    $.ajax({
        type:"post",
        url:url,
        data:{u_id:5},
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
  }