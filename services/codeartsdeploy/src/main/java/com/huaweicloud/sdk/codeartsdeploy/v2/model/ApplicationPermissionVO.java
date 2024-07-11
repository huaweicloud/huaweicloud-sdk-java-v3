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
 * 角色应用权限
 */
public class ApplicationPermissionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_modify")

    private Boolean canModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_view")

    private Boolean canView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_execute")

    private Boolean canExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_copy")

    private Boolean canCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_manage")

    private Boolean canManage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_create_env")

    private Boolean canCreateEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_disable")

    private Boolean canDisable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    /**
     * 角色类型， app-creator： 应用创建者； project： 项目管理员；template-customized-inst：系统角色； template-project-customized、project-customized：自定义角色
     */
    public static final class RoleTypeEnum {

        /**
         * Enum APP_CREATOR for value: "app-creator"
         */
        public static final RoleTypeEnum APP_CREATOR = new RoleTypeEnum("app-creator");

        /**
         * Enum PROJECT for value: "project"
         */
        public static final RoleTypeEnum PROJECT = new RoleTypeEnum("project");

        /**
         * Enum TEMPLATE_CUSTOMIZED_INST for value: "template-customized-inst"
         */
        public static final RoleTypeEnum TEMPLATE_CUSTOMIZED_INST = new RoleTypeEnum("template-customized-inst");

        /**
         * Enum TEMPLATE_PROJECT_CUSTOMIZED for value: "template-project-customized"
         */
        public static final RoleTypeEnum TEMPLATE_PROJECT_CUSTOMIZED = new RoleTypeEnum("template-project-customized");

        /**
         * Enum PROJECT_CUSTOMIZED for value: "project-customized"
         */
        public static final RoleTypeEnum PROJECT_CUSTOMIZED = new RoleTypeEnum("project-customized");

        private static final Map<String, RoleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleTypeEnum> createStaticFields() {
            Map<String, RoleTypeEnum> map = new HashMap<>();
            map.put("app-creator", APP_CREATOR);
            map.put("project", PROJECT);
            map.put("template-customized-inst", TEMPLATE_CUSTOMIZED_INST);
            map.put("template-project-customized", TEMPLATE_PROJECT_CUSTOMIZED);
            map.put("project-customized", PROJECT_CUSTOMIZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleTypeEnum(String value) {
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
        public static RoleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleTypeEnum(value));
        }

        public static RoleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleTypeEnum) {
                return this.value.equals(((RoleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_type")

    private RoleTypeEnum roleType;

    public ApplicationPermissionVO withCanModify(Boolean canModify) {
        this.canModify = canModify;
        return this;
    }

    /**
     * 是否有编辑权限
     * @return canModify
     */
    public Boolean getCanModify() {
        return canModify;
    }

    public void setCanModify(Boolean canModify) {
        this.canModify = canModify;
    }

    public ApplicationPermissionVO withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 是否有删除的权限
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public ApplicationPermissionVO withCanView(Boolean canView) {
        this.canView = canView;
        return this;
    }

    /**
     * 是否有查看权限
     * @return canView
     */
    public Boolean getCanView() {
        return canView;
    }

    public void setCanView(Boolean canView) {
        this.canView = canView;
    }

    public ApplicationPermissionVO withCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
        return this;
    }

    /**
     * 是否有执行权限
     * @return canExecute
     */
    public Boolean getCanExecute() {
        return canExecute;
    }

    public void setCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
    }

    public ApplicationPermissionVO withCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
        return this;
    }

    /**
     * 是否有复制权限
     * @return canCopy
     */
    public Boolean getCanCopy() {
        return canCopy;
    }

    public void setCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
    }

    public ApplicationPermissionVO withCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }

    /**
     * 是否有管理权限，包含增删改查执行以及权限修改
     * @return canManage
     */
    public Boolean getCanManage() {
        return canManage;
    }

    public void setCanManage(Boolean canManage) {
        this.canManage = canManage;
    }

    public ApplicationPermissionVO withCanCreateEnv(Boolean canCreateEnv) {
        this.canCreateEnv = canCreateEnv;
        return this;
    }

    /**
     * 是否有新建环境权限
     * @return canCreateEnv
     */
    public Boolean getCanCreateEnv() {
        return canCreateEnv;
    }

    public void setCanCreateEnv(Boolean canCreateEnv) {
        this.canCreateEnv = canCreateEnv;
    }

    public ApplicationPermissionVO withCanDisable(Boolean canDisable) {
        this.canDisable = canDisable;
        return this;
    }

    /**
     * 是否有禁用权限
     * @return canDisable
     */
    public Boolean getCanDisable() {
        return canDisable;
    }

    public void setCanDisable(Boolean canDisable) {
        this.canDisable = canDisable;
    }

    public ApplicationPermissionVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 角色名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationPermissionVO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 局点信息
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ApplicationPermissionVO withRoleId(String roleId) {
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

    public ApplicationPermissionVO withRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 角色类型， app-creator： 应用创建者； project： 项目管理员；template-customized-inst：系统角色； template-project-customized、project-customized：自定义角色
     * @return roleType
     */
    public RoleTypeEnum getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationPermissionVO that = (ApplicationPermissionVO) obj;
        return Objects.equals(this.canModify, that.canModify) && Objects.equals(this.canDelete, that.canDelete)
            && Objects.equals(this.canView, that.canView) && Objects.equals(this.canExecute, that.canExecute)
            && Objects.equals(this.canCopy, that.canCopy) && Objects.equals(this.canManage, that.canManage)
            && Objects.equals(this.canCreateEnv, that.canCreateEnv) && Objects.equals(this.canDisable, that.canDisable)
            && Objects.equals(this.name, that.name) && Objects.equals(this.region, that.region)
            && Objects.equals(this.roleId, that.roleId) && Objects.equals(this.roleType, that.roleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canModify,
            canDelete,
            canView,
            canExecute,
            canCopy,
            canManage,
            canCreateEnv,
            canDisable,
            name,
            region,
            roleId,
            roleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationPermissionVO {\n");
        sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
        sb.append("    canCopy: ").append(toIndentedString(canCopy)).append("\n");
        sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
        sb.append("    canCreateEnv: ").append(toIndentedString(canCreateEnv)).append("\n");
        sb.append("    canDisable: ").append(toIndentedString(canDisable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
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
