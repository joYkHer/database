package manyClass;
import java.util.*;
import java.text.*;
public class OtherUtil {
	public String showTime()throws Exception{
		Date dnow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return ft.format(dnow);
	}
}
