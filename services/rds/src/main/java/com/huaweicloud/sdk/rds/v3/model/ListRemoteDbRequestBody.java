package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询远程SQL Server数据库请求参数。
 */
public class ListRemoteDbRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_port")

    private String serverPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user_name")

    private String loginUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user_password")

    private String loginUserPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRemoteDbRequestBody withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * 服务器ip。
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public ListRemoteDbRequestBody withServerPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * 端口号。
     * @return serverPort
     */
    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public ListRemoteDbRequestBody withLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
        return this;
    }

    /**
     * 登录名。
     * @return loginUserName
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public ListRemoteDbRequestBody withLoginUserPassword(String loginUserPassword) {
        this.loginUserPassword = loginUserPassword;
        return this;
    }

    /**
     * 登录密码。要求密码长度在5~64位之间。
     * @return loginUserPassword
     */
    public String getLoginUserPassword() {
        return loginUserPassword;
    }

    public void setLoginUserPassword(String loginUserPassword) {
        this.loginUserPassword = loginUserPassword;
    }

    public ListRemoteDbRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRemoteDbRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为10，不能为负数，最小值为1，最大值为100。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRemoteDbRequestBody that = (ListRemoteDbRequestBody) obj;
        return Objects.equals(this.serverIp, that.serverIp) && Objects.equals(this.serverPort, that.serverPort)
            && Objects.equals(this.loginUserName, that.loginUserName)
            && Objects.equals(this.loginUserPassword, that.loginUserPassword)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIp, serverPort, loginUserName, loginUserPassword, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRemoteDbRequestBody {\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    loginUserName: ").append(toIndentedString(loginUserName)).append("\n");
        sb.append("    loginUserPassword: ").append(toIndentedString(loginUserPassword)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
