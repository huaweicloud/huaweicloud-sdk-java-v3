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
     * Gets or Sets traceType
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
            return String.valueOf(value);
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
            if (obj != null && obj instanceof TraceTypeEnum) {
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
     * Gets or Sets traceRating
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
            return String.valueOf(value);
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
            if (obj != null && obj instanceof TraceRatingEnum) {
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
     * Get traceType
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
     * Get limit
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
     * Get from
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
     * Get next
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
     * Get to
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
     * Get trackerName
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
     * Get serviceType
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
     * Get user
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
     * Get resourceId
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
     * Get resourceName
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
     * Get resourceType
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
     * Get traceId
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
     * Get traceName
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
     * Get traceRating
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

