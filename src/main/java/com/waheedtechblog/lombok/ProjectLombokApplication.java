package com.waheedtechblog.lombok;

import com.waheedtechblog.lombok.model.ApiBuilderPatternWithLombok;
import com.waheedtechblog.lombok.model.UserPrincipalWithLombok;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectLombokApplication.class, args);
		UserPrincipalWithLombok userPrincipalWithLombok1 = new UserPrincipalWithLombok();
		UserPrincipalWithLombok userPrincipalWithLombok2 = new UserPrincipalWithLombok("username","123456","admin");
		System.out.println("Users: " + userPrincipalWithLombok2.toString());

		System.out.println("================================\n");

		ApiBuilderPatternWithLombok builderPatternWithLombok = ApiBuilderPatternWithLombok.builder().username("").password("").build();
	}

}
