package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSubscriptionTargetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private String providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Object detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_detail")

    private KafkaTargetDetail kafkaDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_detail")

    private SmnTargetDetail smnDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eg_detail")

    private EgTargetDetail egDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apigw_detail")

    private ApigwTargetDetail apigwDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times")

    private Integer retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private TransForm transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_letter_queue")

    private DeadLetterQueue deadLetterQueue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateSubscriptionTargetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅目标ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateSubscriptionTargetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 订阅的事件目标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateSubscriptionTargetResponse withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 订阅的事件目标的提供方类型
     * @return providerType
     */
    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public UpdateSubscriptionTargetResponse withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 订阅的事件目标使用的目标链接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public UpdateSubscriptionTargetResponse withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 订阅的事件目标参数列表
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public UpdateSubscriptionTargetResponse withKafkaDetail(KafkaTargetDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
        return this;
    }

    public UpdateSubscriptionTargetResponse withKafkaDetail(Consumer<KafkaTargetDetail> kafkaDetailSetter) {
        if (this.kafkaDetail == null) {
            this.kafkaDetail = new KafkaTargetDetail();
            kafkaDetailSetter.accept(this.kafkaDetail);
        }

        return this;
    }

    /**
     * Get kafkaDetail
     * @return kafkaDetail
     */
    public KafkaTargetDetail getKafkaDetail() {
        return kafkaDetail;
    }

    public void setKafkaDetail(KafkaTargetDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
    }

    public UpdateSubscriptionTargetResponse withSmnDetail(SmnTargetDetail smnDetail) {
        this.smnDetail = smnDetail;
        return this;
    }

    public UpdateSubscriptionTargetResponse withSmnDetail(Consumer<SmnTargetDetail> smnDetailSetter) {
        if (this.smnDetail == null) {
            this.smnDetail = new SmnTargetDetail();
            smnDetailSetter.accept(this.smnDetail);
        }

        return this;
    }

    /**
     * Get smnDetail
     * @return smnDetail
     */
    public SmnTargetDetail getSmnDetail() {
        return smnDetail;
    }

    public void setSmnDetail(SmnTargetDetail smnDetail) {
        this.smnDetail = smnDetail;
    }

    public UpdateSubscriptionTargetResponse withEgDetail(EgTargetDetail egDetail) {
        this.egDetail = egDetail;
        return this;
    }

    public UpdateSubscriptionTargetResponse withEgDetail(Consumer<EgTargetDetail> egDetailSetter) {
        if (this.egDetail == null) {
            this.egDetail = new EgTargetDetail();
            egDetailSetter.accept(this.egDetail);
        }

        return this;
    }

    /**
     * Get egDetail
     * @return egDetail
     */
    public EgTargetDetail getEgDetail() {
        return egDetail;
    }

    public void setEgDetail(EgTargetDetail egDetail) {
        this.egDetail = egDetail;
    }

    public UpdateSubscriptionTargetResponse withApigwDetail(ApigwTargetDetail apigwDetail) {
        this.apigwDetail = apigwDetail;
        return this;
    }

    public UpdateSubscriptionTargetResponse withApigwDetail(Consumer<ApigwTargetDetail> apigwDetailSetter) {
        if (this.apigwDetail == null) {
            this.apigwDetail = new ApigwTargetDetail();
            apigwDetailSetter.accept(this.apigwDetail);
        }

        return this;
    }

    /**
     * Get apigwDetail
     * @return apigwDetail
     */
    public ApigwTargetDetail getApigwDetail() {
        return apigwDetail;
    }

    public void setApigwDetail(ApigwTargetDetail apigwDetail) {
        this.apigwDetail = apigwDetail;
    }

    public UpdateSubscriptionTargetResponse withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * 重试次数
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public UpdateSubscriptionTargetResponse withTransform(TransForm transform) {
        this.transform = transform;
        return this;
    }

    public UpdateSubscriptionTargetResponse withTransform(Consumer<TransForm> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransForm();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransForm getTransform() {
        return transform;
    }

    public void setTransform(TransForm transform) {
        this.transform = transform;
    }

    public UpdateSubscriptionTargetResponse withDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
        return this;
    }

    public UpdateSubscriptionTargetResponse withDeadLetterQueue(Consumer<DeadLetterQueue> deadLetterQueueSetter) {
        if (this.deadLetterQueue == null) {
            this.deadLetterQueue = new DeadLetterQueue();
            deadLetterQueueSetter.accept(this.deadLetterQueue);
        }

        return this;
    }

    /**
     * Get deadLetterQueue
     * @return deadLetterQueue
     */
    public DeadLetterQueue getDeadLetterQueue() {
        return deadLetterQueue;
    }

    public void setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
    }

    public UpdateSubscriptionTargetResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateSubscriptionTargetResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public UpdateSubscriptionTargetResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSubscriptionTargetResponse that = (UpdateSubscriptionTargetResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.kafkaDetail, that.kafkaDetail) && Objects.equals(this.smnDetail, that.smnDetail)
            && Objects.equals(this.egDetail, that.egDetail) && Objects.equals(this.apigwDetail, that.apigwDetail)
            && Objects.equals(this.retryTimes, that.retryTimes) && Objects.equals(this.transform, that.transform)
            && Objects.equals(this.deadLetterQueue, that.deadLetterQueue)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            providerType,
            connectionId,
            detail,
            kafkaDetail,
            smnDetail,
            egDetail,
            apigwDetail,
            retryTimes,
            transform,
            deadLetterQueue,
            createdTime,
            updatedTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionTargetResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    kafkaDetail: ").append(toIndentedString(kafkaDetail)).append("\n");
        sb.append("    smnDetail: ").append(toIndentedString(smnDetail)).append("\n");
        sb.append("    egDetail: ").append(toIndentedString(egDetail)).append("\n");
        sb.append("    apigwDetail: ").append(toIndentedString(apigwDetail)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    deadLetterQueue: ").append(toIndentedString(deadLetterQueue)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
