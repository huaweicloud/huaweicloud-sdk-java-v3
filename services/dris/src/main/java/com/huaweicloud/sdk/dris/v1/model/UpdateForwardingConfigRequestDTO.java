package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置更新接口使用的结构，现在支持kafka配置的更新
 */
public class UpdateForwardingConfigRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_config")

    private UpdateKafkaConfigRequestDTO kafkaConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_kafka_config")

    private UpdateMrsKafkaConfigRequestDTO mrsKafkaConfig;

    public UpdateForwardingConfigRequestDTO withKafkaConfig(UpdateKafkaConfigRequestDTO kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
        return this;
    }

    public UpdateForwardingConfigRequestDTO withKafkaConfig(Consumer<UpdateKafkaConfigRequestDTO> kafkaConfigSetter) {
        if (this.kafkaConfig == null) {
            this.kafkaConfig = new UpdateKafkaConfigRequestDTO();
            kafkaConfigSetter.accept(this.kafkaConfig);
        }

        return this;
    }

    /**
     * Get kafkaConfig
     * @return kafkaConfig
     */
    public UpdateKafkaConfigRequestDTO getKafkaConfig() {
        return kafkaConfig;
    }

    public void setKafkaConfig(UpdateKafkaConfigRequestDTO kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
    }

    public UpdateForwardingConfigRequestDTO withMrsKafkaConfig(UpdateMrsKafkaConfigRequestDTO mrsKafkaConfig) {
        this.mrsKafkaConfig = mrsKafkaConfig;
        return this;
    }

    public UpdateForwardingConfigRequestDTO withMrsKafkaConfig(
        Consumer<UpdateMrsKafkaConfigRequestDTO> mrsKafkaConfigSetter) {
        if (this.mrsKafkaConfig == null) {
            this.mrsKafkaConfig = new UpdateMrsKafkaConfigRequestDTO();
            mrsKafkaConfigSetter.accept(this.mrsKafkaConfig);
        }

        return this;
    }

    /**
     * Get mrsKafkaConfig
     * @return mrsKafkaConfig
     */
    public UpdateMrsKafkaConfigRequestDTO getMrsKafkaConfig() {
        return mrsKafkaConfig;
    }

    public void setMrsKafkaConfig(UpdateMrsKafkaConfigRequestDTO mrsKafkaConfig) {
        this.mrsKafkaConfig = mrsKafkaConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateForwardingConfigRequestDTO that = (UpdateForwardingConfigRequestDTO) obj;
        return Objects.equals(this.kafkaConfig, that.kafkaConfig)
            && Objects.equals(this.mrsKafkaConfig, that.mrsKafkaConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kafkaConfig, mrsKafkaConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateForwardingConfigRequestDTO {\n");
        sb.append("    kafkaConfig: ").append(toIndentedString(kafkaConfig)).append("\n");
        sb.append("    mrsKafkaConfig: ").append(toIndentedString(mrsKafkaConfig)).append("\n");
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
