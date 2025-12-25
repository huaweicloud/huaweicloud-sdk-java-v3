package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警规则作业设置
 */
public class AlertRuleJobSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_custom_properties")

    private Map<String, String> alertCustomProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_description")

    private String alertDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_grouping")

    private Boolean alertGrouping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_mapping")

    private Map<String, String> alertMapping = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_name")

    private String alertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_remediation")

    private String alertRemediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_severity")

    private IsapAlertSeverity alertSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_suppression")

    private Boolean alertSuppression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private Map<String, String> alertType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_extraction")

    private Map<String, String> entityExtraction = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_mapping")

    private Map<String, String> fieldMapping = null;

    public AlertRuleJobSetting withAlertCustomProperties(Map<String, String> alertCustomProperties) {
        this.alertCustomProperties = alertCustomProperties;
        return this;
    }

    public AlertRuleJobSetting putAlertCustomPropertiesItem(String key, String alertCustomPropertiesItem) {
        if (this.alertCustomProperties == null) {
            this.alertCustomProperties = new HashMap<>();
        }
        this.alertCustomProperties.put(key, alertCustomPropertiesItem);
        return this;
    }

    public AlertRuleJobSetting withAlertCustomProperties(Consumer<Map<String, String>> alertCustomPropertiesSetter) {
        if (this.alertCustomProperties == null) {
            this.alertCustomProperties = new HashMap<>();
        }
        alertCustomPropertiesSetter.accept(this.alertCustomProperties);
        return this;
    }

    /**
     * 映射表
     * @return alertCustomProperties
     */
    public Map<String, String> getAlertCustomProperties() {
        return alertCustomProperties;
    }

    public void setAlertCustomProperties(Map<String, String> alertCustomProperties) {
        this.alertCustomProperties = alertCustomProperties;
    }

    public AlertRuleJobSetting withAlertDescription(String alertDescription) {
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

    public AlertRuleJobSetting withAlertGrouping(Boolean alertGrouping) {
        this.alertGrouping = alertGrouping;
        return this;
    }

    /**
     * 分组标志
     * @return alertGrouping
     */
    public Boolean getAlertGrouping() {
        return alertGrouping;
    }

    public void setAlertGrouping(Boolean alertGrouping) {
        this.alertGrouping = alertGrouping;
    }

    public AlertRuleJobSetting withAlertMapping(Map<String, String> alertMapping) {
        this.alertMapping = alertMapping;
        return this;
    }

    public AlertRuleJobSetting putAlertMappingItem(String key, String alertMappingItem) {
        if (this.alertMapping == null) {
            this.alertMapping = new HashMap<>();
        }
        this.alertMapping.put(key, alertMappingItem);
        return this;
    }

    public AlertRuleJobSetting withAlertMapping(Consumer<Map<String, String>> alertMappingSetter) {
        if (this.alertMapping == null) {
            this.alertMapping = new HashMap<>();
        }
        alertMappingSetter.accept(this.alertMapping);
        return this;
    }

    /**
     * 映射表
     * @return alertMapping
     */
    public Map<String, String> getAlertMapping() {
        return alertMapping;
    }

    public void setAlertMapping(Map<String, String> alertMapping) {
        this.alertMapping = alertMapping;
    }

    public AlertRuleJobSetting withAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }

    /**
     * 告警报名称
     * @return alertName
     */
    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public AlertRuleJobSetting withAlertRemediation(String alertRemediation) {
        this.alertRemediation = alertRemediation;
        return this;
    }

    /**
     * 告警修复建议
     * @return alertRemediation
     */
    public String getAlertRemediation() {
        return alertRemediation;
    }

    public void setAlertRemediation(String alertRemediation) {
        this.alertRemediation = alertRemediation;
    }

    public AlertRuleJobSetting withAlertSeverity(IsapAlertSeverity alertSeverity) {
        this.alertSeverity = alertSeverity;
        return this;
    }

    /**
     * Get alertSeverity
     * @return alertSeverity
     */
    public IsapAlertSeverity getAlertSeverity() {
        return alertSeverity;
    }

    public void setAlertSeverity(IsapAlertSeverity alertSeverity) {
        this.alertSeverity = alertSeverity;
    }

    public AlertRuleJobSetting withAlertSuppression(Boolean alertSuppression) {
        this.alertSuppression = alertSuppression;
        return this;
    }

    /**
     * 抑制标志
     * @return alertSuppression
     */
    public Boolean getAlertSuppression() {
        return alertSuppression;
    }

    public void setAlertSuppression(Boolean alertSuppression) {
        this.alertSuppression = alertSuppression;
    }

    public AlertRuleJobSetting withAlertType(Map<String, String> alertType) {
        this.alertType = alertType;
        return this;
    }

    public AlertRuleJobSetting putAlertTypeItem(String key, String alertTypeItem) {
        if (this.alertType == null) {
            this.alertType = new HashMap<>();
        }
        this.alertType.put(key, alertTypeItem);
        return this;
    }

    public AlertRuleJobSetting withAlertType(Consumer<Map<String, String>> alertTypeSetter) {
        if (this.alertType == null) {
            this.alertType = new HashMap<>();
        }
        alertTypeSetter.accept(this.alertType);
        return this;
    }

    /**
     * 告警类型映射表
     * @return alertType
     */
    public Map<String, String> getAlertType() {
        return alertType;
    }

    public void setAlertType(Map<String, String> alertType) {
        this.alertType = alertType;
    }

    public AlertRuleJobSetting withEntityExtraction(Map<String, String> entityExtraction) {
        this.entityExtraction = entityExtraction;
        return this;
    }

    public AlertRuleJobSetting putEntityExtractionItem(String key, String entityExtractionItem) {
        if (this.entityExtraction == null) {
            this.entityExtraction = new HashMap<>();
        }
        this.entityExtraction.put(key, entityExtractionItem);
        return this;
    }

    public AlertRuleJobSetting withEntityExtraction(Consumer<Map<String, String>> entityExtractionSetter) {
        if (this.entityExtraction == null) {
            this.entityExtraction = new HashMap<>();
        }
        entityExtractionSetter.accept(this.entityExtraction);
        return this;
    }

    /**
     * 提取的实体
     * @return entityExtraction
     */
    public Map<String, String> getEntityExtraction() {
        return entityExtraction;
    }

    public void setEntityExtraction(Map<String, String> entityExtraction) {
        this.entityExtraction = entityExtraction;
    }

    public AlertRuleJobSetting withFieldMapping(Map<String, String> fieldMapping) {
        this.fieldMapping = fieldMapping;
        return this;
    }

    public AlertRuleJobSetting putFieldMappingItem(String key, String fieldMappingItem) {
        if (this.fieldMapping == null) {
            this.fieldMapping = new HashMap<>();
        }
        this.fieldMapping.put(key, fieldMappingItem);
        return this;
    }

    public AlertRuleJobSetting withFieldMapping(Consumer<Map<String, String>> fieldMappingSetter) {
        if (this.fieldMapping == null) {
            this.fieldMapping = new HashMap<>();
        }
        fieldMappingSetter.accept(this.fieldMapping);
        return this;
    }

    /**
     * 字段映射
     * @return fieldMapping
     */
    public Map<String, String> getFieldMapping() {
        return fieldMapping;
    }

    public void setFieldMapping(Map<String, String> fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertRuleJobSetting that = (AlertRuleJobSetting) obj;
        return Objects.equals(this.alertCustomProperties, that.alertCustomProperties)
            && Objects.equals(this.alertDescription, that.alertDescription)
            && Objects.equals(this.alertGrouping, that.alertGrouping)
            && Objects.equals(this.alertMapping, that.alertMapping) && Objects.equals(this.alertName, that.alertName)
            && Objects.equals(this.alertRemediation, that.alertRemediation)
            && Objects.equals(this.alertSeverity, that.alertSeverity)
            && Objects.equals(this.alertSuppression, that.alertSuppression)
            && Objects.equals(this.alertType, that.alertType)
            && Objects.equals(this.entityExtraction, that.entityExtraction)
            && Objects.equals(this.fieldMapping, that.fieldMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertCustomProperties,
            alertDescription,
            alertGrouping,
            alertMapping,
            alertName,
            alertRemediation,
            alertSeverity,
            alertSuppression,
            alertType,
            entityExtraction,
            fieldMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRuleJobSetting {\n");
        sb.append("    alertCustomProperties: ").append(toIndentedString(alertCustomProperties)).append("\n");
        sb.append("    alertDescription: ").append(toIndentedString(alertDescription)).append("\n");
        sb.append("    alertGrouping: ").append(toIndentedString(alertGrouping)).append("\n");
        sb.append("    alertMapping: ").append(toIndentedString(alertMapping)).append("\n");
        sb.append("    alertName: ").append(toIndentedString(alertName)).append("\n");
        sb.append("    alertRemediation: ").append(toIndentedString(alertRemediation)).append("\n");
        sb.append("    alertSeverity: ").append(toIndentedString(alertSeverity)).append("\n");
        sb.append("    alertSuppression: ").append(toIndentedString(alertSuppression)).append("\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
        sb.append("    entityExtraction: ").append(toIndentedString(entityExtraction)).append("\n");
        sb.append("    fieldMapping: ").append(toIndentedString(fieldMapping)).append("\n");
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
