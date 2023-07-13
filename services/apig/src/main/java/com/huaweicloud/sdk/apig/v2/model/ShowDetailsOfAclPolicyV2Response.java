package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDetailsOfAclPolicyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_name")

    private String aclName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_type")

    private String aclType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_value")

    private String aclValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_type")

    private String entityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public ShowDetailsOfAclPolicyV2Response withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    /**
     * 名称
     * @return aclName
     */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public ShowDetailsOfAclPolicyV2Response withAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }

    /**
     * 类型: - PERMIT（白名单类型） - DENY（黑名单类型）
     * @return aclType
     */
    public String getAclType() {
        return aclType;
    }

    public void setAclType(String aclType) {
        this.aclType = aclType;
    }

    public ShowDetailsOfAclPolicyV2Response withAclValue(String aclValue) {
        this.aclValue = aclValue;
        return this;
    }

    /**
     * ACL策略值
     * @return aclValue
     */
    public String getAclValue() {
        return aclValue;
    }

    public void setAclValue(String aclValue) {
        this.aclValue = aclValue;
    }

    public ShowDetailsOfAclPolicyV2Response withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 对象类型： - IP - DOMAIN - DOMAIN_ID
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public ShowDetailsOfAclPolicyV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDetailsOfAclPolicyV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDetailsOfAclPolicyV2Response that = (ShowDetailsOfAclPolicyV2Response) obj;
        return Objects.equals(this.aclName, that.aclName) && Objects.equals(this.aclType, that.aclType)
            && Objects.equals(this.aclValue, that.aclValue) && Objects.equals(this.entityType, that.entityType)
            && Objects.equals(this.id, that.id) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclName, aclType, aclValue, entityType, id, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfAclPolicyV2Response {\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
        sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
        sb.append("    aclValue: ").append(toIndentedString(aclValue)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
