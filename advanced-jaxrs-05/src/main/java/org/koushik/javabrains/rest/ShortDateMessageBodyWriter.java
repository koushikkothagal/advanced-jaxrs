package org.koushik.javabrains.rest;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces("text/shortdate")
public class ShortDateMessageBodyWriter implements MessageBodyWriter<Date> {

	@Override
	public long getSize(Date arg0, Class<?> arg1, Type arg2, Annotation[] arg3,
			MediaType arg4) {
		
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> type, Type arg1, Annotation[] arg2,
			MediaType arg3) {
		return Date.class.isAssignableFrom(type);
	}

	@Override
	public void writeTo(Date date,
	        Class<?> type,
	        Type type1,
	        Annotation[] antns,
	        MediaType mt,
	        MultivaluedMap<String, Object> mm,
	        OutputStream out) throws IOException, WebApplicationException {
		
		String shortDate = date.getDate() + "-" + date.getMonth() + "-" + date.getYear();
		out.write(shortDate.getBytes());
		
	}

}
