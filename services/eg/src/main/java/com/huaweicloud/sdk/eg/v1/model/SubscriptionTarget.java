package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubscriptionTarget
 */
public class SubscriptionTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 订阅的事件目标的提供方类型
     */
    public static final class ProviderTypeEnum {

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final ProviderTypeEnum CUSTOM = new ProviderTypeEnum("CUSTOM");

        /**
         * Enum OFFICIAL for value: "OFFICIAL"
         */
        public static final ProviderTypeEnum OFFICIAL = new ProviderTypeEnum("OFFICIAL");

        /**
         * Enum APIGW for value: "APIGW"
         */
        public static final ProviderTypeEnum APIGW = new ProviderTypeEnum("APIGW");

        private static final Map<String, ProviderTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderTypeEnum> createStaticFields() {
            Map<String, ProviderTypeEnum> map = new HashMap<>();
            map.put("CUSTOM", CUSTOM);
            map.put("OFFICIAL", OFFICIAL);
            map.put("APIGW", APIGW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProviderTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderTypeEnum(value));
        }

        public static ProviderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderTypeEnum) {
                return this.value.equals(((ProviderTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private ProviderTypeEnum providerType;

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

    public SubscriptionTarget withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅目标ID，需保证全局唯一，由小写字母、数字、中划线组成，必须字母或数字开头。 更新订阅场景时，指定ID的订阅目标存在时则进行更新，否则进行创建； 创建订阅目标场景时，指定ID作为待创建的订阅目标对象ID，未指定时由系统自动生成。 更新订阅目标时，此字段忽略；
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubscriptionTarget withName(String name) {
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

    public SubscriptionTarget withProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 订阅的事件目标的提供方类型
     * @return providerType
     */
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public SubscriptionTarget withConnectionId(String connectionId) {
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

    public SubscriptionTarget withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 订阅的事件目标参数列表，该字段序列化后总长度不超过1024字节，函数(urn、invoke_type、agency_name)、函数流（workflow_id、agency_name）、webhook（url）订阅目标必填，其中函数、函数流委托名称必填
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public SubscriptionTarget withKafkaDetail(KafkaTargetDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
        return this;
    }

    public SubscriptionTarget withKafkaDetail(Consumer<KafkaTargetDetail> kafkaDetailSetter) {
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

    public SubscriptionTarget withSmnDetail(SmnTargetDetail smnDetail) {
        this.smnDetail = smnDetail;
        return this;
    }

    public SubscriptionTarget withSmnDetail(Consumer<SmnTargetDetail> smnDetailSetter) {
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

    public SubscriptionTarget withEgDetail(EgTargetDetail egDetail) {
        this.egDetail = egDetail;
        return this;
    }

    public SubscriptionTarget withEgDetail(Consumer<EgTargetDetail> egDetailSetter) {
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

    public SubscriptionTarget withApigwDetail(ApigwTargetDetail apigwDetail) {
        this.apigwDetail = apigwDetail;
        return this;
    }

    public SubscriptionTarget withApigwDetail(Consumer<ApigwTargetDetail> apigwDetailSetter) {
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

    public SubscriptionTarget withRetryTimes(Integer retryTimes) {
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

    public SubscriptionTarget withTransform(TransForm transform) {
        this.transform = transform;
        return this;
    }

    public SubscriptionTarget withTransform(Consumer<TransForm> transformSetter) {
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

    public SubscriptionTarget withDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
        return this;
    }

    public SubscriptionTarget withDeadLetterQueue(Consumer<DeadLetterQueue> deadLetterQueueSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionTarget that = (SubscriptionTarget) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.kafkaDetail, that.kafkaDetail) && Objects.equals(this.smnDetail, that.smnDetail)
            && Objects.equals(this.egDetail, that.egDetail) && Objects.equals(this.apigwDetail, that.apigwDetail)
            && Objects.equals(this.retryTimes, that.retryTimes) && Objects.equals(this.transform, that.transform)
            && Objects.equals(this.deadLetterQueue, that.deadLetterQueue);
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
            deadLetterQueue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionTarget {\n");
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
