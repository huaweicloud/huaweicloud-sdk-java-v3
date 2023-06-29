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
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securitygroup_ids")

    private List<String> securitygroupIds = null;

    public SecurityGroupRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
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
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.securitygroupIds, that.securitygroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, securitygroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
