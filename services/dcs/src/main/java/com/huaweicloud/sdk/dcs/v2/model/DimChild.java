package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 维度对象结构体
 */
public class DimChild  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim_name")
    
    private String dimName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim_route")
    
    private String dimRoute;

    public DimChild withDimName(String dimName) {
        this.dimName = dimName;
        return this;
    }

    


    /**
     * 维度名称，当前支持维度有dcs_instance_id、dcs_cluster_redis_node、 dcs_cluster_proxy_node和dcs_memcached_instance_id。
     * @return dimName
     */
    public String getDimName() {
        return dimName;
    }

    public void setDimName(String dimName) {
        this.dimName = dimName;
    }

    

    public DimChild withDimRoute(String dimRoute) {
        this.dimRoute = dimRoute;
        return this;
    }

    


    /**
     * 维度的路由，结构为主维度名称,当前维度名称，比如： dim_name字段为dcs_cluster_redis_node时，这个字段的值为dcs_instance_id,dcs_cluster_redis_node。
     * @return dimRoute
     */
    public String getDimRoute() {
        return dimRoute;
    }

    public void setDimRoute(String dimRoute) {
        this.dimRoute = dimRoute;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DimChild dimChild = (DimChild) o;
        return Objects.equals(this.dimName, dimChild.dimName) &&
            Objects.equals(this.dimRoute, dimChild.dimRoute);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dimName, dimRoute);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimChild {\n");
        sb.append("    dimName: ").append(toIndentedString(dimName)).append("\n");
        sb.append("    dimRoute: ").append(toIndentedString(dimRoute)).append("\n");
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

