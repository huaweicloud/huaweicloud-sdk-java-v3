package com.huaweicloud.sdk.rabbitmq.v2.model;




import java.util.Collections;

import java.util.Collections;

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
public class ListInstancesDetailsRequest  {

    /**
     * Gets or Sets engine
     */
    public static final class EngineEnum {

        
        /**
         * Enum RABBITMQ for value: "rabbitmq"
         */
        public static final EngineEnum RABBITMQ = new EngineEnum("rabbitmq");
        

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("rabbitmq", RABBITMQ);
            return Collections.unmodifiableMap(map);
        }

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
            EngineEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineEnum(value);
            }
            return result;
        }

        public static EngineEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineEnum result = STATIC_FIELDS.get(value);
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
    public static final class StatusEnum {

        
        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");
        
        /**
         * Enum CREATEFAILED for value: "CREATEFAILED"
         */
        public static final StatusEnum CREATEFAILED = new StatusEnum("CREATEFAILED");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");
        
        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StatusEnum STARTING = new StatusEnum("STARTING");
        
        /**
         * Enum RESTARTING for value: "RESTARTING"
         */
        public static final StatusEnum RESTARTING = new StatusEnum("RESTARTING");
        
        /**
         * Enum CLOSING for value: "CLOSING"
         */
        public static final StatusEnum CLOSING = new StatusEnum("CLOSING");
        
        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATEFAILED", CREATEFAILED);
            map.put("RUNNING", RUNNING);
            map.put("ERROR", ERROR);
            map.put("STARTING", STARTING);
            map.put("RESTARTING", RESTARTING);
            map.put("CLOSING", CLOSING);
            map.put("FROZEN", FROZEN);
            return Collections.unmodifiableMap(map);
        }

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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
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
    public static final class IncludeFailureEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IncludeFailureEnum TRUE = new IncludeFailureEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IncludeFailureEnum FALSE = new IncludeFailureEnum("false");
        

        private static final Map<String, IncludeFailureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IncludeFailureEnum> createStaticFields() {
            Map<String, IncludeFailureEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

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
            IncludeFailureEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IncludeFailureEnum(value);
            }
            return result;
        }

        public static IncludeFailureEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IncludeFailureEnum result = STATIC_FIELDS.get(value);
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
    public static final class ExactMatchNameEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final ExactMatchNameEnum TRUE = new ExactMatchNameEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final ExactMatchNameEnum FALSE = new ExactMatchNameEnum("false");
        

        private static final Map<String, ExactMatchNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExactMatchNameEnum> createStaticFields() {
            Map<String, ExactMatchNameEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

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
            ExactMatchNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExactMatchNameEnum(value);
            }
            return result;
        }

        public static ExactMatchNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ExactMatchNameEnum result = STATIC_FIELDS.get(value);
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

    public ListInstancesDetailsRequest withEngine(EngineEnum engine) {
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

    public ListInstancesDetailsRequest withName(String name) {
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

    public ListInstancesDetailsRequest withInstanceId(String instanceId) {
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

    public ListInstancesDetailsRequest withStatus(StatusEnum status) {
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

    public ListInstancesDetailsRequest withIncludeFailure(IncludeFailureEnum includeFailure) {
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

    public ListInstancesDetailsRequest withExactMatchName(ExactMatchNameEnum exactMatchName) {
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

    public ListInstancesDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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
        ListInstancesDetailsRequest listInstancesDetailsRequest = (ListInstancesDetailsRequest) o;
        return Objects.equals(this.engine, listInstancesDetailsRequest.engine) &&
            Objects.equals(this.name, listInstancesDetailsRequest.name) &&
            Objects.equals(this.instanceId, listInstancesDetailsRequest.instanceId) &&
            Objects.equals(this.status, listInstancesDetailsRequest.status) &&
            Objects.equals(this.includeFailure, listInstancesDetailsRequest.includeFailure) &&
            Objects.equals(this.exactMatchName, listInstancesDetailsRequest.exactMatchName) &&
            Objects.equals(this.enterpriseProjectId, listInstancesDetailsRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(engine, name, instanceId, status, includeFailure, exactMatchName, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesDetailsRequest {\n");
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

