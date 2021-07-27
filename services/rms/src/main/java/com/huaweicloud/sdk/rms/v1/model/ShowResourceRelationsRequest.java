package com.huaweicloud.sdk.rms.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowResourceRelationsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;
    /**
     * 资源关系的指向
     */
    public static final class DirectionEnum {

        
        /**
         * Enum IN for value: "in"
         */
        public static final DirectionEnum IN = new DirectionEnum("in");
        
        /**
         * Enum OUT for value: "out"
         */
        public static final DirectionEnum OUT = new DirectionEnum("out");
        

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("in", IN);
            map.put("out", OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DirectionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DirectionEnum(value);
            }
            return result;
        }

        public static DirectionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direction")
    
    private DirectionEnum direction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;

    public ShowResourceRelationsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public ShowResourceRelationsRequest withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    


    /**
     * 资源关系的指向
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    

    public ShowResourceRelationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ShowResourceRelationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceRelationsRequest showResourceRelationsRequest = (ShowResourceRelationsRequest) o;
        return Objects.equals(this.resourceId, showResourceRelationsRequest.resourceId) &&
            Objects.equals(this.direction, showResourceRelationsRequest.direction) &&
            Objects.equals(this.limit, showResourceRelationsRequest.limit) &&
            Objects.equals(this.marker, showResourceRelationsRequest.marker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId, direction, limit, marker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceRelationsRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

