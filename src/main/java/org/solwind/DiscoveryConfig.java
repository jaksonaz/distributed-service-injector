package org.solwind;

import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by solwind on 6/14/17.
 */
interface DiscoveryConfig {
    void init();
    void connect() throws IOException, InterruptedException;
    void push(String path, RegistrationServiceHolder data) throws KeeperException, InterruptedException;
    RegistrationServiceHolder retrieve(String path);
    Properties props();
}
