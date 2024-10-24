package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 协议规则信息
 */
public class AgreementRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_name")

    private String agreementName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_display_name")

    private String agreementDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_version")

    private String agreementVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_url")

    private String agreementUrl;

    public AgreementRule withAgreementName(String agreementName) {
        this.agreementName = agreementName;
        return this;
    }

    /**
     * 协议名称
     * @return agreementName
     */
    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public AgreementRule withAgreementDisplayName(String agreementDisplayName) {
        this.agreementDisplayName = agreementDisplayName;
        return this;
    }

    /**
     * 协议展示名称
     * @return agreementDisplayName
     */
    public String getAgreementDisplayName() {
        return agreementDisplayName;
    }

    public void setAgreementDisplayName(String agreementDisplayName) {
        this.agreementDisplayName = agreementDisplayName;
    }

    public AgreementRule withAgreementVersion(String agreementVersion) {
        this.agreementVersion = agreementVersion;
        return this;
    }

    /**
     * 协议版本
     * @return agreementVersion
     */
    public String getAgreementVersion() {
        return agreementVersion;
    }

    public void setAgreementVersion(String agreementVersion) {
        this.agreementVersion = agreementVersion;
    }

    public AgreementRule withAgreementUrl(String agreementUrl) {
        this.agreementUrl = agreementUrl;
        return this;
    }

    /**
     * 协议链接
     * @return agreementUrl
     */
    public String getAgreementUrl() {
        return agreementUrl;
    }

    public void setAgreementUrl(String agreementUrl) {
        this.agreementUrl = agreementUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgreementRule that = (AgreementRule) obj;
        return Objects.equals(this.agreementName, that.agreementName)
            && Objects.equals(this.agreementDisplayName, that.agreementDisplayName)
            && Objects.equals(this.agreementVersion, that.agreementVersion)
            && Objects.equals(this.agreementUrl, that.agreementUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementName, agreementDisplayName, agreementVersion, agreementUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgreementRule {\n");
        sb.append("    agreementName: ").append(toIndentedString(agreementName)).append("\n");
        sb.append("    agreementDisplayName: ").append(toIndentedString(agreementDisplayName)).append("\n");
        sb.append("    agreementVersion: ").append(toIndentedString(agreementVersion)).append("\n");
        sb.append("    agreementUrl: ").append(toIndentedString(agreementUrl)).append("\n");
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
