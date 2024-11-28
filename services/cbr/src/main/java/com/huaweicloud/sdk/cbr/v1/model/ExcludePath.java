package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExcludePath
 */
public class ExcludePath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_name")

    private String pathName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_path_name")

    private List<String> excludePathName = null;

    public ExcludePath withPathName(String pathName) {
        this.pathName = pathName;
        return this;
    }

    /**
     * 备份目录
     * @return pathName
     */
    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public ExcludePath withExcludePathName(List<String> excludePathName) {
        this.excludePathName = excludePathName;
        return this;
    }

    public ExcludePath addExcludePathNameItem(String excludePathNameItem) {
        if (this.excludePathName == null) {
            this.excludePathName = new ArrayList<>();
        }
        this.excludePathName.add(excludePathNameItem);
        return this;
    }

    public ExcludePath withExcludePathName(Consumer<List<String>> excludePathNameSetter) {
        if (this.excludePathName == null) {
            this.excludePathName = new ArrayList<>();
        }
        excludePathNameSetter.accept(this.excludePathName);
        return this;
    }

    /**
     * 排除目录列表
     * @return excludePathName
     */
    public List<String> getExcludePathName() {
        return excludePathName;
    }

    public void setExcludePathName(List<String> excludePathName) {
        this.excludePathName = excludePathName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExcludePath that = (ExcludePath) obj;
        return Objects.equals(this.pathName, that.pathName)
            && Objects.equals(this.excludePathName, that.excludePathName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathName, excludePathName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExcludePath {\n");
        sb.append("    pathName: ").append(toIndentedString(pathName)).append("\n");
        sb.append("    excludePathName: ").append(toIndentedString(excludePathName)).append("\n");
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
