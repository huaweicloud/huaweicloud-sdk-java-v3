package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 非流式响应配置，用于从响应体中提取Agent输出。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsThirdPartyAgentNonStreamConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_key")

    private String outputKey;

    public OpsThirdPartyAgentNonStreamConfig withOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }

    /**
     * **参数解释：** 响应体中Agent输出内容的字段路径，支持多级路径（如data.choices[0].message.content）。 **约束限制：** 最大长度200字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return outputKey
     */
    public String getOutputKey() {
        return outputKey;
    }

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsThirdPartyAgentNonStreamConfig that = (OpsThirdPartyAgentNonStreamConfig) obj;
        return Objects.equals(this.outputKey, that.outputKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsThirdPartyAgentNonStreamConfig {\n");
        sb.append("    outputKey: ").append(toIndentedString(outputKey)).append("\n");
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
