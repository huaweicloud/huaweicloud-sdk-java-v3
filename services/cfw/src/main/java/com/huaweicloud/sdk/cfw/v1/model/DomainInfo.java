package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainInfo
 */
public class DomainInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_address_id")

    private String domainAddressId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public DomainInfo withDomainAddressId(String domainAddressId) {
        this.domainAddressId = domainAddressId;
        return this;
    }

    /**
     * **参数解释**： 域名地址id **取值范围**： 不涉及
     * @return domainAddressId
     */
    public String getDomainAddressId() {
        return domainAddressId;
    }

    public void setDomainAddressId(String domainAddressId) {
        this.domainAddressId = domainAddressId;
    }

    public DomainInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**： 域名 **取值范围**： 不涉及
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 域名描述 **取值范围**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainInfo that = (DomainInfo) obj;
        return Objects.equals(this.domainAddressId, that.domainAddressId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainAddressId, domainName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainInfo {\n");
        sb.append("    domainAddressId: ").append(toIndentedString(domainAddressId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
