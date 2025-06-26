package com.huaweicloud.sdk.dws.v2.model;

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
public class ListSnapshotCrossRegionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<SnapshotRegion> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSnapshotCrossRegionResponse withRegions(List<SnapshotRegion> regions) {
        this.regions = regions;
        return this;
    }

    public ListSnapshotCrossRegionResponse addRegionsItem(SnapshotRegion regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ListSnapshotCrossRegionResponse withRegions(Consumer<List<SnapshotRegion>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * **参数解释**： 区域列表。 **取值范围**： 不涉及。
     * @return regions
     */
    public List<SnapshotRegion> getRegions() {
        return regions;
    }

    public void setRegions(List<SnapshotRegion> regions) {
        this.regions = regions;
    }

    public ListSnapshotCrossRegionResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总数。 **取值范围**： 不涉及。
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
        ListSnapshotCrossRegionResponse that = (ListSnapshotCrossRegionResponse) obj;
        return Objects.equals(this.regions, that.regions) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotCrossRegionResponse {\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
