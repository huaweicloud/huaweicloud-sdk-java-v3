package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVirtualInterfaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_interface_id")

    private String virtualInterfaceId;

    public DeleteVirtualInterfaceRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * 虚拟接口ID。
     * @return virtualInterfaceId
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVirtualInterfaceRequest that = (DeleteVirtualInterfaceRequest) obj;
        return Objects.equals(this.virtualInterfaceId, that.virtualInterfaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualInterfaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVirtualInterfaceRequest {\n");
        sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
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
