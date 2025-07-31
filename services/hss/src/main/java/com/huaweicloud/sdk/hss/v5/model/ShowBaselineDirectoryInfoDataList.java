package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowBaselineDirectoryInfoDataList
 */
public class ShowBaselineDirectoryInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public ShowBaselineDirectoryInfoDataList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 根据select_type不同的值，得到不同的含义 - 当select_type为check_type，该字段代表tag（基线检查项的类型） - 当select_type为tag，该字段代表check_type（基线的名称）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBaselineDirectoryInfoDataList withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 该项是否被选中
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaselineDirectoryInfoDataList that = (ShowBaselineDirectoryInfoDataList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaselineDirectoryInfoDataList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
