import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gateway {
	
	private Integer uid;
	
	private String readableName;
	
	private String ip;
	
	private List<Devices> devices;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getReadableName() {
		return readableName;
	}

	public void setReadableName(String readableName) {
		this.readableName = readableName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public List<Devices> getDevices() {
		return devices;
	}

	public void setDevices(List<Devices> devices) {
		this.devices = devices;
	}
	
	public boolean validateIPv4(String ip) {
		Pattern p = Pattern.compile("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b");
		Matcher m = p.matcher(ip);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}

}
