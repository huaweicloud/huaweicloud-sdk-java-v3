package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiagnosisReportResp
 */
public class DiagnosisReportResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_nums")

    private Integer consumerNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creat_at")

    private Long creatAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_item_sum")

    private Integer abnormalItemSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "faulted_node_sum")

    private Integer faultedNodeSum;

    public DiagnosisReportResp withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**： 报告ID。 **取值范围**： 不涉及。
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public DiagnosisReportResp withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 消费组名称。 **取值范围**： 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DiagnosisReportResp withConsumerNums(Integer consumerNums) {
        this.consumerNums = consumerNums;
        return this;
    }

    /**
     * **参数解释**： 消费者数量。 **取值范围**： 不涉及。
     * @return consumerNums
     */
    public Integer getConsumerNums() {
        return consumerNums;
    }

    public void setConsumerNums(Integer consumerNums) {
        this.consumerNums = consumerNums;
    }

    public DiagnosisReportResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiagnosisReportResp withCreatAt(Long creatAt) {
        this.creatAt = creatAt;
        return this;
    }

    /**
     * **参数解释**： 生成时间。 **取值范围**： 不涉及。
     * @return creatAt
     */
    public Long getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Long creatAt) {
        this.creatAt = creatAt;
    }

    public DiagnosisReportResp withAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
        return this;
    }

    /**
     * **参数解释**： 异常项数量。 **取值范围**： 不涉及。
     * @return abnormalItemSum
     */
    public Integer getAbnormalItemSum() {
        return abnormalItemSum;
    }

    public void setAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
    }

    public DiagnosisReportResp withFaultedNodeSum(Integer faultedNodeSum) {
        this.faultedNodeSum = faultedNodeSum;
        return this;
    }

    /**
     * **参数解释**： 异常节点数量。 **取值范围**： 不涉及。
     * @return faultedNodeSum
     */
    public Integer getFaultedNodeSum() {
        return faultedNodeSum;
    }

    public void setFaultedNodeSum(Integer faultedNodeSum) {
        this.faultedNodeSum = faultedNodeSum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisReportResp that = (DiagnosisReportResp) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.consumerNums, that.consumerNums) && Objects.equals(this.status, that.status)
            && Objects.equals(this.creatAt, that.creatAt) && Objects.equals(this.abnormalItemSum, that.abnormalItemSum)
            && Objects.equals(this.faultedNodeSum, that.faultedNodeSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, groupName, consumerNums, status, creatAt, abnormalItemSum, faultedNodeSum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisReportResp {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    consumerNums: ").append(toIndentedString(consumerNums)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    creatAt: ").append(toIndentedString(creatAt)).append("\n");
        sb.append("    abnormalItemSum: ").append(toIndentedString(abnormalItemSum)).append("\n");
        sb.append("    faultedNodeSum: ").append(toIndentedString(faultedNodeSum)).append("\n");
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
