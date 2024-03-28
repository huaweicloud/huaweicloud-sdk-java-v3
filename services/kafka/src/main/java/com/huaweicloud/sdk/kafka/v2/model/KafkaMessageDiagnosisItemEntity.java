package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 消息积压诊断项
 */
public class KafkaMessageDiagnosisItemEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cause_ids")

    private List<KafkaMessageDiagnosisConclusionEntity> causeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advice_ids")

    private List<KafkaMessageDiagnosisConclusionEntity> adviceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<Integer> partitions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_partitions")

    private List<Integer> failedPartitions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_ids")

    private List<Integer> brokerIds = null;

    public KafkaMessageDiagnosisItemEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 诊断项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KafkaMessageDiagnosisItemEntity withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 诊断结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public KafkaMessageDiagnosisItemEntity withCauseIds(List<KafkaMessageDiagnosisConclusionEntity> causeIds) {
        this.causeIds = causeIds;
        return this;
    }

    public KafkaMessageDiagnosisItemEntity addCauseIdsItem(KafkaMessageDiagnosisConclusionEntity causeIdsItem) {
        if (this.causeIds == null) {
            this.causeIds = new ArrayList<>();
        }
        this.causeIds.add(causeIdsItem);
        return this;
    }

    public KafkaMessageDiagnosisItemEntity withCauseIds(
        Consumer<List<KafkaMessageDiagnosisConclusionEntity>> causeIdsSetter) {
        if (this.causeIds == null) {
            this.causeIds = new ArrayList<>();
        }
        causeIdsSetter.accept(this.causeIds);
        return this;
    }

    /**
     * 诊断异常原因列表
     * @return causeIds
     */
    public List<KafkaMessageDiagnosisConclusionEntity> getCauseIds() {
        return causeIds;
    }

    public void setCauseIds(List<KafkaMessageDiagnosisConclusionEntity> causeIds) {
        this.causeIds = causeIds;
    }

    public KafkaMessageDiagnosisItemEntity withAdviceIds(List<KafkaMessageDiagnosisConclusionEntity> adviceIds) {
        this.adviceIds = adviceIds;
        return this;
    }

    public KafkaMessageDiagnosisItemEntity addAdviceIdsItem(KafkaMessageDiagnosisConclusionEntity adviceIdsItem) {
        if (this.adviceIds == null) {
            this.adviceIds = new ArrayList<>();
        }
        this.adviceIds.add(adviceIdsItem);
        return this;
    }

    public KafkaMessageDiagnosisItemEntity withAdviceIds(
        Consumer<List<KafkaMessageDiagnosisConclusionEntity>> adviceIdsSetter) {
        if (this.adviceIds == null) {
            this.adviceIds = new ArrayList<>();
        }
        adviceIdsSetter.accept(this.adviceIds);
        return this;
    }

    /**
     * 诊断异常建议列表
     * @return adviceIds
     */
    public List<KafkaMessageDiagnosisConclusionEntity> getAdviceIds() {
        return adviceIds;
    }

    public void setAdviceIds(List<KafkaMessageDiagnosisConclusionEntity> adviceIds) {
        this.adviceIds = adviceIds;
    }

    public KafkaMessageDiagnosisItemEntity withPartitions(List<Integer> partitions) {
        this.partitions = partitions;
        return this;
    }

    public KafkaMessageDiagnosisItemEntity addPartitionsItem(Integer partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public KafkaMessageDiagnosisItemEntity withPartitions(Consumer<List<Integer>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 诊断异常受影响的分区列表
     * @return partitions
     */
    public List<Integer> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<Integer> partitions) {
        this.partitions = partitions;
    }

    public KafkaMessageDiagnosisItemEntity withFailedPartitions(List<Integer> failedPartitions) {
        this.failedPartitions = failedPartitions;
        return this;
    }

    public KafkaMessageDiagnosisItemEntity addFailedPartitionsItem(Integer failedPartitionsItem) {
        if (this.failedPartitions == null) {
            this.failedPartitions = new ArrayList<>();
        }
        this.failedPartitions.add(failedPartitionsItem);
        return this;
    }

    public KafkaMessageDiagnosisItemEntity withFailedPartitions(Consumer<List<Integer>> failedPartitionsSetter) {
        if (this.failedPartitions == null) {
            this.failedPartitions = new ArrayList<>();
        }
        failedPartitionsSetter.accept(this.failedPartitions);
        return this;
    }

    /**
     * 诊断失败的分区列表
     * @return failedPartitions
     */
    public List<Integer> getFailedPartitions() {
        return failedPartitions;
    }

    public void setFailedPartitions(List<Integer> failedPartitions) {
        this.failedPartitions = failedPartitions;
    }

    public KafkaMessageDiagnosisItemEntity withBrokerIds(List<Integer> brokerIds) {
        this.brokerIds = brokerIds;
        return this;
    }

    public KafkaMessageDiagnosisItemEntity addBrokerIdsItem(Integer brokerIdsItem) {
        if (this.brokerIds == null) {
            this.brokerIds = new ArrayList<>();
        }
        this.brokerIds.add(brokerIdsItem);
        return this;
    }

    public KafkaMessageDiagnosisItemEntity withBrokerIds(Consumer<List<Integer>> brokerIdsSetter) {
        if (this.brokerIds == null) {
            this.brokerIds = new ArrayList<>();
        }
        brokerIdsSetter.accept(this.brokerIds);
        return this;
    }

    /**
     * 诊断异常受影响的broker列表
     * @return brokerIds
     */
    public List<Integer> getBrokerIds() {
        return brokerIds;
    }

    public void setBrokerIds(List<Integer> brokerIds) {
        this.brokerIds = brokerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaMessageDiagnosisItemEntity that = (KafkaMessageDiagnosisItemEntity) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.result, that.result)
            && Objects.equals(this.causeIds, that.causeIds) && Objects.equals(this.adviceIds, that.adviceIds)
            && Objects.equals(this.partitions, that.partitions)
            && Objects.equals(this.failedPartitions, that.failedPartitions)
            && Objects.equals(this.brokerIds, that.brokerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, result, causeIds, adviceIds, partitions, failedPartitions, brokerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaMessageDiagnosisItemEntity {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    causeIds: ").append(toIndentedString(causeIds)).append("\n");
        sb.append("    adviceIds: ").append(toIndentedString(adviceIds)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
        sb.append("    failedPartitions: ").append(toIndentedString(failedPartitions)).append("\n");
        sb.append("    brokerIds: ").append(toIndentedString(brokerIds)).append("\n");
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
