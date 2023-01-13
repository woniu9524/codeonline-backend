package com.codeonline.user.domain;

import com.codeonline.common.core.web.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SysIdentity extends BaseEntity {
    private Long id;

    private Long userId;

    @JsonProperty("identityChoose")
    private Long identityId;

    @JsonProperty("collegeChoose")
    private Long collegeId;

    @JsonProperty("classChoose")
    private Long classId;

    @JsonProperty("adminChoose")
    private Long approverId;

    private Boolean hasFinished;

    public Boolean getHasFinished() {
        return hasFinished;
    }

    public void setHasFinished(Boolean hasFinished) {
        this.hasFinished = hasFinished;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Long identityId) {
        this.identityId = identityId;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getApproverId() {
        return approverId;
    }

    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }
}

