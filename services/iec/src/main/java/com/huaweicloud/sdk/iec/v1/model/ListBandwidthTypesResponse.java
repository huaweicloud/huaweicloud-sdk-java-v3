package com.huaweicloud.sdk.iec.v1.model;

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
public class ListBandwidthTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_bandwidth_types")

    private List<BandwidthTypeOption> shareBandwidthTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListBandwidthTypesResponse withShareBandwidthTypes(List<BandwidthTypeOption> shareBandwidthTypes) {
        this.shareBandwidthTypes = shareBandwidthTypes;
        return this;
    }

    public ListBandwidthTypesResponse addShareBandwidthTypesItem(BandwidthTypeOption shareBandwidthTypesItem) {
        if (this.shareBandwidthTypes == null) {
            this.shareBandwidthTypes = new ArrayList<>();
        }
        this.shareBandwidthTypes.add(shareBandwidthTypesItem);
        return this;
    }

    public ListBandwidthTypesResponse withShareBandwidthTypes(
        Consumer<List<BandwidthTypeOption>> shareBandwidthTypesSetter) {
        if (this.shareBandwidthTypes == null) {
            this.shareBandwidthTypes = new ArrayList<>();
        }
        shareBandwidthTypesSetter.accept(this.shareBandwidthTypes);
        return this;
    }

    /**
     * 共享带宽类型列表对象。
     * @return shareBandwidthTypes
     */
    public List<BandwidthTypeOption> getShareBandwidthTypes() {
        return shareBandwidthTypes;
    }

    public void setShareBandwidthTypes(List<BandwidthTypeOption> shareBandwidthTypes) {
        this.shareBandwidthTypes = shareBandwidthTypes;
    }

    public ListBandwidthTypesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBandwidthTypesResponse that = (ListBandwidthTypesResponse) obj;
        return Objects.equals(this.shareBandwidthTypes, that.shareBandwidthTypes)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareBandwidthTypes, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthTypesResponse {\n");
        sb.append("    shareBandwidthTypes: ").append(toIndentedString(shareBandwidthTypes)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
