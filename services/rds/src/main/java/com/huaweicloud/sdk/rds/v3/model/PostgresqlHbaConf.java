package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PostgresqlHbaConf
 */
public class PostgresqlHbaConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask")

    private String mask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public PostgresqlHbaConf withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 连接类型，枚举，host、hostssl、hostnossl
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PostgresqlHbaConf withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名，除template0，template1的数据库名，多个以逗号隔开
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public PostgresqlHbaConf withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名，all，除内置用户（rdsAdmin, rdsMetric, rdsBackup, rdsRepl, rdsProxy）以外，多个以逗号隔开
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public PostgresqlHbaConf withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 客户端IP地址。0.0.0.0/0表示允许用户从任意IP地址访问数据库
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PostgresqlHbaConf withMask(String mask) {
        this.mask = mask;
        return this;
    }

    /**
     * 掩码，默认为空字符串
     * @return mask
     */
    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public PostgresqlHbaConf withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 认证方式。枚举：reject、md5、scram-sha-256
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public PostgresqlHbaConf withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级，表示配置的先后
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgresqlHbaConf that = (PostgresqlHbaConf) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.database, that.database)
            && Objects.equals(this.user, that.user) && Objects.equals(this.address, that.address)
            && Objects.equals(this.mask, that.mask) && Objects.equals(this.method, that.method)
            && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, database, user, address, mask, method, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlHbaConf {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
