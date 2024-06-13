package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 套餐用量信息
 */
public class PackageUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_percent")

    private Integer usedPercent;

    public PackageUsage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 套餐类型
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageUsage withUsedPercent(Integer usedPercent) {
        this.usedPercent = usedPercent;
        return this;
    }

    /**
     * 套餐用量
     * @return usedPercent
     */
    public Integer getUsedPercent() {
        return usedPercent;
    }

    public void setUsedPercent(Integer usedPercent) {
        this.usedPercent = usedPercent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageUsage that = (PackageUsage) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.usedPercent, that.usedPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, usedPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageUsage {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    usedPercent: ").append(toIndentedString(usedPercent)).append("\n");
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
