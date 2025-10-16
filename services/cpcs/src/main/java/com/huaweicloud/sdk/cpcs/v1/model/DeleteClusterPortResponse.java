package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteClusterPortResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_tenant_resource")

    private String deleteTenantResource;

    public DeleteClusterPortResponse withDeleteTenantResource(String deleteTenantResource) {
        this.deleteTenantResource = deleteTenantResource;
        return this;
    }

    /**
     * 删除资源结果
     * @return deleteTenantResource
     */
    public String getDeleteTenantResource() {
        return deleteTenantResource;
    }

    public void setDeleteTenantResource(String deleteTenantResource) {
        this.deleteTenantResource = deleteTenantResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteClusterPortResponse that = (DeleteClusterPortResponse) obj;
        return Objects.equals(this.deleteTenantResource, that.deleteTenantResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteTenantResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClusterPortResponse {\n");
        sb.append("    deleteTenantResource: ").append(toIndentedString(deleteTenantResource)).append("\n");
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
