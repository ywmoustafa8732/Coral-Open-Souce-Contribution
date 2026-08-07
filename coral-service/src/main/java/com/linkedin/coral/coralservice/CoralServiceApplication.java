/**
 * Copyright 2022-2026 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.coral.coralservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration;


@SpringBootApplication(exclude = GroovyTemplateAutoConfiguration.class)
public class CoralServiceApplication {
  public static final Logger LOGGER = LoggerFactory.getLogger(CoralServiceApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CoralServiceApplication.class, args);
  }
}
