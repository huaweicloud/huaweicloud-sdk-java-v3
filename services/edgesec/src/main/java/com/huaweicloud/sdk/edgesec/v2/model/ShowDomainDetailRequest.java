package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public ShowDomainDetailRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 防护域名id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainDetailRequest that = (ShowDomainDetailRequest) obj;
        return Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainDetailRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
