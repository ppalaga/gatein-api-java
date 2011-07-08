/*
 * JBoss, a division of Red Hat
 * Copyright 2011, Red Hat Middleware, LLC, and individual
 * contributors as indicated by the @authors tag. See the
 * copyright.txt in the distribution for a full listing of
 * individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.gatein.api.navigation;

import org.gatein.api.Container;
import org.gatein.api.Portal;
import org.gatein.api.id.Identifiable;

/**
 * @author <a href="mailto:chris.laprun@jboss.com">Chris Laprun</a>
 * @version $Revision$
 */
public interface Site extends Identifiable
{
   Container<String, Page> getPageRegistry();

   Navigation getNavigation();

   Type getType();

   Navigation createNavigationTo(Targetable node, Navigation parent);

   int getPriority();

   public class Type<U extends Site>
   {
      public static final Type<Portal> PORTAL = new Type<Portal>();
      public static final Type<Site> DASHBOARD = new Type<Site>();
      public static final Type<Site> GROUP = new Type<Site>();
   }
}
