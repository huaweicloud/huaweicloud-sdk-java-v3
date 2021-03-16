package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVpcRouteRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="route_id")
    
    private String routeId;

    public DeleteVpcRouteRequest withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    


    /**
     * Get routeId
     * @return routeId
     */
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteVpcRouteRequest deleteVpcRouteRequest = (DeleteVpcRouteRequest) o;
        return Objects.equals(this.routeId, deleteVpcRouteRequest.routeId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(routeId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVpcRouteRequest {\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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

