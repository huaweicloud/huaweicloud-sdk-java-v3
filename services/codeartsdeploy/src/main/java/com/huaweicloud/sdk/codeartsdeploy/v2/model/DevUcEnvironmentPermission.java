package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用环境鉴权类
 */
public class DevUcEnvironmentPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devuc_role_id_list")

    private List<String> devucRoleIdList = null;

    /**
     * 角色类型， environment-creator： 环境创建者； project： 项目管理员；template-customized-inst：系统角色； template-project-customized、project-customized：自定义角色
     */
    public static final class RoleTypeEnum {

        /**
         * Enum ENVIRONMENT_CREATOR for value: "environment-creator"
         */
        public static final RoleTypeEnum ENVIRONMENT_CREATOR = new RoleTypeEnum("environment-creator");

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
            map.put("environment-creator", ENVIRONMENT_CREATOR);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_view")

    private Boolean canView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_edit")

    private Boolean canEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_deploy")

    private Boolean canDeploy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_manage")

    private Boolean canManage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public DevUcEnvironmentPermission withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 权限id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DevUcEnvironmentPermission withRoleId(String roleId) {
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

    public DevUcEnvironmentPermission withDevucRoleIdList(List<String> devucRoleIdList) {
        this.devucRoleIdList = devucRoleIdList;
        return this;
    }

    public DevUcEnvironmentPermission addDevucRoleIdListItem(String devucRoleIdListItem) {
        if (this.devucRoleIdList == null) {
            this.devucRoleIdList = new ArrayList<>();
        }
        this.devucRoleIdList.add(devucRoleIdListItem);
        return this;
    }

    public DevUcEnvironmentPermission withDevucRoleIdList(Consumer<List<String>> devucRoleIdListSetter) {
        if (this.devucRoleIdList == null) {
            this.devucRoleIdList = new ArrayList<>();
        }
        devucRoleIdListSetter.accept(this.devucRoleIdList);
        return this;
    }

    /**
     * 角色id列表
     * @return devucRoleIdList
     */
    public List<String> getDevucRoleIdList() {
        return devucRoleIdList;
    }

    public void setDevucRoleIdList(List<String> devucRoleIdList) {
        this.devucRoleIdList = devucRoleIdList;
    }

    public DevUcEnvironmentPermission withRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 角色类型， environment-creator： 环境创建者； project： 项目管理员；template-customized-inst：系统角色； template-project-customized、project-customized：自定义角色
     * @return roleType
     */
    public RoleTypeEnum getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
    }

    public DevUcEnvironmentPermission withName(String name) {
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

    public DevUcEnvironmentPermission withRegion(String region) {
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

    public DevUcEnvironmentPermission withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * 环境id
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public DevUcEnvironmentPermission withCanView(Boolean canView) {
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

    public DevUcEnvironmentPermission withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * 是否有编辑权限
     * @return canEdit
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public DevUcEnvironmentPermission withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 是否有删除权限
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public DevUcEnvironmentPermission withCanDeploy(Boolean canDeploy) {
        this.canDeploy = canDeploy;
        return this;
    }

    /**
     * 是否有部署权限
     * @return canDeploy
     */
    public Boolean getCanDeploy() {
        return canDeploy;
    }

    public void setCanDeploy(Boolean canDeploy) {
        this.canDeploy = canDeploy;
    }

    public DevUcEnvironmentPermission withCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }

    /**
     * 是否有权限管理权限
     * @return canManage
     */
    public Boolean getCanManage() {
        return canManage;
    }

    public void setCanManage(Boolean canManage) {
        this.canManage = canManage;
    }

    public DevUcEnvironmentPermission withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public DevUcEnvironmentPermission withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevUcEnvironmentPermission that = (DevUcEnvironmentPermission) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.devucRoleIdList, that.devucRoleIdList)
            && Objects.equals(this.roleType, that.roleType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.region, that.region) && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.canView, that.canView) && Objects.equals(this.canEdit, that.canEdit)
            && Objects.equals(this.canDelete, that.canDelete) && Objects.equals(this.canDeploy, that.canDeploy)
            && Objects.equals(this.canManage, that.canManage) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            roleId,
            devucRoleIdList,
            roleType,
            name,
            region,
            environmentId,
            canView,
            canEdit,
            canDelete,
            canDeploy,
            canManage,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevUcEnvironmentPermission {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    devucRoleIdList: ").append(toIndentedString(devucRoleIdList)).append("\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canDeploy: ").append(toIndentedString(canDeploy)).append("\n");
        sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
