package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourcePermissionDto
 */
public class ResourcePermissionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_id")

    private Integer permissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name_cn")

    private String displayNameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Boolean editable;

    public ResourcePermissionDto withPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * **参数解释：** 记录id。
     * minimum: 1
     * maximum: 2147483647
     * @return permissionId
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public ResourcePermissionDto withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 操作。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ResourcePermissionDto withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释：** 操作名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ResourcePermissionDto withDisplayNameCn(String displayNameCn) {
        this.displayNameCn = displayNameCn;
        return this;
    }

    /**
     * **参数解释：** 操作中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return displayNameCn
     */
    public String getDisplayNameCn() {
        return displayNameCn;
    }

    public void setDisplayNameCn(String displayNameCn) {
        this.displayNameCn = displayNameCn;
    }

    public ResourcePermissionDto withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ResourcePermissionDto withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * **参数解释：** 是否编辑。
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcePermissionDto that = (ResourcePermissionDto) obj;
        return Objects.equals(this.permissionId, that.permissionId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.displayNameCn, that.displayNameCn) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.editable, that.editable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, action, displayName, displayNameCn, enabled, editable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcePermissionDto {\n");
        sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    displayNameCn: ").append(toIndentedString(displayNameCn)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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
