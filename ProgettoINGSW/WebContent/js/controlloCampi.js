function ControllaFormRegistrazione()
{
	var nome = document.form1.camponome.value;
	var cognome = document.form1.campocognome.value;
	var cf = document.form1.campocf.value;
	var sesso = document.form1.camposesso.value;
	var telefono = document.form1.camponumero.value;
	var password = document.form1.campopassword.value;
	var conferma = document.form1.campopassword2.value;
	var email = document.form1.campoemail.value;
	var tipo = document.form1.campotipo.value;
	var email_reg_exp = /^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-]{2,})+.)+([a-zA-Z0-9]{2,})+$/;

	if ((nome == "") || (nome == "undefined") || (nome.length<3))
	{
		alert("Il campo: NOME è obbligatorio oppure troppo corto.");
		document.form1.camponome.focus();
		return false;
	}
	else if ((cognome == "") || (cognome == "undefined") || (cognome.length<3))
	{
		alert("Il campo: COGNOME è obbligatorio oppure troppo corto.");
		document.form1.campocognome.focus();
		return false;
	}
	else if ((cf == "") || (cf == "undefined") || (cf.length!=16))
	{
		alert("Il campo: CODICE FISCALE è obbligatorio e deve contenere 16 caratteri.");
		document.form1.campocf.focus();
		return false;
	}
	else if ((sesso == "") || (sesso == "undefined"))
	{
		alert("Il campo: SESSO è obbligatorio.");
		document.form1.camposesso.focus();
		return false;
	}
	else if ((isNaN(telefono)) || (telefono == "") || (telefono == "undefined") || (telefono.length<8))
	{
		alert("Il campo: TELEFONO è numerico ed obbligatorio e deve contenere almeno 8 cifre.");
		document.form1.camponumero.value = "";
		document.form1.camponumero.focus();
		return false;
	}
	else if (!email_reg_exp.test(email) || (email == "") || (email == "undefined")) {
		alert("Inserire un indirizzo email corretto.");
		document.form1.campoemail.select();
		return false;
	}
	else if ((password == "") || (password == "undefined")) {
		alert("Il campo: PASSWORD è obbligatorio.");
		document.form1.campopassword.focus();
		return false;
	}
	else if (password.length<8)
	{
		alert("Il campo: PASSWORD deve contenere almeno 8 caratteri.");
		document.form1.campopassword.focus();
		return false;
	}
	else if ((conferma == "") || (conferma == "undefined"))
	{
		alert("Il campo: CONFERMA PASSWORD è obbligatorio.");
		document.form1.campopassword2.focus();
		return false;
	}
	else if (password!=conferma)
	{
		alert("ATTENZIONE! LE 2 PASSWORD NON COINCIDONO");
		document.form1.campopassword2.focus();
		return false;
	}
	else if ((tipo == "") || (tipo == "undefined"))
	{
		alert("Il campo: TIPO è obbligatorio.");
		document.form1.campotipo.focus();
		return false;
	}
	else
	{
		document.modulo.action = "elabora_dati.asp";
		document.modulo.submit();
	}

}



function ControllaFormAggiungi()
{
	var codice = document.formadd.campoid.value;
	var marca = document.formadd.campomarca.value;
	var sesso = document.formadd.camposesso.value;
	var categoria = document.formadd.campocategoria.value;
	var colore = document.formadd.campocolore.value;
	var taglia = document.formadd.campotaglia.value;
	var prezzo = document.formadd.campoprezzo.value;

	if ((codice == "") || (codice == "undefined"))
	{
		alert("Il campo: CODICE A BARRE è obbligatorio.");
		document.formadd.campoid.focus();
		return false;
	}
	else if ((marca == "") || (marca == "undefined"))
	{
		alert("Il campo: MARCA è obbligatorio.");
		document.formadd.campomarca.focus();
		return false;
	}
	else if ((sesso == "") || (sesso == "undefined"))
	{
		alert("Il campo: SESSO è obbligatorio.");
		document.formadd.camposesso.focus();
		return false;
	}
	else if ((categoria == "") || (categoria == "undefined")) {
		alert("Il campo: CATEGORIA è obbligatorio.");
		document.formadd.campocategoria.focus();
		return false;
	}
	else if ((colore == "") || (colore == "undefined"))
	{
		alert("Il campo: COLORE è obbligatorio.");
		document.formadd.campocolore.focus();
		return false;
	}
	else if ((taglia == "") || (taglia == "undefined"))
	{
		alert("Il campo: TAGLIA è obbligatorio.");
		document.formadd.campotaglia.focus();
		return false;
	}
	else if ((isNaN(prezzo)) || (prezzo == "") || (prezzo == "undefined"))
	{
		alert("Il campo: PREZZO è numerico ed obbligatorio.");
		document.formadd.campoprezzo.value = "";
		document.formadd.campoprezzo.focus();
		return false;
	}
	else
	{
		document.modulo.action = "elabora_dati.asp";
		document.modulo.submit();
	}
}

