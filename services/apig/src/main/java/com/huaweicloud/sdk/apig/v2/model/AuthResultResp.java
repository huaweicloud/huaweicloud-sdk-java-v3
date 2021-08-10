package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 授权结果 */
public class AuthResultResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    /** 授权结果 - SUCCESS：授权成功 - SKIPPED：跳过 - FILAED：授权失败 */
    public static final class StatusEnum {

        /** Enum SUCCESS for value: "SUCCESS" */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /** Enum SKIPPED for value: "SKIPPED" */
        public static final StatusEnum SKIPPED = new StatusEnum("SKIPPED");

        /** Enum FAILED for value: "FAILED" */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("SKIPPED", SKIPPED);
            map.put("FAILED", FAILED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public AuthResultResp withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /** API名称
     * 
     * @return apiName */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public AuthResultResp withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** APP名称
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AuthResultResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 授权结果 - SUCCESS：授权成功 - SKIPPED：跳过 - FILAED：授权失败
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AuthResultResp withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /** 授权失败错误信息
     * 
     * @return errorMsg */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public AuthResultResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 授权失败错误码
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthResultResp authResultResp = (AuthResultResp) o;
        return Objects.equals(this.apiName, authResultResp.apiName)
            && Objects.equals(this.appName, authResultResp.appName)
            && Objects.equals(this.status, authResultResp.status)
            && Objects.equals(this.errorMsg, authResultResp.errorMsg)
            && Objects.equals(this.errorCode, authResultResp.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiName, appName, status, errorMsg, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthResultResp {\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
