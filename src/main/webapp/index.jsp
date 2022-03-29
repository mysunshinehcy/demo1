<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/23
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
 <script type="text/javascript">
     function getSrc(url){
      $("#iframe").attr("src",url);
     }
 </script>
<style type="text/css">
    #all ul li{
        position: relative;
        float:left;
        width:200px;
    }
</style>
</head>
<body>
<div>
    <iframe src="${pageContext.request.contextPath}/index1" id="iframe">

    </iframe>
</div>
<div id="all">
<ul>
    <li>
        <div>
            <ul>
                <li onclick="getSrc('${pageContext.request.contextPath}/index1')"><a href="#">index1</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index2')"><a href="#">index2</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index3')"><a href="#">index3</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index4')"><a href="#">index4</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index5')"><a href="#">index5</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index6')"><a href="#">index6</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index7')"><a href="#">index7</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index8')"><a href="#">index8</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index9')"><a href="#">index9</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index10')"><a href="#">index10</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index11')"><a href="#">index11</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index12')"><a href="#">index12</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index13')"><a href="#">index13</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index14')"><a href="#">index14</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index15')"><a href="#">index15</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index16')"><a href="#">index16</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index17')"><a href="#">index17</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index18')"><a href="#">index18</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index19')"><a href="#">index19</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index20')"><a href="#">index20</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index21')"><a href="#">index21</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index22')"><a href="#">index22</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index23')"><a href="#">index23</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/index24')"><a href="#">index24</a></li>
            </ul>
        </div>
    </li>
    <li>
        <div>
            <ul>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index1')"><a href="#">index1</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index2')"><a href="#">index2</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index3')"><a href="#">index3</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index4')"><a href="#">index4</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index5')"><a href="#">index5</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index6')"><a href="#">index6</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index7')"><a href="#">index7</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index8')"><a href="#">index8</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index9')"><a href="#">index9</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index10')"><a href="#">index10</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index11')"><a href="#">index11</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index12')"><a href="#">index12</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index13')"><a href="#">index13</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index14')"><a href="#">index14</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index15')"><a href="#">index15</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index16')"><a href="#">index16</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index17')"><a href="#">index17</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index18')"><a href="#">index18</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index19')"><a href="#">index19</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index20')"><a href="#">index20</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index21')"><a href="#">index21</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index22')"><a href="#">index22</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index23')"><a href="#">index23</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest2/index24')"><a href="#">index24</a></li>
            </ul>
        </div>
    </li>
    <li>
        <div>
            <ul>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index1')"><a href="#">index1</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index2')"><a href="#">index2</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index3')"><a href="#">index3</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index4')"><a href="#">index4</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index5')"><a href="#">index5</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index6')"><a href="#">index6</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index7')"><a href="#">index7</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index8')"><a href="#">index8</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index9')"><a href="#">index9</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index10')"><a href="#">index10</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index11')"><a href="#">index11</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index12')"><a href="#">index12</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index13')"><a href="#">index13</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index14')"><a href="#">index14</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index15')"><a href="#">index15</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index16')"><a href="#">index16</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index17')"><a href="#">index17</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index18')"><a href="#">index18</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index19')"><a href="#">index19</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index20')"><a href="#">index20</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index21')"><a href="#">index21</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index22')"><a href="#">index22</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index23')"><a href="#">index23</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest3/index24')"><a href="#">index24</a></li>

            </ul>
        </div>
    </li>

    <li>
        <div>
            <ul>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index1')"><a href="#">index1</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index2')"><a href="#">index2</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index3')"><a href="#">index3</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index4')"><a href="#">index4</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index5')"><a href="#">index5</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index6')"><a href="#">index6</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index7')"><a href="#">index7</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index8')"><a href="#">index8</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index9')"><a href="#">index9</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index10')"><a href="#">index10</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index11')"><a href="#">index11</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index12')"><a href="#">index12</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index13')"><a href="#">index13</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index14')"><a href="#">index14</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index15')"><a href="#">index15</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index16')"><a href="#">index16</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index17')"><a href="#">index17</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index18')"><a href="#">index18</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index19')"><a href="#">index19</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index20')"><a href="#">index20</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index21')"><a href="#">index21</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index22')"><a href="#">index22</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index23')"><a href="#">index23</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest4/index24')"><a href="#">index24</a></li>
            </ul>
        </div>
    </li>
    <li>
        <div>
            <ul>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index1')"><a href="#">index1</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index2')"><a href="#">index2</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index3')"><a href="#">index3</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index4')"><a href="#">index4</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index5')"><a href="#">index5</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index6')"><a href="#">index6</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index7')"><a href="#">index7</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index8')"><a href="#">index8</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index9')"><a href="#">index9</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index10')"><a href="#">index10</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index11')"><a href="#">index11</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index12')"><a href="#">index12</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index13')"><a href="#">index13</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index14')"><a href="#">index14</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index15')"><a href="#">index15</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index16')"><a href="#">index16</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index17')"><a href="#">index17</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index18')"><a href="#">index18</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index19')"><a href="#">index19</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index20')"><a href="#">index20</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index21')"><a href="#">index21</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index22')"><a href="#">index22</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index23')"><a href="#">index23</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest5/index24')"><a href="#">index24</a></li>
            </ul>
        </div>
    </li>
    <li>
        <div>
            <ul>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index1')"><a href="#">index1</a> </li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index2')"><a href="#">index2</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index3')"><a href="#">index3</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index4')"><a href="#">index4</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index5')"><a href="#">index5</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index6')"><a href="#">index6</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index7')"><a href="#">index7</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index8')"><a href="#">index8</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index9')"><a href="#">index9</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index10')"><a href="#">index10</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index11')"><a href="#">index11</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index12')"><a href="#">index12</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index13')"><a href="#">index13</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index14')"><a href="#">index14</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index15')"><a href="#">index15</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index16')"><a href="#">index16</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index17')"><a href="#">index17</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index18')"><a href="#">index18</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index19')"><a href="#">index19</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index20')"><a href="#">index20</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index21')"><a href="#">index21</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index22')"><a href="#">index22</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index23')"><a href="#">index23</a></li>
                <li onclick="getSrc('${pageContext.request.contextPath}/rest6/index24')"><a href="#">index24</a></li>
            </ul>
        </div>
    </li>

</ul>
</div>




</body>
</html>
