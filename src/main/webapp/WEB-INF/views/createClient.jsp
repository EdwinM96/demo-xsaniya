<%-- 
    Document   : createClient
    Created on : 02-06-2022, 11:01:54 AM
    Author     : Edwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xsaniya Demo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet"
              href="//cdnjs.cloudflare.com/ajax/libs/highlight.js/11.4.0/styles/atom-one-dark.min.css">
    </head>
    <body>
        <script src="//cdnjs.cloudflare.com/ajax/libs/highlight.js/11.4.0/highlight.min.js"></script>       
        <script src="//unpkg.com/json-format-highlight@1.0.1/dist/json-format-highlight.js" type="text/javascript" charset="utf-8"></script>
        <script>
            hljs.configure({
                ignoreUnescapedHTML: true
            });

        </script>
        <div class="container py-4">
            <header class="pb-3 mb-4 border-bottom">
                <div class="text-end">Xsaniya LOGO</div>
                <span class="fs-4">1. Register a Client</span>                
            </header>
            <div class="row align-items-md-stretch">
                <div class="col-md-6 pb-3">
                    <p style="font-weight: bold">Target: ${baseURL}/api/users</p>
                    <p>All of the described fields on this example are required.</p>
                    <p>The  <span style="font-weight:bold">"group"</span> field will always be the same value for each institution and it's value will be provided by Xsaniya.</p>
                    <p>Now using this information as a client for our use case we will go ahead and register our client.</p>
                </div>
                <div class="col-md-6">
                    <script>
                        document.write(
                                '<pre><code class="language-json">  ' + hljs.highlight(JSON.stringify(JSON.parse('${userData}'), null, 4), {language: "json"}).value) + '</code> </pre>';
                    </script>
                </div>
            </div>
                    <div class="row align-items-md-stretch">
                         <div class="text-end"><a href="${pageContext.request.contextPath}/client-created"><button class="btn btn-outline-primary btn-lg" type="button">Next</button></a></div>
                    </div>        
        </div>
        <script>
            hljs.highlightElement(document.querySelector('code'));
        </script>
    </body>
</html>
