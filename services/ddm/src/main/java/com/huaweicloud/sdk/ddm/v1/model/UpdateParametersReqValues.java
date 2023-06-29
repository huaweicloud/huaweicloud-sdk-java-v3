package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 需要修改的DDM实例参数的集合。
 */
public class UpdateParametersReqValues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_table")

    private String bindTable;

    /**
     * DDM服务端字符集，如果需要存储emoji表情符号，请选择utf8mb4,并设置RDS字符集也为utf8mb4。修改DDM服务端字符集时，DDM服务端字符序必须同步修改为对应类型的值。
     */
    public static final class CharacterSetServerEnum {

        /**
         * Enum GBK for value: "gbk"
         */
        public static final CharacterSetServerEnum GBK = new CharacterSetServerEnum("gbk");

        /**
         * Enum UTF8 for value: "utf8"
         */
        public static final CharacterSetServerEnum UTF8 = new CharacterSetServerEnum("utf8");

        /**
         * Enum UTF8MB4 for value: "utf8mb4"
         */
        public static final CharacterSetServerEnum UTF8MB4 = new CharacterSetServerEnum("utf8mb4");

        private static final Map<String, CharacterSetServerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CharacterSetServerEnum> createStaticFields() {
            Map<String, CharacterSetServerEnum> map = new HashMap<>();
            map.put("gbk", GBK);
            map.put("utf8", UTF8);
            map.put("utf8mb4", UTF8MB4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CharacterSetServerEnum(String value) {
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
        public static CharacterSetServerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CharacterSetServerEnum(value));
        }

        public static CharacterSetServerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CharacterSetServerEnum) {
                return this.value.equals(((CharacterSetServerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_set_server")

    private CharacterSetServerEnum characterSetServer;

    /**
     * DDM服务端字符序。修改DDM服务端字符序时，DDM服务端字符集必须同步修改为对应类型的值。
     */
    public static final class CollationServerEnum {

        /**
         * Enum UTF8_UNICODE_CI for value: "utf8_unicode_ci"
         */
        public static final CollationServerEnum UTF8_UNICODE_CI = new CollationServerEnum("utf8_unicode_ci");

        /**
         * Enum UTF8_BIN for value: "utf8_bin"
         */
        public static final CollationServerEnum UTF8_BIN = new CollationServerEnum("utf8_bin");

        /**
         * Enum GBK_CHINESE_CI for value: "gbk_chinese_ci"
         */
        public static final CollationServerEnum GBK_CHINESE_CI = new CollationServerEnum("gbk_chinese_ci");

        /**
         * Enum GBK_BIN for value: "gbk_bin"
         */
        public static final CollationServerEnum GBK_BIN = new CollationServerEnum("gbk_bin");

        /**
         * Enum UTF8MB4_UNICODE_CI for value: "utf8mb4_unicode_ci"
         */
        public static final CollationServerEnum UTF8MB4_UNICODE_CI = new CollationServerEnum("utf8mb4_unicode_ci");

        /**
         * Enum UTF8MB4_BIN for value: "utf8mb4_bin"
         */
        public static final CollationServerEnum UTF8MB4_BIN = new CollationServerEnum("utf8mb4_bin");

        private static final Map<String, CollationServerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CollationServerEnum> createStaticFields() {
            Map<String, CollationServerEnum> map = new HashMap<>();
            map.put("utf8_unicode_ci", UTF8_UNICODE_CI);
            map.put("utf8_bin", UTF8_BIN);
            map.put("gbk_chinese_ci", GBK_CHINESE_CI);
            map.put("gbk_bin", GBK_BIN);
            map.put("utf8mb4_unicode_ci", UTF8MB4_UNICODE_CI);
            map.put("utf8mb4_bin", UTF8MB4_BIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CollationServerEnum(String value) {
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
        public static CollationServerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CollationServerEnum(value));
        }

        public static CollationServerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CollationServerEnum) {
                return this.value.equals(((CollationServerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collation_server")

    private CollationServerEnum collationServer;

    /**
     * 逻辑表扫描时的分片并发执行级别: DATA_NODE: 分库间并行扫描，同一分库内各分片串行扫描;RDS_INSTANCE: RDS实例间并行扫描，同一RDS实例内各分片串行扫描;PHY_TABLE: 各物理分片全部并行扫描。
     */
    public static final class ConcurrentExecutionLevelEnum {

        /**
         * Enum RDS_INSTANCE for value: "RDS_INSTANCE"
         */
        public static final ConcurrentExecutionLevelEnum RDS_INSTANCE =
            new ConcurrentExecutionLevelEnum("RDS_INSTANCE");

        /**
         * Enum DATA_NODE for value: "DATA_NODE"
         */
        public static final ConcurrentExecutionLevelEnum DATA_NODE = new ConcurrentExecutionLevelEnum("DATA_NODE");

        /**
         * Enum PHY_TABLE for value: "PHY_TABLE"
         */
        public static final ConcurrentExecutionLevelEnum PHY_TABLE = new ConcurrentExecutionLevelEnum("PHY_TABLE");

        private static final Map<String, ConcurrentExecutionLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConcurrentExecutionLevelEnum> createStaticFields() {
            Map<String, ConcurrentExecutionLevelEnum> map = new HashMap<>();
            map.put("RDS_INSTANCE", RDS_INSTANCE);
            map.put("DATA_NODE", DATA_NODE);
            map.put("PHY_TABLE", PHY_TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConcurrentExecutionLevelEnum(String value) {
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
        public static ConcurrentExecutionLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new ConcurrentExecutionLevelEnum(value));
        }

        public static ConcurrentExecutionLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConcurrentExecutionLevelEnum) {
                return this.value.equals(((ConcurrentExecutionLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent_execution_level")

    private ConcurrentExecutionLevelEnum concurrentExecutionLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_idle_timeout")

    private String connectionIdleTimeout;

    /**
     * 是否开启表回收站。
     */
    public static final class EnableTableRecycleEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final EnableTableRecycleEnum OFF = new EnableTableRecycleEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final EnableTableRecycleEnum ON = new EnableTableRecycleEnum("ON");

        private static final Map<String, EnableTableRecycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EnableTableRecycleEnum> createStaticFields() {
            Map<String, EnableTableRecycleEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EnableTableRecycleEnum(String value) {
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
        public static EnableTableRecycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EnableTableRecycleEnum(value));
        }

        public static EnableTableRecycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EnableTableRecycleEnum) {
                return this.value.equals(((EnableTableRecycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_table_recycle")

    private EnableTableRecycleEnum enableTableRecycle;

    /**
     * insert 常量值使用load data执行。
     */
    public static final class InsertToLoadDataEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final InsertToLoadDataEnum OFF = new InsertToLoadDataEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final InsertToLoadDataEnum ON = new InsertToLoadDataEnum("ON");

        private static final Map<String, InsertToLoadDataEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InsertToLoadDataEnum> createStaticFields() {
            Map<String, InsertToLoadDataEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InsertToLoadDataEnum(String value) {
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
        public static InsertToLoadDataEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InsertToLoadDataEnum(value));
        }

        public static InsertToLoadDataEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InsertToLoadDataEnum) {
                return this.value.equals(((InsertToLoadDataEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_to_load_data")

    private InsertToLoadDataEnum insertToLoadData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_transaction_timeout_on_shutdown")

    private String liveTransactionTimeoutOnShutdown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_query_time")

    private String longQueryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_allowed_packet")

    private String maxAllowedPacket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_backend_connections")

    private String maxBackendConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connections")

    private String maxConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_backend_connections")

    private String minBackendConnections;

    /**
     * 是否强制下推查询语句中不含from的语句。
     */
    public static final class NotFromPushdownEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final NotFromPushdownEnum OFF = new NotFromPushdownEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final NotFromPushdownEnum ON = new NotFromPushdownEnum("ON");

        private static final Map<String, NotFromPushdownEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotFromPushdownEnum> createStaticFields() {
            Map<String, NotFromPushdownEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotFromPushdownEnum(String value) {
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
        public static NotFromPushdownEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotFromPushdownEnum(value));
        }

        public static NotFromPushdownEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotFromPushdownEnum) {
                return this.value.equals(((NotFromPushdownEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_from_pushdown")

    private NotFromPushdownEnum notFromPushdown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seconds_behind_master")

    private String secondsBehindMaster;

    /**
     * 开启或关闭SQL审计。
     */
    public static final class SqlAuditEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final SqlAuditEnum OFF = new SqlAuditEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final SqlAuditEnum ON = new SqlAuditEnum("ON");

        private static final Map<String, SqlAuditEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SqlAuditEnum> createStaticFields() {
            Map<String, SqlAuditEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SqlAuditEnum(String value) {
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
        public static SqlAuditEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SqlAuditEnum(value));
        }

        public static SqlAuditEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SqlAuditEnum) {
                return this.value.equals(((SqlAuditEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_audit")

    private SqlAuditEnum sqlAudit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_execute_timeout")

    private String sqlExecuteTimeout;

    /**
     * DDL语句添加binlog hint。
     */
    public static final class SupportDdlBinlogHintEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final SupportDdlBinlogHintEnum OFF = new SupportDdlBinlogHintEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final SupportDdlBinlogHintEnum ON = new SupportDdlBinlogHintEnum("ON");

        private static final Map<String, SupportDdlBinlogHintEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportDdlBinlogHintEnum> createStaticFields() {
            Map<String, SupportDdlBinlogHintEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportDdlBinlogHintEnum(String value) {
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
        public static SupportDdlBinlogHintEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportDdlBinlogHintEnum(value));
        }

        public static SupportDdlBinlogHintEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportDdlBinlogHintEnum) {
                return this.value.equals(((SupportDdlBinlogHintEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ddl_binlog_hint")

    private SupportDdlBinlogHintEnum supportDdlBinlogHint;

    /**
     * XA：XA 事务，保证原子性，保证可见性；FREE：允许多写，不保证原子性，无性能损耗；NO_DTX：单分片事务。
     */
    public static final class TransactionPolicyEnum {

        /**
         * Enum XA for value: "XA"
         */
        public static final TransactionPolicyEnum XA = new TransactionPolicyEnum("XA");

        /**
         * Enum FREE for value: "FREE"
         */
        public static final TransactionPolicyEnum FREE = new TransactionPolicyEnum("FREE");

        /**
         * Enum NO_DTX for value: "NO_DTX"
         */
        public static final TransactionPolicyEnum NO_DTX = new TransactionPolicyEnum("NO_DTX");

        private static final Map<String, TransactionPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TransactionPolicyEnum> createStaticFields() {
            Map<String, TransactionPolicyEnum> map = new HashMap<>();
            map.put("XA", XA);
            map.put("FREE", FREE);
            map.put("NO_DTX", NO_DTX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TransactionPolicyEnum(String value) {
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
        public static TransactionPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TransactionPolicyEnum(value));
        }

        public static TransactionPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransactionPolicyEnum) {
                return this.value.equals(((TransactionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_policy")

    private TransactionPolicyEnum transactionPolicy;

    /**
     * 开启或关闭优化器中的极致下推优化功能。
     */
    public static final class UltimateOptimizeEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final UltimateOptimizeEnum OFF = new UltimateOptimizeEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final UltimateOptimizeEnum ON = new UltimateOptimizeEnum("ON");

        private static final Map<String, UltimateOptimizeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UltimateOptimizeEnum> createStaticFields() {
            Map<String, UltimateOptimizeEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UltimateOptimizeEnum(String value) {
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
        public static UltimateOptimizeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UltimateOptimizeEnum(value));
        }

        public static UltimateOptimizeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UltimateOptimizeEnum) {
                return this.value.equals(((UltimateOptimizeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ultimate_optimize")

    private UltimateOptimizeEnum ultimateOptimize;

    public UpdateParametersReqValues withBindTable(String bindTable) {
        this.bindTable = bindTable;
        return this;
    }

    /**
     * 用于描述多个拆分表的内在数据关联性，用于告知优化器在处理join时，把join下推到MySQL层执行。格式为:[{tb.col1,tb2.col2},{tb.col2,tb3.col1},...]。
     * @return bindTable
     */
    public String getBindTable() {
        return bindTable;
    }

    public void setBindTable(String bindTable) {
        this.bindTable = bindTable;
    }

    public UpdateParametersReqValues withCharacterSetServer(CharacterSetServerEnum characterSetServer) {
        this.characterSetServer = characterSetServer;
        return this;
    }

    /**
     * DDM服务端字符集，如果需要存储emoji表情符号，请选择utf8mb4,并设置RDS字符集也为utf8mb4。修改DDM服务端字符集时，DDM服务端字符序必须同步修改为对应类型的值。
     * @return characterSetServer
     */
    public CharacterSetServerEnum getCharacterSetServer() {
        return characterSetServer;
    }

    public void setCharacterSetServer(CharacterSetServerEnum characterSetServer) {
        this.characterSetServer = characterSetServer;
    }

    public UpdateParametersReqValues withCollationServer(CollationServerEnum collationServer) {
        this.collationServer = collationServer;
        return this;
    }

    /**
     * DDM服务端字符序。修改DDM服务端字符序时，DDM服务端字符集必须同步修改为对应类型的值。
     * @return collationServer
     */
    public CollationServerEnum getCollationServer() {
        return collationServer;
    }

    public void setCollationServer(CollationServerEnum collationServer) {
        this.collationServer = collationServer;
    }

    public UpdateParametersReqValues withConcurrentExecutionLevel(
        ConcurrentExecutionLevelEnum concurrentExecutionLevel) {
        this.concurrentExecutionLevel = concurrentExecutionLevel;
        return this;
    }

    /**
     * 逻辑表扫描时的分片并发执行级别: DATA_NODE: 分库间并行扫描，同一分库内各分片串行扫描;RDS_INSTANCE: RDS实例间并行扫描，同一RDS实例内各分片串行扫描;PHY_TABLE: 各物理分片全部并行扫描。
     * @return concurrentExecutionLevel
     */
    public ConcurrentExecutionLevelEnum getConcurrentExecutionLevel() {
        return concurrentExecutionLevel;
    }

    public void setConcurrentExecutionLevel(ConcurrentExecutionLevelEnum concurrentExecutionLevel) {
        this.concurrentExecutionLevel = concurrentExecutionLevel;
    }

    public UpdateParametersReqValues withConnectionIdleTimeout(String connectionIdleTimeout) {
        this.connectionIdleTimeout = connectionIdleTimeout;
        return this;
    }

    /**
     * 服务器关闭连接之前等待连接活动的秒数，以秒为单位，取值范围为60-28800，默认值28800，表示服务器关闭连接之前等待28800秒后，关闭连接。
     * @return connectionIdleTimeout
     */
    public String getConnectionIdleTimeout() {
        return connectionIdleTimeout;
    }

    public void setConnectionIdleTimeout(String connectionIdleTimeout) {
        this.connectionIdleTimeout = connectionIdleTimeout;
    }

    public UpdateParametersReqValues withEnableTableRecycle(EnableTableRecycleEnum enableTableRecycle) {
        this.enableTableRecycle = enableTableRecycle;
        return this;
    }

    /**
     * 是否开启表回收站。
     * @return enableTableRecycle
     */
    public EnableTableRecycleEnum getEnableTableRecycle() {
        return enableTableRecycle;
    }

    public void setEnableTableRecycle(EnableTableRecycleEnum enableTableRecycle) {
        this.enableTableRecycle = enableTableRecycle;
    }

    public UpdateParametersReqValues withInsertToLoadData(InsertToLoadDataEnum insertToLoadData) {
        this.insertToLoadData = insertToLoadData;
        return this;
    }

    /**
     * insert 常量值使用load data执行。
     * @return insertToLoadData
     */
    public InsertToLoadDataEnum getInsertToLoadData() {
        return insertToLoadData;
    }

    public void setInsertToLoadData(InsertToLoadDataEnum insertToLoadData) {
        this.insertToLoadData = insertToLoadData;
    }

    public UpdateParametersReqValues withLiveTransactionTimeoutOnShutdown(String liveTransactionTimeoutOnShutdown) {
        this.liveTransactionTimeoutOnShutdown = liveTransactionTimeoutOnShutdown;
        return this;
    }

    /**
     * 在途事务等待时间窗口，以秒为单位，取值范围为0-100，默认值为1，表示服务器关闭前端连接之前等待1秒后关闭连接。
     * @return liveTransactionTimeoutOnShutdown
     */
    public String getLiveTransactionTimeoutOnShutdown() {
        return liveTransactionTimeoutOnShutdown;
    }

    public void setLiveTransactionTimeoutOnShutdown(String liveTransactionTimeoutOnShutdown) {
        this.liveTransactionTimeoutOnShutdown = liveTransactionTimeoutOnShutdown;
    }

    public UpdateParametersReqValues withLongQueryTime(String longQueryTime) {
        this.longQueryTime = longQueryTime;
        return this;
    }

    /**
     * 记录慢查询的最小秒数,以秒为单位，取值范围为0.01-10，默认值为1，表示如果sql执行大于等于1秒就定义为慢sql。
     * @return longQueryTime
     */
    public String getLongQueryTime() {
        return longQueryTime;
    }

    public void setLongQueryTime(String longQueryTime) {
        this.longQueryTime = longQueryTime;
    }

    public UpdateParametersReqValues withMaxAllowedPacket(String maxAllowedPacket) {
        this.maxAllowedPacket = maxAllowedPacket;
        return this;
    }

    /**
     * 包或任何生成的中间字符串的最大值。包缓冲区初始化为net_buffer_length字节，但需要时可以增长到max_allowed_packet字节。该值默认很小，以捕获大的（可能是错误的）数据包。该值必须设置为1024的倍数。取值范围为1024~1073741824，默认值为16777216。
     * @return maxAllowedPacket
     */
    public String getMaxAllowedPacket() {
        return maxAllowedPacket;
    }

    public void setMaxAllowedPacket(String maxAllowedPacket) {
        this.maxAllowedPacket = maxAllowedPacket;
    }

    public UpdateParametersReqValues withMaxBackendConnections(String maxBackendConnections) {
        this.maxBackendConnections = maxBackendConnections;
        return this;
    }

    /**
     * 允许每个DDM节点同时连接RDS的最大客户端总数。0为默认值标识符,实际值等于(RDS的最大连接数-20)/DDM节点数。取值范围为0-10000000。
     * @return maxBackendConnections
     */
    public String getMaxBackendConnections() {
        return maxBackendConnections;
    }

    public void setMaxBackendConnections(String maxBackendConnections) {
        this.maxBackendConnections = maxBackendConnections;
    }

    public UpdateParametersReqValues withMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    /**
     * 允许同时连接的客户端总数。与后端RDS规格及数量有关。以个数为单位，取值范围为10-40000，默认值为20000，表示允许同时连接的客户端总数不能超过40000。
     * @return maxConnections
     */
    public String getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
    }

    public UpdateParametersReqValues withMinBackendConnections(String minBackendConnections) {
        this.minBackendConnections = minBackendConnections;
        return this;
    }

    /**
     * 允许每个DDM节点同时连接RDS的最小客户端总数。默认值为10。取值范围为0-10000000。
     * @return minBackendConnections
     */
    public String getMinBackendConnections() {
        return minBackendConnections;
    }

    public void setMinBackendConnections(String minBackendConnections) {
        this.minBackendConnections = minBackendConnections;
    }

    public UpdateParametersReqValues withNotFromPushdown(NotFromPushdownEnum notFromPushdown) {
        this.notFromPushdown = notFromPushdown;
        return this;
    }

    /**
     * 是否强制下推查询语句中不含from的语句。
     * @return notFromPushdown
     */
    public NotFromPushdownEnum getNotFromPushdown() {
        return notFromPushdown;
    }

    public void setNotFromPushdown(NotFromPushdownEnum notFromPushdown) {
        this.notFromPushdown = notFromPushdown;
    }

    public UpdateParametersReqValues withSecondsBehindMaster(String secondsBehindMaster) {
        this.secondsBehindMaster = secondsBehindMaster;
        return this;
    }

    /**
     * 主从rds节点延迟时间阈值，以秒为单位，取值范围为0-7200，默认值为30，表示主rds与从rds之间的数据同步时间值不能超过30秒，如果超过30s，读数据指令就不走当前读节点。
     * @return secondsBehindMaster
     */
    public String getSecondsBehindMaster() {
        return secondsBehindMaster;
    }

    public void setSecondsBehindMaster(String secondsBehindMaster) {
        this.secondsBehindMaster = secondsBehindMaster;
    }

    public UpdateParametersReqValues withSqlAudit(SqlAuditEnum sqlAudit) {
        this.sqlAudit = sqlAudit;
        return this;
    }

    /**
     * 开启或关闭SQL审计。
     * @return sqlAudit
     */
    public SqlAuditEnum getSqlAudit() {
        return sqlAudit;
    }

    public void setSqlAudit(SqlAuditEnum sqlAudit) {
        this.sqlAudit = sqlAudit;
    }

    public UpdateParametersReqValues withSqlExecuteTimeout(String sqlExecuteTimeout) {
        this.sqlExecuteTimeout = sqlExecuteTimeout;
        return this;
    }

    /**
     * SQL执行超时秒数，以秒为单位，取值范围为100-28800，默认值28800，表示sql执行大于等于28800秒超时。
     * @return sqlExecuteTimeout
     */
    public String getSqlExecuteTimeout() {
        return sqlExecuteTimeout;
    }

    public void setSqlExecuteTimeout(String sqlExecuteTimeout) {
        this.sqlExecuteTimeout = sqlExecuteTimeout;
    }

    public UpdateParametersReqValues withSupportDdlBinlogHint(SupportDdlBinlogHintEnum supportDdlBinlogHint) {
        this.supportDdlBinlogHint = supportDdlBinlogHint;
        return this;
    }

    /**
     * DDL语句添加binlog hint。
     * @return supportDdlBinlogHint
     */
    public SupportDdlBinlogHintEnum getSupportDdlBinlogHint() {
        return supportDdlBinlogHint;
    }

    public void setSupportDdlBinlogHint(SupportDdlBinlogHintEnum supportDdlBinlogHint) {
        this.supportDdlBinlogHint = supportDdlBinlogHint;
    }

    public UpdateParametersReqValues withTransactionPolicy(TransactionPolicyEnum transactionPolicy) {
        this.transactionPolicy = transactionPolicy;
        return this;
    }

    /**
     * XA：XA 事务，保证原子性，保证可见性；FREE：允许多写，不保证原子性，无性能损耗；NO_DTX：单分片事务。
     * @return transactionPolicy
     */
    public TransactionPolicyEnum getTransactionPolicy() {
        return transactionPolicy;
    }

    public void setTransactionPolicy(TransactionPolicyEnum transactionPolicy) {
        this.transactionPolicy = transactionPolicy;
    }

    public UpdateParametersReqValues withUltimateOptimize(UltimateOptimizeEnum ultimateOptimize) {
        this.ultimateOptimize = ultimateOptimize;
        return this;
    }

    /**
     * 开启或关闭优化器中的极致下推优化功能。
     * @return ultimateOptimize
     */
    public UltimateOptimizeEnum getUltimateOptimize() {
        return ultimateOptimize;
    }

    public void setUltimateOptimize(UltimateOptimizeEnum ultimateOptimize) {
        this.ultimateOptimize = ultimateOptimize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateParametersReqValues that = (UpdateParametersReqValues) obj;
        return Objects.equals(this.bindTable, that.bindTable)
            && Objects.equals(this.characterSetServer, that.characterSetServer)
            && Objects.equals(this.collationServer, that.collationServer)
            && Objects.equals(this.concurrentExecutionLevel, that.concurrentExecutionLevel)
            && Objects.equals(this.connectionIdleTimeout, that.connectionIdleTimeout)
            && Objects.equals(this.enableTableRecycle, that.enableTableRecycle)
            && Objects.equals(this.insertToLoadData, that.insertToLoadData)
            && Objects.equals(this.liveTransactionTimeoutOnShutdown, that.liveTransactionTimeoutOnShutdown)
            && Objects.equals(this.longQueryTime, that.longQueryTime)
            && Objects.equals(this.maxAllowedPacket, that.maxAllowedPacket)
            && Objects.equals(this.maxBackendConnections, that.maxBackendConnections)
            && Objects.equals(this.maxConnections, that.maxConnections)
            && Objects.equals(this.minBackendConnections, that.minBackendConnections)
            && Objects.equals(this.notFromPushdown, that.notFromPushdown)
            && Objects.equals(this.secondsBehindMaster, that.secondsBehindMaster)
            && Objects.equals(this.sqlAudit, that.sqlAudit)
            && Objects.equals(this.sqlExecuteTimeout, that.sqlExecuteTimeout)
            && Objects.equals(this.supportDdlBinlogHint, that.supportDdlBinlogHint)
            && Objects.equals(this.transactionPolicy, that.transactionPolicy)
            && Objects.equals(this.ultimateOptimize, that.ultimateOptimize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindTable,
            characterSetServer,
            collationServer,
            concurrentExecutionLevel,
            connectionIdleTimeout,
            enableTableRecycle,
            insertToLoadData,
            liveTransactionTimeoutOnShutdown,
            longQueryTime,
            maxAllowedPacket,
            maxBackendConnections,
            maxConnections,
            minBackendConnections,
            notFromPushdown,
            secondsBehindMaster,
            sqlAudit,
            sqlExecuteTimeout,
            supportDdlBinlogHint,
            transactionPolicy,
            ultimateOptimize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateParametersReqValues {\n");
        sb.append("    bindTable: ").append(toIndentedString(bindTable)).append("\n");
        sb.append("    characterSetServer: ").append(toIndentedString(characterSetServer)).append("\n");
        sb.append("    collationServer: ").append(toIndentedString(collationServer)).append("\n");
        sb.append("    concurrentExecutionLevel: ").append(toIndentedString(concurrentExecutionLevel)).append("\n");
        sb.append("    connectionIdleTimeout: ").append(toIndentedString(connectionIdleTimeout)).append("\n");
        sb.append("    enableTableRecycle: ").append(toIndentedString(enableTableRecycle)).append("\n");
        sb.append("    insertToLoadData: ").append(toIndentedString(insertToLoadData)).append("\n");
        sb.append("    liveTransactionTimeoutOnShutdown: ")
            .append(toIndentedString(liveTransactionTimeoutOnShutdown))
            .append("\n");
        sb.append("    longQueryTime: ").append(toIndentedString(longQueryTime)).append("\n");
        sb.append("    maxAllowedPacket: ").append(toIndentedString(maxAllowedPacket)).append("\n");
        sb.append("    maxBackendConnections: ").append(toIndentedString(maxBackendConnections)).append("\n");
        sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
        sb.append("    minBackendConnections: ").append(toIndentedString(minBackendConnections)).append("\n");
        sb.append("    notFromPushdown: ").append(toIndentedString(notFromPushdown)).append("\n");
        sb.append("    secondsBehindMaster: ").append(toIndentedString(secondsBehindMaster)).append("\n");
        sb.append("    sqlAudit: ").append(toIndentedString(sqlAudit)).append("\n");
        sb.append("    sqlExecuteTimeout: ").append(toIndentedString(sqlExecuteTimeout)).append("\n");
        sb.append("    supportDdlBinlogHint: ").append(toIndentedString(supportDdlBinlogHint)).append("\n");
        sb.append("    transactionPolicy: ").append(toIndentedString(transactionPolicy)).append("\n");
        sb.append("    ultimateOptimize: ").append(toIndentedString(ultimateOptimize)).append("\n");
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
