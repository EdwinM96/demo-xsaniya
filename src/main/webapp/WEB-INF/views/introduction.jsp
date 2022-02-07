<%-- 
    Document   : index
    Created on : 01-30-2022, 10:46:36 PM
    Author     : Edwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xsaniya Demo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <link rel="stylesheet"
              href="//cdnjs.cloudflare.com/ajax/libs/highlight.js/11.4.0/styles/atom-one-dark.min.css">
        <script src="//cdnjs.cloudflare.com/ajax/libs/highlight.js/11.4.0/highlight.min.js"></script>
        <script>hljs.highlightAll();</script>
        <div class="container py-4">
            <header class="pb-3 mb-4 border-bottom">
                <div class="text-end">Xsaniya LOGO</div>
                <span class="fs-4">Introduction</span>                
            </header>
            
            <div class="row align-items-md-stretch">
                <div class="col-12 pb-3">
                    <div class="h-100 p-5 bg-light border rounded-3">
                        <p style="font-weight: bold">Welcome to the Xsaniya demo.</p>
                        <p>This demo will help you have a general understanding of how to use and integrate into your system the Xsaniya web services.<p>
                        <p>The list of attributes of each object can be found on our official documentation. Lets start off by creating a client on Xsaniya.</p>
                        <p>Click on the next button, located at the end of each page, to follow the demo/tutorial.</p>
                        <div class="text-end"><a href="${pageContext.request.contextPath}/create-client"><button class="btn btn-outline-primary btn-lg" type="button">Next</button></a></div>
                    </div>
                </div>
            </div>
        </div>     
    </body>
</html>
