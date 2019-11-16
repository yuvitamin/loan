package com.team.loancalculate.domain.entity;

import lombok.Data;

@Data
public class SocialSecurity {
    /**
     * 社保情况情id
     */
    private Integer socialSecurityId;

    /**
     * 社保说明
     */
    private String socialSecurityTitle;

    /**
     * 额度
     */
    private Integer socialSecurityLines;

    public Integer getSocialSecurityId() {
        return socialSecurityId;
    }

    public void setSocialSecurityId(Integer socialSecurityId) {
        this.socialSecurityId = socialSecurityId;
    }

    public String getSocialSecurityTitle() {
        return socialSecurityTitle;
    }

    public void setSocialSecurityTitle(String socialSecurityTitle) {
        this.socialSecurityTitle = socialSecurityTitle;
    }

    public Integer getSocialSecurityLines() {
        return socialSecurityLines;
    }

    public void setSocialSecurityLines(Integer socialSecurityLines) {
        this.socialSecurityLines = socialSecurityLines;
    }
}

