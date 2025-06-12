package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警实体信息
 */
public class ListAlertRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private AlertEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private AlertDataSource dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_observed_time")

    private String firstObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_observed_time")

    private String lastObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrive_time")

    private String arriveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    /**
     * 严重性等级，取值范围：Tips | Low | Medium | High | Fatal 说明： 0: Tips – 未发现任何问题。 1: Low – 无需针对问题执行任何操作。 2: Medium – 问题需要处理，但不紧急。 3: High – 问题必须优先处理。 4: Fatal – 问题必须立即处理，以防止产生进一步的损害
     */
    public static final class SeverityEnum {

        /**
         * Enum TIPS for value: "Tips"
         */
        public static final SeverityEnum TIPS = new SeverityEnum("Tips");

        /**
         * Enum LOW for value: "Low"
         */
        public static final SeverityEnum LOW = new SeverityEnum("Low");

        /**
         * Enum MEDIUM for value: "Medium"
         */
        public static final SeverityEnum MEDIUM = new SeverityEnum("Medium");

        /**
         * Enum HIGH for value: "High"
         */
        public static final SeverityEnum HIGH = new SeverityEnum("High");

        /**
         * Enum FATAL for value: "Fatal"
         */
        public static final SeverityEnum FATAL = new SeverityEnum("Fatal");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("Tips", TIPS);
            map.put("Low", LOW);
            map.put("Medium", MEDIUM);
            map.put("High", HIGH);
            map.put("Fatal", FATAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criticality")

    private Integer criticality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private AlertAlertType alertType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_list")

    private List<AlertNetworkList> networkList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_list")

    private List<AlertResourceList> resourceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private AlertRemediation remediation;

    /**
     * 验证状态，标识事件的准确性。可选类型如下： Unknown – 未知 True_Positive – 确认 False_Positive – 误报 默认填写Unknown
     */
    public static final class VerificationStateEnum {

        /**
         * Enum UNKNOWN for value: "Unknown"
         */
        public static final VerificationStateEnum UNKNOWN = new VerificationStateEnum("Unknown");

        /**
         * Enum TRUE_POSITIVE for value: "True_Positive"
         */
        public static final VerificationStateEnum TRUE_POSITIVE = new VerificationStateEnum("True_Positive");

        /**
         * Enum FALSE_POSITIVE for value: "False_Positive"
         */
        public static final VerificationStateEnum FALSE_POSITIVE = new VerificationStateEnum("False_Positive");

        private static final Map<String, VerificationStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VerificationStateEnum> createStaticFields() {
            Map<String, VerificationStateEnum> map = new HashMap<>();
            map.put("Unknown", UNKNOWN);
            map.put("True_Positive", TRUE_POSITIVE);
            map.put("False_Positive", FALSE_POSITIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VerificationStateEnum(String value) {
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
        public static VerificationStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VerificationStateEnum(value));
        }

        public static VerificationStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VerificationStateEnum) {
                return this.value.equals(((VerificationStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_state")

    private VerificationStateEnum verificationState;

    /**
     * 事件处理状态，可选类型如下： Open – 打开，默认 Block – 阻塞 Closed – 关闭 默认填写Open
     */
    public static final class HandleStatusEnum {

        /**
         * Enum OPEN for value: "Open"
         */
        public static final HandleStatusEnum OPEN = new HandleStatusEnum("Open");

        /**
         * Enum BLOCK for value: "Block"
         */
        public static final HandleStatusEnum BLOCK = new HandleStatusEnum("Block");

        /**
         * Enum CLOSED for value: "Closed"
         */
        public static final HandleStatusEnum CLOSED = new HandleStatusEnum("Closed");

        private static final Map<String, HandleStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HandleStatusEnum> createStaticFields() {
            Map<String, HandleStatusEnum> map = new HashMap<>();
            map.put("Open", OPEN);
            map.put("Block", BLOCK);
            map.put("Closed", CLOSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HandleStatusEnum(String value) {
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
        public static HandleStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HandleStatusEnum(value));
        }

        public static HandleStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HandleStatusEnum) {
                return this.value.equals(((HandleStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private HandleStatusEnum handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla")

    private String sla;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_time")

    private String closeTime;

    /**
     * 周期/处置阶段编号 Preparation|Detection and Analysis|Contain，Eradication& Recovery|Post-Incident-Activity
     */
    public static final class IpdrrPhaseEnum {

        /**
         * Enum PREPARATION for value: "Preparation"
         */
        public static final IpdrrPhaseEnum PREPARATION = new IpdrrPhaseEnum("Preparation");

        /**
         * Enum DETECTION_AND_ANALYSIS for value: "Detection and Analysis"
         */
        public static final IpdrrPhaseEnum DETECTION_AND_ANALYSIS = new IpdrrPhaseEnum("Detection and Analysis");

        /**
         * Enum CONTAIN_ERADICATION_RECOVERY for value: "Contain，Eradication& Recovery"
         */
        public static final IpdrrPhaseEnum CONTAIN_ERADICATION_RECOVERY =
            new IpdrrPhaseEnum("Contain，Eradication& Recovery");

        /**
         * Enum POST_INCIDENT_ACTIVITY for value: "Post-Incident-Activity"
         */
        public static final IpdrrPhaseEnum POST_INCIDENT_ACTIVITY = new IpdrrPhaseEnum("Post-Incident-Activity");

        private static final Map<String, IpdrrPhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpdrrPhaseEnum> createStaticFields() {
            Map<String, IpdrrPhaseEnum> map = new HashMap<>();
            map.put("Preparation", PREPARATION);
            map.put("Detection and Analysis", DETECTION_AND_ANALYSIS);
            map.put("Contain，Eradication& Recovery", CONTAIN_ERADICATION_RECOVERY);
            map.put("Post-Incident-Activity", POST_INCIDENT_ACTIVITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpdrrPhaseEnum(String value) {
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
        public static IpdrrPhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpdrrPhaseEnum(value));
        }

        public static IpdrrPhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpdrrPhaseEnum) {
                return this.value.equals(((IpdrrPhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipdrr_phase")

    private IpdrrPhaseEnum ipdrrPhase;

    /**
     * 周期/处置阶段编号 Preparation|Detection and Analysis|Contain，Eradication& Recovery|Post-Incident-Activity
     */
    public static final class ChopPhaseEnum {

        /**
         * Enum PREPARATION for value: "Preparation"
         */
        public static final ChopPhaseEnum PREPARATION = new ChopPhaseEnum("Preparation");

        /**
         * Enum DETECTION_AND_ANALYSIS for value: "Detection and Analysis"
         */
        public static final ChopPhaseEnum DETECTION_AND_ANALYSIS = new ChopPhaseEnum("Detection and Analysis");

        /**
         * Enum CONTAIN_ERADICATION_RECOVERY for value: "Contain，Eradication& Recovery"
         */
        public static final ChopPhaseEnum CONTAIN_ERADICATION_RECOVERY =
            new ChopPhaseEnum("Contain，Eradication& Recovery");

        /**
         * Enum POST_INCIDENT_ACTIVITY for value: "Post-Incident-Activity"
         */
        public static final ChopPhaseEnum POST_INCIDENT_ACTIVITY = new ChopPhaseEnum("Post-Incident-Activity");

        private static final Map<String, ChopPhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChopPhaseEnum> createStaticFields() {
            Map<String, ChopPhaseEnum> map = new HashMap<>();
            map.put("Preparation", PREPARATION);
            map.put("Detection and Analysis", DETECTION_AND_ANALYSIS);
            map.put("Contain，Eradication& Recovery", CONTAIN_ERADICATION_RECOVERY);
            map.put("Post-Incident-Activity", POST_INCIDENT_ACTIVITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChopPhaseEnum(String value) {
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
        public static ChopPhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChopPhaseEnum(value));
        }

        public static ChopPhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChopPhaseEnum) {
                return this.value.equals(((ChopPhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chop_phase")

    private ChopPhaseEnum chopPhase;

    /**
     * 周期/处置阶段编号 Preparation|Detection and Analysis|Contain，Eradication& Recovery|Post-Incident-Activity
     */
    public static final class PpdrPhaseEnum {

        /**
         * Enum PREPARATION for value: "Preparation"
         */
        public static final PpdrPhaseEnum PREPARATION = new PpdrPhaseEnum("Preparation");

        /**
         * Enum DETECTION_AND_ANALYSIS for value: "Detection and Analysis"
         */
        public static final PpdrPhaseEnum DETECTION_AND_ANALYSIS = new PpdrPhaseEnum("Detection and Analysis");

        /**
         * Enum CONTAIN_ERADICATION_RECOVERY for value: "Contain，Eradication& Recovery"
         */
        public static final PpdrPhaseEnum CONTAIN_ERADICATION_RECOVERY =
            new PpdrPhaseEnum("Contain，Eradication& Recovery");

        /**
         * Enum POST_INCIDENT_ACTIVITY for value: "Post-Incident-Activity"
         */
        public static final PpdrPhaseEnum POST_INCIDENT_ACTIVITY = new PpdrPhaseEnum("Post-Incident-Activity");

        private static final Map<String, PpdrPhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PpdrPhaseEnum> createStaticFields() {
            Map<String, PpdrPhaseEnum> map = new HashMap<>();
            map.put("Preparation", PREPARATION);
            map.put("Detection and Analysis", DETECTION_AND_ANALYSIS);
            map.put("Contain，Eradication& Recovery", CONTAIN_ERADICATION_RECOVERY);
            map.put("Post-Incident-Activity", POST_INCIDENT_ACTIVITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PpdrPhaseEnum(String value) {
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
        public static PpdrPhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PpdrPhaseEnum(value));
        }

        public static PpdrPhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PpdrPhaseEnum) {
                return this.value.equals(((PpdrPhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ppdr_phase")

    private PpdrPhaseEnum ppdrPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simulation")

    private String simulation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actor")

    private String actor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    /**
     * 关闭原因: 误检 - False detection 已解决 - Resolved 重复 - Repeated 其他 - Other
     */
    public static final class CloseReasonEnum {

        /**
         * Enum FALSE_DETECTION for value: "False detection"
         */
        public static final CloseReasonEnum FALSE_DETECTION = new CloseReasonEnum("False detection");

        /**
         * Enum RESOLVED for value: "Resolved"
         */
        public static final CloseReasonEnum RESOLVED = new CloseReasonEnum("Resolved");

        /**
         * Enum REPEATED for value: "Repeated"
         */
        public static final CloseReasonEnum REPEATED = new CloseReasonEnum("Repeated");

        /**
         * Enum OTHER for value: "Other"
         */
        public static final CloseReasonEnum OTHER = new CloseReasonEnum("Other");

        private static final Map<String, CloseReasonEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloseReasonEnum> createStaticFields() {
            Map<String, CloseReasonEnum> map = new HashMap<>();
            map.put("False detection", FALSE_DETECTION);
            map.put("Resolved", RESOLVED);
            map.put("Repeated", REPEATED);
            map.put("Other", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloseReasonEnum(String value) {
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
        public static CloseReasonEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CloseReasonEnum(value));
        }

        public static CloseReasonEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CloseReasonEnum) {
                return this.value.equals(((CloseReasonEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_reason")

    private CloseReasonEnum closeReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_comment")

    private String closeComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_list")

    private List<String> alertList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_list")

    private List<String> incidentList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_list")

    private List<String> indicatorList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware")

    private ShowAlertRspMalware malware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_info")

    private Object systemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private List<AlertProcess> process = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info")

    private List<AlertUserInfo> userInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_info")

    private List<AlertFileInfo> fileInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_id")

    private String originId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttd")

    private Integer ttd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttr")

    private Integer ttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_closed")

    private String isAutoClosed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_alert_table")

    private Object systemAlertTable;

    public ListAlertRsp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 告警对象的版本，该字段的值必须为云SSA服务确定的官方发布版本之一
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListAlertRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件唯一标识，UUID格式，最大36个字符
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAlertRsp withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 数据投递后，被委托用户的domain_id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListAlertRsp withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 数据投递后，被委托用户的region_id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListAlertRsp withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 当前的工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListAlertRsp withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签，仅展示
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ListAlertRsp withEnvironment(AlertEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public ListAlertRsp withEnvironment(Consumer<AlertEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new AlertEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public AlertEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(AlertEnvironment environment) {
        this.environment = environment;
    }

    public ListAlertRsp withDataSource(AlertDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public ListAlertRsp withDataSource(Consumer<AlertDataSource> dataSourceSetter) {
        if (this.dataSource == null) {
            this.dataSource = new AlertDataSource();
            dataSourceSetter.accept(this.dataSource);
        }

        return this;
    }

    /**
     * Get dataSource
     * @return dataSource
     */
    public AlertDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(AlertDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ListAlertRsp withFirstObservedTime(String firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
        return this;
    }

    /**
     * 首次发现时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return firstObservedTime
     */
    public String getFirstObservedTime() {
        return firstObservedTime;
    }

    public void setFirstObservedTime(String firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
    }

    public ListAlertRsp withLastObservedTime(String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    /**
     * 最近发现时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return lastObservedTime
     */
    public String getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    public ListAlertRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 记录时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListAlertRsp withArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
        return this;
    }

    /**
     * 接收时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return arriveTime
     */
    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public ListAlertRsp withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 告警标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ListAlertRsp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 告警描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListAlertRsp withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * 告警URL链接，指向数据源产品中有关当前事件说明的页面
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public ListAlertRsp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 事件发生次数
     * minimum: 0
     * maximum: 999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAlertRsp withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 事件的置信度。置信度的定义旨在说明识别的行为或问题的可能性。 取值范围：0-100，0表示置信度为0%，100表示置信度为100%
     * minimum: 0
     * maximum: 100
     * @return confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public ListAlertRsp withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 严重性等级，取值范围：Tips | Low | Medium | High | Fatal 说明： 0: Tips – 未发现任何问题。 1: Low – 无需针对问题执行任何操作。 2: Medium – 问题需要处理，但不紧急。 3: High – 问题必须优先处理。 4: Fatal – 问题必须立即处理，以防止产生进一步的损害
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public ListAlertRsp withCriticality(Integer criticality) {
        this.criticality = criticality;
        return this;
    }

    /**
     * 关键性，是指事件涉及的资源的重要性级别。 取值范围：0-100，0表示资源不关键，100表示最关键资源
     * minimum: 0
     * maximum: 100
     * @return criticality
     */
    public Integer getCriticality() {
        return criticality;
    }

    public void setCriticality(Integer criticality) {
        this.criticality = criticality;
    }

    public ListAlertRsp withAlertType(AlertAlertType alertType) {
        this.alertType = alertType;
        return this;
    }

    public ListAlertRsp withAlertType(Consumer<AlertAlertType> alertTypeSetter) {
        if (this.alertType == null) {
            this.alertType = new AlertAlertType();
            alertTypeSetter.accept(this.alertType);
        }

        return this;
    }

    /**
     * Get alertType
     * @return alertType
     */
    public AlertAlertType getAlertType() {
        return alertType;
    }

    public void setAlertType(AlertAlertType alertType) {
        this.alertType = alertType;
    }

    public ListAlertRsp withNetworkList(List<AlertNetworkList> networkList) {
        this.networkList = networkList;
        return this;
    }

    public ListAlertRsp addNetworkListItem(AlertNetworkList networkListItem) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        this.networkList.add(networkListItem);
        return this;
    }

    public ListAlertRsp withNetworkList(Consumer<List<AlertNetworkList>> networkListSetter) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        networkListSetter.accept(this.networkList);
        return this;
    }

    /**
     * 网络信息
     * @return networkList
     */
    public List<AlertNetworkList> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<AlertNetworkList> networkList) {
        this.networkList = networkList;
    }

    public ListAlertRsp withResourceList(List<AlertResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    public ListAlertRsp addResourceListItem(AlertResourceList resourceListItem) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceListItem);
        return this;
    }

    public ListAlertRsp withResourceList(Consumer<List<AlertResourceList>> resourceListSetter) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        resourceListSetter.accept(this.resourceList);
        return this;
    }

    /**
     * 受影响资源
     * @return resourceList
     */
    public List<AlertResourceList> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<AlertResourceList> resourceList) {
        this.resourceList = resourceList;
    }

    public ListAlertRsp withRemediation(AlertRemediation remediation) {
        this.remediation = remediation;
        return this;
    }

    public ListAlertRsp withRemediation(Consumer<AlertRemediation> remediationSetter) {
        if (this.remediation == null) {
            this.remediation = new AlertRemediation();
            remediationSetter.accept(this.remediation);
        }

        return this;
    }

    /**
     * Get remediation
     * @return remediation
     */
    public AlertRemediation getRemediation() {
        return remediation;
    }

    public void setRemediation(AlertRemediation remediation) {
        this.remediation = remediation;
    }

    public ListAlertRsp withVerificationState(VerificationStateEnum verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * 验证状态，标识事件的准确性。可选类型如下： Unknown – 未知 True_Positive – 确认 False_Positive – 误报 默认填写Unknown
     * @return verificationState
     */
    public VerificationStateEnum getVerificationState() {
        return verificationState;
    }

    public void setVerificationState(VerificationStateEnum verificationState) {
        this.verificationState = verificationState;
    }

    public ListAlertRsp withHandleStatus(HandleStatusEnum handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 事件处理状态，可选类型如下： Open – 打开，默认 Block – 阻塞 Closed – 关闭 默认填写Open
     * @return handleStatus
     */
    public HandleStatusEnum getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(HandleStatusEnum handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListAlertRsp withSla(String sla) {
        this.sla = sla;
        return this;
    }

    /**
     * 约束闭环时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return sla
     */
    public String getSla() {
        return sla;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }

    public ListAlertRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListAlertRsp withCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * 关闭时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return closeTime
     */
    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public ListAlertRsp withIpdrrPhase(IpdrrPhaseEnum ipdrrPhase) {
        this.ipdrrPhase = ipdrrPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号 Preparation|Detection and Analysis|Contain，Eradication& Recovery|Post-Incident-Activity
     * @return ipdrrPhase
     */
    public IpdrrPhaseEnum getIpdrrPhase() {
        return ipdrrPhase;
    }

    public void setIpdrrPhase(IpdrrPhaseEnum ipdrrPhase) {
        this.ipdrrPhase = ipdrrPhase;
    }

    public ListAlertRsp withChopPhase(ChopPhaseEnum chopPhase) {
        this.chopPhase = chopPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号 Preparation|Detection and Analysis|Contain，Eradication& Recovery|Post-Incident-Activity
     * @return chopPhase
     */
    public ChopPhaseEnum getChopPhase() {
        return chopPhase;
    }

    public void setChopPhase(ChopPhaseEnum chopPhase) {
        this.chopPhase = chopPhase;
    }

    public ListAlertRsp withPpdrPhase(PpdrPhaseEnum ppdrPhase) {
        this.ppdrPhase = ppdrPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号 Preparation|Detection and Analysis|Contain，Eradication& Recovery|Post-Incident-Activity
     * @return ppdrPhase
     */
    public PpdrPhaseEnum getPpdrPhase() {
        return ppdrPhase;
    }

    public void setPpdrPhase(PpdrPhaseEnum ppdrPhase) {
        this.ppdrPhase = ppdrPhase;
    }

    public ListAlertRsp withSimulation(String simulation) {
        this.simulation = simulation;
        return this;
    }

    /**
     * 调试字段
     * @return simulation
     */
    public String getSimulation() {
        return simulation;
    }

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    public ListAlertRsp withActor(String actor) {
        this.actor = actor;
        return this;
    }

    /**
     * 告警调查员
     * @return actor
     */
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public ListAlertRsp withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人、服务责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListAlertRsp withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListAlertRsp withCloseReason(CloseReasonEnum closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    /**
     * 关闭原因: 误检 - False detection 已解决 - Resolved 重复 - Repeated 其他 - Other
     * @return closeReason
     */
    public CloseReasonEnum getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(CloseReasonEnum closeReason) {
        this.closeReason = closeReason;
    }

    public ListAlertRsp withCloseComment(String closeComment) {
        this.closeComment = closeComment;
        return this;
    }

    /**
     * 关闭评论
     * @return closeComment
     */
    public String getCloseComment() {
        return closeComment;
    }

    public void setCloseComment(String closeComment) {
        this.closeComment = closeComment;
    }

    public ListAlertRsp withAlertList(List<String> alertList) {
        this.alertList = alertList;
        return this;
    }

    public ListAlertRsp addAlertListItem(String alertListItem) {
        if (this.alertList == null) {
            this.alertList = new ArrayList<>();
        }
        this.alertList.add(alertListItem);
        return this;
    }

    public ListAlertRsp withAlertList(Consumer<List<String>> alertListSetter) {
        if (this.alertList == null) {
            this.alertList = new ArrayList<>();
        }
        alertListSetter.accept(this.alertList);
        return this;
    }

    /**
     * 告警id列表，告警/事件/指标关联的告警列表
     * @return alertList
     */
    public List<String> getAlertList() {
        return alertList;
    }

    public void setAlertList(List<String> alertList) {
        this.alertList = alertList;
    }

    public ListAlertRsp withIncidentList(List<String> incidentList) {
        this.incidentList = incidentList;
        return this;
    }

    public ListAlertRsp addIncidentListItem(String incidentListItem) {
        if (this.incidentList == null) {
            this.incidentList = new ArrayList<>();
        }
        this.incidentList.add(incidentListItem);
        return this;
    }

    public ListAlertRsp withIncidentList(Consumer<List<String>> incidentListSetter) {
        if (this.incidentList == null) {
            this.incidentList = new ArrayList<>();
        }
        incidentListSetter.accept(this.incidentList);
        return this;
    }

    /**
     * 事件id列表，告警/事件/指标关联的告警列表
     * @return incidentList
     */
    public List<String> getIncidentList() {
        return incidentList;
    }

    public void setIncidentList(List<String> incidentList) {
        this.incidentList = incidentList;
    }

    public ListAlertRsp withIndicatorList(List<String> indicatorList) {
        this.indicatorList = indicatorList;
        return this;
    }

    public ListAlertRsp addIndicatorListItem(String indicatorListItem) {
        if (this.indicatorList == null) {
            this.indicatorList = new ArrayList<>();
        }
        this.indicatorList.add(indicatorListItem);
        return this;
    }

    public ListAlertRsp withIndicatorList(Consumer<List<String>> indicatorListSetter) {
        if (this.indicatorList == null) {
            this.indicatorList = new ArrayList<>();
        }
        indicatorListSetter.accept(this.indicatorList);
        return this;
    }

    /**
     * 指标列表，告警/事件关联的指标列表
     * @return indicatorList
     */
    public List<String> getIndicatorList() {
        return indicatorList;
    }

    public void setIndicatorList(List<String> indicatorList) {
        this.indicatorList = indicatorList;
    }

    public ListAlertRsp withMalware(ShowAlertRspMalware malware) {
        this.malware = malware;
        return this;
    }

    public ListAlertRsp withMalware(Consumer<ShowAlertRspMalware> malwareSetter) {
        if (this.malware == null) {
            this.malware = new ShowAlertRspMalware();
            malwareSetter.accept(this.malware);
        }

        return this;
    }

    /**
     * Get malware
     * @return malware
     */
    public ShowAlertRspMalware getMalware() {
        return malware;
    }

    public void setMalware(ShowAlertRspMalware malware) {
        this.malware = malware;
    }

    public ListAlertRsp withSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }

    /**
     * 系统信息
     * @return systemInfo
     */
    public Object getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
    }

    public ListAlertRsp withProcess(List<AlertProcess> process) {
        this.process = process;
        return this;
    }

    public ListAlertRsp addProcessItem(AlertProcess processItem) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        this.process.add(processItem);
        return this;
    }

    public ListAlertRsp withProcess(Consumer<List<AlertProcess>> processSetter) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        processSetter.accept(this.process);
        return this;
    }

    /**
     * 进程信息
     * @return process
     */
    public List<AlertProcess> getProcess() {
        return process;
    }

    public void setProcess(List<AlertProcess> process) {
        this.process = process;
    }

    public ListAlertRsp withUserInfo(List<AlertUserInfo> userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public ListAlertRsp addUserInfoItem(AlertUserInfo userInfoItem) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        this.userInfo.add(userInfoItem);
        return this;
    }

    public ListAlertRsp withUserInfo(Consumer<List<AlertUserInfo>> userInfoSetter) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        userInfoSetter.accept(this.userInfo);
        return this;
    }

    /**
     * 用户信息
     * @return userInfo
     */
    public List<AlertUserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<AlertUserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    public ListAlertRsp withFileInfo(List<AlertFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    public ListAlertRsp addFileInfoItem(AlertFileInfo fileInfoItem) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        this.fileInfo.add(fileInfoItem);
        return this;
    }

    public ListAlertRsp withFileInfo(Consumer<List<AlertFileInfo>> fileInfoSetter) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        fileInfoSetter.accept(this.fileInfo);
        return this;
    }

    /**
     * 文件信息
     * @return fileInfo
     */
    public List<AlertFileInfo> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(List<AlertFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
    }

    public ListAlertRsp withOriginId(String originId) {
        this.originId = originId;
        return this;
    }

    /**
     * 告警事件原始来源id，最大128个字符
     * @return originId
     */
    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public ListAlertRsp withTtd(Integer ttd) {
        this.ttd = ttd;
        return this;
    }

    /**
     * 检测时间。单位：分钟
     * minimum: 0
     * maximum: 99999
     * @return ttd
     */
    public Integer getTtd() {
        return ttd;
    }

    public void setTtd(Integer ttd) {
        this.ttd = ttd;
    }

    public ListAlertRsp withTtr(Integer ttr) {
        this.ttr = ttr;
        return this;
    }

    /**
     * 响应时间。单位：分钟
     * minimum: 0
     * maximum: 99999
     * @return ttr
     */
    public Integer getTtr() {
        return ttr;
    }

    public void setTtr(Integer ttr) {
        this.ttr = ttr;
    }

    public ListAlertRsp withIsAutoClosed(String isAutoClosed) {
        this.isAutoClosed = isAutoClosed;
        return this;
    }

    /**
     * 是否自动关闭，取值范围： AutoClosed - SOAR自动化关闭 Manual - 人工关闭
     * @return isAutoClosed
     */
    public String getIsAutoClosed() {
        return isAutoClosed;
    }

    public void setIsAutoClosed(String isAutoClosed) {
        this.isAutoClosed = isAutoClosed;
    }

    public ListAlertRsp withSystemAlertTable(Object systemAlertTable) {
        this.systemAlertTable = systemAlertTable;
        return this;
    }

    /**
     * 告警管理列表的布局字段
     * @return systemAlertTable
     */
    public Object getSystemAlertTable() {
        return systemAlertTable;
    }

    public void setSystemAlertTable(Object systemAlertTable) {
        this.systemAlertTable = systemAlertTable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlertRsp that = (ListAlertRsp) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.id, that.id)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.environment, that.environment) && Objects.equals(this.dataSource, that.dataSource)
            && Objects.equals(this.firstObservedTime, that.firstObservedTime)
            && Objects.equals(this.lastObservedTime, that.lastObservedTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.arriveTime, that.arriveTime)
            && Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.sourceUrl, that.sourceUrl) && Objects.equals(this.count, that.count)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.criticality, that.criticality) && Objects.equals(this.alertType, that.alertType)
            && Objects.equals(this.networkList, that.networkList)
            && Objects.equals(this.resourceList, that.resourceList)
            && Objects.equals(this.remediation, that.remediation)
            && Objects.equals(this.verificationState, that.verificationState)
            && Objects.equals(this.handleStatus, that.handleStatus) && Objects.equals(this.sla, that.sla)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.closeTime, that.closeTime)
            && Objects.equals(this.ipdrrPhase, that.ipdrrPhase) && Objects.equals(this.chopPhase, that.chopPhase)
            && Objects.equals(this.ppdrPhase, that.ppdrPhase) && Objects.equals(this.simulation, that.simulation)
            && Objects.equals(this.actor, that.actor) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.closeReason, that.closeReason)
            && Objects.equals(this.closeComment, that.closeComment) && Objects.equals(this.alertList, that.alertList)
            && Objects.equals(this.incidentList, that.incidentList)
            && Objects.equals(this.indicatorList, that.indicatorList) && Objects.equals(this.malware, that.malware)
            && Objects.equals(this.systemInfo, that.systemInfo) && Objects.equals(this.process, that.process)
            && Objects.equals(this.userInfo, that.userInfo) && Objects.equals(this.fileInfo, that.fileInfo)
            && Objects.equals(this.originId, that.originId) && Objects.equals(this.ttd, that.ttd)
            && Objects.equals(this.ttr, that.ttr) && Objects.equals(this.isAutoClosed, that.isAutoClosed)
            && Objects.equals(this.systemAlertTable, that.systemAlertTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            id,
            domainId,
            regionId,
            workspaceId,
            labels,
            environment,
            dataSource,
            firstObservedTime,
            lastObservedTime,
            createTime,
            arriveTime,
            title,
            description,
            sourceUrl,
            count,
            confidence,
            severity,
            criticality,
            alertType,
            networkList,
            resourceList,
            remediation,
            verificationState,
            handleStatus,
            sla,
            updateTime,
            closeTime,
            ipdrrPhase,
            chopPhase,
            ppdrPhase,
            simulation,
            actor,
            owner,
            creator,
            closeReason,
            closeComment,
            alertList,
            incidentList,
            indicatorList,
            malware,
            systemInfo,
            process,
            userInfo,
            fileInfo,
            originId,
            ttd,
            ttr,
            isAutoClosed,
            systemAlertTable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRsp {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    firstObservedTime: ").append(toIndentedString(firstObservedTime)).append("\n");
        sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    arriveTime: ").append(toIndentedString(arriveTime)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
        sb.append("    networkList: ").append(toIndentedString(networkList)).append("\n");
        sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    ipdrrPhase: ").append(toIndentedString(ipdrrPhase)).append("\n");
        sb.append("    chopPhase: ").append(toIndentedString(chopPhase)).append("\n");
        sb.append("    ppdrPhase: ").append(toIndentedString(ppdrPhase)).append("\n");
        sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
        sb.append("    closeComment: ").append(toIndentedString(closeComment)).append("\n");
        sb.append("    alertList: ").append(toIndentedString(alertList)).append("\n");
        sb.append("    incidentList: ").append(toIndentedString(incidentList)).append("\n");
        sb.append("    indicatorList: ").append(toIndentedString(indicatorList)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
        sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
        sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
        sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
        sb.append("    ttd: ").append(toIndentedString(ttd)).append("\n");
        sb.append("    ttr: ").append(toIndentedString(ttr)).append("\n");
        sb.append("    isAutoClosed: ").append(toIndentedString(isAutoClosed)).append("\n");
        sb.append("    systemAlertTable: ").append(toIndentedString(systemAlertTable)).append("\n");
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
