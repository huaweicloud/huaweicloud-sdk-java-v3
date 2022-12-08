package com.huaweicloud.sdk.mapds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CredentialsRespCredentials
 */
public class CredentialsRespCredentials {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CredentialsRespCredentials withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 凭证id
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CredentialsRespCredentials withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 凭证value
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CredentialsRespCredentials withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 凭证创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CredentialsRespCredentials withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 凭证描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CredentialsRespCredentials withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 凭证状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CredentialsRespCredentials credentialsRespCredentials = (CredentialsRespCredentials) o;
        return Objects.equals(this.uuid, credentialsRespCredentials.uuid)
            && Objects.equals(this.key, credentialsRespCredentials.key)
            && Objects.equals(this.createTime, credentialsRespCredentials.createTime)
            && Objects.equals(this.description, credentialsRespCredentials.description)
            && Objects.equals(this.status, credentialsRespCredentials.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, key, createTime, description, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialsRespCredentials {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
