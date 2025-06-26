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
public class ListSnapshotCrossRegionPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_region_configs")

    private List<CrossRegionSnapshotConfig> crossRegionConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSnapshotCrossRegionPolicyResponse withCrossRegionConfigs(
        List<CrossRegionSnapshotConfig> crossRegionConfigs) {
        this.crossRegionConfigs = crossRegionConfigs;
        return this;
    }

    public ListSnapshotCrossRegionPolicyResponse addCrossRegionConfigsItem(
        CrossRegionSnapshotConfig crossRegionConfigsItem) {
        if (this.crossRegionConfigs == null) {
            this.crossRegionConfigs = new ArrayList<>();
        }
        this.crossRegionConfigs.add(crossRegionConfigsItem);
        return this;
    }

    public ListSnapshotCrossRegionPolicyResponse withCrossRegionConfigs(
        Consumer<List<CrossRegionSnapshotConfig>> crossRegionConfigsSetter) {
        if (this.crossRegionConfigs == null) {
            this.crossRegionConfigs = new ArrayList<>();
        }
        crossRegionConfigsSetter.accept(this.crossRegionConfigs);
        return this;
    }

    /**
     * **参数解释**： 跨区域配置信息。 **取值范围**： 不涉及。
     * @return crossRegionConfigs
     */
    public List<CrossRegionSnapshotConfig> getCrossRegionConfigs() {
        return crossRegionConfigs;
    }

    public void setCrossRegionConfigs(List<CrossRegionSnapshotConfig> crossRegionConfigs) {
        this.crossRegionConfigs = crossRegionConfigs;
    }

    public ListSnapshotCrossRegionPolicyResponse withCount(Integer count) {
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
        ListSnapshotCrossRegionPolicyResponse that = (ListSnapshotCrossRegionPolicyResponse) obj;
        return Objects.equals(this.crossRegionConfigs, that.crossRegionConfigs)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crossRegionConfigs, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotCrossRegionPolicyResponse {\n");
        sb.append("    crossRegionConfigs: ").append(toIndentedString(crossRegionConfigs)).append("\n");
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
