package com.huaweicloud.sdk.osm.v2.model;

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
public class ListCustomersRegionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_infos")

    private List<Region> regionInfos = null;

    public ListCustomersRegionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListCustomersRegionsResponse withRegionInfos(List<Region> regionInfos) {
        this.regionInfos = regionInfos;
        return this;
    }

    public ListCustomersRegionsResponse addRegionInfosItem(Region regionInfosItem) {
        if (this.regionInfos == null) {
            this.regionInfos = new ArrayList<>();
        }
        this.regionInfos.add(regionInfosItem);
        return this;
    }

    public ListCustomersRegionsResponse withRegionInfos(Consumer<List<Region>> regionInfosSetter) {
        if (this.regionInfos == null) {
            this.regionInfos = new ArrayList<>();
        }
        regionInfosSetter.accept(this.regionInfos);
        return this;
    }

    /**
     * 区域信息
     * @return regionInfos
     */
    public List<Region> getRegionInfos() {
        return regionInfos;
    }

    public void setRegionInfos(List<Region> regionInfos) {
        this.regionInfos = regionInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomersRegionsResponse that = (ListCustomersRegionsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.regionInfos, that.regionInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, regionInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomersRegionsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    regionInfos: ").append(toIndentedString(regionInfos)).append("\n");
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
