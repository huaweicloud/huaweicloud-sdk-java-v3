package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 接入类型统计数据
 */
public class AccessTypeStatistics {

    /**
     * 接入类型（api/waf）
     */
    public static final class AccessTypeEnum {

        /**
         * Enum API for value: "api"
         */
        public static final AccessTypeEnum API = new AccessTypeEnum("api");

        /**
         * Enum WAF for value: "waf"
         */
        public static final AccessTypeEnum WAF = new AccessTypeEnum("waf");

        private static final Map<String, AccessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessTypeEnum> createStaticFields() {
            Map<String, AccessTypeEnum> map = new HashMap<>();
            map.put("api", API);
            map.put("waf", WAF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessTypeEnum(String value) {
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
        public static AccessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessTypeEnum(value));
        }

        public static AccessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessTypeEnum) {
                return this.value.equals(((AccessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private AccessTypeEnum accessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_request_count")

    private Long textRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_request_count")

    private Long imageRequestCount;

    public AccessTypeStatistics withAccessType(AccessTypeEnum accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * 接入类型（api/waf）
     * @return accessType
     */
    public AccessTypeEnum getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessTypeEnum accessType) {
        this.accessType = accessType;
    }

    public AccessTypeStatistics withTextRequestCount(Long textRequestCount) {
        this.textRequestCount = textRequestCount;
        return this;
    }

    /**
     * 用户输入请求数
     * @return textRequestCount
     */
    public Long getTextRequestCount() {
        return textRequestCount;
    }

    public void setTextRequestCount(Long textRequestCount) {
        this.textRequestCount = textRequestCount;
    }

    public AccessTypeStatistics withImageRequestCount(Long imageRequestCount) {
        this.imageRequestCount = imageRequestCount;
        return this;
    }

    /**
     * 用户输出请求数
     * @return imageRequestCount
     */
    public Long getImageRequestCount() {
        return imageRequestCount;
    }

    public void setImageRequestCount(Long imageRequestCount) {
        this.imageRequestCount = imageRequestCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessTypeStatistics that = (AccessTypeStatistics) obj;
        return Objects.equals(this.accessType, that.accessType)
            && Objects.equals(this.textRequestCount, that.textRequestCount)
            && Objects.equals(this.imageRequestCount, that.imageRequestCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessType, textRequestCount, imageRequestCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessTypeStatistics {\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    textRequestCount: ").append(toIndentedString(textRequestCount)).append("\n");
        sb.append("    imageRequestCount: ").append(toIndentedString(imageRequestCount)).append("\n");
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
