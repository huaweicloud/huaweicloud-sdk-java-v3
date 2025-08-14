package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 沙箱类型，MYSQL、MYSQLCHEAT沙箱专用
 */
public class ContainerExtraMysqlInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_path")

    private String customPath;

    public ContainerExtraMysqlInfo withCustomPath(String customPath) {
        this.customPath = customPath;
        return this;
    }

    /**
     * 自定义反制路径
     * @return customPath
     */
    public String getCustomPath() {
        return customPath;
    }

    public void setCustomPath(String customPath) {
        this.customPath = customPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerExtraMysqlInfo that = (ContainerExtraMysqlInfo) obj;
        return Objects.equals(this.customPath, that.customPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerExtraMysqlInfo {\n");
        sb.append("    customPath: ").append(toIndentedString(customPath)).append("\n");
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
