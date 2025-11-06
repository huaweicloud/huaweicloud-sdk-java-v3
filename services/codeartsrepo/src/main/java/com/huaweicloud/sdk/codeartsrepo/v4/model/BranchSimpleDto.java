package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BranchSimpleDto
 */
public class BranchSimpleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_read")

    private Boolean canRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_download")

    private Boolean canDownload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_push")

    private Boolean canPush;

    public BranchSimpleDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分支名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BranchSimpleDto withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否为默认分支
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public BranchSimpleDto withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 用户是否为默认分支
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public BranchSimpleDto withCanRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }

    /**
     * 是否为默认分支
     * @return canRead
     */
    public Boolean getCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    public BranchSimpleDto withCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
        return this;
    }

    /**
     * 是否为默认分支
     * @return canDownload
     */
    public Boolean getCanDownload() {
        return canDownload;
    }

    public void setCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
    }

    public BranchSimpleDto withCanPush(Boolean canPush) {
        this.canPush = canPush;
        return this;
    }

    /**
     * 是否为默认分支
     * @return canPush
     */
    public Boolean getCanPush() {
        return canPush;
    }

    public void setCanPush(Boolean canPush) {
        this.canPush = canPush;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BranchSimpleDto that = (BranchSimpleDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this._default, that._default)
            && Objects.equals(this.canDelete, that.canDelete) && Objects.equals(this.canRead, that.canRead)
            && Objects.equals(this.canDownload, that.canDownload) && Objects.equals(this.canPush, that.canPush);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, _default, canDelete, canRead, canDownload, canPush);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchSimpleDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
        sb.append("    canDownload: ").append(toIndentedString(canDownload)).append("\n");
        sb.append("    canPush: ").append(toIndentedString(canPush)).append("\n");
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
