package org.gatein.api.application;

import org.gatein.api.composition.ContainerItem;

import java.util.Date;
import java.util.List;

/**
 * A record in the Application Registry. Currently, there are types of applications as defined
 * in {@link ApplicationType}: Portlet, WSRP Portlet and Gadget.
 * <p>
 * The same concept is available in the User Interface under "Group > Administration > Application Registry"
 *
 * @author <a href="mailto:jpkroehling+javadoc@redhat.com">Juraci Paixão Kröhling</a>
 */
public interface Application extends ContainerItem {

    /**
     * The application's ID
     * @return the application's ID
     */
    String getId();

    /**
     * The application's name
     * @return the application's name
     */
    String getApplicationName();

    /**
     * The category name for this application
     * @return the category name for this application
     */
    String getCategoryName();

    /**
     * The type of this application, e.g. WSRP, Portlet, Gadget
     * @return the type of this application
     */
    ApplicationType getType();

    /**
     * The display name for this application, e.g. "My awesome portlet"
     * @return the display name of this application
     */
    String getDisplayName();

    /**
     * The long description of this application
     * @return the long description of this application
     */
    String getDescription();

    /**
     * The URL for this application's icon
     * @return the URL for this application's icon
     */
    String getIconURL();

    /**
     * The date this application was created in the registry.
     * @return the date this application was created in the registry.
     */
    Date getCreatedDate();

    /**
     * The date this application was last modified in the registry.
     * @return the date this application was last modified in the registry.
     */
    Date getModifiedDate();

    /**
     * A list of the access permissions for this application
     * @return a list of the access permissions for this application
     */
    List<String> getAccessPermissions();

    /**
     * The title of this application
     * @return the title of this application
     */
    String getTitle();

    /**
     * The screen height used to display this application
     * @return the screen height used to display this application
     */
    String getHeight();

    /**
     * Indicates whether this application can be modified or not
     * @return a flag indicating whether this application can be modified or not
     */
    boolean getModifiable();

    /**
     * Indicates whether to show the application mode or not
     * @return a flag indicating whether to show the application mode or not
     */
    boolean getShowApplicationMode();

    /**
     * Indicates whether to show the application state or not
     * @return a flag indicating whether to show the application state or not
     */
    boolean getShowApplicationState();

    /**
     * Indicates whether to show the info bar or not
     * @return a flag indicating whether to show the info bar or not
     */
    boolean getShowInfoBar();

    /**
     * The theme to use when rendering this application
     * @return the theme to use when rendering this application
     */
    String getTheme();

    /**
     * The screen width used to display this application
     * @return the screen width used to display this application
     */
    String getWidth();
}
