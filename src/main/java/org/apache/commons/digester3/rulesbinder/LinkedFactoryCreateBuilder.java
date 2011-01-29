/* $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.digester3.rulesbinder;

/**
 * Builder chained when invoking {@link LinkedRuleBuilder#factoryCreate(String)}.
 */
public interface LinkedFactoryCreateBuilder extends BackToLinkedRuleBuilder {

    /**
     * Allows specify the attribute containing an override class name if it is present.
     *
     * @param attributeName The attribute containing an override class name if it is present
     * @return this builder instance
     */
    LinkedFactoryCreateBuilder overriddenByAttribute(String attributeName);

    /**
     * Exceptions thrown by the object creation factory will be ignored or not.
     *
     * @param ignoreCreateExceptions if true, exceptions thrown by the object creation factory will be ignored
     * @return this builder instance
     */
    LinkedFactoryCreateBuilder ignoreCreateExceptions(boolean ignoreCreateExceptions);

}
