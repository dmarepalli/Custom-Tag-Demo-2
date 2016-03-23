package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class MyCustomTag implements Tag{

	private int number;
	PageContext context;
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doStartTag() throws JspException {
		try{
			JspWriter out = context.getOut();
			out.println("<h1> double of "+number+" is"+(2*number)+"</h1>");
		}catch(IOException e){
			
		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPageContext(PageContext arg0) {
		this.context = arg0;
		
	}
	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
