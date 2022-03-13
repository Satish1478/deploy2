import org.codefx.demo.java17.api.random.Xkcd;

import java.util.random.RandomGenerator;

/**
 * Project demonstrating various Java features introduced since Java 9.
 */
module org.codefx.demo.java_x {
	exports org.codefx.demo.java18.jvm.javadoc;

	requires java.desktop;
	requires java.net.http;

	provides RandomGenerator with Xkcd;
}
