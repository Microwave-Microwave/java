

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import cafe.AdultStructureTest;
import cafe.BartenderStructureTest;
import cafe.GuestStructureTest;
import cafe.MinorStructureTest;
import cafe.CafeTest;

@Suite
@SelectClasses({
    BartenderStructureTest.class,
    GuestStructureTest.class,
    AdultStructureTest.class,
    MinorStructureTest.class,
    CafeTest.class
})
public class CafeSuite
{

}
