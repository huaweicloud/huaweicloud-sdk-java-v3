package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 权限继承设置请求体
 */
public class PermissionInheritEnabledDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_parent_permission")

    private Boolean inheritParentPermission;

    public PermissionInheritEnabledDto withInheritParentPermission(Boolean inheritParentPermission) {
        this.inheritParentPermission = inheritParentPermission;
        return this;
    }

    /**
     * **参数解释：** 权限继承设置。 **约束限制：** 不涉及。 **取值范围：** - true，使用上层权限配置，如果上层是代码组使用代码组权限配置，如果上层是项目使用项目权限配置。 - false，使用仓库权限配置。 
     * @return inheritParentPermission
     */
    public Boolean getInheritParentPermission() {
        return inheritParentPermission;
    }

    public void setInheritParentPermission(Boolean inheritParentPermission) {
        this.inheritParentPermission = inheritParentPermission;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionInheritEnabledDto that = (PermissionInheritEnabledDto) obj;
        return Objects.equals(this.inheritParentPermission, that.inheritParentPermission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inheritParentPermission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionInheritEnabledDto {\n");
        sb.append("    inheritParentPermission: ").append(toIndentedString(inheritParentPermission)).append("\n");
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
