package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommandInfo
 */
public class CommandInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_name")

    private String originName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CommandInfo withOriginName(String originName) {
        this.originName = originName;
        return this;
    }

    /**
     * 原高危命令，当前支持的有：keys、flushdb、flushall、hgetall、hkeys、hvals、smembers
     * @return originName
     */
    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public CommandInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 当前生效的命令名称，当为空时表示命令禁用，允许修改为30个字符以内数字、字母和下划线的组合
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
        CommandInfo that = (CommandInfo) obj;
        return Objects.equals(this.originName, that.originName) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originName, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandInfo {\n");
        sb.append("    originName: ").append(toIndentedString(originName)).append("\n");
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
