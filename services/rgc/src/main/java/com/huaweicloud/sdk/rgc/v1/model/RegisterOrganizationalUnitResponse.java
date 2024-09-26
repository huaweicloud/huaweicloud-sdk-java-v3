package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RegisterOrganizationalUnitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_operation_id")

    private String organizationalUnitOperationId;

    public RegisterOrganizationalUnitResponse withOrganizationalUnitOperationId(String organizationalUnitOperationId) {
        this.organizationalUnitOperationId = organizationalUnitOperationId;
        return this;
    }

    /**
     * 异步接口的操作ID。
     * @return organizationalUnitOperationId
     */
    public String getOrganizationalUnitOperationId() {
        return organizationalUnitOperationId;
    }

    public void setOrganizationalUnitOperationId(String organizationalUnitOperationId) {
        this.organizationalUnitOperationId = organizationalUnitOperationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterOrganizationalUnitResponse that = (RegisterOrganizationalUnitResponse) obj;
        return Objects.equals(this.organizationalUnitOperationId, that.organizationalUnitOperationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationalUnitOperationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterOrganizationalUnitResponse {\n");
        sb.append("    organizationalUnitOperationId: ")
            .append(toIndentedString(organizationalUnitOperationId))
            .append("\n");
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
