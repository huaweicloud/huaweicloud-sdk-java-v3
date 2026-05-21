package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SystemDefaultDnsConfigRequestBody
 */
public class SystemDefaultDnsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_domain_name_enable")

    private Boolean privateDomainNameEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_record_set_ttl")

    private Integer privateDnsRecordSetTtl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_domain_name_enable")

    private Boolean publicDomainNameEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_dns_record_set_ttl")

    private Integer publicDnsRecordSetTtl;

    public SystemDefaultDnsConfigRequestBody withPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
        return this;
    }

    /**
     * **参数解释**：是否启用私网域名解析。  **约束限制**：不涉及  **取值范围**： - true：开启私网域名解析。 - false：关闭私网域名解析。  **默认取值**：false
     * @return privateDomainNameEnable
     */
    public Boolean getPrivateDomainNameEnable() {
        return privateDomainNameEnable;
    }

    public void setPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
    }

    public SystemDefaultDnsConfigRequestBody withPrivateDnsRecordSetTtl(Integer privateDnsRecordSetTtl) {
        this.privateDnsRecordSetTtl = privateDnsRecordSetTtl;
        return this;
    }

    /**
     * **参数解释**：私网域名解析记录在本地DNS服务器的缓存超时时间，单位：秒。域名解析信息更新后，需要等待DNS服务器上的缓存超时才会生效。如果您的域名解析信息经常变更，建议TTL值设置相对小些，反之建议设置相对大些。  **约束限制**：不涉及  **取值范围**：1-2147483647  **默认取值**：300
     * @return privateDnsRecordSetTtl
     */
    public Integer getPrivateDnsRecordSetTtl() {
        return privateDnsRecordSetTtl;
    }

    public void setPrivateDnsRecordSetTtl(Integer privateDnsRecordSetTtl) {
        this.privateDnsRecordSetTtl = privateDnsRecordSetTtl;
    }

    public SystemDefaultDnsConfigRequestBody withPublicDomainNameEnable(Boolean publicDomainNameEnable) {
        this.publicDomainNameEnable = publicDomainNameEnable;
        return this;
    }

    /**
     * **参数解释**：是否启用公网域名解析。  **约束限制**：不涉及  **取值范围**： - true：开启公网域名解析。 - false：关闭公网域名解析。  **默认取值**：false
     * @return publicDomainNameEnable
     */
    public Boolean getPublicDomainNameEnable() {
        return publicDomainNameEnable;
    }

    public void setPublicDomainNameEnable(Boolean publicDomainNameEnable) {
        this.publicDomainNameEnable = publicDomainNameEnable;
    }

    public SystemDefaultDnsConfigRequestBody withPublicDnsRecordSetTtl(Integer publicDnsRecordSetTtl) {
        this.publicDnsRecordSetTtl = publicDnsRecordSetTtl;
        return this;
    }

    /**
     * **参数解释**：公网域名解析记录在本地DNS服务器的缓存超时时间，单位：秒。域名解析信息更新后，需要等待DNS服务器上的缓存超时才会生效。如果您的域名解析信息经常变更，建议TTL值设置相对小些，反之建议设置相对大些。  **约束限制**：不涉及  **取值范围**：1-2147483647  **默认取值**：300
     * @return publicDnsRecordSetTtl
     */
    public Integer getPublicDnsRecordSetTtl() {
        return publicDnsRecordSetTtl;
    }

    public void setPublicDnsRecordSetTtl(Integer publicDnsRecordSetTtl) {
        this.publicDnsRecordSetTtl = publicDnsRecordSetTtl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemDefaultDnsConfigRequestBody that = (SystemDefaultDnsConfigRequestBody) obj;
        return Objects.equals(this.privateDomainNameEnable, that.privateDomainNameEnable)
            && Objects.equals(this.privateDnsRecordSetTtl, that.privateDnsRecordSetTtl)
            && Objects.equals(this.publicDomainNameEnable, that.publicDomainNameEnable)
            && Objects.equals(this.publicDnsRecordSetTtl, that.publicDnsRecordSetTtl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(privateDomainNameEnable, privateDnsRecordSetTtl, publicDomainNameEnable, publicDnsRecordSetTtl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemDefaultDnsConfigRequestBody {\n");
        sb.append("    privateDomainNameEnable: ").append(toIndentedString(privateDomainNameEnable)).append("\n");
        sb.append("    privateDnsRecordSetTtl: ").append(toIndentedString(privateDnsRecordSetTtl)).append("\n");
        sb.append("    publicDomainNameEnable: ").append(toIndentedString(publicDomainNameEnable)).append("\n");
        sb.append("    publicDnsRecordSetTtl: ").append(toIndentedString(publicDnsRecordSetTtl)).append("\n");
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
