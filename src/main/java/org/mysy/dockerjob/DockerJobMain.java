package org.mysy.dockerjob;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class DockerJobMain {

	public static void main(String[] args) {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		log.info("{}", strDate);
	}


}
