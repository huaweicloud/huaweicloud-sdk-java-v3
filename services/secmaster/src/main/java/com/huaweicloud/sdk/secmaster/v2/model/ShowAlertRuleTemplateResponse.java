package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAlertRuleTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accumulated_times")

    private Integer accumulatedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_quota_amount")

    private BigDecimal cuQuotaAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private AlertRuleEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode")

    private IsapJobMode jobMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode_setting")

    private IsapJobModeSettingVo jobModeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_output_setting")

    private IsapJobOutputSetting jobOutputSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_error")

    private ProcessError processError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private ProcessStatus processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryType queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script")

    private String script;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<Trigger> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ShowAlertRuleTemplateResponse withAccumulatedTimes(Integer accumulatedTimes) {
        this.accumulatedTimes = accumulatedTimes;
        return this;
    }

    /**
     * 累计次数
     * minimum: 0
     * maximum: 500
     * @return accumulatedTimes
     */
    public Integer getAccumulatedTimes() {
        return accumulatedTimes;
    }

    public void setAccumulatedTimes(Integer accumulatedTimes) {
        this.accumulatedTimes = accumulatedTimes;
    }

    public ShowAlertRuleTemplateResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * UUID
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ShowAlertRuleTemplateResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowAlertRuleTemplateResponse withCuQuotaAmount(BigDecimal cuQuotaAmount) {
        this.cuQuotaAmount = cuQuotaAmount;
        return this;
    }

    /**
     * 数量
     * minimum: 0.1
     * maximum: 5E+2
     * @return cuQuotaAmount
     */
    public BigDecimal getCuQuotaAmount() {
        return cuQuotaAmount;
    }

    public void setCuQuotaAmount(BigDecimal cuQuotaAmount) {
        this.cuQuotaAmount = cuQuotaAmount;
    }

    public ShowAlertRuleTemplateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 告警规则模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowAlertRuleTemplateResponse withEnvironment(AlertRuleEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public AlertRuleEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(AlertRuleEnvironment environment) {
        this.environment = environment;
    }

    public ShowAlertRuleTemplateResponse withJobMode(IsapJobMode jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * Get jobMode
     * @return jobMode
     */
    public IsapJobMode getJobMode() {
        return jobMode;
    }

    public void setJobMode(IsapJobMode jobMode) {
        this.jobMode = jobMode;
    }

    public ShowAlertRuleTemplateResponse withJobModeSetting(IsapJobModeSettingVo jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
        return this;
    }

    public ShowAlertRuleTemplateResponse withJobModeSetting(Consumer<IsapJobModeSettingVo> jobModeSettingSetter) {
        if (this.jobModeSetting == null) {
            this.jobModeSetting = new IsapJobModeSettingVo();
            jobModeSettingSetter.accept(this.jobModeSetting);
        }

        return this;
    }

    /**
     * Get jobModeSetting
     * @return jobModeSetting
     */
    public IsapJobModeSettingVo getJobModeSetting() {
        return jobModeSetting;
    }

    public void setJobModeSetting(IsapJobModeSettingVo jobModeSetting) {
        this.jobModeSetting = jobModeSetting;
    }

    public ShowAlertRuleTemplateResponse withJobOutputSetting(IsapJobOutputSetting jobOutputSetting) {
        this.jobOutputSetting = jobOutputSetting;
        return this;
    }

    public ShowAlertRuleTemplateResponse withJobOutputSetting(Consumer<IsapJobOutputSetting> jobOutputSettingSetter) {
        if (this.jobOutputSetting == null) {
            this.jobOutputSetting = new IsapJobOutputSetting();
            jobOutputSettingSetter.accept(this.jobOutputSetting);
        }

        return this;
    }

    /**
     * Get jobOutputSetting
     * @return jobOutputSetting
     */
    public IsapJobOutputSetting getJobOutputSetting() {
        return jobOutputSetting;
    }

    public void setJobOutputSetting(IsapJobOutputSetting jobOutputSetting) {
        this.jobOutputSetting = jobOutputSetting;
    }

    public ShowAlertRuleTemplateResponse withProcessError(ProcessError processError) {
        this.processError = processError;
        return this;
    }

    /**
     * Get processError
     * @return processError
     */
    public ProcessError getProcessError() {
        return processError;
    }

    public void setProcessError(ProcessError processError) {
        this.processError = processError;
    }

    public ShowAlertRuleTemplateResponse withProcessStatus(ProcessStatus processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * Get processStatus
     * @return processStatus
     */
    public ProcessStatus getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(ProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    public ShowAlertRuleTemplateResponse withQueryType(QueryType queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * Get queryType
     * @return queryType
     */
    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public ShowAlertRuleTemplateResponse withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Script 脚本
     * @return script
     */
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public ShowAlertRuleTemplateResponse withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ShowAlertRuleTemplateResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ShowAlertRuleTemplateResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * UUID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ShowAlertRuleTemplateResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ShowAlertRuleTemplateResponse withTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ShowAlertRuleTemplateResponse addTriggersItem(Trigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ShowAlertRuleTemplateResponse withTriggers(Consumer<List<Trigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 触发器数组
     * @return triggers
     */
    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public ShowAlertRuleTemplateResponse withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * UUID
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public ShowAlertRuleTemplateResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
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
        ShowAlertRuleTemplateResponse that = (ShowAlertRuleTemplateResponse) obj;
        return Objects.equals(this.accumulatedTimes, that.accumulatedTimes)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.cuQuotaAmount, that.cuQuotaAmount)
            && Objects.equals(this.description, that.description) && Objects.equals(this.environment, that.environment)
            && Objects.equals(this.jobMode, that.jobMode) && Objects.equals(this.jobModeSetting, that.jobModeSetting)
            && Objects.equals(this.jobOutputSetting, that.jobOutputSetting)
            && Objects.equals(this.processError, that.processError)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.script, that.script) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.templateName, that.templateName) && Objects.equals(this.triggers, that.triggers)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accumulatedTimes,
            createBy,
            createTime,
            cuQuotaAmount,
            description,
            environment,
            jobMode,
            jobModeSetting,
            jobOutputSetting,
            processError,
            processStatus,
            queryType,
            script,
            status,
            tableName,
            templateId,
            templateName,
            triggers,
            updateBy,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlertRuleTemplateResponse {\n");
        sb.append("    accumulatedTimes: ").append(toIndentedString(accumulatedTimes)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    cuQuotaAmount: ").append(toIndentedString(cuQuotaAmount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
        sb.append("    jobModeSetting: ").append(toIndentedString(jobModeSetting)).append("\n");
        sb.append("    jobOutputSetting: ").append(toIndentedString(jobOutputSetting)).append("\n");
        sb.append("    processError: ").append(toIndentedString(processError)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
