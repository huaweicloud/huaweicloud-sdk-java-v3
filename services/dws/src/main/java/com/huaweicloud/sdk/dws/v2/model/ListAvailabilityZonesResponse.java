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
public class ListAvailabilityZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<AvailabilityZone> availabilityZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAvailabilityZonesResponse withAvailabilityZones(List<AvailabilityZone> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public ListAvailabilityZonesResponse addAvailabilityZonesItem(AvailabilityZone availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public ListAvailabilityZonesResponse withAvailabilityZones(
        Consumer<List<AvailabilityZone>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * **参数解释**： 可用区列表。 **取值范围**： 非空对象列表。
     * @return availabilityZones
     */
    public List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<AvailabilityZone> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public ListAvailabilityZonesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 可用区数量。 **取值范围**： 不涉及。
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
        ListAvailabilityZonesResponse that = (ListAvailabilityZonesResponse) obj;
        return Objects.equals(this.availabilityZones, that.availabilityZones) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZones, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailabilityZonesResponse {\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
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
