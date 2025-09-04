package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainsStatuses请求体
 */
public class DomainsStatusesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private String domainIds;

    public DomainsStatusesRequestBody withDomainIds(String domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    /**
     * **参数解释**： 租户id集合。 **约束限制**： 不涉及。 **取值范围**： 不涉及。
     * @return domainIds
     */
    public String getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(String domainIds) {
        this.domainIds = domainIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainsStatusesRequestBody that = (DomainsStatusesRequestBody) obj;
        return Objects.equals(this.domainIds, that.domainIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainsStatusesRequestBody {\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
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
