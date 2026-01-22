package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDomainResolveIpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private String addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_address_id")

    private String domainAddressId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    public ListDomainResolveIpRequest withAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * **参数解释**： 解析ip类型IPV4或IPV6 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return addressType
     */
    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public ListDomainResolveIpRequest withDomainAddressId(String domainAddressId) {
        this.domainAddressId = domainAddressId;
        return this;
    }

    /**
     * **参数解释**： 域名id **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return domainAddressId
     */
    public String getDomainAddressId() {
        return domainAddressId;
    }

    public void setDomainAddressId(String domainAddressId) {
        this.domainAddressId = domainAddressId;
    }

    public ListDomainResolveIpRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainResolveIpRequest that = (ListDomainResolveIpRequest) obj;
        return Objects.equals(this.addressType, that.addressType)
            && Objects.equals(this.domainAddressId, that.domainAddressId)
            && Objects.equals(this.fwInstanceId, that.fwInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressType, domainAddressId, fwInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainResolveIpRequest {\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    domainAddressId: ").append(toIndentedString(domainAddressId)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
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
