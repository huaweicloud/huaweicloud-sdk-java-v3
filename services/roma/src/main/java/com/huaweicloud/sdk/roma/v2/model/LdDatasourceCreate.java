package com.huaweicloud.sdk.roma.v2.model;




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
 * LdDatasourceCreate
 */
public class LdDatasourceCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 数据源类型： - oracle：oracle数据源类型 - mysql：mysql数据源类型 - mongodb：mongodb数据源类型 - redis：redis数据源类型 - postgresql：postgresql数据源类型 - hive：hive数据源类型 - mssql：sqlserver数据源类型 - sqlserver：sqlserver数据源类型 - gauss200：gauss200数据源类型 - dws：dws数据源类型 - gauss100：gauss100数据源类型 - zenith：zenith数据源类型
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
         * Enum GAUSS200 for value: "gauss200"
         */
        public static final TypeEnum GAUSS200 = new TypeEnum("gauss200");
        
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
            map.put("gauss200", GAUSS200);
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
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remotepath")
    
    private String remotepath;

    public LdDatasourceCreate withName(String name) {
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

    

    public LdDatasourceCreate withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 数据源类型： - oracle：oracle数据源类型 - mysql：mysql数据源类型 - mongodb：mongodb数据源类型 - redis：redis数据源类型 - postgresql：postgresql数据源类型 - hive：hive数据源类型 - mssql：sqlserver数据源类型 - sqlserver：sqlserver数据源类型 - gauss200：gauss200数据源类型 - dws：dws数据源类型 - gauss100：gauss100数据源类型 - zenith：zenith数据源类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public LdDatasourceCreate withDescription(String description) {
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

    

    public LdDatasourceCreate withUrl(String url) {
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

    

    public LdDatasourceCreate withUser(String user) {
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

    

    public LdDatasourceCreate withPassword(String password) {
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

    

    public LdDatasourceCreate withRemotepath(String remotepath) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdDatasourceCreate ldDatasourceCreate = (LdDatasourceCreate) o;
        return Objects.equals(this.name, ldDatasourceCreate.name) &&
            Objects.equals(this.type, ldDatasourceCreate.type) &&
            Objects.equals(this.description, ldDatasourceCreate.description) &&
            Objects.equals(this.url, ldDatasourceCreate.url) &&
            Objects.equals(this.user, ldDatasourceCreate.user) &&
            Objects.equals(this.password, ldDatasourceCreate.password) &&
            Objects.equals(this.remotepath, ldDatasourceCreate.remotepath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, url, user, password, remotepath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdDatasourceCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    remotepath: ").append(toIndentedString(remotepath)).append("\n");
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

