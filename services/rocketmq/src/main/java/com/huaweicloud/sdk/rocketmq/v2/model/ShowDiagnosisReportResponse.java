package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDiagnosisReportResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online")

    private Boolean online;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_accumulation")

    private Integer messageAccumulation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_consistency")

    private Boolean subscriptionConsistency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<String> subscriptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_node_report_list")

    private List<String> diagnosisNodeReportList = null;

    public ShowDiagnosisReportResponse withReportId(String reportId) {
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

    public ShowDiagnosisReportResponse withGroupName(String groupName) {
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

    public ShowDiagnosisReportResponse withConsumerNums(Integer consumerNums) {
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

    public ShowDiagnosisReportResponse withStatus(String status) {
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

    public ShowDiagnosisReportResponse withCreatAt(Long creatAt) {
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

    public ShowDiagnosisReportResponse withAbnormalItemSum(Integer abnormalItemSum) {
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

    public ShowDiagnosisReportResponse withFaultedNodeSum(Integer faultedNodeSum) {
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

    public ShowDiagnosisReportResponse withOnline(Boolean online) {
        this.online = online;
        return this;
    }

    /**
     * **参数解释**： 是否在线。 **取值范围**： - true: 在线。 - false: 不在线。
     * @return online
     */
    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public ShowDiagnosisReportResponse withMessageAccumulation(Integer messageAccumulation) {
        this.messageAccumulation = messageAccumulation;
        return this;
    }

    /**
     * **参数解释**： 消息堆积数。 **取值范围**： 不涉及。
     * @return messageAccumulation
     */
    public Integer getMessageAccumulation() {
        return messageAccumulation;
    }

    public void setMessageAccumulation(Integer messageAccumulation) {
        this.messageAccumulation = messageAccumulation;
    }

    public ShowDiagnosisReportResponse withSubscriptionConsistency(Boolean subscriptionConsistency) {
        this.subscriptionConsistency = subscriptionConsistency;
        return this;
    }

    /**
     * **参数解释**： 订阅一致性。 **取值范围**： - true: 订阅关系一致。 - false: 订阅关系不一致。
     * @return subscriptionConsistency
     */
    public Boolean getSubscriptionConsistency() {
        return subscriptionConsistency;
    }

    public void setSubscriptionConsistency(Boolean subscriptionConsistency) {
        this.subscriptionConsistency = subscriptionConsistency;
    }

    public ShowDiagnosisReportResponse withSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public ShowDiagnosisReportResponse addSubscriptionsItem(String subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public ShowDiagnosisReportResponse withSubscriptions(Consumer<List<String>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * **参数解释**： 订阅者列表。 **取值范围**： 不涉及。
     * @return subscriptions
     */
    public List<String> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public ShowDiagnosisReportResponse withDiagnosisNodeReportList(List<String> diagnosisNodeReportList) {
        this.diagnosisNodeReportList = diagnosisNodeReportList;
        return this;
    }

    public ShowDiagnosisReportResponse addDiagnosisNodeReportListItem(String diagnosisNodeReportListItem) {
        if (this.diagnosisNodeReportList == null) {
            this.diagnosisNodeReportList = new ArrayList<>();
        }
        this.diagnosisNodeReportList.add(diagnosisNodeReportListItem);
        return this;
    }

    public ShowDiagnosisReportResponse withDiagnosisNodeReportList(
        Consumer<List<String>> diagnosisNodeReportListSetter) {
        if (this.diagnosisNodeReportList == null) {
            this.diagnosisNodeReportList = new ArrayList<>();
        }
        diagnosisNodeReportListSetter.accept(this.diagnosisNodeReportList);
        return this;
    }

    /**
     * **参数解释**： 诊断节点报告列表。 **取值范围**： 不涉及。
     * @return diagnosisNodeReportList
     */
    public List<String> getDiagnosisNodeReportList() {
        return diagnosisNodeReportList;
    }

    public void setDiagnosisNodeReportList(List<String> diagnosisNodeReportList) {
        this.diagnosisNodeReportList = diagnosisNodeReportList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDiagnosisReportResponse that = (ShowDiagnosisReportResponse) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.consumerNums, that.consumerNums) && Objects.equals(this.status, that.status)
            && Objects.equals(this.creatAt, that.creatAt) && Objects.equals(this.abnormalItemSum, that.abnormalItemSum)
            && Objects.equals(this.faultedNodeSum, that.faultedNodeSum) && Objects.equals(this.online, that.online)
            && Objects.equals(this.messageAccumulation, that.messageAccumulation)
            && Objects.equals(this.subscriptionConsistency, that.subscriptionConsistency)
            && Objects.equals(this.subscriptions, that.subscriptions)
            && Objects.equals(this.diagnosisNodeReportList, that.diagnosisNodeReportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId,
            groupName,
            consumerNums,
            status,
            creatAt,
            abnormalItemSum,
            faultedNodeSum,
            online,
            messageAccumulation,
            subscriptionConsistency,
            subscriptions,
            diagnosisNodeReportList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiagnosisReportResponse {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    consumerNums: ").append(toIndentedString(consumerNums)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    creatAt: ").append(toIndentedString(creatAt)).append("\n");
        sb.append("    abnormalItemSum: ").append(toIndentedString(abnormalItemSum)).append("\n");
        sb.append("    faultedNodeSum: ").append(toIndentedString(faultedNodeSum)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    messageAccumulation: ").append(toIndentedString(messageAccumulation)).append("\n");
        sb.append("    subscriptionConsistency: ").append(toIndentedString(subscriptionConsistency)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
        sb.append("    diagnosisNodeReportList: ").append(toIndentedString(diagnosisNodeReportList)).append("\n");
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
