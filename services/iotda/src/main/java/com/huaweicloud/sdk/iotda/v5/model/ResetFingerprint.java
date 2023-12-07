package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetFingerprint
 */
public class ResetFingerprint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_disconnect")

    private Boolean forceDisconnect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint_type")

    private String fingerprintType;

    public ResetFingerprint withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * **参数说明**：设备指纹。设置该字段时平台将设备指纹重置为指定值；不携带时将之置空，后续设备第一次接入时，该设备指纹的值将设置为第一次接入时的证书指纹。 **取值范围**：长度为40的十六进制字符串或者长度为64的十六进制字符串。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public ResetFingerprint withForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
        return this;
    }

    /**
     * **参数说明**：是否强制断开设备的连接，当前仅限长连接。默认值false。
     * @return forceDisconnect
     */
    public Boolean getForceDisconnect() {
        return forceDisconnect;
    }

    public void setForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
    }

    public ResetFingerprint withFingerprintType(String fingerprintType) {
        this.fingerprintType = fingerprintType;
        return this;
    }

    /**
     * **参数说明**：重置设备证书指纹的的类型。 **取值范围**： - PRIMARY：重置主指纹。设备证书鉴权优先使用的指纹，当设备接入物联网平台时，平台将优先使用主指纹进行校验。 - SECONDARY：重置辅指纹。设备的备用指纹，当主指纹校验不通过时，会启用辅指纹校验，辅指纹与主指纹有相同的效力。
     * @return fingerprintType
     */
    public String getFingerprintType() {
        return fingerprintType;
    }

    public void setFingerprintType(String fingerprintType) {
        this.fingerprintType = fingerprintType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetFingerprint that = (ResetFingerprint) obj;
        return Objects.equals(this.fingerprint, that.fingerprint)
            && Objects.equals(this.forceDisconnect, that.forceDisconnect)
            && Objects.equals(this.fingerprintType, that.fingerprintType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fingerprint, forceDisconnect, fingerprintType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetFingerprint {\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    forceDisconnect: ").append(toIndentedString(forceDisconnect)).append("\n");
        sb.append("    fingerprintType: ").append(toIndentedString(fingerprintType)).append("\n");
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
