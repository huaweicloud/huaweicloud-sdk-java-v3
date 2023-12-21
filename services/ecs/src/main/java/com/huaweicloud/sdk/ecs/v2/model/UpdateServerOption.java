package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新云服务器Body体。
 */
public class UpdateServerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    public UpdateServerOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 修改后的云服务器名称。  只能由中文字符、英文字母、数字及“_”、“-”、“.”组成，且长度为[1-64]个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateServerOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对弹性云服务器的任意描述。  不能包含“<”,“>”，且长度范围为[0-85]个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateServerOption withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 修改云服务hostname。  命令规范：长度为 [1-64] 个字符，允许使用点号(.)分隔字符成多段，每段允许使用大小写字母、数字或连字符(-)，但不能连续使用点号(.)或连字符(-),不能以点号(.)或连字符(-)开头或结尾，不能出现（.-）和（-.）。
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public UpdateServerOption withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 修改云服务器云主机过程中待注入实例自定义数据。支持注入文本、文本文件。  示例：  base64编码前：   Linux服务器：     #!/bin/bash     echo user_test > /home/user.txt   Windows服务器：     rem cmd     echo 111 > c:\\aaa.txt  base64编码后：   Linux服务器：IyEvYmluL2Jhc2gKZWNobyB1c2VyX3Rlc3QgPiAvaG9tZS91c2VyLnR4dA==   Windows服务器：cmVtIGNtZA0KZWNobyAxMTEgJmd0OyBjOlxhYWEudHh0
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerOption that = (UpdateServerOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.hostname, that.hostname) && Objects.equals(this.userData, that.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, hostname, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
