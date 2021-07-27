package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.Location;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateDeploymentResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locations")
    
    private List<Location> locations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;

    public CreateDeploymentResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 部署计划ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CreateDeploymentResponse withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    
    public CreateDeploymentResponse addLocationsItem(Location locationsItem) {
        if(this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.add(locationsItem);
        return this;
    }

    public CreateDeploymentResponse withLocations(Consumer<List<Location>> locationsSetter) {
        if(this.locations == null) {
            this.locations = new ArrayList<>();
        }
        locationsSetter.accept(this.locations);
        return this;
    }

    /**
     * 部署位置信息列表。
     * @return locations
     */
    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    

    public CreateDeploymentResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 订单ID。 开通包年/包月资源时返回。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeploymentResponse createDeploymentResponse = (CreateDeploymentResponse) o;
        return Objects.equals(this.id, createDeploymentResponse.id) &&
            Objects.equals(this.locations, createDeploymentResponse.locations) &&
            Objects.equals(this.orderId, createDeploymentResponse.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, locations, orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

