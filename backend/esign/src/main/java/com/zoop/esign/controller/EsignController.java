package com.zoop.esign.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zoop.esign.config.ZoopAppConfig;
import com.zoop.esign.models.ZoopRequest;
import com.zoop.esign.models.ZoopResponse;

@RestController
@RequestMapping("/esign")
public class EsignController {
	
	@Autowired
	private ZoopAppConfig zConfig;

	@PostMapping("/zoop")
	public String zoopInit(@RequestBody  ZoopRequest zoopRequest) throws URISyntaxException {
		RestTemplate restTemp = new RestTemplate();		
		URI uri = new URI("https://test.zoop.one/contract/esign/v4/aadhaar/init");		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		headers.set("api-key", zConfig.getAppkey());
		headers.set("app-id", zConfig.getAppid());
		HttpEntity<ZoopRequest> httpEntity = new HttpEntity<>(zoopRequest, headers);
		
		System.out.println(httpEntity.getHeaders().toString());
	
		ResponseEntity<ZoopResponse> resp = restTemp.postForEntity(uri, httpEntity, ZoopResponse.class);
		//if(resp.getStatusCode() == HttpStatus.OK) {
		  ZoopResponse zresp = resp.getBody();
		//}
		System.out.println(resp.getBody());
		return zresp.getRequest_id();
	}
	 
}

