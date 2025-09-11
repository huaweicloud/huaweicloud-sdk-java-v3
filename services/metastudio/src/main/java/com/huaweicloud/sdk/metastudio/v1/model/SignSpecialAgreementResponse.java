package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SignSpecialAgreementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_type")

    private String agreementType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_version")

    private String signedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_time")

    private String signedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public SignSpecialAgreementResponse withAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * 当前服务协议类型
     * @return agreementType
     */
    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public SignSpecialAgreementResponse withCurrentVersion(String currentVersion) {
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

    public SignSpecialAgreementResponse withSignedVersion(String signedVersion) {
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

    public SignSpecialAgreementResponse withSignedTime(String signedTime) {
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

    public SignSpecialAgreementResponse withXRequestId(String xRequestId) {
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
        SignSpecialAgreementResponse that = (SignSpecialAgreementResponse) obj;
        return Objects.equals(this.agreementType, that.agreementType)
            && Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.signedVersion, that.signedVersion)
            && Objects.equals(this.signedTime, that.signedTime) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementType, currentVersion, signedVersion, signedTime, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignSpecialAgreementResponse {\n");
        sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    signedVersion: ").append(toIndentedString(signedVersion)).append("\n");
        sb.append("    signedTime: ").append(toIndentedString(signedTime)).append("\n");
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
