package com.team.loancalculate.domain.entity;

import lombok.Data;

@Data
public class Attestation {
    /**
     * 认证表id
     */
    private Integer attestationId;

    /**
     * 认证说明
     */
    private String attestationTitle;

    /**
     * 额度
     */
    private Integer attestationLines;

    public Integer getAttestationId() {
        return attestationId;
    }

    public void setAttestationId(Integer attestationId) {
        this.attestationId = attestationId;
    }

    public String getAttestationTitle() {
        return attestationTitle;
    }

    public void setAttestationTitle(String attestationTitle) {
        this.attestationTitle = attestationTitle;
    }

    public Integer getAttestationLines() {
        return attestationLines;
    }

    public void setAttestationLines(Integer attestationLines) {
        this.attestationLines = attestationLines;
    }
}

