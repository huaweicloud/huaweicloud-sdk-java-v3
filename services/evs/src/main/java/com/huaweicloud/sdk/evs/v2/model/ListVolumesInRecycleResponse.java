package com.huaweicloud.sdk.evs.v2.model;

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
public class ListVolumesInRecycleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<RecycleBinVolume> volumes = null;

    public ListVolumesInRecycleResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释** 云硬盘总数。 **取值范围** 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListVolumesInRecycleResponse withVolumes(List<RecycleBinVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ListVolumesInRecycleResponse addVolumesItem(RecycleBinVolume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ListVolumesInRecycleResponse withVolumes(Consumer<List<RecycleBinVolume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * **参数解释** 云硬盘列表。 **取值范围** 不涉及。
     * @return volumes
     */
    public List<RecycleBinVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<RecycleBinVolume> volumes) {
        this.volumes = volumes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVolumesInRecycleResponse that = (ListVolumesInRecycleResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.volumes, that.volumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, volumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumesInRecycleResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
