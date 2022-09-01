package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 上传分组资源的请求body体。
 */
public class UploadPackageGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paths")

    @JacksonXmlProperty(localName = "paths")

    private List<String> paths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    @JacksonXmlProperty(localName = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    @JacksonXmlProperty(localName = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    @JacksonXmlProperty(localName = "is_async")

    private Boolean isAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<JobsTags> tags = null;

    public UploadPackageGroupReq withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    public UploadPackageGroupReq addPathsItem(String pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    public UploadPackageGroupReq withPaths(Consumer<List<String>> pathsSetter) {
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

    public UploadPackageGroupReq withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 分组资源文件的类型。 说明：上传的同一组资源包含不同文件类型时，均选择“file”类型作为这次上传文件的类型。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public UploadPackageGroupReq withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 将要创建的分组名。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public UploadPackageGroupReq withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * 是否异步上传资源包
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public UploadPackageGroupReq withTags(List<JobsTags> tags) {
        this.tags = tags;
        return this;
    }

    public UploadPackageGroupReq addTagsItem(JobsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UploadPackageGroupReq withTags(Consumer<List<JobsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签。具体请参考表tags。
     * @return tags
     */
    public List<JobsTags> getTags() {
        return tags;
    }

    public void setTags(List<JobsTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadPackageGroupReq uploadPackageGroupReq = (UploadPackageGroupReq) o;
        return Objects.equals(this.paths, uploadPackageGroupReq.paths)
            && Objects.equals(this.kind, uploadPackageGroupReq.kind)
            && Objects.equals(this.group, uploadPackageGroupReq.group)
            && Objects.equals(this.isAsync, uploadPackageGroupReq.isAsync)
            && Objects.equals(this.tags, uploadPackageGroupReq.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paths, kind, group, isAsync, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadPackageGroupReq {\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
