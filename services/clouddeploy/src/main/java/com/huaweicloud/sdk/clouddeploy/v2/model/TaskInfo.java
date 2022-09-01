package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询部署任务详情响应体
 */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    @JacksonXmlProperty(localName = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_system")

    @JacksonXmlProperty(localName = "deploy_system")

    private String deploySystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private String updateTime;

    /**
     * 部署任务状态，Draft表示草稿状态，Available表示可用状态
     */
    public static final class StateEnum {

        /**
         * Enum AVAILABLE for value: "Available"
         */
        public static final StateEnum AVAILABLE = new StateEnum("Available");

        /**
         * Enum DRAFT for value: "Draft"
         */
        public static final StateEnum DRAFT = new StateEnum("Draft");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("Available", AVAILABLE);
            map.put("Draft", DRAFT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    @JacksonXmlProperty(localName = "execution_time")

    private String executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_defaut_permission")

    @JacksonXmlProperty(localName = "is_defaut_permission")

    private Boolean isDefautPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    @JacksonXmlProperty(localName = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    @JacksonXmlProperty(localName = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    @JacksonXmlProperty(localName = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    @JacksonXmlProperty(localName = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_cluster_id")

    @JacksonXmlProperty(localName = "slave_cluster_id")

    private String slaveClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_care")

    @JacksonXmlProperty(localName = "is_care")

    private Boolean isCare;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_modify")

    @JacksonXmlProperty(localName = "can_modify")

    private Boolean canModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    @JacksonXmlProperty(localName = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_view")

    @JacksonXmlProperty(localName = "can_view")

    private Boolean canView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_execute")

    @JacksonXmlProperty(localName = "can_execute")

    private Boolean canExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_copy")

    @JacksonXmlProperty(localName = "can_copy")

    private Boolean canCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_manage")

    @JacksonXmlProperty(localName = "can_manage")

    private Boolean canManage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_component_list")

    @JacksonXmlProperty(localName = "app_component_list")

    private List<AppComponentDao> appComponentList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    @JacksonXmlProperty(localName = "role_id")

    private Integer roleId;

    public TaskInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 部署任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 部署任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * devcloud项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TaskInfo withDeploySystem(String deploySystem) {
        this.deploySystem = deploySystem;
        return this;
    }

    /**
     * 部署类型模式，包括deployTemplate，ansible，shell
     * @return deploySystem
     */
    public String getDeploySystem() {
        return deploySystem;
    }

    public void setDeploySystem(String deploySystem) {
        this.deploySystem = deploySystem;
    }

    public TaskInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TaskInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public TaskInfo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 部署任务状态，Draft表示草稿状态，Available表示可用状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public TaskInfo withExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * 最后一次执行时间
     * @return executionTime
     */
    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public TaskInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskInfo withIsDefautPermission(Boolean isDefautPermission) {
        this.isDefautPermission = isDefautPermission;
        return this;
    }

    /**
     * 是否使用默认权限矩阵
     * @return isDefautPermission
     */
    public Boolean getIsDefautPermission() {
        return isDefautPermission;
    }

    public void setIsDefautPermission(Boolean isDefautPermission) {
        this.isDefautPermission = isDefautPermission;
    }

    public TaskInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TaskInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 部署任务创建者用户名
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TaskInfo withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 部署任务创建者昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public TaskInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 部署任务创建者用户ID
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public TaskInfo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 部署任务创建者租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public TaskInfo withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 部署任务创建者租户名
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public TaskInfo withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /**
     * slave集群id，默认为null时使用devcloud八爪鱼slave集群，用户自定义slave时为slave集群id
     * @return slaveClusterId
     */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public TaskInfo withIsCare(Boolean isCare) {
        this.isCare = isCare;
        return this;
    }

    /**
     * 当前用户是否已收藏
     * @return isCare
     */
    public Boolean getIsCare() {
        return isCare;
    }

    public void setIsCare(Boolean isCare) {
        this.isCare = isCare;
    }

    public TaskInfo withCanModify(Boolean canModify) {
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

    public TaskInfo withCanDelete(Boolean canDelete) {
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

    public TaskInfo withCanView(Boolean canView) {
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

    public TaskInfo withCanExecute(Boolean canExecute) {
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

    public TaskInfo withCanCopy(Boolean canCopy) {
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

    public TaskInfo withCanManage(Boolean canManage) {
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

    public TaskInfo withAppComponentList(List<AppComponentDao> appComponentList) {
        this.appComponentList = appComponentList;
        return this;
    }

    public TaskInfo addAppComponentListItem(AppComponentDao appComponentListItem) {
        if (this.appComponentList == null) {
            this.appComponentList = new ArrayList<>();
        }
        this.appComponentList.add(appComponentListItem);
        return this;
    }

    public TaskInfo withAppComponentList(Consumer<List<AppComponentDao>> appComponentListSetter) {
        if (this.appComponentList == null) {
            this.appComponentList = new ArrayList<>();
        }
        appComponentListSetter.accept(this.appComponentList);
        return this;
    }

    /**
     * 部署任务和应用组件对应关系
     * @return appComponentList
     */
    public List<AppComponentDao> getAppComponentList() {
        return appComponentList;
    }

    public void setAppComponentList(List<AppComponentDao> appComponentList) {
        this.appComponentList = appComponentList;
    }

    public TaskInfo withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID,0：部署任务创建者，-1：项目创建者，3：项目经理，4：开发人员，5：测试经理，6：测试人员，7：参与者，8：浏览者
     * @return roleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInfo taskInfo = (TaskInfo) o;
        return Objects.equals(this.taskId, taskInfo.taskId) && Objects.equals(this.name, taskInfo.name)
            && Objects.equals(this.projectId, taskInfo.projectId)
            && Objects.equals(this.projectName, taskInfo.projectName)
            && Objects.equals(this.deploySystem, taskInfo.deploySystem)
            && Objects.equals(this.createTime, taskInfo.createTime)
            && Objects.equals(this.updateTime, taskInfo.updateTime) && Objects.equals(this.state, taskInfo.state)
            && Objects.equals(this.executionTime, taskInfo.executionTime)
            && Objects.equals(this.description, taskInfo.description)
            && Objects.equals(this.isDefautPermission, taskInfo.isDefautPermission)
            && Objects.equals(this.templateId, taskInfo.templateId) && Objects.equals(this.owner, taskInfo.owner)
            && Objects.equals(this.nickName, taskInfo.nickName) && Objects.equals(this.ownerId, taskInfo.ownerId)
            && Objects.equals(this.tenantId, taskInfo.tenantId) && Objects.equals(this.tenantName, taskInfo.tenantName)
            && Objects.equals(this.slaveClusterId, taskInfo.slaveClusterId)
            && Objects.equals(this.isCare, taskInfo.isCare) && Objects.equals(this.canModify, taskInfo.canModify)
            && Objects.equals(this.canDelete, taskInfo.canDelete) && Objects.equals(this.canView, taskInfo.canView)
            && Objects.equals(this.canExecute, taskInfo.canExecute) && Objects.equals(this.canCopy, taskInfo.canCopy)
            && Objects.equals(this.canManage, taskInfo.canManage)
            && Objects.equals(this.appComponentList, taskInfo.appComponentList)
            && Objects.equals(this.roleId, taskInfo.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            name,
            projectId,
            projectName,
            deploySystem,
            createTime,
            updateTime,
            state,
            executionTime,
            description,
            isDefautPermission,
            templateId,
            owner,
            nickName,
            ownerId,
            tenantId,
            tenantName,
            slaveClusterId,
            isCare,
            canModify,
            canDelete,
            canView,
            canExecute,
            canCopy,
            canManage,
            appComponentList,
            roleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    deploySystem: ").append(toIndentedString(deploySystem)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isDefautPermission: ").append(toIndentedString(isDefautPermission)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    isCare: ").append(toIndentedString(isCare)).append("\n");
        sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
        sb.append("    canCopy: ").append(toIndentedString(canCopy)).append("\n");
        sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
        sb.append("    appComponentList: ").append(toIndentedString(appComponentList)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
