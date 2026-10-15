package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库信息体
 */
public class Endpoint {

    /**
     * **参数解释**：  数据库类型，标识源库或目标库的数据库引擎种类。  **约束限制**：  测试连接之后修改调用时必填。  **取值范围**：  - mysql：MySQL - mongodb：MongoDB - gaussdbv5：GaussDB分布式版 - postgresql：PostgreSQL - kafka：Kafka - gaussdbv5ha：GaussDB集中式版 - taurus：TaurusDB  **默认取值**：  不涉及
     */
    public static final class DbTypeEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final DbTypeEnum MYSQL = new DbTypeEnum("mysql");

        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final DbTypeEnum MONGODB = new DbTypeEnum("mongodb");

        /**
         * Enum GAUSSDBV5 for value: "gaussdbv5"
         */
        public static final DbTypeEnum GAUSSDBV5 = new DbTypeEnum("gaussdbv5");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final DbTypeEnum POSTGRESQL = new DbTypeEnum("postgresql");

        /**
         * Enum KAFKA for value: "kafka"
         */
        public static final DbTypeEnum KAFKA = new DbTypeEnum("kafka");

        /**
         * Enum GAUSSDBV5HA for value: "gaussdbv5ha"
         */
        public static final DbTypeEnum GAUSSDBV5HA = new DbTypeEnum("gaussdbv5ha");

        /**
         * Enum TAURUS for value: "taurus"
         */
        public static final DbTypeEnum TAURUS = new DbTypeEnum("taurus");

