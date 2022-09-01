package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 生成证书的安全模式： true：安全模式（证书由系统托管，每个用户名只能生成一个证书，每个组织生成上限100个） false：非安全模式（证书由用户自己保障，不限制生成数量）
 */
public class CreateBlockchainCertByUserNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_mode")

    @JacksonXmlProperty(localName = "security_mode")

    private Boolean securityMode;

    public CreateBlockchainCertByUserNameRequestBody withSecurityMode(Boolean securityMode) {
        this.securityMode = securityMode;
        return this;
    }

    /**
     * 生成证书的安全模式： true：安全模式（证书由系统托管，每个用户名只能生成一个证书，每个组织生成上限100个） false：非安全模式（证书由用户自己保障，不限制生成数量）
     * @return securityMode
     */
    public Boolean getSecurityMode() {
        return securityMode;
    }

    public void setSecurityMode(Boolean securityMode) {
        this.securityMode = securityMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBlockchainCertByUserNameRequestBody createBlockchainCertByUserNameRequestBody =
            (CreateBlockchainCertByUserNameRequestBody) o;
        return Objects.equals(this.securityMode, createBlockchainCertByUserNameRequestBody.securityMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBlockchainCertByUserNameRequestBody {\n");
        sb.append("    securityMode: ").append(toIndentedString(securityMode)).append("\n");
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
