package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteAclV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_id")

    private String aclId;

    public DeleteAclV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteAclV2Request withAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }

    /** ACL策略的编号
     * 
     * @return aclId */
    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAclV2Request deleteAclV2Request = (DeleteAclV2Request) o;
        return Objects.equals(this.instanceId, deleteAclV2Request.instanceId)
            && Objects.equals(this.aclId, deleteAclV2Request.aclId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, aclId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAclV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
