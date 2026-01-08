package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVerifyDomainOwnerInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_verify_type")

    private String dnsVerifyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_verify_name")

    private String dnsVerifyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_verify_url")

    private String fileVerifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_domain_name")

    private String verifyDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_verify_filename")

    private String fileVerifyFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_content")

    private String verifyContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_verify_domains")

    private List<String> fileVerifyDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowVerifyDomainOwnerInfoResponse withDnsVerifyType(String dnsVerifyType) {
        this.dnsVerifyType = dnsVerifyType;
        return this;
    }

    /**
     * DNS解析类型。取值意义： - TXT：TXT记录
     * @return dnsVerifyType
     */
    public String getDnsVerifyType() {
        return dnsVerifyType;
    }

    public void setDnsVerifyType(String dnsVerifyType) {
        this.dnsVerifyType = dnsVerifyType;
    }

    public ShowVerifyDomainOwnerInfoResponse withDnsVerifyName(String dnsVerifyName) {
        this.dnsVerifyName = dnsVerifyName;
        return this;
    }

    /**
     * DNS解析主机记录名称。
     * @return dnsVerifyName
     */
    public String getDnsVerifyName() {
        return dnsVerifyName;
    }

    public void setDnsVerifyName(String dnsVerifyName) {
        this.dnsVerifyName = dnsVerifyName;
    }

    public ShowVerifyDomainOwnerInfoResponse withFileVerifyUrl(String fileVerifyUrl) {
        this.fileVerifyUrl = fileVerifyUrl;
        return this;
    }

    /**
     * 文件校验URL地址。
     * @return fileVerifyUrl
     */
    public String getFileVerifyUrl() {
        return fileVerifyUrl;
    }

    public void setFileVerifyUrl(String fileVerifyUrl) {
        this.fileVerifyUrl = fileVerifyUrl;
    }

    public ShowVerifyDomainOwnerInfoResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 加速域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowVerifyDomainOwnerInfoResponse withVerifyDomainName(String verifyDomainName) {
        this.verifyDomainName = verifyDomainName;
        return this;
    }

    /**
     * 校验域名。
     * @return verifyDomainName
     */
    public String getVerifyDomainName() {
        return verifyDomainName;
    }

    public void setVerifyDomainName(String verifyDomainName) {
        this.verifyDomainName = verifyDomainName;
    }

    public ShowVerifyDomainOwnerInfoResponse withFileVerifyFilename(String fileVerifyFilename) {
        this.fileVerifyFilename = fileVerifyFilename;
        return this;
    }

    /**
     * 文件校验的校验文件名。
     * @return fileVerifyFilename
     */
    public String getFileVerifyFilename() {
        return fileVerifyFilename;
    }

    public void setFileVerifyFilename(String fileVerifyFilename) {
        this.fileVerifyFilename = fileVerifyFilename;
    }

    public ShowVerifyDomainOwnerInfoResponse withVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
        return this;
    }

    /**
     * 校验值，解析值或者文件内容。
     * @return verifyContent
     */
    public String getVerifyContent() {
        return verifyContent;
    }

    public void setVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
    }

    public ShowVerifyDomainOwnerInfoResponse withFileVerifyDomains(List<String> fileVerifyDomains) {
        this.fileVerifyDomains = fileVerifyDomains;
        return this;
    }

    public ShowVerifyDomainOwnerInfoResponse addFileVerifyDomainsItem(String fileVerifyDomainsItem) {
        if (this.fileVerifyDomains == null) {
            this.fileVerifyDomains = new ArrayList<>();
        }
        this.fileVerifyDomains.add(fileVerifyDomainsItem);
        return this;
    }

    public ShowVerifyDomainOwnerInfoResponse withFileVerifyDomains(Consumer<List<String>> fileVerifyDomainsSetter) {
        if (this.fileVerifyDomains == null) {
            this.fileVerifyDomains = new ArrayList<>();
        }
        fileVerifyDomainsSetter.accept(this.fileVerifyDomains);
        return this;
    }

    /**
     * 文件校验域名列表。
     * @return fileVerifyDomains
     */
    public List<String> getFileVerifyDomains() {
        return fileVerifyDomains;
    }

    public void setFileVerifyDomains(List<String> fileVerifyDomains) {
        this.fileVerifyDomains = fileVerifyDomains;
    }

    public ShowVerifyDomainOwnerInfoResponse withXRequestId(String xRequestId) {
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
        ShowVerifyDomainOwnerInfoResponse that = (ShowVerifyDomainOwnerInfoResponse) obj;
        return Objects.equals(this.dnsVerifyType, that.dnsVerifyType)
            && Objects.equals(this.dnsVerifyName, that.dnsVerifyName)
            && Objects.equals(this.fileVerifyUrl, that.fileVerifyUrl)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.verifyDomainName, that.verifyDomainName)
            && Objects.equals(this.fileVerifyFilename, that.fileVerifyFilename)
            && Objects.equals(this.verifyContent, that.verifyContent)
            && Objects.equals(this.fileVerifyDomains, that.fileVerifyDomains)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsVerifyType,
            dnsVerifyName,
            fileVerifyUrl,
            domainName,
            verifyDomainName,
            fileVerifyFilename,
            verifyContent,
            fileVerifyDomains,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVerifyDomainOwnerInfoResponse {\n");
        sb.append("    dnsVerifyType: ").append(toIndentedString(dnsVerifyType)).append("\n");
        sb.append("    dnsVerifyName: ").append(toIndentedString(dnsVerifyName)).append("\n");
        sb.append("    fileVerifyUrl: ").append(toIndentedString(fileVerifyUrl)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    verifyDomainName: ").append(toIndentedString(verifyDomainName)).append("\n");
        sb.append("    fileVerifyFilename: ").append(toIndentedString(fileVerifyFilename)).append("\n");
        sb.append("    verifyContent: ").append(toIndentedString(verifyContent)).append("\n");
        sb.append("    fileVerifyDomains: ").append(toIndentedString(fileVerifyDomains)).append("\n");
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
