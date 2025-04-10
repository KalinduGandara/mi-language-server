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

package org.eclipse.lemminx.customservice.synapse.syntaxTree.factory.mediators.eip;

import org.eclipse.lemminx.customservice.synapse.syntaxTree.factory.mediators.AbstractMediatorFactory;
import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.STNode;
import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.mediator.Mediator;
import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.mediator.eip.Iterate;
import org.eclipse.lemminx.customservice.synapse.syntaxTree.pojo.misc.targets.Target;
import org.eclipse.lemminx.customservice.synapse.syntaxTree.utils.SyntaxTreeUtils;
import org.eclipse.lemminx.customservice.synapse.utils.Constant;
import org.eclipse.lemminx.customservice.synapse.utils.Utils;
import org.eclipse.lemminx.dom.DOMElement;
import org.eclipse.lemminx.dom.DOMNode;

public class IterateFactory extends AbstractMediatorFactory {

    private static final String ITERATE = "iterate";

    @Override
    protected Mediator createSpecificMediator(DOMElement element) {

        Iterate iterate = new Iterate();
        iterate.elementNode(element);
        populateAttributes(iterate, element);
        DOMNode targetNode = Utils.getChildNodeByName(element, Constant.TARGET);
        if (targetNode != null) {
            Target target = SyntaxTreeUtils.createTarget(targetNode);
            iterate.setTarget(target);
        }
        return iterate;
    }

    @Override
    public void populateAttributes(STNode node, DOMElement element) {

        String sequential = element.getAttribute(Constant.SEQUENTIAL);
        if (sequential != null) {
            ((Iterate) node).setSequential(Boolean.parseBoolean(sequential));
        }
        String continueParent = element.getAttribute(Constant.CONTINUE_PARENT);
        if (continueParent != null) {
            ((Iterate) node).setContinueParent(Boolean.parseBoolean(continueParent));
        }
        String preservePayload = element.getAttribute(Constant.PRESERVE_PAYLOAD);
        if (preservePayload != null) {
            ((Iterate) node).setPreservePayload(Boolean.parseBoolean(preservePayload));
        }
        String expression = element.getAttribute(Constant.EXPRESSION);
        if (expression != null) {
            ((Iterate) node).setExpression(expression);
        }
        String attachPath = element.getAttribute(Constant.ATTACH_PATH);
        if (attachPath != null) {
            ((Iterate) node).setAttachPath(attachPath);
        }
        String id = element.getAttribute(Constant.ID);
        if (id != null) {
            ((Iterate) node).setId(id);
        }
        String description = element.getAttribute(Constant.DESCRIPTION);
        if (description != null) {
            ((Iterate) node).setDescription(description);
        }
    }

    @Override
    public String getTagName() {

        return ITERATE;
    }
}
