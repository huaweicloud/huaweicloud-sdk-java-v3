package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateHostGroupPermissionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devuc_role_id_list")

    private List<String> devucRoleIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

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
    @JsonProperty(value = "can_add_host")

    private Boolean canAddHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_manage")

    private Boolean canManage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_copy")

    private Boolean canCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    /**
     * 角色类型，project-customized：自定义角色；template-project-customized：系统自定义角色； template-customized-inst：系统角色；cluster-creator：集群创建者；project_admin：项目创建者
     */
    public static final class RoleTypeEnum {

        /**
         * Enum PROJECT_CUSTOMIZED for value: "project-customized"
         */
        public static final RoleTypeEnum PROJECT_CUSTOMIZED = new RoleTypeEnum("project-customized");

        /**
         * Enum TEMPLATE_PROJECT_CUSTOMIZED for value: "template-project-customized"
         */
        public static final RoleTypeEnum TEMPLATE_PROJECT_CUSTOMIZED = new RoleTypeEnum("template-project-customized");

        /**
         * Enum TEMPLATE_CUSTOMIZED_INST for value: "template-customized-inst"
         */
        public static final RoleTypeEnum TEMPLATE_CUSTOMIZED_INST = new RoleTypeEnum("template-customized-inst");

        /**
         * Enum CLUSTER_CREATOR for value: "cluster-creator"
         */
        public static final RoleTypeEnum CLUSTER_CREATOR = new RoleTypeEnum("cluster-creator");

        /**
         * Enum PROJECT_ADMIN for value: "project_admin"
         */
        public static final RoleTypeEnum PROJECT_ADMIN = new RoleTypeEnum("project_admin");

        private static final Map<String, RoleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleTypeEnum> createStaticFields() {
            Map<String, RoleTypeEnum> map = new HashMap<>();
            map.put("project-customized", PROJECT_CUSTOMIZED);
            map.put("template-project-customized", TEMPLATE_PROJECT_CUSTOMIZED);
            map.put("template-customized-inst", TEMPLATE_CUSTOMIZED_INST);
            map.put("cluster-creator", CLUSTER_CREATOR);
            map.put("project_admin", PROJECT_ADMIN);
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

    public UpdateHostGroupPermissionsResponse withRegion(String region) {
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

    public UpdateHostGroupPermissionsResponse withRoleId(String roleId) {
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

    public UpdateHostGroupPermissionsResponse withDevucRoleIdList(List<String> devucRoleIdList) {
        this.devucRoleIdList = devucRoleIdList;
        return this;
    }

    public UpdateHostGroupPermissionsResponse addDevucRoleIdListItem(String devucRoleIdListItem) {
        if (this.devucRoleIdList == null) {
            this.devucRoleIdList = new ArrayList<>();
        }
        this.devucRoleIdList.add(devucRoleIdListItem);
        return this;
    }

    public UpdateHostGroupPermissionsResponse withDevucRoleIdList(Consumer<List<String>> devucRoleIdListSetter) {
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

    public UpdateHostGroupPermissionsResponse withName(String name) {
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

    public UpdateHostGroupPermissionsResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 主机集群id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateHostGroupPermissionsResponse withCanView(Boolean canView) {
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

    public UpdateHostGroupPermissionsResponse withCanEdit(Boolean canEdit) {
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

    public UpdateHostGroupPermissionsResponse withCanDelete(Boolean canDelete) {
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

    public UpdateHostGroupPermissionsResponse withCanAddHost(Boolean canAddHost) {
        this.canAddHost = canAddHost;
        return this;
    }

    /**
     * 是否有添加主机权限
     * @return canAddHost
     */
    public Boolean getCanAddHost() {
        return canAddHost;
    }

    public void setCanAddHost(Boolean canAddHost) {
        this.canAddHost = canAddHost;
    }

    public UpdateHostGroupPermissionsResponse withCanManage(Boolean canManage) {
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

    public UpdateHostGroupPermissionsResponse withCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
        return this;
    }

    /**
     * 是否有拷贝权限
     * @return canCopy
     */
    public Boolean getCanCopy() {
        return canCopy;
    }

    public void setCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
    }

    public UpdateHostGroupPermissionsResponse withCreateTime(OffsetDateTime createTime) {
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

    public UpdateHostGroupPermissionsResponse withUpdateTime(OffsetDateTime updateTime) {
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

    public UpdateHostGroupPermissionsResponse withRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 角色类型，project-customized：自定义角色；template-project-customized：系统自定义角色； template-customized-inst：系统角色；cluster-creator：集群创建者；project_admin：项目创建者
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
        UpdateHostGroupPermissionsResponse that = (UpdateHostGroupPermissionsResponse) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.devucRoleIdList, that.devucRoleIdList) && Objects.equals(this.name, that.name)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.canView, that.canView)
            && Objects.equals(this.canEdit, that.canEdit) && Objects.equals(this.canDelete, that.canDelete)
            && Objects.equals(this.canAddHost, that.canAddHost) && Objects.equals(this.canManage, that.canManage)
            && Objects.equals(this.canCopy, that.canCopy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.roleType, that.roleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            roleId,
            devucRoleIdList,
            name,
            groupId,
            canView,
            canEdit,
            canDelete,
            canAddHost,
            canManage,
            canCopy,
            createTime,
            updateTime,
            roleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostGroupPermissionsResponse {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    devucRoleIdList: ").append(toIndentedString(devucRoleIdList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canAddHost: ").append(toIndentedString(canAddHost)).append("\n");
        sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
        sb.append("    canCopy: ").append(toIndentedString(canCopy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
