package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** OpenAPI 规范目标配置，支持内联文档或从 OBS 获取规范文档。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayOpenApiTargetConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload")

    private String payload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private CoreGatewayObsConfiguration obs;

    public CoreGatewayOpenApiTargetConfiguration withPayload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * **参数解释：** OpenAPI 规范文档内容（JSON 或 YAML 格式的内联内容）。 **约束限制：** 不涉及。 **取值范围：** 长度为 1-1048576 个字符。 **默认取值：** 不涉及。 
     * @return payload
     */
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public CoreGatewayOpenApiTargetConfiguration withObs(CoreGatewayObsConfiguration obs) {
        this.obs = obs;
        return this;
    }

    public CoreGatewayOpenApiTargetConfiguration withObs(Consumer<CoreGatewayObsConfiguration> obsSetter) {
        if (this.obs == null) {
            this.obs = new CoreGatewayObsConfiguration();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public CoreGatewayObsConfiguration getObs() {
        return obs;
    }

    public void setObs(CoreGatewayObsConfiguration obs) {
        this.obs = obs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayOpenApiTargetConfiguration that = (CoreGatewayOpenApiTargetConfiguration) obj;
        return Objects.equals(this.payload, that.payload) && Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayOpenApiTargetConfiguration {\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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
