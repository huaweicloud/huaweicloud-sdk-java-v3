package com.huaweicloud.sdk.coc.v1.model;

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
 * 创建定时任务请求体
 */
public class ScheduledTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_infos")

    private List<TicketInfo> ticketInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_no")

    private String versionNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private TriggerTime triggerTime;

    /**
     * 任务类型
     */
    public static final class TaskTypeEnum {

        /**
         * Enum RUNBOOK for value: "RUNBOOK"
         */
        public static final TaskTypeEnum RUNBOOK = new TaskTypeEnum("RUNBOOK");

        /**
         * Enum SCRIPT for value: "SCRIPT"
         */
        public static final TaskTypeEnum SCRIPT = new TaskTypeEnum("SCRIPT");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("RUNBOOK", RUNBOOK);
            map.put("SCRIPT", SCRIPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private TaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_id")

    private String associatedTaskId;

    /**
     * 关联任务的类型
     */
    public static final class AssociatedTaskTypeEnum {

        /**
         * Enum COMMUNAL for value: "COMMUNAL"
         */
        public static final AssociatedTaskTypeEnum COMMUNAL = new AssociatedTaskTypeEnum("COMMUNAL");

        /**
         * Enum CUSTOMIZATION for value: "CUSTOMIZATION"
         */
        public static final AssociatedTaskTypeEnum CUSTOMIZATION = new AssociatedTaskTypeEnum("CUSTOMIZATION");

        private static final Map<String, AssociatedTaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssociatedTaskTypeEnum> createStaticFields() {
            Map<String, AssociatedTaskTypeEnum> map = new HashMap<>();
            map.put("COMMUNAL", COMMUNAL);
            map.put("CUSTOMIZATION", CUSTOMIZATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssociatedTaskTypeEnum(String value) {
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
        public static AssociatedTaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssociatedTaskTypeEnum(value));
        }

        public static AssociatedTaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssociatedTaskTypeEnum) {
                return this.value.equals(((AssociatedTaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_type")

    private AssociatedTaskTypeEnum associatedTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name")

    private String associatedTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name_en")

    private String associatedTaskNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_enterprise_project_id")

    private String associatedTaskEnterpriseProjectId;

    /**
     * 作业实例模式
     */
    public static final class RunbookInstanceModeEnum {

        /**
         * Enum SAME for value: "SAME"
         */
        public static final RunbookInstanceModeEnum SAME = new RunbookInstanceModeEnum("SAME");

        /**
         * Enum DIFF for value: "DIFF"
         */
        public static final RunbookInstanceModeEnum DIFF = new RunbookInstanceModeEnum("DIFF");

        private static final Map<String, RunbookInstanceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RunbookInstanceModeEnum> createStaticFields() {
            Map<String, RunbookInstanceModeEnum> map = new HashMap<>();
            map.put("SAME", SAME);
            map.put("DIFF", DIFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RunbookInstanceModeEnum(String value) {
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
        public static RunbookInstanceModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RunbookInstanceModeEnum(value));
        }

        public static RunbookInstanceModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RunbookInstanceModeEnum) {
                return this.value.equals(((RunbookInstanceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runbook_instance_mode")

    private RunbookInstanceModeEnum runbookInstanceMode;

    /**
     * 风险等级
     */
    public static final class RiskLevelEnum {

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final RiskLevelEnum HIGH = new RiskLevelEnum("HIGH");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final RiskLevelEnum MEDIUM = new RiskLevelEnum("MEDIUM");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final RiskLevelEnum LOW = new RiskLevelEnum("LOW");

        private static final Map<String, RiskLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskLevelEnum> createStaticFields() {
            Map<String, RiskLevelEnum> map = new HashMap<>();
            map.put("HIGH", HIGH);
            map.put("MEDIUM", MEDIUM);
            map.put("LOW", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskLevelEnum(String value) {
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
        public static RiskLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskLevelEnum(value));
        }

        public static RiskLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskLevelEnum) {
                return this.value.equals(((RiskLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private RiskLevelEnum riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_param")

    private Map<String, String> inputParam = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instances")

    private List<ScheduleInstance> targetInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_approve")

    private Boolean enableApprove;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_notification")

    private MessageNotification reviewerNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_user_name")

    private String reviewerUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_message_notification")

    private Boolean enableMessageNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_notification")

    private MessageNotification messageNotification;

    public ScheduledTaskRequestBody withTicketInfos(List<TicketInfo> ticketInfos) {
        this.ticketInfos = ticketInfos;
        return this;
    }

    public ScheduledTaskRequestBody addTicketInfosItem(TicketInfo ticketInfosItem) {
        if (this.ticketInfos == null) {
            this.ticketInfos = new ArrayList<>();
        }
        this.ticketInfos.add(ticketInfosItem);
        return this;
    }

    public ScheduledTaskRequestBody withTicketInfos(Consumer<List<TicketInfo>> ticketInfosSetter) {
        if (this.ticketInfos == null) {
            this.ticketInfos = new ArrayList<>();
        }
        ticketInfosSetter.accept(this.ticketInfos);
        return this;
    }

    /**
     * 选择的四号提权单信息
     * @return ticketInfos
     */
    public List<TicketInfo> getTicketInfos() {
        return ticketInfos;
    }

    public void setTicketInfos(List<TicketInfo> ticketInfos) {
        this.ticketInfos = ticketInfos;
    }

    public ScheduledTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScheduledTaskRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ScheduledTaskRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ScheduledTaskRequestBody withVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }

    /**
     * 版本号
     * @return versionNo
     */
    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public ScheduledTaskRequestBody withTriggerTime(TriggerTime triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    public ScheduledTaskRequestBody withTriggerTime(Consumer<TriggerTime> triggerTimeSetter) {
        if (this.triggerTime == null) {
            this.triggerTime = new TriggerTime();
            triggerTimeSetter.accept(this.triggerTime);
        }

        return this;
    }

    /**
     * Get triggerTime
     * @return triggerTime
     */
    public TriggerTime getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(TriggerTime triggerTime) {
        this.triggerTime = triggerTime;
    }

    public ScheduledTaskRequestBody withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ScheduledTaskRequestBody withAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
        return this;
    }

    /**
     * 关联任务ID（脚本ID/作业ID）
     * @return associatedTaskId
     */
    public String getAssociatedTaskId() {
        return associatedTaskId;
    }

    public void setAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
    }

    public ScheduledTaskRequestBody withAssociatedTaskType(AssociatedTaskTypeEnum associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
        return this;
    }

    /**
     * 关联任务的类型
     * @return associatedTaskType
     */
    public AssociatedTaskTypeEnum getAssociatedTaskType() {
        return associatedTaskType;
    }

    public void setAssociatedTaskType(AssociatedTaskTypeEnum associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
    }

    public ScheduledTaskRequestBody withAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
        return this;
    }

    /**
     * 关联任务名称（脚本名称/作业名称）
     * @return associatedTaskName
     */
    public String getAssociatedTaskName() {
        return associatedTaskName;
    }

    public void setAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
    }

    public ScheduledTaskRequestBody withAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
        return this;
    }

    /**
     * 关联任务名称(英文)（脚本名称/作业名称）
     * @return associatedTaskNameEn
     */
    public String getAssociatedTaskNameEn() {
        return associatedTaskNameEn;
    }

    public void setAssociatedTaskNameEn(String associatedTaskNameEn) {
        this.associatedTaskNameEn = associatedTaskNameEn;
    }

    public ScheduledTaskRequestBody withAssociatedTaskEnterpriseProjectId(String associatedTaskEnterpriseProjectId) {
        this.associatedTaskEnterpriseProjectId = associatedTaskEnterpriseProjectId;
        return this;
    }

    /**
     * 关联任务的企业项目ID
     * @return associatedTaskEnterpriseProjectId
     */
    public String getAssociatedTaskEnterpriseProjectId() {
        return associatedTaskEnterpriseProjectId;
    }

    public void setAssociatedTaskEnterpriseProjectId(String associatedTaskEnterpriseProjectId) {
        this.associatedTaskEnterpriseProjectId = associatedTaskEnterpriseProjectId;
    }

    public ScheduledTaskRequestBody withRunbookInstanceMode(RunbookInstanceModeEnum runbookInstanceMode) {
        this.runbookInstanceMode = runbookInstanceMode;
        return this;
    }

    /**
     * 作业实例模式
     * @return runbookInstanceMode
     */
    public RunbookInstanceModeEnum getRunbookInstanceMode() {
        return runbookInstanceMode;
    }

    public void setRunbookInstanceMode(RunbookInstanceModeEnum runbookInstanceMode) {
        this.runbookInstanceMode = runbookInstanceMode;
    }

    public ScheduledTaskRequestBody withRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public RiskLevelEnum getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ScheduledTaskRequestBody withInputParam(Map<String, String> inputParam) {
        this.inputParam = inputParam;
        return this;
    }

    public ScheduledTaskRequestBody putInputParamItem(String key, String inputParamItem) {
        if (this.inputParam == null) {
            this.inputParam = new HashMap<>();
        }
        this.inputParam.put(key, inputParamItem);
        return this;
    }

    public ScheduledTaskRequestBody withInputParam(Consumer<Map<String, String>> inputParamSetter) {
        if (this.inputParam == null) {
            this.inputParam = new HashMap<>();
        }
        inputParamSetter.accept(this.inputParam);
        return this;
    }

    /**
     * 执行参数，值为json串
     * @return inputParam
     */
    public Map<String, String> getInputParam() {
        return inputParam;
    }

    public void setInputParam(Map<String, String> inputParam) {
        this.inputParam = inputParam;
    }

    public ScheduledTaskRequestBody withTargetInstances(List<ScheduleInstance> targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    public ScheduledTaskRequestBody addTargetInstancesItem(ScheduleInstance targetInstancesItem) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        this.targetInstances.add(targetInstancesItem);
        return this;
    }

    public ScheduledTaskRequestBody withTargetInstances(Consumer<List<ScheduleInstance>> targetInstancesSetter) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        targetInstancesSetter.accept(this.targetInstances);
        return this;
    }

    /**
     * 目标实例信息
     * @return targetInstances
     */
    public List<ScheduleInstance> getTargetInstances() {
        return targetInstances;
    }

    public void setTargetInstances(List<ScheduleInstance> targetInstances) {
        this.targetInstances = targetInstances;
    }

    public ScheduledTaskRequestBody withEnableApprove(Boolean enableApprove) {
        this.enableApprove = enableApprove;
        return this;
    }

    /**
     * 是否开启入库人工审核
     * @return enableApprove
     */
    public Boolean getEnableApprove() {
        return enableApprove;
    }

    public void setEnableApprove(Boolean enableApprove) {
        this.enableApprove = enableApprove;
    }

    public ScheduledTaskRequestBody withReviewerNotification(MessageNotification reviewerNotification) {
        this.reviewerNotification = reviewerNotification;
        return this;
    }

    public ScheduledTaskRequestBody withReviewerNotification(Consumer<MessageNotification> reviewerNotificationSetter) {
        if (this.reviewerNotification == null) {
            this.reviewerNotification = new MessageNotification();
            reviewerNotificationSetter.accept(this.reviewerNotification);
        }

        return this;
    }

    /**
     * Get reviewerNotification
     * @return reviewerNotification
     */
    public MessageNotification getReviewerNotification() {
        return reviewerNotification;
    }

    public void setReviewerNotification(MessageNotification reviewerNotification) {
        this.reviewerNotification = reviewerNotification;
    }

    public ScheduledTaskRequestBody withReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
        return this;
    }

    /**
     * 审核人昵称
     * @return reviewerUserName
     */
    public String getReviewerUserName() {
        return reviewerUserName;
    }

    public void setReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
    }

    public ScheduledTaskRequestBody withEnableMessageNotification(Boolean enableMessageNotification) {
        this.enableMessageNotification = enableMessageNotification;
        return this;
    }

    /**
     * 是否启用消息通知
     * @return enableMessageNotification
     */
    public Boolean getEnableMessageNotification() {
        return enableMessageNotification;
    }

    public void setEnableMessageNotification(Boolean enableMessageNotification) {
        this.enableMessageNotification = enableMessageNotification;
    }

    public ScheduledTaskRequestBody withMessageNotification(MessageNotification messageNotification) {
        this.messageNotification = messageNotification;
        return this;
    }

    public ScheduledTaskRequestBody withMessageNotification(Consumer<MessageNotification> messageNotificationSetter) {
        if (this.messageNotification == null) {
            this.messageNotification = new MessageNotification();
            messageNotificationSetter.accept(this.messageNotification);
        }

        return this;
    }

    /**
     * Get messageNotification
     * @return messageNotification
     */
    public MessageNotification getMessageNotification() {
        return messageNotification;
    }

    public void setMessageNotification(MessageNotification messageNotification) {
        this.messageNotification = messageNotification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTaskRequestBody that = (ScheduledTaskRequestBody) obj;
        return Objects.equals(this.ticketInfos, that.ticketInfos) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.versionNo, that.versionNo)
            && Objects.equals(this.triggerTime, that.triggerTime) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.associatedTaskId, that.associatedTaskId)
            && Objects.equals(this.associatedTaskType, that.associatedTaskType)
            && Objects.equals(this.associatedTaskName, that.associatedTaskName)
            && Objects.equals(this.associatedTaskNameEn, that.associatedTaskNameEn)
            && Objects.equals(this.associatedTaskEnterpriseProjectId, that.associatedTaskEnterpriseProjectId)
            && Objects.equals(this.runbookInstanceMode, that.runbookInstanceMode)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.inputParam, that.inputParam)
            && Objects.equals(this.targetInstances, that.targetInstances)
            && Objects.equals(this.enableApprove, that.enableApprove)
            && Objects.equals(this.reviewerNotification, that.reviewerNotification)
            && Objects.equals(this.reviewerUserName, that.reviewerUserName)
            && Objects.equals(this.enableMessageNotification, that.enableMessageNotification)
            && Objects.equals(this.messageNotification, that.messageNotification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketInfos,
            name,
            enterpriseProjectId,
            agencyName,
            versionNo,
            triggerTime,
            taskType,
            associatedTaskId,
            associatedTaskType,
            associatedTaskName,
            associatedTaskNameEn,
            associatedTaskEnterpriseProjectId,
            runbookInstanceMode,
            riskLevel,
            inputParam,
            targetInstances,
            enableApprove,
            reviewerNotification,
            reviewerUserName,
            enableMessageNotification,
            messageNotification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTaskRequestBody {\n");
        sb.append("    ticketInfos: ").append(toIndentedString(ticketInfos)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    versionNo: ").append(toIndentedString(versionNo)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    associatedTaskId: ").append(toIndentedString(associatedTaskId)).append("\n");
        sb.append("    associatedTaskType: ").append(toIndentedString(associatedTaskType)).append("\n");
        sb.append("    associatedTaskName: ").append(toIndentedString(associatedTaskName)).append("\n");
        sb.append("    associatedTaskNameEn: ").append(toIndentedString(associatedTaskNameEn)).append("\n");
        sb.append("    associatedTaskEnterpriseProjectId: ")
            .append(toIndentedString(associatedTaskEnterpriseProjectId))
            .append("\n");
        sb.append("    runbookInstanceMode: ").append(toIndentedString(runbookInstanceMode)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    inputParam: ").append(toIndentedString(inputParam)).append("\n");
        sb.append("    targetInstances: ").append(toIndentedString(targetInstances)).append("\n");
        sb.append("    enableApprove: ").append(toIndentedString(enableApprove)).append("\n");
        sb.append("    reviewerNotification: ").append(toIndentedString(reviewerNotification)).append("\n");
        sb.append("    reviewerUserName: ").append(toIndentedString(reviewerUserName)).append("\n");
        sb.append("    enableMessageNotification: ").append(toIndentedString(enableMessageNotification)).append("\n");
        sb.append("    messageNotification: ").append(toIndentedString(messageNotification)).append("\n");
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
