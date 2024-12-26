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
 * 事件目标，一个事件流中只有一个事件目标，sink_fg、sink_kafka值能选择其中一个参数
 */
public class EventStreamingSink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_fg")

    private SinkFGParameters sinkFg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_kafka")

    private SinkKafkaParameters sinkKafka;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_obs")

    private SinkObsParameters sinkObs;

    /**
     * 事件目标类型名称
     */
    public static final class NameEnum {

        /**
         * Enum HC_FUNCTIONGRAPH for value: "HC.FunctionGraph"
         */
        public static final NameEnum HC_FUNCTIONGRAPH = new NameEnum("HC.FunctionGraph");

        /**
         * Enum HC_KAFKA for value: "HC.Kafka"
         */
        public static final NameEnum HC_KAFKA = new NameEnum("HC.Kafka");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("HC.FunctionGraph", HC_FUNCTIONGRAPH);
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

    public EventStreamingSink withSinkFg(SinkFGParameters sinkFg) {
        this.sinkFg = sinkFg;
        return this;
    }

    public EventStreamingSink withSinkFg(Consumer<SinkFGParameters> sinkFgSetter) {
        if (this.sinkFg == null) {
            this.sinkFg = new SinkFGParameters();
            sinkFgSetter.accept(this.sinkFg);
        }

        return this;
    }

    /**
     * Get sinkFg
     * @return sinkFg
     */
    public SinkFGParameters getSinkFg() {
        return sinkFg;
    }

    public void setSinkFg(SinkFGParameters sinkFg) {
        this.sinkFg = sinkFg;
    }

    public EventStreamingSink withSinkKafka(SinkKafkaParameters sinkKafka) {
        this.sinkKafka = sinkKafka;
        return this;
    }

    public EventStreamingSink withSinkKafka(Consumer<SinkKafkaParameters> sinkKafkaSetter) {
        if (this.sinkKafka == null) {
            this.sinkKafka = new SinkKafkaParameters();
            sinkKafkaSetter.accept(this.sinkKafka);
        }

        return this;
    }

    /**
     * Get sinkKafka
     * @return sinkKafka
     */
    public SinkKafkaParameters getSinkKafka() {
        return sinkKafka;
    }

    public void setSinkKafka(SinkKafkaParameters sinkKafka) {
        this.sinkKafka = sinkKafka;
    }

    public EventStreamingSink withSinkObs(SinkObsParameters sinkObs) {
        this.sinkObs = sinkObs;
        return this;
    }

    public EventStreamingSink withSinkObs(Consumer<SinkObsParameters> sinkObsSetter) {
        if (this.sinkObs == null) {
            this.sinkObs = new SinkObsParameters();
            sinkObsSetter.accept(this.sinkObs);
        }

        return this;
    }

    /**
     * Get sinkObs
     * @return sinkObs
     */
    public SinkObsParameters getSinkObs() {
        return sinkObs;
    }

    public void setSinkObs(SinkObsParameters sinkObs) {
        this.sinkObs = sinkObs;
    }

    public EventStreamingSink withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * 事件目标类型名称
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
        EventStreamingSink that = (EventStreamingSink) obj;
        return Objects.equals(this.sinkFg, that.sinkFg) && Objects.equals(this.sinkKafka, that.sinkKafka)
            && Objects.equals(this.sinkObs, that.sinkObs) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sinkFg, sinkKafka, sinkObs, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventStreamingSink {\n");
        sb.append("    sinkFg: ").append(toIndentedString(sinkFg)).append("\n");
        sb.append("    sinkKafka: ").append(toIndentedString(sinkKafka)).append("\n");
        sb.append("    sinkObs: ").append(toIndentedString(sinkObs)).append("\n");
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
