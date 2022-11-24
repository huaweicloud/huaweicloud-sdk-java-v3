package com.huaweicloud.sdk.cbr.v1.model;

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
public class ShowReplicationCapabilitiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<ProtectableReplicationCapabilitiesRespRegion> regions = null;

    public ShowReplicationCapabilitiesResponse withRegions(List<ProtectableReplicationCapabilitiesRespRegion> regions) {
        this.regions = regions;
        return this;
    }

    public ShowReplicationCapabilitiesResponse addRegionsItem(
        ProtectableReplicationCapabilitiesRespRegion regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ShowReplicationCapabilitiesResponse withRegions(
        Consumer<List<ProtectableReplicationCapabilitiesRespRegion>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 支持复制的区域列表
     * @return regions
     */
    public List<ProtectableReplicationCapabilitiesRespRegion> getRegions() {
        return regions;
    }

    public void setRegions(List<ProtectableReplicationCapabilitiesRespRegion> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowReplicationCapabilitiesResponse showReplicationCapabilitiesResponse =
            (ShowReplicationCapabilitiesResponse) o;
        return Objects.equals(this.regions, showReplicationCapabilitiesResponse.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplicationCapabilitiesResponse {\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
