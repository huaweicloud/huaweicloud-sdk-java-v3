package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.RouterDetailRespDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRoutesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="routes")
    
    private List<RouterDetailRespDTO> routes = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    public ListRoutesResponse withRoutes(List<RouterDetailRespDTO> routes) {
        this.routes = routes;
        return this;
    }

    
    public ListRoutesResponse addRoutesItem(RouterDetailRespDTO routesItem) {
        if(this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public ListRoutesResponse withRoutes(Consumer<List<RouterDetailRespDTO>> routesSetter) {
        if(this.routes == null) {
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 路由列表
     * @return routes
     */
    public List<RouterDetailRespDTO> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouterDetailRespDTO> routes) {
        this.routes = routes;
    }

    

    public ListRoutesResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRoutesResponse listRoutesResponse = (ListRoutesResponse) o;
        return Objects.equals(this.routes, listRoutesResponse.routes) &&
            Objects.equals(this.updateTime, listRoutesResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(routes, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRoutesResponse {\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

