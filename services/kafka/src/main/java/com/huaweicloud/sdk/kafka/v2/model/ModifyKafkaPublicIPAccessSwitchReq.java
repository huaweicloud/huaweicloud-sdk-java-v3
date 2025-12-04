package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyKafkaPublicIPAccessSwitchReq
 */
public class ModifyKafkaPublicIPAccessSwitchReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_address")

    private String eipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_boundwidth")

    private Integer publicBoundwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIpId")

    private String publicIpId;

    public ModifyKafkaPublicIPAccessSwitchReq withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    /**
     * **参数解释**： EIP地址。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return eipAddress
     */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    public ModifyKafkaPublicIPAccessSwitchReq withPublicBoundwidth(Integer publicBoundwidth) {
        this.publicBoundwidth = publicBoundwidth;
        return this;
    }

    /**
     * **参数解释**： 公网带宽。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicBoundwidth
     */
    public Integer getPublicBoundwidth() {
        return publicBoundwidth;
    }

    public void setPublicBoundwidth(Integer publicBoundwidth) {
        this.publicBoundwidth = publicBoundwidth;
    }

    public ModifyKafkaPublicIPAccessSwitchReq withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * **参数解释**： 公网IP的ID。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyKafkaPublicIPAccessSwitchReq that = (ModifyKafkaPublicIPAccessSwitchReq) obj;
        return Objects.equals(this.eipAddress, that.eipAddress)
            && Objects.equals(this.publicBoundwidth, that.publicBoundwidth)
            && Objects.equals(this.publicIpId, that.publicIpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipAddress, publicBoundwidth, publicIpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyKafkaPublicIPAccessSwitchReq {\n");
        sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
        sb.append("    publicBoundwidth: ").append(toIndentedString(publicBoundwidth)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
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
