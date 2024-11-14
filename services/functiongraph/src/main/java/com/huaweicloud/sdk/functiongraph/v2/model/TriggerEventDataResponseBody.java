package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 触发器源事件。
 */
public class TriggerEventDataResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 定时触发类型（TIMER触发器参数）。 - Rate：指定固定频率（分钟、小时、天数）定期调用函数，单位为分钟时，输入值不能超过60；单位为小时时，输入值不能超过24；单位为天时，输入值不能超过30。 - Cron：指定Cron表达式定期调用函数
     */
    public static final class ScheduleTypeEnum {

        /**
         * Enum RATE for value: "Rate"
         */
        public static final ScheduleTypeEnum RATE = new ScheduleTypeEnum("Rate");

        /**
         * Enum CRON for value: "Cron"
         */
        public static final ScheduleTypeEnum CRON = new ScheduleTypeEnum("Cron");

        private static final Map<String, ScheduleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduleTypeEnum> createStaticFields() {
            Map<String, ScheduleTypeEnum> map = new HashMap<>();
            map.put("Rate", RATE);
            map.put("Cron", CRON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScheduleTypeEnum(String value) {
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
        public static ScheduleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduleTypeEnum(value));
        }

        public static ScheduleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScheduleTypeEnum) {
                return this.value.equals(((ScheduleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private ScheduleTypeEnum scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_event")

    private String userEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggerid")

    private String triggerid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    /**
     * API的请求协议（APIG触发器参数）。
     */
    public static final class ProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    /**
     * API的请求方式（APIG触发器参数）。
     */
    public static final class ReqMethodEnum {

        /**
         * Enum GET for value: "GET"
         */
        public static final ReqMethodEnum GET = new ReqMethodEnum("GET");

        /**
         * Enum POST for value: "POST"
         */
        public static final ReqMethodEnum POST = new ReqMethodEnum("POST");

        /**
         * Enum PUT for value: "PUT"
         */
        public static final ReqMethodEnum PUT = new ReqMethodEnum("PUT");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ReqMethodEnum DELETE = new ReqMethodEnum("DELETE");

        /**
         * Enum HEAD for value: "HEAD"
         */
        public static final ReqMethodEnum HEAD = new ReqMethodEnum("HEAD");

        /**
         * Enum PATCH for value: "PATCH"
         */
        public static final ReqMethodEnum PATCH = new ReqMethodEnum("PATCH");

        /**
         * Enum OPTIONS for value: "OPTIONS"
         */
        public static final ReqMethodEnum OPTIONS = new ReqMethodEnum("OPTIONS");

        /**
         * Enum ANY for value: "ANY"
         */
        public static final ReqMethodEnum ANY = new ReqMethodEnum("ANY");

        private static final Map<String, ReqMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReqMethodEnum> createStaticFields() {
            Map<String, ReqMethodEnum> map = new HashMap<>();
            map.put("GET", GET);
            map.put("POST", POST);
            map.put("PUT", PUT);
            map.put("DELETE", DELETE);
            map.put("HEAD", HEAD);
            map.put("PATCH", PATCH);
            map.put("OPTIONS", OPTIONS);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReqMethodEnum(String value) {
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
        public static ReqMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReqMethodEnum(value));
        }

        public static ReqMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReqMethodEnum) {
                return this.value.equals(((ReqMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_method")

    private ReqMethodEnum reqMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    /**
     * API的匹配方式（APIG触发器参数）。 - SWA：前缀匹配 - NORMAL：正常匹配（绝对匹配）
     */
    public static final class MatchModeEnum {

        /**
         * Enum SWA for value: "SWA"
         */
        public static final MatchModeEnum SWA = new MatchModeEnum("SWA");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final MatchModeEnum NORMAL = new MatchModeEnum("NORMAL");

        private static final Map<String, MatchModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MatchModeEnum> createStaticFields() {
            Map<String, MatchModeEnum> map = new HashMap<>();
            map.put("SWA", SWA);
            map.put("NORMAL", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MatchModeEnum(String value) {
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
        public static MatchModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MatchModeEnum(value));
        }

        public static MatchModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MatchModeEnum) {
                return this.value.equals(((MatchModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_mode")

    private MatchModeEnum matchMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    /**
     * API的认证方式（APIG触发器参数）。 - IAM：IAM认证，只允许IAM用户能访问，安全级别中等 - APP：采用Appkey&Appsecret认证，安全级别高，推荐使用 - NONE：无认证模式，所有用户均可访问，不推荐使用
     */
    public static final class AuthEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final AuthEnum IAM = new AuthEnum("IAM");

        /**
         * Enum APP for value: "APP"
         */
        public static final AuthEnum APP = new AuthEnum("APP");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthEnum NONE = new AuthEnum("NONE");

        private static final Map<String, AuthEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthEnum> createStaticFields() {
            Map<String, AuthEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("APP", APP);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthEnum(String value) {
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
        public static AuthEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthEnum(value));
        }

        public static AuthEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthEnum) {
                return this.value.equals(((AuthEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private AuthEnum auth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_url")

    private String invokeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_info")

    private ApigTriggerFuncInfo funcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sl_domain")

    private String slDomain;

    /**
     * API的后端类型（APIG触发器参数）。
     */
    public static final class BackendTypeEnum {

        /**
         * Enum FUNCTION for value: "FUNCTION"
         */
        public static final BackendTypeEnum FUNCTION = new BackendTypeEnum("FUNCTION");

        private static final Map<String, BackendTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackendTypeEnum> createStaticFields() {
            Map<String, BackendTypeEnum> map = new HashMap<>();
            map.put("FUNCTION", FUNCTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackendTypeEnum(String value) {
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
        public static BackendTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BackendTypeEnum(value));
        }

        public static BackendTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackendTypeEnum) {
                return this.value.equals(((BackendTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_type")

    private BackendTypeEnum backendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private List<String> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_name")

    private String collectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    private String dbPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_addrs")

    private List<String> instanceAddrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_size")

    private Integer batchSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private String queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_group_id")

    private String consumerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polling_interval")

    private Integer pollingInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    /**
     * 起始位置（DIS触发器参数）。 - TRIM_HORIZON：从最早被存储至分区的有效记录开始读取。 - LATEST：从分区中的最新记录开始读取，此设置可以保证总是读到分区中最新记录。
     */
    public static final class SharditeratorTypeEnum {

        /**
         * Enum TRIM_HORIZON for value: "TRIM_HORIZON"
         */
        public static final SharditeratorTypeEnum TRIM_HORIZON = new SharditeratorTypeEnum("TRIM_HORIZON");

        /**
         * Enum LATEST for value: "LATEST"
         */
        public static final SharditeratorTypeEnum LATEST = new SharditeratorTypeEnum("LATEST");

        private static final Map<String, SharditeratorTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharditeratorTypeEnum> createStaticFields() {
            Map<String, SharditeratorTypeEnum> map = new HashMap<>();
            map.put("TRIM_HORIZON", TRIM_HORIZON);
            map.put("LATEST", LATEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SharditeratorTypeEnum(String value) {
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
        public static SharditeratorTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SharditeratorTypeEnum(value));
        }

        public static SharditeratorTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SharditeratorTypeEnum) {
                return this.value.equals(((SharditeratorTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharditerator_type")

    private SharditeratorTypeEnum sharditeratorType;

    /**
     * 拉取周期单位（DIS触发器参数）。 - s：秒 - ms：毫秒
     */
    public static final class PollingUnitEnum {

        /**
         * Enum S for value: "s"
         */
        public static final PollingUnitEnum S = new PollingUnitEnum("s");

        /**
         * Enum MS for value: "ms"
         */
        public static final PollingUnitEnum MS = new PollingUnitEnum("ms");

        private static final Map<String, PollingUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PollingUnitEnum> createStaticFields() {
            Map<String, PollingUnitEnum> map = new HashMap<>();
            map.put("s", S);
            map.put("ms", MS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PollingUnitEnum(String value) {
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
        public static PollingUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PollingUnitEnum(value));
        }

        public static PollingUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PollingUnitEnum) {
                return this.value.equals(((PollingUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polling_unit")

    private PollingUnitEnum pollingUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_fetch_bytes")

    private Integer maxFetchBytes;

    /**
     * 串行处理数据（DIS触发器参数），如果开启该选项，取一次数据处理完之后才会取下一次数据；否则只要拉取周期到了就会取数据进行处理。
     */
    public static final class IsSerialEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsSerialEnum TRUE = new IsSerialEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsSerialEnum FALSE = new IsSerialEnum("false");

        private static final Map<String, IsSerialEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsSerialEnum> createStaticFields() {
            Map<String, IsSerialEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsSerialEnum(String value) {
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
        public static IsSerialEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsSerialEnum(value));
        }

        public static IsSerialEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsSerialEnum) {
                return this.value.equals(((IsSerialEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_serial")

    private IsSerialEnum isSerial;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private String logTopicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix")

    private String suffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<String> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_ids")

    private List<String> topicIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_user")

    private String kafkaUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_password")

    private String kafkaPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_connect_address")

    private String kafkaConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_ssl_enable")

    private Boolean kafkaSslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_password")

    private String accessPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_user")

    private String accessUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_address")

    private String connectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exchange_name")

    private String exchangeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Key_encode")

    private Boolean keyEncode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    /**
     * 触发器状态（EVENTGRID触发器参数）。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final StatusEnum DISABLE = new StatusEnum("DISABLE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DISABLE", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_name")

    private String triggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_types")

    private List<String> eventTypes = null;

    public TriggerEventDataResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 触发器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TriggerEventDataResponseBody withScheduleType(ScheduleTypeEnum scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * 定时触发类型（TIMER触发器参数）。 - Rate：指定固定频率（分钟、小时、天数）定期调用函数，单位为分钟时，输入值不能超过60；单位为小时时，输入值不能超过24；单位为天时，输入值不能超过30。 - Cron：指定Cron表达式定期调用函数
     * @return scheduleType
     */
    public ScheduleTypeEnum getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(ScheduleTypeEnum scheduleType) {
        this.scheduleType = scheduleType;
    }

    public TriggerEventDataResponseBody withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 定时触发规则（TIMER触发器参数）。 - 触发类型为Rate时对应定时规则 - 触发类型为Cron时对应Cron表达式
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public TriggerEventDataResponseBody withUserEvent(String userEvent) {
        this.userEvent = userEvent;
        return this;
    }

    /**
     * 附加信息（TIMER触发器参数）。 当Timer触发器触发函数执行时，执行事件（函数的event参数）为： {\"version\": \"v1.0\",   \"time\": \"2018-06-01T08:30:00+08:00\",   \"trigger_type\": \"TIMER\",   \"trigger_name\": \"Timer_001\",   \"user_event\": \"您输入的附加信息\"}
     * @return userEvent
     */
    public String getUserEvent() {
        return userEvent;
    }

    public void setUserEvent(String userEvent) {
        this.userEvent = userEvent;
    }

    public TriggerEventDataResponseBody withTriggerid(String triggerid) {
        this.triggerid = triggerid;
        return this;
    }

    /**
     * APIG触发器id。（APIG触发器参数）
     * @return triggerid
     */
    public String getTriggerid() {
        return triggerid;
    }

    public void setTriggerid(String triggerid) {
        this.triggerid = triggerid;
    }

    public TriggerEventDataResponseBody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * API接口类型（APIG触发器参数）。 - 1：公有API - 2：私有API
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public TriggerEventDataResponseBody withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * APIG接口PATH路径（APIG触发器参数）。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TriggerEventDataResponseBody withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * API的请求协议（APIG触发器参数）。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public TriggerEventDataResponseBody withReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    /**
     * API的请求方式（APIG触发器参数）。
     * @return reqMethod
     */
    public ReqMethodEnum getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
    }

    public TriggerEventDataResponseBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API所属的分组编号（APIG触发器参数）。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public TriggerEventDataResponseBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * API所属的分组名称（APIG触发器参数）。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public TriggerEventDataResponseBody withMatchMode(MatchModeEnum matchMode) {
        this.matchMode = matchMode;
        return this;
    }

    /**
     * API的匹配方式（APIG触发器参数）。 - SWA：前缀匹配 - NORMAL：正常匹配（绝对匹配）
     * @return matchMode
     */
    public MatchModeEnum getMatchMode() {
        return matchMode;
    }

    public void setMatchMode(MatchModeEnum matchMode) {
        this.matchMode = matchMode;
    }

    public TriggerEventDataResponseBody withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * API的发布环境（APIG触发器参数）。
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public TriggerEventDataResponseBody withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * API的发布环境id（APIG触发器参数）。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public TriggerEventDataResponseBody withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API编号（APIG触发器参数）。
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public TriggerEventDataResponseBody withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * API名称（APIG触发器参数）。
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public TriggerEventDataResponseBody withAuth(AuthEnum auth) {
        this.auth = auth;
        return this;
    }

    /**
     * API的认证方式（APIG触发器参数）。 - IAM：IAM认证，只允许IAM用户能访问，安全级别中等 - APP：采用Appkey&Appsecret认证，安全级别高，推荐使用 - NONE：无认证模式，所有用户均可访问，不推荐使用
     * @return auth
     */
    public AuthEnum getAuth() {
        return auth;
    }

    public void setAuth(AuthEnum auth) {
        this.auth = auth;
    }

    public TriggerEventDataResponseBody withInvokeUrl(String invokeUrl) {
        this.invokeUrl = invokeUrl;
        return this;
    }

    /**
     * API调用地址（APIG触发器参数）。
     * @return invokeUrl
     */
    public String getInvokeUrl() {
        return invokeUrl;
    }

    public void setInvokeUrl(String invokeUrl) {
        this.invokeUrl = invokeUrl;
    }

    public TriggerEventDataResponseBody withFuncInfo(ApigTriggerFuncInfo funcInfo) {
        this.funcInfo = funcInfo;
        return this;
    }

    public TriggerEventDataResponseBody withFuncInfo(Consumer<ApigTriggerFuncInfo> funcInfoSetter) {
        if (this.funcInfo == null) {
            this.funcInfo = new ApigTriggerFuncInfo();
            funcInfoSetter.accept(this.funcInfo);
        }

        return this;
    }

    /**
     * Get funcInfo
     * @return funcInfo
     */
    public ApigTriggerFuncInfo getFuncInfo() {
        return funcInfo;
    }

    public void setFuncInfo(ApigTriggerFuncInfo funcInfo) {
        this.funcInfo = funcInfo;
    }

    public TriggerEventDataResponseBody withSlDomain(String slDomain) {
        this.slDomain = slDomain;
        return this;
    }

    /**
     * APIG系统默认分配的子域名（APIG触发器参数）。
     * @return slDomain
     */
    public String getSlDomain() {
        return slDomain;
    }

    public void setSlDomain(String slDomain) {
        this.slDomain = slDomain;
    }

    public TriggerEventDataResponseBody withBackendType(BackendTypeEnum backendType) {
        this.backendType = backendType;
        return this;
    }

    /**
     * API的后端类型（APIG触发器参数）。
     * @return backendType
     */
    public BackendTypeEnum getBackendType() {
        return backendType;
    }

    public void setBackendType(BackendTypeEnum backendType) {
        this.backendType = backendType;
    }

    public TriggerEventDataResponseBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。DDS、KAFKA、RABBITMQ触发器此参数必填。 - APIG触发器：apig实例id - DDS触发器：文档数据库实例id - KAFKA触发器：KAFKA实例id - RABBITMQ触发器：RABBITMQ实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public TriggerEventDataResponseBody withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /**
     * API归属的集成应用编号。（APIG触发器参数）
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public TriggerEventDataResponseBody withOperations(List<String> operations) {
        this.operations = operations;
        return this;
    }

    public TriggerEventDataResponseBody addOperationsItem(String operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public TriggerEventDataResponseBody withOperations(Consumer<List<String>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    /**
     * 自定义操作（CTS触发器参数）。 CTS云审计服务类型和操作订阅所需要的事件通知，当CTS云审计服务获取已订阅的操作记录后，通过CTS触发器将采集到的操作记录作为参数传递来调用FunctionGraph函数。
     * @return operations
     */
    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    public TriggerEventDataResponseBody withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * 集合名称（DDS触发器参数）。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public TriggerEventDataResponseBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 文档数据库名称（DDS触发器参数）。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public TriggerEventDataResponseBody withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * 文档数据库密码（DDS触发器参数）。
     * @return dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public TriggerEventDataResponseBody withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 文档数据库用户名（DDS触发器参数）。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public TriggerEventDataResponseBody withInstanceAddrs(List<String> instanceAddrs) {
        this.instanceAddrs = instanceAddrs;
        return this;
    }

    public TriggerEventDataResponseBody addInstanceAddrsItem(String instanceAddrsItem) {
        if (this.instanceAddrs == null) {
            this.instanceAddrs = new ArrayList<>();
        }
        this.instanceAddrs.add(instanceAddrsItem);
        return this;
    }

    public TriggerEventDataResponseBody withInstanceAddrs(Consumer<List<String>> instanceAddrsSetter) {
        if (this.instanceAddrs == null) {
            this.instanceAddrs = new ArrayList<>();
        }
        instanceAddrsSetter.accept(this.instanceAddrs);
        return this;
    }

    /**
     * 文档数据库实例地址（DDS触发器参数）。
     * @return instanceAddrs
     */
    public List<String> getInstanceAddrs() {
        return instanceAddrs;
    }

    public void setInstanceAddrs(List<String> instanceAddrs) {
        this.instanceAddrs = instanceAddrs;
    }

    public TriggerEventDataResponseBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 文档数据库实例类型（DDS触发器参数）。 - Sharding：集群实例 - ReplicaSet：副本集实例 - Single：单节点实例
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public TriggerEventDataResponseBody withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * 批处理大小，单次函数执行处理的最大数据量。DIS、DDS、KAFKA、RABBITMQ触发器此参数必填。 - DDS触发器：批处理大小设置1-10,000的范围内 - DIS触发器：批处理大小设置1-10,000的范围内 - KAFKA触发器：批处理大小设置1-1,000的范围内 - RABBITMQ触发器：批处理大小设置1-1,000的范围内
     * @return batchSize
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public TriggerEventDataResponseBody withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * 队列id（DMS触发器参数）。
     * @return queueId
     */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public TriggerEventDataResponseBody withConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }

    /**
     * 消费组id（DMS触发器参数）。
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    public TriggerEventDataResponseBody withPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }

    /**
     * 拉取周期。
     * @return pollingInterval
     */
    public Integer getPollingInterval() {
        return pollingInterval;
    }

    public void setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    public TriggerEventDataResponseBody withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 通道名称（DIS触发器参数）。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public TriggerEventDataResponseBody withSharditeratorType(SharditeratorTypeEnum sharditeratorType) {
        this.sharditeratorType = sharditeratorType;
        return this;
    }

    /**
     * 起始位置（DIS触发器参数）。 - TRIM_HORIZON：从最早被存储至分区的有效记录开始读取。 - LATEST：从分区中的最新记录开始读取，此设置可以保证总是读到分区中最新记录。
     * @return sharditeratorType
     */
    public SharditeratorTypeEnum getSharditeratorType() {
        return sharditeratorType;
    }

    public void setSharditeratorType(SharditeratorTypeEnum sharditeratorType) {
        this.sharditeratorType = sharditeratorType;
    }

    public TriggerEventDataResponseBody withPollingUnit(PollingUnitEnum pollingUnit) {
        this.pollingUnit = pollingUnit;
        return this;
    }

    /**
     * 拉取周期单位（DIS触发器参数）。 - s：秒 - ms：毫秒
     * @return pollingUnit
     */
    public PollingUnitEnum getPollingUnit() {
        return pollingUnit;
    }

    public void setPollingUnit(PollingUnitEnum pollingUnit) {
        this.pollingUnit = pollingUnit;
    }

    public TriggerEventDataResponseBody withMaxFetchBytes(Integer maxFetchBytes) {
        this.maxFetchBytes = maxFetchBytes;
        return this;
    }

    /**
     * 最大提取字节数（DIS触发器参数）。
     * minimum: 0
     * maximum: 4194304
     * @return maxFetchBytes
     */
    public Integer getMaxFetchBytes() {
        return maxFetchBytes;
    }

    public void setMaxFetchBytes(Integer maxFetchBytes) {
        this.maxFetchBytes = maxFetchBytes;
    }

    public TriggerEventDataResponseBody withIsSerial(IsSerialEnum isSerial) {
        this.isSerial = isSerial;
        return this;
    }

    /**
     * 串行处理数据（DIS触发器参数），如果开启该选项，取一次数据处理完之后才会取下一次数据；否则只要拉取周期到了就会取数据进行处理。
     * @return isSerial
     */
    public IsSerialEnum getIsSerial() {
        return isSerial;
    }

    public void setIsSerial(IsSerialEnum isSerial) {
        this.isSerial = isSerial;
    }

    public TriggerEventDataResponseBody withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组id（LTS触发器参数）。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public TriggerEventDataResponseBody withLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    /**
     * 日志流id（LTS触发器参数）。
     * @return logTopicId
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    public TriggerEventDataResponseBody withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 桶名称（OBS触发器参数），用作事件源的OBS存储桶，不能和本用户已有桶重名；不能和其他用户已有的桶重名；创建成功后不支持修改。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public TriggerEventDataResponseBody withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 前缀（OBS触发器参数），输入一个可选性前缀来限制对以此关键字开头的对象的通知。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public TriggerEventDataResponseBody withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * 后缀（OBS触发器参数），输入一个可选性后缀来限制对以此关键字结尾的对象的通知
     * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public TriggerEventDataResponseBody withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public TriggerEventDataResponseBody addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public TriggerEventDataResponseBody withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 触发事件（OBS触发器参数）。 - ObjectCreated：表示所有创建对象的操作，包含Put、Post、Copy对象以及合并段 - Put：使用Put方法上传对象 - Post：使用Post方法上传对象 - Copy：使用copy方法复制对象 - CompleteMultipartUpload：表示合并分段任务 - ObjectRemoved：表示删除对象 - Delete：指定对象版本号删除对象 - DeleteMarkerCreated：不指定对象版本号删除对象
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public TriggerEventDataResponseBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题URN（SMN触发器参数）。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public TriggerEventDataResponseBody withTopicIds(List<String> topicIds) {
        this.topicIds = topicIds;
        return this;
    }

    public TriggerEventDataResponseBody addTopicIdsItem(String topicIdsItem) {
        if (this.topicIds == null) {
            this.topicIds = new ArrayList<>();
        }
        this.topicIds.add(topicIdsItem);
        return this;
    }

    public TriggerEventDataResponseBody withTopicIds(Consumer<List<String>> topicIdsSetter) {
        if (this.topicIds == null) {
            this.topicIds = new ArrayList<>();
        }
        topicIdsSetter.accept(this.topicIds);
        return this;
    }

    /**
     * KAFKA主题id列表（KAFKA触发器参数）。
     * @return topicIds
     */
    public List<String> getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(List<String> topicIds) {
        this.topicIds = topicIds;
    }

    public TriggerEventDataResponseBody withKafkaUser(String kafkaUser) {
        this.kafkaUser = kafkaUser;
        return this;
    }

    /**
     * KAFKA账户名（KAFKA触发器参数）。
     * @return kafkaUser
     */
    public String getKafkaUser() {
        return kafkaUser;
    }

    public void setKafkaUser(String kafkaUser) {
        this.kafkaUser = kafkaUser;
    }

    public TriggerEventDataResponseBody withKafkaPassword(String kafkaPassword) {
        this.kafkaPassword = kafkaPassword;
        return this;
    }

    /**
     * KAFKA账户密码（KAFKA触发器参数）。
     * @return kafkaPassword
     */
    public String getKafkaPassword() {
        return kafkaPassword;
    }

    public void setKafkaPassword(String kafkaPassword) {
        this.kafkaPassword = kafkaPassword;
    }

    public TriggerEventDataResponseBody withKafkaConnectAddress(String kafkaConnectAddress) {
        this.kafkaConnectAddress = kafkaConnectAddress;
        return this;
    }

    /**
     * KAFKA实例连接IP地址（KAFKA触发器参数）。
     * @return kafkaConnectAddress
     */
    public String getKafkaConnectAddress() {
        return kafkaConnectAddress;
    }

    public void setKafkaConnectAddress(String kafkaConnectAddress) {
        this.kafkaConnectAddress = kafkaConnectAddress;
    }

    public TriggerEventDataResponseBody withKafkaSslEnable(Boolean kafkaSslEnable) {
        this.kafkaSslEnable = kafkaSslEnable;
        return this;
    }

    /**
     * KAFKA连接是否开启安全认证（KAFKA触发器参数）。
     * @return kafkaSslEnable
     */
    public Boolean getKafkaSslEnable() {
        return kafkaSslEnable;
    }

    public void setKafkaSslEnable(Boolean kafkaSslEnable) {
        this.kafkaSslEnable = kafkaSslEnable;
    }

    public TriggerEventDataResponseBody withAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
        return this;
    }

    /**
     * RABBITMQ账户密码（RABBITMQ触发器参数）。
     * @return accessPassword
     */
    public String getAccessPassword() {
        return accessPassword;
    }

    public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
    }

    public TriggerEventDataResponseBody withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    /**
     * RABBITMQ账户名（RABBITMQ触发器参数）。
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public TriggerEventDataResponseBody withConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
        return this;
    }

    /**
     * 实例连接IP地址（RABBITMQ触发器参数）。
     * @return connectAddress
     */
    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
    }

    public TriggerEventDataResponseBody withExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }

    /**
     * 交换机名称（RABBITMQ触发器参数）。
     * @return exchangeName
     */
    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public TriggerEventDataResponseBody withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * 虚拟机名称（RABBITMQ触发器参数）。
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public TriggerEventDataResponseBody withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * RABBITMQ连接是否开启安全认证（RABBITMQ触发器参数）。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public TriggerEventDataResponseBody withKeyEncode(Boolean keyEncode) {
        this.keyEncode = keyEncode;
        return this;
    }

    /**
     * EG obs触发器是否对对象加密（EVENTGRID触发器参数）。
     * @return keyEncode
     */
    public Boolean getKeyEncode() {
        return keyEncode;
    }

    public void setKeyEncode(Boolean keyEncode) {
        this.keyEncode = keyEncode;
    }

    public TriggerEventDataResponseBody withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 使用的代理（EVENTGRID触发器参数）。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public TriggerEventDataResponseBody withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 通道名称（EVENTGRID触发器参数）。
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public TriggerEventDataResponseBody withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 通道id（EVENTGRID触发器参数）。
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public TriggerEventDataResponseBody withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 事件源名称（EVENTGRID触发器参数）。
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public TriggerEventDataResponseBody withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间（EVENTGRID触发器参数）。
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public TriggerEventDataResponseBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 触发器状态（EVENTGRID触发器参数）。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TriggerEventDataResponseBody withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * 触发器名称（EVENTGRID触发器参数）。
     * @return triggerName
     */
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public TriggerEventDataResponseBody withEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public TriggerEventDataResponseBody addEventTypesItem(String eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    public TriggerEventDataResponseBody withEventTypes(Consumer<List<String>> eventTypesSetter) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        eventTypesSetter.accept(this.eventTypes);
        return this;
    }

    /**
     * 事件类型（EVENTGRID触发器参数）。
     * @return eventTypes
     */
    public List<String> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerEventDataResponseBody that = (TriggerEventDataResponseBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.scheduleType, that.scheduleType)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.userEvent, that.userEvent)
            && Objects.equals(this.triggerid, that.triggerid) && Objects.equals(this.type, that.type)
            && Objects.equals(this.path, that.path) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.reqMethod, that.reqMethod) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.matchMode, that.matchMode)
            && Objects.equals(this.envName, that.envName) && Objects.equals(this.envId, that.envId)
            && Objects.equals(this.apiId, that.apiId) && Objects.equals(this.apiName, that.apiName)
            && Objects.equals(this.auth, that.auth) && Objects.equals(this.invokeUrl, that.invokeUrl)
            && Objects.equals(this.funcInfo, that.funcInfo) && Objects.equals(this.slDomain, that.slDomain)
            && Objects.equals(this.backendType, that.backendType) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.romaAppId, that.romaAppId) && Objects.equals(this.operations, that.operations)
            && Objects.equals(this.collectionName, that.collectionName) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.dbPassword, that.dbPassword) && Objects.equals(this.dbUser, that.dbUser)
            && Objects.equals(this.instanceAddrs, that.instanceAddrs) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.batchSize, that.batchSize) && Objects.equals(this.queueId, that.queueId)
            && Objects.equals(this.consumerGroupId, that.consumerGroupId)
            && Objects.equals(this.pollingInterval, that.pollingInterval)
            && Objects.equals(this.streamName, that.streamName)
            && Objects.equals(this.sharditeratorType, that.sharditeratorType)
            && Objects.equals(this.pollingUnit, that.pollingUnit)
            && Objects.equals(this.maxFetchBytes, that.maxFetchBytes) && Objects.equals(this.isSerial, that.isSerial)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logTopicId, that.logTopicId)
            && Objects.equals(this.bucket, that.bucket) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.suffix, that.suffix) && Objects.equals(this.events, that.events)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.topicIds, that.topicIds)
            && Objects.equals(this.kafkaUser, that.kafkaUser) && Objects.equals(this.kafkaPassword, that.kafkaPassword)
            && Objects.equals(this.kafkaConnectAddress, that.kafkaConnectAddress)
            && Objects.equals(this.kafkaSslEnable, that.kafkaSslEnable)
            && Objects.equals(this.accessPassword, that.accessPassword)
            && Objects.equals(this.accessUser, that.accessUser)
            && Objects.equals(this.connectAddress, that.connectAddress)
            && Objects.equals(this.exchangeName, that.exchangeName) && Objects.equals(this.vhost, that.vhost)
            && Objects.equals(this.sslEnable, that.sslEnable) && Objects.equals(this.keyEncode, that.keyEncode)
            && Objects.equals(this.agency, that.agency) && Objects.equals(this.channelName, that.channelName)
            && Objects.equals(this.channelId, that.channelId) && Objects.equals(this.sourceName, that.sourceName)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.triggerName, that.triggerName) && Objects.equals(this.eventTypes, that.eventTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            scheduleType,
            schedule,
            userEvent,
            triggerid,
            type,
            path,
            protocol,
            reqMethod,
            groupId,
            groupName,
            matchMode,
            envName,
            envId,
            apiId,
            apiName,
            auth,
            invokeUrl,
            funcInfo,
            slDomain,
            backendType,
            instanceId,
            romaAppId,
            operations,
            collectionName,
            dbName,
            dbPassword,
            dbUser,
            instanceAddrs,
            mode,
            batchSize,
            queueId,
            consumerGroupId,
            pollingInterval,
            streamName,
            sharditeratorType,
            pollingUnit,
            maxFetchBytes,
            isSerial,
            logGroupId,
            logTopicId,
            bucket,
            prefix,
            suffix,
            events,
            topicUrn,
            topicIds,
            kafkaUser,
            kafkaPassword,
            kafkaConnectAddress,
            kafkaSslEnable,
            accessPassword,
            accessUser,
            connectAddress,
            exchangeName,
            vhost,
            sslEnable,
            keyEncode,
            agency,
            channelName,
            channelId,
            sourceName,
            createdTime,
            status,
            triggerName,
            eventTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerEventDataResponseBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    userEvent: ").append(toIndentedString(userEvent)).append("\n");
        sb.append("    triggerid: ").append(toIndentedString(triggerid)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    invokeUrl: ").append(toIndentedString(invokeUrl)).append("\n");
        sb.append("    funcInfo: ").append(toIndentedString(funcInfo)).append("\n");
        sb.append("    slDomain: ").append(toIndentedString(slDomain)).append("\n");
        sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    instanceAddrs: ").append(toIndentedString(instanceAddrs)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    consumerGroupId: ").append(toIndentedString(consumerGroupId)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    sharditeratorType: ").append(toIndentedString(sharditeratorType)).append("\n");
        sb.append("    pollingUnit: ").append(toIndentedString(pollingUnit)).append("\n");
        sb.append("    maxFetchBytes: ").append(toIndentedString(maxFetchBytes)).append("\n");
        sb.append("    isSerial: ").append(toIndentedString(isSerial)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    topicIds: ").append(toIndentedString(topicIds)).append("\n");
        sb.append("    kafkaUser: ").append(toIndentedString(kafkaUser)).append("\n");
        sb.append("    kafkaPassword: ").append(toIndentedString(kafkaPassword)).append("\n");
        sb.append("    kafkaConnectAddress: ").append(toIndentedString(kafkaConnectAddress)).append("\n");
        sb.append("    kafkaSslEnable: ").append(toIndentedString(kafkaSslEnable)).append("\n");
        sb.append("    accessPassword: ").append(toIndentedString(accessPassword)).append("\n");
        sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    keyEncode: ").append(toIndentedString(keyEncode)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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
