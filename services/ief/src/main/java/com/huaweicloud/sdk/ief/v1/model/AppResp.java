package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用模板配置
 */
public class AppResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_versions")

    private List<AppVersionDetail> appVersions = null;

    public AppResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用模板ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用模板名称，只允许英文小写字母、数字、中划线，最大长度32, 英文小写字母或数字开头和结尾 Name为必填字段，且本租户中唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppResp withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 应用模板别名，中文英文字母、数字、中划线、下划线，最大64字符
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public AppResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用模板描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppResp withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * 应用图标存储url地址，最大长度2083
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public AppResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public AppResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AppResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AppResp withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 模板类型
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public AppResp withAppVersions(List<AppVersionDetail> appVersions) {
        this.appVersions = appVersions;
        return this;
    }

    public AppResp addAppVersionsItem(AppVersionDetail appVersionsItem) {
        if (this.appVersions == null) {
            this.appVersions = new ArrayList<>();
        }
        this.appVersions.add(appVersionsItem);
        return this;
    }

    public AppResp withAppVersions(Consumer<List<AppVersionDetail>> appVersionsSetter) {
        if (this.appVersions == null) {
            this.appVersions = new ArrayList<>();
        }
        appVersionsSetter.accept(this.appVersions);
        return this;
    }

    /**
     * app详情
     * @return appVersions
     */
    public List<AppVersionDetail> getAppVersions() {
        return appVersions;
    }

    public void setAppVersions(List<AppVersionDetail> appVersions) {
        this.appVersions = appVersions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppResp appResp = (AppResp) o;
        return Objects.equals(this.id, appResp.id) && Objects.equals(this.name, appResp.name)
            && Objects.equals(this.alias, appResp.alias) && Objects.equals(this.description, appResp.description)
            && Objects.equals(this.iconUrl, appResp.iconUrl) && Objects.equals(this.createdAt, appResp.createdAt)
            && Objects.equals(this.updatedAt, appResp.updatedAt) && Objects.equals(this.projectId, appResp.projectId)
            && Objects.equals(this.visibility, appResp.visibility)
            && Objects.equals(this.appVersions, appResp.appVersions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, alias, description, iconUrl, createdAt, updatedAt, projectId, visibility, appVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    appVersions: ").append(toIndentedString(appVersions)).append("\n");
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
