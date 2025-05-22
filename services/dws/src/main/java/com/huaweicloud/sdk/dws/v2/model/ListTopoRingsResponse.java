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
public class ListTopoRingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_rings")

    private List<TopoRingInfo> clusterRings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListTopoRingsResponse withClusterRings(List<TopoRingInfo> clusterRings) {
        this.clusterRings = clusterRings;
        return this;
    }

    public ListTopoRingsResponse addClusterRingsItem(TopoRingInfo clusterRingsItem) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        this.clusterRings.add(clusterRingsItem);
        return this;
    }

    public ListTopoRingsResponse withClusterRings(Consumer<List<TopoRingInfo>> clusterRingsSetter) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        clusterRingsSetter.accept(this.clusterRings);
        return this;
    }

    /**
     * **参数解释**： 集群拓扑环列表信息。 **取值范围**： 不涉及。
     * @return clusterRings
     */
    public List<TopoRingInfo> getClusterRings() {
        return clusterRings;
    }

    public void setClusterRings(List<TopoRingInfo> clusterRings) {
        this.clusterRings = clusterRings;
    }

    public ListTopoRingsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 集群环数量。 **取值范围**： 不涉及。
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
        ListTopoRingsResponse that = (ListTopoRingsResponse) obj;
        return Objects.equals(this.clusterRings, that.clusterRings) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterRings, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopoRingsResponse {\n");
        sb.append("    clusterRings: ").append(toIndentedString(clusterRings)).append("\n");
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
