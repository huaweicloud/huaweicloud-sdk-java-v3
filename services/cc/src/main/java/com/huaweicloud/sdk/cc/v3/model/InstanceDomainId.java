package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络实例（VPC，VGW）所属账号ID。
 */
public class InstanceDomainId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_domain_id")

    private String instanceDomainId;

    public InstanceDomainId withInstanceDomainId(String instanceDomainId) {
        this.instanceDomainId = instanceDomainId;
        return this;
    }

    /**
     * 网络实例（VPC，VGW）所属账号ID。
     * @return instanceDomainId
     */
    public String getInstanceDomainId() {
        return instanceDomainId;
    }

    public void setInstanceDomainId(String instanceDomainId) {
        this.instanceDomainId = instanceDomainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDomainId that = (InstanceDomainId) obj;
        return Objects.equals(this.instanceDomainId, that.instanceDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDomainId {\n");
        sb.append("    instanceDomainId: ").append(toIndentedString(instanceDomainId)).append("\n");
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
