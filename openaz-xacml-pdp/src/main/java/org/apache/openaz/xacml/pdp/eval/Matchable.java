/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

/*
 *                        AT&T - PROPRIETARY
 *          THIS FILE CONTAINS PROPRIETARY INFORMATION OF
 *        AT&T AND IS NOT TO BE DISCLOSED OR USED EXCEPT IN
 *             ACCORDANCE WITH APPLICABLE AGREEMENTS.
 *
 *          Copyright (c) 2013 AT&T Knowledge Ventures
 *              Unpublished and Not for Publication
 *                     All Rights Reserved
 */

package org.apache.openaz.xacml.pdp.eval;

/**
 * Matchable is the interface objects implement to indicate they are part of a XACML Target matching tree.
 *
 */
public interface Matchable {
    /**
     * Matches this <code>Matchable</code> in the given {@link org.apache.openaz.xacml.pdp.eval.EvaluationContext} and
     * returns a {@link org.apache.openaz.xacml.pdp.eval.MatchResult}.
     *
     * @param evaluationContext the <code>EvaluationContext</code> to use in matching
     * @return a <code>MatchResult</code> indicating whether this <code>Matchable</code> matches against the given <code>EvaluationContext</code>.
     * @throws EvaluationException if there is an error testing the match.
     */
    public MatchResult match(EvaluationContext evaluationContext) throws EvaluationException;
}
