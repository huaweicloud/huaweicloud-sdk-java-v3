package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecuritySensitiveDataDiagnoseResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning")

    private Boolean scanning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_time")

    private Long checkTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification")

    private ClassificationResult classification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private IdentificationRuleResult rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masking")

    private DataMaskingResult masking;

    public ShowSecuritySensitiveDataDiagnoseResultResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 诊断任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withScanning(Boolean scanning) {
        this.scanning = scanning;
        return this;
    }

    /**
     * 是否正在扫描
     * @return scanning
     */
    public Boolean getScanning() {
        return scanning;
    }

    public void setScanning(Boolean scanning) {
        this.scanning = scanning;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withCheckTime(Long checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    /**
     * 最新检测时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return checkTime
     */
    public Long getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withClassification(ClassificationResult classification) {
        this.classification = classification;
        return this;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withClassification(
        Consumer<ClassificationResult> classificationSetter) {
        if (this.classification == null) {
            this.classification = new ClassificationResult();
            classificationSetter.accept(this.classification);
        }

        return this;
    }

    /**
     * Get classification
     * @return classification
     */
    public ClassificationResult getClassification() {
        return classification;
    }

    public void setClassification(ClassificationResult classification) {
        this.classification = classification;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withRule(IdentificationRuleResult rule) {
        this.rule = rule;
        return this;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withRule(Consumer<IdentificationRuleResult> ruleSetter) {
        if (this.rule == null) {
            this.rule = new IdentificationRuleResult();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public IdentificationRuleResult getRule() {
        return rule;
    }

    public void setRule(IdentificationRuleResult rule) {
        this.rule = rule;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withMasking(DataMaskingResult masking) {
        this.masking = masking;
        return this;
    }

    public ShowSecuritySensitiveDataDiagnoseResultResponse withMasking(Consumer<DataMaskingResult> maskingSetter) {
        if (this.masking == null) {
            this.masking = new DataMaskingResult();
            maskingSetter.accept(this.masking);
        }

        return this;
    }

    /**
     * Get masking
     * @return masking
     */
    public DataMaskingResult getMasking() {
        return masking;
    }

    public void setMasking(DataMaskingResult masking) {
        this.masking = masking;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecuritySensitiveDataDiagnoseResultResponse that = (ShowSecuritySensitiveDataDiagnoseResultResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.scanning, that.scanning)
            && Objects.equals(this.checkTime, that.checkTime)
            && Objects.equals(this.classification, that.classification) && Objects.equals(this.rule, that.rule)
            && Objects.equals(this.masking, that.masking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, scanning, checkTime, classification, rule, masking);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecuritySensitiveDataDiagnoseResultResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    scanning: ").append(toIndentedString(scanning)).append("\n");
        sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    masking: ").append(toIndentedString(masking)).append("\n");
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
