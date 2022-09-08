package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteApiAclBindingV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_bindings_id")

    private String aclBindingsId;

    public DeleteApiAclBindingV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteApiAclBindingV2Request withAclBindingsId(String aclBindingsId) {
        this.aclBindingsId = aclBindingsId;
        return this;
    }

    /**
     * 绑定关系编号
     * @return aclBindingsId
     */
    public String getAclBindingsId() {
        return aclBindingsId;
    }

    public void setAclBindingsId(String aclBindingsId) {
        this.aclBindingsId = aclBindingsId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteApiAclBindingV2Request deleteApiAclBindingV2Request = (DeleteApiAclBindingV2Request) o;
        return Objects.equals(this.instanceId, deleteApiAclBindingV2Request.instanceId)
            && Objects.equals(this.aclBindingsId, deleteApiAclBindingV2Request.aclBindingsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, aclBindingsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteApiAclBindingV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    aclBindingsId: ").append(toIndentedString(aclBindingsId)).append("\n");
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
