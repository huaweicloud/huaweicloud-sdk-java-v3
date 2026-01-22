package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiagnosisNodeReportEntity
 */
public class DiagnosisNodeReportEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_faulted")

    private Boolean isFaulted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_item_sum")

    private Integer abnormalItemSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_accumulation")

    private Integer messageAccumulation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock")

    private Boolean deadLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deadlock_thread")

    private String deadlockThread;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_id")

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_pop")

    private Boolean isPop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_type")

    private String consumeType;

    public DiagnosisNodeReportEntity withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DiagnosisNodeReportEntity withIsFaulted(Boolean isFaulted) {
        this.isFaulted = isFaulted;
        return this;
    }

    /**
     * **参数解释**： 是否故障。 **约束限制**： 不涉及。 **取值范围**： - true：故障 - false：没有故障。 **默认取值**： 不涉及。
     * @return isFaulted
     */
    public Boolean getIsFaulted() {
        return isFaulted;
    }

    public void setIsFaulted(Boolean isFaulted) {
        this.isFaulted = isFaulted;
    }

    public DiagnosisNodeReportEntity withAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
        return this;
    }

    /**
     * **参数解释**： 异常项总数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return abnormalItemSum
     */
    public Integer getAbnormalItemSum() {
        return abnormalItemSum;
    }

    public void setAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
    }

    public DiagnosisNodeReportEntity withMessageAccumulation(Integer messageAccumulation) {
        this.messageAccumulation = messageAccumulation;
        return this;
    }

    /**
     * **参数解释**： 消息堆积数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return messageAccumulation
     */
    public Integer getMessageAccumulation() {
        return messageAccumulation;
    }

    public void setMessageAccumulation(Integer messageAccumulation) {
        this.messageAccumulation = messageAccumulation;
    }

    public DiagnosisNodeReportEntity withDeadLock(Boolean deadLock) {
        this.deadLock = deadLock;
        return this;
    }

    /**
     * **参数解释**： 是否为死锁。 **约束限制**： 不涉及。 **取值范围**： - true：是死锁。 - false：不是死锁。 **默认取值**： 不涉及。
     * @return deadLock
     */
    public Boolean getDeadLock() {
        return deadLock;
    }

    public void setDeadLock(Boolean deadLock) {
        this.deadLock = deadLock;
    }

    public DiagnosisNodeReportEntity withDeadlockThread(String deadlockThread) {
        this.deadlockThread = deadlockThread;
        return this;
    }

    /**
     * **参数解释**： 死锁线程。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return deadlockThread
     */
    public String getDeadlockThread() {
        return deadlockThread;
    }

    public void setDeadlockThread(String deadlockThread) {
        this.deadlockThread = deadlockThread;
    }

    public DiagnosisNodeReportEntity withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * **参数解释**： 线程ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public DiagnosisNodeReportEntity withIsPop(Boolean isPop) {
        this.isPop = isPop;
        return this;
    }

    /**
     * **参数解释**： 是否为pop消费模式。 **约束限制**： 不涉及。 **取值范围**： - true：是pop消费模式。 - false：不是pop消费模式。 **默认取值**： 不涉及。
     * @return isPop
     */
    public Boolean getIsPop() {
        return isPop;
    }

    public void setIsPop(Boolean isPop) {
        this.isPop = isPop;
    }

    public DiagnosisNodeReportEntity withConsumeType(String consumeType) {
        this.consumeType = consumeType;
        return this;
    }

    /**
     * **参数解释**： 消费类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return consumeType
     */
    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisNodeReportEntity that = (DiagnosisNodeReportEntity) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.isFaulted, that.isFaulted)
            && Objects.equals(this.abnormalItemSum, that.abnormalItemSum)
            && Objects.equals(this.messageAccumulation, that.messageAccumulation)
            && Objects.equals(this.deadLock, that.deadLock) && Objects.equals(this.deadlockThread, that.deadlockThread)
            && Objects.equals(this.stackId, that.stackId) && Objects.equals(this.isPop, that.isPop)
            && Objects.equals(this.consumeType, that.consumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId,
            isFaulted,
            abnormalItemSum,
            messageAccumulation,
            deadLock,
            deadlockThread,
            stackId,
            isPop,
            consumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisNodeReportEntity {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    isFaulted: ").append(toIndentedString(isFaulted)).append("\n");
        sb.append("    abnormalItemSum: ").append(toIndentedString(abnormalItemSum)).append("\n");
        sb.append("    messageAccumulation: ").append(toIndentedString(messageAccumulation)).append("\n");
        sb.append("    deadLock: ").append(toIndentedString(deadLock)).append("\n");
        sb.append("    deadlockThread: ").append(toIndentedString(deadlockThread)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    isPop: ").append(toIndentedString(isPop)).append("\n");
        sb.append("    consumeType: ").append(toIndentedString(consumeType)).append("\n");
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
