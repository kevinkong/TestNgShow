package org.chenkan.testngshow;

import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
//Let's import Mockito statically so that the code looks clearer

/**
 * @author chenkan
 * @since 14-4-10
 */
public class MockitoDemoTest {

    @Test(description = "Mockito可以记住mock对象的操作历史，并进行verify")
    public void rememberOperationHistory() {

        // mock creation
        List mockedList = mock(List.class);

        // using mock object
        mockedList.add("one");
        mockedList.clear();

        // verification
        verify(mockedList).add("one");  // PASS
        verify(mockedList).clear();     // PASS
        verify(mockedList).add("two");  // FAIL
    }


}
