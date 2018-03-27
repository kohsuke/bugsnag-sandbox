package test;

import com.bugsnag.Bugsnag;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        foo();
    }

    private static void foo() {
        // code change
        Bugsnag bugsnag = new Bugsnag(System.getenv("KEY"));
        bugsnag.setAppVersion("1.0.0");
        bugsnag.addCallback((report)-> {
            report.addToTab("sample tab","key1","value2");
        });
        bugsnag.notify(new Exception("Yo!"));
    }
}
