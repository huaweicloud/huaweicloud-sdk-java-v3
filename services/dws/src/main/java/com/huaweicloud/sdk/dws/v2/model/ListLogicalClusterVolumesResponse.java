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
public class ListLogicalClusterVolumesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<LogicalClusterVolume> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListLogicalClusterVolumesResponse withVolumes(List<LogicalClusterVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ListLogicalClusterVolumesResponse addVolumesItem(LogicalClusterVolume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ListLogicalClusterVolumesResponse withVolumes(Consumer<List<LogicalClusterVolume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * **参数解释**： 逻辑集群磁盘信息列表。 **取值范围**： 不涉及。
     * @return volumes
     */
    public List<LogicalClusterVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<LogicalClusterVolume> volumes) {
        this.volumes = volumes;
    }

    public ListLogicalClusterVolumesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群磁盘总数。 **取值范围**： 不涉及。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
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
        ListLogicalClusterVolumesResponse that = (ListLogicalClusterVolumesResponse) obj;
        return Objects.equals(this.volumes, that.volumes) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumes, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogicalClusterVolumesResponse {\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
