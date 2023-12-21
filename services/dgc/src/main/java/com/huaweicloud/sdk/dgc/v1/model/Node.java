package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Node
 */
public class Node {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 节点的类型
     */
    public static final class TypeEnum {

        /**
         * Enum HIVESQL for value: "HiveSQL"
         */
        public static final TypeEnum HIVESQL = new TypeEnum("HiveSQL");

        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final TypeEnum SPARKSQL = new TypeEnum("SparkSQL");

        /**
         * Enum DWSSQL for value: "DWSSQL"
         */
        public static final TypeEnum DWSSQL = new TypeEnum("DWSSQL");

        /**
         * Enum DLISQL for value: "DLISQL"
         */
        public static final TypeEnum DLISQL = new TypeEnum("DLISQL");

        /**
         * Enum SHELL for value: "Shell"
         */
        public static final TypeEnum SHELL = new TypeEnum("Shell");

        /**
         * Enum CDMJOB for value: "CDMJob"
         */
        public static final TypeEnum CDMJOB = new TypeEnum("CDMJob");

        /**
         * Enum DISTRANSFERTASK for value: "DISTransferTask"
         */
        public static final TypeEnum DISTRANSFERTASK = new TypeEnum("DISTransferTask");

        /**
         * Enum CSJOB for value: "CSJob"
         */
        public static final TypeEnum CSJOB = new TypeEnum("CSJob");

        /**
         * Enum CLOUDTABLEMANAGE for value: "CloudTableManage"
         */
        public static final TypeEnum CLOUDTABLEMANAGE = new TypeEnum("CloudTableManage");

        /**
         * Enum OBSMANAGER for value: "OBSManager"
         */
        public static final TypeEnum OBSMANAGER = new TypeEnum("OBSManager");

        /**
         * Enum RESTAPI for value: "RESTAPI"
         */
        public static final TypeEnum RESTAPI = new TypeEnum("RESTAPI");

        /**
         * Enum MACHINELEARNING for value: "MachineLearning"
         */
        public static final TypeEnum MACHINELEARNING = new TypeEnum("MachineLearning");

        /**
         * Enum SMN for value: "SMN"
         */
        public static final TypeEnum SMN = new TypeEnum("SMN");

        /**
         * Enum MRSSPARK for value: "MRSSpark"
         */
        public static final TypeEnum MRSSPARK = new TypeEnum("MRSSpark");

        /**
         * Enum MAPREDUCE for value: "MapReduce"
         */
        public static final TypeEnum MAPREDUCE = new TypeEnum("MapReduce");

        /**
         * Enum DLISPARK for value: "DLISpark"
         */
        public static final TypeEnum DLISPARK = new TypeEnum("DLISpark");

        /**
         * Enum MRSFLINK for value: "MRSFlink"
         */
        public static final TypeEnum MRSFLINK = new TypeEnum("MRSFlink");

        /**
         * Enum MRSHETUENGINE for value: "MRSHetuEngine"
         */
        public static final TypeEnum MRSHETUENGINE = new TypeEnum("MRSHetuEngine");

