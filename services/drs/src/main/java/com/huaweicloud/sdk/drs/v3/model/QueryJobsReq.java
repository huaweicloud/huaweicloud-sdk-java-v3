package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询任务列表请求体
 */
public class QueryJobsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cur_page")
    
    private Integer curPage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="per_page")
    
    private Integer perPage;
    /**
     * 迁移场景
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
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
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
    @JsonProperty(value="service_name")
    
    private String serviceName;
    /**
     * 状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum CREATING_ for value: "CREATING：创建中"
         */
        public static final StatusEnum CREATING_ = new StatusEnum("CREATING：创建中");
        
        /**
         * Enum CREATE_FAILED_ for value: "CREATE_FAILED: 创建失败"
         */
        public static final StatusEnum CREATE_FAILED_ = new StatusEnum("CREATE_FAILED: 创建失败");
        
        /**
         * Enum CONFIGURATION_ for value: "CONFIGURATION: 配置中"
         */
        public static final StatusEnum CONFIGURATION_ = new StatusEnum("CONFIGURATION: 配置中");
        
        /**
         * Enum STARTJOBING_ for value: "STARTJOBING: 启动中"
         */
        public static final StatusEnum STARTJOBING_ = new StatusEnum("STARTJOBING: 启动中");
        
        /**
         * Enum WAITING_FOR_START_ for value: "WAITING_FOR_START：等待启动中"
         */
        public static final StatusEnum WAITING_FOR_START_ = new StatusEnum("WAITING_FOR_START：等待启动中");
        
        /**
         * Enum START_JOB_FAILED_ for value: "START_JOB_FAILED：任务启动失败"
         */
        public static final StatusEnum START_JOB_FAILED_ = new StatusEnum("START_JOB_FAILED：任务启动失败");
        
        /**
         * Enum FULL_TRANSFER_STARTED_ for value: "FULL_TRANSFER_STARTED：全量迁移中 灾备场景为初始化"
         */
        public static final StatusEnum FULL_TRANSFER_STARTED_ = new StatusEnum("FULL_TRANSFER_STARTED：全量迁移中 灾备场景为初始化");
        
        /**
         * Enum FULL_TRANSFER_FAILED_ for value: "FULL_TRANSFER_FAILED：全量迁移失败  灾备场景为初始化失败"
         */
        public static final StatusEnum FULL_TRANSFER_FAILED_ = new StatusEnum("FULL_TRANSFER_FAILED：全量迁移失败  灾备场景为初始化失败");
        
        /**
         * Enum FULL_TRANSFER_COMPLETE_ for value: "FULL_TRANSFER_COMPLETE：全量迁移完成 灾备场景为初始化完成"
         */
        public static final StatusEnum FULL_TRANSFER_COMPLETE_ = new StatusEnum("FULL_TRANSFER_COMPLETE：全量迁移完成 灾备场景为初始化完成");
        
        /**
         * Enum INCRE_TRANSFER_STARTED_ for value: "INCRE_TRANSFER_STARTED：增量迁移中 灾备场景为灾备中"
         */
        public static final StatusEnum INCRE_TRANSFER_STARTED_ = new StatusEnum("INCRE_TRANSFER_STARTED：增量迁移中 灾备场景为灾备中");
        
        /**
         * Enum INCRE_TRANSFER_FAILED_ for value: "INCRE_TRANSFER_FAILED：增量迁移失败 灾备场景为灾备异常"
         */
        public static final StatusEnum INCRE_TRANSFER_FAILED_ = new StatusEnum("INCRE_TRANSFER_FAILED：增量迁移失败 灾备场景为灾备异常");
        
        /**
         * Enum RELEASE_RESOURCE_STARTED_ for value: "RELEASE_RESOURCE_STARTED：结束任务中"
         */
        public static final StatusEnum RELEASE_RESOURCE_STARTED_ = new StatusEnum("RELEASE_RESOURCE_STARTED：结束任务中");
        
        /**
         * Enum RELEASE_RESOURCE_FAILED_ for value: "RELEASE_RESOURCE_FAILED：结束任务失败"
         */
        public static final StatusEnum RELEASE_RESOURCE_FAILED_ = new StatusEnum("RELEASE_RESOURCE_FAILED：结束任务失败");
        
        /**
         * Enum RELEASE_RESOURCE_COMPLETE_ for value: "RELEASE_RESOURCE_COMPLETE：已结束"
         */
        public static final StatusEnum RELEASE_RESOURCE_COMPLETE_ = new StatusEnum("RELEASE_RESOURCE_COMPLETE：已结束");
        
        /**
         * Enum CHANGE_JOB_STARTED_ for value: "CHANGE_JOB_STARTED：任务变更中"
         */
        public static final StatusEnum CHANGE_JOB_STARTED_ = new StatusEnum("CHANGE_JOB_STARTED：任务变更中");
        
        /**
         * Enum CHANGE_JOB_FAILED_ for value: "CHANGE_JOB_FAILED：任务变更失败"
         */
        public static final StatusEnum CHANGE_JOB_FAILED_ = new StatusEnum("CHANGE_JOB_FAILED：任务变更失败");
        
        /**
         * Enum CHILD_TRANSFER_STARTING_ for value: "CHILD_TRANSFER_STARTING：子任务启动中"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTING_ = new StatusEnum("CHILD_TRANSFER_STARTING：子任务启动中");
        
        /**
         * Enum CHILD_TRANSFER_STARTED_ for value: "CHILD_TRANSFER_STARTED：子任务迁移中"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTED_ = new StatusEnum("CHILD_TRANSFER_STARTED：子任务迁移中");
        
        /**
         * Enum CHILD_TRANSFER_COMPLETE_ for value: "CHILD_TRANSFER_COMPLETE：子任务迁移完成"
         */
        public static final StatusEnum CHILD_TRANSFER_COMPLETE_ = new StatusEnum("CHILD_TRANSFER_COMPLETE：子任务迁移完成");
        
        /**
         * Enum CHILD_TRANSFER_FAILED_ for value: "CHILD_TRANSFER_FAILED：子任务迁移失败"
         */
        public static final StatusEnum CHILD_TRANSFER_FAILED_ = new StatusEnum("CHILD_TRANSFER_FAILED：子任务迁移失败");
        
        /**
         * Enum RELEASE_CHILD_TRANSFER_STARTED_ for value: "RELEASE_CHILD_TRANSFER_STARTED：子任务结束中"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_STARTED_ = new StatusEnum("RELEASE_CHILD_TRANSFER_STARTED：子任务结束中");
        
        /**
         * Enum RELEASE_CHILD_TRANSFER_COMPLETE_ for value: "RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_COMPLETE_ = new StatusEnum("RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING：创建中", CREATING_);
            map.put("CREATE_FAILED: 创建失败", CREATE_FAILED_);
            map.put("CONFIGURATION: 配置中", CONFIGURATION_);
            map.put("STARTJOBING: 启动中", STARTJOBING_);
            map.put("WAITING_FOR_START：等待启动中", WAITING_FOR_START_);
            map.put("START_JOB_FAILED：任务启动失败", START_JOB_FAILED_);
            map.put("FULL_TRANSFER_STARTED：全量迁移中 灾备场景为初始化", FULL_TRANSFER_STARTED_);
            map.put("FULL_TRANSFER_FAILED：全量迁移失败  灾备场景为初始化失败", FULL_TRANSFER_FAILED_);
            map.put("FULL_TRANSFER_COMPLETE：全量迁移完成 灾备场景为初始化完成", FULL_TRANSFER_COMPLETE_);
            map.put("INCRE_TRANSFER_STARTED：增量迁移中 灾备场景为灾备中", INCRE_TRANSFER_STARTED_);
            map.put("INCRE_TRANSFER_FAILED：增量迁移失败 灾备场景为灾备异常", INCRE_TRANSFER_FAILED_);
            map.put("RELEASE_RESOURCE_STARTED：结束任务中", RELEASE_RESOURCE_STARTED_);
            map.put("RELEASE_RESOURCE_FAILED：结束任务失败", RELEASE_RESOURCE_FAILED_);
            map.put("RELEASE_RESOURCE_COMPLETE：已结束", RELEASE_RESOURCE_COMPLETE_);
            map.put("CHANGE_JOB_STARTED：任务变更中", CHANGE_JOB_STARTED_);
            map.put("CHANGE_JOB_FAILED：任务变更失败", CHANGE_JOB_FAILED_);
            map.put("CHILD_TRANSFER_STARTING：子任务启动中", CHILD_TRANSFER_STARTING_);
            map.put("CHILD_TRANSFER_STARTED：子任务迁移中", CHILD_TRANSFER_STARTED_);
            map.put("CHILD_TRANSFER_COMPLETE：子任务迁移完成", CHILD_TRANSFER_COMPLETE_);
            map.put("CHILD_TRANSFER_FAILED：子任务迁移失败", CHILD_TRANSFER_FAILED_);
            map.put("RELEASE_CHILD_TRANSFER_STARTED：子任务结束中", RELEASE_CHILD_TRANSFER_STARTED_);
            map.put("RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束", RELEASE_CHILD_TRANSFER_COMPLETE_);
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
    @JsonProperty(value="tags")
    
    private Map<String, String> tags = null;
    
    public QueryJobsReq withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    


    /**
     * 第几页
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public QueryJobsReq withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    


    /**
     * 每页记录数
     * minimum: 0
     * maximum: 100
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public QueryJobsReq withDbUseType(DbUseTypeEnum dbUseType) {
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

    public QueryJobsReq withEngineType(EngineTypeEnum engineType) {
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

    public QueryJobsReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public QueryJobsReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * name或id
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryJobsReq withNetType(NetTypeEnum netType) {
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

    public QueryJobsReq withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public QueryJobsReq withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryJobsReq withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    

    public QueryJobsReq putTagsItem(String key, String tagsItem) {
         if (this.tags == null) {
            this.tags = new HashMap<>();
         }
        this.tags.put(key, tagsItem);
        return this;
    }

    public QueryJobsReq withTags(Consumer<Map<String, String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }
    /**
     * 标签
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryJobsReq queryJobsReq = (QueryJobsReq) o;
        return Objects.equals(this.curPage, queryJobsReq.curPage) &&
            Objects.equals(this.perPage, queryJobsReq.perPage) &&
            Objects.equals(this.dbUseType, queryJobsReq.dbUseType) &&
            Objects.equals(this.engineType, queryJobsReq.engineType) &&
            Objects.equals(this.enterpriseProjectId, queryJobsReq.enterpriseProjectId) &&
            Objects.equals(this.name, queryJobsReq.name) &&
            Objects.equals(this.netType, queryJobsReq.netType) &&
            Objects.equals(this.serviceName, queryJobsReq.serviceName) &&
            Objects.equals(this.status, queryJobsReq.status) &&
            Objects.equals(this.tags, queryJobsReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(curPage, perPage, dbUseType, engineType, enterpriseProjectId, name, netType, serviceName, status, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryJobsReq {\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

