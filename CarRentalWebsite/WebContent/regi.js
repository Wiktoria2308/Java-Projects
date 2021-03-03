document.addEventListener("DOMContentLoaded", main);




   function functionSubmit() {

    //Fetch form to apply custom Bootstrap validation
    var form = $("#regi")

    if (form[0].checkValidity() === false) {
      event.preventDefault()
      event.stopPropagation()
    }


    
    form.addClass('was-validated');
  }

  function functionLogin() {

    //Fetch form to apply custom Bootstrap validation
    var form = $("#login")

    if (form[0].checkValidity() === false) {
      event.preventDefault()
      event.stopPropagation()
    }


    
    form.addClass('was-validated');
  }