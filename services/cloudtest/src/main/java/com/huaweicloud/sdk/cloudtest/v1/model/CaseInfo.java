package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新用例信息列表
 */
public class CaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private String caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_url")

    private String scriptUrl;

    public CaseInfo withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例id
     * @return caseId
     */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public CaseInfo withScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
        return this;
    }

    /**
     * 脚本路径
     * @return scriptUrl
     */
    public String getScriptUrl() {
        return scriptUrl;
    }

    public void setScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseInfo that = (CaseInfo) obj;
        return Objects.equals(this.caseId, that.caseId) && Objects.equals(this.scriptUrl, that.scriptUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId, scriptUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseInfo {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    scriptUrl: ").append(toIndentedString(scriptUrl)).append("\n");
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
