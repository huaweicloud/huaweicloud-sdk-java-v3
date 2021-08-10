package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CaseRealtionInfo */
public class CaseRealtionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private String caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_description")

    private String simpleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public CaseRealtionInfo withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /** 工单id
     * 
     * @return caseId */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public CaseRealtionInfo withSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
        return this;
    }

    /** 简要描述
     * 
     * @return simpleDescription */
    public String getSimpleDescription() {
        return simpleDescription;
    }

    public void setSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
    }

    public CaseRealtionInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 提交人，即用户名称
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaseRealtionInfo caseRealtionInfo = (CaseRealtionInfo) o;
        return Objects.equals(this.caseId, caseRealtionInfo.caseId)
            && Objects.equals(this.simpleDescription, caseRealtionInfo.simpleDescription)
            && Objects.equals(this.userName, caseRealtionInfo.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId, simpleDescription, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseRealtionInfo {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
