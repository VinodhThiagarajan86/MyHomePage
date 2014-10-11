import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_myHomePage_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'favicon.png'))
printHtmlPart(3)
invokeTag('javascript','g',13,['library':("jquery"),'plugin':("jquery")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',14,['src':("bootstrap.min.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',15,['src':("javagrasp.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',16,['src':("heroic-features.css")],-1)
printHtmlPart(5)
invokeTag('layoutHead','g',19,[:],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('layoutBody','g',22,[:],-1)
printHtmlPart(7)
invokeTag('message','g',32,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(8)
invokeTag('javascript','asset',34,['src':("bootstrap.min.js")],-1)
printHtmlPart(9)
})
invokeTag('captureBody','sitemesh',36,[:],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413059904705L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
