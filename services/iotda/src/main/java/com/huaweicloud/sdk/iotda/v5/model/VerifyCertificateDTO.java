package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 验证CA证书结构体。
 */
public class VerifyCertificateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_content")

    private String verifyContent;

    public VerifyCertificateDTO withVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
        return this;
    }

    /**
     * 验证证书的内容信息。
     * @return verifyContent
     */
    public String getVerifyContent() {
        return verifyContent;
    }

    public void setVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerifyCertificateDTO that = (VerifyCertificateDTO) obj;
        return Objects.equals(this.verifyContent, that.verifyContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verifyContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyCertificateDTO {\n");
        sb.append("    verifyContent: ").append(toIndentedString(verifyContent)).append("\n");
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
