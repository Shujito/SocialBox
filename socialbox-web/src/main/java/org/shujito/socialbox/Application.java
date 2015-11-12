package org.shujito.socialbox;

import org.eclipse.jetty.rewrite.handler.RewriteHandler;
import org.eclipse.jetty.rewrite.handler.Rule;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Application {
	public static void main(String[] args) throws Exception {
		System.out.println("Kero~!");
		// jetty server
		Server server = new Server(8080);
		// rewriter
		RewriteHandler rewriteHandler = new RewriteHandler();
		rewriteHandler.addRule(new Rule() {
			@Override
			public String matchAndApply(String target, HttpServletRequest request, HttpServletResponse response) throws IOException {
				return null;
			}
		});
		// file server
		final ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(true);
		resourceHandler.setWelcomeFiles(new String[]{ "index.html" });
		resourceHandler.setResourceBase("public");
		// servlets
		ServletContextHandler servletContextHandler = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
		servletContextHandler.setErrorHandler(new ControllerErrorHandler());
		ServletHolder servletHolder = servletContextHandler.addServlet(ServletContainer.class, "/*");
		servletHolder.setInitOrder(0);
		servletHolder.setInitParameter(ServerProperties.PROVIDER_PACKAGES, "org.shujito.socialbox.controllers");
		// put handers on a list
		HandlerList handlerList = new HandlerList();
		handlerList.setHandlers(new Handler[]{
			rewriteHandler,
			resourceHandler,
			servletContextHandler,
			new DefaultHandler()
		});
		// use handlers on the server
		server.setHandler(handlerList);
		// start server
		server.start();
		server.join();
	}
}
