package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LdDatasourceInfo
 */
public class LdDatasourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 数据源类型：  - oracle：oracle数据源类型  - mysql：mysql数据源类型  - mongodb：mongodb数据源类型  - redis：redis数据源类型  - postgresql：postgresql/opengauss数据源类型  - hive：hive数据源类型  - mssql：sqlserver数据源类型  - sqlserver：sqlserver数据源类型  - dws：dws数据源类型  - gauss100：gauss100数据源类型  - zenith：zenith数据源类型
     */
    public static final class TypeEnum {

        /**
         * Enum ORACLE for value: "oracle"
         */
        public static final TypeEnum ORACLE = new TypeEnum("oracle");

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final TypeEnum MYSQL = new TypeEnum("mysql");

        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final TypeEnum MONGODB = new TypeEnum("mongodb");

        /**
         * Enum REDIS for value: "redis"
         */
        public static final TypeEnum REDIS = new TypeEnum("redis");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final TypeEnum POSTGRESQL = new TypeEnum("postgresql");

        /**
         * Enum HIVE for value: "hive"
         */
        public static final TypeEnum HIVE = new TypeEnum("hive");

        /**
         * Enum MSSQL for value: "mssql"
         */
        public static final TypeEnum MSSQL = new TypeEnum("mssql");

        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final TypeEnum SQLSERVER = new TypeEnum("sqlserver");

        /**
         * Enum DWS for value: "dws"
         */
        public static final TypeEnum DWS = new TypeEnum("dws");

        /**
         * Enum GAUSS100 for value: "gauss100"
         */
        public static final TypeEnum GAUSS100 = new TypeEnum("gauss100");

        /**
         * Enum ZENITH for value: "zenith"
         */
        public static final TypeEnum ZENITH = new TypeEnum("zenith");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("oracle", ORACLE);
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
            map.put("redis", REDIS);
            map.put("postgresql", POSTGRESQL);
            map.put("hive", HIVE);
            map.put("mssql", MSSQL);
            map.put("sqlserver", SQLSERVER);
            map.put("dws", DWS);
            map.put("gauss100", GAUSS100);
            map.put("zenith", ZENITH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remotepath")

    private String remotepath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private OffsetDateTime modifiedTime;

    public LdDatasourceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LdDatasourceInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据源类型：  - oracle：oracle数据源类型  - mysql：mysql数据源类型  - mongodb：mongodb数据源类型  - redis：redis数据源类型  - postgresql：postgresql/opengauss数据源类型  - hive：hive数据源类型  - mssql：sqlserver数据源类型  - sqlserver：sqlserver数据源类型  - dws：dws数据源类型  - gauss100：gauss100数据源类型  - zenith：zenith数据源类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public LdDatasourceInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LdDatasourceInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 数据源连接字符串
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LdDatasourceInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LdDatasourceInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码。  敏感信息不作为响应返回
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LdDatasourceInfo withRemotepath(String remotepath) {
        this.remotepath = remotepath;
        return this;
    }

    /**
     * ftp上传路径  预留字段，暂不支持。
     * @return remotepath
     */
    public String getRemotepath() {
        return remotepath;
    }

    public void setRemotepath(String remotepath) {
        this.remotepath = remotepath;
    }

    public LdDatasourceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据源ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LdDatasourceInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据源状态： - old：存量数据源 - new：roma数据源
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LdDatasourceInfo withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 数据源创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LdDatasourceInfo withModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 数据源更新时间
     * @return modifiedTime
     */
    public OffsetDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LdDatasourceInfo that = (LdDatasourceInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this.url, that.url)
            && Objects.equals(this.user, that.user) && Objects.equals(this.password, that.password)
            && Objects.equals(this.remotepath, that.remotepath) && Objects.equals(this.id, that.id)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, type, description, url, user, password, remotepath, id, status, createdTime, modifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdDatasourceInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    remotepath: ").append(toIndentedString(remotepath)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
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
