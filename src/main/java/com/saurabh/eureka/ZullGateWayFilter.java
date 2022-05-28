package com.saurabh.eureka;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


@Component
public class ZullGateWayFilter extends ZuulFilter 
{

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

//	@Override
//	public Object run() throws ZuulException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
//
//	@Override
//	public boolean isStaticFilter() {
//		// TODO Auto-generated method stub
//		return super.isStaticFilter();
//	}
//
//	@Override
//	public String disablePropertyName() {
//		// TODO Auto-generated method stub
//		return super.disablePropertyName();
//	}
//
//	@Override
//	public boolean isFilterDisabled() {
//		// TODO Auto-generated method stub
//		return super.isFilterDisabled();
//	}
//
//	@Override
//	public ZuulFilterResult runFilter() {
//		// TODO Auto-generated method stub
//		return super.runFilter();
//	}
//
//	@Override
//	public int compareTo(ZuulFilter filter) {
//		// TODO Auto-generated method stub
//		return super.compareTo(filter);
//	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();
		System.out.println(request.getRequestURI());
		return null;
	}

}
