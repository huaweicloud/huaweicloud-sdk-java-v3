package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 上传jar类型分组资源请求body体。
 */
public class UploadGroupPackageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paths")

    @JacksonXmlProperty(localName = "paths")

    private List<String> paths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    @JacksonXmlProperty(localName = "group")

    private String group;

    public UploadGroupPackageReq withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    public UploadGroupPackageReq addPathsItem(String pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    public UploadGroupPackageReq withPaths(Consumer<List<String>> pathsSetter) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        pathsSetter.accept(this.paths);
        return this;
    }

    /**
     * 用户OBS对象路径列表，OBS对象路径为OBS对象URL。
     * @return paths
     */
    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public UploadGroupPackageReq withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 所属资源分组名。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadGroupPackageReq uploadGroupPackageReq = (UploadGroupPackageReq) o;
        return Objects.equals(this.paths, uploadGroupPackageReq.paths)
            && Objects.equals(this.group, uploadGroupPackageReq.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paths, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadGroupPackageReq {\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
