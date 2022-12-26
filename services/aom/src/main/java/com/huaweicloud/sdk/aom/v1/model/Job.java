package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.ApproveInfo;
import com.huaweicloud.sdk.aom.v1.model.Parameter;
import com.huaweicloud.sdk.aom.v1.model.RateControl;
import com.huaweicloud.sdk.aom.v1.model.Step;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 作业id
 */
public class Job  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_by")
    
    
    private String createBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private Long updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_by")
    
    
    private String updateBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="steps")
    
    
    private List<Step> steps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    
    private List<Parameter> parameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rate_control")
    
    
    private RateControl rateControl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="approve_info")
    
    
    private ApproveInfo approveInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_latest_version")
    
    
    private Boolean isLatestVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_number")
    
    
    private Integer versionNumber;

    public Job withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 作业id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Job withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 作业名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Job withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 实体的创建时间戳。
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

    

    public Job withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public Job withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 实体的最后更新时间戳。 注意：执行创建/修补/删除操作时，update_time将更新。
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

    

    public Job withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    


    /**
     * 修改人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    

    public Job withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 作业描述，最大长度为1000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Job withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public Job withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户从IAM申请到的projectid，一般为32位字符串。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public Job withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    
    public Job addStepsItem(Step stepsItem) {
        if(this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public Job withSteps(Consumer<List<Step>> stepsSetter) {
        if(this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 作业步骤。
     * @return steps
     */
    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    

    public Job withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    
    public Job addParametersItem(Parameter parametersItem) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public Job withParameters(Consumer<List<Parameter>> parametersSetter) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 全局参数。
     * @return parameters
     */
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    

    public Job withRateControl(RateControl rateControl) {
        this.rateControl = rateControl;
        return this;
    }

    public Job withRateControl(Consumer<RateControl> rateControlSetter) {
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

    

    public Job withApproveInfo(ApproveInfo approveInfo) {
        this.approveInfo = approveInfo;
        return this;
    }

    public Job withApproveInfo(Consumer<ApproveInfo> approveInfoSetter) {
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

    

    public Job withIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }

    


    /**
     * 是否为最新版本的作业
     * @return isLatestVersion
     */
    public Boolean getIsLatestVersion() {
        return isLatestVersion;
    }

    public void setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
    }

    

    public Job withVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    


    /**
     * 版本号
     * minimum: 1
     * maximum: 100
     * @return versionNumber
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return Objects.equals(this.id, job.id) &&
            Objects.equals(this.name, job.name) &&
            Objects.equals(this.createTime, job.createTime) &&
            Objects.equals(this.createBy, job.createBy) &&
            Objects.equals(this.updateTime, job.updateTime) &&
            Objects.equals(this.updateBy, job.updateBy) &&
            Objects.equals(this.description, job.description) &&
            Objects.equals(this.enterpriseProjectId, job.enterpriseProjectId) &&
            Objects.equals(this.projectId, job.projectId) &&
            Objects.equals(this.steps, job.steps) &&
            Objects.equals(this.parameters, job.parameters) &&
            Objects.equals(this.rateControl, job.rateControl) &&
            Objects.equals(this.approveInfo, job.approveInfo) &&
            Objects.equals(this.isLatestVersion, job.isLatestVersion) &&
            Objects.equals(this.versionNumber, job.versionNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, createTime, createBy, updateTime, updateBy, description, enterpriseProjectId, projectId, steps, parameters, rateControl, approveInfo, isLatestVersion, versionNumber);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    rateControl: ").append(toIndentedString(rateControl)).append("\n");
        sb.append("    approveInfo: ").append(toIndentedString(approveInfo)).append("\n");
        sb.append("    isLatestVersion: ").append(toIndentedString(isLatestVersion)).append("\n");
        sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

