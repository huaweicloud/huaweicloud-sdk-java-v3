package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.ZoneState;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 可用分区的信息。
 */
public class AvailabilityZone  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zoneName")
    
    private String zoneName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zoneState")
    
    private ZoneState zoneState = null;

    public AvailabilityZone withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    


    /**
     * 可用分区的名字。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public AvailabilityZone withZoneState(ZoneState zoneState) {
        this.zoneState = zoneState;
        return this;
    }

    public AvailabilityZone withZoneState(Consumer<ZoneState> zoneStateSetter) {
        if(this.zoneState == null ){
            this.zoneState = new ZoneState();
        }
        zoneStateSetter.accept(this.zoneState);
        return this;
    }


    /**
     * Get zoneState
     * @return zoneState
     */
    public ZoneState getZoneState() {
        return zoneState;
    }

    public void setZoneState(ZoneState zoneState) {
        this.zoneState = zoneState;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailabilityZone availabilityZone = (AvailabilityZone) o;
        return Objects.equals(this.zoneName, availabilityZone.zoneName) &&
            Objects.equals(this.zoneState, availabilityZone.zoneState);
    }
    @Override
    public int hashCode() {
        return Objects.hash(zoneName, zoneState);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZone {\n");
            sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
            sb.append("    zoneState: ").append(toIndentedString(zoneState)).append("\n");
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

