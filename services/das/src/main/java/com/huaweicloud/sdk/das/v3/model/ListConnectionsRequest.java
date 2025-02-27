package com.huaweicloud.sdk.das.v3.model;

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
public class ListConnectionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 数据库来源
     */
    public static final class NetworkTypeEnum {

        /**
         * Enum GAUSSDB for value: "gaussdb"
         */
        public static final NetworkTypeEnum GAUSSDB = new NetworkTypeEnum("gaussdb");

        /**
         * Enum DDS for value: "dds"
         */
        public static final NetworkTypeEnum DDS = new NetworkTypeEnum("dds");

        /**
         * Enum RDS for value: "rds"
         */
        public static final NetworkTypeEnum RDS = new NetworkTypeEnum("rds");

        /**
         * Enum ECS for value: "ecs"
         */
        public static final NetworkTypeEnum ECS = new NetworkTypeEnum("ecs");

        /**
         * Enum GEMINI for value: "gemini"
         */
        public static final NetworkTypeEnum GEMINI = new NetworkTypeEnum("gemini");

        /**
         * Enum DDM for value: "ddm"
         */
        public static final NetworkTypeEnum DDM = new NetworkTypeEnum("ddm");

        private static final Map<String, NetworkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkTypeEnum> createStaticFields() {
            Map<String, NetworkTypeEnum> map = new HashMap<>();
            map.put("gaussdb", GAUSSDB);
            map.put("dds", DDS);
            map.put("rds", RDS);
            map.put("ecs", ECS);
            map.put("gemini", GEMINI);
            map.put("ddm", DDM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkTypeEnum(String value) {
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
        public static NetworkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkTypeEnum(value));
        }

        public static NetworkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private NetworkTypeEnum networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    /**
     * 连接类型，NORMAL-创建的连接，SHARE-他人共享给我的连接。
     */
    public static final class ConnectionTypeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final ConnectionTypeEnum NORMAL = new ConnectionTypeEnum("NORMAL");

        /**
         * Enum SHARE for value: "SHARE"
         */
        public static final ConnectionTypeEnum SHARE = new ConnectionTypeEnum("SHARE");

        private static final Map<String, ConnectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConnectionTypeEnum> createStaticFields() {
            Map<String, ConnectionTypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("SHARE", SHARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConnectionTypeEnum(String value) {
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
        public static ConnectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConnectionTypeEnum(value));
        }

        public static ConnectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConnectionTypeEnum) {
                return this.value.equals(((ConnectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private ConnectionTypeEnum connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 请求语言类型。
     */
    public static final class XLanguageEnum {

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("en-us", EN_US);
            map.put("zh-cn", ZH_CN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    public ListConnectionsRequest withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 数据库实例地址/实例名称/备注等关键字
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ListConnectionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListConnectionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为100，不能为负数，最小值为1，最大值为200。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListConnectionsRequest withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 数据库来源
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public ListConnectionsRequest withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库引擎。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ListConnectionsRequest withConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * 连接类型，NORMAL-创建的连接，SHARE-他人共享给我的连接。
     * @return connectionType
     */
    public ConnectionTypeEnum getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
    }

    public ListConnectionsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListConnectionsRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionsRequest that = (ListConnectionsRequest) obj;
        return Objects.equals(this.condition, that.condition) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.xLanguage, that.xLanguage);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(condition, offset, limit, networkType, datastoreType, connectionType, instanceId, xLanguage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionsRequest {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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