        private static final Map<String, DbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbTypeEnum> createStaticFields() {
            Map<String, DbTypeEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
            map.put("gaussdbv5", GAUSSDBV5);
            map.put("postgresql", POSTGRESQL);
            map.put("kafka", KAFKA);
            map.put("gaussdbv5ha", GAUSSDBV5HA);
            map.put("taurus", TAURUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DbTypeEnum(String value) {
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
        public static DbTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DbTypeEnum(value));
        }

        public static DbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DbTypeEnum) {
                return this.value.equals(((DbTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private DbTypeEnum dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_id")

    private String instId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    private String dbPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private Integer dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_name")

    private String instName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mongo_ha_mode")

    private String mongoHaMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "safe_mode")

    private Integer safeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_password")

    private String sslCertPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_check_sum")

    private String sslCertCheckSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_key")

    private String sslCertKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_name")

    private String sslCertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_link")

    private Boolean sslLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    /**
     * **参数解释**：  MongoDB集群模式。当集群实例无法获取到分片节点的IP时，source_endpoint中需要填写。  **约束限制**：  不涉及。  **取值范围**：  - Sharding4.0+：MongoDB集群4.0及以上版本  **默认取值**：  Sharding4.0+
     */
    public static final class ClusterModeEnum {

        /**
         * Enum SHARDING4_0_ for value: "Sharding4.0+"
         */
        public static final ClusterModeEnum SHARDING4_0_ = new ClusterModeEnum("Sharding4.0+");

        private static final Map<String, ClusterModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterModeEnum> createStaticFields() {
            Map<String, ClusterModeEnum> map = new HashMap<>();
            map.put("Sharding4.0+", SHARDING4_0_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterModeEnum(String value) {
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
        public static ClusterModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterModeEnum(value));
        }

        public static ClusterModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterModeEnum) {
                return this.value.equals(((ClusterModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_mode")

    private ClusterModeEnum clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_security_config")

    private KafkaSecurity kafkaSecurityConfig;

    public Endpoint withDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * **参数解释**：  数据库类型，标识源库或目标库的数据库引擎种类。  **约束限制**：  测试连接之后修改调用时必填。  **取值范围**：  - mysql：MySQL - mongodb：MongoDB - gaussdbv5：GaussDB分布式版 - postgresql：PostgreSQL - kafka：Kafka - gaussdbv5ha：GaussDB集中式版 - taurus：TaurusDB  **默认取值**：  不涉及
     * @return dbType
     */
    public DbTypeEnum getDbType() {
        return dbType;
    }

    public void setDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
    }

    public Endpoint withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * **参数解释**：  数据库所在的可用区（AZ，Availability Zone）编码。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public Endpoint withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**：  数据库实例所在区域。数据库为云上实例时，比如RDS实例时必填。  **约束限制**：  - 灾备场景下job_direction为down时source_endpoint中该值为必填。 - 灾备场景下job_direction为up时target_endpoint中该值为必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Endpoint withInstId(String instId) {
        this.instId = instId;
        return this;
    }

    /**
     * **参数解释**：  数据库实例ID，用于标识华为云RDS数据库实例。数据库为云上实例时，比如RDS实例时必填。  **约束限制**：  - 灾备场景下job_direction为down时source_endpoint中该值为必填。 - 灾备场景下job_direction为up时target_endpoint中该值为必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return instId
     */
    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public Endpoint withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：  数据库所在的虚拟私有云（VPC，Virtual Private Cloud）ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Endpoint withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**：  数据库所在的子网ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Endpoint withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**：  数据库所在的安全组ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Endpoint withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：  数据库实例所在Region下的项目ID。如果数据库为云上实例时，填写数据库实例所在Region下的Project ID；否则，填写当前任务所在Region下的Project ID。获取方法请参见获取项目ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Endpoint withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**：  数据库名称，Oracle场景下为serviceName。  **约束限制**：  - 不能超过128位。 - 不能包含!<>&'\"特殊字符。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Endpoint withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * **参数解释**：  数据库密码，用于连接数据库的认证密码。  **约束限制**：  除不需要密码的引擎，其他引擎测试连接之后修改调用时必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public Endpoint withDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * **参数解释**：  数据库端口号，用于指定连接数据库的服务端口。  **约束限制**：  输入范围为1-65535之间的整数。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return dbPort
     */
    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    public Endpoint withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * **参数解释**：  数据库帐号，用于连接数据库的用户名。  **约束限制**：  除不需要用户名的引擎，其他引擎测试连接之后修改调用时必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public Endpoint withInstName(String instName) {
        this.instName = instName;
        return this;
    }

    /**
     * **参数解释**：  RDS实例名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return instName
     */
    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public Endpoint withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**：  数据库IP地址。测试连接之后修改调用时必填。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Endpoint withMongoHaMode(String mongoHaMode) {
        this.mongoHaMode = mongoHaMode;
        return this;
    }

    /**
     * **参数解释**：  MongoDB高可用模式。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return mongoHaMode
     */
    public String getMongoHaMode() {
        return mongoHaMode;
    }

    public void setMongoHaMode(String mongoHaMode) {
        this.mongoHaMode = mongoHaMode;
    }

    public Endpoint withSafeMode(Integer safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    /**
     * **参数解释**：  MRS集群运行模式。  **约束限制**：  不涉及。  **取值范围**：  - 0：普通集群 - 1：安全集群  **默认取值**：  不涉及
     * @return safeMode
     */
    public Integer getSafeMode() {
        return safeMode;
    }

    public void setSafeMode(Integer safeMode) {
        this.safeMode = safeMode;
    }

    public Endpoint withSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
        return this;
    }

    /**
     * **参数解释**：  SSL证书密码，证书文件后缀为.p12。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return sslCertPassword
     */
    public String getSslCertPassword() {
        return sslCertPassword;
    }

    public void setSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
    }

    public Endpoint withSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
        return this;
    }

    /**
     * **参数解释**：  SSL证书内容checksum值，后端校验，源库安全连接必选。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return sslCertCheckSum
     */
    public String getSslCertCheckSum() {
        return sslCertCheckSum;
    }

    public void setSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
    }

    public Endpoint withSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
        return this;
    }

    /**
     * **参数解释**：  SSL证书内容，用base64加密。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return sslCertKey
     */
    public String getSslCertKey() {
        return sslCertKey;
    }

    public void setSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
    }

    public Endpoint withSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
        return this;
    }

    /**
     * **参数解释**：  SSL证书名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return sslCertName
     */
    public String getSslCertName() {
        return sslCertName;
    }

    public void setSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
    }

    public Endpoint withSslLink(Boolean sslLink) {
        this.sslLink = sslLink;
        return this;
    }

