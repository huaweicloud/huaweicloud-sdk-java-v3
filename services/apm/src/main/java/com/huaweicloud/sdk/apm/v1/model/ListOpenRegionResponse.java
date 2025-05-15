package com.huaweicloud.sdk.apm.v1.model;

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
public class ListOpenRegionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_list")

    private List<RegionParam> regionList = null;

    public ListOpenRegionResponse withRegionList(List<RegionParam> regionList) {
        this.regionList = regionList;
        return this;
    }

    public ListOpenRegionResponse addRegionListItem(RegionParam regionListItem) {
        if (this.regionList == null) {
            this.regionList = new ArrayList<>();
        }
        this.regionList.add(regionListItem);
        return this;
    }

    public ListOpenRegionResponse withRegionList(Consumer<List<RegionParam>> regionListSetter) {
        if (this.regionList == null) {
            this.regionList = new ArrayList<>();
        }
        regionListSetter.accept(this.regionList);
        return this;
    }

    /**
     * region列表。
     * @return regionList
     */
    public List<RegionParam> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<RegionParam> regionList) {
        this.regionList = regionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpenRegionResponse that = (ListOpenRegionResponse) obj;
        return Objects.equals(this.regionList, that.regionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpenRegionResponse {\n");
        sb.append("    regionList: ").append(toIndentedString(regionList)).append("\n");
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
