package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VerifyHostV2Req
 */
public class VerifyHostV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public VerifyHostV2Req withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 主机端口
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public VerifyHostV2Req withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 主机账号
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public VerifyHostV2Req withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 主机密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public VerifyHostV2Req withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 华为云IAM组id，操作查询同组其他工单时，该id必传
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerifyHostV2Req that = (VerifyHostV2Req) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.account, that.account)
            && Objects.equals(this.password, that.password) && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, account, password, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyHostV2Req {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
