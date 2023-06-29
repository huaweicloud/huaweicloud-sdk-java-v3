package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PermissionItem
 */
public class PermissionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perm_name")

    private String permName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pro_level_name")

    private String proLevelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perm_type_name")

    private String permTypeName;

    public PermissionItem withPermName(String permName) {
        this.permName = permName;
        return this;
    }

    /**
     * 权限名称
     * @return permName
     */
    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public PermissionItem withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 权限描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PermissionItem withProLevelName(String proLevelName) {
        this.proLevelName = proLevelName;
        return this;
    }

    /**
     * 权限保护级别
     * @return proLevelName
     */
    public String getProLevelName() {
        return proLevelName;
    }

    public void setProLevelName(String proLevelName) {
        this.proLevelName = proLevelName;
    }

    public PermissionItem withPermTypeName(String permTypeName) {
        this.permTypeName = permTypeName;
        return this;
    }

    /**
     * 权限类型
     * @return permTypeName
     */
    public String getPermTypeName() {
        return permTypeName;
    }

    public void setPermTypeName(String permTypeName) {
        this.permTypeName = permTypeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionItem that = (PermissionItem) obj;
        return Objects.equals(this.permName, that.permName) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.proLevelName, that.proLevelName)
            && Objects.equals(this.permTypeName, that.permTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permName, desc, proLevelName, permTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionItem {\n");
        sb.append("    permName: ").append(toIndentedString(permName)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    proLevelName: ").append(toIndentedString(proLevelName)).append("\n");
        sb.append("    permTypeName: ").append(toIndentedString(permTypeName)).append("\n");
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
