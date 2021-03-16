package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

import java.util.Collections;

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
 * 任务监控信息
 */
public class TaskMonitorInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;
    /**
     * 任务类型, 只允许两种类型:TIMING-定时任务, REALTIME-实时任务
     */
    public static final class TaskTypeEnum {

        
        /**
         * Enum TIMING for value: "TIMING"
         */
        public static final TaskTypeEnum TIMING = new TaskTypeEnum("TIMING");
        
        /**
         * Enum REALTIME for value: "REALTIME"
         */
        public static final TaskTypeEnum REALTIME = new TaskTypeEnum("REALTIME");
        

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("TIMING", TIMING);
            map.put("REALTIME", REALTIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_type")
    
    private TaskTypeEnum taskType;
    /**
     * 任务状态, 只允许两种类型:STOP-停止, RUNNING-运行中
     */
    public static final class StatusEnum {

        
        /**
         * Enum STOP for value: "STOP"
         */
        public static final StatusEnum STOP = new StatusEnum("STOP");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("STOP", STOP);
            map.put("RUNNING", RUNNING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_execute_time")
    
    private Long lastExecuteTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="use_quartz_cron")
    
    private Boolean useQuartzCron;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cron")
    
    private String cron;
    /**
     * 调度周期的单位，如天，小时等，只有定时任务且use_quartz_cron为false时才有该属性，当前仅允许如下类型：MIN-分钟, HOUR-小时, DAY-天, WEEK-周, MON-月
     */
    public static final class PeriodEnum {

        
        /**
         * Enum MIN for value: "MIN"
         */
        public static final PeriodEnum MIN = new PeriodEnum("MIN");
        
        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final PeriodEnum HOUR = new PeriodEnum("HOUR");
        
        /**
         * Enum DAY for value: "DAY"
         */
        public static final PeriodEnum DAY = new PeriodEnum("DAY");
        
        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final PeriodEnum WEEK = new PeriodEnum("WEEK");
        
        /**
         * Enum MON for value: "MON"
         */
        public static final PeriodEnum MON = new PeriodEnum("MON");
        

        private static final Map<String, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodEnum> createStaticFields() {
            Map<String, PeriodEnum> map = new HashMap<>();
            map.put("MIN", MIN);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MON", MON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodEnum(String value) {
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
        public static PeriodEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodEnum(value);
            }
            return result;
        }

        public static PeriodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PeriodEnum) {
                return this.value.equals(((PeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    private PeriodEnum period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dispatch_interval")
    
    private Integer dispatchInterval;
    /**
     * 标识最近一次任务执行到哪一个阶段，允许如下值：ADAPTER-任务处于初始化阶段, READER-任务正在执行Reader读操作, WRITER-任务正在执行Writer写操作
     */
    public static final class PositionEnum {

        
        /**
         * Enum ADAPTER for value: "ADAPTER"
         */
        public static final PositionEnum ADAPTER = new PositionEnum("ADAPTER");
        
        /**
         * Enum READER for value: "READER"
         */
        public static final PositionEnum READER = new PositionEnum("READER");
        
        /**
         * Enum WRITER for value: "WRITER"
         */
        public static final PositionEnum WRITER = new PositionEnum("WRITER");
        

        private static final Map<String, PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionEnum> createStaticFields() {
            Map<String, PositionEnum> map = new HashMap<>();
            map.put("ADAPTER", ADAPTER);
            map.put("READER", READER);
            map.put("WRITER", WRITER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionEnum(String value) {
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
        public static PositionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PositionEnum(value);
            }
            return result;
        }

        public static PositionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PositionEnum) {
                return this.value.equals(((PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="position")
    
    private PositionEnum position;
    /**
     * 任务最近一次执行状态，允许如下值：UNSTARTED-未启动, WAITING-等待调度中, RUNNING-执行中, SUCCESS-执行成功, CANCELLED-任务取消, ERROR-执行异常
     */
    public static final class ExecuteStatusEnum {

        
        /**
         * Enum UNSTARTED for value: "UNSTARTED"
         */
        public static final ExecuteStatusEnum UNSTARTED = new ExecuteStatusEnum("UNSTARTED");
        
        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final ExecuteStatusEnum WAITING = new ExecuteStatusEnum("WAITING");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final ExecuteStatusEnum RUNNING = new ExecuteStatusEnum("RUNNING");
        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final ExecuteStatusEnum SUCCESS = new ExecuteStatusEnum("SUCCESS");
        
        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final ExecuteStatusEnum CANCELLED = new ExecuteStatusEnum("CANCELLED");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ExecuteStatusEnum ERROR = new ExecuteStatusEnum("ERROR");
        

        private static final Map<String, ExecuteStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecuteStatusEnum> createStaticFields() {
            Map<String, ExecuteStatusEnum> map = new HashMap<>();
            map.put("UNSTARTED", UNSTARTED);
            map.put("WAITING", WAITING);
            map.put("RUNNING", RUNNING);
            map.put("SUCCESS", SUCCESS);
            map.put("CANCELLED", CANCELLED);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecuteStatusEnum(String value) {
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
        public static ExecuteStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ExecuteStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExecuteStatusEnum(value);
            }
            return result;
        }

        public static ExecuteStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ExecuteStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ExecuteStatusEnum) {
                return this.value.equals(((ExecuteStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execute_status")
    
    private ExecuteStatusEnum executeStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_app_id")
    
    private String sourceAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_app_name")
    
    private String sourceAppName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_instance_id")
    
    private String sourceInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_app_id")
    
    private String targetAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_app_name")
    
    private String targetAppName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_instance_id")
    
    private String targetInstanceId;
    /**
     * 任务扩展类型，当前如果是CDC组合任务，该字段为CDC，否则为null
     */
    public static final class ExtTypeEnum {

        
        /**
         * Enum CDC for value: "CDC"
         */
        public static final ExtTypeEnum CDC = new ExtTypeEnum("CDC");
        

        private static final Map<String, ExtTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExtTypeEnum> createStaticFields() {
            Map<String, ExtTypeEnum> map = new HashMap<>();
            map.put("CDC", CDC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExtTypeEnum(String value) {
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
        public static ExtTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ExtTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExtTypeEnum(value);
            }
            return result;
        }

        public static ExtTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ExtTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ExtTypeEnum) {
                return this.value.equals(((ExtTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ext_type")
    
    private ExtTypeEnum extType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_tag")
    
    private String taskTag;

    public TaskMonitorInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public TaskMonitorInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    

    public TaskMonitorInfo withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 任务类型, 只允许两种类型:TIMING-定时任务, REALTIME-实时任务
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    

    public TaskMonitorInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态, 只允许两种类型:STOP-停止, RUNNING-运行中
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public TaskMonitorInfo withLastExecuteTime(Long lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
        return this;
    }

    


    /**
     * 任务最近一次执行时间，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastExecuteTime
     */
    public Long getLastExecuteTime() {
        return lastExecuteTime;
    }

    public void setLastExecuteTime(Long lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
    }

    

    public TaskMonitorInfo withUseQuartzCron(Boolean useQuartzCron) {
        this.useQuartzCron = useQuartzCron;
        return this;
    }

    


    /**
     * 任务是否使用Quartz表达式，只有定时任务才有该属性
     * @return useQuartzCron
     */
    public Boolean getUseQuartzCron() {
        return useQuartzCron;
    }

    public void setUseQuartzCron(Boolean useQuartzCron) {
        this.useQuartzCron = useQuartzCron;
    }

    

    public TaskMonitorInfo withCron(String cron) {
        this.cron = cron;
        return this;
    }

    


    /**
     * CRON表达式，只有定时任务且use_quartz_cron为true时才有该属性
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    

    public TaskMonitorInfo withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    


    /**
     * 调度周期的单位，如天，小时等，只有定时任务且use_quartz_cron为false时才有该属性，当前仅允许如下类型：MIN-分钟, HOUR-小时, DAY-天, WEEK-周, MON-月
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    

    public TaskMonitorInfo withDispatchInterval(Integer dispatchInterval) {
        this.dispatchInterval = dispatchInterval;
        return this;
    }

    


    /**
     * 调度周期，和period字段一起可以确定每隔多长时间调度一次，只有定时任务且use_quartz_cron为false时才有该属性
     * @return dispatchInterval
     */
    public Integer getDispatchInterval() {
        return dispatchInterval;
    }

    public void setDispatchInterval(Integer dispatchInterval) {
        this.dispatchInterval = dispatchInterval;
    }

    

    public TaskMonitorInfo withPosition(PositionEnum position) {
        this.position = position;
        return this;
    }

    


    /**
     * 标识最近一次任务执行到哪一个阶段，允许如下值：ADAPTER-任务处于初始化阶段, READER-任务正在执行Reader读操作, WRITER-任务正在执行Writer写操作
     * @return position
     */
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    

    public TaskMonitorInfo withExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    


    /**
     * 任务最近一次执行状态，允许如下值：UNSTARTED-未启动, WAITING-等待调度中, RUNNING-执行中, SUCCESS-执行成功, CANCELLED-任务取消, ERROR-执行异常
     * @return executeStatus
     */
    public ExecuteStatusEnum getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
    }

    

    public TaskMonitorInfo withSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    


    /**
     * 任务源端数据源所属应用ID
     * @return sourceAppId
     */
    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    

    public TaskMonitorInfo withSourceAppName(String sourceAppName) {
        this.sourceAppName = sourceAppName;
        return this;
    }

    


    /**
     * 任务源端数据源所属应用名称
     * @return sourceAppName
     */
    public String getSourceAppName() {
        return sourceAppName;
    }

    public void setSourceAppName(String sourceAppName) {
        this.sourceAppName = sourceAppName;
    }

    

    public TaskMonitorInfo withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    


    /**
     * 任务源端数据源所属实例ID
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    

    public TaskMonitorInfo withTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }

    


    /**
     * 任务目标端数据源所属应用ID
     * @return targetAppId
     */
    public String getTargetAppId() {
        return targetAppId;
    }

    public void setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
    }

    

    public TaskMonitorInfo withTargetAppName(String targetAppName) {
        this.targetAppName = targetAppName;
        return this;
    }

    


    /**
     * 任务目标端数据源所属应用名称
     * @return targetAppName
     */
    public String getTargetAppName() {
        return targetAppName;
    }

    public void setTargetAppName(String targetAppName) {
        this.targetAppName = targetAppName;
    }

    

    public TaskMonitorInfo withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    


    /**
     * 任务目标端数据源所属实例ID
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    

    public TaskMonitorInfo withExtType(ExtTypeEnum extType) {
        this.extType = extType;
        return this;
    }

    


    /**
     * 任务扩展类型，当前如果是CDC组合任务，该字段为CDC，否则为null
     * @return extType
     */
    public ExtTypeEnum getExtType() {
        return extType;
    }

    public void setExtType(ExtTypeEnum extType) {
        this.extType = extType;
    }

    

    public TaskMonitorInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 任务所属企业项目ID，默认为0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public TaskMonitorInfo withTaskTag(String taskTag) {
        this.taskTag = taskTag;
        return this;
    }

    


    /**
     * 任务标签
     * @return taskTag
     */
    public String getTaskTag() {
        return taskTag;
    }

    public void setTaskTag(String taskTag) {
        this.taskTag = taskTag;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskMonitorInfo taskMonitorInfo = (TaskMonitorInfo) o;
        return Objects.equals(this.taskId, taskMonitorInfo.taskId) &&
            Objects.equals(this.taskName, taskMonitorInfo.taskName) &&
            Objects.equals(this.taskType, taskMonitorInfo.taskType) &&
            Objects.equals(this.status, taskMonitorInfo.status) &&
            Objects.equals(this.lastExecuteTime, taskMonitorInfo.lastExecuteTime) &&
            Objects.equals(this.useQuartzCron, taskMonitorInfo.useQuartzCron) &&
            Objects.equals(this.cron, taskMonitorInfo.cron) &&
            Objects.equals(this.period, taskMonitorInfo.period) &&
            Objects.equals(this.dispatchInterval, taskMonitorInfo.dispatchInterval) &&
            Objects.equals(this.position, taskMonitorInfo.position) &&
            Objects.equals(this.executeStatus, taskMonitorInfo.executeStatus) &&
            Objects.equals(this.sourceAppId, taskMonitorInfo.sourceAppId) &&
            Objects.equals(this.sourceAppName, taskMonitorInfo.sourceAppName) &&
            Objects.equals(this.sourceInstanceId, taskMonitorInfo.sourceInstanceId) &&
            Objects.equals(this.targetAppId, taskMonitorInfo.targetAppId) &&
            Objects.equals(this.targetAppName, taskMonitorInfo.targetAppName) &&
            Objects.equals(this.targetInstanceId, taskMonitorInfo.targetInstanceId) &&
            Objects.equals(this.extType, taskMonitorInfo.extType) &&
            Objects.equals(this.enterpriseProjectId, taskMonitorInfo.enterpriseProjectId) &&
            Objects.equals(this.taskTag, taskMonitorInfo.taskTag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, taskType, status, lastExecuteTime, useQuartzCron, cron, period, dispatchInterval, position, executeStatus, sourceAppId, sourceAppName, sourceInstanceId, targetAppId, targetAppName, targetInstanceId, extType, enterpriseProjectId, taskTag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskMonitorInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastExecuteTime: ").append(toIndentedString(lastExecuteTime)).append("\n");
        sb.append("    useQuartzCron: ").append(toIndentedString(useQuartzCron)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    dispatchInterval: ").append(toIndentedString(dispatchInterval)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
        sb.append("    sourceAppName: ").append(toIndentedString(sourceAppName)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    targetAppId: ").append(toIndentedString(targetAppId)).append("\n");
        sb.append("    targetAppName: ").append(toIndentedString(targetAppName)).append("\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    extType: ").append(toIndentedString(extType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    taskTag: ").append(toIndentedString(taskTag)).append("\n");
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

