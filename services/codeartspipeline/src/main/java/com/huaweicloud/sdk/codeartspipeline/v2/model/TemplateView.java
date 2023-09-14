package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流水线创建状态响应体
 */
public class TemplateView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_url")

    private String templateUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_build_in")

    private Boolean isBuildIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modify_time")

    private String lastModifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_watch")

    private Boolean isWatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter")

    private List<TemplateParam> parameter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow")

    private Map<String, Map<String, String>> flow = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private Map<String, TemplateState> states = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_update")

    private Boolean canUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_hub")

    private Boolean needHub;

    public TemplateView withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TemplateView withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名字
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public TemplateView withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public TemplateView withTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }

    /**
     * 模板编辑URL
     * @return templateUrl
     */
    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public TemplateView withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TemplateView withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名字
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TemplateView withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public TemplateView withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名字
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public TemplateView withIsBuildIn(Boolean isBuildIn) {
        this.isBuildIn = isBuildIn;
        return this;
    }

    /**
     * 是否内置模板
     * @return isBuildIn
     */
    public Boolean getIsBuildIn() {
        return isBuildIn;
    }

    public void setIsBuildIn(Boolean isBuildIn) {
        this.isBuildIn = isBuildIn;
    }

    public TemplateView withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 系统模板region为Cloud Pipeline。自定义模板region为实际region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TemplateView withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TemplateView withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名字
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TemplateView withCreateTime(String createTime) {
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

    public TemplateView withLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    /**
     * 修改时间
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public TemplateView withIsWatch(Boolean isWatch) {
        this.isWatch = isWatch;
        return this;
    }

    /**
     * 是否关注
     * @return isWatch
     */
    public Boolean getIsWatch() {
        return isWatch;
    }

    public void setIsWatch(Boolean isWatch) {
        this.isWatch = isWatch;
    }

    public TemplateView withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateView withParameter(List<TemplateParam> parameter) {
        this.parameter = parameter;
        return this;
    }

    public TemplateView addParameterItem(TemplateParam parameterItem) {
        if (this.parameter == null) {
            this.parameter = new ArrayList<>();
        }
        this.parameter.add(parameterItem);
        return this;
    }

    public TemplateView withParameter(Consumer<List<TemplateParam>> parameterSetter) {
        if (this.parameter == null) {
            this.parameter = new ArrayList<>();
        }
        parameterSetter.accept(this.parameter);
        return this;
    }

    /**
     * 模板参数
     * @return parameter
     */
    public List<TemplateParam> getParameter() {
        return parameter;
    }

    public void setParameter(List<TemplateParam> parameter) {
        this.parameter = parameter;
    }

    public TemplateView withFlow(Map<String, Map<String, String>> flow) {
        this.flow = flow;
        return this;
    }

    public TemplateView putFlowItem(String key, Map<String, String> flowItem) {
        if (this.flow == null) {
            this.flow = new HashMap<>();
        }
        this.flow.put(key, flowItem);
        return this;
    }

    public TemplateView withFlow(Consumer<Map<String, Map<String, String>>> flowSetter) {
        if (this.flow == null) {
            this.flow = new HashMap<>();
        }
        flowSetter.accept(this.flow);
        return this;
    }

    /**
     * 编排flow详情，描述流水线内各阶段任务的串并行关系。map类型数据，key为阶段名字，默认第一阶段initial，最后阶段为final，其余名字以'state_数字'标识。value为该阶段内任务(以'Task_数字'标识)以及后续阶段的标识。本字段为描述流水线基础编排数据之一，建议可通过流水线真实界面基于模板创建接口中获取
     * @return flow
     */
    public Map<String, Map<String, String>> getFlow() {
        return flow;
    }

    public void setFlow(Map<String, Map<String, String>> flow) {
        this.flow = flow;
    }

    public TemplateView withStates(Map<String, TemplateState> states) {
        this.states = states;
        return this;
    }

    public TemplateView putStatesItem(String key, TemplateState statesItem) {
        if (this.states == null) {
            this.states = new HashMap<>();
        }
        this.states.put(key, statesItem);
        return this;
    }

    public TemplateView withStates(Consumer<Map<String, TemplateState>> statesSetter) {
        if (this.states == null) {
            this.states = new HashMap<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * 编排State详情，map类型数据。本字段为描述流水线基础编排数据之一，建议可通过流水线真实界面基于模板创建接口中获取
     * @return states
     */
    public Map<String, TemplateState> getStates() {
        return states;
    }

    public void setStates(Map<String, TemplateState> states) {
        this.states = states;
    }

    public TemplateView withCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
        return this;
    }

    /**
     * 是否可以修改
     * @return canUpdate
     */
    public Boolean getCanUpdate() {
        return canUpdate;
    }

    public void setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    public TemplateView withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 是否可以删除
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public TemplateView withNeedHub(Boolean needHub) {
        this.needHub = needHub;
        return this;
    }

    /**
     * 是否需要代码仓库
     * @return needHub
     */
    public Boolean getNeedHub() {
        return needHub;
    }

    public void setNeedHub(Boolean needHub) {
        this.needHub = needHub;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateView that = (TemplateView) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.templateUrl, that.templateUrl) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.isBuildIn, that.isBuildIn)
            && Objects.equals(this.region, that.region) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastModifyTime, that.lastModifyTime) && Objects.equals(this.isWatch, that.isWatch)
            && Objects.equals(this.description, that.description) && Objects.equals(this.parameter, that.parameter)
            && Objects.equals(this.flow, that.flow) && Objects.equals(this.states, that.states)
            && Objects.equals(this.canUpdate, that.canUpdate) && Objects.equals(this.canDelete, that.canDelete)
            && Objects.equals(this.needHub, that.needHub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            templateName,
            templateType,
            templateUrl,
            userId,
            userName,
            domainId,
            domainName,
            isBuildIn,
            region,
            projectId,
            projectName,
            createTime,
            lastModifyTime,
            isWatch,
            description,
            parameter,
            flow,
            states,
            canUpdate,
            canDelete,
            needHub);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateView {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    templateUrl: ").append(toIndentedString(templateUrl)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    isBuildIn: ").append(toIndentedString(isBuildIn)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifyTime: ").append(toIndentedString(lastModifyTime)).append("\n");
        sb.append("    isWatch: ").append(toIndentedString(isWatch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    canUpdate: ").append(toIndentedString(canUpdate)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    needHub: ").append(toIndentedString(needHub)).append("\n");
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
