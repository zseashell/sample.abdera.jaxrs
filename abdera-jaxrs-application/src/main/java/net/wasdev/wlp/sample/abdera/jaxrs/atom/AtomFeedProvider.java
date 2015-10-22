/*******************************************************************************
 * Copyright (c) 2015 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package net.wasdev.wlp.sample.abdera.jaxrs.atom;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.apache.abdera.model.Feed;
@Produces({"application/atom+xml", "application/atom+xml;type=feed", "application/json" })
@Consumes({"application/atom+xml", "application/atom+xml;type=feed" })
@Provider
public class AtomFeedProvider extends AbstractAtomProvider<Feed> {
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mt) {
    	System.out.println("AtomFeedProvider--writable------------");
        return Feed.class.isAssignableFrom(type);
        
    }
    
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mt) {
    	System.out.println("AtomFeedProvider--readable------------");
        return Feed.class.isAssignableFrom(type);
    }
}