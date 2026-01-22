package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainVerificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_content")

    private String verifyContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_result")

    private Boolean verifyResult;

    public ShowDomainVerificationResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 主域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ShowDomainVerificationResponse withVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
        return this;
    }

    /**
     * 校验值，解析值或者文件内容
     * @return verifyContent
     */
    public String getVerifyContent() {
        return verifyContent;
    }

    public void setVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
    }

    public ShowDomainVerificationResponse withVerifyResult(Boolean verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }

    /**
     * 验证结果，true为验证成功确认归属，false为归属情况未确认
     * @return verifyResult
     */
    public Boolean getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(Boolean verifyResult) {
        this.verifyResult = verifyResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainVerificationResponse that = (ShowDomainVerificationResponse) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.verifyContent, that.verifyContent)
            && Objects.equals(this.verifyResult, that.verifyResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, verifyContent, verifyResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainVerificationResponse {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    verifyContent: ").append(toIndentedString(verifyContent)).append("\n");
        sb.append("    verifyResult: ").append(toIndentedString(verifyResult)).append("\n");
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
