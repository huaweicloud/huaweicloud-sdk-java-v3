package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * namespace基本信息
 */
public class NamespaceBasicDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private String developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cell")

    private String cell;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private Integer parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_level")

    private Integer visibilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_file_control")

    private Boolean enableFileControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private Integer ownerId;

    public NamespaceBasicDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * namespace id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NamespaceBasicDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * namespace name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamespaceBasicDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * namespace path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public NamespaceBasicDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * namespace 开发模式
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public NamespaceBasicDto withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * namespace region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public NamespaceBasicDto withCell(String cell) {
        this.cell = cell;
        return this;
    }

    /**
     * namespace cell
     * @return cell
     */
    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public NamespaceBasicDto withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * namespace kind
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public NamespaceBasicDto withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * namespace full path
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public NamespaceBasicDto withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * namespace full name
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public NamespaceBasicDto withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * namespace parent id
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public NamespaceBasicDto withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * namespace visibility level
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public NamespaceBasicDto withEnableFileControl(Boolean enableFileControl) {
        this.enableFileControl = enableFileControl;
        return this;
    }

    /**
     * namespace file control enable
     * @return enableFileControl
     */
    public Boolean getEnableFileControl() {
        return enableFileControl;
    }

    public void setEnableFileControl(Boolean enableFileControl) {
        this.enableFileControl = enableFileControl;
    }

    public NamespaceBasicDto withOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * namespace owner id
     * @return ownerId
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamespaceBasicDto that = (NamespaceBasicDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.path, that.path) && Objects.equals(this.developMode, that.developMode)
            && Objects.equals(this.region, that.region) && Objects.equals(this.cell, that.cell)
            && Objects.equals(this.kind, that.kind) && Objects.equals(this.fullPath, that.fullPath)
            && Objects.equals(this.fullName, that.fullName) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.visibilityLevel, that.visibilityLevel)
            && Objects.equals(this.enableFileControl, that.enableFileControl)
            && Objects.equals(this.ownerId, that.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            path,
            developMode,
            region,
            cell,
            kind,
            fullPath,
            fullName,
            parentId,
            visibilityLevel,
            enableFileControl,
            ownerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamespaceBasicDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    enableFileControl: ").append(toIndentedString(enableFileControl)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
