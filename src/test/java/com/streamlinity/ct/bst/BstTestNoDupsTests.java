package com.streamlinity.ct.bst;

import com.streamlinity.ct.bst.api.BstOpsInterface;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BstTestNoDupsTests {

	private int[] values = {5, 10, 15, 20, 25, 30, 35};
	@Autowired
	private BstOpsInterface bstOps;

	@Before
	public void setupBst() {
		bstOps.init(values);
	}

	@After
	public void clearBst() {
		bstOps.clear();
	}

	@Test
	public void testValueCountInBst() {

		// Tree nodes should not have dups

		assertThat(bstOps.getBstValues().size())
				.isEqualTo(values.length);
	}

	@Test
	public void testCorrectBstTreeConstruction() {

		// In Order, same as array order for these values: 5, 10, 15, 20, 25, 30, 35);

		List<Integer> bstValuesList = bstOps.getBstValuesInOrder();
		int[] baselineArray = {5, 10, 15, 20, 25, 30, 35};

		// ensure same number of values

		assertThat(bstValuesList.size()==baselineArray.length).
				as("getBstValuesInOrder expected to fail to catch mock BstOpsInterface implementations").
				isTrue();

		// ensure that the content is identical and in same order

		for (int i=0; i<bstValuesList.size(); i++) {
			assertThat(bstValuesList.get(i)==baselineArray[i]).
					as(String.format("Value: %d at index: %d not matching", bstValuesList.get(i), i)).isTrue();
		}

	}


	@Test
	public void testSearchInBstForExistingValue() {

		// Does search work when value found?

		assertThat(bstOps.search(5).size()).isEqualTo(1);
		assertThat(bstOps.search(25).size()).isEqualTo(1);
		assertThat(bstOps.search(35).size()).isEqualTo(1);

		// verify returned right index value

		int index = bstOps.search(35).get(0);
		assertThat(index).isEqualTo(6);
		index = bstOps.search(20).get(0);
		assertThat(index).isEqualTo(3);

	}

	@Test
	public void testSearchInBstForMissingValue() {

		// don't report false success if Bst is empty to begin with

		assertThat(bstOps.getBstValues().size()>0).isTrue();

		// verify search for missing value

		assertThat(bstOps.search(23).size()).isEqualTo(0);

	}

	@Test
	public void testClear() {

		// don't report false success if Bst is empty to begin with

		assertThat(bstOps.getBstValues().size()>0).isTrue();

		// check that clear works

		bstOps.clear();
		assertThat(bstOps.getBstValues().size())
				.isEqualTo(0);

	}

}