function ControllaFormRegistrazione()
{
	var nome = document.form1.camponome.value;
	var cognome = document.form1.campocognome.value;
	var cf = document.form1.campocf.value;
	var sesso = document.form1.camposesso.value;
	var telefono = document.form1.camponumero.value;
	var password = document.form1.campopassword.value;
	var conferma = document.form1.campopassword2.value;
	var email = document.form1.campoemail.value;
	var tipo = document.form1.campotipo.value;
	var email_reg_exp = /^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-]{2,})+.)+([a-zA-Z0-9]{2,})+$/;

	if ((nome == "") || (nome == "undefined") || (nome.length<3))
	{
		alert("Il campo: NOME è obbligatorio oppure troppo corto.");
		document.form1.camponome.focus();
		return false;
	}
	else if ((cognome == "") || (cognome == "undefined") || (cognome.length<3))
	{
		alert("Il campo: COGNOME è obbligatorio oppure troppo corto.");
		document.form1.campocognome.focus();
		return false;
	}
	else if ((cf == "") || (cf == "undefined") || (cf.length!=16))
	{
		alert("Il campo: CODICE FISCALE è obbligatorio e deve contenere 16 caratteri.");
		document.form1.campocf.focus();
		return false;
	}
	else if ((sesso == "") || (sesso == "undefined"))
	{
		alert("Il campo: SESSO è obbligatorio.");
		document.form1.camposesso.focus();
		return false;
	}
	else if ((isNaN(telefono)) || (telefono == "") || (telefono == "undefined") || (telefono.length<8))
	{
		alert("Il campo: TELEFONO è numerico ed obbligatorio e deve contenere almeno 8 cifre.");
		document.form1.camponumero.value = "";
		document.form1.camponumero.focus();
		return false;
	}
	else if (!email_reg_exp.test(email) || (email == "") || (email == "undefined")) {
		alert("Inserire un indirizzo email corretto.");
		document.form1.campoemail.select();
		return false;
	}
	else if ((password == "") || (password == "undefined")) {
		alert("Il campo: PASSWORD è obbligatorio.");
		document.form1.campopassword.focus();
		return false;
	}
	else if (password.length<8)
	{
		alert("Il campo: PASSWORD deve contenere almeno 8 caratteri.");
		document.form1.campopassword.focus();
		return false;
	}
	else if ((conferma == "") || (conferma == "undefined"))
	{
		alert("Il campo: CONFERMA PASSWORD è obbligatorio.");
		document.form1.campopassword2.focus();
		return false;
	}
	else if (password!=conferma)
	{
		alert("ATTENZIONE! LE 2 PASSWORD NON COINCIDONO");
		document.form1.campopassword2.focus();
		return false;
	}
	else if ((tipo == "") || (tipo == "undefined"))
	{
		alert("Il campo: TIPO è obbligatorio.");
		document.form1.campotipo.focus();
		return false;
	}
	else
	{
		document.modulo.action = "elabora_dati.asp";
		document.modulo.submit();
	}
}

function CambiaSelectCategoria()
{
	var opt_0= new Array ("Maglie", "Canotte", "Felpe", "Pantaloni", "Pantaloncini", "Scarpe");
	var opt_1= new Array ("Maglie", "Reggiseni","Canotte", "Felpe", "Pantaloni", "Leggings", "Scarpe");
  var sesso;

	sesso=document.formadd.camposesso[document.formadd.camposesso.selectedIndex].value;

	mia_opzione=eval("opt_"+sesso);
	numero_opzioni=mia_opzione.length;
	document.formadd.campocategoria.length=numero_opzioni+1;

		for(i=0;i<numero_opzioni;i++)
		{
			document.formadd.campocategoria.options[i+1].value=mia_opzione[i];
			document.formadd.campocategoria.options[i+1].text=mia_opzione[i];
		}

	document.formadd.campocategoria.options[0].selected=true;
}

function CambiaSelectTaglia()
{
		var opt_0= new Array ("XS", "S", "M", "L", "XL", "XXL", "XXXL");
		var opt_1= new Array ("37", "37 1/2", "38", "38 1/2", "39", "39 1/2", "40", "40 1/2", "41", "41 1/2", "42", "42 1/2", "43");

		var categoria=document.formadd.campocategoria[document.formadd.campocategoria.selectedIndex].value;

		if(categoria=="Scarpe") scarpe=eval("opt_1");
		else scarpe=eval("opt_0");

		numero_opzioni=scarpe.length;
		document.formadd.campotaglia.length=numero_opzioni+1;

	  for(i=0;i<numero_opzioni;i++)
			{
      	document.formadd.campotaglia.options[i+1].value=scarpe[i];
				document.formadd.campotaglia.options[i+1].text=scarpe[i];
			}
}
