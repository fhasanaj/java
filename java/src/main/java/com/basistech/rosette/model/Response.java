package com.basistech.rosette.model;

/******************************************************************************
 ** This data and information is proprietary to, and a valuable trade secret
 ** of, Basis Technology Corp.  It is given in confidence by Basis Technology
 ** and may only be used as permitted under the license agreement under which
 ** it has been distributed, and in no other way.
 **
 ** Copyright (c) 2014 Basis Technology Corporation All rights reserved.
 **
 ** The technical data and information provided herein are provided with
 ** `limited rights', and the computer software provided herein is provided
 ** with `restricted rights' as those terms are defined in DAR and ASPR
 ** 7-104.9(a).
 ******************************************************************************/

import java.util.Map;

public abstract class Response {

    private String requestId;
    private Map<String, Long> timers;

    public Response() {
    }

    public Response(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public Map<String, Long> getTimers() { return timers; }

    public void setTimers(Map<String, Long> timers) {
        this.timers = timers;
    }

    public String toString() {
        String result = "requestId: " + requestId;
        if (timers != null) {
            result += " timers: " + timers.entrySet().toString();
        }
        return result;
    }

}
