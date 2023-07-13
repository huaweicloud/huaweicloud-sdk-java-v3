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
public class AppResponse {

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
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_versions")

    private List<AppVersionDetail> appVersions = null;

    public AppResponse withId(String id) {
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

    public AppResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用模板名称，只允许英文小写字母、数字、中划线，最大长度32， 英文小写字母或数字开头和结尾 Name为必填字段，且本租户中唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppResponse withAlias(String alias) {
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

    public AppResponse withDescription(String description) {
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

    public AppResponse withIconUrl(String iconUrl) {
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

    public AppResponse withCreatedAt(String createdAt) {
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

    public AppResponse withProjectId(String projectId) {
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

    public AppResponse withVisibility(String visibility) {
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

    public AppResponse withAppVersions(List<AppVersionDetail> appVersions) {
        this.appVersions = appVersions;
        return this;
    }

    public AppResponse addAppVersionsItem(AppVersionDetail appVersionsItem) {
        if (this.appVersions == null) {
            this.appVersions = new ArrayList<>();
        }
        this.appVersions.add(appVersionsItem);
        return this;
    }

    public AppResponse withAppVersions(Consumer<List<AppVersionDetail>> appVersionsSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppResponse that = (AppResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.description, that.description)
            && Objects.equals(this.iconUrl, that.iconUrl) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.appVersions, that.appVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, alias, description, iconUrl, createdAt, projectId, visibility, appVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
