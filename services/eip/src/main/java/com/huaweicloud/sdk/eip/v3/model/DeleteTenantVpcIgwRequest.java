package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTenantVpcIgwRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_igw_id")

    private String vpcIgwId;

    public DeleteTenantVpcIgwRequest withVpcIgwId(String vpcIgwId) {
        this.vpcIgwId = vpcIgwId;
        return this;
    }

    /**
     * 虚拟igw的uuid
     * @return vpcIgwId
     */
    public String getVpcIgwId() {
        return vpcIgwId;
    }

    public void setVpcIgwId(String vpcIgwId) {
        this.vpcIgwId = vpcIgwId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTenantVpcIgwRequest that = (DeleteTenantVpcIgwRequest) obj;
        return Objects.equals(this.vpcIgwId, that.vpcIgwId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcIgwId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTenantVpcIgwRequest {\n");
        sb.append("    vpcIgwId: ").append(toIndentedString(vpcIgwId)).append("\n");
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
