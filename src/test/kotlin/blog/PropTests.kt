package blog

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PropTests(@Autowired val prop: AnotherBlogProperties) {

	@Test
	fun `get property`() {

		println(">> ${prop.banner.title}")
		println(">> ${prop.title}")
	}



}