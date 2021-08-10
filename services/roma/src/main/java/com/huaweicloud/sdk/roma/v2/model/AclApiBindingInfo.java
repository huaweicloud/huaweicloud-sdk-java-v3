package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** AclApiBindingInfo */
public class AclApiBindingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_id")

    private String aclId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public AclApiBindingInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** 绑定关系编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AclApiBindingInfo withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /** API编号
     * 
     * @return apiId */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public AclApiBindingInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /** 环境编号
     * 
     * @return envId */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public AclApiBindingInfo withAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }

    /** ACL策略编号
     * 
     * @return aclId */
    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public AclApiBindingInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 绑定时间
     * 
     * @return createTime */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AclApiBindingInfo aclApiBindingInfo = (AclApiBindingInfo) o;
        return Objects.equals(this.id, aclApiBindingInfo.id) && Objects.equals(this.apiId, aclApiBindingInfo.apiId)
            && Objects.equals(this.envId, aclApiBindingInfo.envId)
            && Objects.equals(this.aclId, aclApiBindingInfo.aclId)
            && Objects.equals(this.createTime, aclApiBindingInfo.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiId, envId, aclId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclApiBindingInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
