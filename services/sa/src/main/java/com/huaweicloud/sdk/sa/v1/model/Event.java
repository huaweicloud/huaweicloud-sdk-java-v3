package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * event
 */
public class Event {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private Environment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private DataSource dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_observed_time")

    private OffsetDateTime firstObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_observed_time")

    private OffsetDateTime lastObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrive_time")

    private OffsetDateTime arriveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private UUID eventId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private Severity severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criticality")

    private Integer criticality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Type type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance")

    private Compliance compliance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private Network network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_patch")

    private VulnerabilityPatch vulnerabilityPatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware")

    private Malware malware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threat_intel")

    private ThreatIntel threatIntel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private Resource resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private Remediation remediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_fields")

    private Object dataSourceFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_state")

    private String verificationState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla")

    private Integer sla;

    public Event withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * SA数据对象版本号，数据接入时需携带版本号。版本号由SA服务团队负责更新，数据源只可填写SA给定的版本号。目前版本为1.0.0。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Event withEnvironment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public Event withEnvironment(Consumer<Environment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new Environment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Event withDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Event withDataSource(Consumer<DataSource> dataSourceSetter) {
        if (this.dataSource == null) {
            this.dataSource = new DataSource();
            dataSourceSetter.accept(this.dataSource);
        }

        return this;
    }

    /**
     * Get dataSource
     * @return dataSource
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Event withFirstObservedTime(OffsetDateTime firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
        return this;
    }

    /**
     * 首次发现时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return firstObservedTime
     */
    public OffsetDateTime getFirstObservedTime() {
        return firstObservedTime;
    }

    public void setFirstObservedTime(OffsetDateTime firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
    }

    public Event withLastObservedTime(OffsetDateTime lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    /**
     * 最新发现时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return lastObservedTime
     */
    public OffsetDateTime getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(OffsetDateTime lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    public Event withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 记录时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public Event withArriveTime(OffsetDateTime arriveTime) {
        this.arriveTime = arriveTime;
        return this;
    }

    /**
     * 数据接收时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。  是指事件数据被SA侧接收的时间，由SA接收时填写，产品上报数据时不用填写。
     * @return arriveTime
     */
    public OffsetDateTime getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(OffsetDateTime arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Event withEventId(UUID eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件唯一标识，UUID格式。
     * @return eventId
     */
    public UUID getEventId() {
        return eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public Event withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 事件标题，最大255字符。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Event withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件描述信息，最大1024个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * 事件URL链接，指向数据源产品中有关当前事件说明的页面。
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Event withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 事件发生次数，默认为1，必填。
     * minimum: 1
     * maximum: 9223372036854775807
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Event withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 事件的置信度。置信度的定义旨在说明识别的行为或问题的可能性。 取值范围：0-100，0表示置信度为0%，100表示置信度为100%。
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

    public Event withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    public Event withSeverity(Consumer<Severity> severitySetter) {
        if (this.severity == null) {
            this.severity = new Severity();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public Event withCriticality(Integer criticality) {
        this.criticality = criticality;
        return this;
    }

    /**
     * 关键性，是指事件涉及的资源的重要性级别。 取值范围：0-100，0表示资源不关键，100表示最关键资源。
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

    public Event withType(Type type) {
        this.type = type;
        return this;
    }

    public Event withType(Consumer<Type> typeSetter) {
        if (this.type == null) {
            this.type = new Type();
            typeSetter.accept(this.type);
        }

        return this;
    }

    /**
     * Get type
     * @return type
     */
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Event withCompliance(Compliance compliance) {
        this.compliance = compliance;
        return this;
    }

    public Event withCompliance(Consumer<Compliance> complianceSetter) {
        if (this.compliance == null) {
            this.compliance = new Compliance();
            complianceSetter.accept(this.compliance);
        }

        return this;
    }

    /**
     * Get compliance
     * @return compliance
     */
    public Compliance getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    public Event withNetwork(Network network) {
        this.network = network;
        return this;
    }

    public Event withNetwork(Consumer<Network> networkSetter) {
        if (this.network == null) {
            this.network = new Network();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Event withVulnerabilityPatch(VulnerabilityPatch vulnerabilityPatch) {
        this.vulnerabilityPatch = vulnerabilityPatch;
        return this;
    }

    public Event withVulnerabilityPatch(Consumer<VulnerabilityPatch> vulnerabilityPatchSetter) {
        if (this.vulnerabilityPatch == null) {
            this.vulnerabilityPatch = new VulnerabilityPatch();
            vulnerabilityPatchSetter.accept(this.vulnerabilityPatch);
        }

        return this;
    }

    /**
     * Get vulnerabilityPatch
     * @return vulnerabilityPatch
     */
    public VulnerabilityPatch getVulnerabilityPatch() {
        return vulnerabilityPatch;
    }

    public void setVulnerabilityPatch(VulnerabilityPatch vulnerabilityPatch) {
        this.vulnerabilityPatch = vulnerabilityPatch;
    }

    public Event withMalware(Malware malware) {
        this.malware = malware;
        return this;
    }

    public Event withMalware(Consumer<Malware> malwareSetter) {
        if (this.malware == null) {
            this.malware = new Malware();
            malwareSetter.accept(this.malware);
        }

        return this;
    }

    /**
     * Get malware
     * @return malware
     */
    public Malware getMalware() {
        return malware;
    }

    public void setMalware(Malware malware) {
        this.malware = malware;
    }

    public Event withThreatIntel(ThreatIntel threatIntel) {
        this.threatIntel = threatIntel;
        return this;
    }

    public Event withThreatIntel(Consumer<ThreatIntel> threatIntelSetter) {
        if (this.threatIntel == null) {
            this.threatIntel = new ThreatIntel();
            threatIntelSetter.accept(this.threatIntel);
        }

        return this;
    }

    /**
     * Get threatIntel
     * @return threatIntel
     */
    public ThreatIntel getThreatIntel() {
        return threatIntel;
    }

    public void setThreatIntel(ThreatIntel threatIntel) {
        this.threatIntel = threatIntel;
    }

    public Event withResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public Event withResource(Consumer<Resource> resourceSetter) {
        if (this.resource == null) {
            this.resource = new Resource();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Event withRemediation(Remediation remediation) {
        this.remediation = remediation;
        return this;
    }

    public Event withRemediation(Consumer<Remediation> remediationSetter) {
        if (this.remediation == null) {
            this.remediation = new Remediation();
            remediationSetter.accept(this.remediation);
        }

        return this;
    }

    /**
     * Get remediation
     * @return remediation
     */
    public Remediation getRemediation() {
        return remediation;
    }

    public void setRemediation(Remediation remediation) {
        this.remediation = remediation;
    }

    public Event withDataSourceFields(Object dataSourceFields) {
        this.dataSourceFields = dataSourceFields;
        return this;
    }

    /**
     * 数据源自定义信息，最多支持50个key/value对，约束条件： 1、该对象不能包含冗余数据，并且不能与已定义的SSA事件格式字段冲突。 2、字段名称可以包含字母数字字符、空格和以下符号：_ . / = + \\ - @。 示例： \"data_source_fields\": {     \"key1\": \"value1\",     \"key2\", \"value2\",   }
     * @return dataSourceFields
     */
    public Object getDataSourceFields() {
        return dataSourceFields;
    }

    public void setDataSourceFields(Object dataSourceFields) {
        this.dataSourceFields = dataSourceFields;
    }

    public Event withVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * 事件验证状态，标识事件的准确性。 Unknown – 未知，默认 True_positive – 确认 False_positive – 误报。
     * @return verificationState
     */
    public String getVerificationState() {
        return verificationState;
    }

    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    public Event withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 事件处理状态，New/Ignored/Resolved；默认New。
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public Event withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 阶段：Prepartion|Detection and Analysis|Containm，Eradication& Recovery| Post-Incident-Activity。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Event withSla(Integer sla) {
        this.sla = sla;
        return this;
    }

    /**
     * 约束闭环时间：单位：天。
     * minimum: 1
     * maximum: 90
     * @return sla
     */
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event that = (Event) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.environment, that.environment)
            && Objects.equals(this.dataSource, that.dataSource)
            && Objects.equals(this.firstObservedTime, that.firstObservedTime)
            && Objects.equals(this.lastObservedTime, that.lastObservedTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.arriveTime, that.arriveTime)
            && Objects.equals(this.eventId, that.eventId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.sourceUrl, that.sourceUrl)
            && Objects.equals(this.count, that.count) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.criticality, that.criticality)
            && Objects.equals(this.type, that.type) && Objects.equals(this.compliance, that.compliance)
            && Objects.equals(this.network, that.network)
            && Objects.equals(this.vulnerabilityPatch, that.vulnerabilityPatch)
            && Objects.equals(this.malware, that.malware) && Objects.equals(this.threatIntel, that.threatIntel)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.remediation, that.remediation)
            && Objects.equals(this.dataSourceFields, that.dataSourceFields)
            && Objects.equals(this.verificationState, that.verificationState)
            && Objects.equals(this.handleStatus, that.handleStatus) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.sla, that.sla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            environment,
            dataSource,
            firstObservedTime,
            lastObservedTime,
            createTime,
            arriveTime,
            eventId,
            title,
            description,
            sourceUrl,
            count,
            confidence,
            severity,
            criticality,
            type,
            compliance,
            network,
            vulnerabilityPatch,
            malware,
            threatIntel,
            resource,
            remediation,
            dataSourceFields,
            verificationState,
            handleStatus,
            phase,
            sla);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    firstObservedTime: ").append(toIndentedString(firstObservedTime)).append("\n");
        sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    arriveTime: ").append(toIndentedString(arriveTime)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    vulnerabilityPatch: ").append(toIndentedString(vulnerabilityPatch)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
        sb.append("    threatIntel: ").append(toIndentedString(threatIntel)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    dataSourceFields: ").append(toIndentedString(dataSourceFields)).append("\n");
        sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
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
