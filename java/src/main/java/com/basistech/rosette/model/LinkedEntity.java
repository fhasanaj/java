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

public class LinkedEntity {
    private String entityId;
    private int indocChainId;
    private String mention;
    private double confidence;

    public LinkedEntity() {
    }

    public LinkedEntity(
            String entityId,
            int indocChainId,
            String mention,
            double confidence
    ) {
        this.entityId = entityId;
        this.indocChainId = indocChainId;
        this.mention = mention;
        this.confidence = confidence;
    }

    public String getEntityId() {
        return entityId;
    }

    public int getIndocChainId() {
        return indocChainId;
    }

    public String getMention() {
        return mention;
    }

    public double getConfidence() {
        return confidence;
    }
}
