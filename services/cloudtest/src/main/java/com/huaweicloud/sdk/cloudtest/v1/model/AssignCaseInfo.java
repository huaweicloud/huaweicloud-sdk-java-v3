package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用例关联信息
 */
public class AssignCaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_available")

    private Boolean isAvailable;

    public AssignCaseInfo withCaseUri(String caseUri) {
        this.caseUri = caseUri;
        return this;
    }

    /**
     * 用例URI
     * @return caseUri
     */
    public String getCaseUri() {
        return caseUri;
    }

    public void setCaseUri(String caseUri) {
        this.caseUri = caseUri;
    }

    public AssignCaseInfo withIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * 是否可用
     * @return isAvailable
     */
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssignCaseInfo that = (AssignCaseInfo) obj;
        return Objects.equals(this.caseUri, that.caseUri) && Objects.equals(this.isAvailable, that.isAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseUri, isAvailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignCaseInfo {\n");
        sb.append("    caseUri: ").append(toIndentedString(caseUri)).append("\n");
        sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
