package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceBiactiveRegionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_codes")

    private List<String> regionCodes = null;

    public ShowInstanceBiactiveRegionsResponse withRegionCodes(List<String> regionCodes) {
        this.regionCodes = regionCodes;
        return this;
    }

    public ShowInstanceBiactiveRegionsResponse addRegionCodesItem(String regionCodesItem) {
        if (this.regionCodes == null) {
            this.regionCodes = new ArrayList<>();
        }
        this.regionCodes.add(regionCodesItem);
        return this;
    }

    public ShowInstanceBiactiveRegionsResponse withRegionCodes(Consumer<List<String>> regionCodesSetter) {
        if (this.regionCodes == null) {
            this.regionCodes = new ArrayList<>();
        }
        regionCodesSetter.accept(this.regionCodes);
        return this;
    }

    /**
     * Get regionCodes
     * @return regionCodes
     */
    public List<String> getRegionCodes() {
        return regionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        this.regionCodes = regionCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceBiactiveRegionsResponse that = (ShowInstanceBiactiveRegionsResponse) obj;
        return Objects.equals(this.regionCodes, that.regionCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceBiactiveRegionsResponse {\n");
        sb.append("    regionCodes: ").append(toIndentedString(regionCodes)).append("\n");
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
