package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户能力详情
 */
public class CentralNetworkCapability {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capability")

    private CentralNetworkCapabilityEnum capability;

    public CentralNetworkCapability withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CentralNetworkCapability withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CentralNetworkCapability withCapability(CentralNetworkCapabilityEnum capability) {
        this.capability = capability;
        return this;
    }

    /**
     * Get capability
     * @return capability
     */
    public CentralNetworkCapabilityEnum getCapability() {
        return capability;
    }

    public void setCapability(CentralNetworkCapabilityEnum capability) {
        this.capability = capability;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkCapability that = (CentralNetworkCapability) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.capability, that.capability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, domainId, capability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkCapability {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
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
