import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import thegarlic.forum.Application;
import thegarlic.forum.config.TestContextInitializer;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class, initializers = TestContextInitializer.class)
public class SpringConfigurationTest {
	
	@Autowired
	private String mode;

	@Test
	public void test() {
		assertEquals(mode, "test");
	}
}
