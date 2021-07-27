package com.huaweicloud.sdk.cts.v3.model;




import java.util.Collections;

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
public class ListTracesRequest  {

    /**
     * 标识审计事件类型。 目前支持管理类事件（system）和数据类事件（data）。 默认值为\"system\"。
     */
    public static final class TraceTypeEnum {

        
        /**
         * Enum SYSTEM for value: "system"
         */
        public static final TraceTypeEnum SYSTEM = new TraceTypeEnum("system");
        
        /**
         * Enum DATA for value: "data"
         */
        public static final TraceTypeEnum DATA = new TraceTypeEnum("data");
        

        private static final Map<String, TraceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TraceTypeEnum> createStaticFields() {
            Map<String, TraceTypeEnum> map = new HashMap<>();
            map.put("system", SYSTEM);
            map.put("data", DATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TraceTypeEnum(String value) {
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
        public static TraceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TraceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TraceTypeEnum(value);
            }
            return result;
        }

        public static TraceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TraceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TraceTypeEnum) {
                return this.value.equals(((TraceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_type")
    
    private TraceTypeEnum traceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    private Long from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next")
    
    private String next;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    private Long to;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_id")
    
    private String traceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_name")
    
    private String traceName;
    /**
     * 标示查询事件列表对应的事件等级目前有三种：正常(normal), 警告(warning),事故(incident)。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。
     */
    public static final class TraceRatingEnum {

        
        /**
         * Enum NORMAL for value: "normal"
         */
        public static final TraceRatingEnum NORMAL = new TraceRatingEnum("normal");
        
        /**
         * Enum WARNING for value: "warning"
         */
        public static final TraceRatingEnum WARNING = new TraceRatingEnum("warning");
        
        /**
         * Enum INCIDENT for value: "incident"
         */
        public static final TraceRatingEnum INCIDENT = new TraceRatingEnum("incident");
        

        private static final Map<String, TraceRatingEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TraceRatingEnum> createStaticFields() {
            Map<String, TraceRatingEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("warning", WARNING);
            map.put("incident", INCIDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TraceRatingEnum(String value) {
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
        public static TraceRatingEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TraceRatingEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TraceRatingEnum(value);
            }
            return result;
        }

        public static TraceRatingEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TraceRatingEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TraceRatingEnum) {
                return this.value.equals(((TraceRatingEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_rating")
    
    private TraceRatingEnum traceRating;

    public ListTracesRequest withTraceType(TraceTypeEnum traceType) {
        this.traceType = traceType;
        return this;
    }

    


    /**
     * 标识审计事件类型。 目前支持管理类事件（system）和数据类事件（data）。 默认值为\"system\"。
     * @return traceType
     */
    public TraceTypeEnum getTraceType() {
        return traceType;
    }

    public void setTraceType(TraceTypeEnum traceType) {
        this.traceType = traceType;
    }

    

    public ListTracesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 标示查询事件列表中限定返回的事件条数。不传时默认10条，最大值200条。
     * minimum: 0
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListTracesRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    


    /**
     * 标识查询事件列表的起始时间戳（timestamp，为标准UTC时间，毫秒级，13位数字，不包括传入时间）默认为上一小时的时间戳。查询条件from与to配套使用。
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    

    public ListTracesRequest withNext(String next) {
        this.next = next;
        return this;
    }

    


    /**
     * 取值为响应中中marker的值，用于标识查询事件的起始时间（自此条事件的记录时间起，向更早时间查询）。 可以与“from”、“to”结合使用。 最终的查询条件取两组时间条件的交集。
     * @return next
     */
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    

    public ListTracesRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    


    /**
     * 标识查询事件列表的结束时间戳（timestamp，为标准UTC时间，毫秒级，13位数字，不包括传入时间）默认为当前时间戳。查询条件to与from配套使用。
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    

    public ListTracesRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    


    /**
     * 当\"trace_type\"字段值为\"system\"时，该字段值默认为\"system\"。 当\"trace_type\"字段值为\"data\"时，该字段值可以传入数据类追踪器名称，达到筛选某个数据类追踪器下的数据事件目的。
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    

    public ListTracesRequest withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * 标识查询事件列表对应的云服务类型。必须为已对接CTS的云服务的英文缩写，且服务类型一般为大写字母。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。 已对接的云服务列表参见《云审计服务用户指南》“支持的服务”章节。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    

    public ListTracesRequest withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * 标识特定用户名称，用以查询该用户下的所有事件。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    

    public ListTracesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 标示查询事件列表对应的云服务资源ID。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public ListTracesRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 标示查询事件列表对应的的资源名称。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。 说明：该字段可能包含大写字母。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    public ListTracesRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 标示查询事件列表对应的资源类型。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public ListTracesRequest withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    


    /**
     * 标示某一条事件的事件ID。当传入这个查询条件时，其他查询条件自动不生效。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    

    public ListTracesRequest withTraceName(String traceName) {
        this.traceName = traceName;
        return this;
    }

    


    /**
     * 标示查询事件列表对应的事件名称。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。 说明：该字段可能包含大写字母。
     * @return traceName
     */
    public String getTraceName() {
        return traceName;
    }

    public void setTraceName(String traceName) {
        this.traceName = traceName;
    }

    

    public ListTracesRequest withTraceRating(TraceRatingEnum traceRating) {
        this.traceRating = traceRating;
        return this;
    }

    


    /**
     * 标示查询事件列表对应的事件等级目前有三种：正常(normal), 警告(warning),事故(incident)。 当\"trace_type\"字段值为\"system\"时，该字段筛选有效\"。
     * @return traceRating
     */
    public TraceRatingEnum getTraceRating() {
        return traceRating;
    }

    public void setTraceRating(TraceRatingEnum traceRating) {
        this.traceRating = traceRating;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTracesRequest listTracesRequest = (ListTracesRequest) o;
        return Objects.equals(this.traceType, listTracesRequest.traceType) &&
            Objects.equals(this.limit, listTracesRequest.limit) &&
            Objects.equals(this.from, listTracesRequest.from) &&
            Objects.equals(this.next, listTracesRequest.next) &&
            Objects.equals(this.to, listTracesRequest.to) &&
            Objects.equals(this.trackerName, listTracesRequest.trackerName) &&
            Objects.equals(this.serviceType, listTracesRequest.serviceType) &&
            Objects.equals(this.user, listTracesRequest.user) &&
            Objects.equals(this.resourceId, listTracesRequest.resourceId) &&
            Objects.equals(this.resourceName, listTracesRequest.resourceName) &&
            Objects.equals(this.resourceType, listTracesRequest.resourceType) &&
            Objects.equals(this.traceId, listTracesRequest.traceId) &&
            Objects.equals(this.traceName, listTracesRequest.traceName) &&
            Objects.equals(this.traceRating, listTracesRequest.traceRating);
    }
    @Override
    public int hashCode() {
        return Objects.hash(traceType, limit, from, next, to, trackerName, serviceType, user, resourceId, resourceName, resourceType, traceId, traceName, traceRating);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTracesRequest {\n");
        sb.append("    traceType: ").append(toIndentedString(traceType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    traceName: ").append(toIndentedString(traceName)).append("\n");
        sb.append("    traceRating: ").append(toIndentedString(traceRating)).append("\n");
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

