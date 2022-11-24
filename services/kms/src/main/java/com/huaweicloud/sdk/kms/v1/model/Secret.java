package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 凭据对象。
 */
public class Secret {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_delete_time")

    private Long scheduledDeleteTime;

    public Secret withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 凭据的资源标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Secret withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 凭据名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Secret withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 凭据状态，取值如下：  ENABLED：表示启用状态  DISABLED：表示禁用状态  PENDING_DELETE：表示待删除状态  FROZEN：表示冻结状态状态 
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Secret withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * 用于加密凭据值的KMS主密钥的ID值。 
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Secret withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 凭据的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Secret withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 凭据创建时间，时间戳，即从1970年1月1日至该时间的总秒数。 
     * minimum: 0
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Secret withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 凭据上次更新时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * minimum: 0
     * maximum: 13
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Secret withScheduledDeleteTime(Long scheduledDeleteTime) {
        this.scheduledDeleteTime = scheduledDeleteTime;
        return this;
    }

    /**
     * 凭据计划删除时间，时间戳，即从1970年1月1日至该时间的总秒数。  凭据不在删除计划中时，本项值为null。 
     * minimum: 0
     * maximum: 13
     * @return scheduledDeleteTime
     */
    public Long getScheduledDeleteTime() {
        return scheduledDeleteTime;
    }

    public void setScheduledDeleteTime(Long scheduledDeleteTime) {
        this.scheduledDeleteTime = scheduledDeleteTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Secret secret = (Secret) o;
        return Objects.equals(this.id, secret.id) && Objects.equals(this.name, secret.name)
            && Objects.equals(this.state, secret.state) && Objects.equals(this.kmsKeyId, secret.kmsKeyId)
            && Objects.equals(this.description, secret.description)
            && Objects.equals(this.createTime, secret.createTime) && Objects.equals(this.updateTime, secret.updateTime)
            && Objects.equals(this.scheduledDeleteTime, secret.scheduledDeleteTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, state, kmsKeyId, description, createTime, updateTime, scheduledDeleteTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Secret {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    scheduledDeleteTime: ").append(toIndentedString(scheduledDeleteTime)).append("\n");
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
