package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警信息视图。
 */
public class AlarmDataVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private String gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_alarm_event_id")

    private Long regionAlarmEventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_name")

    private String businessName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_number")

    private Integer versionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_type")

    private String alarmRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modify")

    private String gmtModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_unit")

    private String processUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_id")

    private Long alarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_id")

    private Long monitorItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_id")

    private Integer collectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_name")

    private String collectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_name")

    private String alarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_expression")

    private String alarmRuleExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_first_time")

    private String alarmFirstTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_last_time")

    private String alarmLastTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restrain_key")

    private String restrainKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public AlarmDataVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 告警通知id。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AlarmDataVO withGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    /**
     * 创建时间。
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public AlarmDataVO withRegionAlarmEventId(Long regionAlarmEventId) {
        this.regionAlarmEventId = regionAlarmEventId;
        return this;
    }

    /**
     * region中事件的id。
     * @return regionAlarmEventId
     */
    public Long getRegionAlarmEventId() {
        return regionAlarmEventId;
    }

    public void setRegionAlarmEventId(Long regionAlarmEventId) {
        this.regionAlarmEventId = regionAlarmEventId;
    }

    public AlarmDataVO withBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    /**
     * 应用名称。
     * @return businessName
     */
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public AlarmDataVO withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组件名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AlarmDataVO withVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * 版本。
     * @return versionNumber
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public AlarmDataVO withAlarmRuleType(String alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
        return this;
    }

    /**
     * 告警规则类别。
     * @return alarmRuleType
     */
    public String getAlarmRuleType() {
        return alarmRuleType;
    }

    public void setAlarmRuleType(String alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
    }

    public AlarmDataVO withGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }

    /**
     * 修改时间。
     * @return gmtModify
     */
    public String getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
    }

    public AlarmDataVO withProcessUnit(String processUnit) {
        this.processUnit = processUnit;
        return this;
    }

    /**
     * 处理单元。
     * @return processUnit
     */
    public String getProcessUnit() {
        return processUnit;
    }

    public void setProcessUnit(String processUnit) {
        this.processUnit = processUnit;
    }

    public AlarmDataVO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域名称。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AlarmDataVO withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public AlarmDataVO withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 实例ip地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AlarmDataVO withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public AlarmDataVO withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id。
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public AlarmDataVO withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public AlarmDataVO withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id。
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public AlarmDataVO withAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    /**
     * 告警规则id。
     * @return alarmRuleId
     */
    public Long getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public AlarmDataVO withMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }

    /**
     * 监控项id。
     * @return monitorItemId
     */
    public Long getMonitorItemId() {
        return monitorItemId;
    }

    public void setMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
    }

    public AlarmDataVO withCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
        return this;
    }

    /**
     * 采集器id。
     * @return collectorId
     */
    public Integer getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
    }

    public AlarmDataVO withCollectorName(String collectorName) {
        this.collectorName = collectorName;
        return this;
    }

    /**
     * 采集器名称。
     * @return collectorName
     */
    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public AlarmDataVO withAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }

    /**
     * 告警规则名称。
     * @return alarmRuleName
     */
    public String getAlarmRuleName() {
        return alarmRuleName;
    }

    public void setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
    }

    public AlarmDataVO withAlarmRuleExpression(String alarmRuleExpression) {
        this.alarmRuleExpression = alarmRuleExpression;
        return this;
    }

    /**
     * 告警表达式。
     * @return alarmRuleExpression
     */
    public String getAlarmRuleExpression() {
        return alarmRuleExpression;
    }

    public void setAlarmRuleExpression(String alarmRuleExpression) {
        this.alarmRuleExpression = alarmRuleExpression;
    }

    public AlarmDataVO withAlarmFirstTime(String alarmFirstTime) {
        this.alarmFirstTime = alarmFirstTime;
        return this;
    }

    /**
     * 开始报警时间。
     * @return alarmFirstTime
     */
    public String getAlarmFirstTime() {
        return alarmFirstTime;
    }

    public void setAlarmFirstTime(String alarmFirstTime) {
        this.alarmFirstTime = alarmFirstTime;
    }

    public AlarmDataVO withAlarmLastTime(String alarmLastTime) {
        this.alarmLastTime = alarmLastTime;
        return this;
    }

    /**
     * 最后一次报警时间。
     * @return alarmLastTime
     */
    public String getAlarmLastTime() {
        return alarmLastTime;
    }

    public void setAlarmLastTime(String alarmLastTime) {
        this.alarmLastTime = alarmLastTime;
    }

    public AlarmDataVO withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别。
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmDataVO withRestrainKey(String restrainKey) {
        this.restrainKey = restrainKey;
        return this;
    }

    /**
     * 唯一告警标识符。
     * @return restrainKey
     */
    public String getRestrainKey() {
        return restrainKey;
    }

    public void setRestrainKey(String restrainKey) {
        this.restrainKey = restrainKey;
    }

    public AlarmDataVO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 告警状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmDataVO that = (AlarmDataVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.regionAlarmEventId, that.regionAlarmEventId)
            && Objects.equals(this.businessName, that.businessName) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.versionNumber, that.versionNumber)
            && Objects.equals(this.alarmRuleType, that.alarmRuleType) && Objects.equals(this.gmtModify, that.gmtModify)
            && Objects.equals(this.processUnit, that.processUnit) && Objects.equals(this.region, that.region)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.envId, that.envId)
            && Objects.equals(this.businessId, that.businessId) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.alarmRuleId, that.alarmRuleId)
            && Objects.equals(this.monitorItemId, that.monitorItemId)
            && Objects.equals(this.collectorId, that.collectorId)
            && Objects.equals(this.collectorName, that.collectorName)
            && Objects.equals(this.alarmRuleName, that.alarmRuleName)
            && Objects.equals(this.alarmRuleExpression, that.alarmRuleExpression)
            && Objects.equals(this.alarmFirstTime, that.alarmFirstTime)
            && Objects.equals(this.alarmLastTime, that.alarmLastTime)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.restrainKey, that.restrainKey)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            gmtCreate,
            regionAlarmEventId,
            businessName,
            appName,
            versionNumber,
            alarmRuleType,
            gmtModify,
            processUnit,
            region,
            instanceId,
            ipAddress,
            instanceName,
            envId,
            businessId,
            templateId,
            alarmRuleId,
            monitorItemId,
            collectorId,
            collectorName,
            alarmRuleName,
            alarmRuleExpression,
            alarmFirstTime,
            alarmLastTime,
            alarmLevel,
            restrainKey,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmDataVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    regionAlarmEventId: ").append(toIndentedString(regionAlarmEventId)).append("\n");
        sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
        sb.append("    alarmRuleType: ").append(toIndentedString(alarmRuleType)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
        sb.append("    processUnit: ").append(toIndentedString(processUnit)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    monitorItemId: ").append(toIndentedString(monitorItemId)).append("\n");
        sb.append("    collectorId: ").append(toIndentedString(collectorId)).append("\n");
        sb.append("    collectorName: ").append(toIndentedString(collectorName)).append("\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
        sb.append("    alarmRuleExpression: ").append(toIndentedString(alarmRuleExpression)).append("\n");
        sb.append("    alarmFirstTime: ").append(toIndentedString(alarmFirstTime)).append("\n");
        sb.append("    alarmLastTime: ").append(toIndentedString(alarmLastTime)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    restrainKey: ").append(toIndentedString(restrainKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
