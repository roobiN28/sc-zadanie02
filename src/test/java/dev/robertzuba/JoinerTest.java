package dev.robertzuba;

import com.google.common.base.Joiner;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JoinerTest {
    private Joiner joiner;

    @Before
    public void setUp() {
        joiner = Joiner.on("---").skipNulls();
    }

    @Test
    public void shouldJoin3NamesTogether() {
        //given
        List<String> names = Arrays.asList("Jacek", "Placek", "Tomek");

        //when
        String joinedNames = joiner.join(names);

        //then
        assertEquals(joinedNames, "Jacek---Placek---Tomek");
    }

    @Test
    public void shouldJoin3NamesTogetherWithoutNull() {
        //given
        List<String> names = Arrays.asList("Jacek", "Placek", null, "Barbara");

        //when
        String joinedNames = joiner.join(names);

        //then
        assertEquals(joinedNames, "Jacek---Placek---Barbara");
    }
}
