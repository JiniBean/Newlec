<%@page import="com.ginong.product.Product"%>
<%@page import="com.ginong.product.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ProductRepository repository = new ProductRepository();
	System.out.println(request.getParameter("id"));
	int id = Integer.parseInt(request.getParameter("id"));
	System.out.println("야호");
	
	Product product = repository.findById(id);
	
%>
  
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <header>
      <h1>Rland</h1>
      <div><a href="">장바구니</a></div>
      <div><a href="">마이페이지</a></div>
      <div><a href="">설정</a></div>
    </header>

    <main>
      <div><img src="#" alt="카페라떼" /></div>

      <section>
        <h1><%= product.getKorNm() %></h1>
        <div><%= product.getEngNm() %></div>
        <div>
          알랜드만의 로스팅 기법으로 볶은 원두를 사용하여<br />
          추출된 풍부한 에스프레소와 신선한 우유가 어우러진 대표 라떼
        </div>
        <div><%= product.getPrice() %></div>
        <form action="#">
          <fieldset>
            <legend>사이즈</legend>
            <label for="small">스몰</label>
            <input type="radio" name="size" value="1" id="small" />
            <label for="large">라지</label>
            <input type="radio" name="size" value="2" id="large" />
          </fieldset>

          <fieldset>
            <legend>옵션</legend>
            <label for="1">HOT</label>
            <input type="radio" name="option" value="1" />
            <label for="2">ICED</label>
            <input type="radio" name="option" value="2" />
          </fieldset>

          <input type="submit" name="edit" value="수정" />
          <input type="submit" name="del" value="삭제" />
        </form>
      </section>

      <section>
        <h1>함께 추천 드리는 메뉴</h1>
        <div><img src="#" /></div>
        <div><img src="#" /></div>
        <div><img src="#" /></div>
      </section>
    </main>

    <footer>
      <div>홈페이지</div>
      <div>사업자 등록번호 : 123-45-67</div>
      <div>&copy; 2023 Rland Newlecture All Rights Reserved</div>
    </footer>
  </body>
</html>


