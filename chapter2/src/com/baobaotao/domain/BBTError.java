package com.baobaotao.domain;

import java.io.Serializable;
import org.springframework.stereotype.Service;

@Service
public class BBTError implements Serializable{
	private static final long serialVersionUID = 1L;
	private String text;//¥ÌŒÛ–≈œ¢
	
	
	//--------------------------------------------
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
