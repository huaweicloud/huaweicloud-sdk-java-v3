package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 待删除的用户/客户端流控配置
 */
public class DeleteKafkaUserClientQuotaTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user-default")

    private Boolean userDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client-default")

    private Boolean clientDefault;

    public DeleteKafkaUserClientQuotaTaskReq withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public DeleteKafkaUserClientQuotaTaskReq withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端ID
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public DeleteKafkaUserClientQuotaTaskReq withUserDefault(Boolean userDefault) {
        this.userDefault = userDefault;
        return this;
    }

    /**
     * 是否使用用户默认设置（是则表示对全部用户限流）。
     * @return userDefault
     */
    public Boolean getUserDefault() {
        return userDefault;
    }

    public void setUserDefault(Boolean userDefault) {
        this.userDefault = userDefault;
    }

    public DeleteKafkaUserClientQuotaTaskReq withClientDefault(Boolean clientDefault) {
        this.clientDefault = clientDefault;
        return this;
    }

    /**
     * 是否使用客户端默认设置（是则表示对全部客户端限流）。
     * @return clientDefault
     */
    public Boolean getClientDefault() {
        return clientDefault;
    }

    public void setClientDefault(Boolean clientDefault) {
        this.clientDefault = clientDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteKafkaUserClientQuotaTaskReq that = (DeleteKafkaUserClientQuotaTaskReq) obj;
        return Objects.equals(this.user, that.user) && Objects.equals(this.client, that.client)
            && Objects.equals(this.userDefault, that.userDefault)
            && Objects.equals(this.clientDefault, that.clientDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, client, userDefault, clientDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteKafkaUserClientQuotaTaskReq {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    userDefault: ").append(toIndentedString(userDefault)).append("\n");
        sb.append("    clientDefault: ").append(toIndentedString(clientDefault)).append("\n");
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
