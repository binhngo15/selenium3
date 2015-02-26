/**
 * 
 */
package net.saisoft.selenium;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.util.Log4jConfigListener;

/**
 * @author Joe Guaneri
 *
 */
public class WebAppInitializer implements WebApplicationInitializer {

	/**
	 * 
	 */
	public WebAppInitializer() {
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		servletContext.addListener(new Log4jConfigListener());
		registerDispatcherServlet(servletContext);
	}

	private void registerDispatcherServlet(ServletContext servletContext) {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext(); 
        ctx.register(WebApplicationConfig.class);  
        ctx.setServletContext(servletContext);
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
	    dynamic.addMapping("/");  
	    dynamic.setLoadOnStartup(1);
	    servletContext.addListener(new ContextLoaderListener(ctx));
	}
}
