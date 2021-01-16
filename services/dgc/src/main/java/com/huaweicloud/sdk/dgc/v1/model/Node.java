package com.huaweicloud.sdk.dgc.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.Condition;
import com.huaweicloud.sdk.dgc.v1.model.Cron;
import com.huaweicloud.sdk.dgc.v1.model.Event;
import com.huaweicloud.sdk.dgc.v1.model.Location;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Node
 */
public class Node  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 节点的类型
     */
    public static final class NodeTypeEnum {

        
        /**
         * Enum HIVESQL for value: "HiveSQL"
         */
        public static final NodeTypeEnum HIVESQL = new NodeTypeEnum("HiveSQL");
        
        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final NodeTypeEnum SPARKSQL = new NodeTypeEnum("SparkSQL");
        
        /**
         * Enum DWSSQL for value: "DWSSQL"
         */
        public static final NodeTypeEnum DWSSQL = new NodeTypeEnum("DWSSQL");
        
        /**
         * Enum DLISQL for value: "DLISQL"
         */
        public static final NodeTypeEnum DLISQL = new NodeTypeEnum("DLISQL");
        
        /**
         * Enum SHELL for value: "Shell"
         */
        public static final NodeTypeEnum SHELL = new NodeTypeEnum("Shell");
        
        /**
         * Enum CDMJOB for value: "CDMJob"
         */
        public static final NodeTypeEnum CDMJOB = new NodeTypeEnum("CDMJob");
        
        /**
         * Enum DISTRANSFERTASK for value: "DISTransferTask"
         */
        public static final NodeTypeEnum DISTRANSFERTASK = new NodeTypeEnum("DISTransferTask");
        
        /**
         * Enum CSJOB for value: "CSJob"
         */
        public static final NodeTypeEnum CSJOB = new NodeTypeEnum("CSJob");
        
        /**
         * Enum CLOUDTABLEMANAGE for value: "CloudTableManage"
         */
        public static final NodeTypeEnum CLOUDTABLEMANAGE = new NodeTypeEnum("CloudTableManage");
        
        /**
         * Enum OBSMANAGER for value: "OBSManager"
         */
        public static final NodeTypeEnum OBSMANAGER = new NodeTypeEnum("OBSManager");
        
        /**
         * Enum RESTAPI for value: "RESTAPI"
         */
        public static final NodeTypeEnum RESTAPI = new NodeTypeEnum("RESTAPI");
        
        /**
         * Enum MACHINELEARNING for value: "MachineLearning"
         */
        public static final NodeTypeEnum MACHINELEARNING = new NodeTypeEnum("MachineLearning");
        
        /**
         * Enum SMN for value: "SMN"
         */
        public static final NodeTypeEnum SMN = new NodeTypeEnum("SMN");
        
        /**
         * Enum MRSSPARK for value: "MRSSpark"
         */
        public static final NodeTypeEnum MRSSPARK = new NodeTypeEnum("MRSSpark");
        
        /**
         * Enum MAPREDUCE for value: "MapReduce"
         */
        public static final NodeTypeEnum MAPREDUCE = new NodeTypeEnum("MapReduce");
        
        /**
         * Enum DLISPARK for value: "DLISpark"
         */
        public static final NodeTypeEnum DLISPARK = new NodeTypeEnum("DLISpark");
        

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("HiveSQL", HIVESQL);
            map.put("SparkSQL", SPARKSQL);
            map.put("DWSSQL", DWSSQL);
            map.put("DLISQL", DLISQL);
            map.put("Shell", SHELL);
            map.put("CDMJob", CDMJOB);
            map.put("DISTransferTask", DISTRANSFERTASK);
            map.put("CSJob", CSJOB);
            map.put("CloudTableManage", CLOUDTABLEMANAGE);
            map.put("OBSManager", OBSMANAGER);
            map.put("RESTAPI", RESTAPI);
            map.put("MachineLearning", MACHINELEARNING);
            map.put("SMN", SMN);
            map.put("MRSSpark", MRSSPARK);
            map.put("MapReduce", MAPREDUCE);
            map.put("DLISpark", DLISPARK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeTypeEnum(String value) {
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
        public static NodeTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodeTypeEnum(value);
            }
            return result;
        }

        public static NodeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof NodeTypeEnum) {
                return this.value.equals(((NodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeType")
    
    private NodeTypeEnum nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private Location location = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preNodeNames")
    
    private String preNodeNames;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition")
    
    private List<Condition> condition = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeProperties")
    
    private String nodeProperties;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pollingInterval")
    
    private Integer pollingInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maxExecutionTime")
    
    private Integer maxExecutionTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retryTimes")
    
    private Integer retryTimes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retryInterval")
    
    private Integer retryInterval;
    /**
     * 作业失败策略
     */
    public static final class FailPolicyEnum {

        
        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final FailPolicyEnum FAIL = new FailPolicyEnum("FAIL");
        
        /**
         * Enum IGNORE for value: "IGNORE"
         */
        public static final FailPolicyEnum IGNORE = new FailPolicyEnum("IGNORE");
        
        /**
         * Enum SUSPEND for value: "SUSPEND"
         */
        public static final FailPolicyEnum SUSPEND = new FailPolicyEnum("SUSPEND");
        

        private static final Map<String, FailPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailPolicyEnum> createStaticFields() {
            Map<String, FailPolicyEnum> map = new HashMap<>();
            map.put("FAIL", FAIL);
            map.put("IGNORE", IGNORE);
            map.put("SUSPEND", SUSPEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailPolicyEnum(String value) {
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
        public static FailPolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FailPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FailPolicyEnum(value);
            }
            return result;
        }

        public static FailPolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FailPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof FailPolicyEnum) {
                return this.value.equals(((FailPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failPolicy")
    
    private FailPolicyEnum failPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eventTrigger")
    
    private Event eventTrigger = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cronTrigger")
    
    private Cron cronTrigger = null;

    public Node withName(String name) {
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

    public Node withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * 节点的类型
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public Node withLocation(Location location) {
        this.location = location;
        return this;
    }

    public Node withLocation(Consumer<Location> locationSetter) {
        if(this.location == null ){
            this.location = new Location();
            locationSetter.accept(this.location);
        }
        
        return this;
    }


    /**
     * Get location
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Node withPreNodeNames(String preNodeNames) {
        this.preNodeNames = preNodeNames;
        return this;
    }

    


    /**
     * 本节点依赖的前一个节点名称
     * @return preNodeNames
     */
    public String getPreNodeNames() {
        return preNodeNames;
    }

    public void setPreNodeNames(String preNodeNames) {
        this.preNodeNames = preNodeNames;
    }

    public Node withCondition(List<Condition> condition) {
        this.condition = condition;
        return this;
    }

    
    public Node addConditionItem(Condition conditionItem) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        this.condition.add(conditionItem);
        return this;
    }

    public Node withCondition(Consumer<List<Condition>> conditionSetter) {
        if(this.condition == null ){
            this.condition = new ArrayList<>();
        }
        conditionSetter.accept(this.condition);
        return this;
    }

    /**
     * 节点执行条件
     * @return condition
     */
    public List<Condition> getCondition() {
        return condition;
    }

    public void setCondition(List<Condition> condition) {
        this.condition = condition;
    }

    public Node withNodeProperties(String nodeProperties) {
        this.nodeProperties = nodeProperties;
        return this;
    }

    


    /**
     * 节点的属性
     * @return nodeProperties
     */
    public String getNodeProperties() {
        return nodeProperties;
    }

    public void setNodeProperties(String nodeProperties) {
        this.nodeProperties = nodeProperties;
    }

    public Node withPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }

    


    /**
     * 轮询节点执行结果时间间隔
     * @return pollingInterval
     */
    public Integer getPollingInterval() {
        return pollingInterval;
    }

    public void setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    public Node withMaxExecutionTime(Integer maxExecutionTime) {
        this.maxExecutionTime = maxExecutionTime;
        return this;
    }

    


    /**
     * 节点最大执行时间
     * @return maxExecutionTime
     */
    public Integer getMaxExecutionTime() {
        return maxExecutionTime;
    }

    public void setMaxExecutionTime(Integer maxExecutionTime) {
        this.maxExecutionTime = maxExecutionTime;
    }

    public Node withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    


    /**
     * 节点失败重试次数
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public Node withRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    


    /**
     * 失败重试时间间隔
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    public Node withFailPolicy(FailPolicyEnum failPolicy) {
        this.failPolicy = failPolicy;
        return this;
    }

    


    /**
     * 作业失败策略
     * @return failPolicy
     */
    public FailPolicyEnum getFailPolicy() {
        return failPolicy;
    }

    public void setFailPolicy(FailPolicyEnum failPolicy) {
        this.failPolicy = failPolicy;
    }

    public Node withEventTrigger(Event eventTrigger) {
        this.eventTrigger = eventTrigger;
        return this;
    }

    public Node withEventTrigger(Consumer<Event> eventTriggerSetter) {
        if(this.eventTrigger == null ){
            this.eventTrigger = new Event();
            eventTriggerSetter.accept(this.eventTrigger);
        }
        
        return this;
    }


    /**
     * Get eventTrigger
     * @return eventTrigger
     */
    public Event getEventTrigger() {
        return eventTrigger;
    }

    public void setEventTrigger(Event eventTrigger) {
        this.eventTrigger = eventTrigger;
    }

    public Node withCronTrigger(Cron cronTrigger) {
        this.cronTrigger = cronTrigger;
        return this;
    }

    public Node withCronTrigger(Consumer<Cron> cronTriggerSetter) {
        if(this.cronTrigger == null ){
            this.cronTrigger = new Cron();
            cronTriggerSetter.accept(this.cronTrigger);
        }
        
        return this;
    }


    /**
     * Get cronTrigger
     * @return cronTrigger
     */
    public Cron getCronTrigger() {
        return cronTrigger;
    }

    public void setCronTrigger(Cron cronTrigger) {
        this.cronTrigger = cronTrigger;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return Objects.equals(this.name, node.name) &&
            Objects.equals(this.nodeType, node.nodeType) &&
            Objects.equals(this.location, node.location) &&
            Objects.equals(this.preNodeNames, node.preNodeNames) &&
            Objects.equals(this.condition, node.condition) &&
            Objects.equals(this.nodeProperties, node.nodeProperties) &&
            Objects.equals(this.pollingInterval, node.pollingInterval) &&
            Objects.equals(this.maxExecutionTime, node.maxExecutionTime) &&
            Objects.equals(this.retryTimes, node.retryTimes) &&
            Objects.equals(this.retryInterval, node.retryInterval) &&
            Objects.equals(this.failPolicy, node.failPolicy) &&
            Objects.equals(this.eventTrigger, node.eventTrigger) &&
            Objects.equals(this.cronTrigger, node.cronTrigger);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, nodeType, location, preNodeNames, condition, nodeProperties, pollingInterval, maxExecutionTime, retryTimes, retryInterval, failPolicy, eventTrigger, cronTrigger);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Node {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    preNodeNames: ").append(toIndentedString(preNodeNames)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    nodeProperties: ").append(toIndentedString(nodeProperties)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    maxExecutionTime: ").append(toIndentedString(maxExecutionTime)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
        sb.append("    failPolicy: ").append(toIndentedString(failPolicy)).append("\n");
        sb.append("    eventTrigger: ").append(toIndentedString(eventTrigger)).append("\n");
        sb.append("    cronTrigger: ").append(toIndentedString(cronTrigger)).append("\n");
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

