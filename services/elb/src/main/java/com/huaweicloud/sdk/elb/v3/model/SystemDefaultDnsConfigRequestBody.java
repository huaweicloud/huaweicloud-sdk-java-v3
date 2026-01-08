package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置负载均衡器系统默认域名化相关配置参数。
 */
public class SystemDefaultDnsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_dns_record_set_ttl")

    private Integer publicDnsRecordSetTtl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_domain_name_enable")

    private Boolean privateDomainNameEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_domain_name_enable")

    private Boolean publicDomainNameEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_record_set_ttl")

    private Integer privateDnsRecordSetTtl;

    public SystemDefaultDnsConfigRequestBody withPublicDnsRecordSetTtl(Integer publicDnsRecordSetTtl) {
        this.publicDnsRecordSetTtl = publicDnsRecordSetTtl;
        return this;
    }

    /**
     * **参数解释**：公网解析记录集超时时间。解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。如果您的服务地址经常更换，建议TTL值设置相对小些，反之，建议设置相对大些  **约束限制**：不涉及  **取值范围**：1-2147483647  **默认取值**：300
     * @return publicDnsRecordSetTtl
     */
    public Integer getPublicDnsRecordSetTtl() {
        return publicDnsRecordSetTtl;
    }

    public void setPublicDnsRecordSetTtl(Integer publicDnsRecordSetTtl) {
        this.publicDnsRecordSetTtl = publicDnsRecordSetTtl;
    }

    public SystemDefaultDnsConfigRequestBody withPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
        return this;
    }

    /**
     * **参数解释**：是否配置私网域名。  **约束限制**：不涉及  **取值范围**： true：开启私网域名 false：关闭私网域名  **默认取值**：false
     * @return privateDomainNameEnable
     */
    public Boolean getPrivateDomainNameEnable() {
        return privateDomainNameEnable;
    }

    public void setPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
    }

    public SystemDefaultDnsConfigRequestBody withPublicDomainNameEnable(Boolean publicDomainNameEnable) {
        this.publicDomainNameEnable = publicDomainNameEnable;
        return this;
    }

    /**
     * **参数解释**：是否配置公网域名。  **约束限制**：不涉及  **取值范围**： true：开启公网域名 false：关闭公网域名  **默认取值**：false
     * @return publicDomainNameEnable
     */
    public Boolean getPublicDomainNameEnable() {
        return publicDomainNameEnable;
    }

    public void setPublicDomainNameEnable(Boolean publicDomainNameEnable) {
        this.publicDomainNameEnable = publicDomainNameEnable;
    }

    public SystemDefaultDnsConfigRequestBody withPrivateDnsRecordSetTtl(Integer privateDnsRecordSetTtl) {
        this.privateDnsRecordSetTtl = privateDnsRecordSetTtl;
        return this;
    }

    /**
     * **参数解释**：私网解析记录集超时时间。解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。如果您的服务地址经常更换，建议TTL值设置相对小些，反之，建议设置相对大些。  **约束限制**：不涉及  **取值范围**：1-2147483647  **默认取值**：300
     * @return privateDnsRecordSetTtl
     */
    public Integer getPrivateDnsRecordSetTtl() {
        return privateDnsRecordSetTtl;
    }

    public void setPrivateDnsRecordSetTtl(Integer privateDnsRecordSetTtl) {
        this.privateDnsRecordSetTtl = privateDnsRecordSetTtl;
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
        return Objects.equals(this.publicDnsRecordSetTtl, that.publicDnsRecordSetTtl)
            && Objects.equals(this.privateDomainNameEnable, that.privateDomainNameEnable)
            && Objects.equals(this.publicDomainNameEnable, that.publicDomainNameEnable)
            && Objects.equals(this.privateDnsRecordSetTtl, that.privateDnsRecordSetTtl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(publicDnsRecordSetTtl, privateDomainNameEnable, publicDomainNameEnable, privateDnsRecordSetTtl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemDefaultDnsConfigRequestBody {\n");
        sb.append("    publicDnsRecordSetTtl: ").append(toIndentedString(publicDnsRecordSetTtl)).append("\n");
        sb.append("    privateDomainNameEnable: ").append(toIndentedString(privateDomainNameEnable)).append("\n");
        sb.append("    publicDomainNameEnable: ").append(toIndentedString(publicDomainNameEnable)).append("\n");
        sb.append("    privateDnsRecordSetTtl: ").append(toIndentedString(privateDnsRecordSetTtl)).append("\n");
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
