<!DOCTYPE html>
<html lang="en" dir="ltr">

  <head> <meta charset="utf-8">
  <title>Il tuo profilo</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/paginaPersonale.css">
  <link rel="stylesheet" type="text/css" href="css/animation.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  </head>

<body>
 
 <div class="container bootstrap snippet" style="margin-top: 50px;">
  <div class="row">		       
    
    <!-- RIGA CON TAB -->
    <div class="col-sm-9">
     <ul class="nav nav-tabs" style="font-size: 20px;">
       <li class="active"><a data-toggle="tab" href="#generale"><i class="far fa-user"></i> Dati personali</a></li>
       <li><a data-toggle="tab" href="#ordini"><i class="fas fa-clipboard-list"></i> Ordini</a></li>
       <li><a data-toggle="tab" href="#indirizzo"><i class="far fa-heart"></i> Lista desideri</a></li>
       <li><a data-toggle="tab" href="#indirizzo"><i class="fas fa-map-marker-alt"></i> Spedizione</a></li>
       <li><a data-toggle="tab" href="#indirizzo"><i class="fas fa-credit-card"></i> Pagamento</a></li>
     </ul>

     <div class="tab-content">
     
      <!-- 1. PRIMO TAB -->
      <div class="tab-pane active animated fadeInDown" id="generale">
        <form class="form" id="form-generale" method="get" action="http://localhost:8080/Progetto/AggiornaUtenti">
          
          <div class="form-group">
          
            <div class="col-xs-4">
              <label for="first_name"><h4>Nome</h4></label><button class="btn btn-xs"><i class="fas fa-pen"></i></button>
              <input type="text" class="form-control" name="camponome" id="camponome" value=${nome} readonly>
             </div>
             
            <div class="col-xs-4">
              <label for="last_name"><h4>Cognome</h4></label>
              <input type="text" class="form-control" name="campocognome" id="campocognome" value=${cognome} readonly>
            </div>
            
            <div class="col-xs-4">
             <label for="phone"><h4>Codice Fiscale</h4></label>
             <input type="text" class="form-control" name="campocf" id="campocf" value=${codiceFiscale} readonly>
            </div>
                    
          </div>
          
          <div class="form-group">
           
           <div class="col-xs-4">
            <label for="mobile"><h4>Sesso</h4></label>
            <select name="camposesso" id="camposesso" class="form-control">
             <option value="${sesso}" >Il tuo sesso: ${sesso}</option>
             <option value="donna" >Donna</option>
             <option value="uomo">Uomo</option>
            </select>
           </div>
           
           <div class="col-xs-4">
            <label for="email"><h4>Telefono</h4></label>
            <input type="email" class="form-control" name="campotelefono" id="campotelefono" value=${numeroTelefonico} maxlength="12" readonly>
           </div>
           
          <div class="col-xs-4">
            <label for="email"><h4>Data di nascita</h4></label>
            <input type="email" class="form-control" name="campotelefono" id="campotelefono" value=${telefono} maxlength="12" readonly>
           </div>          
         </div>

         <div class="form-group">
          
          <div class="col-xs-4">
           <label for="email"><h4>Email</h4></label>
           <input type="email" class="form-control" name="campoemail" id="campoemail" value=${email} readonly>
          </div>
          
          <div class="col-xs-4">
             <label for="password"><h4>Password</h4></label>
             <input type="password" class="form-control" name="campopassword" id="campopassword" value=${password} readonly>
          </div>
          
          <div class="col-xs-4">
            <button class="btn btn-lg" type="submbit" Id="salvagenerale" style="float: right; margin-top: 30px;" disabled><i class="fa fa-floppy-o"></i> <i class="fas fa-check"></i> Salva modifiche</button>
          </div>
                   
         </div> 
                      
         </form>
        </div><!-- FINE PRIMO TAB -->
             
             <div class="tab-pane animated fadeInDown" id="indirizzo">
            
                              
                  <form class="form" id="form-indirizzo" method="post" action="http://localhost:8080/ProgettoSiw/AggiungiIndirizzi">
                                        <div class="form-group">
                          <div class="col-xs-6">
                            <label for="last_name"><h4>Nazione</h4></label>
                              <input type="text" class="form-control" name="camponazione" id="camponazione" placeholder="VUOTO" readonly>
                          </div>
                      </div>

                      <div class="form-group">
                          <div class="col-xs-6">
                              <label for="phone"><h4>Citta' </h4></label>
                              <input type="text" class="form-control" name="campocitta" id="campocitta" placeholder="VUOTO" readonly>
                          </div>
                      </div>

                      <div class="form-group">
                          <div class="col-xs-6">
                             <label for="mobile"><h4>Cap</h4></label>
                              <input type="text" class="form-control" name="campocap" id="campocap" placeholder="VUOTO" readonly>
                          </div>
                      </div>
                      
                      <div class="form-group">
                          <div class="col-xs-6">
                              <label for="email"><h4>Via</h4></label>
                              <input type="email" class="form-control" name="campovia" id="campovia" placeholder="VUOTO" readonly>
                          </div>
                      </div>
                      
                     <div class="form-group">
                          <div class="col-xs-6">
                             <label for="via"><h4>Metodologia di pagamento</h4></label>
                              <input type="text" class="form-control" name="campometodo" id="campometodo" value="Contrassegno su arrivo del corriere." readonly>
                          </div>
                      </div>
                      
                      
                       <div class="form-group">
                           <div class="col-xs-12">
                                <button class="btn btn-lg" type="submbit" Id="salvaindirizzo" style="float: right; width: 122px; margin-right: -15px;" disabled><i class="fa fa-floppy-o"></i> Salva</button>
                            </div>
                      </div>
              
               	  </form>
               	  
               	  <button class="btn btn-lg" id="inserisciindirizzo" style="float: right; margin-top: 10px;"><i class="fa fa-pencil"></i> Inserisci</button>
                  
                  
                      
                       <div class="form-group">
                           <div class="col-xs-12">
                                <button class="btn btn-lg" type="submbit" Id="salvaindirizzo" style="float: right; width: 122px; margin-right: -15px;" disabled><i class="fa fa-floppy-o"></i> Salva</button>
                            </div>
                      </div>

               	  </form>    
               <button class="btn btn-lg" id="inserisciindirizzo" style="float: right; margin-top: 10px;"><i class="fa fa-pencil" aria-hidden="true"></i> Modifica</button>
               	        
                                	  
             </div>
             
           <div class="tab-pane animated fadeInDown" id="ordini">
            
             <br>  
             
			<table class="table" style="color: darkcyan;">
			 <thead class="thead-dark">
               <tr style="font-size: 16px;">
      		 	<th scope="col">Codice ordine</th>
      			<th scope="col">Data ordine</th>
     		    <th scope="col">Prezzo totale</th>
      			<th scope="col">Indirizzo di consegna</th>
      			<th scope="col">Azioni</th>
    		   </tr>
             </thead> 
             <tbody>               
             </tbody>
            </table>
            
         <label for="first_name">
         <h4><i class="fa fa-plus-circle fa-lg" ></i> PER MAGGIORI DETTAGLI INSERISCI IL CODICE DI UN TUO ORDINE</h4></label>
         <input type="text" style="width: 20%;" class="form-control" name="campoordine" id="campoordine" placeholder="Inserisci qui">   
         <button class="btn btn-lg" onclick='vediProdotti();' id="articoliordine"><i class="fa fa-search"></i> Cerca</button>
                                           	
              </div>      
            </div>          
          </div>
          
          
     <!-- COLONNA PROFILO & STATISTICHE -->
     <div class="col-sm-3">
       
       <div class="text-center">
        <img src="Immagini/Index/carousel4.jpg" class="avatar img-thumbnail" alt="avatar">
       </div><br>

       <ul class="list-group">
        <li style="text-align: center; color: #fdbf14; background-color: transparent; " class="list-group-item text-muted"><i class="fas fa-chart-line fa-2x"></i><b> STATISTICHE <b></li>
        <li style="color:#fdbf14; background-color: transparent;" class="list-group-item text-right"><span class="pull-left"><i class="fas fa-user-tie"></i> Utente </b></span> <b>${gradoDiAccesso}</b></li>        
        <li style="color:#fdbf14; background-color: transparent;" class="list-group-item text-right"><span class="pull-left"><i class="far fa-star"></i><b> Punti fedeltà </b></span> <b>3</b></li>        
        <li style="color:#fdbf14; background-color: transparent;" class="list-group-item text-right"><span class="pull-left"><i class="fas fa-cart-plus"></i><b> Prodotti acquistati </b></span> <b>4</b></li>
        <li style="color:#fdbf14; background-color: transparent;" class="list-group-item text-right"><span class="pull-left"><i class="fas fa-truck-loading"></i><b> Ordini effettuati </b></span> <b>3</b></li>
        <li style="color:#fdbf14; background-color: transparent;" class="list-group-item text-right"><span class="pull-left"><i class="fas fa-money-bill-wave"></i><b> Spesa media</b></span> <b>2 <i class="fas fa-euro-sign"></i></b></li>
       </ul> 
       
       <a href="http://localhost:8080/ProgettoINGSW/Logout"><i class="fas fa-sign-out-alt"></i> <b>Logout</b></a>
       <button style="float: right;" class="btn btn-lg"><i class="fas fa-home"></i> <b>Home</b></button>
     </div>
     
   <!-- FINE RIGA -->
   </div>
          
