package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserPolicyResponeEntity
 */
public class UserPolicyResponeEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern_type")

    private String patternType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    private String accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_permission_type")

    private String aclPermissionType;

    public UserPolicyResponeEntity withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数解释**： 资源类型。 **取值范围**： - TOPIC：表示资源类型为Topic。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UserPolicyResponeEntity withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释**： 资源名称。 **取值范围**： - 已有的Topic名称。 - 符合Topic名称规则的前缀。 - “*”表示匹配所有的Topic。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public UserPolicyResponeEntity withPatternType(String patternType) {
        this.patternType = patternType;
        return this;
    }

    /**
     * **参数解释**： 匹配方式。 **取值范围**： - LITERAL：完全匹配。 - PREFIXED：前缀匹配。
     * @return patternType
     */
    public String getPatternType() {
        return patternType;
    }

    public void setPatternType(String patternType) {
        this.patternType = patternType;
    }

    public UserPolicyResponeEntity withAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * **参数解释**： 权限类型。 **取值范围**： - all：拥有发布、订阅权限。 - pub：拥有发布权限。 - sub：拥有订阅权限。
     * @return accessPolicy
     */
    public String getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public UserPolicyResponeEntity withAclPermissionType(String aclPermissionType) {
        this.aclPermissionType = aclPermissionType;
        return this;
    }

    /**
     * **参数解释**： Acl权限类型。 **取值范围**： - ALLOW：允许用户进行某种操作。
     * @return aclPermissionType
     */
    public String getAclPermissionType() {
        return aclPermissionType;
    }

    public void setAclPermissionType(String aclPermissionType) {
        this.aclPermissionType = aclPermissionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserPolicyResponeEntity that = (UserPolicyResponeEntity) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.patternType, that.patternType)
            && Objects.equals(this.accessPolicy, that.accessPolicy)
            && Objects.equals(this.aclPermissionType, that.aclPermissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceName, patternType, accessPolicy, aclPermissionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPolicyResponeEntity {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    aclPermissionType: ").append(toIndentedString(aclPermissionType)).append("\n");
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
