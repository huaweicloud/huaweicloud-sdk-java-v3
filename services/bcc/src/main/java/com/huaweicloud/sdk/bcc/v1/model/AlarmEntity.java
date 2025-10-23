package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警实体类
 */
public class AlarmEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_record_id")

    private String alarmRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AlarmStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private AlarmTypeEnum alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private AlarmNamespaceEnum namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_resource")

    private String abnormalResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_policy")

    private String alarmPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_name")

    private String alarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_id")

    private String alarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_datapoints")

    private String alarmDatapoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private String metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private String alarmActions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private String okActions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_info")

    private String additionalInfo;

    public AlarmEntity withAlarmRecordId(String alarmRecordId) {
        this.alarmRecordId = alarmRecordId;
        return this;
    }

    /**
     * 告警记录ID
     * @return alarmRecordId
     */
    public String getAlarmRecordId() {
        return alarmRecordId;
    }

    public void setAlarmRecordId(String alarmRecordId) {
        this.alarmRecordId = alarmRecordId;
    }

    public AlarmEntity withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目ID
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public AlarmEntity withStatus(AlarmStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AlarmStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AlarmStatusEnum status) {
        this.status = status;
    }

    public AlarmEntity withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 告警级别,取值范围：1,2,3,4
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public AlarmEntity withGenerateTime(String generateTime) {
        this.generateTime = generateTime;
        return this;
    }

    /**
     * 告警产生时间
     * @return generateTime
     */
    public String getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
    }

    public AlarmEntity withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public AlarmEntity withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 持续时长
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public AlarmEntity withAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * Get alarmType
     * @return alarmType
     */
    public AlarmTypeEnum getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
    }

    public AlarmEntity withNamespace(AlarmNamespaceEnum namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get namespace
     * @return namespace
     */
    public AlarmNamespaceEnum getNamespace() {
        return namespace;
    }

    public void setNamespace(AlarmNamespaceEnum namespace) {
        this.namespace = namespace;
    }

    public AlarmEntity withAbnormalResource(String abnormalResource) {
        this.abnormalResource = abnormalResource;
        return this;
    }

    /**
     * 异常资源数量
     * @return abnormalResource
     */
    public String getAbnormalResource() {
        return abnormalResource;
    }

    public void setAbnormalResource(String abnormalResource) {
        this.abnormalResource = abnormalResource;
    }

    public AlarmEntity withAlarmPolicy(String alarmPolicy) {
        this.alarmPolicy = alarmPolicy;
        return this;
    }

    /**
     * 告警策略
     * @return alarmPolicy
     */
    public String getAlarmPolicy() {
        return alarmPolicy;
    }

    public void setAlarmPolicy(String alarmPolicy) {
        this.alarmPolicy = alarmPolicy;
    }

    public AlarmEntity withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * RegionID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AlarmEntity withAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }

    /**
     * 告警规则名称
     * @return alarmRuleName
     */
    public String getAlarmRuleName() {
        return alarmRuleName;
    }

    public void setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
    }

    public AlarmEntity withAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    /**
     * 告警规则ID
     * @return alarmRuleId
     */
    public String getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public AlarmEntity withAlarmDatapoints(String alarmDatapoints) {
        this.alarmDatapoints = alarmDatapoints;
        return this;
    }

    /**
     * 计算出该条告警记录的资源监控数据上报时间和监控数值
     * @return alarmDatapoints
     */
    public String getAlarmDatapoints() {
        return alarmDatapoints;
    }

    public void setAlarmDatapoints(String alarmDatapoints) {
        this.alarmDatapoints = alarmDatapoints;
    }

    public AlarmEntity withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 告警指标
     * @return metric
     */
    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public AlarmEntity withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 告警触发条件
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public AlarmEntity withAlarmActions(String alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    /**
     * 告警触发的动作
     * @return alarmActions
     */
    public String getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(String alarmActions) {
        this.alarmActions = alarmActions;
    }

    public AlarmEntity withOkActions(String okActions) {
        this.okActions = okActions;
        return this;
    }

    /**
     * 告警恢复触发的动作
     * @return okActions
     */
    public String getOkActions() {
        return okActions;
    }

    public void setOkActions(String okActions) {
        this.okActions = okActions;
    }

    public AlarmEntity withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * 告警记录额外字段
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmEntity that = (AlarmEntity) obj;
        return Objects.equals(this.alarmRecordId, that.alarmRecordId) && Objects.equals(this.epsId, that.epsId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.generateTime, that.generateTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.alarmType, that.alarmType) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.abnormalResource, that.abnormalResource)
            && Objects.equals(this.alarmPolicy, that.alarmPolicy) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.alarmRuleName, that.alarmRuleName)
            && Objects.equals(this.alarmRuleId, that.alarmRuleId)
            && Objects.equals(this.alarmDatapoints, that.alarmDatapoints) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.alarmActions, that.alarmActions)
            && Objects.equals(this.okActions, that.okActions)
            && Objects.equals(this.additionalInfo, that.additionalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRecordId,
            epsId,
            status,
            severity,
            generateTime,
            lastUpdateTime,
            duration,
            alarmType,
            namespace,
            abnormalResource,
            alarmPolicy,
            regionId,
            alarmRuleName,
            alarmRuleId,
            alarmDatapoints,
            metric,
            condition,
            alarmActions,
            okActions,
            additionalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmEntity {\n");
        sb.append("    alarmRecordId: ").append(toIndentedString(alarmRecordId)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    abnormalResource: ").append(toIndentedString(abnormalResource)).append("\n");
        sb.append("    alarmPolicy: ").append(toIndentedString(alarmPolicy)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    alarmDatapoints: ").append(toIndentedString(alarmDatapoints)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
