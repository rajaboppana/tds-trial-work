/**
 * 
 */
package com.tdstrial.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Raja
 *
 *         TDSoftware trial
 * 
 *         Swagger documentation configuration class
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-22T10:42:21.464+05:30")

@Configuration
@EnableSwagger2
public class SwaggerDocumentConfig {

	/*
	 * Meta data for swagger
	 */
	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("TDSoftware").description("TDSoftware trial assignment")
				.contact(new Contact("", "", "boppana.deu@gmail.com")).version("1.0").build();
	}
	
	/* 
	 * Custom Implementation by scanning all the REST controllers in the package 
	 * */
	 @Bean
	    public Docket customImplementation(){
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                    .apis(RequestHandlerSelectors.basePackage("com.tdstrial.demo.controller"))
	                    .build()
	                .apiInfo(metadata());
	    }

}
