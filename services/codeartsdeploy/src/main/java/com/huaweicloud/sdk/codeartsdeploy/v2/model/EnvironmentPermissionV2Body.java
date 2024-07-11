package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 环境修改权限请求体
 */
public class EnvironmentPermissionV2Body {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    /**
     * 权限名称，can_view：查看权限；can_edit：编辑权限；can_delete：删除权限；can_deploy：部署权限；can_manage：权限管理权限
     */
    public static final class PermissionNameEnum {

        /**
         * Enum CAN_VIEW for value: "can_view"
         */
        public static final PermissionNameEnum CAN_VIEW = new PermissionNameEnum("can_view");

        /**
         * Enum CAN_EDIT for value: "can_edit"
         */
        public static final PermissionNameEnum CAN_EDIT = new PermissionNameEnum("can_edit");

        /**
         * Enum CAN_DELETE for value: "can_delete"
         */
        public static final PermissionNameEnum CAN_DELETE = new PermissionNameEnum("can_delete");

        /**
         * Enum CAN_DEPLOY for value: "can_deploy"
         */
        public static final PermissionNameEnum CAN_DEPLOY = new PermissionNameEnum("can_deploy");

        /**
         * Enum CAN_MANAGE for value: "can_manage"
         */
        public static final PermissionNameEnum CAN_MANAGE = new PermissionNameEnum("can_manage");

        private static final Map<String, PermissionNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionNameEnum> createStaticFields() {
            Map<String, PermissionNameEnum> map = new HashMap<>();
            map.put("can_view", CAN_VIEW);
            map.put("can_edit", CAN_EDIT);
            map.put("can_delete", CAN_DELETE);
            map.put("can_deploy", CAN_DEPLOY);
            map.put("can_manage", CAN_MANAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionNameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionNameEnum(value));
        }

        public static PermissionNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionNameEnum) {
                return this.value.equals(((PermissionNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_name")

    private PermissionNameEnum permissionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_value")

    private Boolean permissionValue;

    public EnvironmentPermissionV2Body withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色id
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public EnvironmentPermissionV2Body withPermissionName(PermissionNameEnum permissionName) {
        this.permissionName = permissionName;
        return this;
    }

    /**
     * 权限名称，can_view：查看权限；can_edit：编辑权限；can_delete：删除权限；can_deploy：部署权限；can_manage：权限管理权限
     * @return permissionName
     */
    public PermissionNameEnum getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(PermissionNameEnum permissionName) {
        this.permissionName = permissionName;
    }

    public EnvironmentPermissionV2Body withPermissionValue(Boolean permissionValue) {
        this.permissionValue = permissionValue;
        return this;
    }

    /**
     * true 有权限，false 无权限
     * @return permissionValue
     */
    public Boolean getPermissionValue() {
        return permissionValue;
    }

    public void setPermissionValue(Boolean permissionValue) {
        this.permissionValue = permissionValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvironmentPermissionV2Body that = (EnvironmentPermissionV2Body) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.permissionName, that.permissionName)
            && Objects.equals(this.permissionValue, that.permissionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, permissionName, permissionValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentPermissionV2Body {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
        sb.append("    permissionValue: ").append(toIndentedString(permissionValue)).append("\n");
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
