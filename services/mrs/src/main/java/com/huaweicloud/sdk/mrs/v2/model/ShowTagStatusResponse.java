package com.huaweicloud.sdk.mrs.v2.model;

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
public class ShowTagStatusResponse extends SdkResponse {

    /**
     * 标签处理状态
     */
    public static final class StatusEnum {

        /**
         * Enum PROCESSING for value: "processing"
         */
        public static final StatusEnum PROCESSING = new StatusEnum("processing");

        /**
         * Enum SUCCEED for value: "succeed"
         */
        public static final StatusEnum SUCCEED = new StatusEnum("succeed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("processing", PROCESSING);
            map.put("succeed", SUCCEED);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_tags_enable")

    private Boolean defaultTagsEnable;

    public ShowTagStatusResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 标签处理状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowTagStatusResponse withDefaultTagsEnable(Boolean defaultTagsEnable) {
        this.defaultTagsEnable = defaultTagsEnable;
        return this;
    }

    /**
     * 默认标签是否已开启
     * @return defaultTagsEnable
     */
    public Boolean getDefaultTagsEnable() {
        return defaultTagsEnable;
    }

    public void setDefaultTagsEnable(Boolean defaultTagsEnable) {
        this.defaultTagsEnable = defaultTagsEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTagStatusResponse that = (ShowTagStatusResponse) obj;
        return Objects.equals(this.status, that.status)
            && Objects.equals(this.defaultTagsEnable, that.defaultTagsEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, defaultTagsEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTagStatusResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    defaultTagsEnable: ").append(toIndentedString(defaultTagsEnable)).append("\n");
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
