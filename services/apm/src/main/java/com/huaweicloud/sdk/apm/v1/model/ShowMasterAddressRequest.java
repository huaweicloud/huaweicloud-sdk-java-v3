package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMasterAddressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    @JacksonXmlProperty(localName = "region_name")

    private String regionName;

    public ShowMasterAddressRequest withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * region英文名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMasterAddressRequest showMasterAddressRequest = (ShowMasterAddressRequest) o;
        return Objects.equals(this.regionName, showMasterAddressRequest.regionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMasterAddressRequest {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
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
