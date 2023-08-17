package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEquipmentDnsInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_dns")

    private String masterDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_dns")

    private String slaveDns;

    public ShowEquipmentDnsInfoResponse withMasterDns(String masterDns) {
        this.masterDns = masterDns;
        return this;
    }

    /**
     * 主DNS
     * @return masterDns
     */
    public String getMasterDns() {
        return masterDns;
    }

    public void setMasterDns(String masterDns) {
        this.masterDns = masterDns;
    }

    public ShowEquipmentDnsInfoResponse withSlaveDns(String slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }

    /**
     * 备DNS
     * @return slaveDns
     */
    public String getSlaveDns() {
        return slaveDns;
    }

    public void setSlaveDns(String slaveDns) {
        this.slaveDns = slaveDns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEquipmentDnsInfoResponse that = (ShowEquipmentDnsInfoResponse) obj;
        return Objects.equals(this.masterDns, that.masterDns) && Objects.equals(this.slaveDns, that.slaveDns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterDns, slaveDns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEquipmentDnsInfoResponse {\n");
        sb.append("    masterDns: ").append(toIndentedString(masterDns)).append("\n");
        sb.append("    slaveDns: ").append(toIndentedString(slaveDns)).append("\n");
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
