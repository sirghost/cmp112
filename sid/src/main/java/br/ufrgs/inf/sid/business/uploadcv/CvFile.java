package br.ufrgs.inf.sid.business.uploadcv;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class CvFile {
	
	private CommonsMultipartFile cvFile;

	public CommonsMultipartFile getCvFile() {
		return cvFile;
	}
	public void setCvFile(CommonsMultipartFile cvFile) {
		this.cvFile = cvFile;
	}
}