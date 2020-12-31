package com.huaweicloud.sdk.drs.v3.model;




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
 * 子任务信息体
 */
public class ChildrenJobInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billing_tag")
    
    private String billingTag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;
    /**
     * 复制场景
     */
    public static final class DbUseTypeEnum {

        
        /**
         * Enum MIGRATION_ for value: "migration:实时迁移"
         */
        public static final DbUseTypeEnum MIGRATION_ = new DbUseTypeEnum("migration:实时迁移");
        
        /**
         * Enum SYNC_ for value: "sync:实时同步"
         */
        public static final DbUseTypeEnum SYNC_ = new DbUseTypeEnum("sync:实时同步");
        
        /**
         * Enum CLOUDDATAGUARD_ for value: "cloudDataGuard:实时灾备"
         */
        public static final DbUseTypeEnum CLOUDDATAGUARD_ = new DbUseTypeEnum("cloudDataGuard:实时灾备");
        

        private static final Map<String, DbUseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbUseTypeEnum> createStaticFields() {
            Map<String, DbUseTypeEnum> map = new HashMap<>();
            map.put("migration:实时迁移", MIGRATION_);
            map.put("sync:实时同步", SYNC_);
            map.put("cloudDataGuard:实时灾备", CLOUDDATAGUARD_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DbUseTypeEnum(String value) {
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
        public static DbUseTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DbUseTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DbUseTypeEnum(value);
            }
            return result;
        }

        public static DbUseTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DbUseTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DbUseTypeEnum) {
                return this.value.equals(((DbUseTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_use_type")
    
    private DbUseTypeEnum dbUseType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 引擎类型
     */
    public static final class EngineTypeEnum {

        
        /**
         * Enum CLOUDDATAGUARD_CASSANDRA for value: "cloudDataGuard-cassandra"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_CASSANDRA = new EngineTypeEnum("cloudDataGuard-cassandra");
        
        /**
         * Enum CLOUDDATAGUARD_DDM for value: "cloudDataGuard-ddm"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_DDM = new EngineTypeEnum("cloudDataGuard-ddm");
        
        /**
         * Enum CLOUDDATAGUARD_TAURUS_TO_MYSQL for value: "cloudDataGuard-taurus-to-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_TAURUS_TO_MYSQL = new EngineTypeEnum("cloudDataGuard-taurus-to-mysql");
        
        /**
         * Enum CLOUDDATAGUARD_MYSQL for value: "cloudDataGuard-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL = new EngineTypeEnum("cloudDataGuard-mysql");
        
        /**
         * Enum CLOUDDATAGUARD_MYSQL_TO_TAURUS for value: "cloudDataGuard-mysql-to-taurus"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL_TO_TAURUS = new EngineTypeEnum("cloudDataGuard-mysql-to-taurus");
        

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("cloudDataGuard-cassandra", CLOUDDATAGUARD_CASSANDRA);
            map.put("cloudDataGuard-ddm", CLOUDDATAGUARD_DDM);
            map.put("cloudDataGuard-taurus-to-mysql", CLOUDDATAGUARD_TAURUS_TO_MYSQL);
            map.put("cloudDataGuard-mysql", CLOUDDATAGUARD_MYSQL);
            map.put("cloudDataGuard-mysql-to-taurus", CLOUDDATAGUARD_MYSQL_TO_TAURUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EngineTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineTypeEnum(value);
            }
            return result;
        }

        public static EngineTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_type")
    
    private EngineTypeEnum engineType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * 迁移方向
     */
    public static final class JobDirectionEnum {

        
        /**
         * Enum UP for value: "up"
         */
        public static final JobDirectionEnum UP = new JobDirectionEnum("up");
        
        /**
         * Enum DOWN for value: "down"
         */
        public static final JobDirectionEnum DOWN = new JobDirectionEnum("down");
        
        /**
         * Enum NO_DBS for value: "no-dbs"
         */
        public static final JobDirectionEnum NO_DBS = new JobDirectionEnum("no-dbs");
        

        private static final Map<String, JobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobDirectionEnum> createStaticFields() {
            Map<String, JobDirectionEnum> map = new HashMap<>();
            map.put("up", UP);
            map.put("down", DOWN);
            map.put("no-dbs", NO_DBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobDirectionEnum(String value) {
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
        public static JobDirectionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobDirectionEnum(value);
            }
            return result;
        }

        public static JobDirectionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof JobDirectionEnum) {
                return this.value.equals(((JobDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_direction")
    
    private JobDirectionEnum jobDirection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 网络类型
     */
    public static final class NetTypeEnum {

        
        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetTypeEnum VPC = new NetTypeEnum("vpc");
        
        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetTypeEnum VPN = new NetTypeEnum("vpn");
        
        /**
         * Enum EIP for value: "eip"
         */
        public static final NetTypeEnum EIP = new NetTypeEnum("eip");
        

        private static final Map<String, NetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetTypeEnum> createStaticFields() {
            Map<String, NetTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("vpn", VPN);
            map.put("eip", EIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetTypeEnum(String value) {
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
        public static NetTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NetTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NetTypeEnum(value);
            }
            return result;
        }

        public static NetTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NetTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof NetTypeEnum) {
                return this.value.equals(((NetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="net_type")
    
    private NetTypeEnum netType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_newFramework")
    
    private String nodeNewFramework;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;
    /**
     * 迁移模式
     */
    public static final class TaskTypeEnum {

        
        /**
         * Enum FULL_TRANS_ for value: "FULL_TRANS 全量"
         */
        public static final TaskTypeEnum FULL_TRANS_ = new TaskTypeEnum("FULL_TRANS 全量");
        
        /**
         * Enum FULL_INCR_TRANS_ for value: "FULL_INCR_TRANS 全量+增量"
         */
        public static final TaskTypeEnum FULL_INCR_TRANS_ = new TaskTypeEnum("FULL_INCR_TRANS 全量+增量");
        
        /**
         * Enum INCR_TRANS_ for value: "INCR_TRANS 增量"
         */
        public static final TaskTypeEnum INCR_TRANS_ = new TaskTypeEnum("INCR_TRANS 增量");
        

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("FULL_TRANS 全量", FULL_TRANS_);
            map.put("FULL_INCR_TRANS 全量+增量", FULL_INCR_TRANS_);
            map.put("INCR_TRANS 增量", INCR_TRANS_);
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

    public ChildrenJobInfo withBillingTag(String billingTag) {
        this.billingTag = billingTag;
        return this;
    }

    


    /**
     * 计费字段
     * @return billingTag
     */
    public String getBillingTag() {
        return billingTag;
    }

    public void setBillingTag(String billingTag) {
        this.billingTag = billingTag;
    }

    public ChildrenJobInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 任务创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ChildrenJobInfo withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    


    /**
     * 复制场景
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public ChildrenJobInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChildrenJobInfo withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    


    /**
     * 引擎类型
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public ChildrenJobInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 任务失败原因
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ChildrenJobInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChildrenJobInfo withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    


    /**
     * 迁移方向
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public ChildrenJobInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChildrenJobInfo withNetType(NetTypeEnum netType) {
        this.netType = netType;
        return this;
    }

    


    /**
     * 网络类型
     * @return netType
     */
    public NetTypeEnum getNetType() {
        return netType;
    }

    public void setNetType(NetTypeEnum netType) {
        this.netType = netType;
    }

    public ChildrenJobInfo withNodeNewFramework(String nodeNewFramework) {
        this.nodeNewFramework = nodeNewFramework;
        return this;
    }

    


    /**
     * 新框架
     * @return nodeNewFramework
     */
    public String getNodeNewFramework() {
        return nodeNewFramework;
    }

    public void setNodeNewFramework(String nodeNewFramework) {
        this.nodeNewFramework = nodeNewFramework;
    }

    public ChildrenJobInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ChildrenJobInfo withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 迁移模式
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChildrenJobInfo childrenJobInfo = (ChildrenJobInfo) o;
        return Objects.equals(this.billingTag, childrenJobInfo.billingTag) &&
            Objects.equals(this.createTime, childrenJobInfo.createTime) &&
            Objects.equals(this.dbUseType, childrenJobInfo.dbUseType) &&
            Objects.equals(this.description, childrenJobInfo.description) &&
            Objects.equals(this.engineType, childrenJobInfo.engineType) &&
            Objects.equals(this.errorMsg, childrenJobInfo.errorMsg) &&
            Objects.equals(this.id, childrenJobInfo.id) &&
            Objects.equals(this.jobDirection, childrenJobInfo.jobDirection) &&
            Objects.equals(this.name, childrenJobInfo.name) &&
            Objects.equals(this.netType, childrenJobInfo.netType) &&
            Objects.equals(this.nodeNewFramework, childrenJobInfo.nodeNewFramework) &&
            Objects.equals(this.status, childrenJobInfo.status) &&
            Objects.equals(this.taskType, childrenJobInfo.taskType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billingTag, createTime, dbUseType, description, engineType, errorMsg, id, jobDirection, name, netType, nodeNewFramework, status, taskType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChildrenJobInfo {\n");
        sb.append("    billingTag: ").append(toIndentedString(billingTag)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    nodeNewFramework: ").append(toIndentedString(nodeNewFramework)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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

