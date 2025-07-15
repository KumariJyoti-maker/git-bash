package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trawex.com");*/
		int a []  ={1,0,2,3,0,9,0,8};
		int n=a.length;
		int[] b=new int[n];
	    int j=0;
	    for(int i=0;i<n;i++){
	        if(a[i]!=0){
	           b[j++]=a[i];
	   
	            }
	        }
	    for(int k=j; k<n; k++)
	    {
	    	b[k]=0;
	         
	    }
	    
	    for(int i=0; i<n; i++)
	    {
	    	System.out.print(b[i]+" ");
	    }

	}

}
