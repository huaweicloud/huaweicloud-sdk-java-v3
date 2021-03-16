package com.huaweicloud.sdk.cce.v3.model;




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
 * NodePoolStatus
 */
public class NodePoolStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currentNode")
    
    private Integer currentNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobId")
    
    private String jobId;
    /**
     * 节点池状态，可为空。
     */
    public static final class PhaseEnum {

        
        /**
         * Enum SYNCHRONIZING for value: "Synchronizing"
         */
        public static final PhaseEnum SYNCHRONIZING = new PhaseEnum("Synchronizing");
        
        /**
         * Enum SYNCHRONIZED for value: "Synchronized"
         */
        public static final PhaseEnum SYNCHRONIZED = new PhaseEnum("Synchronized");
        
        /**
         * Enum SOLDOUT for value: "SoldOut"
         */
        public static final PhaseEnum SOLDOUT = new PhaseEnum("SoldOut");
        
        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final PhaseEnum DELETING = new PhaseEnum("Deleting");
        
        /**
         * Enum ERROR for value: "Error"
         */
        public static final PhaseEnum ERROR = new PhaseEnum("Error");
        

        private static final Map<String, PhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PhaseEnum> createStaticFields() {
            Map<String, PhaseEnum> map = new HashMap<>();
            map.put("Synchronizing", SYNCHRONIZING);
            map.put("Synchronized", SYNCHRONIZED);
            map.put("SoldOut", SOLDOUT);
            map.put("Deleting", DELETING);
            map.put("Error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PhaseEnum(String value) {
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
        public static PhaseEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PhaseEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PhaseEnum(value);
            }
            return result;
        }

        public static PhaseEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PhaseEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PhaseEnum) {
                return this.value.equals(((PhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phase")
    
    private PhaseEnum phase;

    public NodePoolStatus withCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
        return this;
    }

    


    /**
     * 当前节点池中节点数量
     * @return currentNode
     */
    public Integer getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
    }

    

    public NodePoolStatus withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 节点池删除时的 JobID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public NodePoolStatus withPhase(PhaseEnum phase) {
        this.phase = phase;
        return this;
    }

    


    /**
     * 节点池状态，可为空。
     * @return phase
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodePoolStatus nodePoolStatus = (NodePoolStatus) o;
        return Objects.equals(this.currentNode, nodePoolStatus.currentNode) &&
            Objects.equals(this.jobId, nodePoolStatus.jobId) &&
            Objects.equals(this.phase, nodePoolStatus.phase);
    }
    @Override
    public int hashCode() {
        return Objects.hash(currentNode, jobId, phase);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolStatus {\n");
        sb.append("    currentNode: ").append(toIndentedString(currentNode)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

