package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiScriptBase;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LdApiScript
 */
public class LdApiScript  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_id")
    
    private String dsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_name")
    
    private String dsName;
    /**
     * 数据源类型： - oracle：oracle数据源类型 - mysql：mysql数据源类型 - mongodb：mongodb数据源类型 - redis：redis数据源类型 - postgresql：postgresql数据源类型 - hive：hive数据源类型 - mssql：sqlserver数据源类型 - sqlserver：sqlserver数据源类型 - gauss200：gauss200数据源类型 - dws：dws数据源类型 - gauss100：gauss100数据源类型 - zenith：zenith数据源类型
     */
    public static final class DsTypeEnum {

        
        /**
         * Enum ORACLE for value: "oracle"
         */
        public static final DsTypeEnum ORACLE = new DsTypeEnum("oracle");
        
        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final DsTypeEnum MYSQL = new DsTypeEnum("mysql");
        
        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final DsTypeEnum MONGODB = new DsTypeEnum("mongodb");
        
        /**
         * Enum REDIS for value: "redis"
         */
        public static final DsTypeEnum REDIS = new DsTypeEnum("redis");
        
        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final DsTypeEnum POSTGRESQL = new DsTypeEnum("postgresql");
        
        /**
         * Enum HIVE for value: "hive"
         */
        public static final DsTypeEnum HIVE = new DsTypeEnum("hive");
        
        /**
         * Enum MSSQL for value: "mssql"
         */
        public static final DsTypeEnum MSSQL = new DsTypeEnum("mssql");
        
        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final DsTypeEnum SQLSERVER = new DsTypeEnum("sqlserver");
        
        /**
         * Enum GAUSS200 for value: "gauss200"
         */
        public static final DsTypeEnum GAUSS200 = new DsTypeEnum("gauss200");
        
        /**
         * Enum DWS for value: "dws"
         */
        public static final DsTypeEnum DWS = new DsTypeEnum("dws");
        
        /**
         * Enum GAUSS100 for value: "gauss100"
         */
        public static final DsTypeEnum GAUSS100 = new DsTypeEnum("gauss100");
        
        /**
         * Enum ZENITH for value: "zenith"
         */
        public static final DsTypeEnum ZENITH = new DsTypeEnum("zenith");
        

        private static final Map<String, DsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DsTypeEnum> createStaticFields() {
            Map<String, DsTypeEnum> map = new HashMap<>();
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

        DsTypeEnum(String value) {
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
        public static DsTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DsTypeEnum(value);
            }
            return result;
        }

        public static DsTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DsTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DsTypeEnum) {
                return this.value.equals(((DsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_type")
    
    private DsTypeEnum dsType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_name")
    
    private String objectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_result_paging")
    
    private Boolean enableResultPaging;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_preparestatement")
    
    private Boolean enablePreparestatement;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private OffsetDateTime createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modified_time")
    
    private OffsetDateTime modifiedTime;

    public LdApiScript withDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }

    


    /**
     * 数据源编号，当api_type = data时，必选
     * @return dsId
     */
    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    

    public LdApiScript withDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }

    


    /**
     * 数据源名称
     * @return dsName
     */
    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    

    public LdApiScript withDsType(DsTypeEnum dsType) {
        this.dsType = dsType;
        return this;
    }

    


    /**
     * 数据源类型： - oracle：oracle数据源类型 - mysql：mysql数据源类型 - mongodb：mongodb数据源类型 - redis：redis数据源类型 - postgresql：postgresql数据源类型 - hive：hive数据源类型 - mssql：sqlserver数据源类型 - sqlserver：sqlserver数据源类型 - gauss200：gauss200数据源类型 - dws：dws数据源类型 - gauss100：gauss100数据源类型 - zenith：zenith数据源类型
     * @return dsType
     */
    public DsTypeEnum getDsType() {
        return dsType;
    }

    public void setDsType(DsTypeEnum dsType) {
        this.dsType = dsType;
    }

    

    public LdApiScript withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 脚本类型 - SQL：sql语句 - SP：存储过程 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public LdApiScript withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    


    /**
     * 返回对象。  当api_type = data时，必选
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    

    public LdApiScript withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * API脚本内容  请对脚本进行base64编码
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public LdApiScript withEnableResultPaging(Boolean enableResultPaging) {
        this.enableResultPaging = enableResultPaging;
        return this;
    }

    


    /**
     * 数据脚本是否结果分页，当api_type = data时有效
     * @return enableResultPaging
     */
    public Boolean getEnableResultPaging() {
        return enableResultPaging;
    }

    public void setEnableResultPaging(Boolean enableResultPaging) {
        this.enableResultPaging = enableResultPaging;
    }

    

    public LdApiScript withEnablePreparestatement(Boolean enablePreparestatement) {
        this.enablePreparestatement = enablePreparestatement;
        return this;
    }

    


    /**
     * 数据脚本是否预编译，当api_type = data时有效
     * @return enablePreparestatement
     */
    public Boolean getEnablePreparestatement() {
        return enablePreparestatement;
    }

    public void setEnablePreparestatement(Boolean enablePreparestatement) {
        this.enablePreparestatement = enablePreparestatement;
    }

    

    public LdApiScript withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 后端API脚本创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    

    public LdApiScript withModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    


    /**
     * 后端API脚本修改时间
     * @return modifiedTime
     */
    public OffsetDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiScript ldApiScript = (LdApiScript) o;
        return Objects.equals(this.dsId, ldApiScript.dsId) &&
            Objects.equals(this.dsName, ldApiScript.dsName) &&
            Objects.equals(this.dsType, ldApiScript.dsType) &&
            Objects.equals(this.type, ldApiScript.type) &&
            Objects.equals(this.objectName, ldApiScript.objectName) &&
            Objects.equals(this.content, ldApiScript.content) &&
            Objects.equals(this.enableResultPaging, ldApiScript.enableResultPaging) &&
            Objects.equals(this.enablePreparestatement, ldApiScript.enablePreparestatement) &&
            Objects.equals(this.createdTime, ldApiScript.createdTime) &&
            Objects.equals(this.modifiedTime, ldApiScript.modifiedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dsId, dsName, dsType, type, objectName, content, enableResultPaging, enablePreparestatement, createdTime, modifiedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiScript {\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    dsName: ").append(toIndentedString(dsName)).append("\n");
        sb.append("    dsType: ").append(toIndentedString(dsType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    enableResultPaging: ").append(toIndentedString(enableResultPaging)).append("\n");
        sb.append("    enablePreparestatement: ").append(toIndentedString(enablePreparestatement)).append("\n");
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

