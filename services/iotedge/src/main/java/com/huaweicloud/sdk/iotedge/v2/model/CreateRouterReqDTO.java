package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建路由请求结构体
 */
public class CreateRouterReqDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="route_id")
    

    private String routeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql")
    

    private String sql;

    public CreateRouterReqDTO withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    


    /**
     * 路由ID，节点下唯一
     * @return routeId
     */
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    

    public CreateRouterReqDTO withSql(String sql) {
        this.sql = sql;
        return this;
    }

    


    /**
     * sql參數
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRouterReqDTO createRouterReqDTO = (CreateRouterReqDTO) o;
        return Objects.equals(this.routeId, createRouterReqDTO.routeId) &&
            Objects.equals(this.sql, createRouterReqDTO.sql);
    }
    @Override
    public int hashCode() {
        return Objects.hash(routeId, sql);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRouterReqDTO {\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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

