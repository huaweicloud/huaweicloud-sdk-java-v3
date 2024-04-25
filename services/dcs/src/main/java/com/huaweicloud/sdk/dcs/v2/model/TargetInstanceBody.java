package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目标实例信息。
 */
public class TargetInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addrs")

    private String addrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_multi_db")

    private Boolean proxyMultiDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private String db;

    public TargetInstanceBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Redis实例ID（target_instance信息中必须填写）。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TargetInstanceBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Redis实例名称(target_instance信息中填写)。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetInstanceBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Redis密码，如果设置了密码，则必须填写。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TargetInstanceBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Redis IP地址。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TargetInstanceBody withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * Redis端口。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public TargetInstanceBody withAddrs(String addrs) {
        this.addrs = addrs;
        return this;
    }

    /**
     * Redis实例地址。
     * @return addrs
     */
    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public TargetInstanceBody withProxyMultiDb(Boolean proxyMultiDb) {
        this.proxyMultiDb = proxyMultiDb;
        return this;
    }

    /**
     * proxy实例是否开启了多DB。
     * @return proxyMultiDb
     */
    public Boolean getProxyMultiDb() {
        return proxyMultiDb;
    }

    public void setProxyMultiDb(Boolean proxyMultiDb) {
        this.proxyMultiDb = proxyMultiDb;
    }

    public TargetInstanceBody withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * Redis数据库。
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetInstanceBody that = (TargetInstanceBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.password, that.password) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port) && Objects.equals(this.addrs, that.addrs)
            && Objects.equals(this.proxyMultiDb, that.proxyMultiDb) && Objects.equals(this.db, that.db);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, ip, port, addrs, proxyMultiDb, db);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetInstanceBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
        sb.append("    proxyMultiDb: ").append(toIndentedString(proxyMultiDb)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
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
