package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 容灾switchover请求参数。
 */
public class SwitchoverReq {

    /**
     * 是否支持倒换失败自愈，为空时默认不自愈。
     */
    public static final class PostProcessConfigEnum {

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final PostProcessConfigEnum AUTO = new PostProcessConfigEnum("AUTO");

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final PostProcessConfigEnum MANUAL = new PostProcessConfigEnum("MANUAL");

        private static final Map<String, PostProcessConfigEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PostProcessConfigEnum> createStaticFields() {
            Map<String, PostProcessConfigEnum> map = new HashMap<>();
            map.put("AUTO", AUTO);
            map.put("MANUAL", MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PostProcessConfigEnum(String value) {
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
        public static PostProcessConfigEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PostProcessConfigEnum(value));
        }

        public static PostProcessConfigEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PostProcessConfigEnum) {
                return this.value.equals(((PostProcessConfigEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_process_config")

    private PostProcessConfigEnum postProcessConfig;

    /**
     * 容灾类型。
     */
    public static final class DisasterTypeEnum {

        /**
         * Enum STREAM for value: "stream"
         */
        public static final DisasterTypeEnum STREAM = new DisasterTypeEnum("stream");

        /**
         * Enum DORADO for value: "dorado"
         */
        public static final DisasterTypeEnum DORADO = new DisasterTypeEnum("dorado");

        private static final Map<String, DisasterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisasterTypeEnum> createStaticFields() {
            Map<String, DisasterTypeEnum> map = new HashMap<>();
            map.put("stream", STREAM);
            map.put("dorado", DORADO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisasterTypeEnum(String value) {
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
        public static DisasterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DisasterTypeEnum(value));
        }

        public static DisasterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisasterTypeEnum) {
                return this.value.equals(((DisasterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_type")

    private DisasterTypeEnum disasterType;

    public SwitchoverReq withPostProcessConfig(PostProcessConfigEnum postProcessConfig) {
        this.postProcessConfig = postProcessConfig;
        return this;
    }

    /**
     * 是否支持倒换失败自愈，为空时默认不自愈。
     * @return postProcessConfig
     */
    public PostProcessConfigEnum getPostProcessConfig() {
        return postProcessConfig;
    }

    public void setPostProcessConfig(PostProcessConfigEnum postProcessConfig) {
        this.postProcessConfig = postProcessConfig;
    }

    public SwitchoverReq withDisasterType(DisasterTypeEnum disasterType) {
        this.disasterType = disasterType;
        return this;
    }

    /**
     * 容灾类型。
     * @return disasterType
     */
    public DisasterTypeEnum getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(DisasterTypeEnum disasterType) {
        this.disasterType = disasterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchoverReq that = (SwitchoverReq) obj;
        return Objects.equals(this.postProcessConfig, that.postProcessConfig)
            && Objects.equals(this.disasterType, that.disasterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postProcessConfig, disasterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchoverReq {\n");
        sb.append("    postProcessConfig: ").append(toIndentedString(postProcessConfig)).append("\n");
        sb.append("    disasterType: ").append(toIndentedString(disasterType)).append("\n");
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
