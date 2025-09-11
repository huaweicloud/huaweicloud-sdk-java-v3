package com.huaweicloud.sdk.metastudio.v1.model;

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
public class SignAgreementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_to_sign")

    private Boolean needToSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_version")

    private String signedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_time")

    private String signedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resign_deadline")

    private String resignDeadline;

    /**
     * 重新签署过期处理方式:EXPIRE_AUTO_AGREE 自动签署协议,EXPIRE_STOP_SERVICE 强制签署协议
     */
    public static final class ResignExpireProcessModeEnum {

        /**
         * Enum EXPIRE_AUTO_AGREE for value: "EXPIRE_AUTO_AGREE"
         */
        public static final ResignExpireProcessModeEnum EXPIRE_AUTO_AGREE =
            new ResignExpireProcessModeEnum("EXPIRE_AUTO_AGREE");

        /**
         * Enum EXPIRE_STOP_SERVICE for value: "EXPIRE_STOP_SERVICE"
         */
        public static final ResignExpireProcessModeEnum EXPIRE_STOP_SERVICE =
            new ResignExpireProcessModeEnum("EXPIRE_STOP_SERVICE");

        private static final Map<String, ResignExpireProcessModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResignExpireProcessModeEnum> createStaticFields() {
            Map<String, ResignExpireProcessModeEnum> map = new HashMap<>();
            map.put("EXPIRE_AUTO_AGREE", EXPIRE_AUTO_AGREE);
            map.put("EXPIRE_STOP_SERVICE", EXPIRE_STOP_SERVICE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResignExpireProcessModeEnum(String value) {
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
        public static ResignExpireProcessModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new ResignExpireProcessModeEnum(value));
        }

        public static ResignExpireProcessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResignExpireProcessModeEnum) {
                return this.value.equals(((ResignExpireProcessModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resign_expire_process_mode")

    private ResignExpireProcessModeEnum resignExpireProcessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public SignAgreementResponse withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 当前服务协议版本
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public SignAgreementResponse withNeedToSign(Boolean needToSign) {
        this.needToSign = needToSign;
        return this;
    }

    /**
     * 是否需要签署
     * @return needToSign
     */
    public Boolean getNeedToSign() {
        return needToSign;
    }

    public void setNeedToSign(Boolean needToSign) {
        this.needToSign = needToSign;
    }

    public SignAgreementResponse withSignedVersion(String signedVersion) {
        this.signedVersion = signedVersion;
        return this;
    }

    /**
     * 签署服务协议版本
     * @return signedVersion
     */
    public String getSignedVersion() {
        return signedVersion;
    }

    public void setSignedVersion(String signedVersion) {
        this.signedVersion = signedVersion;
    }

    public SignAgreementResponse withSignedTime(String signedTime) {
        this.signedTime = signedTime;
        return this;
    }

    /**
     * 协议签署时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return signedTime
     */
    public String getSignedTime() {
        return signedTime;
    }

    public void setSignedTime(String signedTime) {
        this.signedTime = signedTime;
    }

    public SignAgreementResponse withResignDeadline(String resignDeadline) {
        this.resignDeadline = resignDeadline;
        return this;
    }

    /**
     * 签署最后期限。格式遵循：RFC 3339 如\"2024-10-10T15:59:59Z\"
     * @return resignDeadline
     */
    public String getResignDeadline() {
        return resignDeadline;
    }

    public void setResignDeadline(String resignDeadline) {
        this.resignDeadline = resignDeadline;
    }

    public SignAgreementResponse withResignExpireProcessMode(ResignExpireProcessModeEnum resignExpireProcessMode) {
        this.resignExpireProcessMode = resignExpireProcessMode;
        return this;
    }

    /**
     * 重新签署过期处理方式:EXPIRE_AUTO_AGREE 自动签署协议,EXPIRE_STOP_SERVICE 强制签署协议
     * @return resignExpireProcessMode
     */
    public ResignExpireProcessModeEnum getResignExpireProcessMode() {
        return resignExpireProcessMode;
    }

    public void setResignExpireProcessMode(ResignExpireProcessModeEnum resignExpireProcessMode) {
        this.resignExpireProcessMode = resignExpireProcessMode;
    }

    public SignAgreementResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignAgreementResponse that = (SignAgreementResponse) obj;
        return Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.needToSign, that.needToSign)
            && Objects.equals(this.signedVersion, that.signedVersion)
            && Objects.equals(this.signedTime, that.signedTime)
            && Objects.equals(this.resignDeadline, that.resignDeadline)
            && Objects.equals(this.resignExpireProcessMode, that.resignExpireProcessMode)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentVersion,
            needToSign,
            signedVersion,
            signedTime,
            resignDeadline,
            resignExpireProcessMode,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignAgreementResponse {\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    needToSign: ").append(toIndentedString(needToSign)).append("\n");
        sb.append("    signedVersion: ").append(toIndentedString(signedVersion)).append("\n");
        sb.append("    signedTime: ").append(toIndentedString(signedTime)).append("\n");
        sb.append("    resignDeadline: ").append(toIndentedString(resignDeadline)).append("\n");
        sb.append("    resignExpireProcessMode: ").append(toIndentedString(resignExpireProcessMode)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