<div class="modal fade" id="articoli" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h3 class="modal-title" style="color: darkcyan;"><b><i class="fa fa-cart-arrow-down fa-2x"></i> Articoli acquistati in questo ordine</b></h3>
      </div>
      <div class="modal-body">
        <table class="table" id="risultatitab" style="color: darkcyan; margin-top: 0px; ">
            <thead class="thead-dark">

           </thead>
        <tbody></tbody>
       </table>
       
        <div id="risultati" style="color: darkcyan; font-weight: bold;">
             
               </div>
       
      </div>
      <div class="modal-footer">
        <button class="btn btn-lg" data-dismiss="modal">Chiudi</button>
      </div>
    </div>
  </div>
</div>

<div id="annullaordine" class="modal fade">
 <div class="modal-dialog">
  <div class="modal-content">
   <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal">&times;</button>
    <h4 class="modal-title"><b><i class="fa fa-ban fa-lg"></i> Sei sicuro di voler annullare l'ordine?</b></h4>
   </div>
   <div class="modal-body" style="text-align: center;" id="divannullaordine">
       <button  class="btn btn-default" style="border-color: darkcyan;" onclick='annullaOrdine();' id="si"><i class="fa fa-check-circle-o fa-lg"></i> SI</button>
       <button type="button" class="btn btn-default" data-dismiss="modal" style="border-color: darkcyan;" id="no"><i class="fa fa-times-circle-o fa-lg"></i> NO</button>
   </div>
  </div>
 </div>
