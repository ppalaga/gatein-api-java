package org.gatein.api.composition;

import java.util.List;

/**
 *
 * A Container represents a block of content to be displayed on a page. It contains a list of
 * {@link ContainerItem}s, which can be other
 * {@link Container}'s or an {@link org.gatein.api.application.Application}.
 *
 * @author <a href="mailto:jpkroehling+javadoc@redhat.com">Juraci Paixão Kröhling</a>
 */
public interface Container extends ContainerItem {

    /**
     * Returns all the {@link org.gatein.api.composition.ContainerItem}s included on this container.
     * It is legal to change the returned list and it will be persisted during the persistence calls, for instance,
     * at {@link org.gatein.api.Portal#savePage(org.gatein.api.page.Page)}
     *
     * @return  The children of this container
     */
    public List<ContainerItem> getChildren();

    /**
     * Replaces the current list of children on this container by the one provided as parameter.
     */
    public void setChildren(List<ContainerItem> children);

    /**
     * Returns which template is used by this container.
     * @return the path to the container's template file
     */
    public String getTemplate();

    /**
     * Sets which template is to be used by this container. Note that a consumer would almost never set
     * this, as the default templates are set already by the implementations.
     */
    public void setTemplate(String template);

    /**
     * Gets the access permissions for this container.
     * @return an String array containing the access permissions
     */
    public String[] getAccessPermissions();

    /**
     * Sets the access permissions for this container
     * @param accessPermissions    the String array with the permissions
     */
    public void setAccessPermissions(String[] accessPermissions);

    /**
     * Gets the move apps permissions for this container.
     * @return an String array containing the move apps permissions
     */
    public String[] getMoveAppsPermissions();

    /**
     * Sets the move apps permissions for this container
     * @param moveAppsPermissions    the String array with the move apps permissions
     */
    public void setMoveAppsPermissions(String[] moveAppsPermissions);

    /**
     * Gets the move apps permissions for this container.
     * @return an String array containing the move apps permissions
     */
    public String[] getMoveContainersPermissions();

    /**
     * Sets the move container permissions for this container
     * @param moveContainersPermissions    the String array with the move container permissions
     */
    public void setMoveContainersPermissions(String[] moveContainersPermissions);
}
