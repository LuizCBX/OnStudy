$(function()
  {
    $('#enviar').validate(
      {
        rules:
        {
          Color:{ required:true }
        },
        messages:
        {
          Color:
          {
            required:"Selecione<br/>"
          }
        },
        errorPlacement: function(error, element) 
        {
            if ( element.is(":radio") ) 
            {
                error.appendTo( element.parents('.container') );
            }
            else 
            {  
                error.insertAfter( element );
            }
         }
      });
    
  });