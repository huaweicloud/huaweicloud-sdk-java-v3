package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 提供关于IAM身份中心实例的信息
 */
public class InstanceMetadataEntryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_urn")

    private String instanceUrn;

    public InstanceMetadataEntryDto withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * 关联到IAM身份中心实例的身份源的全局唯一标识符（ID）
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    public InstanceMetadataEntryDto withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * IAM身份中心实例的全局唯一标识符（ID）
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceMetadataEntryDto withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 用户为身份源标识符定义的别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public InstanceMetadataEntryDto withInstanceUrn(String instanceUrn) {
        this.instanceUrn = instanceUrn;
        return this;
    }

    /**
     * 实例的统一资源名称（URN）
     * @return instanceUrn
     */
    public String getInstanceUrn() {
        return instanceUrn;
    }

    public void setInstanceUrn(String instanceUrn) {
        this.instanceUrn = instanceUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceMetadataEntryDto that = (InstanceMetadataEntryDto) obj;
        return Objects.equals(this.identityStoreId, that.identityStoreId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.instanceUrn, that.instanceUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityStoreId, instanceId, alias, instanceUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceMetadataEntryDto {\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    instanceUrn: ").append(toIndentedString(instanceUrn)).append("\n");
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
