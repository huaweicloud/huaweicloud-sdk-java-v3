package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UrlDTO
 */
public class UrlDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contains")

    private Boolean contains;

    public UrlDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * url路径名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UrlDTO withContains(Boolean contains) {
        this.contains = contains;
        return this;
    }

    /**
     * 父权限集是否包含此权限, true包含, false不包含, null未检测
     * @return contains
     */
    public Boolean getContains() {
        return contains;
    }

    public void setContains(Boolean contains) {
        this.contains = contains;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlDTO that = (UrlDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.contains, that.contains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
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
