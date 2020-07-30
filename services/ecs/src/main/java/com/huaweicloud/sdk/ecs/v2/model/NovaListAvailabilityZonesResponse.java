package com.huaweicloud.sdk.ecs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaAvailabilityZone;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NovaListAvailabilityZonesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availabilityZoneInfo")
    
    private List<NovaAvailabilityZone> availabilityZoneInfo = null;
    
    public NovaListAvailabilityZonesResponse withAvailabilityZoneInfo(List<NovaAvailabilityZone> availabilityZoneInfo) {
        this.availabilityZoneInfo = availabilityZoneInfo;
        return this;
    }

    
    public NovaListAvailabilityZonesResponse addAvailabilityZoneInfoItem(NovaAvailabilityZone availabilityZoneInfoItem) {
        if (this.availabilityZoneInfo == null) {
            this.availabilityZoneInfo = new ArrayList<>();
        }
        this.availabilityZoneInfo.add(availabilityZoneInfoItem);
        return this;
    }

    public NovaListAvailabilityZonesResponse withAvailabilityZoneInfo(Consumer<List<NovaAvailabilityZone>> availabilityZoneInfoSetter) {
        if(this.availabilityZoneInfo == null ){
            this.availabilityZoneInfo = new ArrayList<>();
        }
        availabilityZoneInfoSetter.accept(this.availabilityZoneInfo);
        return this;
    }

    /**
     * 可用域信息。
     * @return availabilityZoneInfo
     */
    public List<NovaAvailabilityZone> getAvailabilityZoneInfo() {
        return availabilityZoneInfo;
    }

    public void setAvailabilityZoneInfo(List<NovaAvailabilityZone> availabilityZoneInfo) {
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
        NovaListAvailabilityZonesResponse novaListAvailabilityZonesResponse = (NovaListAvailabilityZonesResponse) o;
        return Objects.equals(this.availabilityZoneInfo, novaListAvailabilityZonesResponse.availabilityZoneInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListAvailabilityZonesResponse {\n");
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

