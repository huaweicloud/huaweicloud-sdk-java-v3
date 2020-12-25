package com.huaweicloud.sdk.dds.v3.model;




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
public class ListSlowLogsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_date")
    
    private String startDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_date")
    
    private String endDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;
    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        
        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final TypeEnum INSERT = new TypeEnum("INSERT");
        
        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final TypeEnum QUERY = new TypeEnum("QUERY");
        
        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final TypeEnum UPDATE = new TypeEnum("UPDATE");
        
        /**
         * Enum REMOVE for value: "REMOVE"
         */
        public static final TypeEnum REMOVE = new TypeEnum("REMOVE");
        
        /**
         * Enum GETMORE for value: "GETMORE"
         */
        public static final TypeEnum GETMORE = new TypeEnum("GETMORE");
        
        /**
         * Enum COMMAND for value: "COMMAND"
         */
        public static final TypeEnum COMMAND = new TypeEnum("COMMAND");
        
        /**
         * Enum KILLCURSORS for value: "KILLCURSORS"
         */
        public static final TypeEnum KILLCURSORS = new TypeEnum("KILLCURSORS");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("INSERT", INSERT);
            map.put("QUERY", QUERY);
            map.put("UPDATE", UPDATE);
            map.put("REMOVE", REMOVE);
            map.put("GETMORE", GETMORE);
            map.put("COMMAND", COMMAND);
            map.put("KILLCURSORS", KILLCURSORS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListSlowLogsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSlowLogsRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    


    /**
     * Get startDate
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListSlowLogsRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    


    /**
     * Get endDate
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ListSlowLogsRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * Get nodeId
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListSlowLogsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListSlowLogsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 1999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSlowLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSlowLogsRequest listSlowLogsRequest = (ListSlowLogsRequest) o;
        return Objects.equals(this.instanceId, listSlowLogsRequest.instanceId) &&
            Objects.equals(this.startDate, listSlowLogsRequest.startDate) &&
            Objects.equals(this.endDate, listSlowLogsRequest.endDate) &&
            Objects.equals(this.nodeId, listSlowLogsRequest.nodeId) &&
            Objects.equals(this.type, listSlowLogsRequest.type) &&
            Objects.equals(this.offset, listSlowLogsRequest.offset) &&
            Objects.equals(this.limit, listSlowLogsRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, startDate, endDate, nodeId, type, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowLogsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

