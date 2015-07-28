package org.kitesdk.data.kafka;

import org.kitesdk.data.DatasetDescriptor;
import org.kitesdk.data.spi.AbstractMetadataProvider;

import java.util.Collection;


public class KafkaMetadataProvider extends AbstractMetadataProvider{

  @Override
  public DatasetDescriptor load(String namespace, String name) {
    return null;
  }

  @Override
  public DatasetDescriptor create(String namespace, String name, DatasetDescriptor descriptor) {
    return null;
  }

  @Override
  public DatasetDescriptor update(String namespace, String name, DatasetDescriptor descriptor) {
    return null;
  }

  @Override
  public boolean delete(String namespace, String name) {
    return false;
  }

  @Override
  public boolean exists(String namespace, String name) {
    return false;
  }

  @Override
  public Collection<String> namespaces() {
    return null;
  }

  @Override
  public Collection<String> datasets(String namespace) {
    return null;
  }
}
