package dev.robertzuba;

import com.google.common.base.Splitter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SplitterTest {
    private Splitter splitter;

    @Before
    public void setUp() {
        splitter = Splitter.on('-')
                .trimResults();
    }

    @Test
    public void shouldSplit3Names() {
        //given
        List<String> splittedNames = new ArrayList<>();

        //when
        splitter.split("Jacek-Placek-Tomek").iterator().forEachRemaining(splittedNames::add);

        //then
        assertEquals(splittedNames.get(0), "Jacek");
        assertEquals(splittedNames.get(1), "Placek");
        assertEquals(splittedNames.get(2), "Tomek");
    }

    @Test
    public void shouldSplit3NamesAndTrim() {
        //given
        List<String> splittedNames = new ArrayList<>();

        //when
        splitter.split("Jacek-   Placek - Tomek").iterator().forEachRemaining(splittedNames::add);

        //then
        assertEquals(splittedNames.get(0), "Jacek");
        assertEquals(splittedNames.get(1), "Placek");
        assertEquals(splittedNames.get(2), "Tomek");
    }
}
