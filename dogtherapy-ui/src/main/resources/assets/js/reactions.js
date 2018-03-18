(function($) { 

    $(document).ready(function() {
      "/home/pskindero/workspace/dogotherapy/gallery.js"

    });
    
    $(document).ready(function() {
        
        
        $("#more-btn1").click(function(){
            $("#def-window1").show();
        });
        
        $("#more-btn2").click(function(){
            $("#def-window2").show();
        });
        
        $("#more-btn3").click(function(){
            $("#def-window3").show();
        });
        
        $("#more-btn4").click(function(){
            $("#def-window4").show();
        });
        
        $(".def-window-close").click(function() {
            $("#def-window1").hide();
            $("#def-window2").hide();
            $("#def-window3").hide();
            $("#def-window4").hide();
        });
        
        $("#full-gallery-btn").click(function() {
           $("#gallery-window").show(); 
        });
        
    });
    
})(jQuery);