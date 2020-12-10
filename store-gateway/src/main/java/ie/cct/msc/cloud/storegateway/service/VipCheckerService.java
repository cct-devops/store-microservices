package ie.cct.msc.cloud.storegateway.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import ie.cct.msc.cloud.storegateway.domain.IsVip;

public class VipCheckerService {
	
	public boolean isVipCode(String code) {
	    HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create("http://vip-service/user/" + code))
	          .build();

	    HttpResponse<String> response;
		try {
			response = client.send(request, BodyHandlers.ofString());
			String body = response.body();
			Gson g = new Gson();
			IsVip isVip = g.fromJson(body, IsVip.class);
			return isVip.isVip();
		} catch (Exception e) {
      e.printStackTrace();
			return false;
		}
	}
}
