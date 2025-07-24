package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 失败时返回的错误对象  create_instance_error：创建实例失败   delete_instance_error：删除实例失败 reinstall_error：重新安装OS失败 modify_ip_error：修改ip失败  verify_server_error：验证服务器失败  delete_server_error：删除服务器失败
 */
public class ErrorStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    /**
     * 错误类型
     */
    public static final class ErrorTypeEnum {

        /**
         * Enum CREATE_INSTANCE_ERROR for value: "create_instance_error"
         */
        public static final ErrorTypeEnum CREATE_INSTANCE_ERROR = new ErrorTypeEnum("create_instance_error");

        /**
         * Enum DELETE_INSTANCE_ERROR for value: "delete_instance_error"
         */
        public static final ErrorTypeEnum DELETE_INSTANCE_ERROR = new ErrorTypeEnum("delete_instance_error");

        /**
         * Enum REINSTALL_ERROR for value: "reinstall_error"
         */
        public static final ErrorTypeEnum REINSTALL_ERROR = new ErrorTypeEnum("reinstall_error");

        /**
         * Enum MODIFY_IP_ERROR for value: "modify_ip_error"
         */
        public static final ErrorTypeEnum MODIFY_IP_ERROR = new ErrorTypeEnum("modify_ip_error");

        /**
         * Enum VERIFY_SERVER_ERROR for value: "verify_server_error"
         */
        public static final ErrorTypeEnum VERIFY_SERVER_ERROR = new ErrorTypeEnum("verify_server_error");

        /**
         * Enum DELETE_SERVER_ERROR for value: "delete_server_error"
         */
        public static final ErrorTypeEnum DELETE_SERVER_ERROR = new ErrorTypeEnum("delete_server_error");

        private static final Map<String, ErrorTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ErrorTypeEnum> createStaticFields() {
            Map<String, ErrorTypeEnum> map = new HashMap<>();
            map.put("create_instance_error", CREATE_INSTANCE_ERROR);
            map.put("delete_instance_error", DELETE_INSTANCE_ERROR);
            map.put("reinstall_error", REINSTALL_ERROR);
            map.put("modify_ip_error", MODIFY_IP_ERROR);
            map.put("verify_server_error", VERIFY_SERVER_ERROR);
            map.put("delete_server_error", DELETE_SERVER_ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ErrorTypeEnum(String value) {
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
        public static ErrorTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ErrorTypeEnum(value));
        }

        public static ErrorTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ErrorTypeEnum) {
                return this.value.equals(((ErrorTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_type")

    private ErrorTypeEnum errorType;

    public ErrorStatus withErrorCode(String errorCode) {
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

    public ErrorStatus withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ErrorStatus withErrorType(ErrorTypeEnum errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * 错误类型
     * @return errorType
     */
    public ErrorTypeEnum getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorTypeEnum errorType) {
        this.errorType = errorType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorStatus that = (ErrorStatus) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.errorType, that.errorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, errorType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorStatus {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
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
