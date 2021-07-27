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
public class ShowResourceHistoryRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="earlier_time")
    
    private Long earlierTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="later_time")
    
    private Long laterTime;
    /**
     * 指定返回数据的时间顺序，默认为倒序
     */
    public static final class ChronologicalOrderEnum {

        
        /**
         * Enum FORWARD for value: "Forward"
         */
        public static final ChronologicalOrderEnum FORWARD = new ChronologicalOrderEnum("Forward");
        
        /**
         * Enum REVERSE for value: "Reverse"
         */
        public static final ChronologicalOrderEnum REVERSE = new ChronologicalOrderEnum("Reverse");
        

        private static final Map<String, ChronologicalOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChronologicalOrderEnum> createStaticFields() {
            Map<String, ChronologicalOrderEnum> map = new HashMap<>();
            map.put("Forward", FORWARD);
            map.put("Reverse", REVERSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChronologicalOrderEnum(String value) {
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
        public static ChronologicalOrderEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChronologicalOrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChronologicalOrderEnum(value);
            }
            return result;
        }

        public static ChronologicalOrderEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChronologicalOrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChronologicalOrderEnum) {
                return this.value.equals(((ChronologicalOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chronological_order")
    
    private ChronologicalOrderEnum chronologicalOrder;

    public ShowResourceHistoryRequest withResourceId(String resourceId) {
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

    

    public ShowResourceHistoryRequest withMarker(String marker) {
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

    

    public ShowResourceHistoryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ShowResourceHistoryRequest withEarlierTime(Long earlierTime) {
        this.earlierTime = earlierTime;
        return this;
    }

    


    /**
     * 指定查询范围的起始时间点，如果不设置此参数，默认为最早的时间
     * @return earlierTime
     */
    public Long getEarlierTime() {
        return earlierTime;
    }

    public void setEarlierTime(Long earlierTime) {
        this.earlierTime = earlierTime;
    }

    

    public ShowResourceHistoryRequest withLaterTime(Long laterTime) {
        this.laterTime = laterTime;
        return this;
    }

    


    /**
     * 指定查询范围的结束时间点，如果不设置此参数，默认为当前时间
     * @return laterTime
     */
    public Long getLaterTime() {
        return laterTime;
    }

    public void setLaterTime(Long laterTime) {
        this.laterTime = laterTime;
    }

    

    public ShowResourceHistoryRequest withChronologicalOrder(ChronologicalOrderEnum chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder;
        return this;
    }

    


    /**
     * 指定返回数据的时间顺序，默认为倒序
     * @return chronologicalOrder
     */
    public ChronologicalOrderEnum getChronologicalOrder() {
        return chronologicalOrder;
    }

    public void setChronologicalOrder(ChronologicalOrderEnum chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceHistoryRequest showResourceHistoryRequest = (ShowResourceHistoryRequest) o;
        return Objects.equals(this.resourceId, showResourceHistoryRequest.resourceId) &&
            Objects.equals(this.marker, showResourceHistoryRequest.marker) &&
            Objects.equals(this.limit, showResourceHistoryRequest.limit) &&
            Objects.equals(this.earlierTime, showResourceHistoryRequest.earlierTime) &&
            Objects.equals(this.laterTime, showResourceHistoryRequest.laterTime) &&
            Objects.equals(this.chronologicalOrder, showResourceHistoryRequest.chronologicalOrder);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId, marker, limit, earlierTime, laterTime, chronologicalOrder);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceHistoryRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    earlierTime: ").append(toIndentedString(earlierTime)).append("\n");
        sb.append("    laterTime: ").append(toIndentedString(laterTime)).append("\n");
        sb.append("    chronologicalOrder: ").append(toIndentedString(chronologicalOrder)).append("\n");
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

