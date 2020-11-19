package ie.cct.msc.cloud.vipchecker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ie.cct.msc.cloud.vipchecker.domain.IsVip;

@RestController
public class VipCheckerController {

	@GetMapping("/user/{vipCode}")
	public IsVip isVip(@PathVariable("vipCode") String vipCode) {
			return new IsVip(vipCode.contentEquals("00000"));
			
	}

}
