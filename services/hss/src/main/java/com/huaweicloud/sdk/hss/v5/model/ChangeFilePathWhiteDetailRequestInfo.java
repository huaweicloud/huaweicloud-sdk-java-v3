package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像的敏感信息文件路径白名单
 */
public class ChangeFilePathWhiteDetailRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customized_path")

    private List<String> customizedPath = null;

    public ChangeFilePathWhiteDetailRequestInfo withCustomizedPath(List<String> customizedPath) {
        this.customizedPath = customizedPath;
        return this;
    }

    public ChangeFilePathWhiteDetailRequestInfo addCustomizedPathItem(String customizedPathItem) {
        if (this.customizedPath == null) {
            this.customizedPath = new ArrayList<>();
        }
        this.customizedPath.add(customizedPathItem);
        return this;
    }

    public ChangeFilePathWhiteDetailRequestInfo withCustomizedPath(Consumer<List<String>> customizedPathSetter) {
        if (this.customizedPath == null) {
            this.customizedPath = new ArrayList<>();
        }
        customizedPathSetter.accept(this.customizedPath);
        return this;
    }

    /**
     * 自定义路径，选填，可编辑
     * @return customizedPath
     */
    public List<String> getCustomizedPath() {
        return customizedPath;
    }

    public void setCustomizedPath(List<String> customizedPath) {
        this.customizedPath = customizedPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeFilePathWhiteDetailRequestInfo that = (ChangeFilePathWhiteDetailRequestInfo) obj;
        return Objects.equals(this.customizedPath, that.customizedPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customizedPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeFilePathWhiteDetailRequestInfo {\n");
        sb.append("    customizedPath: ").append(toIndentedString(customizedPath)).append("\n");
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
