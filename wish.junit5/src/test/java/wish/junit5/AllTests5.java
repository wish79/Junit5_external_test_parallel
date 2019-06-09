package wish.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import wish.normal.junit5.NormalTest;
import wish2.junit5.ExternalTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({ExternalTest.class,InternalTest.class,NormalTest.class})
public class AllTests5 {

}