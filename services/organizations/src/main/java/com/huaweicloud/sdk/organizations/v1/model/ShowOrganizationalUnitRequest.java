package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOrganizationalUnitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_id")

    private String organizationalUnitId;

    public ShowOrganizationalUnitRequest withOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }

    /**
     * 与组织单元关联的唯一标识符（ID）。
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOrganizationalUnitRequest showOrganizationalUnitRequest = (ShowOrganizationalUnitRequest) o;
        return Objects.equals(this.organizationalUnitId, showOrganizationalUnitRequest.organizationalUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationalUnitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrganizationalUnitRequest {\n");
        sb.append("    organizationalUnitId: ").append(toIndentedString(organizationalUnitId)).append("\n");
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
