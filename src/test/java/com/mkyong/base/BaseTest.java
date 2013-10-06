package com.mkyong.base;

import org.junit.Ignore;
import org.springframework.test.annotation.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@Ignore
@ContextConfiguration(locations="/spring/config/test-BeanLocations.xml")
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests{
}
