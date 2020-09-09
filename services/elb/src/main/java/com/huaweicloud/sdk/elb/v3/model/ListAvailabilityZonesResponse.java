package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.AvailabilityZone;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAvailabilityZonesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zones")
    
    private List<List<AvailabilityZone>> availabilityZones = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;

    public ListAvailabilityZonesResponse withAvailabilityZones(List<List<AvailabilityZone>> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    
    public ListAvailabilityZonesResponse addAvailabilityZonesItem(List<AvailabilityZone> availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public ListAvailabilityZonesResponse withAvailabilityZones(Consumer<List<List<AvailabilityZone>>> availabilityZonesSetter) {
        if(this.availabilityZones == null ){
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * 可用区列表
     * @return availabilityZones
     */
    public List<List<AvailabilityZone>> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<List<AvailabilityZone>> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public ListAvailabilityZonesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。 注：自动生成
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailabilityZonesResponse listAvailabilityZonesResponse = (ListAvailabilityZonesResponse) o;
        return Objects.equals(this.availabilityZones, listAvailabilityZonesResponse.availabilityZones) &&
            Objects.equals(this.requestId, listAvailabilityZonesResponse.requestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(availabilityZones, requestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailabilityZonesResponse {\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