        /**
         * Enum RDS_SQL for value: "RDS SQL"
         */
        public static final TypeEnum RDS_SQL = new TypeEnum("RDS SQL");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
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
            map.put("MRSFlink", MRSFLINK);
            map.put("MRSHetuEngine", MRSHETUENGINE);
            map.put("RDS SQL", RDS_SQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private Location location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preNodeName")

    private List<String> preNodeName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<Condition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<Property> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pollingInterval")

    private Integer pollingInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execTimeOutRetry")

    private String execTimeOutRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxExecutionTime")

    private Integer maxExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryTimes")

    private Integer retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryInterval")

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

        /**
         * Enum FAIL_CHILD for value: "FAIL_CHILD"
         */
        public static final FailPolicyEnum FAIL_CHILD = new FailPolicyEnum("FAIL_CHILD");

        private static final Map<String, FailPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailPolicyEnum> createStaticFields() {
            Map<String, FailPolicyEnum> map = new HashMap<>();
            map.put("FAIL", FAIL);
            map.put("IGNORE", IGNORE);
            map.put("SUSPEND", SUSPEND);
            map.put("FAIL_CHILD", FAIL_CHILD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailPolicyEnum(String value) {
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
        public static FailPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FailPolicyEnum(value));
        }

        public static FailPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailPolicyEnum) {
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
    @JsonProperty(value = "failPolicy")

    private FailPolicyEnum failPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventTrigger")

    private Event eventTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cronTrigger")

    private CronTrigger cronTrigger;

    public Node withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称，只能包含六种字符：英文字母、数字、中文、中划线、下划线和点号，且长度小于等于128个字符。同一个作业中节点名称不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 节点的类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Node withLocation(Location location) {
        this.location = location;
        return this;
    }

    public Node withLocation(Consumer<Location> locationSetter) {
        if (this.location == null) {
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

    public Node withPreNodeName(List<String> preNodeName) {
        this.preNodeName = preNodeName;
        return this;
    }

    public Node addPreNodeNameItem(String preNodeNameItem) {
        if (this.preNodeName == null) {
            this.preNodeName = new ArrayList<>();
        }
        this.preNodeName.add(preNodeNameItem);
        return this;
    }

    public Node withPreNodeName(Consumer<List<String>> preNodeNameSetter) {
        if (this.preNodeName == null) {
            this.preNodeName = new ArrayList<>();
        }
        preNodeNameSetter.accept(this.preNodeName);
        return this;
    }

    /**
     * 本本节点依赖的前面的节点名称列表
     * @return preNodeName
     */
    public List<String> getPreNodeName() {
        return preNodeName;
    }

    public void setPreNodeName(List<String> preNodeName) {
        this.preNodeName = preNodeName;
    }

    public Node withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public Node addConditionsItem(Condition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public Node withConditions(Consumer<List<Condition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 节点执行条件，如果配置此参数，本节点是否执行由condition的字段expression所保存的EL表达式计算结果决定
     * @return conditions
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public Node withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    public Node addPropertiesItem(Property propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public Node withProperties(Consumer<List<Property>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 节点属性
     * @return properties
     */
    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
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

    public Node withExecTimeOutRetry(String execTimeOutRetry) {
        this.execTimeOutRetry = execTimeOutRetry;
        return this;
    }

    /**
     * 节点是否超时重试
     * @return execTimeOutRetry
     */
    public String getExecTimeOutRetry() {
        return execTimeOutRetry;
    }

    public void setExecTimeOutRetry(String execTimeOutRetry) {
        this.execTimeOutRetry = execTimeOutRetry;
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
        if (this.eventTrigger == null) {
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

    public Node withCronTrigger(CronTrigger cronTrigger) {
        this.cronTrigger = cronTrigger;
        return this;
    }

    public Node withCronTrigger(Consumer<CronTrigger> cronTriggerSetter) {
        if (this.cronTrigger == null) {
            this.cronTrigger = new CronTrigger();
            cronTriggerSetter.accept(this.cronTrigger);
        }

        return this;
    }

    /**
     * Get cronTrigger
     * @return cronTrigger
     */
    public CronTrigger getCronTrigger() {
        return cronTrigger;
    }

    public void setCronTrigger(CronTrigger cronTrigger) {
        this.cronTrigger = cronTrigger;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node that = (Node) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.location, that.location) && Objects.equals(this.preNodeName, that.preNodeName)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.pollingInterval, that.pollingInterval)
            && Objects.equals(this.execTimeOutRetry, that.execTimeOutRetry)
            && Objects.equals(this.maxExecutionTime, that.maxExecutionTime)
            && Objects.equals(this.retryTimes, that.retryTimes)
            && Objects.equals(this.retryInterval, that.retryInterval)
            && Objects.equals(this.failPolicy, that.failPolicy) && Objects.equals(this.eventTrigger, that.eventTrigger)
            && Objects.equals(this.cronTrigger, that.cronTrigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            location,
            preNodeName,
            conditions,
            properties,
            pollingInterval,
            execTimeOutRetry,
            maxExecutionTime,
            retryTimes,
            retryInterval,
            failPolicy,
            eventTrigger,
            cronTrigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Node {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    preNodeName: ").append(toIndentedString(preNodeName)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    execTimeOutRetry: ").append(toIndentedString(execTimeOutRetry)).append("\n");
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
