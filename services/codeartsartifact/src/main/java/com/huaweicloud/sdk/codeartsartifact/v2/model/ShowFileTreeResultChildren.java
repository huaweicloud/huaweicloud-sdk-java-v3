package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowFileTreeResultChildren
 */
public class ShowFileTreeResultChildren {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified")

    private String modified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder")

    private Boolean folder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_child")

    private Boolean hasChild;

    public ShowFileTreeResultChildren withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 文件或文件夹名称。 **取值范围**: 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowFileTreeResultChildren withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**: 访问地址。 **取值范围**: 不涉及。 
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ShowFileTreeResultChildren withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: 路径。 **取值范围**: 不涉及。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowFileTreeResultChildren withModified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
     * **参数解释**: 更新时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**: 不涉及。 
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public ShowFileTreeResultChildren withFolder(Boolean folder) {
        this.folder = folder;
        return this;
    }

    /**
     * **参数解释**: 是否为文件夹。 **取值范围**: true：文件夹。 false：文件。 
     * @return folder
     */
    public Boolean getFolder() {
        return folder;
    }

    public void setFolder(Boolean folder) {
        this.folder = folder;
    }

    public ShowFileTreeResultChildren withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * **参数解释**: 修改人。 **取值范围**: 不涉及。 
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ShowFileTreeResultChildren withHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
        return this;
    }

    /**
     * **参数解释**: 是否存在下一层。 **取值范围**: true：是。 false：否。 
     * @return hasChild
     */
    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFileTreeResultChildren that = (ShowFileTreeResultChildren) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.uri, that.uri)
            && Objects.equals(this.path, that.path) && Objects.equals(this.modified, that.modified)
            && Objects.equals(this.folder, that.folder) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.hasChild, that.hasChild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uri, path, modified, folder, modifiedBy, hasChild);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFileTreeResultChildren {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    hasChild: ").append(toIndentedString(hasChild)).append("\n");
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
