package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Tag
 */
public class Tag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_double_name")

    private Boolean isDoubleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public Tag withIsDoubleName(Boolean isDoubleName) {
        this.isDoubleName = isDoubleName;
        return this;
    }

    /**
     * 是否与分支重名
     * @return isDoubleName
     */
    public Boolean getIsDoubleName() {
        return isDoubleName;
    }

    public void setIsDoubleName(Boolean isDoubleName) {
        this.isDoubleName = isDoubleName;
    }

    public Tag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 标签名
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
        Tag that = (Tag) obj;
        return Objects.equals(this.isDoubleName, that.isDoubleName) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDoubleName, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        sb.append("    isDoubleName: ").append(toIndentedString(isDoubleName)).append("\n");
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
