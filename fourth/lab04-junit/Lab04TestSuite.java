import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import cipher.CaesarCipherTest;
import famous.sequence.FibonacciTestSuite;
import famous.sequence.TriangularNumbersTest;
import magic.SoliloquyTest;
import math.operation.safe.IncrementTest;
import math.operation.textual.AdderTest;

@Suite
@SelectClasses({
	// demo
	FibonacciTestSuite.class,

	// tasks
	TriangularNumbersStructureTest.class,
	TriangularNumbersTest.class,

	IncrementStructureTest.class,
	IncrementTest.class,

	MusicTestSuite.class,

	AdderStructureTest.class,
	AdderTest.class,

	// exercises
	CaesarCipherStructureTest.class,
	CaesarCipherTest.class,

	IncantationStructureTest.class,
	SoliloquyStructureTest.class,
	SoliloquyTest.class
})
public class Lab04TestSuite {}
