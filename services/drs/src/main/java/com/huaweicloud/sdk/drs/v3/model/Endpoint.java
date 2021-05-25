package com.huaweicloud.sdk.drs.v3.model;




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
 * 数据库信息体
 */
public class Endpoint  {

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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DbTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DbTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DbTypeEnum(value);
            }
            return result;
        }

        public static DbTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof DbTypeEnum) {
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
    @JsonProperty(value="db_type")
    
    private DbTypeEnum dbType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_code")
    
    private String azCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inst_id")
    
    private String instId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_password")
    
    private String dbPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_port")
    
    private Integer dbPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user")
    
    private String dbUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inst_name")
    
    private String instName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mongo_ha_mode")
    
    private String mongoHaMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="safe_mode")
    
    private Integer safeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_cert_password")
    
    private String sslCertPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_cert_check_sum")
    
    private String sslCertCheckSum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_cert_key")
    
    private String sslCertKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_cert_name")
    
    private String sslCertName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_link")
    
    private Boolean sslLink;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;
    /**
     * MongDB集群4.0及以上版本，当集群实例无法获取到分片节点的IP时，source_endpoint中需要填写，值为：Sharding4.0+。
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ClusterModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ClusterModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ClusterModeEnum(value);
            }
            return result;
        }

        public static ClusterModeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof ClusterModeEnum) {
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
    @JsonProperty(value="cluster_mode")
    
    private ClusterModeEnum clusterMode;

    public Endpoint withDbType(DbTypeEnum dbType) {
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

    

    public Endpoint withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 数据库所在可用区azCode
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
     * RDS实例所在Region，数据库为RDS实例时必填（灾备场景下job_direction为down时source_endpoint中该值为必填，job_direction为up时target_endpoint中该值为必填）。
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
     * RDS实例ID，数据库为RDS实例必填（灾备场景下job_direction为down时source_endpoint中该值为必填，job_direction为up时target_endpoint中该值为必填）。
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
     * 数据库所在的虚拟私有云id
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
     * 数据库所在的子网id
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
     * 数据库所在的安全组id。
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
     * RDS实例projectId
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
     * 服务名serviceName，源库为oracle场景时必填。约束：不能超过128位，不能包含!<>&'\"\\特殊字符。待还原数据库名称是指备份文件中包含的数据库名称，当您选择部分数据库恢复时，需要选择恢复一个或者多个数据库。
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
     * 数据库密码。
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
     * 数据库端口。约束：输入范围为1-65535之间的整数。
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
     * 数据库用户。
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
     * RDS实例名称。
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
     * 数据库ip
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
     * mongo ha模式。
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
     * MRS集群运行模式，取值： - 0普通集群 - 1安全集群
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
     * SSL证书密码，证书文件后缀为.p12
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
     * SSL证书内容checksum值，后端校验，源库安全连接必选。
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
     * SSL证书内容，用base64加密
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
     * SSL证书名字
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
     * 是否SSL安全连接。
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
     * kafka topic名称
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
     * MongDB集群4.0及以上版本，当集群实例无法获取到分片节点的IP时，source_endpoint中需要填写，值为：Sharding4.0+。
     * @return clusterMode
     */
    public ClusterModeEnum getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(ClusterModeEnum clusterMode) {
        this.clusterMode = clusterMode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoint endpoint = (Endpoint) o;
        return Objects.equals(this.dbType, endpoint.dbType) &&
            Objects.equals(this.azCode, endpoint.azCode) &&
            Objects.equals(this.region, endpoint.region) &&
            Objects.equals(this.instId, endpoint.instId) &&
            Objects.equals(this.vpcId, endpoint.vpcId) &&
            Objects.equals(this.subnetId, endpoint.subnetId) &&
            Objects.equals(this.securityGroupId, endpoint.securityGroupId) &&
            Objects.equals(this.projectId, endpoint.projectId) &&
            Objects.equals(this.dbName, endpoint.dbName) &&
            Objects.equals(this.dbPassword, endpoint.dbPassword) &&
            Objects.equals(this.dbPort, endpoint.dbPort) &&
            Objects.equals(this.dbUser, endpoint.dbUser) &&
            Objects.equals(this.instName, endpoint.instName) &&
            Objects.equals(this.ip, endpoint.ip) &&
            Objects.equals(this.mongoHaMode, endpoint.mongoHaMode) &&
            Objects.equals(this.safeMode, endpoint.safeMode) &&
            Objects.equals(this.sslCertPassword, endpoint.sslCertPassword) &&
            Objects.equals(this.sslCertCheckSum, endpoint.sslCertCheckSum) &&
            Objects.equals(this.sslCertKey, endpoint.sslCertKey) &&
            Objects.equals(this.sslCertName, endpoint.sslCertName) &&
            Objects.equals(this.sslLink, endpoint.sslLink) &&
            Objects.equals(this.topic, endpoint.topic) &&
            Objects.equals(this.clusterMode, endpoint.clusterMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbType, azCode, region, instId, vpcId, subnetId, securityGroupId, projectId, dbName, dbPassword, dbPort, dbUser, instName, ip, mongoHaMode, safeMode, sslCertPassword, sslCertCheckSum, sslCertKey, sslCertName, sslLink, topic, clusterMode);
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

