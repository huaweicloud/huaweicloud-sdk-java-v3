package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteOrganizationConformancePackRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conformance_pack_id")

    private String conformancePackId;

    public DeleteOrganizationConformancePackRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public DeleteOrganizationConformancePackRequest withConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
        return this;
    }

    /**
     * 合规规则包ID。
     * @return conformancePackId
     */
    public String getConformancePackId() {
        return conformancePackId;
    }

    public void setConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteOrganizationConformancePackRequest that = (DeleteOrganizationConformancePackRequest) obj;
        return Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.conformancePackId, that.conformancePackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, conformancePackId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOrganizationConformancePackRequest {\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    conformancePackId: ").append(toIndentedString(conformancePackId)).append("\n");
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
