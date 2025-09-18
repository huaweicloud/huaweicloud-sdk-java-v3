package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListCentralNetworkCapabilitiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capability")

    private List<CentralNetworkCapabilityEnum> capability = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListCentralNetworkCapabilitiesRequest withCapability(List<CentralNetworkCapabilityEnum> capability) {
        this.capability = capability;
        return this;
    }

    public ListCentralNetworkCapabilitiesRequest addCapabilityItem(CentralNetworkCapabilityEnum capabilityItem) {
        if (this.capability == null) {
            this.capability = new ArrayList<>();
        }
        this.capability.add(capabilityItem);
        return this;
    }

    public ListCentralNetworkCapabilitiesRequest withCapability(
        Consumer<List<CentralNetworkCapabilityEnum>> capabilitySetter) {
        if (this.capability == null) {
            this.capability = new ArrayList<>();
        }
        capabilitySetter.accept(this.capability);
        return this;
    }

    /**
     * 根据租户能力名查询，可查询多个类型。
     * @return capability
     */
    public List<CentralNetworkCapabilityEnum> getCapability() {
        return capability;
    }

    public void setCapability(List<CentralNetworkCapabilityEnum> capability) {
        this.capability = capability;
    }

    public ListCentralNetworkCapabilitiesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCentralNetworkCapabilitiesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，从上次API调用返回的翻页数据中获取，可填写前一页marker或者后一页marker，填入前一页previous_marker就向前翻页，后一页next_marker就向后翻页。 翻页过程中，查询条件不能修改，包括过滤条件、排序条件、limit。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkCapabilitiesRequest that = (ListCentralNetworkCapabilitiesRequest) obj;
        return Objects.equals(this.capability, that.capability) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capability, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkCapabilitiesRequest {\n");
        sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
