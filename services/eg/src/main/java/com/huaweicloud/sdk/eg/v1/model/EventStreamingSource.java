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
 * 事件源，一个事件流中事件源只有一个
 */
public class EventStreamingSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_kafka")

    private SourceKafkaMQParameters sourceKafka;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_mobile_rocketmq")

    private SourceMobileMQParameters sourceMobileRocketmq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_community_rocketmq")

    private SourceCommunityMQParameters sourceCommunityRocketmq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_dms_rocketmq")

    private SourceDMSMQParameters sourceDmsRocketmq;

    /**
     * 事件源类型名称
     */
    public static final class NameEnum {

        /**
         * Enum HC_DMS_ROCKETMQ for value: "HC.DMS_ROCKETMQ"
         */
        public static final NameEnum HC_DMS_ROCKETMQ = new NameEnum("HC.DMS_ROCKETMQ");

        /**
         * Enum HC_COMMUNITY_ROCKETMQ for value: "HC.COMMUNITY_ROCKETMQ"
         */
        public static final NameEnum HC_COMMUNITY_ROCKETMQ = new NameEnum("HC.COMMUNITY_ROCKETMQ");

        /**
         * Enum HC_KAFKA for value: "HC.Kafka"
         */
        public static final NameEnum HC_KAFKA = new NameEnum("HC.Kafka");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("HC.DMS_ROCKETMQ", HC_DMS_ROCKETMQ);
            map.put("HC.COMMUNITY_ROCKETMQ", HC_COMMUNITY_ROCKETMQ);
            map.put("HC.Kafka", HC_KAFKA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NameEnum(value));
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    public EventStreamingSource withSourceKafka(SourceKafkaMQParameters sourceKafka) {
        this.sourceKafka = sourceKafka;
        return this;
    }

    public EventStreamingSource withSourceKafka(Consumer<SourceKafkaMQParameters> sourceKafkaSetter) {
        if (this.sourceKafka == null) {
            this.sourceKafka = new SourceKafkaMQParameters();
            sourceKafkaSetter.accept(this.sourceKafka);
        }

        return this;
    }

    /**
     * Get sourceKafka
     * @return sourceKafka
     */
    public SourceKafkaMQParameters getSourceKafka() {
        return sourceKafka;
    }

    public void setSourceKafka(SourceKafkaMQParameters sourceKafka) {
        this.sourceKafka = sourceKafka;
    }

    public EventStreamingSource withSourceMobileRocketmq(SourceMobileMQParameters sourceMobileRocketmq) {
        this.sourceMobileRocketmq = sourceMobileRocketmq;
        return this;
    }

    public EventStreamingSource withSourceMobileRocketmq(
        Consumer<SourceMobileMQParameters> sourceMobileRocketmqSetter) {
        if (this.sourceMobileRocketmq == null) {
            this.sourceMobileRocketmq = new SourceMobileMQParameters();
            sourceMobileRocketmqSetter.accept(this.sourceMobileRocketmq);
        }

        return this;
    }

    /**
     * Get sourceMobileRocketmq
     * @return sourceMobileRocketmq
     */
    public SourceMobileMQParameters getSourceMobileRocketmq() {
        return sourceMobileRocketmq;
    }

    public void setSourceMobileRocketmq(SourceMobileMQParameters sourceMobileRocketmq) {
        this.sourceMobileRocketmq = sourceMobileRocketmq;
    }

    public EventStreamingSource withSourceCommunityRocketmq(SourceCommunityMQParameters sourceCommunityRocketmq) {
        this.sourceCommunityRocketmq = sourceCommunityRocketmq;
        return this;
    }

    public EventStreamingSource withSourceCommunityRocketmq(
        Consumer<SourceCommunityMQParameters> sourceCommunityRocketmqSetter) {
        if (this.sourceCommunityRocketmq == null) {
            this.sourceCommunityRocketmq = new SourceCommunityMQParameters();
            sourceCommunityRocketmqSetter.accept(this.sourceCommunityRocketmq);
        }

        return this;
    }

    /**
     * Get sourceCommunityRocketmq
     * @return sourceCommunityRocketmq
     */
    public SourceCommunityMQParameters getSourceCommunityRocketmq() {
        return sourceCommunityRocketmq;
    }

    public void setSourceCommunityRocketmq(SourceCommunityMQParameters sourceCommunityRocketmq) {
        this.sourceCommunityRocketmq = sourceCommunityRocketmq;
    }

    public EventStreamingSource withSourceDmsRocketmq(SourceDMSMQParameters sourceDmsRocketmq) {
        this.sourceDmsRocketmq = sourceDmsRocketmq;
        return this;
    }

    public EventStreamingSource withSourceDmsRocketmq(Consumer<SourceDMSMQParameters> sourceDmsRocketmqSetter) {
        if (this.sourceDmsRocketmq == null) {
            this.sourceDmsRocketmq = new SourceDMSMQParameters();
            sourceDmsRocketmqSetter.accept(this.sourceDmsRocketmq);
        }

        return this;
    }

    /**
     * Get sourceDmsRocketmq
     * @return sourceDmsRocketmq
     */
    public SourceDMSMQParameters getSourceDmsRocketmq() {
        return sourceDmsRocketmq;
    }

    public void setSourceDmsRocketmq(SourceDMSMQParameters sourceDmsRocketmq) {
        this.sourceDmsRocketmq = sourceDmsRocketmq;
    }

    public EventStreamingSource withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * 事件源类型名称
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventStreamingSource that = (EventStreamingSource) obj;
        return Objects.equals(this.sourceKafka, that.sourceKafka)
            && Objects.equals(this.sourceMobileRocketmq, that.sourceMobileRocketmq)
            && Objects.equals(this.sourceCommunityRocketmq, that.sourceCommunityRocketmq)
            && Objects.equals(this.sourceDmsRocketmq, that.sourceDmsRocketmq) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceKafka, sourceMobileRocketmq, sourceCommunityRocketmq, sourceDmsRocketmq, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventStreamingSource {\n");
        sb.append("    sourceKafka: ").append(toIndentedString(sourceKafka)).append("\n");
        sb.append("    sourceMobileRocketmq: ").append(toIndentedString(sourceMobileRocketmq)).append("\n");
        sb.append("    sourceCommunityRocketmq: ").append(toIndentedString(sourceCommunityRocketmq)).append("\n");
        sb.append("    sourceDmsRocketmq: ").append(toIndentedString(sourceDmsRocketmq)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
