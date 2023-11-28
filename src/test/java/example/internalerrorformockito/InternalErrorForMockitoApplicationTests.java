package example.internalerrorformockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InternalErrorForMockitoApplicationTests {

    static class SomeType {}
    @Mock
    private SomeType mock;

	@Test
	void contextLoads() {
	}

}
