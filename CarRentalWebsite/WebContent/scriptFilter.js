
function main(){
  var x, i, j, selElmnt, a, b, c;
  /* Look for any elements with the class "custom-select": */
  x = document.getElementsByClassName("custom-select");
  for (i = 0; i < x.length; i++) {
    selElmnt = x[i].getElementsByTagName("select")[0];
    /* For each element, create a new DIV that will act as the selected item: */
    a = document.createElement("DIV");
    a.setAttribute("class", "select-selected");
    a.innerHTML = selElmnt.options[selElmnt.selectedIndex].innerHTML;
    x[i].appendChild(a);
    /* For each element, create a new DIV that will contain the option list: */
    b = document.createElement("DIV");
    b.setAttribute("class", "select-items select-hide");
    for (j = 1; j < selElmnt.length; j++) {
      /* For each option in the original select element,
      create a new DIV that will act as an option item: */
      c = document.createElement("DIV");
      c.innerHTML = selElmnt.options[j].innerHTML;
      c.addEventListener("click", function(e) {
          /* When an item is clicked, update the original select box,
          and the selected item: */
          var y, i, k, s, h;
          s = this.parentNode.parentNode.getElementsByTagName("select")[0];
          h = this.parentNode.previousSibling;
          for (i = 0; i < s.length; i++) {
            if (s.options[i].innerHTML == this.innerHTML) {
              s.selectedIndex = i;
              h.innerHTML = this.innerHTML;
              y = this.parentNode.getElementsByClassName("same-as-selected");
              for (k = 0; k < y.length; k++) {
                y[k].removeAttribute("class");
              }
              this.setAttribute("class", "same-as-selected");
              break;
            }
          }
          h.click();
      });
      b.appendChild(c);
    }
    x[i].appendChild(b);
    a.addEventListener("click", function(e) {
      /* When the select box is clicked, close any other select boxes,
      and open/close the current select box: */
      e.stopPropagation();
      closeAllSelect(this);
      this.nextSibling.classList.toggle("select-hide");
      this.classList.toggle("select-arrow-active");
    });
  }
  
  function closeAllSelect(elmnt) {
    /* A function that will close all select boxes in the document,
    except the current select box: */
    var x, y, i, arrNo = [];
    x = document.getElementsByClassName("select-items");
    y = document.getElementsByClassName("select-selected");
    for (i = 0; i < y.length; i++) {
      if (elmnt == y[i]) {
        arrNo.push(i)
      } else {
        y[i].classList.remove("select-arrow-active");
      }
    }
    for (i = 0; i < x.length; i++) {
      if (arrNo.indexOf(i)) {
        x[i].classList.add("select-hide");
      }
    }
  }
  
  /* If the user clicks anywhere outside the select box,
  then close all select boxes: */
  document.addEventListener("click", closeAllSelect);
  
  
  var $btns = $('.btn').click(function() {
    
    if (this.id == 'all') {
      $('#parent > div').fadeIn(450);
    } else {
      $('#parent > div').hide();
   
      getValue();
      
      
    }
    $btns.removeClass('active');
    $(this).addClass('active');
  })
  
  function getValue(){
    /* declare an checkbox array */
    var chkArray = [];
    var chkArray2 = [];
    var chkArray3 = [];
    var chkArray4 = [];
    
    /* look for all checkboes that have a class 'chk' attached to it and check if it was checked */
    $(".chk:checked").each(function() {
      chkArray.push($(this).val());
    });
    $(".chk2:checked").each(function() {
        chkArray2.push($(this).val());
      });
      $(".chk3:checked").each(function() {
        chkArray3.push($(this).val());
      });
      $(".chk4:checked").each(function() {
        chkArray4.push($(this).val());
      });
     
      
    /* we join the array separated by the comma */
    var selected;
    selected = chkArray;
    var selected2 = chkArray2;
    var selected3 = chkArray3;
    var selected4 = chkArray4;
    
    if($('#brandVal').val() != 0 ){
        var selected5 = $('#brandVal option:selected');
        var name = ('.' + selected5.val());
    }
    else{
        name = "";
    }
    /* check if there is selected checkboxes, by default the length is 1 as it contains one single comma */
    if($('#brandVal').val() != 0  && selected2.length == 0 && selected3.length == 0 && selected4.length == 0 && selected.length == 0 ){
    	   
    	$(name).fadeIn(450);
    }
    if(selected.length > 0 && selected2.length == 0 && selected3.length == 0 && selected4.length == 0 ){
   
    
        for(let i = 0; i < selected.length; i++){
          
         $('.' + selected[i]  + name).fadeIn(450);
 
        }
    
     }
     if(selected.length == 0 && selected2.length > 0 && selected3.length == 0 && selected4.length == 0 ){
   
       for(let i = 0; i < selected2.length; i++){
         
        $('.' + selected2[i] + name).fadeIn(450);
       }
    }
     
    if(selected.length == 0 && selected2.length == 0 && selected3.length > 0 && selected4.length == 0 ){
   
       for(let i = 0; i < selected3.length; i++){
         
        $('.' + selected3[i] + name).fadeIn(450);
       }
    }
    if(selected.length == 0 && selected2.length == 0 && selected3.length == 0 && selected4.length > 0 ){
   
       for(let i = 0; i < selected4.length; i++){
         
        $('.' + selected4[i] + name).fadeIn(450);
       }
    }

    if(selected.length > 0 && selected2.length > 0 && selected3.length == 0 && selected4.length == 0){
    	
        for(let i = 0; i < selected2.length; i++){
            for(let j = 0; j < selected.length; j++){
            $('.' + selected[j] + '.' + selected2[i] + name ).fadeIn(450);
            
            }
        } 
    }

    if(selected.length > 0 && selected3.length > 0 && selected2.length == 0 && selected4.length == 0){
        for(let i = 0; i < selected3.length; i++){
            for(let j = 0; j < selected.length; j++){
            $('.' + selected[j] + '.' + selected3[i] + name).fadeIn(450);
            }
        } 
    }
    if(selected.length > 0 && selected4.length > 0 && selected2.length == 0 && selected3.length == 0){
        for(let i = 0; i < selected4.length; i++){
            for(let j = 0; j < selected.length; j++){
            $('.' + selected[j] + '.' + selected4[i] + name).fadeIn(450);
            }
        } 
    }
    if(selected2.length > 0 && selected3.length > 0 && selected.length == 0 && selected4.length == 0){
        for(let i = 0; i < selected3.length; i++){
            for(let j = 0; j < selected2.length; j++){
            $('.' + selected2[j] + '.' + selected3[i] + name).fadeIn(450);
            }
        } 
    }
    if(selected2.length > 0 && selected4.length > 0 && selected.length == 0 && selected3.length == 0){
        for(let i = 0; i < selected4.length; i++){
            for(let j = 0; j < selected2.length; j++){
            $('.' + selected2[j] + '.' + selected4[i] + name).fadeIn(450);
            }
        } 
    }
    if(selected3.length > 0 && selected4.length > 0 && selected.length == 0 && selected2.length == 0){
        for(let i = 0; i < selected4.length; i++){
            for(let j = 0; j < selected3.length; j++){
            $('.' + selected3[j] + '.' + selected4[i] + name).fadeIn(450);
            }
        } 
    }
    
    if(selected.length > 0 && selected2.length > 0 && selected3.length > 0 && selected4.length == 0){
        
        for(let i = 0; i < selected3.length; i++){
            for(let j = 0; j < selected2.length; j++){
                for(let k = 0; k < selected.length; k++){
            $('.' + selected[k] + '.' + selected2[j] + '.' + selected3[i] + name).fadeIn(450);
            }
        } 
    }
    }
    if(selected2.length > 0 && selected3.length > 0 && selected4.length > 0 && selected.length == 0){
        for(let i = 0; i < selected4.length; i++){
            for(let j = 0; j < selected3.length; j++){
                for(let k = 0; k < selected2.length; k++){
            $('.' + selected2[k] + '.' + selected3[j] + '.' + selected4[i] + name).fadeIn(450);
            }
        } 
    }
    }
    if(selected.length > 0 && selected3.length > 0 && selected4.length > 0 && selected2.length == 0){
        for(let i = 0; i < selected4.length; i++){
            for(let j = 0; j < selected3.length; j++){
                for(let k = 0; k < selected.length; k++){
            $('.' + selected[k] + '.' + selected3[j] + '.' + selected4[i] + name).fadeIn(450);
     
            }
        } 
    }
    }
    if(selected.length > 0 && selected2.length > 0 && selected4.length > 0 && selected3.length == 0){
        for(let i = 0; i < selected4.length; i++){
            for(let j = 0; j < selected2.length; j++){
                for(let k = 0; k < selected.length; k++){
            $('.' + selected[k] + '.' + selected2[j] + '.' + selected4[i] + name).fadeIn(450);
            }
        } 
    }
    }

    if(selected.length > 0 && selected2.length > 0 && selected3.length > 0 && selected4.length > 0){
        for(let i = 0; i < selected3.length; i++){
            for(let j = 0; j < selected4.length; j++){
                for(let k = 0; k < selected2.length; k++){
                    for(let l = 0; l < selected.length; l++){
            $('.' + selected[l] + '.' + selected2[k] + '.' + selected3[j] + '.' + selected4[i]).fadeIn(450);
          
            }
        } 
    }
    }
    }




 
  }

}
  document.addEventListener("DOMContentLoaded", main);