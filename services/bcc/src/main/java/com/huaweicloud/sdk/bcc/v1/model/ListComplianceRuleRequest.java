package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListComplianceRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "embedded_flag")

    private Boolean embeddedFlag;

    public ListComplianceRuleRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListComplianceRuleRequest withEmbeddedFlag(Boolean embeddedFlag) {
        this.embeddedFlag = embeddedFlag;
        return this;
    }

    /**
     * 是否系统内置
     * @return embeddedFlag
     */
    public Boolean getEmbeddedFlag() {
        return embeddedFlag;
    }

    public void setEmbeddedFlag(Boolean embeddedFlag) {
        this.embeddedFlag = embeddedFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListComplianceRuleRequest that = (ListComplianceRuleRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.embeddedFlag, that.embeddedFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, embeddedFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComplianceRuleRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    embeddedFlag: ").append(toIndentedString(embeddedFlag)).append("\n");
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
