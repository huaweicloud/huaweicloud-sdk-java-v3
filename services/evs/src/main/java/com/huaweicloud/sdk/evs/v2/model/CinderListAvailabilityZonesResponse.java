package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CinderListAvailabilityZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availabilityZoneInfo")

    private List<AzInfo> availabilityZoneInfo = null;

    public CinderListAvailabilityZonesResponse withAvailabilityZoneInfo(List<AzInfo> availabilityZoneInfo) {
        this.availabilityZoneInfo = availabilityZoneInfo;
        return this;
    }

    public CinderListAvailabilityZonesResponse addAvailabilityZoneInfoItem(AzInfo availabilityZoneInfoItem) {
        if (this.availabilityZoneInfo == null) {
            this.availabilityZoneInfo = new ArrayList<>();
        }
        this.availabilityZoneInfo.add(availabilityZoneInfoItem);
        return this;
    }

    public CinderListAvailabilityZonesResponse withAvailabilityZoneInfo(
        Consumer<List<AzInfo>> availabilityZoneInfoSetter) {
        if (this.availabilityZoneInfo == null) {
            this.availabilityZoneInfo = new ArrayList<>();
        }
        availabilityZoneInfoSetter.accept(this.availabilityZoneInfo);
        return this;
    }

    /** 查询请求返回的可用分区列表，请参见•
     * [availabilityZoneInfo参数说明](https://support.huaweicloud.com/api-evs/evs_04_2081.html#evs_04_2081__li19751007201910)。
     * 
     * @return availabilityZoneInfo */
    public List<AzInfo> getAvailabilityZoneInfo() {
        return availabilityZoneInfo;
    }

    public void setAvailabilityZoneInfo(List<AzInfo> availabilityZoneInfo) {
        this.availabilityZoneInfo = availabilityZoneInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderListAvailabilityZonesResponse cinderListAvailabilityZonesResponse =
            (CinderListAvailabilityZonesResponse) o;
        return Objects.equals(this.availabilityZoneInfo, cinderListAvailabilityZonesResponse.availabilityZoneInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderListAvailabilityZonesResponse {\n");
        sb.append("    availabilityZoneInfo: ").append(toIndentedString(availabilityZoneInfo)).append("\n");
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
