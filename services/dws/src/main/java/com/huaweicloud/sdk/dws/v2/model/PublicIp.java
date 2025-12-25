package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 弹性公网IP信息对象。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
 */
public class PublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_bind_type")

    private String publicBindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private String ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_address")

    private String eipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width")

    private Integer bandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public PublicIp withPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
        return this;
    }

    /**
     * **参数解释**： 弹性IP绑定类型。 **约束限制**： 不涉及。 **取值范围**： - auto_assign：自动绑定。 - not_use：暂未使用。 - bind_existing ：使用已有。  **默认取值**： null
     * @return publicBindType
     */
    public String getPublicBindType() {
        return publicBindType;
    }

    public void setPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
    }

    public PublicIp withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP的id。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public PublicIp withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP的类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return ipType
     */
    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public PublicIp withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP的地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return eipAddress
     */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    public PublicIp withBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP的带宽。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return bandWidth
     */
    public Integer getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
    }

    public PublicIp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP的状态。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PublicIp withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP的错误码。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicIp that = (PublicIp) obj;
        return Objects.equals(this.publicBindType, that.publicBindType) && Objects.equals(this.eipId, that.eipId)
            && Objects.equals(this.ipType, that.ipType) && Objects.equals(this.eipAddress, that.eipAddress)
            && Objects.equals(this.bandWidth, that.bandWidth) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicBindType, eipId, ipType, eipAddress, bandWidth, status, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    publicBindType: ").append(toIndentedString(publicBindType)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
