/*
 * Copyright 2017 Async-IO.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.cpr;


/**
 * The CompletionAware interface is used by a class implementing the {@link AtmosphereResponse} interface
 * to be notified when writing to the response has been completed.
 * This is indicated by the response object leaving the scope of HttpServlet.service method for synchronous calls
 * or the AsyncContext.complete method being invoked for asynchronous calls.
 */
public interface CompletionAware {
    void onComplete();
    boolean completed();
}