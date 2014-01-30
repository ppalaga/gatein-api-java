package org.gatein.api.composition;

import org.gatein.api.page.Page;
import org.gatein.api.security.Permission;

import java.util.List;

/**
 *
 * This is the starting point when starting the usage of the Compose Page API. Once a builder is obtained from the
 * {@link org.gatein.api.Portal}, the caller can start configuring a {@link Page}. At the end of the process,
 * the caller can obtain the resulting {@link Page} representation by calling {@link PageBuilder#build()}.
 *
 * This builder gives access also to a {@link ContainerBuilder}, which allows the specification of the layout of the
 * page, in terms of {@link Container} (columns, rows, applications, ...).
 *
 * The simplest example for building a {@link Page}, and the usual case when there's only one portlet inside of it, is:
 *
 * <pre>
 *     {@code
 *     Page page = pageBuilder.child(gadgetCalculator).siteName(siteName).siteType(siteType).name(pageName).build();
 *     }
 * </pre>
 *
 * When completing, the resulting {@link Page} object can be persisted using the
 * {@link org.gatein.api.Portal#savePage(Page)} method. See more examples on the usage
 * of this API on the documentation and quickstart.
 *
 * @see org.gatein.api.Portal#newPageBuilder()
 * @see org.gatein.api.Portal#savePage(Page)
 * @author <a href="mailto:jpkroehling+javadoc@redhat.com">Juraci Paixão Kröhling</a>
 */
public interface PageBuilder extends LayoutBuilder<PageBuilder> {

    /**
     * <b>Optional</b>
     * <p>
     * Sets a description for this page.
     * @param description the description to set
     * @return this builder
     */
    PageBuilder description(String description);

    /**
     * <b>Required</b>
     * <p>
     * Sets the site name to which this page belongs to
     * @param siteName the site name
     * @return this builder
     */
    PageBuilder siteName(String siteName);

    /**
     * <b>Optional</b>
     * <p>
     * The display name of this page.
     *
     * @param displayName the display name
     * @return this builder
     */
    PageBuilder displayName(String displayName);

    /**
     * <b>Optional</b>
     * <p>
     * Whether this page should show the "maximize window" option.
     *
     * @param showMaxWindow the boolean indicating if the option should be shown
     * @return this builder
     */
    PageBuilder showMaxWindow(boolean showMaxWindow);

    /**
     * Sets the access permissions for this page. This information should be always provided. Failure to provide this
     * information might cause inconsistent behavior between the API versions: at a version, implementations might
     * decide that it's better to have Permission#everyone by default, at a later version, might be an admin. Or even
     * an IllegalStateException. It is good practice to *always* provide this when composing a page.
     *
     * @param accessPermission the access permission for this page
     * @return this builder
     */
    PageBuilder accessPermission(Permission accessPermission);

    /**
     * Sets the edit permission for this page. This information should be always provided. Failure to provide this
     * information might cause inconsistent behavior between the API versions: at a version, implementations might
     * decide that it's better to have Permission#everyone by default, at a later version, might be an admin. Or even
     * an IllegalStateException. It is good practice to *always* provide this when composing a page.
     *
     * @param editPermission the edit permission
     * @return this builder
     */
    PageBuilder editPermission(Permission editPermission);

    /**
     * Sets the move apps permissions for this page. This information should be always provided. Failure to provide this
     * information might cause inconsistent behavior between the API versions: at a version, implementations might
     * decide that it's better to have Permission#everyone by default, at a later version, might be an admin. Or even
     * an IllegalStateException. It is good practice to *always* provide this when composing a page.
     *
     * @param moveAppsPermissions the list of move apps permissions for this page
     * @return this builder
     */
    PageBuilder moveAppsPermissions(List<String> moveAppsPermissions);

    /**
     * Sets the move containers permissions for this page. This information should be always provided. Failure to provide this
     * information might cause inconsistent behavior between the API versions: at a version, implementations might
     * decide that it's better to have Permission#everyone by default, at a later version, might be an admin. Or even
     * an IllegalStateException. It is good practice to *always* provide this when composing a page.
     *
     * @param moveContainersPermissions the list of move containers permissions for this page
     * @return this builder
     */
    PageBuilder moveContainersPermissions(List<String> moveContainersPermissions);

    /**
     * <b>Required</b>
     * <p>
     * The site type of which this page belongs to. Possible values are:
     * <ul>
     *     <li>portal</li>
     *     <li>site</li>
     *     <li>user</li>
     * </ul>
     *
     * @param siteType    the site type, based on the possible values
     * @return this builder
     * @throws java.lang.IllegalArgumentException if the provided value is none of the possible values
     */
    PageBuilder siteType(String siteType);

    /**
     * Builds a new {@link Page} based on the provided information.
     * @return a new {@link Page} object
     * @throws java.lang.IllegalStateException if any mandatory information is not provided
     */
    public Page build();

    /**
     * <b>Required</b>
     * <p>
     * The page name
     *
     * @param name    the page name
     * @return this builder
     */
    public PageBuilder name(String name);

}
