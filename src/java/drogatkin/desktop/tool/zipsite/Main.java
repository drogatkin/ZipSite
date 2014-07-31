/* ZipSite Copyright 2014 Dmitriy Rogatkin All rights reserved. */
package drogatkin.desktop.tool.zipsite;

/**
 * main site content extractor
 * 
 * @author Dmitriy
 *
 */
public class Main {

	public static void main(String... args) {
		System.out.printf("ZipSite site content grabber   (c) 2014 D. Rogarkin%n");
		usage();
	}
	
	private static void usage() {
		System.out.printf(" Use: java -jar zipsite.jar site_start_URL%n");
	}
}