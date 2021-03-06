/*
 * SudoSummary.java    Jul 31 2016, 00:20
 *
 * Copyright 2016 Drunken Dev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drunkendev.web.userlog;

import java.time.LocalDate;


/**
 * Sudo access summary for user switches.
 *
 * @author  Brett Ryan
 * @since   1.0
 */
public class SudoSummary {

    private final String username;
    private final String sudoUsername;
    private final LocalDate date;
    private final int count;

    /**
     * Creates a new {@code SudoSummary} instance.
     *
     * @param   username
     *          Username.
     * @param   sudoUsername
     *          User requests were made against.
     * @param   date
     *          Date requests were made.
     * @param   count
     *          Count of requests for this instance.
     */
    public SudoSummary(String username,
                       String sudoUsername,
                       LocalDate date,
                       int count) {
        this.username = username;
        this.sudoUsername = sudoUsername;
        this.date = date;
        this.count = count;
    }

    /**
     * Username requests are made by.
     *
     * @return  Username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Username requests were executed against.
     *
     * @return  sudo username.
     */
    public String getSudoUsername() {
        return sudoUsername;
    }

    /**
     * Date of requests.
     *
     * @return  date of requests.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Request count.
     *
     * @return  count.
     */
    public int getCount() {
        return count;
    }

}
