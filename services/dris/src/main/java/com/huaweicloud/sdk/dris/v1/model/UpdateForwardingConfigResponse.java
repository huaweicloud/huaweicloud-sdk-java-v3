package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateForwardingConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_type")

    private String forwardingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_config")

    private KafkaConfigResponseDTO kafkaConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_kafka_config")

    private MrsKafkaConfigResponseDTO mrsKafkaConfig;

    public UpdateForwardingConfigResponse withForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
        return this;
    }

    /**
     * **参数说明**：转发配置的类型。  **取值范围**：当前仅支持“kafka、mrskafka”。
     * @return forwardingType
     */
    public String getForwardingType() {
        return forwardingType;
    }

    public void setForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
    }

    public UpdateForwardingConfigResponse withKafkaConfig(KafkaConfigResponseDTO kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
        return this;
    }

    public UpdateForwardingConfigResponse withKafkaConfig(Consumer<KafkaConfigResponseDTO> kafkaConfigSetter) {
        if (this.kafkaConfig == null) {
            this.kafkaConfig = new KafkaConfigResponseDTO();
            kafkaConfigSetter.accept(this.kafkaConfig);
        }

        return this;
    }

    /**
     * Get kafkaConfig
     * @return kafkaConfig
     */
    public KafkaConfigResponseDTO getKafkaConfig() {
        return kafkaConfig;
    }

    public void setKafkaConfig(KafkaConfigResponseDTO kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
    }

    public UpdateForwardingConfigResponse withMrsKafkaConfig(MrsKafkaConfigResponseDTO mrsKafkaConfig) {
        this.mrsKafkaConfig = mrsKafkaConfig;
        return this;
    }

    public UpdateForwardingConfigResponse withMrsKafkaConfig(Consumer<MrsKafkaConfigResponseDTO> mrsKafkaConfigSetter) {
        if (this.mrsKafkaConfig == null) {
            this.mrsKafkaConfig = new MrsKafkaConfigResponseDTO();
            mrsKafkaConfigSetter.accept(this.mrsKafkaConfig);
        }

        return this;
    }

    /**
     * Get mrsKafkaConfig
     * @return mrsKafkaConfig
     */
    public MrsKafkaConfigResponseDTO getMrsKafkaConfig() {
        return mrsKafkaConfig;
    }

    public void setMrsKafkaConfig(MrsKafkaConfigResponseDTO mrsKafkaConfig) {
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
        UpdateForwardingConfigResponse that = (UpdateForwardingConfigResponse) obj;
        return Objects.equals(this.forwardingType, that.forwardingType)
            && Objects.equals(this.kafkaConfig, that.kafkaConfig)
            && Objects.equals(this.mrsKafkaConfig, that.mrsKafkaConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forwardingType, kafkaConfig, mrsKafkaConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateForwardingConfigResponse {\n");
        sb.append("    forwardingType: ").append(toIndentedString(forwardingType)).append("\n");
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
