package com.spring.amazon.s3.bucket.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class ApplicationConfig {

	@Value("${spring.application.name}")
	private String appName;

	@Bean
	public AmazonS3 amazonS3Client(AWSCredentialsProvider credentialsProvider,
			@Value("${cloud.aws.region.static}") String region) {
		return AmazonS3ClientBuilder.standard().withCredentials(credentialsProvider).withRegion(region).build();
	}
}
