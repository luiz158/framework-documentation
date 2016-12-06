package org.demoiselle.jee.configuration.extractor.impl;

import static org.demoiselle.jee.core.annotation.Priority.L2_PRIORITY;

import java.lang.reflect.Field;

import javax.enterprise.context.Dependent;

import org.apache.commons.configuration2.Configuration;
import org.demoiselle.jee.configuration.ConfigType;
import org.demoiselle.jee.configuration.extractor.ConfigurationValueExtractor;
import org.demoiselle.jee.core.annotation.Priority;

/**
 * Adds the data extraction capability of a source ({@link ConfigType}) for the type of {@link String}.
 * 
 * <p>
 * Sample:
 * </p>
 * <p>
 * For the extraction of a string type of a properties file the statement made in the properties will have the following format:
 * </p>
 * 
 * <pre>
 * demoiselle.ip=192.168.0.120 
 * </pre>
 * 
 * And the configuration class will be declared as follows:
 * 
 * <pre>
 *  
 * &#64;Configuration
 * public class BookmarkConfig {
 *
 *  private String ip;
 *
 *  public String getIp() {
 *    return ip;
 *  }
 *
 * }
 * 
 * </pre>
 * 
 */
@Dependent
@Priority(L2_PRIORITY)
public class ConfigurationStringValueExtractor implements ConfigurationValueExtractor {

	@Override
	public Object getValue(String prefix, String key, Field field, Configuration configuration) throws Exception {
		return configuration.getString(prefix + key);
	}
	
	@Override
	public boolean isSupported(Field field) {
		return field.getType() == String.class;
	}
}