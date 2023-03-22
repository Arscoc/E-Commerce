$(document).ready(function() {


    var readURL = function(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('.avatar').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }


    $(".file-upload").on('change', function(){
        readURL(this);
    });
});

document.getElementById('modificagenerale').onclick = function()
{
   document.getElementById('camponome').readOnly =false;
   document.getElementById('campocognome').readOnly =false;
   document.getElementById('camposesso').readOnly =false;
   document.getElementById('campoemail').readOnly =false;
   document.getElementById('campotelefono').readOnly =false;
   document.getElementById('campopassword').readOnly =false;
   document.getElementById('salvagenerale').disabled =false;

};

document.getElementById('salvagenerale').onclick = function()
{
   document.getElementById('camponome').readOnly = true;
   document.getElementById('campocognome').readOnly =true;
   document.getElementById('camposesso').readOnly =true;
   document.getElementById('campoemail').readOnly =true;
   document.getElementById('campotelefono').readOnly =true;
   document.getElementById('campopassword').readOnly =true;

};

document.getElementById('inserisciindirizzo').onclick = function()
{
   document.getElementById('camponazione').readOnly =false;
   document.getElementById('campocap').readOnly =false;
   document.getElementById('campovia').readOnly =false;
   document.getElementById('campocitta').readOnly =false;
   document.getElementById('salvaindirizzo').disabled =false;

};

document.getElementById('salvaindirizzo').onclick = function()
{
  document.getElementById('camponazione').readOnly =true;
  document.getElementById('campocap').readOnly =true;
  document.getElementById('campocitta').readOnly =true;
  document.getElementById('campovia').readOnly =true;

};
