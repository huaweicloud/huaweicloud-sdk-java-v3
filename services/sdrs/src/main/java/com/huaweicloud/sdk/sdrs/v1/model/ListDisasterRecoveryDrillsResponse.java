package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListDisasterRecoveryDrillsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_drills")

    private List<ShowDisasterRecoveryDrillParams> disasterRecoveryDrills = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListDisasterRecoveryDrillsResponse withDisasterRecoveryDrills(
        List<ShowDisasterRecoveryDrillParams> disasterRecoveryDrills) {
        this.disasterRecoveryDrills = disasterRecoveryDrills;
        return this;
    }

    public ListDisasterRecoveryDrillsResponse addDisasterRecoveryDrillsItem(
        ShowDisasterRecoveryDrillParams disasterRecoveryDrillsItem) {
        if (this.disasterRecoveryDrills == null) {
            this.disasterRecoveryDrills = new ArrayList<>();
        }
        this.disasterRecoveryDrills.add(disasterRecoveryDrillsItem);
        return this;
    }

    public ListDisasterRecoveryDrillsResponse withDisasterRecoveryDrills(
        Consumer<List<ShowDisasterRecoveryDrillParams>> disasterRecoveryDrillsSetter) {
        if (this.disasterRecoveryDrills == null) {
            this.disasterRecoveryDrills = new ArrayList<>();
        }
        disasterRecoveryDrillsSetter.accept(this.disasterRecoveryDrills);
        return this;
    }

    /** 容灾演练列表。
     * 
     * @return disasterRecoveryDrills */
    public List<ShowDisasterRecoveryDrillParams> getDisasterRecoveryDrills() {
        return disasterRecoveryDrills;
    }

    public void setDisasterRecoveryDrills(List<ShowDisasterRecoveryDrillParams> disasterRecoveryDrills) {
        this.disasterRecoveryDrills = disasterRecoveryDrills;
    }

    public ListDisasterRecoveryDrillsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 列表中包含的容灾演练个数。
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDisasterRecoveryDrillsResponse listDisasterRecoveryDrillsResponse = (ListDisasterRecoveryDrillsResponse) o;
        return Objects.equals(this.disasterRecoveryDrills, listDisasterRecoveryDrillsResponse.disasterRecoveryDrills)
            && Objects.equals(this.count, listDisasterRecoveryDrillsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryDrills, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDisasterRecoveryDrillsResponse {\n");
        sb.append("    disasterRecoveryDrills: ").append(toIndentedString(disasterRecoveryDrills)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
