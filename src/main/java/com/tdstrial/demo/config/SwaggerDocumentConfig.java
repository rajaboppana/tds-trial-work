/**
 * 
 */
package com.tdstrial.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tdstrial.demo.controller.DeviceController;
import com.tdstrial.demo.controller.UserController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Raja
 *
 * Smartrec test
 */

@Configuration
@EnableSwagger2
public class SwaggerDocumentConfig {
	
	private static final String ALL_CHILD = ".*";
	 
    private ApiInfo metadata() {
        return new ApiInfoBuilder().title("TDSoftware").description("TDSoftware trial assignment")
                .contact(new Contact("", "", "boppana.deu@gmail.com"))
                .version("1.0").build();
    }
 
    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("User API").apiInfo(metadata()).select()
                .paths(PathSelectors.regex(UserController.ROOT_PATH + ALL_CHILD)).build();
 
    }
    
    @Bean
    public Docket deviceApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Device API").apiInfo(metadata()).select()
                .paths(PathSelectors.regex(DeviceController.ROOT_PATH + ALL_CHILD)).build();
 
    }

}
