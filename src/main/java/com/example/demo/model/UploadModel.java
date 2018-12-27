package com.example.demo.model;

import org.springframework.web.multipart.MultipartFile;

public class UploadModel {

	private String extraField;
	private MultipartFile[] filesq;

	public String getExtraField() {
		return extraField;
	}

	public void setExtraField(String extraField) {
		this.extraField = extraField;
	}
	//mapping upload form name=abc
	public MultipartFile[] getAbc() {
		return filesq;
	}
	//mapping upload form name=abc
	public void setAbc(MultipartFile[] files) {
		this.filesq = files;
	}

	// getters and setters
}
