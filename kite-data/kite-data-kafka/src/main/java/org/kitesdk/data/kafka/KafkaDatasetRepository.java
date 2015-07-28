package org.kitesdk.data.kafka;

import org.kitesdk.data.Dataset;
import org.kitesdk.data.DatasetDescriptor;
import org.kitesdk.data.spi.AbstractDatasetRepository;

import java.net.URI;
import java.util.Collection;

/**
 * Created by mkw on 7/27/15.
 */
public class KafkaDatasetRepository  extends AbstractDatasetRepository{
  @Override
  public <E> Dataset<E> load(String namespace, String name, Class<E> type) {
    return null;
  }

  @Override
  public <E> Dataset<E> create(String namespace, String name, DatasetDescriptor descriptor, Class<E> type) {
    return null;
  }

  @Override
  public <E> Dataset<E> update(String namespace, String name, DatasetDescriptor descriptor, Class<E> type) {
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

  @Override
  public URI getUri() {
    return null;
  }

  public static class Builder {

  }

}
