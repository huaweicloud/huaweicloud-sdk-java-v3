package com.huaweicloud.sdk.ga.v1.model;

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
public class ListRegionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_regions")

    private List<AreaRegion> areaRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListRegionsResponse withAreaRegions(List<AreaRegion> areaRegions) {
        this.areaRegions = areaRegions;
        return this;
    }

    public ListRegionsResponse addAreaRegionsItem(AreaRegion areaRegionsItem) {
        if (this.areaRegions == null) {
            this.areaRegions = new ArrayList<>();
        }
        this.areaRegions.add(areaRegionsItem);
        return this;
    }

    public ListRegionsResponse withAreaRegions(Consumer<List<AreaRegion>> areaRegionsSetter) {
        if (this.areaRegions == null) {
            this.areaRegions = new ArrayList<>();
        }
        areaRegionsSetter.accept(this.areaRegions);
        return this;
    }

    /**
     * 区域列表。
     * @return areaRegions
     */
    public List<AreaRegion> getAreaRegions() {
        return areaRegions;
    }

    public void setAreaRegions(List<AreaRegion> areaRegions) {
        this.areaRegions = areaRegions;
    }

    public ListRegionsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRegionsResponse listRegionsResponse = (ListRegionsResponse) o;
        return Objects.equals(this.areaRegions, listRegionsResponse.areaRegions)
            && Objects.equals(this.requestId, listRegionsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaRegions, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegionsResponse {\n");
        sb.append("    areaRegions: ").append(toIndentedString(areaRegions)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
