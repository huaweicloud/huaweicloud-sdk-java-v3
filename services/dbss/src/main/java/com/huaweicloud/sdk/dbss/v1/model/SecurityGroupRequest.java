package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityGroupRequest
 */
public class SecurityGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securitygroup_ids")

    private List<String> securitygroupIds = null;

    public SecurityGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。可在查询实例列表接口的ID字段获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SecurityGroupRequest withSecuritygroupIds(List<String> securitygroupIds) {
        this.securitygroupIds = securitygroupIds;
        return this;
    }

    public SecurityGroupRequest addSecuritygroupIdsItem(String securitygroupIdsItem) {
        if (this.securitygroupIds == null) {
            this.securitygroupIds = new ArrayList<>();
        }
        this.securitygroupIds.add(securitygroupIdsItem);
        return this;
    }

    public SecurityGroupRequest withSecuritygroupIds(Consumer<List<String>> securitygroupIdsSetter) {
        if (this.securitygroupIds == null) {
            this.securitygroupIds = new ArrayList<>();
        }
        securitygroupIdsSetter.accept(this.securitygroupIds);
        return this;
    }

    /**
     * 安全组ID列表(目前只支持传一个ID)
     * @return securitygroupIds
     */
    public List<String> getSecuritygroupIds() {
        return securitygroupIds;
    }

    public void setSecuritygroupIds(List<String> securitygroupIds) {
        this.securitygroupIds = securitygroupIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityGroupRequest that = (SecurityGroupRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.securitygroupIds, that.securitygroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, securitygroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    securitygroupIds: ").append(toIndentedString(securitygroupIds)).append("\n");
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