    /**
     * **参数解释**：  是否使用SSL安全连接，指定数据库连接是否启用SSL加密传输。  **约束限制**：  不涉及。  **取值范围**：  - true：使用SSL安全连接 - false：不使用SSL安全连接  **默认取值**：  不涉及
     * @return sslLink
     */
    public Boolean getSslLink() {
        return sslLink;
    }

    public void setSslLink(Boolean sslLink) {
        this.sslLink = sslLink;
    }

    public Endpoint withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**：  Kafka Topic名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Endpoint withClusterMode(ClusterModeEnum clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * **参数解释**：  MongoDB集群模式。当集群实例无法获取到分片节点的IP时，source_endpoint中需要填写。  **约束限制**：  不涉及。  **取值范围**：  - Sharding4.0+：MongoDB集群4.0及以上版本  **默认取值**：  Sharding4.0+
     * @return clusterMode
     */
    public ClusterModeEnum getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(ClusterModeEnum clusterMode) {
        this.clusterMode = clusterMode;
    }

    public Endpoint withKafkaSecurityConfig(KafkaSecurity kafkaSecurityConfig) {
        this.kafkaSecurityConfig = kafkaSecurityConfig;
        return this;
    }

    public Endpoint withKafkaSecurityConfig(Consumer<KafkaSecurity> kafkaSecurityConfigSetter) {
        if (this.kafkaSecurityConfig == null) {
            this.kafkaSecurityConfig = new KafkaSecurity();
            kafkaSecurityConfigSetter.accept(this.kafkaSecurityConfig);
        }

        return this;
    }

    /**
     * Get kafkaSecurityConfig
     * @return kafkaSecurityConfig
     */
    public KafkaSecurity getKafkaSecurityConfig() {
        return kafkaSecurityConfig;
    }

    public void setKafkaSecurityConfig(KafkaSecurity kafkaSecurityConfig) {
        this.kafkaSecurityConfig = kafkaSecurityConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Endpoint that = (Endpoint) obj;
        return Objects.equals(this.dbType, that.dbType) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.region, that.region) && Objects.equals(this.instId, that.instId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.dbPassword, that.dbPassword) && Objects.equals(this.dbPort, that.dbPort)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.instName, that.instName)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.mongoHaMode, that.mongoHaMode)
            && Objects.equals(this.safeMode, that.safeMode)
            && Objects.equals(this.sslCertPassword, that.sslCertPassword)
            && Objects.equals(this.sslCertCheckSum, that.sslCertCheckSum)
            && Objects.equals(this.sslCertKey, that.sslCertKey) && Objects.equals(this.sslCertName, that.sslCertName)
            && Objects.equals(this.sslLink, that.sslLink) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.clusterMode, that.clusterMode)
            && Objects.equals(this.kafkaSecurityConfig, that.kafkaSecurityConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbType,
            azCode,
            region,
            instId,
            vpcId,
            subnetId,
            securityGroupId,
            projectId,
            dbName,
            dbPassword,
            dbPort,
            dbUser,
            instName,
            ip,
            mongoHaMode,
            safeMode,
            sslCertPassword,
            sslCertCheckSum,
            sslCertKey,
            sslCertName,
            sslLink,
            topic,
            clusterMode,
            kafkaSecurityConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    instId: ").append(toIndentedString(instId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    instName: ").append(toIndentedString(instName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    mongoHaMode: ").append(toIndentedString(mongoHaMode)).append("\n");
        sb.append("    safeMode: ").append(toIndentedString(safeMode)).append("\n");
        sb.append("    sslCertPassword: ").append(toIndentedString(sslCertPassword)).append("\n");
        sb.append("    sslCertCheckSum: ").append(toIndentedString(sslCertCheckSum)).append("\n");
        sb.append("    sslCertKey: ").append(toIndentedString(sslCertKey)).append("\n");
        sb.append("    sslCertName: ").append(toIndentedString(sslCertName)).append("\n");
        sb.append("    sslLink: ").append(toIndentedString(sslLink)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    kafkaSecurityConfig: ").append(toIndentedString(kafkaSecurityConfig)).append("\n");
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
