package com.huaweicloud.sdk.drs.v5.model;

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
 * 数据库基本信息体。
 */
public class BaseEndpoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 数据库场景类型。取值： - oracle：云下自建Oracle数据库。 - ecs_oracle：华为云ECS自建Oracle数据库。 - cloud_gaussdbv5：华为云数据库GaussDB分布式。 - mysql：他云/本地自建MySQL数据库。 - ecs_mysql：华为云ECS自建MySQL数据库。 - cloud_mysql：华为云数据库RDS for MySQL。 - redis：云下自建Redis数据。 - ecs_redis：华为云ECS自建Redis数据。 - rediscluster：云下自建Redis集群数据库。 - ecs_rediscluster：华为云ECS自建Redis集群数据库。 - cloud_gaussdb_redis：华为云数据库GeminiDB Redis。 - postgresql: 云下自建PostgreSQL数据库。 - ecs_postgresql: 华为云ECS自建PostgreSQL数据库。 - cloud_postgresql: 华为云数据库RDS for PostgreSQL。 - mongodb: 云下自建MongoDB数据库。 - ecs_mongodb: 华为云ECS自建MongoDB数据库。 - cloud_mongodb: 华为云文档数据库服务DDS。
     */
    public static final class EndpointNameEnum {

        /**
         * Enum ORACLE for value: "oracle"
         */
        public static final EndpointNameEnum ORACLE = new EndpointNameEnum("oracle");

        /**
         * Enum ECS_ORACLE for value: "ecs_oracle"
         */
        public static final EndpointNameEnum ECS_ORACLE = new EndpointNameEnum("ecs_oracle");

        /**
         * Enum CLOUD_GAUSSDBV5 for value: "cloud_gaussdbv5"
         */
        public static final EndpointNameEnum CLOUD_GAUSSDBV5 = new EndpointNameEnum("cloud_gaussdbv5");

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EndpointNameEnum MYSQL = new EndpointNameEnum("mysql");

        /**
         * Enum ECS_MYSQL for value: "ecs_mysql"
         */
        public static final EndpointNameEnum ECS_MYSQL = new EndpointNameEnum("ecs_mysql");

        /**
         * Enum CLOUD_MYSQL for value: "cloud_mysql"
         */
        public static final EndpointNameEnum CLOUD_MYSQL = new EndpointNameEnum("cloud_mysql");

        /**
         * Enum REDIS for value: "redis"
         */
        public static final EndpointNameEnum REDIS = new EndpointNameEnum("redis");

        /**
         * Enum ECS_REDIS for value: "ecs_redis"
         */
        public static final EndpointNameEnum ECS_REDIS = new EndpointNameEnum("ecs_redis");

        /**
         * Enum REDISCLUSTER for value: "rediscluster"
         */
        public static final EndpointNameEnum REDISCLUSTER = new EndpointNameEnum("rediscluster");

        /**
         * Enum ECS_REDISCLUSTER for value: "ecs_rediscluster"
         */
        public static final EndpointNameEnum ECS_REDISCLUSTER = new EndpointNameEnum("ecs_rediscluster");

        /**
         * Enum CLOUD_GAUSSDB_REDIS for value: "cloud_gaussdb_redis"
         */
        public static final EndpointNameEnum CLOUD_GAUSSDB_REDIS = new EndpointNameEnum("cloud_gaussdb_redis");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EndpointNameEnum POSTGRESQL = new EndpointNameEnum("postgresql");

        /**
         * Enum ECS_POSTGRESQL for value: "ecs_postgresql"
         */
        public static final EndpointNameEnum ECS_POSTGRESQL = new EndpointNameEnum("ecs_postgresql");

        /**
         * Enum CLOUD_POSTGRESQL for value: "cloud_postgresql"
         */
        public static final EndpointNameEnum CLOUD_POSTGRESQL = new EndpointNameEnum("cloud_postgresql");

        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final EndpointNameEnum MONGODB = new EndpointNameEnum("mongodb");

        /**
         * Enum ECS_MONGODB for value: "ecs_mongodb"
         */
        public static final EndpointNameEnum ECS_MONGODB = new EndpointNameEnum("ecs_mongodb");

        /**
         * Enum CLOUD_MONGODB for value: "cloud_mongodb"
         */
        public static final EndpointNameEnum CLOUD_MONGODB = new EndpointNameEnum("cloud_mongodb");

        private static final Map<String, EndpointNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EndpointNameEnum> createStaticFields() {
            Map<String, EndpointNameEnum> map = new HashMap<>();
            map.put("oracle", ORACLE);
            map.put("ecs_oracle", ECS_ORACLE);
            map.put("cloud_gaussdbv5", CLOUD_GAUSSDBV5);
            map.put("mysql", MYSQL);
            map.put("ecs_mysql", ECS_MYSQL);
            map.put("cloud_mysql", CLOUD_MYSQL);
            map.put("redis", REDIS);
            map.put("ecs_redis", ECS_REDIS);
            map.put("rediscluster", REDISCLUSTER);
            map.put("ecs_rediscluster", ECS_REDISCLUSTER);
            map.put("cloud_gaussdb_redis", CLOUD_GAUSSDB_REDIS);
            map.put("postgresql", POSTGRESQL);
            map.put("ecs_postgresql", ECS_POSTGRESQL);
            map.put("cloud_postgresql", CLOUD_POSTGRESQL);
            map.put("mongodb", MONGODB);
            map.put("ecs_mongodb", ECS_MONGODB);
            map.put("cloud_mongodb", CLOUD_MONGODB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EndpointNameEnum(String value) {
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
        public static EndpointNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EndpointNameEnum(value));
        }

        public static EndpointNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EndpointNameEnum) {
                return this.value.equals(((EndpointNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private EndpointNameEnum endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private String dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    private String dbPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_sharding")

    private List<BaseEndpoint> sourceSharding = null;

    public BaseEndpoint withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库信息ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BaseEndpoint withEndpointName(EndpointNameEnum endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * 数据库场景类型。取值： - oracle：云下自建Oracle数据库。 - ecs_oracle：华为云ECS自建Oracle数据库。 - cloud_gaussdbv5：华为云数据库GaussDB分布式。 - mysql：他云/本地自建MySQL数据库。 - ecs_mysql：华为云ECS自建MySQL数据库。 - cloud_mysql：华为云数据库RDS for MySQL。 - redis：云下自建Redis数据。 - ecs_redis：华为云ECS自建Redis数据。 - rediscluster：云下自建Redis集群数据库。 - ecs_rediscluster：华为云ECS自建Redis集群数据库。 - cloud_gaussdb_redis：华为云数据库GeminiDB Redis。 - postgresql: 云下自建PostgreSQL数据库。 - ecs_postgresql: 华为云ECS自建PostgreSQL数据库。 - cloud_postgresql: 华为云数据库RDS for PostgreSQL。 - mongodb: 云下自建MongoDB数据库。 - ecs_mongodb: 华为云ECS自建MongoDB数据库。 - cloud_mongodb: 华为云文档数据库服务DDS。
     * @return endpointName
     */
    public EndpointNameEnum getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(EndpointNameEnum endpointName) {
        this.endpointName = endpointName;
    }

    public BaseEndpoint withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 数据库IP。 约束： - 数据库为自建MongoDB时，数据库IP与端口之间用“:”英文冒号拼接，多个值之间请用“,”英文逗号隔开，最多支持填写3个IP地址或域名。 - 数据库为DDS实例时，数据库IP与端口之间用“:”英文冒号拼接，多个IP端口之间请用“,”英文逗号分隔。 - 数据库为Redis集群时，请填写源端Redis集群所有分片的IP地址和对应端口，数据库IP与端口之间用“:”英文冒号拼接，多个IP端口之间请用“,”英文逗号分隔，并且推荐填写集群分片的Slave节点的IP地址。最多支持填写32个IP地址或域名，多个值之间请用英文逗号隔开。 示例： - MySQL：ip - MongoDB：ip:port,ip:port,ip:port - DDS：ip:port,ip:port  - Redis集群：ip:port,ip:port
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public BaseEndpoint withDbPort(String dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口。  约束：输入范围为1-65535之间的整数。
     * @return dbPort
     */
    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public BaseEndpoint withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库用户名。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public BaseEndpoint withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * 数据库密码。
     * @return dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public BaseEndpoint withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 华为云数据库实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BaseEndpoint withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 华为云数据库实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public BaseEndpoint withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 指定数据库名称。例如： - oracle：serviceName.orcl。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public BaseEndpoint withSourceSharding(List<BaseEndpoint> sourceSharding) {
        this.sourceSharding = sourceSharding;
        return this;
    }

    public BaseEndpoint addSourceShardingItem(BaseEndpoint sourceShardingItem) {
        if (this.sourceSharding == null) {
            this.sourceSharding = new ArrayList<>();
        }
        this.sourceSharding.add(sourceShardingItem);
        return this;
    }

    public BaseEndpoint withSourceSharding(Consumer<List<BaseEndpoint>> sourceShardingSetter) {
        if (this.sourceSharding == null) {
            this.sourceSharding = new ArrayList<>();
        }
        sourceShardingSetter.accept(this.sourceSharding);
        return this;
    }

    /**
     * 物理源库信息。
     * @return sourceSharding
     */
    public List<BaseEndpoint> getSourceSharding() {
        return sourceSharding;
    }

    public void setSourceSharding(List<BaseEndpoint> sourceSharding) {
        this.sourceSharding = sourceSharding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseEndpoint that = (BaseEndpoint) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.dbPort, that.dbPort)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.dbPassword, that.dbPassword)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.sourceSharding, that.sourceSharding);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, endpointName, ip, dbPort, dbUser, dbPassword, instanceId, instanceName, dbName, sourceSharding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseEndpoint {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    sourceSharding: ").append(toIndentedString(sourceSharding)).append("\n");
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
