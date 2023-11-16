package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新策略的请求体
 */
public class UpdatePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * udp协议封禁。block：封禁，unblock：不封禁
     */
    public static final class UdpEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final UdpEnum BLOCK = new UdpEnum("block");

        /**
         * Enum UNBLOCK for value: "unblock"
         */
        public static final UdpEnum UNBLOCK = new UdpEnum("unblock");

        private static final Map<String, UdpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UdpEnum> createStaticFields() {
            Map<String, UdpEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("unblock", UNBLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UdpEnum(String value) {
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
        public static UdpEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UdpEnum(value));
        }

        public static UdpEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UdpEnum) {
                return this.value.equals(((UdpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udp")

    private UdpEnum udp;

    public UpdatePolicyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdatePolicyRequestBody withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 清洗阈值
     * minimum: 100
     * maximum: 1000
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public UpdatePolicyRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePolicyRequestBody withUdp(UdpEnum udp) {
        this.udp = udp;
        return this;
    }

    /**
     * udp协议封禁。block：封禁，unblock：不封禁
     * @return udp
     */
    public UdpEnum getUdp() {
        return udp;
    }

    public void setUdp(UdpEnum udp) {
        this.udp = udp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePolicyRequestBody that = (UpdatePolicyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.description, that.description) && Objects.equals(this.udp, that.udp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, threshold, description, udp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    udp: ").append(toIndentedString(udp)).append("\n");
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
