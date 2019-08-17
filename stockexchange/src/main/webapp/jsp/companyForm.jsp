<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
 <%@ page import="com.stock.stockexchange.model.Sector"%>

<%@ page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
       href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
       rel="stylesheet" id="bootstrap-css">
<script
       src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
       src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <link rel="stylesheet" type="text/css" href="css/style.css">


</head>
<body class="container">
<header>
    <div class="container clearfix">
        <h1 id="logo" align="center">
        Stock Exchange </h1>
         <nav><style padding-left="15px"></style>
         <button class="button" type="button">logout</button>
         </nav>
    </div>
</header>
<br><br>
<h2><pre>    </pre>Create Company</h2>
<br>
<form:form method="post" action="addCompany"
  modelAttribute="company">
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 " for="companyName">companyName</label>
               <div class="col-md-7">
                    <form:input type="text" path="companyName"  placeholder="Enter Company Name" class="form-control input-xs"/>
                        <div class="has-error">
                        <form:errors path="companyName" class="text-danger"/>
                    </div>
                        
                   
                </div>
            </div>
        </div>
        
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="turnOver">turn Over</label>
               <div class="col-md-7">
                    <form:input type="text" path="turnOver" placeholder="Enter turnOver" class="form-control input-sm"/>
                     <div class="has-error">
                        <form:errors path="turnOver" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="ceo">CEO</label>
               <div class="col-md-7">
                    <form:input type="text" path="ceo" placeholder="Enter CEO" class="form-control input-sm"/>
                     <div class="has-error">
                        <form:errors path="ceo" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="boardOfDirectors">Board Of Directors</label>
               <div class="col-md-7">
                    <form:input type="text" path="boardOfDirectors" placeholder="Enter Board of Directors" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="boardOfDirectors" class="text-danger"/>
                    </div>
                    
                </div>
            </div>
        </div>
 
         <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="sector">sector Id</label>
              <div class="form-group input-group">
			<div class="input-group-prepend">
	</div>
					 <select required class="form-control" name="state">
                                                                    
                                                                     <%
                                                                     List<Sector> sectorList = (List)request.getAttribute("sectorList");
                                                                     for(int i=0;i<sectorList.size();i++)
                                                                     {
                                                                     
                                                                     %>
                                                                   
                                                                     <option value="<%=((Sector)sectorList.get(i)).getId()%>">
                                                                     
                                                                           <%=((Sector)sectorList.get(i)).getId()%>
                                                                     
                                                                     </option>
                                                                     <%
                                                                     }
                                                                     %>
                                                                     </select>
			</div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="briefWriteUp">Brief Write Up</label>
               <div class="col-md-7">
                    <form:input type="text" path="briefWriteUp" placeholder="Write about the company" class="form-control input-sm"/>
                   <div class="has-error">
                        <form:errors path="briefWriteUp" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="stockCode">Stock Code</label>
               <div class="col-md-7">
                    <form:input type="number" path="stockCode" placeholder="Enter stock Code" class="form-control input-sm"/>
                     
                </div>
            </div>
        </div>
        
        
   
              
    <input class="submit" type="submit" value="Submit" />

</form:form>
</body>
</html>