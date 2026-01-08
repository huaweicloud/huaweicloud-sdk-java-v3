package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置负载均衡器用户自定义域名化相关配置参数。
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
     * **参数解释**：是否配置公网域名。  **约束限制**：不涉及  **取值范围**： true：开启公网域名 false：关闭公网域名  **默认取值**：false
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
     * **参数解释**：公网域名所使用的zone名称。  **约束限制**：公网域名只能使用公网类型的zone，当配置公网域名开关打开时，该字段不能置空，所填的公网zone必须在云解析服务已注册过。  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：公网解析记录集超时时间。解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。如果您的服务地址经常更换，建议TTL值设置相对小些，反之，建议设置相对大些。  **约束限制**：不涉及  **取值范围**：1-2147483647  **默认取值**：300
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
     * **参数解释**：是否配置私网域名。  **约束限制**：不涉及  **取值范围**： true：开启私网域名 false：关闭私网域名  **默认取值**：false
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
     * **参数解释**：私网域名所使用的zone的名称。  **约束限制**：   只有当private_domain_name_enable打开时，该字段才有效。   当private_domain_name_enable打开时，该字段不能置空。   所填的私网zone必须在云解析服务已注册过。   私网域名既能使用公网zone，也能使用私网zone，zone的类型在private_dns_zone_type字段中指定。  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：私网域名所使用的zone的类型。  **约束限制**：不涉及  **取值范围**： private: 使用私网zone public: 使用公网zone  **默认取值**：private
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
