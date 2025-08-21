package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PermissionResourcesDto
 */
public class PermissionResourcesDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name_display")

    private String resourceNameDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name_cn_display")

    private String resourceNameCnDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public PermissionResourcesDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 资源id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PermissionResourcesDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PermissionResourcesDto withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * **参数解释：** 资源中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public PermissionResourcesDto withResourceNameDisplay(String resourceNameDisplay) {
        this.resourceNameDisplay = resourceNameDisplay;
        return this;
    }

    /**
     * **参数解释：** 禁用资源名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return resourceNameDisplay
     */
    public String getResourceNameDisplay() {
        return resourceNameDisplay;
    }

    public void setResourceNameDisplay(String resourceNameDisplay) {
        this.resourceNameDisplay = resourceNameDisplay;
    }

    public PermissionResourcesDto withResourceNameCnDisplay(String resourceNameCnDisplay) {
        this.resourceNameCnDisplay = resourceNameCnDisplay;
        return this;
    }

    /**
     * **参数解释：** 禁用资源中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return resourceNameCnDisplay
     */
    public String getResourceNameCnDisplay() {
        return resourceNameCnDisplay;
    }

    public void setResourceNameCnDisplay(String resourceNameCnDisplay) {
        this.resourceNameCnDisplay = resourceNameCnDisplay;
    }

    public PermissionResourcesDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 权限路径。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PermissionResourcesDto withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public PermissionResourcesDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public PermissionResourcesDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionResourcesDto that = (PermissionResourcesDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nameCn, that.nameCn)
            && Objects.equals(this.resourceNameDisplay, that.resourceNameDisplay)
            && Objects.equals(this.resourceNameCnDisplay, that.resourceNameCnDisplay)
            && Objects.equals(this.path, that.path) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, nameCn, resourceNameDisplay, resourceNameCnDisplay, path, scope, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionResourcesDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    resourceNameDisplay: ").append(toIndentedString(resourceNameDisplay)).append("\n");
        sb.append("    resourceNameCnDisplay: ").append(toIndentedString(resourceNameCnDisplay)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
