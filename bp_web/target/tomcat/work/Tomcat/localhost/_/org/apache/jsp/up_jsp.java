/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-21 08:00:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class up_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <title>up热度</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/bootstrap/css/bootstrap.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/img/p4.jpg\" class=\"img-fluid\" alt=\"...\" style=\"width: 100%\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"jumbotron jumbotron-fluid\" style=\"height: 130px\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1 class=\"display-2\">up主分析</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-5\">\r\n");
      out.write("        <div class=\"list-group\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=0\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-80 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=1\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(1).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(1).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(1).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=2\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(2).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(2).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(2).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=3\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(3).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(3).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(3).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=4\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(4).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(4).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(4).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=5\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(5).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(5).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(5).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=6\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(6).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(6).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(6).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=7\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(7).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(7).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(7).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=8\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(8).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(8).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(8).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=9\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(9).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(9).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(9).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("            <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=9\" class=\"list-group-item list-group-item-action\">\r\n");
      out.write("                <div class=\"d-flex w-100 justify-content-between\">\r\n");
      out.write("                    <h5 class=\"mb-1\" style=\"font-size:x-large\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(9).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <p class=\"mb-1\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(10).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</p>\r\n");
      out.write("                <small class=\"text-muted\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(10).upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</small>\r\n");
      out.write("            </a >\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-7\">\r\n");
      out.write("        <form>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"rank\">寻找排名</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"rank\" style=\"width: 600px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" onclick=\"findup();return false;\" id=\"test\">查询</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        <ul class=\"list-group\" style=\"width: 600px\">\r\n");
      out.write("            <li class=\"list-group-item\">up主：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("            <li class=\"list-group-item\">总播放：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upView}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</li>\r\n");
      out.write("            <li class=\"list-group-item\">总硬币：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" k</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div id=\"main\" style=\"width: 600px;height:400px;\"></div>\r\n");
      out.write("        </br>\r\n");
      out.write("        <div id=\"main2\" style=\"width: 800px;height:600px;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function findup(){\r\n");
      out.write("        location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bili/up.do?index=\"+$('#rank').val();\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/jquery/echarts.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var chartDom = document.getElementById('main');\r\n");
      out.write("    var myChart = echarts.init(chartDom);\r\n");
      out.write("    var option;\r\n");
      out.write("\r\n");
      out.write("    option = {\r\n");
      out.write("        tooltip: {\r\n");
      out.write("            trigger: 'item'\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            top: '5%',\r\n");
      out.write("            left: 'center'\r\n");
      out.write("        },\r\n");
      out.write("        series: [\r\n");
      out.write("            {\r\n");
      out.write("                name: '操作',\r\n");
      out.write("                type: 'pie',\r\n");
      out.write("                radius: ['40%', '70%'],\r\n");
      out.write("                avoidLabelOverlap: false,\r\n");
      out.write("                itemStyle: {\r\n");
      out.write("                    borderRadius: 10,\r\n");
      out.write("                    borderColor: '#fff',\r\n");
      out.write("                    borderWidth: 2\r\n");
      out.write("                },\r\n");
      out.write("                label: {\r\n");
      out.write("                    show: false,\r\n");
      out.write("                    position: 'center'\r\n");
      out.write("                },\r\n");
      out.write("                emphasis: {\r\n");
      out.write("                    label: {\r\n");
      out.write("                        show: true,\r\n");
      out.write("                        fontSize: '40',\r\n");
      out.write("                        fontWeight: 'bold'\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                labelLine: {\r\n");
      out.write("                    show: false\r\n");
      out.write("                },\r\n");
      out.write("                data: [\r\n");
      out.write("\r\n");
      out.write("                    { value: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upLike}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(", name: '点赞' },\r\n");
      out.write("                    { value: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(", name: '投币' },\r\n");
      out.write("                    { value: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upCollect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(", name: '收藏' },\r\n");
      out.write("                    { value: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upShare}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(", name: '分享' }\r\n");
      out.write("                ]\r\n");
      out.write("            }\r\n");
      out.write("        ]\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    option && myChart.setOption(option);\r\n");
      out.write("\r\n");
      out.write("    var chartDom2 = document.getElementById('main2');\r\n");
      out.write("    var myChart2 = echarts.init(chartDom2);\r\n");
      out.write("    var option2;\r\n");
      out.write("\r\n");
      out.write("    option2 = {\r\n");
      out.write("        title: {\r\n");
      out.write("            text: 'up之间的数据对比'\r\n");
      out.write("        },\r\n");
      out.write("        tooltip: {\r\n");
      out.write("            trigger: 'axis'\r\n");
      out.write("        },\r\n");
      out.write("        legend: {},\r\n");
      out.write("        toolbox: {\r\n");
      out.write("            show: true,\r\n");
      out.write("            feature: {\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        xAxis: {\r\n");
      out.write("            type: 'category',\r\n");
      out.write("            boundaryGap: false,\r\n");
      out.write("            data: [ '点赞', '投币', '收藏', '分享']\r\n");
      out.write("        },\r\n");
      out.write("        yAxis: {\r\n");
      out.write("            type: 'value',\r\n");
      out.write("            axisLabel: {\r\n");
      out.write("                formatter: '{value}k'\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        series: [\r\n");
      out.write("            {\r\n");
      out.write("                name: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("                type: 'line',\r\n");
      out.write("                data: [");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).upLike}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).upCollect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uplogs.get(0).upShare}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("]\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                name: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.up}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("                type: 'line',\r\n");
      out.write("                data: [");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upLike}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upCollect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upFound.upShare}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("],\r\n");
      out.write("                markPoint: {\r\n");
      out.write("                    data: [\r\n");
      out.write("                        { type: 'max', name: 'Max' },\r\n");
      out.write("                        { type: 'min', name: 'Min' }\r\n");
      out.write("                    ]\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                name: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allcates.cate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("                type: 'line',\r\n");
      out.write("                data: [");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allcates.cateLike}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allcates.cateCoin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allcates.cateCollect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allcates.cateShare}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("]\r\n");
      out.write("            },\r\n");
      out.write("        ]\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    option2 && myChart2.setOption(option2);\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /up.jsp(14,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("path");
    // /up.jsp(14,4) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/up.jsp(14,4) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /up.jsp(14,4) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
