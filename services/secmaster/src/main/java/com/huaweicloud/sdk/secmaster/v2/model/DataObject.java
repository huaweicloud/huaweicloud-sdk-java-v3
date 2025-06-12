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
public class DataObject {

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
    @JsonProperty(value = "environment")

    private AlertEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private AlertDataSource datasource;

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

    private List<DataObjectNetworkList> networkList = null;

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

    private Integer sla;

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

    public DataObject withVersion(String version) {
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

    public DataObject withId(String id) {
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

    public DataObject withDomainId(String domainId) {
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

    public DataObject withRegionId(String regionId) {
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

    public DataObject withWorkspaceId(String workspaceId) {
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

    public DataObject withEnvironment(AlertEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public DataObject withEnvironment(Consumer<AlertEnvironment> environmentSetter) {
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

    public DataObject withDatasource(AlertDataSource datasource) {
        this.datasource = datasource;
        return this;
    }

    public DataObject withDatasource(Consumer<AlertDataSource> datasourceSetter) {
        if (this.datasource == null) {
            this.datasource = new AlertDataSource();
            datasourceSetter.accept(this.datasource);
        }

        return this;
    }

    /**
     * Get datasource
     * @return datasource
     */
    public AlertDataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(AlertDataSource datasource) {
        this.datasource = datasource;
    }

    public DataObject withFirstObservedTime(String firstObservedTime) {
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

    public DataObject withLastObservedTime(String lastObservedTime) {
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

    public DataObject withCreateTime(String createTime) {
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

    public DataObject withArriveTime(String arriveTime) {
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

    public DataObject withTitle(String title) {
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

    public DataObject withDescription(String description) {
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

    public DataObject withSourceUrl(String sourceUrl) {
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

    public DataObject withCount(Integer count) {
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

    public DataObject withConfidence(Integer confidence) {
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

    public DataObject withSeverity(SeverityEnum severity) {
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

    public DataObject withCriticality(Integer criticality) {
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

    public DataObject withAlertType(AlertAlertType alertType) {
        this.alertType = alertType;
        return this;
    }

    public DataObject withAlertType(Consumer<AlertAlertType> alertTypeSetter) {
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

    public DataObject withNetworkList(List<DataObjectNetworkList> networkList) {
        this.networkList = networkList;
        return this;
    }

    public DataObject addNetworkListItem(DataObjectNetworkList networkListItem) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        this.networkList.add(networkListItem);
        return this;
    }

    public DataObject withNetworkList(Consumer<List<DataObjectNetworkList>> networkListSetter) {
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
    public List<DataObjectNetworkList> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<DataObjectNetworkList> networkList) {
        this.networkList = networkList;
    }

    public DataObject withResourceList(List<AlertResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    public DataObject addResourceListItem(AlertResourceList resourceListItem) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceListItem);
        return this;
    }

    public DataObject withResourceList(Consumer<List<AlertResourceList>> resourceListSetter) {
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

    public DataObject withRemediation(AlertRemediation remediation) {
        this.remediation = remediation;
        return this;
    }

    public DataObject withRemediation(Consumer<AlertRemediation> remediationSetter) {
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

    public DataObject withVerificationState(VerificationStateEnum verificationState) {
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

    public DataObject withHandleStatus(HandleStatusEnum handleStatus) {
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

    public DataObject withSla(Integer sla) {
        this.sla = sla;
        return this;
    }

    /**
     * 约束闭环时间：设置风险接受持续时间。单位：小时
     * minimum: 0
     * maximum: 999
     * @return sla
     */
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    public DataObject withUpdateTime(String updateTime) {
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

    public DataObject withCloseTime(String closeTime) {
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

    public DataObject withIpdrrPhase(IpdrrPhaseEnum ipdrrPhase) {
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

    public DataObject withSimulation(String simulation) {
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

    public DataObject withActor(String actor) {
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

    public DataObject withOwner(String owner) {
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

    public DataObject withCreator(String creator) {
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

    public DataObject withCloseReason(CloseReasonEnum closeReason) {
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

    public DataObject withCloseComment(String closeComment) {
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

    public DataObject withMalware(ShowAlertRspMalware malware) {
        this.malware = malware;
        return this;
    }

    public DataObject withMalware(Consumer<ShowAlertRspMalware> malwareSetter) {
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

    public DataObject withSystemInfo(Object systemInfo) {
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

    public DataObject withProcess(List<AlertProcess> process) {
        this.process = process;
        return this;
    }

    public DataObject addProcessItem(AlertProcess processItem) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        this.process.add(processItem);
        return this;
    }

    public DataObject withProcess(Consumer<List<AlertProcess>> processSetter) {
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

    public DataObject withUserInfo(List<AlertUserInfo> userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public DataObject addUserInfoItem(AlertUserInfo userInfoItem) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        this.userInfo.add(userInfoItem);
        return this;
    }

    public DataObject withUserInfo(Consumer<List<AlertUserInfo>> userInfoSetter) {
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

    public DataObject withFileInfo(List<AlertFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    public DataObject addFileInfoItem(AlertFileInfo fileInfoItem) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        this.fileInfo.add(fileInfoItem);
        return this;
    }

    public DataObject withFileInfo(Consumer<List<AlertFileInfo>> fileInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataObject that = (DataObject) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.id, that.id)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.environment, that.environment)
            && Objects.equals(this.datasource, that.datasource)
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
            && Objects.equals(this.ipdrrPhase, that.ipdrrPhase) && Objects.equals(this.simulation, that.simulation)
            && Objects.equals(this.actor, that.actor) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.closeReason, that.closeReason)
            && Objects.equals(this.closeComment, that.closeComment) && Objects.equals(this.malware, that.malware)
            && Objects.equals(this.systemInfo, that.systemInfo) && Objects.equals(this.process, that.process)
            && Objects.equals(this.userInfo, that.userInfo) && Objects.equals(this.fileInfo, that.fileInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            id,
            domainId,
            regionId,
            workspaceId,
            environment,
            datasource,
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
            simulation,
            actor,
            owner,
            creator,
            closeReason,
            closeComment,
            malware,
            systemInfo,
            process,
            userInfo,
            fileInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataObject {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
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
        sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
        sb.append("    closeComment: ").append(toIndentedString(closeComment)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
        sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
        sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
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
