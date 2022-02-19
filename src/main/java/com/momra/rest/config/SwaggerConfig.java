/*
 * package com.momra.rest.config;
 * 
 * import org.springdoc.core.GroupedOpenApi; import
 * org.springframework.beans.factory.annotation.Configurable; import
 * org.springframework.context.annotation.Bean;
 * 
 * @Configurable public class SwaggerConfig {
 * 
 * 
 * 
 * @Bean public GroupedOpenApi adminApi() { return
 * GroupedOpenApi.builder().group("springshop-admin").pathsToMatch("/admin/**")
 * .addMethodFilter(method -> method.isAnnotationPresent(Admin.class)).build();
 * }
 * 
 * 
 * }
 */