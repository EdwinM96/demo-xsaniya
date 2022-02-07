<%-- 
    Document   : checkBalance
    Created on : 02-06-2022, 10:28:37 PM
    Author     : Edwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xsaniya Demo</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/styles/ocean.min.css">
        <script src="//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/highlight.min.js"></script>
    </head>
    <body>        
        <pre><code class="language-json">
        
<script>
    document.write(hljs.highlight('json', JSON.stringify(JSON.parse('${userData}'), null, 4)).value);
        </script>
</code></pre>
        <script>hljs.highlightBlock(document.querySelector('code'));</script>
    </body>
</html>
