package wish.junit5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import wish.normal.junit5.NormalTest;
import wish2.junit5.ExternalTest;

@RunWith(Suite.class)
@SuiteClasses({ExternalTest.class,InternalTest.class,NormalTest.class})
public class AllTests {

}
