package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.ApproveInfo;
import com.huaweicloud.sdk.aom.v1.model.RateControl;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 脚本的基本信息。
 */
public class Script  {


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
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="online_exist_status")
    

    private Boolean onlineExistStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="online_id")
    

    private String onlineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rate_control")
    

    private RateControl rateControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_language")
    

    private String scriptLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_by")
    

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private Long updateTime;

    public Script withApproveInfo(ApproveInfo approveInfo) {
        this.approveInfo = approveInfo;
        return this;
    }

    public Script withApproveInfo(Consumer<ApproveInfo> approveInfoSetter) {
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

    

    public Script withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 创建人，比如为：张三
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public Script withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
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

    

    public Script withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 脚本描述，脚本描述,对脚本进行描述，最大长度为1000
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Script withEnterpriseProjectId(String enterpriseProjectId) {
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

    

    public Script withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 脚本id，根据UUID.randomUUID生成。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Script withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 脚本名称，支持数字，下划线，大小写字母 ,中文
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Script withOnlineExistStatus(Boolean onlineExistStatus) {
        this.onlineExistStatus = onlineExistStatus;
        return this;
    }

    


    /**
     * 脚本中是否有已上线的版本，true表示有已上线的版本，false表示没有已上线的版本
     * @return onlineExistStatus
     */
    public Boolean getOnlineExistStatus() {
        return onlineExistStatus;
    }

    public void setOnlineExistStatus(Boolean onlineExistStatus) {
        this.onlineExistStatus = onlineExistStatus;
    }

    

    public Script withOnlineId(String onlineId) {
        this.onlineId = onlineId;
        return this;
    }

    


    /**
     * 已上线版本id
     * @return onlineId
     */
    public String getOnlineId() {
        return onlineId;
    }

    public void setOnlineId(String onlineId) {
        this.onlineId = onlineId;
    }

    

    public Script withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户从IAM申请到的projectid，一般为32位字符串
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public Script withRateControl(RateControl rateControl) {
        this.rateControl = rateControl;
        return this;
    }

    public Script withRateControl(Consumer<RateControl> rateControlSetter) {
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

    

    public Script withScriptLanguage(String scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
        return this;
    }

    


    /**
     * 脚本语言，目前支持四种，分别是：SHELL BAT PYTHON POWER_SHELL
     * @return scriptLanguage
     */
    public String getScriptLanguage() {
        return scriptLanguage;
    }

    public void setScriptLanguage(String scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
    }

    

    public Script withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    


    /**
     * 修改人
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    

    public Script withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 实体的最后更新时间戳。 注意：执行创建/修改/删除操作时，update_time将更新。
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Script script = (Script) o;
        return Objects.equals(this.approveInfo, script.approveInfo) &&
            Objects.equals(this.createBy, script.createBy) &&
            Objects.equals(this.createTime, script.createTime) &&
            Objects.equals(this.description, script.description) &&
            Objects.equals(this.enterpriseProjectId, script.enterpriseProjectId) &&
            Objects.equals(this.id, script.id) &&
            Objects.equals(this.name, script.name) &&
            Objects.equals(this.onlineExistStatus, script.onlineExistStatus) &&
            Objects.equals(this.onlineId, script.onlineId) &&
            Objects.equals(this.projectId, script.projectId) &&
            Objects.equals(this.rateControl, script.rateControl) &&
            Objects.equals(this.scriptLanguage, script.scriptLanguage) &&
            Objects.equals(this.updateBy, script.updateBy) &&
            Objects.equals(this.updateTime, script.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(approveInfo, createBy, createTime, description, enterpriseProjectId, id, name, onlineExistStatus, onlineId, projectId, rateControl, scriptLanguage, updateBy, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Script {\n");
        sb.append("    approveInfo: ").append(toIndentedString(approveInfo)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    onlineExistStatus: ").append(toIndentedString(onlineExistStatus)).append("\n");
        sb.append("    onlineId: ").append(toIndentedString(onlineId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    rateControl: ").append(toIndentedString(rateControl)).append("\n");
        sb.append("    scriptLanguage: ").append(toIndentedString(scriptLanguage)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
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

