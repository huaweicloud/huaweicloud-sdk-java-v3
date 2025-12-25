package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlertRuleTemplate
 */
public class AlertRuleTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accumulated_times")

    private Integer accumulatedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_description")

    private String alertDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_name")

    private String alertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_remediation")

    private String alertRemediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private Map<String, String> alertType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_properties")

    private Map<String, String> customProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_grouping")

    private Boolean eventGrouping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode")

    private JobMode jobMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private ProcessStatus processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryType queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private AlertRuleSchedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private Serverity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simulation")

    private Boolean simulation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suppresion")

    private Boolean suppresion;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_by_user")

    private Long updateTimeByUser;

    public AlertRuleTemplate withAccumulatedTimes(Integer accumulatedTimes) {
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

    public AlertRuleTemplate withAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
        return this;
    }

    /**
     * 告警描述
     * @return alertDescription
     */
    public String getAlertDescription() {
        return alertDescription;
    }

    public void setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
    }

    public AlertRuleTemplate withAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }

    /**
     * 告警名称
     * @return alertName
     */
    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public AlertRuleTemplate withAlertRemediation(String alertRemediation) {
        this.alertRemediation = alertRemediation;
        return this;
    }

    /**
     * 告警修复
     * @return alertRemediation
     */
    public String getAlertRemediation() {
        return alertRemediation;
    }

    public void setAlertRemediation(String alertRemediation) {
        this.alertRemediation = alertRemediation;
    }

    public AlertRuleTemplate withAlertType(Map<String, String> alertType) {
        this.alertType = alertType;
        return this;
    }

    public AlertRuleTemplate putAlertTypeItem(String key, String alertTypeItem) {
        if (this.alertType == null) {
            this.alertType = new HashMap<>();
        }
        this.alertType.put(key, alertTypeItem);
        return this;
    }

    public AlertRuleTemplate withAlertType(Consumer<Map<String, String>> alertTypeSetter) {
        if (this.alertType == null) {
            this.alertType = new HashMap<>();
        }
        alertTypeSetter.accept(this.alertType);
        return this;
    }

    /**
     * Map<String,String>
     * @return alertType
     */
    public Map<String, String> getAlertType() {
        return alertType;
    }

    public void setAlertType(Map<String, String> alertType) {
        this.alertType = alertType;
    }

    public AlertRuleTemplate withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * Iam用户ID
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public AlertRuleTemplate withCreateTime(Long createTime) {
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

    public AlertRuleTemplate withCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    public AlertRuleTemplate putCustomPropertiesItem(String key, String customPropertiesItem) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        this.customProperties.put(key, customPropertiesItem);
        return this;
    }

    public AlertRuleTemplate withCustomProperties(Consumer<Map<String, String>> customPropertiesSetter) {
        if (this.customProperties == null) {
            this.customProperties = new HashMap<>();
        }
        customPropertiesSetter.accept(this.customProperties);
        return this;
    }

    /**
     * Map<String,String>
     * @return customProperties
     */
    public Map<String, String> getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
    }

    public AlertRuleTemplate withDescription(String description) {
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

    public AlertRuleTemplate withEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
        return this;
    }

    /**
     * 告警组
     * @return eventGrouping
     */
    public Boolean getEventGrouping() {
        return eventGrouping;
    }

    public void setEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
    }

    public AlertRuleTemplate withJobMode(JobMode jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * Get jobMode
     * @return jobMode
     */
    public JobMode getJobMode() {
        return jobMode;
    }

    public void setJobMode(JobMode jobMode) {
        this.jobMode = jobMode;
    }

    public AlertRuleTemplate withProcessStatus(ProcessStatus processStatus) {
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

    public AlertRuleTemplate withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询语句
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public AlertRuleTemplate withQueryType(QueryType queryType) {
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

    public AlertRuleTemplate withSchedule(AlertRuleSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public AlertRuleTemplate withSchedule(Consumer<AlertRuleSchedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new AlertRuleSchedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public AlertRuleSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(AlertRuleSchedule schedule) {
        this.schedule = schedule;
    }

    public AlertRuleTemplate withSeverity(Serverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public Serverity getSeverity() {
        return severity;
    }

    public void setSeverity(Serverity severity) {
        this.severity = severity;
    }

    public AlertRuleTemplate withSimulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }

    /**
     * 是否仿真
     * @return simulation
     */
    public Boolean getSimulation() {
        return simulation;
    }

    public void setSimulation(Boolean simulation) {
        this.simulation = simulation;
    }

    public AlertRuleTemplate withStatus(Status status) {
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

    public AlertRuleTemplate withSuppresion(Boolean suppresion) {
        this.suppresion = suppresion;
        return this;
    }

    /**
     * 告警抑制
     * @return suppresion
     */
    public Boolean getSuppresion() {
        return suppresion;
    }

    public void setSuppresion(Boolean suppresion) {
        this.suppresion = suppresion;
    }

    public AlertRuleTemplate withTableName(String tableName) {
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

    public AlertRuleTemplate withTemplateId(String templateId) {
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

    public AlertRuleTemplate withTemplateName(String templateName) {
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

    public AlertRuleTemplate withTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public AlertRuleTemplate addTriggersItem(Trigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public AlertRuleTemplate withTriggers(Consumer<List<Trigger>> triggersSetter) {
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

    public AlertRuleTemplate withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * Iam用户ID
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public AlertRuleTemplate withUpdateTime(Long updateTime) {
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

    public AlertRuleTemplate withUpdateTimeByUser(Long updateTimeByUser) {
        this.updateTimeByUser = updateTimeByUser;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return updateTimeByUser
     */
    public Long getUpdateTimeByUser() {
        return updateTimeByUser;
    }

    public void setUpdateTimeByUser(Long updateTimeByUser) {
        this.updateTimeByUser = updateTimeByUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertRuleTemplate that = (AlertRuleTemplate) obj;
        return Objects.equals(this.accumulatedTimes, that.accumulatedTimes)
            && Objects.equals(this.alertDescription, that.alertDescription)
            && Objects.equals(this.alertName, that.alertName)
            && Objects.equals(this.alertRemediation, that.alertRemediation)
            && Objects.equals(this.alertType, that.alertType) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.customProperties, that.customProperties)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.eventGrouping, that.eventGrouping) && Objects.equals(this.jobMode, that.jobMode)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.query, that.query)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.schedule, that.schedule)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.simulation, that.simulation)
            && Objects.equals(this.status, that.status) && Objects.equals(this.suppresion, that.suppresion)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.templateName, that.templateName) && Objects.equals(this.triggers, that.triggers)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeByUser, that.updateTimeByUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accumulatedTimes,
            alertDescription,
            alertName,
            alertRemediation,
            alertType,
            createBy,
            createTime,
            customProperties,
            description,
            eventGrouping,
            jobMode,
            processStatus,
            query,
            queryType,
            schedule,
            severity,
            simulation,
            status,
            suppresion,
            tableName,
            templateId,
            templateName,
            triggers,
            updateBy,
            updateTime,
            updateTimeByUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRuleTemplate {\n");
        sb.append("    accumulatedTimes: ").append(toIndentedString(accumulatedTimes)).append("\n");
        sb.append("    alertDescription: ").append(toIndentedString(alertDescription)).append("\n");
        sb.append("    alertName: ").append(toIndentedString(alertName)).append("\n");
        sb.append("    alertRemediation: ").append(toIndentedString(alertRemediation)).append("\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eventGrouping: ").append(toIndentedString(eventGrouping)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    suppresion: ").append(toIndentedString(suppresion)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeByUser: ").append(toIndentedString(updateTimeByUser)).append("\n");
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
