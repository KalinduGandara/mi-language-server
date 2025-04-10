/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.mediator.other.publishEvent;

import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.mediator.Mediator;

public class PublishEvent extends Mediator {

    Object eventSink;
    Object streamName;
    Object streamVersion;
    boolean async;
    String timeout;
    PublishEventAttributes attributes;
    String description;

    public Object getEventSink() {

        return eventSink;
    }

    public void setEventSink(Object eventSink) {

        this.eventSink = eventSink;
    }

    public Object getStreamName() {

        return streamName;
    }

    public void setStreamName(Object streamName) {

        this.streamName = streamName;
    }

    public Object getStreamVersion() {

        return streamVersion;
    }

    public void setStreamVersion(Object streamVersion) {

        this.streamVersion = streamVersion;
    }

    public PublishEventAttributes getAttributes() {

        return attributes;
    }

    public void setAttributes(PublishEventAttributes attributes) {

        this.attributes = attributes;
    }

    public boolean isAsync() {

        return async;
    }

    public void setAsync(boolean async) {

        this.async = async;
    }

    public String getTimeout() {

        return timeout;
    }

    public void setTimeout(String timeout) {

        this.timeout = timeout;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
