package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyInstanceConfigsReq
 */
public class ModifyInstanceConfigsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_configs")

    private List<ModifyInstanceConfig> kafkaConfigs = null;

    public ModifyInstanceConfigsReq withKafkaConfigs(List<ModifyInstanceConfig> kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
        return this;
    }

    public ModifyInstanceConfigsReq addKafkaConfigsItem(ModifyInstanceConfig kafkaConfigsItem) {
        if (this.kafkaConfigs == null) {
            this.kafkaConfigs = new ArrayList<>();
        }
        this.kafkaConfigs.add(kafkaConfigsItem);
        return this;
    }

    public ModifyInstanceConfigsReq withKafkaConfigs(Consumer<List<ModifyInstanceConfig>> kafkaConfigsSetter) {
        if (this.kafkaConfigs == null) {
            this.kafkaConfigs = new ArrayList<>();
        }
        kafkaConfigsSetter.accept(this.kafkaConfigs);
        return this;
    }

    /**
     * Kafka待修改配置列表。
     * @return kafkaConfigs
     */
    public List<ModifyInstanceConfig> getKafkaConfigs() {
        return kafkaConfigs;
    }

    public void setKafkaConfigs(List<ModifyInstanceConfig> kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyInstanceConfigsReq that = (ModifyInstanceConfigsReq) obj;
        return Objects.equals(this.kafkaConfigs, that.kafkaConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kafkaConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyInstanceConfigsReq {\n");
        sb.append("    kafkaConfigs: ").append(toIndentedString(kafkaConfigs)).append("\n");
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
