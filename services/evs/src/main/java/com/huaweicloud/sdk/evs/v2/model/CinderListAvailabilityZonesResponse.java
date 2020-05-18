package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.AvailabilityZone;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CinderListAvailabilityZonesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availabilityZoneInfo")
    
    private List<AvailabilityZone> availabilityZoneInfo = null;
    
    public CinderListAvailabilityZonesResponse withAvailabilityZoneInfo(List<AvailabilityZone> availabilityZoneInfo) {
        this.availabilityZoneInfo = availabilityZoneInfo;
        return this;
    }

    
    public CinderListAvailabilityZonesResponse addAvailabilityZoneInfoItem(AvailabilityZone availabilityZoneInfoItem) {
        if (this.availabilityZoneInfo == null) {
            this.availabilityZoneInfo = new ArrayList<>();
        }
        this.availabilityZoneInfo.add(availabilityZoneInfoItem);
        return this;
    }

    public CinderListAvailabilityZonesResponse withAvailabilityZoneInfo(Consumer<List<AvailabilityZone>> availabilityZoneInfoSetter) {
        if(this.availabilityZoneInfo == null ){
            this.availabilityZoneInfo = new ArrayList<>();
        }
        availabilityZoneInfoSetter.accept(this.availabilityZoneInfo);
        return this;
    }

    /**
     * 可用分区的信息。
     * @return availabilityZoneInfo
     */
    public List<AvailabilityZone> getAvailabilityZoneInfo() {
        return availabilityZoneInfo;
    }

    public void setAvailabilityZoneInfo(List<AvailabilityZone> availabilityZoneInfo) {
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
        CinderListAvailabilityZonesResponse cinderListAvailabilityZonesResponse = (CinderListAvailabilityZonesResponse) o;
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

