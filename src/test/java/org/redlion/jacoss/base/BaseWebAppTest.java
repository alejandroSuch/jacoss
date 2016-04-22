package org.redlion.jacoss.base;

import org.junit.runner.RunWith;
import org.redlion.jacoss.JacossApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by alejandro on 22/04/2016.
 */
@ActiveProfiles("test")
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JacossApplication.class)
@WebAppConfiguration
public abstract class BaseWebAppTest {
}
