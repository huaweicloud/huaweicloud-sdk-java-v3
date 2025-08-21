package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TreeObjectDto
 */
public class TreeObjectDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submodule_link")

    private String submoduleLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submodule_branch")

    private String submoduleBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    private String md5;

    public TreeObjectDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 文件唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TreeObjectDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 文件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeObjectDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TreeObjectDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TreeObjectDto withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 模式结构
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public TreeObjectDto withSubmoduleLink(String submoduleLink) {
        this.submoduleLink = submoduleLink;
        return this;
    }

    /**
     * 子模块链接
     * @return submoduleLink
     */
    public String getSubmoduleLink() {
        return submoduleLink;
    }

    public void setSubmoduleLink(String submoduleLink) {
        this.submoduleLink = submoduleLink;
    }

    public TreeObjectDto withSubmoduleBranch(String submoduleBranch) {
        this.submoduleBranch = submoduleBranch;
        return this;
    }

    /**
     * 子模块分支
     * @return submoduleBranch
     */
    public String getSubmoduleBranch() {
        return submoduleBranch;
    }

    public void setSubmoduleBranch(String submoduleBranch) {
        this.submoduleBranch = submoduleBranch;
    }

    public TreeObjectDto withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * md5值
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TreeObjectDto that = (TreeObjectDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.path, that.path)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.submoduleLink, that.submoduleLink)
            && Objects.equals(this.submoduleBranch, that.submoduleBranch) && Objects.equals(this.md5, that.md5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, path, mode, submoduleLink, submoduleBranch, md5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TreeObjectDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    submoduleLink: ").append(toIndentedString(submoduleLink)).append("\n");
        sb.append("    submoduleBranch: ").append(toIndentedString(submoduleBranch)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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
