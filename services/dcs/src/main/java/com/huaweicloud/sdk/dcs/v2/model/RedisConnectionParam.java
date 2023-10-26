package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Redis连接参数
 */
public class RedisConnectionParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addrs")

    private String addrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public RedisConnectionParam withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RedisConnectionParam withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RedisConnectionParam withAddrs(String addrs) {
        this.addrs = addrs;
        return this;
    }

    /**
     * 地址
     * @return addrs
     */
    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public RedisConnectionParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisConnectionParam that = (RedisConnectionParam) obj;
        return Objects.equals(this.password, that.password) && Objects.equals(this.id, that.id)
            && Objects.equals(this.addrs, that.addrs) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, id, addrs, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisConnectionParam {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
