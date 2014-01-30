package org.gatein.api.application;

/**
 * Set of possible ApplicationTypes.
 *
 * @author <a href="mailto:jpkroehling+javadoc@redhat.com">Juraci Paixão Kröhling</a>
 */
public enum ApplicationType {
    GADGET("gadget"), PORTLET("portlet"), WSRP("wsrp");

    private String name;

    private ApplicationType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
