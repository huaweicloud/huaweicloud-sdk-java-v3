package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sa.v1.model.Compliance;
import com.huaweicloud.sdk.sa.v1.model.DataSource;
import com.huaweicloud.sdk.sa.v1.model.EventRemediation;
import com.huaweicloud.sdk.sa.v1.model.Malware;
import com.huaweicloud.sdk.sa.v1.model.Network;
import com.huaweicloud.sdk.sa.v1.model.Process;
import com.huaweicloud.sdk.sa.v1.model.RelatedEvent;
import com.huaweicloud.sdk.sa.v1.model.Resource;
import com.huaweicloud.sdk.sa.v1.model.Severity;
import com.huaweicloud.sdk.sa.v1.model.ThreatIntel;
import com.huaweicloud.sdk.sa.v1.model.Type;
import com.huaweicloud.sdk.sa.v1.model.Vulnerabilities;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * event
 */
public class Event  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_source")
    
    private DataSource dataSource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="first_observed_time")
    
    private OffsetDateTime firstObservedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_observed_time")
    
    private OffsetDateTime lastObservedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arrive_time")
    
    private OffsetDateTime arriveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_id")
    
    private UUID eventId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_url")
    
    private String sourceUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private Integer confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="severity")
    
    private Severity severity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="criticality")
    
    private Integer criticality;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_code")
    
    private String businessCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="types")
    
    private List<Type> types = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compliance")
    
    private Compliance compliance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network")
    
    private Network network;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="process")
    
    private Process process;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vulnerabilities")
    
    private Vulnerabilities vulnerabilities;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="malware")
    
    private List<Malware> malware = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threat_intel")
    
    private List<ThreatIntel> threatIntel = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<Resource> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remediation")
    
    private EventRemediation remediation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="related_events")
    
    private List<RelatedEvent> relatedEvents = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_source_fields")
    
    private Object dataSourceFields;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verification_state")
    
    private String verificationState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="handle_status")
    
    private String handleStatus;

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

    

    public Event withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 租户账号ID，用来标识事件所属租户。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public Event withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID，用来标识事件所属项目区域。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public Event withDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Event withDataSource(Consumer<DataSource> dataSourceSetter) {
        if(this.dataSource == null ){
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
        if(this.severity == null ){
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

    

    public Event withBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }

    


    /**
     * 业务类型。 attack：攻击；vulnerability：漏洞；compliance check：合规检查； risk：风险；public opinion：舆情；illegal&violation：违法违规；security bulletin：公告。
     * @return businessCode
     */
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    

    public Event withTypes(List<Type> types) {
        this.types = types;
        return this;
    }

    
    public Event addTypesItem(Type typesItem) {
        if(this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public Event withTypes(Consumer<List<Type>> typesSetter) {
        if(this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 事件分类，最多50个。
     * @return types
     */
    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    

    public Event withCompliance(Compliance compliance) {
        this.compliance = compliance;
        return this;
    }

    public Event withCompliance(Consumer<Compliance> complianceSetter) {
        if(this.compliance == null ){
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
        if(this.network == null ){
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

    

    public Event withProcess(Process process) {
        this.process = process;
        return this;
    }

    public Event withProcess(Consumer<Process> processSetter) {
        if(this.process == null ){
            this.process = new Process();
            processSetter.accept(this.process);
        }
        
        return this;
    }


    /**
     * Get process
     * @return process
     */
    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    

    public Event withVulnerabilities(Vulnerabilities vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public Event withVulnerabilities(Consumer<Vulnerabilities> vulnerabilitiesSetter) {
        if(this.vulnerabilities == null ){
            this.vulnerabilities = new Vulnerabilities();
            vulnerabilitiesSetter.accept(this.vulnerabilities);
        }
        
        return this;
    }


    /**
     * Get vulnerabilities
     * @return vulnerabilities
     */
    public Vulnerabilities getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(Vulnerabilities vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    

    public Event withMalware(List<Malware> malware) {
        this.malware = malware;
        return this;
    }

    
    public Event addMalwareItem(Malware malwareItem) {
        if(this.malware == null) {
            this.malware = new ArrayList<>();
        }
        this.malware.add(malwareItem);
        return this;
    }

    public Event withMalware(Consumer<List<Malware>> malwareSetter) {
        if(this.malware == null) {
            this.malware = new ArrayList<>();
        }
        malwareSetter.accept(this.malware);
        return this;
    }

    /**
     * 恶意软件，最多5个。
     * @return malware
     */
    public List<Malware> getMalware() {
        return malware;
    }

    public void setMalware(List<Malware> malware) {
        this.malware = malware;
    }

    

    public Event withThreatIntel(List<ThreatIntel> threatIntel) {
        this.threatIntel = threatIntel;
        return this;
    }

    
    public Event addThreatIntelItem(ThreatIntel threatIntelItem) {
        if(this.threatIntel == null) {
            this.threatIntel = new ArrayList<>();
        }
        this.threatIntel.add(threatIntelItem);
        return this;
    }

    public Event withThreatIntel(Consumer<List<ThreatIntel>> threatIntelSetter) {
        if(this.threatIntel == null) {
            this.threatIntel = new ArrayList<>();
        }
        threatIntelSetter.accept(this.threatIntel);
        return this;
    }

    /**
     * 威胁情报，最多5个。
     * @return threatIntel
     */
    public List<ThreatIntel> getThreatIntel() {
        return threatIntel;
    }

    public void setThreatIntel(List<ThreatIntel> threatIntel) {
        this.threatIntel = threatIntel;
    }

    

    public Event withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    
    public Event addResourcesItem(Resource resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public Event withResources(Consumer<List<Resource>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 受影响资源，最多10个。
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    

    public Event withRemediation(EventRemediation remediation) {
        this.remediation = remediation;
        return this;
    }

    public Event withRemediation(Consumer<EventRemediation> remediationSetter) {
        if(this.remediation == null ){
            this.remediation = new EventRemediation();
            remediationSetter.accept(this.remediation);
        }
        
        return this;
    }


    /**
     * Get remediation
     * @return remediation
     */
    public EventRemediation getRemediation() {
        return remediation;
    }

    public void setRemediation(EventRemediation remediation) {
        this.remediation = remediation;
    }

    

    public Event withRelatedEvents(List<RelatedEvent> relatedEvents) {
        this.relatedEvents = relatedEvents;
        return this;
    }

    
    public Event addRelatedEventsItem(RelatedEvent relatedEventsItem) {
        if(this.relatedEvents == null) {
            this.relatedEvents = new ArrayList<>();
        }
        this.relatedEvents.add(relatedEventsItem);
        return this;
    }

    public Event withRelatedEvents(Consumer<List<RelatedEvent>> relatedEventsSetter) {
        if(this.relatedEvents == null) {
            this.relatedEvents = new ArrayList<>();
        }
        relatedEventsSetter.accept(this.relatedEvents);
        return this;
    }

    /**
     * 相关事件。
     * @return relatedEvents
     */
    public List<RelatedEvent> getRelatedEvents() {
        return relatedEvents;
    }

    public void setRelatedEvents(List<RelatedEvent> relatedEvents) {
        this.relatedEvents = relatedEvents;
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(this.version, event.version) &&
            Objects.equals(this.domainId, event.domainId) &&
            Objects.equals(this.projectId, event.projectId) &&
            Objects.equals(this.dataSource, event.dataSource) &&
            Objects.equals(this.firstObservedTime, event.firstObservedTime) &&
            Objects.equals(this.lastObservedTime, event.lastObservedTime) &&
            Objects.equals(this.createTime, event.createTime) &&
            Objects.equals(this.arriveTime, event.arriveTime) &&
            Objects.equals(this.eventId, event.eventId) &&
            Objects.equals(this.title, event.title) &&
            Objects.equals(this.description, event.description) &&
            Objects.equals(this.sourceUrl, event.sourceUrl) &&
            Objects.equals(this.count, event.count) &&
            Objects.equals(this.confidence, event.confidence) &&
            Objects.equals(this.severity, event.severity) &&
            Objects.equals(this.criticality, event.criticality) &&
            Objects.equals(this.businessCode, event.businessCode) &&
            Objects.equals(this.types, event.types) &&
            Objects.equals(this.compliance, event.compliance) &&
            Objects.equals(this.network, event.network) &&
            Objects.equals(this.process, event.process) &&
            Objects.equals(this.vulnerabilities, event.vulnerabilities) &&
            Objects.equals(this.malware, event.malware) &&
            Objects.equals(this.threatIntel, event.threatIntel) &&
            Objects.equals(this.resources, event.resources) &&
            Objects.equals(this.remediation, event.remediation) &&
            Objects.equals(this.relatedEvents, event.relatedEvents) &&
            Objects.equals(this.dataSourceFields, event.dataSourceFields) &&
            Objects.equals(this.verificationState, event.verificationState) &&
            Objects.equals(this.handleStatus, event.handleStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version, domainId, projectId, dataSource, firstObservedTime, lastObservedTime, createTime, arriveTime, eventId, title, description, sourceUrl, count, confidence, severity, criticality, businessCode, types, compliance, network, process, vulnerabilities, malware, threatIntel, resources, remediation, relatedEvents, dataSourceFields, verificationState, handleStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
        sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
        sb.append("    threatIntel: ").append(toIndentedString(threatIntel)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    relatedEvents: ").append(toIndentedString(relatedEvents)).append("\n");
        sb.append("    dataSourceFields: ").append(toIndentedString(dataSourceFields)).append("\n");
        sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
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

