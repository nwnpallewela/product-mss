/*
*  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.wso2.carbon.mss.security;

/**
 * The class {@code MSSSecurityException} and its subclasses are a form of
 * {@code Exception} that indicates security related error conditions.
 */
public class MSSSecurityException extends Exception {

    private SecurityErrorCode errorCode;

    /**
     * Constructs a new exception with the specified error code and the detail message.
     *
     * @param errorCode SecurityErrorCode
     * @param message   error message
     */
    public MSSSecurityException(SecurityErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * Constructs a new exception with the specified detail message and the error code.
     *
     * @param errorCode SecurityErrorCode
     * @param message   error message
     * @param cause     cause the cause (which is saved for later retrieval by the
     *                  {@link #getCause()} method).  (A <tt>null</tt> value is
     *                  permitted, and indicates that the cause is nonexistent or
     *                  unknown.)
     */
    public MSSSecurityException(SecurityErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    /**
     * Returns the associate {@code SecurityErrorCode} value
     *
     * @return an instances of the SecurityErrorCode
     */
    public SecurityErrorCode getErrorCode() {
        return errorCode;
    }
}
