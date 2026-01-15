package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据库信息
 */
public class CreateDatabaseRequestDatabase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_classification")

    private String dbClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * 字符集。 - GBK：GBK - UTF8：UTF8
     */
    public static final class CharsetEnum {

        /**
         * Enum GBK for value: "GBK"
         */
        public static final CharsetEnum GBK = new CharsetEnum("GBK");

        /**
         * Enum UTF8 for value: "UTF8"
         */
        public static final CharsetEnum UTF8 = new CharsetEnum("UTF8");

        private static final Map<String, CharsetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CharsetEnum> createStaticFields() {
            Map<String, CharsetEnum> map = new HashMap<>();
            map.put("GBK", GBK);
            map.put("UTF8", UTF8);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CharsetEnum(String value) {
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
        public static CharsetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CharsetEnum(value));
        }

        public static CharsetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CharsetEnum) {
                return this.value.equals(((CharsetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charset")

    private CharsetEnum charset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    public CreateDatabaseRequestDatabase withDbClassification(String dbClassification) {
        this.dbClassification = dbClassification;
        return this;
    }

    /**
     * 数据库分类 - RDS：RDS数据库 - ECS：自建数据库
     * @return dbClassification
     */
    public String getDbClassification() {
        return dbClassification;
    }

    public void setDbClassification(String dbClassification) {
        this.dbClassification = dbClassification;
    }

    public CreateDatabaseRequestDatabase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDatabaseRequestDatabase withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库类型 - MYSQL：MySQL - ORACLE：Oracle - POSTGRESQL：PostgreSQL - SQLSERVER：SQL Server - DAMENG：DAMENG - TAURUS：Taurus DB - DWS：GaussDB(DWS) - KINGBASE：Kingbase - GAUSSDBOPENGAUSS：GaussDB/openGauss - GREENPLUM：Greenplum - HIGHGO：HIGHGO - SHENTONG：ShenTong - GBASE8A：GBase 8a - GBASE8S：GBase 8s - GBASEXDM：GBase XDM - MONGODB：MongoDB - DDS：DDS(MongoDB)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateDatabaseRequestDatabase withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateDatabaseRequestDatabase withCharset(CharsetEnum charset) {
        this.charset = charset;
        return this;
    }

    /**
     * 字符集。 - GBK：GBK - UTF8：UTF8
     * @return charset
     */
    public CharsetEnum getCharset() {
        return charset;
    }

    public void setCharset(CharsetEnum charset) {
        this.charset = charset;
    }

    public CreateDatabaseRequestDatabase withIp(String ip) {
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

    public CreateDatabaseRequestDatabase withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public CreateDatabaseRequestDatabase withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 数据库操作系统 - LINUX64：LINUX64 - WINDOWS64：WINDOWS64 - UNIX：UNIX
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public CreateDatabaseRequestDatabase withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 数据库实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatabaseRequestDatabase that = (CreateDatabaseRequestDatabase) obj;
        return Objects.equals(this.dbClassification, that.dbClassification) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.charset, that.charset) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port) && Objects.equals(this.os, that.os)
            && Objects.equals(this.instanceName, that.instanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbClassification, name, type, version, charset, ip, port, os, instanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseRequestDatabase {\n");
        sb.append("    dbClassification: ").append(toIndentedString(dbClassification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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
