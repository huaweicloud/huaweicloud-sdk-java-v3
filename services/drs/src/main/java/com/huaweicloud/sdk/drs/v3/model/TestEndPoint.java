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
 * 测试连接信息体
 */
public class TestEndPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NetTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NetTypeEnum(value);
            }
            return result;
        }

        public static NetTypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof NetTypeEnum) {
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
    @JsonProperty(value = "net_type")

    private NetTypeEnum netType;

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

        private static final Map<String, DbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbTypeEnum> createStaticFields() {
            Map<String, DbTypeEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
            map.put("gaussdbv5", GAUSSDBV5);
            map.put("postgresql", POSTGRESQL);
            map.put("kafka", KAFKA);
            map.put("gaussdbv5ha", GAUSSDBV5HA);
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

    private DbTypeEnum dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private Integer dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_id")

    private String instId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    private String dbPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_link")

    private Boolean sslLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_key")

    private String sslCertKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_name")

    private String sslCertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_check_sum")

    private String sslCertCheckSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_password")

    private String sslCertPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    /**
     * 源库：so,目标库：ta
     */
    public static final class EndPointTypeEnum {

        /**
         * Enum SO for value: "so"
         */
        public static final EndPointTypeEnum SO = new EndPointTypeEnum("so");

        /**
         * Enum TA for value: "ta"
         */
        public static final EndPointTypeEnum TA = new EndPointTypeEnum("ta");

        private static final Map<String, EndPointTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EndPointTypeEnum> createStaticFields() {
            Map<String, EndPointTypeEnum> map = new HashMap<>();
            map.put("so", SO);
            map.put("ta", TA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EndPointTypeEnum(String value) {
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
        public static EndPointTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EndPointTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EndPointTypeEnum(value);
            }
            return result;
        }

        public static EndPointTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EndPointTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EndPointTypeEnum) {
                return this.value.equals(((EndPointTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_point_type")

    private EndPointTypeEnum endPointType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_security_config")

    private KafkaSecurity kafkaSecurityConfig;

    public TestEndPoint withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TestEndPoint withNetType(NetTypeEnum netType) {
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

    public TestEndPoint withDbType(DbTypeEnum dbType) {
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

    public TestEndPoint withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 数据库IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TestEndPoint withDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口，Mongo、DDS必填为0。
     * @return dbPort
     */
    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    public TestEndPoint withInstId(String instId) {
        this.instId = instId;
        return this;
    }

    /**
     * RDS实例id，RDS实例必填。
     * @return instId
     */
    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public TestEndPoint withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库帐号。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public TestEndPoint withDbPassword(String dbPassword) {
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

    public TestEndPoint withSslLink(Boolean sslLink) {
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

    public TestEndPoint withSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
        return this;
    }

    /**
     * SSL证书内容，base64加密后的值，源库安全连接必选。
     * @return sslCertKey
     */
    public String getSslCertKey() {
        return sslCertKey;
    }

    public void setSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
    }

    public TestEndPoint withSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
        return this;
    }

    /**
     * SSL证书名字，源库安全连接必选。
     * @return sslCertName
     */
    public String getSslCertName() {
        return sslCertName;
    }

    public void setSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
    }

    public TestEndPoint withSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
        return this;
    }

    /**
     * SSL证书内容checksum值，证书经过sha256加密后的值，后端校验，源库安全连接必选。
     * @return sslCertCheckSum
     */
    public String getSslCertCheckSum() {
        return sslCertCheckSum;
    }

    public void setSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
    }

    public TestEndPoint withSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
        return this;
    }

    /**
     * SSL证书密码，证书文件后缀为.p12，需要密码。
     * @return sslCertPassword
     */
    public String getSslCertPassword() {
        return sslCertPassword;
    }

    public void setSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
    }

    public TestEndPoint withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpcid，数据库为RDS时必选。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public TestEndPoint withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * subnetid，数据库为RDS必选。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public TestEndPoint withEndPointType(EndPointTypeEnum endPointType) {
        this.endPointType = endPointType;
        return this;
    }

    /**
     * 源库：so,目标库：ta
     * @return endPointType
     */
    public EndPointTypeEnum getEndPointType() {
        return endPointType;
    }

    public void setEndPointType(EndPointTypeEnum endPointType) {
        this.endPointType = endPointType;
    }

    public TestEndPoint withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * rds实例region，数据库为RDS时必填。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TestEndPoint withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 用户所处region的projectId。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TestEndPoint withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库用户名，DDS的账号认证数据库，Oracle的serviceName。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public TestEndPoint withKafkaSecurityConfig(KafkaSecurity kafkaSecurityConfig) {
        this.kafkaSecurityConfig = kafkaSecurityConfig;
        return this;
    }

    public TestEndPoint withKafkaSecurityConfig(Consumer<KafkaSecurity> kafkaSecurityConfigSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestEndPoint testEndPoint = (TestEndPoint) o;
        return Objects.equals(this.id, testEndPoint.id) && Objects.equals(this.netType, testEndPoint.netType)
            && Objects.equals(this.dbType, testEndPoint.dbType) && Objects.equals(this.ip, testEndPoint.ip)
            && Objects.equals(this.dbPort, testEndPoint.dbPort) && Objects.equals(this.instId, testEndPoint.instId)
            && Objects.equals(this.dbUser, testEndPoint.dbUser)
            && Objects.equals(this.dbPassword, testEndPoint.dbPassword)
            && Objects.equals(this.sslLink, testEndPoint.sslLink)
            && Objects.equals(this.sslCertKey, testEndPoint.sslCertKey)
            && Objects.equals(this.sslCertName, testEndPoint.sslCertName)
            && Objects.equals(this.sslCertCheckSum, testEndPoint.sslCertCheckSum)
            && Objects.equals(this.sslCertPassword, testEndPoint.sslCertPassword)
            && Objects.equals(this.vpcId, testEndPoint.vpcId) && Objects.equals(this.subnetId, testEndPoint.subnetId)
            && Objects.equals(this.endPointType, testEndPoint.endPointType)
            && Objects.equals(this.region, testEndPoint.region)
            && Objects.equals(this.projectId, testEndPoint.projectId)
            && Objects.equals(this.dbName, testEndPoint.dbName)
            && Objects.equals(this.kafkaSecurityConfig, testEndPoint.kafkaSecurityConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            netType,
            dbType,
            ip,
            dbPort,
            instId,
            dbUser,
            dbPassword,
            sslLink,
            sslCertKey,
            sslCertName,
            sslCertCheckSum,
            sslCertPassword,
            vpcId,
            subnetId,
            endPointType,
            region,
            projectId,
            dbName,
            kafkaSecurityConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestEndPoint {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    instId: ").append(toIndentedString(instId)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    sslLink: ").append(toIndentedString(sslLink)).append("\n");
        sb.append("    sslCertKey: ").append(toIndentedString(sslCertKey)).append("\n");
        sb.append("    sslCertName: ").append(toIndentedString(sslCertName)).append("\n");
        sb.append("    sslCertCheckSum: ").append(toIndentedString(sslCertCheckSum)).append("\n");
        sb.append("    sslCertPassword: ").append(toIndentedString(sslCertPassword)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    endPointType: ").append(toIndentedString(endPointType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
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
