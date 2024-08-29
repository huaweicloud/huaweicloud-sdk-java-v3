package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ConfirmFileUploadRequestBody
 */
public class ConfirmFileUploadRequestBody {

    /**
     * 文件上传状态。 - CREATED：上传完成 - FAILED：上传失败 - CANCELLED：取消上传
     */
    public static final class StateEnum {

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final StateEnum CREATED = new StateEnum("CREATED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final StateEnum CANCELLED = new StateEnum("CANCELLED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("CREATED", CREATED);
            map.put("FAILED", FAILED);
            map.put("CANCELLED", CANCELLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_meta_analysis")

    private Boolean autoMetaAnalysis;

    public ConfirmFileUploadRequestBody withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 文件上传状态。 - CREATED：上传完成 - FAILED：上传失败 - CANCELLED：取消上传
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ConfirmFileUploadRequestBody withAutoMetaAnalysis(Boolean autoMetaAnalysis) {
        this.autoMetaAnalysis = autoMetaAnalysis;
        return this;
    }

    /**
     * 元数据自动解析,仅支持图片，视频，音频主文件
     * @return autoMetaAnalysis
     */
    public Boolean getAutoMetaAnalysis() {
        return autoMetaAnalysis;
    }

    public void setAutoMetaAnalysis(Boolean autoMetaAnalysis) {
        this.autoMetaAnalysis = autoMetaAnalysis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmFileUploadRequestBody that = (ConfirmFileUploadRequestBody) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.autoMetaAnalysis, that.autoMetaAnalysis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, autoMetaAnalysis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmFileUploadRequestBody {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    autoMetaAnalysis: ").append(toIndentedString(autoMetaAnalysis)).append("\n");
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
