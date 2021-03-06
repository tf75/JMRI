package jmri.jmrix.loconet.loconetovertcp;

import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Paul Bender Copyright (C) 2017	
 */
public class ClientRxHandlerTest {

    @Test
    public void testCTor() {
        ClientRxHandler t = new ClientRxHandler("127.0.0.1", new java.net.Socket(), new jmri.jmrix.loconet.LocoNetInterfaceScaffold());
        Assert.assertNotNull("exists", t);
        t.dispose();
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        JUnitUtil.setUp();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

    // private final static Logger log = LoggerFactory.getLogger(ClientRxHandlerTest.class);

}
