package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainDetectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowDomainDetectionResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 待诊断记录集的名称。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainDetectionResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 待诊断记录集的类型。 **取值范围：** - MX：指定域名对应的邮件服务器。 - CNAME：将域名解析到另一域名，或者多个域名映射到同一域名上。 - TXT：用于对域名进行标识和说明。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowDomainDetectionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 域名诊断状态。 **取值范围：** - OK：解析成功 - FAILED：whois查询失败 - NOT_REGISTERED：通过whois查询，域名未注册 - CANNOT_RESOLVE：通过whois查询，域名无法解析 - NOT_HWDNS：未托管在华为云 - NO_WEBSITE_RECORD：未配置网站解析记录 - NO_EMAIL_RECORD：未配置邮箱解析记录 - NO_DEFAULT_VIEW：未配置默认解析 - NOT_EFFECT：权威服务器未生效
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainDetectionResponse that = (ShowDomainDetectionResponse) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, type, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainDetectionResponse {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
