package com.huaweicloud.sdk.drs.v5.model;

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
 * 创建任务数据库信息体。
 */
public class JobEndpointInfo {

    /**
     * 数据库类型。取值： - oracle：Oracle。 - gaussdbv5：GaussDB分布式版。
     */
    public static final class DbTypeEnum {

        /**
         * Enum ORACLE for value: "oracle"
         */
        public static final DbTypeEnum ORACLE = new DbTypeEnum("oracle");

        /**
         * Enum GAUSSDBV5 for value: "gaussdbv5"
         */
        public static final DbTypeEnum GAUSSDBV5 = new DbTypeEnum("gaussdbv5");

        private static final Map<String, DbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbTypeEnum> createStaticFields() {
            Map<String, DbTypeEnum> map = new HashMap<>();
            map.put("oracle", ORACLE);
            map.put("gaussdbv5", GAUSSDBV5);
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

    /**
     * 数据库实例类型。取值： - offline：自建数据库。 - ecs：华为云ECS自建数据库。 - cloud：华为云数据库。
     */
    public static final class EndpointTypeEnum {

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final EndpointTypeEnum OFFLINE = new EndpointTypeEnum("offline");

        /**
         * Enum ECS for value: "ecs"
         */
        public static final EndpointTypeEnum ECS = new EndpointTypeEnum("ecs");

        /**
         * Enum CLOUD for value: "cloud"
         */
        public static final EndpointTypeEnum CLOUD = new EndpointTypeEnum("cloud");

        private static final Map<String, EndpointTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EndpointTypeEnum> createStaticFields() {
            Map<String, EndpointTypeEnum> map = new HashMap<>();
            map.put("offline", OFFLINE);
            map.put("ecs", ECS);
            map.put("cloud", CLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EndpointTypeEnum(String value) {
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
        public static EndpointTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EndpointTypeEnum(value));
        }

        public static EndpointTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EndpointTypeEnum) {
                return this.value.equals(((EndpointTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_type")

    private EndpointTypeEnum endpointType;

    /**
     * 数据库实例角色。取值： - so：源库。 - ta：目标库。
     */
    public static final class EndpointRoleEnum {

        /**
         * Enum SO for value: "so"
         */
        public static final EndpointRoleEnum SO = new EndpointRoleEnum("so");

        /**
         * Enum TA for value: "ta"
         */
        public static final EndpointRoleEnum TA = new EndpointRoleEnum("ta");

        private static final Map<String, EndpointRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EndpointRoleEnum> createStaticFields() {
            Map<String, EndpointRoleEnum> map = new HashMap<>();
            map.put("so", SO);
            map.put("ta", TA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EndpointRoleEnum(String value) {
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
        public static EndpointRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EndpointRoleEnum(value));
        }

        public static EndpointRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EndpointRoleEnum) {
                return this.value.equals(((EndpointRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_role")

    private EndpointRoleEnum endpointRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private BaseEndpoint endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud")

    private CloudBaseInfo cloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private CloudVpcInfo vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private BaseEndpointConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl")

    private EndpointSslConfig ssl;

    public JobEndpointInfo withDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型。取值： - oracle：Oracle。 - gaussdbv5：GaussDB分布式版。
     * @return dbType
     */
    public DbTypeEnum getDbType() {
        return dbType;
    }

    public void setDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
    }

    public JobEndpointInfo withEndpointType(EndpointTypeEnum endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * 数据库实例类型。取值： - offline：自建数据库。 - ecs：华为云ECS自建数据库。 - cloud：华为云数据库。
     * @return endpointType
     */
    public EndpointTypeEnum getEndpointType() {
        return endpointType;
    }

    public void setEndpointType(EndpointTypeEnum endpointType) {
        this.endpointType = endpointType;
    }

    public JobEndpointInfo withEndpointRole(EndpointRoleEnum endpointRole) {
        this.endpointRole = endpointRole;
        return this;
    }

    /**
     * 数据库实例角色。取值： - so：源库。 - ta：目标库。
     * @return endpointRole
     */
    public EndpointRoleEnum getEndpointRole() {
        return endpointRole;
    }

    public void setEndpointRole(EndpointRoleEnum endpointRole) {
        this.endpointRole = endpointRole;
    }

    public JobEndpointInfo withEndpoint(BaseEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public JobEndpointInfo withEndpoint(Consumer<BaseEndpoint> endpointSetter) {
        if (this.endpoint == null) {
            this.endpoint = new BaseEndpoint();
            endpointSetter.accept(this.endpoint);
        }

        return this;
    }

    /**
     * Get endpoint
     * @return endpoint
     */
    public BaseEndpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(BaseEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    public JobEndpointInfo withCloud(CloudBaseInfo cloud) {
        this.cloud = cloud;
        return this;
    }

    public JobEndpointInfo withCloud(Consumer<CloudBaseInfo> cloudSetter) {
        if (this.cloud == null) {
            this.cloud = new CloudBaseInfo();
            cloudSetter.accept(this.cloud);
        }

        return this;
    }

    /**
     * Get cloud
     * @return cloud
     */
    public CloudBaseInfo getCloud() {
        return cloud;
    }

    public void setCloud(CloudBaseInfo cloud) {
        this.cloud = cloud;
    }

    public JobEndpointInfo withVpc(CloudVpcInfo vpc) {
        this.vpc = vpc;
        return this;
    }

    public JobEndpointInfo withVpc(Consumer<CloudVpcInfo> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new CloudVpcInfo();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public CloudVpcInfo getVpc() {
        return vpc;
    }

    public void setVpc(CloudVpcInfo vpc) {
        this.vpc = vpc;
    }

    public JobEndpointInfo withConfig(BaseEndpointConfig config) {
        this.config = config;
        return this;
    }

    public JobEndpointInfo withConfig(Consumer<BaseEndpointConfig> configSetter) {
        if (this.config == null) {
            this.config = new BaseEndpointConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public BaseEndpointConfig getConfig() {
        return config;
    }

    public void setConfig(BaseEndpointConfig config) {
        this.config = config;
    }

    public JobEndpointInfo withSsl(EndpointSslConfig ssl) {
        this.ssl = ssl;
        return this;
    }

    public JobEndpointInfo withSsl(Consumer<EndpointSslConfig> sslSetter) {
        if (this.ssl == null) {
            this.ssl = new EndpointSslConfig();
            sslSetter.accept(this.ssl);
        }

        return this;
    }

    /**
     * Get ssl
     * @return ssl
     */
    public EndpointSslConfig getSsl() {
        return ssl;
    }

    public void setSsl(EndpointSslConfig ssl) {
        this.ssl = ssl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobEndpointInfo that = (JobEndpointInfo) obj;
        return Objects.equals(this.dbType, that.dbType) && Objects.equals(this.endpointType, that.endpointType)
            && Objects.equals(this.endpointRole, that.endpointRole) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.cloud, that.cloud) && Objects.equals(this.vpc, that.vpc)
            && Objects.equals(this.config, that.config) && Objects.equals(this.ssl, that.ssl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbType, endpointType, endpointRole, endpoint, cloud, vpc, config, ssl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEndpointInfo {\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
        sb.append("    endpointRole: ").append(toIndentedString(endpointRole)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
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
