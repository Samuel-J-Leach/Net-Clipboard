package code;

public class NetClipboard {
	
	private static String host(int port) {
		//TODO implement host
		return "";
	}
	
	private static String join(String ip, int port) {
		//TODO implement join
		return "";
	}
	
	private static int parsePort(String[] args) {
		//TODO implement parsePort
		return 0;
	}
	
	private static String parseIP(String[] args) {
		//TODO implement parseIP
		return "";
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("add 'help' when running Net-Clipboard for a list of commands");
		} else if (args[0].equals("help")) {
			System.out.println("host {port number} - makes this device the host of a Net-Clipboard session");
			System.out.println("join {IP address} {port number} - connects to a Net-Clipboard session hosted by someone else");
		} else if (args[0].equals("host")) {
			System.out.println(host(parsePort(args)));
		} else if (args[0].equals("join")) {
			System.out.println(join(parseIP(args), parsePort(args)));
		} else {
			System.out.println("ERROR - no such command: '" + args[0] + "'");
		}
	}

}
