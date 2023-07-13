package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMasterAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_address")

    private String masterAddress;

    public ShowMasterAddressResponse withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * region的英文名称。
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ShowMasterAddressResponse withMasterAddress(String masterAddress) {
        this.masterAddress = masterAddress;
        return this;
    }

    /**
     * APMmaster服务对外暴露的地址，提供服务注册和心跳上报。
     * @return masterAddress
     */
    public String getMasterAddress() {
        return masterAddress;
    }

    public void setMasterAddress(String masterAddress) {
        this.masterAddress = masterAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMasterAddressResponse that = (ShowMasterAddressResponse) obj;
        return Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.masterAddress, that.masterAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, masterAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMasterAddressResponse {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    masterAddress: ").append(toIndentedString(masterAddress)).append("\n");
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
