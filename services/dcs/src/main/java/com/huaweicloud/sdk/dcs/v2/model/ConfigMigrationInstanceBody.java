package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 迁移任务实例信息
 */
public class ConfigMigrationInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addrs")

    @JacksonXmlProperty(localName = "addrs")

    private String addrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    @JacksonXmlProperty(localName = "password")

    private String password;

    public ConfigMigrationInstanceBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Redis实例ID。（Redis类型为云服务Redis时必须填写）
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfigMigrationInstanceBody withAddrs(String addrs) {
        this.addrs = addrs;
        return this;
    }

    /**
     * Redis实例地址。（Redis类型为自建Redis时必须填写）。
     * @return addrs
     */
    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public ConfigMigrationInstanceBody withPassword(String password) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigMigrationInstanceBody configMigrationInstanceBody = (ConfigMigrationInstanceBody) o;
        return Objects.equals(this.id, configMigrationInstanceBody.id)
            && Objects.equals(this.addrs, configMigrationInstanceBody.addrs)
            && Objects.equals(this.password, configMigrationInstanceBody.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addrs, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigMigrationInstanceBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
