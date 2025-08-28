package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchRemoveAvailableZonesRequestBody
 */
public class BatchRemoveAvailableZonesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_list")

    private List<String> availabilityZoneList = null;

    public BatchRemoveAvailableZonesRequestBody withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    public BatchRemoveAvailableZonesRequestBody addAvailabilityZoneListItem(String availabilityZoneListItem) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public BatchRemoveAvailableZonesRequestBody withAvailabilityZoneList(
        Consumer<List<String>> availabilityZoneListSetter) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * **参数解释**：要移除的可用区列表。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRemoveAvailableZonesRequestBody that = (BatchRemoveAvailableZonesRequestBody) obj;
        return Objects.equals(this.availabilityZoneList, that.availabilityZoneList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemoveAvailableZonesRequestBody {\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
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
