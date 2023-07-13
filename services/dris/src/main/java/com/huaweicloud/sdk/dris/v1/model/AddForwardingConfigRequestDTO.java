package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加相关资源配置请求对象
 */
public class AddForwardingConfigRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_type")

    private String forwardingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_config")

    private ForwardingConfigRequestDTO forwardingConfig;

    public AddForwardingConfigRequestDTO withForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
        return this;
    }

    /**
     * **参数说明**：转发配置的类型。  **取值范围**：当前仅支持“kafka，mrskafka”。
     * @return forwardingType
     */
    public String getForwardingType() {
        return forwardingType;
    }

    public void setForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
    }

    public AddForwardingConfigRequestDTO withForwardingConfig(ForwardingConfigRequestDTO forwardingConfig) {
        this.forwardingConfig = forwardingConfig;
        return this;
    }

    public AddForwardingConfigRequestDTO withForwardingConfig(
        Consumer<ForwardingConfigRequestDTO> forwardingConfigSetter) {
        if (this.forwardingConfig == null) {
            this.forwardingConfig = new ForwardingConfigRequestDTO();
            forwardingConfigSetter.accept(this.forwardingConfig);
        }

        return this;
    }

    /**
     * Get forwardingConfig
     * @return forwardingConfig
     */
    public ForwardingConfigRequestDTO getForwardingConfig() {
        return forwardingConfig;
    }

    public void setForwardingConfig(ForwardingConfigRequestDTO forwardingConfig) {
        this.forwardingConfig = forwardingConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddForwardingConfigRequestDTO that = (AddForwardingConfigRequestDTO) obj;
        return Objects.equals(this.forwardingType, that.forwardingType)
            && Objects.equals(this.forwardingConfig, that.forwardingConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forwardingType, forwardingConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddForwardingConfigRequestDTO {\n");
        sb.append("    forwardingType: ").append(toIndentedString(forwardingType)).append("\n");
        sb.append("    forwardingConfig: ").append(toIndentedString(forwardingConfig)).append("\n");
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
