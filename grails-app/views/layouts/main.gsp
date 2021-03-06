<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.png')}" type="image/x-icon">
		<g:javascript library="jquery" plugin="jquery"/>
		<asset:stylesheet src="bootstrap.min.css"/>
		<asset:stylesheet src="javagrasp.css"/>
  		<asset:stylesheet src="heroic-features.css"/>
  		
  	
		<g:layoutHead/>
	</head>
	<body>
		<g:layoutBody/>
		 <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-md-offset-5">
                    <p>Copyright &copy; www.javagrasp.info</p>
                </div>
            </div>
        </footer>

		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
	 <!-- Bootstrap Core JavaScript -->
    <asset:javascript src="bootstrap.min.js"/>
   
	</body>
</html>
