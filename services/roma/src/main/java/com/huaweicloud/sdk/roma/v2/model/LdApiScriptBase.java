package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LdApiScriptBase
 */
public class LdApiScriptBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_id")

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_name")

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DsTypeEnum(value);
            }
            return result;
        }

        public static DsTypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof DsTypeEnum) {
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
    @JsonProperty(value = "ds_type")

    private DsTypeEnum dsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_result_paging")

    private Boolean enableResultPaging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_preparestatement")

    private Boolean enablePreparestatement;

    public LdApiScriptBase withDsId(String dsId) {
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

    public LdApiScriptBase withDsName(String dsName) {
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

    public LdApiScriptBase withDsType(DsTypeEnum dsType) {
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

    public LdApiScriptBase withType(String type) {
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

    public LdApiScriptBase withObjectName(String objectName) {
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

    public LdApiScriptBase withContent(String content) {
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

    public LdApiScriptBase withEnableResultPaging(Boolean enableResultPaging) {
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

    public LdApiScriptBase withEnablePreparestatement(Boolean enablePreparestatement) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiScriptBase ldApiScriptBase = (LdApiScriptBase) o;
        return Objects.equals(this.dsId, ldApiScriptBase.dsId) && Objects.equals(this.dsName, ldApiScriptBase.dsName)
            && Objects.equals(this.dsType, ldApiScriptBase.dsType) && Objects.equals(this.type, ldApiScriptBase.type)
            && Objects.equals(this.objectName, ldApiScriptBase.objectName)
            && Objects.equals(this.content, ldApiScriptBase.content)
            && Objects.equals(this.enableResultPaging, ldApiScriptBase.enableResultPaging)
            && Objects.equals(this.enablePreparestatement, ldApiScriptBase.enablePreparestatement);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dsId, dsName, dsType, type, objectName, content, enableResultPaging, enablePreparestatement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiScriptBase {\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    dsName: ").append(toIndentedString(dsName)).append("\n");
        sb.append("    dsType: ").append(toIndentedString(dsType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    enableResultPaging: ").append(toIndentedString(enableResultPaging)).append("\n");
        sb.append("    enablePreparestatement: ").append(toIndentedString(enablePreparestatement)).append("\n");
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
