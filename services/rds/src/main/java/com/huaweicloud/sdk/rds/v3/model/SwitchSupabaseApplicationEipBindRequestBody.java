package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EIP绑解请求体。
 */
public class SwitchSupabaseApplicationEipBindRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_bind")

    private Boolean isBind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_id")

    private String publicIpId;

    public SwitchSupabaseApplicationEipBindRequestBody withIsBind(Boolean isBind) {
        this.isBind = isBind;
        return this;
    }

    /**
     * true绑定，false解绑。is_bind=true时public_ip_id和public_ip_address必填。
     * @return isBind
     */
    public Boolean getIsBind() {
        return isBind;
    }

    public void setIsBind(Boolean isBind) {
        this.isBind = isBind;
    }

    public SwitchSupabaseApplicationEipBindRequestBody withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * 弹性公网IP地址。
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public SwitchSupabaseApplicationEipBindRequestBody withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * 弹性公网IP ID（UUID）。
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
        SwitchSupabaseApplicationEipBindRequestBody that = (SwitchSupabaseApplicationEipBindRequestBody) obj;
        return Objects.equals(this.isBind, that.isBind) && Objects.equals(this.publicIpAddress, that.publicIpAddress)
            && Objects.equals(this.publicIpId, that.publicIpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBind, publicIpAddress, publicIpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchSupabaseApplicationEipBindRequestBody {\n");
        sb.append("    isBind: ").append(toIndentedString(isBind)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
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
