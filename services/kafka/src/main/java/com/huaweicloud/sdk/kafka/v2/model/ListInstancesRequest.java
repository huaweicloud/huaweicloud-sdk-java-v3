package com.huaweicloud.sdk.kafka.v2.model;




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
public class ListInstancesRequest  {

    /**
     * Gets or Sets engine
     */
    public static class EngineEnum {

        
        /**
         * Enum KAFKA for value: "kafka"
         */
        public static final EngineEnum KAFKA = new EngineEnum("kafka");
        

        public static final Map<String, EngineEnum> staticFields = new HashMap<String, EngineEnum>() {
            { 
                put("kafka", KAFKA);
            }
        };

        private String value;

        EngineEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EngineEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EngineEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new EngineEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static EngineEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine")
    
    private EngineEnum engine;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;
    /**
     * Gets or Sets status
     */
    public static class StatusEnum {

        
        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");
        
        /**
         * Enum FAULTY for value: "FAULTY"
         */
        public static final StatusEnum FAULTY = new StatusEnum("FAULTY");
        
        /**
         * Enum RESTARTING for value: "RESTARTING"
         */
        public static final StatusEnum RESTARTING = new StatusEnum("RESTARTING");
        
        /**
         * Enum RESIZING for value: "RESIZING"
         */
        public static final StatusEnum RESIZING = new StatusEnum("RESIZING");
        
        /**
         * Enum RESIZING_FAILED for value: "RESIZING FAILED"
         */
        public static final StatusEnum RESIZING_FAILED = new StatusEnum("RESIZING FAILED");
        
        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");
        

        public static final Map<String, StatusEnum> staticFields = new HashMap<String, StatusEnum>() {
            { 
                put("CREATING", CREATING);
                put("RUNNING", RUNNING);
                put("FAULTY", FAULTY);
                put("RESTARTING", RESTARTING);
                put("RESIZING", RESIZING);
                put("RESIZING FAILED", RESIZING_FAILED);
                put("FROZEN", FROZEN);
            }
        };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;
    /**
     * Gets or Sets includeFailure
     */
    public static class IncludeFailureEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IncludeFailureEnum TRUE = new IncludeFailureEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IncludeFailureEnum FALSE = new IncludeFailureEnum("false");
        

        public static final Map<String, IncludeFailureEnum> staticFields = new HashMap<String, IncludeFailureEnum>() {
            { 
                put("true", TRUE);
                put("false", FALSE);
            }
        };

        private String value;

        IncludeFailureEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IncludeFailureEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IncludeFailureEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IncludeFailureEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IncludeFailureEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IncludeFailureEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IncludeFailureEnum) {
                return this.value.equals(((IncludeFailureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_failure")
    
    private IncludeFailureEnum includeFailure;
    /**
     * Gets or Sets exactMatchName
     */
    public static class ExactMatchNameEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final ExactMatchNameEnum TRUE = new ExactMatchNameEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final ExactMatchNameEnum FALSE = new ExactMatchNameEnum("false");
        

        public static final Map<String, ExactMatchNameEnum> staticFields = new HashMap<String, ExactMatchNameEnum>() {
            { 
                put("true", TRUE);
                put("false", FALSE);
            }
        };

        private String value;

        ExactMatchNameEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ExactMatchNameEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ExactMatchNameEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ExactMatchNameEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ExactMatchNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ExactMatchNameEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ExactMatchNameEnum) {
                return this.value.equals(((ExactMatchNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exact_match_name")
    
    private ExactMatchNameEnum exactMatchName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListInstancesRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    


    /**
     * Get engine
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public ListInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesRequest withInstanceId(String instanceId) {
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

    public ListInstancesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListInstancesRequest withIncludeFailure(IncludeFailureEnum includeFailure) {
        this.includeFailure = includeFailure;
        return this;
    }

    


    /**
     * Get includeFailure
     * @return includeFailure
     */
    public IncludeFailureEnum getIncludeFailure() {
        return includeFailure;
    }

    public void setIncludeFailure(IncludeFailureEnum includeFailure) {
        this.includeFailure = includeFailure;
    }

    public ListInstancesRequest withExactMatchName(ExactMatchNameEnum exactMatchName) {
        this.exactMatchName = exactMatchName;
        return this;
    }

    


    /**
     * Get exactMatchName
     * @return exactMatchName
     */
    public ExactMatchNameEnum getExactMatchName() {
        return exactMatchName;
    }

    public void setExactMatchName(ExactMatchNameEnum exactMatchName) {
        this.exactMatchName = exactMatchName;
    }

    public ListInstancesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRequest listInstancesRequest = (ListInstancesRequest) o;
        return Objects.equals(this.engine, listInstancesRequest.engine) &&
            Objects.equals(this.name, listInstancesRequest.name) &&
            Objects.equals(this.instanceId, listInstancesRequest.instanceId) &&
            Objects.equals(this.status, listInstancesRequest.status) &&
            Objects.equals(this.includeFailure, listInstancesRequest.includeFailure) &&
            Objects.equals(this.exactMatchName, listInstancesRequest.exactMatchName) &&
            Objects.equals(this.enterpriseProjectId, listInstancesRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(engine, name, instanceId, status, includeFailure, exactMatchName, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    includeFailure: ").append(toIndentedString(includeFailure)).append("\n");
        sb.append("    exactMatchName: ").append(toIndentedString(exactMatchName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

