package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.ApproveInfo;
import com.huaweicloud.sdk.aom.v1.model.Node;
import com.huaweicloud.sdk.aom.v1.model.Parameter;
import com.huaweicloud.sdk.aom.v1.model.RateControl;
import com.huaweicloud.sdk.aom.v1.model.Step;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 变更服务模板模板元数据。
 */
public class Template  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="approve_info")
    
    
    private ApproveInfo approveInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_by")
    
    
    private String createBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_collect")
    
    
    private Boolean isCollect;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_publish")
    
    
    private Boolean isPublish;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_version")
    
    
    private Integer jobVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="need_synchronize")
    
    
    private Boolean needSynchronize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    
    private List<Node> nodes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    
    private List<Parameter> parameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quote")
    
    
    private List<String> quote = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rate_control")
    
    
    private RateControl rateControl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="share_type")
    
    
    private String shareType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="steps")
    
    
    private List<Step> steps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_by")
    
    
    private String updateBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private Long updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private String version;

    public Template withApproveInfo(ApproveInfo approveInfo) {
        this.approveInfo = approveInfo;
        return this;
    }

    public Template withApproveInfo(Consumer<ApproveInfo> approveInfoSetter) {
        if(this.approveInfo == null ){
            this.approveInfo = new ApproveInfo();
            approveInfoSetter.accept(this.approveInfo);
        }
        
        return this;
    }


    /**
     * Get approveInfo
     * @return approveInfo
     */
    public ApproveInfo getApproveInfo() {
        return approveInfo;
    }

    public void setApproveInfo(ApproveInfo approveInfo) {
        this.approveInfo = approveInfo;
    }

    

    public Template withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 模板创人，从接口调用传入的token中获取。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public Template withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 模板创建时间，为utc时间毫秒数。
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public Template withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public Template withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 模板id，唯一标识，根据project_id和template_name生成。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Template withIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
        return this;
    }

    


    /**
     * 模板是否收藏，不允许更新模板时修改，更改收藏状态调用单独的更新模板收藏状态接口
     * @return isCollect
     */
    public Boolean getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
    }

    

    public Template withIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }

    


    /**
     * 是否发布成服务
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    

    public Template withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public Template withJobVersion(Integer jobVersion) {
        this.jobVersion = jobVersion;
        return this;
    }

    


    /**
     * 作业版本
     * minimum: 1
     * maximum: 999
     * @return jobVersion
     */
    public Integer getJobVersion() {
        return jobVersion;
    }

    public void setJobVersion(Integer jobVersion) {
        this.jobVersion = jobVersion;
    }

    

    public Template withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Template withNeedSynchronize(Boolean needSynchronize) {
        this.needSynchronize = needSynchronize;
        return this;
    }

    


    /**
     * 是否需要同步
     * @return needSynchronize
     */
    public Boolean getNeedSynchronize() {
        return needSynchronize;
    }

    public void setNeedSynchronize(Boolean needSynchronize) {
        this.needSynchronize = needSynchronize;
    }

    

    public Template withNodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public Template addNodesItem(Node nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public Template withNodes(Consumer<List<Node>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 任务执行时需要的参数列表。
     * @return nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    

    public Template withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    
    public Template addParametersItem(Parameter parametersItem) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public Template withParameters(Consumer<List<Parameter>> parametersSetter) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 任务执行时需要的参数列表。
     * @return parameters
     */
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    

    public Template withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public Template withQuote(List<String> quote) {
        this.quote = quote;
        return this;
    }

    
    public Template addQuoteItem(String quoteItem) {
        if(this.quote == null) {
            this.quote = new ArrayList<>();
        }
        this.quote.add(quoteItem);
        return this;
    }

    public Template withQuote(Consumer<List<String>> quoteSetter) {
        if(this.quote == null) {
            this.quote = new ArrayList<>();
        }
        quoteSetter.accept(this.quote);
        return this;
    }

    /**
     * 引用参数
     * @return quote
     */
    public List<String> getQuote() {
        return quote;
    }

    public void setQuote(List<String> quote) {
        this.quote = quote;
    }

    

    public Template withRateControl(RateControl rateControl) {
        this.rateControl = rateControl;
        return this;
    }

    public Template withRateControl(Consumer<RateControl> rateControlSetter) {
        if(this.rateControl == null ){
            this.rateControl = new RateControl();
            rateControlSetter.accept(this.rateControl);
        }
        
        return this;
    }


    /**
     * Get rateControl
     * @return rateControl
     */
    public RateControl getRateControl() {
        return rateControl;
    }

    public void setRateControl(RateControl rateControl) {
        this.rateControl = rateControl;
    }

    

    public Template withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    


    /**
     * 默认模板为public，自定义模板为private
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    

    public Template withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    
    public Template addStepsItem(Step stepsItem) {
        if(this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public Template withSteps(Consumer<List<Step>> stepsSetter) {
        if(this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 作业步骤
     * @return steps
     */
    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    

    public Template withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    


    /**
     * 模板更新人，从接口调用传入的token中获取。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    

    public Template withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 模板更新时间，为utc时间毫秒数。
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    

    public Template withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 模板版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Template template = (Template) o;
        return Objects.equals(this.approveInfo, template.approveInfo) &&
            Objects.equals(this.createBy, template.createBy) &&
            Objects.equals(this.createTime, template.createTime) &&
            Objects.equals(this.enterpriseProjectId, template.enterpriseProjectId) &&
            Objects.equals(this.id, template.id) &&
            Objects.equals(this.isCollect, template.isCollect) &&
            Objects.equals(this.isPublish, template.isPublish) &&
            Objects.equals(this.jobId, template.jobId) &&
            Objects.equals(this.jobVersion, template.jobVersion) &&
            Objects.equals(this.name, template.name) &&
            Objects.equals(this.needSynchronize, template.needSynchronize) &&
            Objects.equals(this.nodes, template.nodes) &&
            Objects.equals(this.parameters, template.parameters) &&
            Objects.equals(this.projectId, template.projectId) &&
            Objects.equals(this.quote, template.quote) &&
            Objects.equals(this.rateControl, template.rateControl) &&
            Objects.equals(this.shareType, template.shareType) &&
            Objects.equals(this.steps, template.steps) &&
            Objects.equals(this.updateBy, template.updateBy) &&
            Objects.equals(this.updateTime, template.updateTime) &&
            Objects.equals(this.version, template.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(approveInfo, createBy, createTime, enterpriseProjectId, id, isCollect, isPublish, jobId, jobVersion, name, needSynchronize, nodes, parameters, projectId, quote, rateControl, shareType, steps, updateBy, updateTime, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Template {\n");
        sb.append("    approveInfo: ").append(toIndentedString(approveInfo)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isCollect: ").append(toIndentedString(isCollect)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobVersion: ").append(toIndentedString(jobVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    needSynchronize: ").append(toIndentedString(needSynchronize)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
        sb.append("    rateControl: ").append(toIndentedString(rateControl)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