</div>


  <script src="js/profilo.js"></script>
     <script>
   
  	 var listaordini= document.querySelectorAll('#annulla');	 
  	 for(var i=0;i<listaordini.length;i++) listaordini[i].addEventListener('click',assegnaTarget);
   
   function assegnaTarget(e)
   {
  	 ordinedaeliminare=e.target.name;
   }
   
   function annullaOrdine()
   {
  	 $.post("http://localhost:8080/ProgettoSiw/EliminaOrdine",{"idordine":ordinedaeliminare},function(data){},"json");
  	 $("#si").hide();
  	 $("#no").hide();
  	 $("#divannullaordine").append('<h2 style="color: darkcyan;"><b> Il tuo ordine è stato eliminato. </b></h2>');

   }
	
 function vediProdotti()
 {   
	$.ajax({
	    type: "POST",
	    url:"http://localhost:8080/ProgettoSiw/LogoutServlet?campoordine="+document.getElementById("campoordine").value,
	    success: function(data)
	    {	    	    	
	          $('#articoli').modal('show');
				var products = data;
				
				if(products!=0)
					{
				var s = '';
				s += '<tr style="font-weight: bold; font-size: 15px;"><td>Categoria</td><td>';
				s += '<td><td>Marca</td><td>';
				s += '<td><td>Colore</td><td>';
				s += '<td><td>Sesso</td><td>';
				s += '<td><td>Taglia</td><td>';
				s += '<td><td>Prezzo</td><td>';
				s += '<td><td>Quantità</td><td></tr>';
				for(var i = 0; i < products.length; i++) {
					s += '<tr><td>'+products[i].categoria+'</td><td>';
					s += '<td><td>'+products[i].marca+'</td><td>';
					s += '<td><td>'+products[i].colore+'</td><td>';
					s += '<td><td>'+products[i].sesso+'</td><td>';
					s += '<td><td>'+products[i].taglia+'</td><td>';
					s += '<td><td>'+products[i].prezzo+'</td><td>';
					s += '<td><td>'+products[i].id_Capo+'</td><td></tr>';
				}
				$('#risultatitab').html(s);
				
					}
				else
					{
					$('#risultatitab').empty();
					$('#risultatitab').append('<h4>NESSUN ORDINE TROVATO CON QUESTO CODICE</h4>');
					}
	    	          
	    }
	}); 
  
 }
   </script>  
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script type="text/javascript" src="js/profilo.js"></script>             
</body>
</html>
