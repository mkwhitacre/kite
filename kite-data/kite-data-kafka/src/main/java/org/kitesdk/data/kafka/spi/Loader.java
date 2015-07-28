package org.kitesdk.data.kafka.spi;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.kitesdk.data.kafka.KafkaDatasetRepository;
import org.kitesdk.data.spi.*;

import java.util.Map;

/**
 * Created by mkw on 7/27/15.
 */
public class Loader implements Loadable {


  @Override
  public void load() {


    Registration.register(
        new URIPattern("hbase::zk"),
        new URIPattern("hbase::zk/:dataset?namespace=default"),
        new OptionBuilder<DatasetRepository>() {
          @Override
          public DatasetRepository getFromOptions(Map<String, String> options) {
//            Configuration conf = HBaseConfiguration.create(DefaultConfiguration.get());
//            String[] hostsAndPort = parseHostsAndPort(options.get("zk"));
//            conf.set(HConstants.ZOOKEEPER_QUORUM, hostsAndPort[0]);
//            String port = hostsAndPort[1];
//            if (port != null) {
//              conf.set(HConstants.ZOOKEEPER_CLIENT_PORT, port);
//            }
            return new KafkaDatasetRepository.Builder().configuration(conf).build();
          }
        });
  }
}
