package com.huaweicloud.sdk.drs.v3.model;

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
public class UpdateParamsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    /**
     * 是否需要重启
     */
    public static final class ShouldRestartEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final ShouldRestartEnum TRUE = new ShouldRestartEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final ShouldRestartEnum FALSE = new ShouldRestartEnum("false");

        private static final Map<String, ShouldRestartEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ShouldRestartEnum> createStaticFields() {
            Map<String, ShouldRestartEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ShouldRestartEnum(String value) {
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
        public static ShouldRestartEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ShouldRestartEnum(value));
        }

        public static ShouldRestartEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ShouldRestartEnum) {
                return this.value.equals(((ShouldRestartEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "should_restart")

    private ShouldRestartEnum shouldRestart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public UpdateParamsResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 修改参数是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public UpdateParamsResponse withShouldRestart(ShouldRestartEnum shouldRestart) {
        this.shouldRestart = shouldRestart;
        return this;
    }

    /**
     * 是否需要重启
     * @return shouldRestart
     */
    public ShouldRestartEnum getShouldRestart() {
        return shouldRestart;
    }

    public void setShouldRestart(ShouldRestartEnum shouldRestart) {
        this.shouldRestart = shouldRestart;
    }

    public UpdateParamsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public UpdateParamsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateParamsResponse that = (UpdateParamsResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.shouldRestart, that.shouldRestart)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, shouldRestart, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateParamsResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    shouldRestart: ").append(toIndentedString(shouldRestart)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
