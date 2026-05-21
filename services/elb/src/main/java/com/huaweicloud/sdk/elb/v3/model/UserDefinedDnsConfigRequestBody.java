package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserDefinedDnsConfigRequestBody
 */
public class UserDefinedDnsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_domain_name_enable")

    private Boolean publicDomainNameEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_dns_zone_name")

    private String publicDnsZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_dns_record_set_ttl")

    private Integer publicDnsRecordSetTtl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_domain_name_enable")

    private Boolean privateDomainNameEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_zone_name")

    private String privateDnsZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_zone_type")

    private String privateDnsZoneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_record_set_ttl")

    private Integer privateDnsRecordSetTtl;

    public UserDefinedDnsConfigRequestBody withPublicDomainNameEnable(Boolean publicDomainNameEnable) {
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

    public UserDefinedDnsConfigRequestBody withPublicDnsZoneName(String publicDnsZoneName) {
        this.publicDnsZoneName = publicDnsZoneName;
        return this;
    }

    /**
     * **参数解释**：公网域名解析所使用的根域名。  **约束限制**： - 公网域名解析只能选择公网类型的根域名。 - 若启用公网域名解析（public_domain_name_enable=true），则公网根域名不能为空，且必须在云解析服务已注册。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return publicDnsZoneName
     */
    public String getPublicDnsZoneName() {
        return publicDnsZoneName;
    }

    public void setPublicDnsZoneName(String publicDnsZoneName) {
        this.publicDnsZoneName = publicDnsZoneName;
    }

    public UserDefinedDnsConfigRequestBody withPublicDnsRecordSetTtl(Integer publicDnsRecordSetTtl) {
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

    public UserDefinedDnsConfigRequestBody withPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
        return this;
    }

    /**
     * **参数解释**：是否启用私网域名解析。  **约束限制**：不涉及  **取值范围**： true：开启私网域名 false：关闭私网域名  **默认取值**：false
     * @return privateDomainNameEnable
     */
    public Boolean getPrivateDomainNameEnable() {
        return privateDomainNameEnable;
    }

    public void setPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
    }

    public UserDefinedDnsConfigRequestBody withPrivateDnsZoneName(String privateDnsZoneName) {
        this.privateDnsZoneName = privateDnsZoneName;
        return this;
    }

    /**
     * **参数解释**：私网域名解析所使用的根域名。  **约束限制**： - 私网域名解析可以选择私网类型的根域名，也可以选择公网类型的根域名。需要在private_dns_zone_type字段中明确指定。 - 若启用私网域名解析（private_domain_name_enable=true），则私网根域名不能为空，且必须在云解析服务已注册。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return privateDnsZoneName
     */
    public String getPrivateDnsZoneName() {
        return privateDnsZoneName;
    }

    public void setPrivateDnsZoneName(String privateDnsZoneName) {
        this.privateDnsZoneName = privateDnsZoneName;
    }

    public UserDefinedDnsConfigRequestBody withPrivateDnsZoneType(String privateDnsZoneType) {
        this.privateDnsZoneType = privateDnsZoneType;
        return this;
    }

    /**
     * **参数解释**：私网域名解析所使用的根域名的类型。  **约束限制**：不涉及  **取值范围**： - private: 私网根域名。 - public: 公网根域名。  **默认取值**：private
     * @return privateDnsZoneType
     */
    public String getPrivateDnsZoneType() {
        return privateDnsZoneType;
    }

    public void setPrivateDnsZoneType(String privateDnsZoneType) {
        this.privateDnsZoneType = privateDnsZoneType;
    }

    public UserDefinedDnsConfigRequestBody withPrivateDnsRecordSetTtl(Integer privateDnsRecordSetTtl) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserDefinedDnsConfigRequestBody that = (UserDefinedDnsConfigRequestBody) obj;
        return Objects.equals(this.publicDomainNameEnable, that.publicDomainNameEnable)
            && Objects.equals(this.publicDnsZoneName, that.publicDnsZoneName)
            && Objects.equals(this.publicDnsRecordSetTtl, that.publicDnsRecordSetTtl)
            && Objects.equals(this.privateDomainNameEnable, that.privateDomainNameEnable)
            && Objects.equals(this.privateDnsZoneName, that.privateDnsZoneName)
            && Objects.equals(this.privateDnsZoneType, that.privateDnsZoneType)
            && Objects.equals(this.privateDnsRecordSetTtl, that.privateDnsRecordSetTtl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicDomainNameEnable,
            publicDnsZoneName,
            publicDnsRecordSetTtl,
            privateDomainNameEnable,
            privateDnsZoneName,
            privateDnsZoneType,
            privateDnsRecordSetTtl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDefinedDnsConfigRequestBody {\n");
        sb.append("    publicDomainNameEnable: ").append(toIndentedString(publicDomainNameEnable)).append("\n");
        sb.append("    publicDnsZoneName: ").append(toIndentedString(publicDnsZoneName)).append("\n");
        sb.append("    publicDnsRecordSetTtl: ").append(toIndentedString(publicDnsRecordSetTtl)).append("\n");
        sb.append("    privateDomainNameEnable: ").append(toIndentedString(privateDomainNameEnable)).append("\n");
        sb.append("    privateDnsZoneName: ").append(toIndentedString(privateDnsZoneName)).append("\n");
        sb.append("    privateDnsZoneType: ").append(toIndentedString(privateDnsZoneType)).append("\n");
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
