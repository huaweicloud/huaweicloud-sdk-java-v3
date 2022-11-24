package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteIpAddressGroupForceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group_id")

    private String addressGroupId;

    public DeleteIpAddressGroupForceRequest withAddressGroupId(String addressGroupId) {
        this.addressGroupId = addressGroupId;
        return this;
    }

    /**
     * IP地址组的唯一标识，要删除的IP地址组ID
     * @return addressGroupId
     */
    public String getAddressGroupId() {
        return addressGroupId;
    }

    public void setAddressGroupId(String addressGroupId) {
        this.addressGroupId = addressGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteIpAddressGroupForceRequest deleteIpAddressGroupForceRequest = (DeleteIpAddressGroupForceRequest) o;
        return Objects.equals(this.addressGroupId, deleteIpAddressGroupForceRequest.addressGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteIpAddressGroupForceRequest {\n");
        sb.append("    addressGroupId: ").append(toIndentedString(addressGroupId)).append("\n");
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
