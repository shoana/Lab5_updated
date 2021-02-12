package addressbook;

import static org.assertj.core.api.Assertions.assertThat;

import addressbook.repository.AddressBookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private AddressBookRepository addressbookrepo;

    @Test
    public void contextLoads() throws Exception {
        assertThat(addressbookrepo).isNotNull();
    }
}
