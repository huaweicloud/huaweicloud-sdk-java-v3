package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateKafkaPortProtocolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 开启或者关闭的Kafka接入方式。
     */
    public static final class ProtocolEnum {

        /**
         * Enum PRIVATE_PLAIN_ENABLE for value: "private_plain_enable"
         */
        public static final ProtocolEnum PRIVATE_PLAIN_ENABLE = new ProtocolEnum("private_plain_enable");

        /**
         * Enum PRIVATE_SASL_SSL_ENABLE for value: "private_sasl_ssl_enable"
         */
        public static final ProtocolEnum PRIVATE_SASL_SSL_ENABLE = new ProtocolEnum("private_sasl_ssl_enable");

        /**
         * Enum PRIVATE_SASL_PLAINTEXT_ENABLE for value: "private_sasl_plaintext_enable"
         */
        public static final ProtocolEnum PRIVATE_SASL_PLAINTEXT_ENABLE =
            new ProtocolEnum("private_sasl_plaintext_enable");

        /**
         * Enum PUBLIC_PLAIN_ENABLE for value: "public_plain_enable"
         */
        public static final ProtocolEnum PUBLIC_PLAIN_ENABLE = new ProtocolEnum("public_plain_enable");

        /**
         * Enum PUBLIC_SASL_SSL_ENABLE for value: "public_sasl_ssl_enable"
         */
        public static final ProtocolEnum PUBLIC_SASL_SSL_ENABLE = new ProtocolEnum("public_sasl_ssl_enable");

        /**
         * Enum PUBLIC_SASL_PLAINTEXT_ENABLE for value: "public_sasl_plaintext_enable"
         */
        public static final ProtocolEnum PUBLIC_SASL_PLAINTEXT_ENABLE =
            new ProtocolEnum("public_sasl_plaintext_enable");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("private_plain_enable", PRIVATE_PLAIN_ENABLE);
            map.put("private_sasl_ssl_enable", PRIVATE_SASL_SSL_ENABLE);
            map.put("private_sasl_plaintext_enable", PRIVATE_SASL_PLAINTEXT_ENABLE);
            map.put("public_plain_enable", PUBLIC_PLAIN_ENABLE);
            map.put("public_sasl_ssl_enable", PUBLIC_SASL_SSL_ENABLE);
            map.put("public_sasl_plaintext_enable", PUBLIC_SASL_PLAINTEXT_ENABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public UpdateKafkaPortProtocolResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 后台任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateKafkaPortProtocolResponse withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 开启或者关闭的Kafka接入方式。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public UpdateKafkaPortProtocolResponse withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 开启动作或者关闭动作。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKafkaPortProtocolResponse that = (UpdateKafkaPortProtocolResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, protocol, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKafkaPortProtocolResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
