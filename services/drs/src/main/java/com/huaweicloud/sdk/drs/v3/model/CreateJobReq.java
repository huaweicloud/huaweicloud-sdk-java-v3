package com.huaweicloud.sdk.drs.v3.model;




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
import com.huaweicloud.sdk.drs.v3.model.Endpoint;
import com.huaweicloud.sdk.drs.v3.model.ResourceTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建任务请求体
 */
public class CreateJobReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_eip")
    
    private Boolean bindEip;
    /**
     * 迁移场景
     */
    public static final class DbUseTypeEnum {

        
        /**
         * Enum MIGRATION_ for value: "migration-实时迁移"
         */
        public static final DbUseTypeEnum MIGRATION_ = new DbUseTypeEnum("migration-实时迁移");
        
        /**
         * Enum SYNC_ for value: "sync-实时同步"
         */
        public static final DbUseTypeEnum SYNC_ = new DbUseTypeEnum("sync-实时同步");
        
        /**
         * Enum CLOUDDATAGUARD_ for value: "cloudDataGuard-实时灾备"
         */
        public static final DbUseTypeEnum CLOUDDATAGUARD_ = new DbUseTypeEnum("cloudDataGuard-实时灾备");
        

        private static final Map<String, DbUseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbUseTypeEnum> createStaticFields() {
            Map<String, DbUseTypeEnum> map = new HashMap<>();
            map.put("migration-实时迁移", MIGRATION_);
            map.put("sync-实时同步", SYNC_);
            map.put("cloudDataGuard-实时灾备", CLOUDDATAGUARD_);
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
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 引擎类型
     */
    public static final class EngineTypeEnum {

        
        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineTypeEnum MYSQL = new EngineTypeEnum("mysql");
        
        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final EngineTypeEnum MONGODB = new EngineTypeEnum("mongodb");
        
        /**
         * Enum CLOUDDATAGUARD_MYSQL for value: "cloudDataGuard-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL = new EngineTypeEnum("cloudDataGuard-mysql");
        

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
            map.put("cloudDataGuard-mysql", CLOUDDATAGUARD_MYSQL);
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
    @JsonProperty(value="is_target_readonly")
    
    private String isTargetReadonly;
    /**
     * 迁移方向
     */
    public static final class JobDirectionEnum {

        
        /**
         * Enum UP_ for value: "up 入云 灾备场景时对应本云为备"
         */
        public static final JobDirectionEnum UP_ = new JobDirectionEnum("up 入云 灾备场景时对应本云为备");
        
        /**
         * Enum DOWN_ for value: "down 出云 灾备场景时对应本云为主"
         */
        public static final JobDirectionEnum DOWN_ = new JobDirectionEnum("down 出云 灾备场景时对应本云为主");
        
        /**
         * Enum NON_DBS_ for value: "non-dbs 自建"
         */
        public static final JobDirectionEnum NON_DBS_ = new JobDirectionEnum("non-dbs 自建");
        

        private static final Map<String, JobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobDirectionEnum> createStaticFields() {
            Map<String, JobDirectionEnum> map = new HashMap<>();
            map.put("up 入云 灾备场景时对应本云为备", UP_);
            map.put("down 出云 灾备场景时对应本云为主", DOWN_);
            map.put("non-dbs 自建", NON_DBS_);
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
    @JsonProperty(value="muti_write")
    
    private Boolean mutiWrite = false;
    /**
     * 网络类型
     */
    public static final class NetTypeEnum {

        
        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetTypeEnum VPN = new NetTypeEnum("vpn");
        
        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetTypeEnum VPC = new NetTypeEnum("vpc");
        
        /**
         * Enum EIP for value: "eip"
         */
        public static final NetTypeEnum EIP = new NetTypeEnum("eip");
        

        private static final Map<String, NetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetTypeEnum> createStaticFields() {
            Map<String, NetTypeEnum> map = new HashMap<>();
            map.put("vpn", VPN);
            map.put("vpc", VPC);
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
    @JsonProperty(value="node_num")
    
    private Integer nodeNum;
    /**
     * 规格类型。
     */
    public static final class NodeTypeEnum {

        
        /**
         * Enum HIGH for value: "high"
         */
        public static final NodeTypeEnum HIGH = new NodeTypeEnum("high");
        

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("high", HIGH);
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
    @JsonProperty(value="node_type")
    
    private NodeTypeEnum nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_endpoint")
    
    private Endpoint sourceEndpoint = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_endpoint")
    
    private Endpoint targetEndpoint = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ResourceTag> tags = null;
        /**
     * 迁移模式，灾备场景单主灾备仅支持全量加增量（FULL_INCR_TRANS）  
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customize_sutnet_id")
    
    private String customizeSutnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;

    public CreateJobReq withBindEip(Boolean bindEip) {
        this.bindEip = bindEip;
        return this;
    }

    


    /**
     * 是否绑定eip，网络类型为eip时必填且为true
     * @return bindEip
     */
    public Boolean getBindEip() {
        return bindEip;
    }

    public void setBindEip(Boolean bindEip) {
        this.bindEip = bindEip;
    }

    public CreateJobReq withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    


    /**
     * 迁移场景
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public CreateJobReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 任务名称，约束：任务名称在4位到50位之间，不区分大小写，可以包含字母、数字、中划线或下划线，不能包括其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateJobReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 任务描述。  **约束**：任务描述不能超过256位，且不能包含!<>&'\"\\特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateJobReq withEngineType(EngineTypeEnum engineType) {
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

    public CreateJobReq withIsTargetReadonly(String isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
        return this;
    }

    


    /**
     * 指定目标实例是否限制为只读，灾备场景下为必填且为true。
     * @return isTargetReadonly
     */
    public String getIsTargetReadonly() {
        return isTargetReadonly;
    }

    public void setIsTargetReadonly(String isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
    }

    public CreateJobReq withJobDirection(JobDirectionEnum jobDirection) {
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

    public CreateJobReq withMutiWrite(Boolean mutiWrite) {
        this.mutiWrite = mutiWrite;
        return this;
    }

    


    /**
     * - db_use_type 是cloudDataGuard时，必填，灾备类型是双主灾备时 muti_write取值true, 否则为false。 - db_use_type 是其他类型时，muti_write是非必选参数
     * @return mutiWrite
     */
    public Boolean getMutiWrite() {
        return mutiWrite;
    }

    public void setMutiWrite(Boolean mutiWrite) {
        this.mutiWrite = mutiWrite;
    }

    public CreateJobReq withNetType(NetTypeEnum netType) {
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

    public CreateJobReq withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * 节点个数。MongoDB数据库时对应源端分片个数，源库为集群时必填。
     * minimum: 1
     * maximum: 32
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public CreateJobReq withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * 规格类型。
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public CreateJobReq withSourceEndpoint(Endpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public CreateJobReq withSourceEndpoint(Consumer<Endpoint> sourceEndpointSetter) {
        if(this.sourceEndpoint == null ){
            this.sourceEndpoint = new Endpoint();
            sourceEndpointSetter.accept(this.sourceEndpoint);
        }
        
        return this;
    }


    /**
     * Get sourceEndpoint
     * @return sourceEndpoint
     */
    public Endpoint getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(Endpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public CreateJobReq withTargetEndpoint(Endpoint targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public CreateJobReq withTargetEndpoint(Consumer<Endpoint> targetEndpointSetter) {
        if(this.targetEndpoint == null ){
            this.targetEndpoint = new Endpoint();
            targetEndpointSetter.accept(this.targetEndpoint);
        }
        
        return this;
    }


    /**
     * Get targetEndpoint
     * @return targetEndpoint
     */
    public Endpoint getTargetEndpoint() {
        return targetEndpoint;
    }

    public void setTargetEndpoint(Endpoint targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
    }

    public CreateJobReq withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateJobReq addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateJobReq withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public CreateJobReq withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 迁移模式，灾备场景单主灾备仅支持全量加增量（FULL_INCR_TRANS）  
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public CreateJobReq withCustomizeSutnetId(String customizeSutnetId) {
        this.customizeSutnetId = customizeSutnetId;
        return this;
    }

    


    /**
     * drs实例所在子网ID
     * @return customizeSutnetId
     */
    public String getCustomizeSutnetId() {
        return customizeSutnetId;
    }

    public void setCustomizeSutnetId(String customizeSutnetId) {
        this.customizeSutnetId = customizeSutnetId;
    }

    public CreateJobReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品id。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateJobReq createJobReq = (CreateJobReq) o;
        return Objects.equals(this.bindEip, createJobReq.bindEip) &&
            Objects.equals(this.dbUseType, createJobReq.dbUseType) &&
            Objects.equals(this.name, createJobReq.name) &&
            Objects.equals(this.description, createJobReq.description) &&
            Objects.equals(this.engineType, createJobReq.engineType) &&
            Objects.equals(this.isTargetReadonly, createJobReq.isTargetReadonly) &&
            Objects.equals(this.jobDirection, createJobReq.jobDirection) &&
            Objects.equals(this.mutiWrite, createJobReq.mutiWrite) &&
            Objects.equals(this.netType, createJobReq.netType) &&
            Objects.equals(this.nodeNum, createJobReq.nodeNum) &&
            Objects.equals(this.nodeType, createJobReq.nodeType) &&
            Objects.equals(this.sourceEndpoint, createJobReq.sourceEndpoint) &&
            Objects.equals(this.targetEndpoint, createJobReq.targetEndpoint) &&
            Objects.equals(this.tags, createJobReq.tags) &&
            Objects.equals(this.taskType, createJobReq.taskType) &&
            Objects.equals(this.customizeSutnetId, createJobReq.customizeSutnetId) &&
            Objects.equals(this.productId, createJobReq.productId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bindEip, dbUseType, name, description, engineType, isTargetReadonly, jobDirection, mutiWrite, netType, nodeNum, nodeType, sourceEndpoint, targetEndpoint, tags, taskType, customizeSutnetId, productId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateJobReq {\n");
        sb.append("    bindEip: ").append(toIndentedString(bindEip)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    isTargetReadonly: ").append(toIndentedString(isTargetReadonly)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    mutiWrite: ").append(toIndentedString(mutiWrite)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    customizeSutnetId: ").append(toIndentedString(customizeSutnetId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

