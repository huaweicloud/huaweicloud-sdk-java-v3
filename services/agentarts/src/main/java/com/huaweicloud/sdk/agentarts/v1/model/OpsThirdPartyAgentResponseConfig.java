package com.huaweicloud.sdk.agentarts.v1.model;

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
 * **参数解释：** 三方托管智能体的响应配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsThirdPartyAgentResponseConfig {

    /**
     * **参数解释：** 响应类型。 **约束限制：** 枚举值。 **取值范围：** STREAM（流式输出）、NON_STREAM（非流式输出）。 **默认取值：** NON_STREAM。
     */
    public static final class TypeEnum {

        /**
         * Enum STREAM for value: "STREAM"
         */
        public static final TypeEnum STREAM = new TypeEnum("STREAM");

        /**
         * Enum NON_STREAM for value: "NON_STREAM"
         */
        public static final TypeEnum NON_STREAM = new TypeEnum("NON_STREAM");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("STREAM", STREAM);
            map.put("NON_STREAM", NON_STREAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_config")

    private OpsThirdPartyAgentStreamConfig streamConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_stream_config")

    private OpsThirdPartyAgentNonStreamConfig nonStreamConfig;

    public OpsThirdPartyAgentResponseConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 响应类型。 **约束限制：** 枚举值。 **取值范围：** STREAM（流式输出）、NON_STREAM（非流式输出）。 **默认取值：** NON_STREAM。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OpsThirdPartyAgentResponseConfig withStreamConfig(OpsThirdPartyAgentStreamConfig streamConfig) {
        this.streamConfig = streamConfig;
        return this;
    }

    public OpsThirdPartyAgentResponseConfig withStreamConfig(
        Consumer<OpsThirdPartyAgentStreamConfig> streamConfigSetter) {
        if (this.streamConfig == null) {
            this.streamConfig = new OpsThirdPartyAgentStreamConfig();
            streamConfigSetter.accept(this.streamConfig);
        }

        return this;
    }

    /**
     * Get streamConfig
     * @return streamConfig
     */
    public OpsThirdPartyAgentStreamConfig getStreamConfig() {
        return streamConfig;
    }

    public void setStreamConfig(OpsThirdPartyAgentStreamConfig streamConfig) {
        this.streamConfig = streamConfig;
    }

    public OpsThirdPartyAgentResponseConfig withNonStreamConfig(OpsThirdPartyAgentNonStreamConfig nonStreamConfig) {
        this.nonStreamConfig = nonStreamConfig;
        return this;
    }

    public OpsThirdPartyAgentResponseConfig withNonStreamConfig(
        Consumer<OpsThirdPartyAgentNonStreamConfig> nonStreamConfigSetter) {
        if (this.nonStreamConfig == null) {
            this.nonStreamConfig = new OpsThirdPartyAgentNonStreamConfig();
            nonStreamConfigSetter.accept(this.nonStreamConfig);
        }

        return this;
    }

    /**
     * Get nonStreamConfig
     * @return nonStreamConfig
     */
    public OpsThirdPartyAgentNonStreamConfig getNonStreamConfig() {
        return nonStreamConfig;
    }

    public void setNonStreamConfig(OpsThirdPartyAgentNonStreamConfig nonStreamConfig) {
        this.nonStreamConfig = nonStreamConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsThirdPartyAgentResponseConfig that = (OpsThirdPartyAgentResponseConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.streamConfig, that.streamConfig)
            && Objects.equals(this.nonStreamConfig, that.nonStreamConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, streamConfig, nonStreamConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsThirdPartyAgentResponseConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    streamConfig: ").append(toIndentedString(streamConfig)).append("\n");
        sb.append("    nonStreamConfig: ").append(toIndentedString(nonStreamConfig)).append("\n");
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
