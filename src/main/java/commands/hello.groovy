package commands


import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext

import com.bhn.service.ContextProxy
import com.bhn.service.PropertyBean


/**
 * Example of command line implementation
 * @author sdu0000
 *
 */
class hello {
	

    @Usage("Say Hello")
    @Command
    def main(InvocationContext context) {
        PropertyBean b = (PropertyBean)ContextProxy.getBean("propertyBean");
		return b.getName();
    }
}