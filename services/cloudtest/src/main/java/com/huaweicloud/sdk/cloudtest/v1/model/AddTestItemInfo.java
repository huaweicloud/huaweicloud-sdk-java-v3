package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddTestItemInfo
 */
public class AddTestItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_feature")

    private String isFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_duplicate_name")

    private Boolean ignoreDuplicateName;

    public AddTestItemInfo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public AddTestItemInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddTestItemInfo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AddTestItemInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AddTestItemInfo withIsFeature(String isFeature) {
        this.isFeature = isFeature;
        return this;
    }

    /**
     * 是否为特性,1:特性 2:目录
     * @return isFeature
     */
    public String getIsFeature() {
        return isFeature;
    }

    public void setIsFeature(String isFeature) {
        this.isFeature = isFeature;
    }

    public AddTestItemInfo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目uuid
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public AddTestItemInfo withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 父节点uri
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public AddTestItemInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本URI
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public AddTestItemInfo withIgnoreDuplicateName(Boolean ignoreDuplicateName) {
        this.ignoreDuplicateName = ignoreDuplicateName;
        return this;
    }

    /**
     * 是否忽略名称重复
     * @return ignoreDuplicateName
     */
    public Boolean getIgnoreDuplicateName() {
        return ignoreDuplicateName;
    }

    public void setIgnoreDuplicateName(Boolean ignoreDuplicateName) {
        this.ignoreDuplicateName = ignoreDuplicateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTestItemInfo that = (AddTestItemInfo) obj;
        return Objects.equals(this.comment, that.comment) && Objects.equals(this.name, that.name)
            && Objects.equals(this.number, that.number) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.isFeature, that.isFeature) && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.parentUri, that.parentUri) && Objects.equals(this.versionUri, that.versionUri)
            && Objects.equals(this.ignoreDuplicateName, that.ignoreDuplicateName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(comment, name, number, owner, isFeature, projectUuid, parentUri, versionUri, ignoreDuplicateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTestItemInfo {\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    isFeature: ").append(toIndentedString(isFeature)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    ignoreDuplicateName: ").append(toIndentedString(ignoreDuplicateName)).append("\n");
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
