package com.huaweicloud.sdk.cloudpipeline.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v2.model.TemplateParam;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTemplateDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private String templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_name")
    
    private String templateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_type")
    
    private String templateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_url")
    
    private String templateUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_build_in")
    
    private Boolean isBuildIn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_watch")
    
    private Boolean isWatch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter")
    
    private List<TemplateParam> parameter = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flow")
    
    private Object flow;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="states")
    
    private Object states;

    public ShowTemplateDetailResponse withTemplateId(String templateId) {
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

    

    public ShowTemplateDetailResponse withTemplateName(String templateName) {
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

    

    public ShowTemplateDetailResponse withTemplateType(String templateType) {
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

    

    public ShowTemplateDetailResponse withTemplateUrl(String templateUrl) {
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

    

    public ShowTemplateDetailResponse withUserId(String userId) {
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

    

    public ShowTemplateDetailResponse withUserName(String userName) {
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

    

    public ShowTemplateDetailResponse withDomainId(String domainId) {
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

    

    public ShowTemplateDetailResponse withDomainName(String domainName) {
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

    

    public ShowTemplateDetailResponse withIsBuildIn(Boolean isBuildIn) {
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

    

    public ShowTemplateDetailResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public ShowTemplateDetailResponse withProjectId(String projectId) {
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

    

    public ShowTemplateDetailResponse withProjectName(String projectName) {
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

    

    public ShowTemplateDetailResponse withIsWatch(Boolean isWatch) {
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

    

    public ShowTemplateDetailResponse withDescription(String description) {
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

    

    public ShowTemplateDetailResponse withParameter(List<TemplateParam> parameter) {
        this.parameter = parameter;
        return this;
    }

    
    public ShowTemplateDetailResponse addParameterItem(TemplateParam parameterItem) {
        this.parameter.add(parameterItem);
        return this;
    }

    public ShowTemplateDetailResponse withParameter(Consumer<List<TemplateParam>> parameterSetter) {
        if(this.parameter == null ){
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

    

    public ShowTemplateDetailResponse withFlow(Object flow) {
        this.flow = flow;
        return this;
    }

    


    /**
     * 编排flow，map类型数据
     * @return flow
     */
    public Object getFlow() {
        return flow;
    }

    public void setFlow(Object flow) {
        this.flow = flow;
    }

    

    public ShowTemplateDetailResponse withStates(Object states) {
        this.states = states;
        return this;
    }

    


    /**
     * 子任务states，map类型数据
     * @return states
     */
    public Object getStates() {
        return states;
    }

    public void setStates(Object states) {
        this.states = states;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTemplateDetailResponse showTemplateDetailResponse = (ShowTemplateDetailResponse) o;
        return Objects.equals(this.templateId, showTemplateDetailResponse.templateId) &&
            Objects.equals(this.templateName, showTemplateDetailResponse.templateName) &&
            Objects.equals(this.templateType, showTemplateDetailResponse.templateType) &&
            Objects.equals(this.templateUrl, showTemplateDetailResponse.templateUrl) &&
            Objects.equals(this.userId, showTemplateDetailResponse.userId) &&
            Objects.equals(this.userName, showTemplateDetailResponse.userName) &&
            Objects.equals(this.domainId, showTemplateDetailResponse.domainId) &&
            Objects.equals(this.domainName, showTemplateDetailResponse.domainName) &&
            Objects.equals(this.isBuildIn, showTemplateDetailResponse.isBuildIn) &&
            Objects.equals(this.region, showTemplateDetailResponse.region) &&
            Objects.equals(this.projectId, showTemplateDetailResponse.projectId) &&
            Objects.equals(this.projectName, showTemplateDetailResponse.projectName) &&
            Objects.equals(this.isWatch, showTemplateDetailResponse.isWatch) &&
            Objects.equals(this.description, showTemplateDetailResponse.description) &&
            Objects.equals(this.parameter, showTemplateDetailResponse.parameter) &&
            Objects.equals(this.flow, showTemplateDetailResponse.flow) &&
            Objects.equals(this.states, showTemplateDetailResponse.states);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateName, templateType, templateUrl, userId, userName, domainId, domainName, isBuildIn, region, projectId, projectName, isWatch, description, parameter, flow, states);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplateDetailResponse {\n");
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
        sb.append("    isWatch: ").append(toIndentedString(isWatch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

