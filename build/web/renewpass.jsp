<%-- 
    Document   : renewpass
    Created on : 23-May-2017, 10:17:40
    Author     : sunan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="form-group">
             <form action="renewpassword" method="Post">
                    <label class="control-label col-sm-2">Enter your new password</label>
                    <div class="col-sm-10">
                    <input required type="password" class="form-control" name="password" placeholder="Enter your new password">
                    </div>
                      <div class="col-sm-offset-2 col-sm-10">
                    <button class="btn btn-primary">Submit</button>
                </div>
             </form>
                </div>
    </body>
</html>
