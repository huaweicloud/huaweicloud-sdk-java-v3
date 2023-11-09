package com.huaweicloud.sdk.kafka.v2.model;

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
public class ShowInstanceConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_configs")

    private List<InstanceConfig> kafkaConfigs = null;

    public ShowInstanceConfigsResponse withKafkaConfigs(List<InstanceConfig> kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
        return this;
    }

    public ShowInstanceConfigsResponse addKafkaConfigsItem(InstanceConfig kafkaConfigsItem) {
        if (this.kafkaConfigs == null) {
            this.kafkaConfigs = new ArrayList<>();
        }
        this.kafkaConfigs.add(kafkaConfigsItem);
        return this;
    }

    public ShowInstanceConfigsResponse withKafkaConfigs(Consumer<List<InstanceConfig>> kafkaConfigsSetter) {
        if (this.kafkaConfigs == null) {
            this.kafkaConfigs = new ArrayList<>();
        }
        kafkaConfigsSetter.accept(this.kafkaConfigs);
        return this;
    }

    /**
     * kafka配置列表。
     * @return kafkaConfigs
     */
    public List<InstanceConfig> getKafkaConfigs() {
        return kafkaConfigs;
    }

    public void setKafkaConfigs(List<InstanceConfig> kafkaConfigs) {
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
        ShowInstanceConfigsResponse that = (ShowInstanceConfigsResponse) obj;
        return Objects.equals(this.kafkaConfigs, that.kafkaConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kafkaConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceConfigsResponse {\n");
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
