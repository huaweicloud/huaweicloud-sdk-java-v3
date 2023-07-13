package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：转发配置信息。
 */
public class ForwardingConfigRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_config")

    private KafkaConfigRequestDTO kafkaConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_kafka_config")

    private MrsKafkaConfigRequestDTO mrsKafkaConfig;

    public ForwardingConfigRequestDTO withKafkaConfig(KafkaConfigRequestDTO kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
        return this;
    }

    public ForwardingConfigRequestDTO withKafkaConfig(Consumer<KafkaConfigRequestDTO> kafkaConfigSetter) {
        if (this.kafkaConfig == null) {
            this.kafkaConfig = new KafkaConfigRequestDTO();
            kafkaConfigSetter.accept(this.kafkaConfig);
        }

        return this;
    }

    /**
     * Get kafkaConfig
     * @return kafkaConfig
     */
    public KafkaConfigRequestDTO getKafkaConfig() {
        return kafkaConfig;
    }

    public void setKafkaConfig(KafkaConfigRequestDTO kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
    }

    public ForwardingConfigRequestDTO withMrsKafkaConfig(MrsKafkaConfigRequestDTO mrsKafkaConfig) {
        this.mrsKafkaConfig = mrsKafkaConfig;
        return this;
    }

    public ForwardingConfigRequestDTO withMrsKafkaConfig(Consumer<MrsKafkaConfigRequestDTO> mrsKafkaConfigSetter) {
        if (this.mrsKafkaConfig == null) {
            this.mrsKafkaConfig = new MrsKafkaConfigRequestDTO();
            mrsKafkaConfigSetter.accept(this.mrsKafkaConfig);
        }

        return this;
    }

    /**
     * Get mrsKafkaConfig
     * @return mrsKafkaConfig
     */
    public MrsKafkaConfigRequestDTO getMrsKafkaConfig() {
        return mrsKafkaConfig;
    }

    public void setMrsKafkaConfig(MrsKafkaConfigRequestDTO mrsKafkaConfig) {
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
        ForwardingConfigRequestDTO that = (ForwardingConfigRequestDTO) obj;
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
        sb.append("class ForwardingConfigRequestDTO {\n");
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
