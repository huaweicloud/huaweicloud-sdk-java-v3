package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库信息
 */
public class EndpointVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_id")

    @JacksonXmlProperty(localName = "obj_id")

    private String objId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    @JacksonXmlProperty(localName = "instance_name")

    private String instanceName;

    /**
     * 数据库类型
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

        private static final Map<String, DbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbTypeEnum> createStaticFields() {
            Map<String, DbTypeEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
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
            DbTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DbTypeEnum(value);
            }
            return result;
        }

        public static DbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DbTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "db_type")

    private DbTypeEnum dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    @JacksonXmlProperty(localName = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    @JacksonXmlProperty(localName = "db_password")

    private String dbPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_ip")

    @JacksonXmlProperty(localName = "manage_ip")

    private String manageIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ip")

    @JacksonXmlProperty(localName = "traffic_ip")

    private String trafficIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    @JacksonXmlProperty(localName = "db_port")

    private Integer dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    @JacksonXmlProperty(localName = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    @JacksonXmlProperty(localName = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    @JacksonXmlProperty(localName = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    @JacksonXmlProperty(localName = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    @JacksonXmlProperty(localName = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    @JacksonXmlProperty(localName = "volume_size")

    private Long volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_trans_user_pwd")

    @JacksonXmlProperty(localName = "full_trans_user_pwd")

    private String fullTransUserPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment_trans_user_pwd")

    @JacksonXmlProperty(localName = "increment_trans_user_pwd")

    private String incrementTransUserPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_link")

    @JacksonXmlProperty(localName = "ssl_link")

    private Boolean sslLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_key")

    @JacksonXmlProperty(localName = "ssl_cert_key")

    private String sslCertKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_name")

    @JacksonXmlProperty(localName = "ssl_cert_name")

    private String sslCertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_check_sum")

    @JacksonXmlProperty(localName = "ssl_cert_check_sum")

    private String sslCertCheckSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_password")

    @JacksonXmlProperty(localName = "ssl_cert_password")

    private String sslCertPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_version")

    @JacksonXmlProperty(localName = "db_version")

    private String dbVersion;

    /**
     * mongoHa模式
     */
    public static final class MongoHaModeEnum {

        /**
         * Enum SHARDING_ for value: "Sharding 集群"
         */
        public static final MongoHaModeEnum SHARDING_ = new MongoHaModeEnum("Sharding 集群");

        /**
         * Enum REPLICASET_ for value: "ReplicaSet 副本集"
         */
        public static final MongoHaModeEnum REPLICASET_ = new MongoHaModeEnum("ReplicaSet 副本集");

        /**
         * Enum REPLICASINGLE_ for value: "ReplicaSingle 单节点"
         */
        public static final MongoHaModeEnum REPLICASINGLE_ = new MongoHaModeEnum("ReplicaSingle 单节点");

        private static final Map<String, MongoHaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MongoHaModeEnum> createStaticFields() {
            Map<String, MongoHaModeEnum> map = new HashMap<>();
            map.put("Sharding 集群", SHARDING_);
            map.put("ReplicaSet 副本集", REPLICASET_);
            map.put("ReplicaSingle 单节点", REPLICASINGLE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MongoHaModeEnum(String value) {
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
        public static MongoHaModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MongoHaModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MongoHaModeEnum(value);
            }
            return result;
        }

        public static MongoHaModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MongoHaModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MongoHaModeEnum) {
                return this.value.equals(((MongoHaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mongo_ha_mode")

    @JacksonXmlProperty(localName = "mongo_ha_mode")

    private MongoHaModeEnum mongoHaMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    /**
     * 集群模式
     */
    public static final class ClusterModeEnum {

        /**
         * Enum SINGLE_RDS for value: "Single 单节点RDS"
         */
        public static final ClusterModeEnum SINGLE_RDS = new ClusterModeEnum("Single 单节点RDS");

        /**
         * Enum HA_RDS for value: "Ha 主备RDS"
         */
        public static final ClusterModeEnum HA_RDS = new ClusterModeEnum("Ha 主备RDS");

        /**
         * Enum GR_RDS for value: "GR 金融版RDS"
         */
        public static final ClusterModeEnum GR_RDS = new ClusterModeEnum("GR 金融版RDS");

        /**
         * Enum SHARDING_MONGODB_DDM_ for value: "Sharding mongodb 集群或DDM的模式，均默认为分片"
         */
        public static final ClusterModeEnum SHARDING_MONGODB_DDM_ =
            new ClusterModeEnum("Sharding mongodb 集群或DDM的模式，均默认为分片");

        /**
         * Enum REPLICASET_MONGODB_ for value: "ReplicaSet mongodb 副本集"
         */
        public static final ClusterModeEnum REPLICASET_MONGODB_ = new ClusterModeEnum("ReplicaSet mongodb 副本集");

        /**
         * Enum REPLICA_RDS_ for value: "Replica RDS只读副本"
         */
        public static final ClusterModeEnum REPLICA_RDS_ = new ClusterModeEnum("Replica RDS只读副本");

        /**
         * Enum REPLICASINGLE_MONGODB_ for value: "ReplicaSingle mongodb 单节点"
         */
        public static final ClusterModeEnum REPLICASINGLE_MONGODB_ = new ClusterModeEnum("ReplicaSingle mongodb 单节点");

        /**
         * Enum CLUSTER_ for value: "Cluster 集群"
         */
        public static final ClusterModeEnum CLUSTER_ = new ClusterModeEnum("Cluster 集群");

        /**
         * Enum INDEPENDENT_GAUSSDBV5_INDEPENDENT_ for value: "Independent gaussdbv5 independent模式"
         */
        public static final ClusterModeEnum INDEPENDENT_GAUSSDBV5_INDEPENDENT_ =
            new ClusterModeEnum("Independent gaussdbv5 independent模式");

        /**
         * Enum COMBINED_GAUSSDBV5_COMBINED_ for value: "Combined gaussdbv5 Combined模式"
         */
        public static final ClusterModeEnum COMBINED_GAUSSDBV5_COMBINED_ =
            new ClusterModeEnum("Combined gaussdbv5 Combined模式");

        /**
         * Enum DISTRIBUTED_TAURUS for value: "Distributed 分布式taurus"
         */
        public static final ClusterModeEnum DISTRIBUTED_TAURUS = new ClusterModeEnum("Distributed 分布式taurus");

        private static final Map<String, ClusterModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterModeEnum> createStaticFields() {
            Map<String, ClusterModeEnum> map = new HashMap<>();
            map.put("Single 单节点RDS", SINGLE_RDS);
            map.put("Ha 主备RDS", HA_RDS);
            map.put("GR 金融版RDS", GR_RDS);
            map.put("Sharding mongodb 集群或DDM的模式，均默认为分片", SHARDING_MONGODB_DDM_);
            map.put("ReplicaSet mongodb 副本集", REPLICASET_MONGODB_);
            map.put("Replica RDS只读副本", REPLICA_RDS_);
            map.put("ReplicaSingle mongodb 单节点", REPLICASINGLE_MONGODB_);
            map.put("Cluster 集群", CLUSTER_);
            map.put("Independent gaussdbv5 independent模式", INDEPENDENT_GAUSSDBV5_INDEPENDENT_);
            map.put("Combined gaussdbv5 Combined模式", COMBINED_GAUSSDBV5_COMBINED_);
            map.put("Distributed 分布式taurus", DISTRIBUTED_TAURUS);
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
            ClusterModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ClusterModeEnum(value);
            }
            return result;
        }

        public static ClusterModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ClusterModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "cluster_mode")

    private ClusterModeEnum clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    @JacksonXmlProperty(localName = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    @JacksonXmlProperty(localName = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "safe_mode")

    @JacksonXmlProperty(localName = "safe_mode")

    private Integer safeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kerberos_vo")

    @JacksonXmlProperty(localName = "kerberos_vo")

    private KerberosVO kerberosVo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_write_db_id")

    @JacksonXmlProperty(localName = "multi_write_db_id")

    private String multiWriteDbId;

    public EndpointVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EndpointVO withObjId(String objId) {
        this.objId = objId;
        return this;
    }

    /**
     * 对象id。
     * @return objId
     */
    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public EndpointVO withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * RDS实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public EndpointVO withDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型
     * @return dbType
     */
    public DbTypeEnum getDbType() {
        return dbType;
    }

    public void setDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
    }

    public EndpointVO withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库用户。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public EndpointVO withDbPassword(String dbPassword) {
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

    public EndpointVO withManageIp(String manageIp) {
        this.manageIp = manageIp;
        return this;
    }

    /**
     * 管理IP。
     * @return manageIp
     */
    public String getManageIp() {
        return manageIp;
    }

    public void setManageIp(String manageIp) {
        this.manageIp = manageIp;
    }

    public EndpointVO withTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
        return this;
    }

    /**
     * 流量IP。
     * @return trafficIp
     */
    public String getTrafficIp() {
        return trafficIp;
    }

    public void setTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
    }

    public EndpointVO withDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口。
     * @return dbPort
     */
    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    public EndpointVO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * RDS实例所在region。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public EndpointVO withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建日期，格式yyyy-MM-dd'T'HH:mm:ss'Z'
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EndpointVO withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 修改日期，格式yyyy-MM-dd'T'HH:mm:ss'Z'
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EndpointVO withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 迁移实例所在的私有IP。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public EndpointVO withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 迁移实例所在的公网IP。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public EndpointVO withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区azCode。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public EndpointVO withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 源库所在的安全组id。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public EndpointVO withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 源库所在的子网id。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public EndpointVO withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 源库所在的虚拟私有云id。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EndpointVO withVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 迁移实例的磁盘大小。
     * @return volumeSize
     */
    public Long getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
    }

    public EndpointVO withFullTransUserPwd(String fullTransUserPwd) {
        this.fullTransUserPwd = fullTransUserPwd;
        return this;
    }

    /**
     * 全量迁移用户密码，密文。
     * @return fullTransUserPwd
     */
    public String getFullTransUserPwd() {
        return fullTransUserPwd;
    }

    public void setFullTransUserPwd(String fullTransUserPwd) {
        this.fullTransUserPwd = fullTransUserPwd;
    }

    public EndpointVO withIncrementTransUserPwd(String incrementTransUserPwd) {
        this.incrementTransUserPwd = incrementTransUserPwd;
        return this;
    }

    /**
     * 增量迁移用户密码，密文。
     * @return incrementTransUserPwd
     */
    public String getIncrementTransUserPwd() {
        return incrementTransUserPwd;
    }

    public void setIncrementTransUserPwd(String incrementTransUserPwd) {
        this.incrementTransUserPwd = incrementTransUserPwd;
    }

    public EndpointVO withSslLink(Boolean sslLink) {
        this.sslLink = sslLink;
        return this;
    }

    /**
     * 是否SSL安全连接。
     * @return sslLink
     */
    public Boolean getSslLink() {
        return sslLink;
    }

    public void setSslLink(Boolean sslLink) {
        this.sslLink = sslLink;
    }

    public EndpointVO withSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
        return this;
    }

    /**
     * SSL证书内容。
     * @return sslCertKey
     */
    public String getSslCertKey() {
        return sslCertKey;
    }

    public void setSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
    }

    public EndpointVO withSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
        return this;
    }

    /**
     * SSL证书名字。
     * @return sslCertName
     */
    public String getSslCertName() {
        return sslCertName;
    }

    public void setSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
    }

    public EndpointVO withSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
        return this;
    }

    /**
     * SSL证书内容checksum值。
     * @return sslCertCheckSum
     */
    public String getSslCertCheckSum() {
        return sslCertCheckSum;
    }

    public void setSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
    }

    public EndpointVO withSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
        return this;
    }

    /**
     * SSL证书密码，密文。
     * @return sslCertPassword
     */
    public String getSslCertPassword() {
        return sslCertPassword;
    }

    public void setSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
    }

    public EndpointVO withDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }

    /**
     * 数据库版本。
     * @return dbVersion
     */
    public String getDbVersion() {
        return dbVersion;
    }

    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public EndpointVO withMongoHaMode(MongoHaModeEnum mongoHaMode) {
        this.mongoHaMode = mongoHaMode;
        return this;
    }

    /**
     * mongoHa模式
     * @return mongoHaMode
     */
    public MongoHaModeEnum getMongoHaMode() {
        return mongoHaMode;
    }

    public void setMongoHaMode(MongoHaModeEnum mongoHaMode) {
        this.mongoHaMode = mongoHaMode;
    }

    public EndpointVO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * RDS实例projectId。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EndpointVO withClusterMode(ClusterModeEnum clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 集群模式
     * @return clusterMode
     */
    public ClusterModeEnum getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(ClusterModeEnum clusterMode) {
        this.clusterMode = clusterMode;
    }

    public EndpointVO withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * RDS实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public EndpointVO withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * Oracle服务名serviceName。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public EndpointVO withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * mrskafka topic名称。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public EndpointVO withSafeMode(Integer safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    /**
     * MRSkafka是否开启kerberos认证 - 0非安全认证 - 1安全认证
     * @return safeMode
     */
    public Integer getSafeMode() {
        return safeMode;
    }

    public void setSafeMode(Integer safeMode) {
        this.safeMode = safeMode;
    }

    public EndpointVO withKerberosVo(KerberosVO kerberosVo) {
        this.kerberosVo = kerberosVo;
        return this;
    }

    public EndpointVO withKerberosVo(Consumer<KerberosVO> kerberosVoSetter) {
        if (this.kerberosVo == null) {
            this.kerberosVo = new KerberosVO();
            kerberosVoSetter.accept(this.kerberosVo);
        }

        return this;
    }

    /**
     * Get kerberosVo
     * @return kerberosVo
     */
    public KerberosVO getKerberosVo() {
        return kerberosVo;
    }

    public void setKerberosVo(KerberosVO kerberosVo) {
        this.kerberosVo = kerberosVo;
    }

    public EndpointVO withMultiWriteDbId(String multiWriteDbId) {
        this.multiWriteDbId = multiWriteDbId;
        return this;
    }

    /**
     * 多写数据库Id。
     * @return multiWriteDbId
     */
    public String getMultiWriteDbId() {
        return multiWriteDbId;
    }

    public void setMultiWriteDbId(String multiWriteDbId) {
        this.multiWriteDbId = multiWriteDbId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EndpointVO endpointVO = (EndpointVO) o;
        return Objects.equals(this.id, endpointVO.id) && Objects.equals(this.objId, endpointVO.objId)
            && Objects.equals(this.instanceName, endpointVO.instanceName)
            && Objects.equals(this.dbType, endpointVO.dbType) && Objects.equals(this.dbUser, endpointVO.dbUser)
            && Objects.equals(this.dbPassword, endpointVO.dbPassword)
            && Objects.equals(this.manageIp, endpointVO.manageIp)
            && Objects.equals(this.trafficIp, endpointVO.trafficIp) && Objects.equals(this.dbPort, endpointVO.dbPort)
            && Objects.equals(this.region, endpointVO.region) && Objects.equals(this.createdAt, endpointVO.createdAt)
            && Objects.equals(this.updatedAt, endpointVO.updatedAt) && Objects.equals(this.ip, endpointVO.ip)
            && Objects.equals(this.publicIp, endpointVO.publicIp) && Objects.equals(this.azCode, endpointVO.azCode)
            && Objects.equals(this.securityGroupId, endpointVO.securityGroupId)
            && Objects.equals(this.subnetId, endpointVO.subnetId) && Objects.equals(this.vpcId, endpointVO.vpcId)
            && Objects.equals(this.volumeSize, endpointVO.volumeSize)
            && Objects.equals(this.fullTransUserPwd, endpointVO.fullTransUserPwd)
            && Objects.equals(this.incrementTransUserPwd, endpointVO.incrementTransUserPwd)
            && Objects.equals(this.sslLink, endpointVO.sslLink)
            && Objects.equals(this.sslCertKey, endpointVO.sslCertKey)
            && Objects.equals(this.sslCertName, endpointVO.sslCertName)
            && Objects.equals(this.sslCertCheckSum, endpointVO.sslCertCheckSum)
            && Objects.equals(this.sslCertPassword, endpointVO.sslCertPassword)
            && Objects.equals(this.dbVersion, endpointVO.dbVersion)
            && Objects.equals(this.mongoHaMode, endpointVO.mongoHaMode)
            && Objects.equals(this.projectId, endpointVO.projectId)
            && Objects.equals(this.clusterMode, endpointVO.clusterMode)
            && Objects.equals(this.instanceId, endpointVO.instanceId) && Objects.equals(this.dbName, endpointVO.dbName)
            && Objects.equals(this.topic, endpointVO.topic) && Objects.equals(this.safeMode, endpointVO.safeMode)
            && Objects.equals(this.kerberosVo, endpointVO.kerberosVo)
            && Objects.equals(this.multiWriteDbId, endpointVO.multiWriteDbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            objId,
            instanceName,
            dbType,
            dbUser,
            dbPassword,
            manageIp,
            trafficIp,
            dbPort,
            region,
            createdAt,
            updatedAt,
            ip,
            publicIp,
            azCode,
            securityGroupId,
            subnetId,
            vpcId,
            volumeSize,
            fullTransUserPwd,
            incrementTransUserPwd,
            sslLink,
            sslCertKey,
            sslCertName,
            sslCertCheckSum,
            sslCertPassword,
            dbVersion,
            mongoHaMode,
            projectId,
            clusterMode,
            instanceId,
            dbName,
            topic,
            safeMode,
            kerberosVo,
            multiWriteDbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    objId: ").append(toIndentedString(objId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    manageIp: ").append(toIndentedString(manageIp)).append("\n");
        sb.append("    trafficIp: ").append(toIndentedString(trafficIp)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    fullTransUserPwd: ").append(toIndentedString(fullTransUserPwd)).append("\n");
        sb.append("    incrementTransUserPwd: ").append(toIndentedString(incrementTransUserPwd)).append("\n");
        sb.append("    sslLink: ").append(toIndentedString(sslLink)).append("\n");
        sb.append("    sslCertKey: ").append(toIndentedString(sslCertKey)).append("\n");
        sb.append("    sslCertName: ").append(toIndentedString(sslCertName)).append("\n");
        sb.append("    sslCertCheckSum: ").append(toIndentedString(sslCertCheckSum)).append("\n");
        sb.append("    sslCertPassword: ").append(toIndentedString(sslCertPassword)).append("\n");
        sb.append("    dbVersion: ").append(toIndentedString(dbVersion)).append("\n");
        sb.append("    mongoHaMode: ").append(toIndentedString(mongoHaMode)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    safeMode: ").append(toIndentedString(safeMode)).append("\n");
        sb.append("    kerberosVo: ").append(toIndentedString(kerberosVo)).append("\n");
        sb.append("    multiWriteDbId: ").append(toIndentedString(multiWriteDbId)).append("\n");
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
