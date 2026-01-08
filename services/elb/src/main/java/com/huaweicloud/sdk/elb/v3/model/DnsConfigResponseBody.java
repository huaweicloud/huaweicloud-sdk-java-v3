package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置负载均衡器响应体相关配置参数。
 */
public class DnsConfigResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private String ipv6VipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eips")

    private List<EipInfo> eips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eips")

    private List<GlobalEipInfo> globalEips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_domain_name_enable")

    private Boolean publicDomainNameEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_dns_zone_name")

    private String publicDnsZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_dns_zone_id")

    private String publicDnsZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_domain_name")

    private String publicDomainName;

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
    @JsonProperty(value = "private_dns_zone_id")

    private String privateDnsZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_domain_name")

    private String privateDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_zone_type")

    private String privateDnsZoneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_record_set_ttl")

    private Integer privateDnsRecordSetTtl;

    public DnsConfigResponseBody withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的IPv4虚拟IP地址。
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public DnsConfigResponseBody withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    /**
     * **参数解释**：双栈类型负载均衡器的IPv6地址。  **约束限制**：[不支持IPv6，请勿使用。](tag:dt)
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public DnsConfigResponseBody withEips(List<EipInfo> eips) {
        this.eips = eips;
        return this;
    }

    public DnsConfigResponseBody addEipsItem(EipInfo eipsItem) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        this.eips.add(eipsItem);
        return this;
    }

    public DnsConfigResponseBody withEips(Consumer<List<EipInfo>> eipsSetter) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /**
     * **参数解释**：负载均衡器绑定的EIP。  注：该字段与publicips一致。
     * @return eips
     */
    public List<EipInfo> getEips() {
        return eips;
    }

    public void setEips(List<EipInfo> eips) {
        this.eips = eips;
    }

    public DnsConfigResponseBody withGlobalEips(List<GlobalEipInfo> globalEips) {
        this.globalEips = globalEips;
        return this;
    }

    public DnsConfigResponseBody addGlobalEipsItem(GlobalEipInfo globalEipsItem) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        this.globalEips.add(globalEipsItem);
        return this;
    }

    public DnsConfigResponseBody withGlobalEips(Consumer<List<GlobalEipInfo>> globalEipsSetter) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        globalEipsSetter.accept(this.globalEips);
        return this;
    }

    /**
     * **参数解释**：负载均衡器绑定的GEIP。
     * @return globalEips
     */
    public List<GlobalEipInfo> getGlobalEips() {
        return globalEips;
    }

    public void setGlobalEips(List<GlobalEipInfo> globalEips) {
        this.globalEips = globalEips;
    }

    public DnsConfigResponseBody withPublicDomainNameEnable(Boolean publicDomainNameEnable) {
        this.publicDomainNameEnable = publicDomainNameEnable;
        return this;
    }

    /**
     * **参数解释**：是否配置公网域名。 **取值范围**：   true：开启公网域名   false：关闭公网域名
     * @return publicDomainNameEnable
     */
    public Boolean getPublicDomainNameEnable() {
        return publicDomainNameEnable;
    }

    public void setPublicDomainNameEnable(Boolean publicDomainNameEnable) {
        this.publicDomainNameEnable = publicDomainNameEnable;
    }

    public DnsConfigResponseBody withPublicDnsZoneName(String publicDnsZoneName) {
        this.publicDnsZoneName = publicDnsZoneName;
        return this;
    }

    /**
     * **参数解释**：公网域名所使用的zone名称。 **约束限制**：   公网域名只能使用公网类型的zone。   当配置公网域名开关打开时，该字段不能置空。   所填的公网zone必须在云解析服务已注册过。
     * @return publicDnsZoneName
     */
    public String getPublicDnsZoneName() {
        return publicDnsZoneName;
    }

    public void setPublicDnsZoneName(String publicDnsZoneName) {
        this.publicDnsZoneName = publicDnsZoneName;
    }

    public DnsConfigResponseBody withPublicDnsZoneId(String publicDnsZoneId) {
        this.publicDnsZoneId = publicDnsZoneId;
        return this;
    }

    /**
     * **参数解释**：   公网域名所使用的zone对应的id。   根据传入的公网zone 名称查询得出。
     * @return publicDnsZoneId
     */
    public String getPublicDnsZoneId() {
        return publicDnsZoneId;
    }

    public void setPublicDnsZoneId(String publicDnsZoneId) {
        this.publicDnsZoneId = publicDnsZoneId;
    }

    public DnsConfigResponseBody withPublicDomainName(String publicDomainName) {
        this.publicDomainName = publicDomainName;
        return this;
    }

    /**
     * **参数解释**：   负载均衡实例的公网域名。 **约束限制**：   根据负载均衡实例id，局点id和zone信息以如下格式生成：   {lb_id}.elb.{region_id}.{zone_name}
     * @return publicDomainName
     */
    public String getPublicDomainName() {
        return publicDomainName;
    }

    public void setPublicDomainName(String publicDomainName) {
        this.publicDomainName = publicDomainName;
    }

    public DnsConfigResponseBody withPublicDnsRecordSetTtl(Integer publicDnsRecordSetTtl) {
        this.publicDnsRecordSetTtl = publicDnsRecordSetTtl;
        return this;
    }

    /**
     * 参数解释:   公网解析记录集超时时间。   解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。   如果您的服务地址经常更换，建议TTL值设置相对小些，反之，建议设置相对大些。 **取值范围**：   1-2147483647 **默认取值**：   300
     * @return publicDnsRecordSetTtl
     */
    public Integer getPublicDnsRecordSetTtl() {
        return publicDnsRecordSetTtl;
    }

    public void setPublicDnsRecordSetTtl(Integer publicDnsRecordSetTtl) {
        this.publicDnsRecordSetTtl = publicDnsRecordSetTtl;
    }

    public DnsConfigResponseBody withPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
        return this;
    }

    /**
     * **参数解释**：   是否配置私网域名。 **取值范围**：   true：开启私网域名   false：关闭私网域名
     * @return privateDomainNameEnable
     */
    public Boolean getPrivateDomainNameEnable() {
        return privateDomainNameEnable;
    }

    public void setPrivateDomainNameEnable(Boolean privateDomainNameEnable) {
        this.privateDomainNameEnable = privateDomainNameEnable;
    }

    public DnsConfigResponseBody withPrivateDnsZoneName(String privateDnsZoneName) {
        this.privateDnsZoneName = privateDnsZoneName;
        return this;
    }

    /**
     * **参数解释**：   私网域名所使用的zone的名称。 **约束限制**：   私网域名既能使用公网zone，也能使用私网zone，zone的类型在private_dns_zone_type字段中指定。   当配置私网域名开关打开时，该字段不能置空。   所填的私网zone必须在云解析服务已注册过。
     * @return privateDnsZoneName
     */
    public String getPrivateDnsZoneName() {
        return privateDnsZoneName;
    }

    public void setPrivateDnsZoneName(String privateDnsZoneName) {
        this.privateDnsZoneName = privateDnsZoneName;
    }

    public DnsConfigResponseBody withPrivateDnsZoneId(String privateDnsZoneId) {
        this.privateDnsZoneId = privateDnsZoneId;
        return this;
    }

    /**
     * **参数解释**：   私网域名所使用的zone对应的id。 **约束限制**：   根据传入的私网zone 名称查询得出。
     * @return privateDnsZoneId
     */
    public String getPrivateDnsZoneId() {
        return privateDnsZoneId;
    }

    public void setPrivateDnsZoneId(String privateDnsZoneId) {
        this.privateDnsZoneId = privateDnsZoneId;
    }

    public DnsConfigResponseBody withPrivateDomainName(String privateDomainName) {
        this.privateDomainName = privateDomainName;
        return this;
    }

    /**
     * **参数解释**：负载均衡实例的私网域名。 **约束限制**：   根据负载均衡实例id，局点id和zone信息以如下格式生成：   {lb_id}-internal.elb.{region_id}.{zone_name}
     * @return privateDomainName
     */
    public String getPrivateDomainName() {
        return privateDomainName;
    }

    public void setPrivateDomainName(String privateDomainName) {
        this.privateDomainName = privateDomainName;
    }

    public DnsConfigResponseBody withPrivateDnsZoneType(String privateDnsZoneType) {
        this.privateDnsZoneType = privateDnsZoneType;
        return this;
    }

    /**
     * **参数解释**：私网域名所使用的zone的类型。 **约束限制**：不涉及 **取值范围**：private public **默认取值**：private
     * @return privateDnsZoneType
     */
    public String getPrivateDnsZoneType() {
        return privateDnsZoneType;
    }

    public void setPrivateDnsZoneType(String privateDnsZoneType) {
        this.privateDnsZoneType = privateDnsZoneType;
    }

    public DnsConfigResponseBody withPrivateDnsRecordSetTtl(Integer privateDnsRecordSetTtl) {
        this.privateDnsRecordSetTtl = privateDnsRecordSetTtl;
        return this;
    }

    /**
     * **参数解释**：   私网解析记录集超时时间。   解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。   如果您的服务地址经常更换，建议TTL值设置相对小些，反之，建议设置相对大些。 **取值范围**：   1-2147483647 **默认取值**：   300
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
        DnsConfigResponseBody that = (DnsConfigResponseBody) obj;
        return Objects.equals(this.vipAddress, that.vipAddress)
            && Objects.equals(this.ipv6VipAddress, that.ipv6VipAddress) && Objects.equals(this.eips, that.eips)
            && Objects.equals(this.globalEips, that.globalEips)
            && Objects.equals(this.publicDomainNameEnable, that.publicDomainNameEnable)
            && Objects.equals(this.publicDnsZoneName, that.publicDnsZoneName)
            && Objects.equals(this.publicDnsZoneId, that.publicDnsZoneId)
            && Objects.equals(this.publicDomainName, that.publicDomainName)
            && Objects.equals(this.publicDnsRecordSetTtl, that.publicDnsRecordSetTtl)
            && Objects.equals(this.privateDomainNameEnable, that.privateDomainNameEnable)
            && Objects.equals(this.privateDnsZoneName, that.privateDnsZoneName)
            && Objects.equals(this.privateDnsZoneId, that.privateDnsZoneId)
            && Objects.equals(this.privateDomainName, that.privateDomainName)
            && Objects.equals(this.privateDnsZoneType, that.privateDnsZoneType)
            && Objects.equals(this.privateDnsRecordSetTtl, that.privateDnsRecordSetTtl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vipAddress,
            ipv6VipAddress,
            eips,
            globalEips,
            publicDomainNameEnable,
            publicDnsZoneName,
            publicDnsZoneId,
            publicDomainName,
            publicDnsRecordSetTtl,
            privateDomainNameEnable,
            privateDnsZoneName,
            privateDnsZoneId,
            privateDomainName,
            privateDnsZoneType,
            privateDnsRecordSetTtl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsConfigResponseBody {\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
        sb.append("    globalEips: ").append(toIndentedString(globalEips)).append("\n");
        sb.append("    publicDomainNameEnable: ").append(toIndentedString(publicDomainNameEnable)).append("\n");
        sb.append("    publicDnsZoneName: ").append(toIndentedString(publicDnsZoneName)).append("\n");
        sb.append("    publicDnsZoneId: ").append(toIndentedString(publicDnsZoneId)).append("\n");
        sb.append("    publicDomainName: ").append(toIndentedString(publicDomainName)).append("\n");
        sb.append("    publicDnsRecordSetTtl: ").append(toIndentedString(publicDnsRecordSetTtl)).append("\n");
        sb.append("    privateDomainNameEnable: ").append(toIndentedString(privateDomainNameEnable)).append("\n");
        sb.append("    privateDnsZoneName: ").append(toIndentedString(privateDnsZoneName)).append("\n");
        sb.append("    privateDnsZoneId: ").append(toIndentedString(privateDnsZoneId)).append("\n");
        sb.append("    privateDomainName: ").append(toIndentedString(privateDomainName)).append("\n");
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
