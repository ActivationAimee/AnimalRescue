/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-04-09 12:36:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Protect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.Member;

public final class protectClickBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("     \r\n");

	Member member = (Member)session.getAttribute("member");

      out.write("  \r\n");
      out.write("<!DOCTYPE html> \r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t\t<meta name = \"viewport\" content = \"width = device-width, initial-scale=1\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"initial-scale=1.0\">\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery.bxslider.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>病院詳細情報</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<style type = \"text/css\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.tab {\r\n");
      out.write("\t\t\t\t  \tfloat: left;\r\n");
      out.write("\t\t\t\t  \tborder: 1px solid #ccc;\r\n");
      out.write("\t\t\t\t  \tbackground-color: #f1f1f1;\r\n");
      out.write("\t\t\t\t  \twidth: 25%;\r\n");
      out.write("\t\t\t\t  \theight: 300px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.tab button {\r\n");
      out.write("\t\t\t\t    display: block;\r\n");
      out.write("\t\t\t\t    background-color: inherit;\r\n");
      out.write("\t\t\t\t    color: black;\r\n");
      out.write("\t\t\t\t    padding: 22px 16px;\r\n");
      out.write("\t\t\t\t    width: 100%;\r\n");
      out.write("\t\t\t\t    border: none;\r\n");
      out.write("\t\t\t\t    outline: none;\r\n");
      out.write("\t\t\t\t    text-align: left;\r\n");
      out.write("\t\t\t\t    cursor: pointer;\r\n");
      out.write("\t\t\t\t    font-size: 17px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t.tab button:hover {\r\n");
      out.write("\t\t  \t\t\tbackground-color: #ddd;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.tab button.active {\r\n");
      out.write("\t\t\t\t  \tbackground-color: #ccc;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.mid_content{\r\n");
      out.write("\t\t\t\t\twidth : 74.5%;\r\n");
      out.write("\t\t\t\t\tfloat : left;\r\n");
      out.write("\t\t\t\t\tmargin-left : 5px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.top_content{\r\n");
      out.write("\t\t\t\t\tpadding : 18px; \r\n");
      out.write("\t\t\t\t\tbackground-color : skyblue;\r\n");
      out.write("\t\t\t\t\ttext-align : center;\r\n");
      out.write("\t\t\t\t\tmargin-bottom : 3px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t #map {\r\n");
      out.write("\t\t\t        height: 450px;\r\n");
      out.write("\t\t\t        width : 600px;\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    html, body {\r\n");
      out.write("\t\t\t        height: 100%;\r\n");
      out.write("\t\t\t        margin: 0;\r\n");
      out.write("\t\t\t        padding: 0;\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    .sen{\r\n");
      out.write("\t\t\t    \tborder: 1px solid;\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t#listbutton{\r\n");
      out.write("\t\t\t\t\tfloat: right;\r\n");
      out.write("\t\t\t\t\tdisplay: block;\r\n");
      out.write("\t\t\t\t    background-color: inherit;\r\n");
      out.write("\t\t\t\t    color: black;\r\n");
      out.write("\t\t\t\t    padding: 19px 5px;\r\n");
      out.write("\t\t\t\t    width: 19%;\r\n");
      out.write("\t\t\t\t    border: none;\r\n");
      out.write("\t\t\t\t    outline: none;\r\n");
      out.write("\t\t\t\t    text-align: center;\r\n");
      out.write("\t\t\t\t    cursor: pointer;\r\n");
      out.write("\t\t\t\t    font-size: 14px;\r\n");
      out.write("\t\t\t\t    margin-left : 10px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t#command{\r\n");
      out.write("\t\t\t\t\tfloat:right;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t.btn_ok{\r\n");
      out.write("\t\t\t\t\tfloat: right;\r\n");
      out.write("\t\t\t\t   \tbackground:#426aaa; \r\n");
      out.write("\t\t\t\t   \tcolor : #fff;\r\n");
      out.write("\t\t\t\t   \twidth : 200px; \r\n");
      out.write("\t\t\t\t   \theight : 70px;\r\n");
      out.write("\t\t\t\t    border : 0 none;\r\n");
      out.write("\t\t\t\t    outline: none;\r\n");
      out.write("\t\t\t\t    text-align: center;\r\n");
      out.write("\t\t\t\t    cursor : pointer;\r\n");
      out.write("\t\t\t\t    font-size: 14px;\r\n");
      out.write("\t\t\t\t    margin-left : 10px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction showConfirm(){\r\n");
      out.write("\t\t\t\tif(confirm(\"削除しますか。\")){\r\n");
      out.write("\t\t\t\t\talert(\"削除しました。\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"削除がキャンセルしました。\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"hb\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/main/mainBody.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/main/mainHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class = \"top_content\">\r\n");
      out.write("\t\t\t<h2>保護キャンペン</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class = \"tab\">\r\n");
      out.write("\t\t\t<button onclick = \"location.href='/animalRescue/list.anires?page=1'\">病院リスト</button>\r\n");
      out.write("\t\t\t\t<button onclick = \"location.href='/animalRescue/protectList.anires?page=1'\">保護センターリスト</button>\r\n");
      out.write("\t\t\t\t<button onclick=\"location.href='/animalRescue/supportboard.anires'\">サポート掲示板</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class = \"mid_content\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("    \t\t\t<td rowspan=\"4\" width = \"70%\" class=\"sen\"> \r\n");
      out.write("        \t<div id=\"map\"></div>\r\n");
      out.write("    \t\t<script>\r\n");
      out.write("      \t\tfunction initMap() {\r\n");
      out.write("      \t\t\tvar latnum = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.maplat}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("      \t\t\tvar lngnum = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.maplng}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t        \tvar uluru = {lat: latnum, lng: lngnum};\r\n");
      out.write("\t        \tvar map = new google.maps.Map(document.getElementById('map'),{zoom: 18, center: uluru});\r\n");
      out.write("\t        \tvar marker = new google.maps.Marker({position: uluru, map: map});\r\n");
      out.write("      \t\t}\r\n");
      out.write("    \t\t</script>\r\n");
      out.write("    \t\t<script async defer src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDNZUkhrTwy99uOuSx7PiA3DbaaT6pwt7w&callback=initMap\">\r\n");
      out.write("    \t\t</script>\r\n");
      out.write("        \t</td>\r\n");
      out.write("\t\t        <td class=\"sen\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t    \t<td class=\"sen\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t    \t<td class=\"sen\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.open}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t    \t<td class=\"sen\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.adress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t    \t<td colspan=\"2\" class=\"sen\"> \r\n");
      out.write("\t\t        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<button class=\"btn_ok\" onclick = \"location.href = 'protectList.anires?page=1'\">戻る</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/main/mainFooter.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /Protect/protectClickBoard.jsp(177,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.admin==1 }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<form method=\"post\" action = \"protectDelete.anires?num=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.protectnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t<button type=\"submit\" class=\"btn_ok\" onclick = \"showConfirm();\" >削除</button>\r\n");
          out.write("\t\t\t</form>\r\n");
          out.write("\t\t\t\t<button class=\"btn_ok\" onclick = \"location.href = 'protectModify.anires?num=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptList.protectnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("'\">修正</button>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
