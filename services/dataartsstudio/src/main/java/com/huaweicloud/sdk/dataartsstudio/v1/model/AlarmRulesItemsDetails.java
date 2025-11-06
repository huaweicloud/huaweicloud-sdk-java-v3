package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmRulesItemsDetails
 */
public class AlarmRulesItemsDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private Long nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_type")

    private Integer remindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_type")

    private Integer notifyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_number")

    private String displayNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callee_number")

    private String calleeNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_time")

    private String completeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_flag")

    private Integer useFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_periods")

    private List<AlarmPeriod> alarmPeriods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_directory")

    private List<DirectoryDTO> jobDirectory = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id_list")

    private List<Long> nodeIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name_list")

    private List<String> nodeNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_mode")

    private String addMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_type")

    private String subjectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_method")

    private String notifyMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_persons")

    private String otherPersons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_send_times")

    private Integer maxSendTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_interval")

    private Integer sendInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duty_schedule_id")

    private Long dutyScheduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_config_id")

    private String smnConfigId;

    public AlarmRulesItemsDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlarmRulesItemsDetails withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID，与业务无关。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AlarmRulesItemsDetails withNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 作业ID/节点任务ID。
     * @return nodeId
     */
    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public AlarmRulesItemsDetails withRemindType(Integer remindType) {
        this.remindType = remindType;
        return this;
    }

    /**
     * 通知类型，0:完成;1:运行异常;3:未完成; 4:资源繁忙; 5-11基线相关的告警。
     * @return remindType
     */
    public Integer getRemindType() {
        return remindType;
    }

    public void setRemindType(Integer remindType) {
        this.remindType = remindType;
    }

    public AlarmRulesItemsDetails withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * 租户创建的smn服务的topic名称。
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public AlarmRulesItemsDetails withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * topic对应URN。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public AlarmRulesItemsDetails withNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
        return this;
    }

    /**
     * 节点类型，1:作业; 2: 节点任务; 3: 基线任务。
     * @return notifyType
     */
    public Integer getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
    }

    public AlarmRulesItemsDetails withDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
        return this;
    }

    /**
     * 责任人电话。
     * @return displayNumber
     */
    public String getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
    }

    public AlarmRulesItemsDetails withCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
        return this;
    }

    /**
     * 被叫方的电话。
     * @return calleeNumber
     */
    public String getCalleeNumber() {
        return calleeNumber;
    }

    public void setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
    }

    public AlarmRulesItemsDetails withCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * 完成时间。
     * @return completeTime
     */
    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public AlarmRulesItemsDetails withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AlarmRulesItemsDetails withUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
        return this;
    }

    /**
     * 开关。
     * @return useFlag
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public AlarmRulesItemsDetails withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public AlarmRulesItemsDetails withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AlarmRulesItemsDetails withAlarmPeriods(List<AlarmPeriod> alarmPeriods) {
        this.alarmPeriods = alarmPeriods;
        return this;
    }

    public AlarmRulesItemsDetails addAlarmPeriodsItem(AlarmPeriod alarmPeriodsItem) {
        if (this.alarmPeriods == null) {
            this.alarmPeriods = new ArrayList<>();
        }
        this.alarmPeriods.add(alarmPeriodsItem);
        return this;
    }

    public AlarmRulesItemsDetails withAlarmPeriods(Consumer<List<AlarmPeriod>> alarmPeriodsSetter) {
        if (this.alarmPeriods == null) {
            this.alarmPeriods = new ArrayList<>();
        }
        alarmPeriodsSetter.accept(this.alarmPeriods);
        return this;
    }

    /**
     * 任务告警信息。
     * @return alarmPeriods
     */
    public List<AlarmPeriod> getAlarmPeriods() {
        return alarmPeriods;
    }

    public void setAlarmPeriods(List<AlarmPeriod> alarmPeriods) {
        this.alarmPeriods = alarmPeriods;
    }

    public AlarmRulesItemsDetails withJobDirectory(List<DirectoryDTO> jobDirectory) {
        this.jobDirectory = jobDirectory;
        return this;
    }

    public AlarmRulesItemsDetails addJobDirectoryItem(DirectoryDTO jobDirectoryItem) {
        if (this.jobDirectory == null) {
            this.jobDirectory = new ArrayList<>();
        }
        this.jobDirectory.add(jobDirectoryItem);
        return this;
    }

    public AlarmRulesItemsDetails withJobDirectory(Consumer<List<DirectoryDTO>> jobDirectorySetter) {
        if (this.jobDirectory == null) {
            this.jobDirectory = new ArrayList<>();
        }
        jobDirectorySetter.accept(this.jobDirectory);
        return this;
    }

    /**
     * 作业目录信息。
     * @return jobDirectory
     */
    public List<DirectoryDTO> getJobDirectory() {
        return jobDirectory;
    }

    public void setJobDirectory(List<DirectoryDTO> jobDirectory) {
        this.jobDirectory = jobDirectory;
    }

    public AlarmRulesItemsDetails withNodeIdList(List<Long> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }

    public AlarmRulesItemsDetails addNodeIdListItem(Long nodeIdListItem) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        this.nodeIdList.add(nodeIdListItem);
        return this;
    }

    public AlarmRulesItemsDetails withNodeIdList(Consumer<List<Long>> nodeIdListSetter) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        nodeIdListSetter.accept(this.nodeIdList);
        return this;
    }

    /**
     * 作业ID/节点任务ID。
     * @return nodeIdList
     */
    public List<Long> getNodeIdList() {
        return nodeIdList;
    }

    public void setNodeIdList(List<Long> nodeIdList) {
        this.nodeIdList = nodeIdList;
    }

    public AlarmRulesItemsDetails withNodeNameList(List<String> nodeNameList) {
        this.nodeNameList = nodeNameList;
        return this;
    }

    public AlarmRulesItemsDetails addNodeNameListItem(String nodeNameListItem) {
        if (this.nodeNameList == null) {
            this.nodeNameList = new ArrayList<>();
        }
        this.nodeNameList.add(nodeNameListItem);
        return this;
    }

    public AlarmRulesItemsDetails withNodeNameList(Consumer<List<String>> nodeNameListSetter) {
        if (this.nodeNameList == null) {
            this.nodeNameList = new ArrayList<>();
        }
        nodeNameListSetter.accept(this.nodeNameList);
        return this;
    }

    /**
     * 作业名称/作业名称.节点任务名称。
     * @return nodeNameList
     */
    public List<String> getNodeNameList() {
        return nodeNameList;
    }

    public void setNodeNameList(List<String> nodeNameList) {
        this.nodeNameList = nodeNameList;
    }

    public AlarmRulesItemsDetails withAddMode(String addMode) {
        this.addMode = addMode;
        return this;
    }

    /**
     * 添加类型。
     * @return addMode
     */
    public String getAddMode() {
        return addMode;
    }

    public void setAddMode(String addMode) {
        this.addMode = addMode;
    }

    public AlarmRulesItemsDetails withSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }

    /**
     * 告警对象类型。
     * @return subjectType
     */
    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public AlarmRulesItemsDetails withNotifyMethod(String notifyMethod) {
        this.notifyMethod = notifyMethod;
        return this;
    }

    /**
     * 告警方式。
     * @return notifyMethod
     */
    public String getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(String notifyMethod) {
        this.notifyMethod = notifyMethod;
    }

    public AlarmRulesItemsDetails withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 终端协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public AlarmRulesItemsDetails withOtherPersons(String otherPersons) {
        this.otherPersons = otherPersons;
        return this;
    }

    /**
     * 抄送人。
     * @return otherPersons
     */
    public String getOtherPersons() {
        return otherPersons;
    }

    public void setOtherPersons(String otherPersons) {
        this.otherPersons = otherPersons;
    }

    public AlarmRulesItemsDetails withMaxSendTimes(Integer maxSendTimes) {
        this.maxSendTimes = maxSendTimes;
        return this;
    }

    /**
     * 最大通知次数。
     * @return maxSendTimes
     */
    public Integer getMaxSendTimes() {
        return maxSendTimes;
    }

    public void setMaxSendTimes(Integer maxSendTimes) {
        this.maxSendTimes = maxSendTimes;
    }

    public AlarmRulesItemsDetails withSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
        return this;
    }

    /**
     * 最小通知间隔，单位分钟。
     * @return sendInterval
     */
    public Integer getSendInterval() {
        return sendInterval;
    }

    public void setSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
    }

    public AlarmRulesItemsDetails withDutyScheduleId(Long dutyScheduleId) {
        this.dutyScheduleId = dutyScheduleId;
        return this;
    }

    /**
     * 值班表id。
     * @return dutyScheduleId
     */
    public Long getDutyScheduleId() {
        return dutyScheduleId;
    }

    public void setDutyScheduleId(Long dutyScheduleId) {
        this.dutyScheduleId = dutyScheduleId;
    }

    public AlarmRulesItemsDetails withSmnConfigId(String smnConfigId) {
        this.smnConfigId = smnConfigId;
        return this;
    }

    /**
     * smn配置id。
     * @return smnConfigId
     */
    public String getSmnConfigId() {
        return smnConfigId;
    }

    public void setSmnConfigId(String smnConfigId) {
        this.smnConfigId = smnConfigId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmRulesItemsDetails that = (AlarmRulesItemsDetails) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.remindType, that.remindType)
            && Objects.equals(this.topicName, that.topicName) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.notifyType, that.notifyType)
            && Objects.equals(this.displayNumber, that.displayNumber)
            && Objects.equals(this.calleeNumber, that.calleeNumber)
            && Objects.equals(this.completeTime, that.completeTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.useFlag, that.useFlag) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.alarmPeriods, that.alarmPeriods)
            && Objects.equals(this.jobDirectory, that.jobDirectory) && Objects.equals(this.nodeIdList, that.nodeIdList)
            && Objects.equals(this.nodeNameList, that.nodeNameList) && Objects.equals(this.addMode, that.addMode)
            && Objects.equals(this.subjectType, that.subjectType)
            && Objects.equals(this.notifyMethod, that.notifyMethod) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.otherPersons, that.otherPersons)
            && Objects.equals(this.maxSendTimes, that.maxSendTimes)
            && Objects.equals(this.sendInterval, that.sendInterval)
            && Objects.equals(this.dutyScheduleId, that.dutyScheduleId)
            && Objects.equals(this.smnConfigId, that.smnConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            nodeId,
            remindType,
            topicName,
            urn,
            notifyType,
            displayNumber,
            calleeNumber,
            completeTime,
            createTime,
            useFlag,
            createUser,
            ruleName,
            alarmPeriods,
            jobDirectory,
            nodeIdList,
            nodeNameList,
            addMode,
            subjectType,
            notifyMethod,
            protocol,
            otherPersons,
            maxSendTimes,
            sendInterval,
            dutyScheduleId,
            smnConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmRulesItemsDetails {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    remindType: ").append(toIndentedString(remindType)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    notifyType: ").append(toIndentedString(notifyType)).append("\n");
        sb.append("    displayNumber: ").append(toIndentedString(displayNumber)).append("\n");
        sb.append("    calleeNumber: ").append(toIndentedString(calleeNumber)).append("\n");
        sb.append("    completeTime: ").append(toIndentedString(completeTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    useFlag: ").append(toIndentedString(useFlag)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    alarmPeriods: ").append(toIndentedString(alarmPeriods)).append("\n");
        sb.append("    jobDirectory: ").append(toIndentedString(jobDirectory)).append("\n");
        sb.append("    nodeIdList: ").append(toIndentedString(nodeIdList)).append("\n");
        sb.append("    nodeNameList: ").append(toIndentedString(nodeNameList)).append("\n");
        sb.append("    addMode: ").append(toIndentedString(addMode)).append("\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
        sb.append("    notifyMethod: ").append(toIndentedString(notifyMethod)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    otherPersons: ").append(toIndentedString(otherPersons)).append("\n");
        sb.append("    maxSendTimes: ").append(toIndentedString(maxSendTimes)).append("\n");
        sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
        sb.append("    dutyScheduleId: ").append(toIndentedString(dutyScheduleId)).append("\n");
        sb.append("    smnConfigId: ").append(toIndentedString(smnConfigId)).append("\n");
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
