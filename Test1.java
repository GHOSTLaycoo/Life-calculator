package unit3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws ParseException {
		System.out.println("请输入你的出生年月（按yyyy-mm-dd格式）");
		Scanner scan = new Scanner(System.in);
		String bir = scan.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date birth = sdf.parse(bir);
		
		Date now = new Date();
		long time = now.getTime() - birth.getTime();
	    //System.out.println("你已经活了"+time+"毫秒");
		long day = time/1000/60/60/24;
		long hour = (time%86400000)/3600000;
		long minute = (time%86400000%3600000)/60000;
		long second = (time%86400000%3600000%60000)/1000;
		long msec = time%86400000%3600000%60000%1000;
		System.out.println("恭喜你活了"+day+"天"+hour+"小时"+minute+"分钟"+second+"秒"+msec+"毫秒");
		long s = 36500 - day;
		System.out.println("你离一百岁还差"+s+"天");
		
		 s = s*60*60*1000*24;
		now.setTime(now.getTime()+s);
		
		System.out.println(sdf.format(now)+"是你的100岁纪念日");
	}

}
