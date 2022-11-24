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
 * Request Object
 */
public class ListDatasourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 数据源类型 - DWS - MYSQL - KAFKA - API - OBS - SAP - MRSHBASE - MRSHDFS - MRSHIVE - WEBSOCKET - SQLSERVER - ORACLE - POSTGRESQL - REDIS - MONGODB - DIS - HL7 - RABBITMQ - SNMP - IBMMQ - CUSTOMIZED (自定义类型) - ACTIVEMQ - ARTEMISMQ - FTP - HIVE - HANA - FIKAFKA - MRSKAFKA - FIHDFS - FIHIVE - GAUSS200 - GAUSS100 - LDAP - DB2 - TAURUS
     */
    public static final class DatasourceTypeEnum {

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DatasourceTypeEnum DWS = new DatasourceTypeEnum("DWS");

        /**
         * Enum MYSQL for value: "MYSQL"
         */
        public static final DatasourceTypeEnum MYSQL = new DatasourceTypeEnum("MYSQL");

        /**
         * Enum KAFKA for value: "KAFKA"
         */
        public static final DatasourceTypeEnum KAFKA = new DatasourceTypeEnum("KAFKA");

        /**
         * Enum API for value: "API"
         */
        public static final DatasourceTypeEnum API = new DatasourceTypeEnum("API");

        /**
         * Enum OBS for value: "OBS"
         */
        public static final DatasourceTypeEnum OBS = new DatasourceTypeEnum("OBS");

        /**
         * Enum SAP for value: "SAP"
         */
        public static final DatasourceTypeEnum SAP = new DatasourceTypeEnum("SAP");

        /**
         * Enum MRSHBASE for value: "MRSHBASE"
         */
        public static final DatasourceTypeEnum MRSHBASE = new DatasourceTypeEnum("MRSHBASE");

        /**
         * Enum MRSHDFS for value: "MRSHDFS"
         */
        public static final DatasourceTypeEnum MRSHDFS = new DatasourceTypeEnum("MRSHDFS");

        /**
         * Enum MRSHIVE for value: "MRSHIVE"
         */
        public static final DatasourceTypeEnum MRSHIVE = new DatasourceTypeEnum("MRSHIVE");

        /**
         * Enum WEBSOCKET for value: "WEBSOCKET"
         */
        public static final DatasourceTypeEnum WEBSOCKET = new DatasourceTypeEnum("WEBSOCKET");

        /**
         * Enum SQLSERVER for value: "SQLSERVER"
         */
        public static final DatasourceTypeEnum SQLSERVER = new DatasourceTypeEnum("SQLSERVER");

        /**
         * Enum ORACLE for value: "ORACLE"
         */
        public static final DatasourceTypeEnum ORACLE = new DatasourceTypeEnum("ORACLE");

        /**
         * Enum POSTGRESQL for value: "POSTGRESQL"
         */
        public static final DatasourceTypeEnum POSTGRESQL = new DatasourceTypeEnum("POSTGRESQL");

        /**
         * Enum REDIS for value: "REDIS"
         */
        public static final DatasourceTypeEnum REDIS = new DatasourceTypeEnum("REDIS");

        /**
         * Enum MONGODB for value: "MONGODB"
         */
        public static final DatasourceTypeEnum MONGODB = new DatasourceTypeEnum("MONGODB");

        /**
         * Enum DIS for value: "DIS"
         */
        public static final DatasourceTypeEnum DIS = new DatasourceTypeEnum("DIS");

        /**
         * Enum HL7 for value: "HL7"
         */
        public static final DatasourceTypeEnum HL7 = new DatasourceTypeEnum("HL7");

        /**
         * Enum RABBITMQ for value: "RABBITMQ"
         */
        public static final DatasourceTypeEnum RABBITMQ = new DatasourceTypeEnum("RABBITMQ");

        /**
         * Enum SNMP for value: "SNMP"
         */
        public static final DatasourceTypeEnum SNMP = new DatasourceTypeEnum("SNMP");

        /**
         * Enum IBMMQ for value: "IBMMQ"
         */
        public static final DatasourceTypeEnum IBMMQ = new DatasourceTypeEnum("IBMMQ");

        /**
         * Enum CUSTOMIZED for value: "CUSTOMIZED"
         */
        public static final DatasourceTypeEnum CUSTOMIZED = new DatasourceTypeEnum("CUSTOMIZED");

        /**
         * Enum ACTIVEMQ for value: "ACTIVEMQ"
         */
        public static final DatasourceTypeEnum ACTIVEMQ = new DatasourceTypeEnum("ACTIVEMQ");

        /**
         * Enum ARTEMISMQ for value: "ARTEMISMQ"
         */
        public static final DatasourceTypeEnum ARTEMISMQ = new DatasourceTypeEnum("ARTEMISMQ");

        /**
         * Enum FTP for value: "FTP"
         */
        public static final DatasourceTypeEnum FTP = new DatasourceTypeEnum("FTP");

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DatasourceTypeEnum HIVE = new DatasourceTypeEnum("HIVE");

        /**
         * Enum HANA for value: "HANA"
         */
        public static final DatasourceTypeEnum HANA = new DatasourceTypeEnum("HANA");

        /**
         * Enum FIKAFKA for value: "FIKAFKA"
         */
        public static final DatasourceTypeEnum FIKAFKA = new DatasourceTypeEnum("FIKAFKA");

        /**
         * Enum MRSKAFKA for value: "MRSKAFKA"
         */
        public static final DatasourceTypeEnum MRSKAFKA = new DatasourceTypeEnum("MRSKAFKA");

        /**
         * Enum FIHDFS for value: "FIHDFS"
         */
        public static final DatasourceTypeEnum FIHDFS = new DatasourceTypeEnum("FIHDFS");

        /**
         * Enum FIHIVE for value: "FIHIVE"
         */
        public static final DatasourceTypeEnum FIHIVE = new DatasourceTypeEnum("FIHIVE");

        /**
         * Enum GAUSS200 for value: "GAUSS200"
         */
        public static final DatasourceTypeEnum GAUSS200 = new DatasourceTypeEnum("GAUSS200");

        /**
         * Enum GAUSS100 for value: "GAUSS100"
         */
        public static final DatasourceTypeEnum GAUSS100 = new DatasourceTypeEnum("GAUSS100");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final DatasourceTypeEnum LDAP = new DatasourceTypeEnum("LDAP");

        /**
         * Enum DB2 for value: "DB2"
         */
        public static final DatasourceTypeEnum DB2 = new DatasourceTypeEnum("DB2");

        /**
         * Enum TAURUS for value: "TAURUS"
         */
        public static final DatasourceTypeEnum TAURUS = new DatasourceTypeEnum("TAURUS");

        private static final Map<String, DatasourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatasourceTypeEnum> createStaticFields() {
            Map<String, DatasourceTypeEnum> map = new HashMap<>();
            map.put("DWS", DWS);
            map.put("MYSQL", MYSQL);
            map.put("KAFKA", KAFKA);
            map.put("API", API);
            map.put("OBS", OBS);
            map.put("SAP", SAP);
            map.put("MRSHBASE", MRSHBASE);
            map.put("MRSHDFS", MRSHDFS);
            map.put("MRSHIVE", MRSHIVE);
            map.put("WEBSOCKET", WEBSOCKET);
            map.put("SQLSERVER", SQLSERVER);
            map.put("ORACLE", ORACLE);
            map.put("POSTGRESQL", POSTGRESQL);
            map.put("REDIS", REDIS);
            map.put("MONGODB", MONGODB);
            map.put("DIS", DIS);
            map.put("HL7", HL7);
            map.put("RABBITMQ", RABBITMQ);
            map.put("SNMP", SNMP);
            map.put("IBMMQ", IBMMQ);
            map.put("CUSTOMIZED", CUSTOMIZED);
            map.put("ACTIVEMQ", ACTIVEMQ);
            map.put("ARTEMISMQ", ARTEMISMQ);
            map.put("FTP", FTP);
            map.put("HIVE", HIVE);
            map.put("HANA", HANA);
            map.put("FIKAFKA", FIKAFKA);
            map.put("MRSKAFKA", MRSKAFKA);
            map.put("FIHDFS", FIHDFS);
            map.put("FIHIVE", FIHIVE);
            map.put("GAUSS200", GAUSS200);
            map.put("GAUSS100", GAUSS100);
            map.put("LDAP", LDAP);
            map.put("DB2", DB2);
            map.put("TAURUS", TAURUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatasourceTypeEnum(String value) {
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
        public static DatasourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DatasourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatasourceTypeEnum(value);
            }
            return result;
        }

        public static DatasourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DatasourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatasourceTypeEnum) {
                return this.value.equals(((DatasourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private DatasourceTypeEnum datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    /**
     * 查询数据源排序的类型，增序还是降序，可为空
     */
    public static final class SortTypeEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final SortTypeEnum ASC = new SortTypeEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final SortTypeEnum DESC = new SortTypeEnum("DESC");

        private static final Map<String, SortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortTypeEnum> createStaticFields() {
            Map<String, SortTypeEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortTypeEnum(String value) {
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
        public static SortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortTypeEnum(value);
            }
            return result;
        }

        public static SortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortTypeEnum) {
                return this.value.equals(((SortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private SortTypeEnum sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_plugin_id")

    private String customPluginId;

    public ListDatasourcesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListDatasourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示条目数量，最大数量999，超过999后只返回999
     * minimum: 0
     * maximum: 999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDatasourcesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询，分页的偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDatasourcesRequest withDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型 - DWS - MYSQL - KAFKA - API - OBS - SAP - MRSHBASE - MRSHDFS - MRSHIVE - WEBSOCKET - SQLSERVER - ORACLE - POSTGRESQL - REDIS - MONGODB - DIS - HL7 - RABBITMQ - SNMP - IBMMQ - CUSTOMIZED (自定义类型) - ACTIVEMQ - ARTEMISMQ - FTP - HIVE - HANA - FIKAFKA - MRSKAFKA - FIHDFS - FIHIVE - GAUSS200 - GAUSS100 - LDAP - DB2 - TAURUS
     * @return datasourceType
     */
    public DatasourceTypeEnum getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
    }

    public ListDatasourcesRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段（CREATED_DATE）
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListDatasourcesRequest withSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 查询数据源排序的类型，增序还是降序，可为空
     * @return sortType
     */
    public SortTypeEnum getSortType() {
        return sortType;
    }

    public void setSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
    }

    public ListDatasourcesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据源名称,支持模糊匹配
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDatasourcesRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 集成应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListDatasourcesRequest withCustomPluginId(String customPluginId) {
        this.customPluginId = customPluginId;
        return this;
    }

    /**
     * 连接器ID
     * @return customPluginId
     */
    public String getCustomPluginId() {
        return customPluginId;
    }

    public void setCustomPluginId(String customPluginId) {
        this.customPluginId = customPluginId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatasourcesRequest listDatasourcesRequest = (ListDatasourcesRequest) o;
        return Objects.equals(this.instanceId, listDatasourcesRequest.instanceId)
            && Objects.equals(this.limit, listDatasourcesRequest.limit)
            && Objects.equals(this.offset, listDatasourcesRequest.offset)
            && Objects.equals(this.datasourceType, listDatasourcesRequest.datasourceType)
            && Objects.equals(this.sortField, listDatasourcesRequest.sortField)
            && Objects.equals(this.sortType, listDatasourcesRequest.sortType)
            && Objects.equals(this.name, listDatasourcesRequest.name)
            && Objects.equals(this.appId, listDatasourcesRequest.appId)
            && Objects.equals(this.customPluginId, listDatasourcesRequest.customPluginId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceId, limit, offset, datasourceType, sortField, sortType, name, appId, customPluginId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatasourcesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    customPluginId: ").append(toIndentedString(customPluginId)).append("\n");
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
