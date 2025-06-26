package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiagnosisSummaryItem
 */
public class DiagnosisSummaryItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_item_num")

    private Integer normalItemNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_item_num")

    private Integer abnormalItemNum;

    public DiagnosisSummaryItem withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 被诊断实例的ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DiagnosisSummaryItem withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 被诊断实例的名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DiagnosisSummaryItem withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 被诊断实例的诊断进度
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public DiagnosisSummaryItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 诊断任务状态，waiting,executing,failed,finish,cancel
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiagnosisSummaryItem withNormalItemNum(Integer normalItemNum) {
        this.normalItemNum = normalItemNum;
        return this;
    }

    /**
     * 实例的正常诊断项数量
     * minimum: 0
     * maximum: 10000
     * @return normalItemNum
     */
    public Integer getNormalItemNum() {
        return normalItemNum;
    }

    public void setNormalItemNum(Integer normalItemNum) {
        this.normalItemNum = normalItemNum;
    }

    public DiagnosisSummaryItem withAbnormalItemNum(Integer abnormalItemNum) {
        this.abnormalItemNum = abnormalItemNum;
        return this;
    }

    /**
     * 实例的异常诊断项数量
     * minimum: 0
     * maximum: 10000
     * @return abnormalItemNum
     */
    public Integer getAbnormalItemNum() {
        return abnormalItemNum;
    }

    public void setAbnormalItemNum(Integer abnormalItemNum) {
        this.abnormalItemNum = abnormalItemNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisSummaryItem that = (DiagnosisSummaryItem) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.status, that.status)
            && Objects.equals(this.normalItemNum, that.normalItemNum)
            && Objects.equals(this.abnormalItemNum, that.abnormalItemNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, progress, status, normalItemNum, abnormalItemNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisSummaryItem {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    normalItemNum: ").append(toIndentedString(normalItemNum)).append("\n");
        sb.append("    abnormalItemNum: ").append(toIndentedString(abnormalItemNum)).append("\n");
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
