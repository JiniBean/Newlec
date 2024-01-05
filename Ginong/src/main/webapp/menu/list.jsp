<%@page import="com.ginong.product.Product"%>
<%@page import="com.ginong.product.ProductList"%>
<%@page import="com.ginong.product.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ProductRepository repository = new ProductRepository();
	ProductList list = repository.findAll();
	
	int size = list.size();
	
%>    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
 <header>
        <h1>기농이네</h1>
        <div><a href="">로그인</a></div>
        <div><a href="">장바구니</a></div>

    </header>

    <main>
        <nav>
            <h1>카테고리 검색 메뉴</h1>
            <ul>
	            <li><a href="">과채류</a></li>
	            <li><a href="">양념류</a></li>
	            <li><a href="">가공식품류</a></li>
	            <li><a href="">공지사항</a></li>
	            <li><a href="">고객센터</a></li>
            </ul>
        </nav>

        <section>
            <h1>키워드 검색 폼</h1>
            <form action="#">
                <label for="search">상품명</label>
                <input type="search" name="q" id="search">
                <button><img src="/Ginong/res/search.png" width="28" height="28" > </button>
            </form>
        </section>

        <%for(int i=0; i<size; i++) {
             Product menu = list.get(i); %>
            <section>
                <h1><a href="detail.jsp?id=<%= i+1 %>"><%= menu.getKorNm() %> (<%= menu.getQuantity() %>개입)</a></h1>
            	<div><img alt="" src=""></div>
                <div><%= menu.getEngNm() %></div>
                <div><%= menu.getPrice() %>원</div>
            </section>
        <% } %>

    </main>
    <footer>
        <div>홈페이지</div>
        <div>사업자 등록번호 : 123-45-67</div>
        <div>&copy; 2023 Gonongine Newlecture All Rights Reserved</div>
    </footer>
</body>
</html>