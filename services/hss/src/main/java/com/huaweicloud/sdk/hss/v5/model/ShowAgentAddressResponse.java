package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAgentAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anp_address")

    private String anpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_address")

    private String agentAddress;

    public ShowAgentAddressResponse withAnpAddress(String anpAddress) {
        this.anpAddress = anpAddress;
        return this;
    }

    /**
     * **参数解释**： pod_lb地址 **取值范围**： 字符长度1-256位 
     * @return anpAddress
     */
    public String getAnpAddress() {
        return anpAddress;
    }

    public void setAnpAddress(String anpAddress) {
        this.anpAddress = anpAddress;
    }

    public ShowAgentAddressResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * **参数解释**： region_id标识 **取值范围**： 字符长度1-128位 
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowAgentAddressResponse withAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
        return this;
    }

    /**
     * **参数解释**： 公网接入agent地址 **取值范围**： 字符长度1-256位 
     * @return agentAddress
     */
    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgentAddressResponse that = (ShowAgentAddressResponse) obj;
        return Objects.equals(this.anpAddress, that.anpAddress) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.agentAddress, that.agentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anpAddress, regionId, agentAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgentAddressResponse {\n");
        sb.append("    anpAddress: ").append(toIndentedString(anpAddress)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    agentAddress: ").append(toIndentedString(agentAddress)).append("\n");
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
