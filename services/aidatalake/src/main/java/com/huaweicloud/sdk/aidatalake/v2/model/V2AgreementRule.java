package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：协议规则信息。
 */
public class V2AgreementRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_name")

    private String agreementName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public V2AgreementRule withAgreementName(String agreementName) {
        this.agreementName = agreementName;
        return this;
    }

    /**
     * **参数解释**：协议名称。 **取值范围**：长度为1~128的英文字母、数字、下划线和中划线的组合。
     * @return agreementName
     */
    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public V2AgreementRule withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**：协议展示名称。 **取值范围**：由中文字符、英文字母、数字及特殊字符组成，长度不超过512个字符。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public V2AgreementRule withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：协议版本，例如v1.0.0。 **取值范围**：长度为1~128的英文字母、数字、下划线、中划线和小数点的组合。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public V2AgreementRule withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**：协议链接。 **取值范围**：符合URL格式规范，由英文字母、数字及URL合法特殊字符组成，长度不超过2000个字符。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2AgreementRule that = (V2AgreementRule) obj;
        return Objects.equals(this.agreementName, that.agreementName)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementName, displayName, version, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2AgreementRule {\n");
        sb.append("    agreementName: ").append(toIndentedString(agreementName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
