import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class GatewayController {

	private final String sharedKey = "123";
	private static final String SUCCESS_STATUS = "success";
	private static final String ERROR_STATUS = "error";
	private static final int CODE_SUCCESS = 100;
	private static final int AUTH_FAILURE = 102;
	private static final String VALIDATION_ERROR_MESSAGE = "ata is not valid";

	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public Gateway informationForGateway(@RequestParam(value = "uid") String uid,
			@RequestBody Gateway gatewayInformation) {
		BaseResponse response = new BaseResponse();
		if (sharedKey.equalsIgnoreCase(uid)) {
			int ip = gatewayInformation.getUid();
			String name = gatewayInformation.getReadableName();
			List<Devices> devices = gatewayInformation.getDevices();
			response.setStatus(SUCCESS_STATUS);
			response.setCode(CODE_SUCCESS);
		} else {
			response.setStatus(ERROR_STATUS);
			response.setCode(AUTH_FAILURE);
		}
		return gatewayInformation;
	}

//	@RequestMapping(value = "/getAll", method = RequestMethod.POST)
//	public List<Gateway> returnAllGeteways() {
//		
//	}

	@RequestMapping(value = "/removeDevice", method = RequestMethod.POST)
	public List<Devices> removeDevice(Devices device, Integer gatewayUid, Gateway gateway) {
		List<Devices> currentDevices = gateway.getDevicesForId(gatewayUid);
		for (Devices d : currentDevices) {
			if (d.getUid() == device.getUid()) {
				currentDevices.remove(d);
			}
		}
		return currentDevices;
	}

}
