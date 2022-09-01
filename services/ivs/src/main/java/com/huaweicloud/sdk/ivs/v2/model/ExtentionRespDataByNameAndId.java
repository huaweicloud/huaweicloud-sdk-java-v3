package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExtentionRespDataByNameAndId
 */
public class ExtentionRespDataByNameAndId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_result")

    @JacksonXmlProperty(localName = "verification_result")

    private String verificationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_message")

    @JacksonXmlProperty(localName = "verification_message")

    private String verificationMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code")

    @JacksonXmlProperty(localName = "verification_code")

    private Integer verificationCode;

    public ExtentionRespDataByNameAndId withVerificationResult(String verificationResult) {
        this.verificationResult = verificationResult;
        return this;
    }

    /**
     * 审核校验结果： \"valid\"表示身份审核通过； \"invalid\"表示身份审核不通过； \"nonexistent\"表示数据源没有该身份证号码，这种情况一般是被验证人正在办理户籍迁移，或者被验证人是军人或政要。
     * @return verificationResult
     */
    public String getVerificationResult() {
        return verificationResult;
    }

    public void setVerificationResult(String verificationResult) {
        this.verificationResult = verificationResult;
    }

    public ExtentionRespDataByNameAndId withVerificationMessage(String verificationMessage) {
        this.verificationMessage = verificationMessage;
        return this;
    }

    /**
     * 审核校验信息，具体参[考校验信息说明](https://support.huaweicloud.com/api-ivs/ivs_02_0017.html)
     * @return verificationMessage
     */
    public String getVerificationMessage() {
        return verificationMessage;
    }

    public void setVerificationMessage(String verificationMessage) {
        this.verificationMessage = verificationMessage;
    }

    public ExtentionRespDataByNameAndId withVerificationCode(Integer verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /**
     * 审核校验代码，具体参[考校验信息说明](https://support.huaweicloud.com/api-ivs/ivs_02_0017.html)
     * @return verificationCode
     */
    public Integer getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(Integer verificationCode) {
        this.verificationCode = verificationCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtentionRespDataByNameAndId extentionRespDataByNameAndId = (ExtentionRespDataByNameAndId) o;
        return Objects.equals(this.verificationResult, extentionRespDataByNameAndId.verificationResult)
            && Objects.equals(this.verificationMessage, extentionRespDataByNameAndId.verificationMessage)
            && Objects.equals(this.verificationCode, extentionRespDataByNameAndId.verificationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verificationResult, verificationMessage, verificationCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtentionRespDataByNameAndId {\n");
        sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
        sb.append("    verificationMessage: ").append(toIndentedString(verificationMessage)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
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
