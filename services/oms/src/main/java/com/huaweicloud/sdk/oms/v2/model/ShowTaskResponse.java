package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_policy")

    private List<BandwidthPolicyDto> bandwidthPolicy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_size")

    private Long completeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_node")

    private DstNodeResp dstNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_failed_object_recording")

    private Boolean enableFailedObjectRecording;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_kms")

    private Boolean enableKms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_restore")

    private Boolean enableRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    private ErrorReasonResp errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Long failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_object_record")

    private FailedObjectRecordDto failedObjectRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_query_over")

    private Boolean isQueryOver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left_time")

    private Long leftTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_since")

    private Long migrateSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Long migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Double progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_size")

    private Long realSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_num")

    private Long skippedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_node")

    private SrcNodeResp srcNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successful_num")

    private Long successfulNum;

    /** 任务类型，为空默认设置为object。 list：对象列表迁移 object：文件/文件夹迁移 prefix：对象前缀迁移 url_list: url对象列表 */
    public static final class TaskTypeEnum {

        /** Enum LIST for value: "list" */
        public static final TaskTypeEnum LIST = new TaskTypeEnum("list");

        /** Enum OBJECT for value: "object" */
        public static final TaskTypeEnum OBJECT = new TaskTypeEnum("object");

        /** Enum PREFIX for value: "prefix" */
        public static final TaskTypeEnum PREFIX = new TaskTypeEnum("prefix");

        /** Enum URL_LIST for value: "url_list" */
        public static final TaskTypeEnum URL_LIST = new TaskTypeEnum("url_list");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("list", LIST);
            map.put("object", OBJECT);
            map.put("prefix", PREFIX);
            map.put("url_list", URL_LIST);
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
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Long totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Long totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_info")

    private SmnInfo smnInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn")

    private SourceCdnResp sourceCdn;

    public ShowTaskResponse withBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
        return this;
    }

    public ShowTaskResponse addBandwidthPolicyItem(BandwidthPolicyDto bandwidthPolicyItem) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        this.bandwidthPolicy.add(bandwidthPolicyItem);
        return this;
    }

    public ShowTaskResponse withBandwidthPolicy(Consumer<List<BandwidthPolicyDto>> bandwidthPolicySetter) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        bandwidthPolicySetter.accept(this.bandwidthPolicy);
        return this;
    }

    /** 流量控制策略，每个任务最多可设置5条限速策略。
     * 
     * @return bandwidthPolicy */
    public List<BandwidthPolicyDto> getBandwidthPolicy() {
        return bandwidthPolicy;
    }

    public void setBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
    }

    public ShowTaskResponse withCompleteSize(Long completeSize) {
        this.completeSize = completeSize;
        return this;
    }

    /** 任务迁移完成大小（Byte）。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return completeSize */
    public Long getCompleteSize() {
        return completeSize;
    }

    public void setCompleteSize(Long completeSize) {
        this.completeSize = completeSize;
    }

    public ShowTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 任务描述，没有设置时为空字符串。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowTaskResponse withDstNode(DstNodeResp dstNode) {
        this.dstNode = dstNode;
        return this;
    }

    public ShowTaskResponse withDstNode(Consumer<DstNodeResp> dstNodeSetter) {
        if (this.dstNode == null) {
            this.dstNode = new DstNodeResp();
            dstNodeSetter.accept(this.dstNode);
        }

        return this;
    }

    /** Get dstNode
     * 
     * @return dstNode */
    public DstNodeResp getDstNode() {
        return dstNode;
    }

    public void setDstNode(DstNodeResp dstNode) {
        this.dstNode = dstNode;
    }

    public ShowTaskResponse withEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
        return this;
    }

    /** 是否记录失败对象。开启后，如果有迁移失败对象，会在目的端存储失败对象信息。
     * 
     * @return enableFailedObjectRecording */
    public Boolean getEnableFailedObjectRecording() {
        return enableFailedObjectRecording;
    }

    public void setEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
    }

    public ShowTaskResponse withEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
        return this;
    }

    /** 存储入OBS时是否使用KMS加密。
     * 
     * @return enableKms */
    public Boolean getEnableKms() {
        return enableKms;
    }

    public void setEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
    }

    public ShowTaskResponse withEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
        return this;
    }

    /** 是否自动解冻归档数据，（由于对象存储解冻需要源端存储等待一定时间，开启自动解冻会对迁移速度有较大影响，建议先完成归档存储数据解冻后再启动迁移）。
     * 开启后，如果遇到归档类型数据，会自动解冻再进行迁移；如果遇到归档类型的对象直接跳过相应对象，系统默认对象迁移失败并记录相关信息到失败对象列表中。
     * 
     * @return enableRestore */
    public Boolean getEnableRestore() {
        return enableRestore;
    }

    public void setEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
    }

    public ShowTaskResponse withErrorReason(ErrorReasonResp errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    public ShowTaskResponse withErrorReason(Consumer<ErrorReasonResp> errorReasonSetter) {
        if (this.errorReason == null) {
            this.errorReason = new ErrorReasonResp();
            errorReasonSetter.accept(this.errorReason);
        }

        return this;
    }

    /** Get errorReason
     * 
     * @return errorReason */
    public ErrorReasonResp getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(ErrorReasonResp errorReason) {
        this.errorReason = errorReason;
    }

    public ShowTaskResponse withFailedNum(Long failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /** 迁移失败对象数量。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return failedNum */
    public Long getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Long failedNum) {
        this.failedNum = failedNum;
    }

    public ShowTaskResponse withFailedObjectRecord(FailedObjectRecordDto failedObjectRecord) {
        this.failedObjectRecord = failedObjectRecord;
        return this;
    }

    public ShowTaskResponse withFailedObjectRecord(Consumer<FailedObjectRecordDto> failedObjectRecordSetter) {
        if (this.failedObjectRecord == null) {
            this.failedObjectRecord = new FailedObjectRecordDto();
            failedObjectRecordSetter.accept(this.failedObjectRecord);
        }

        return this;
    }

    /** Get failedObjectRecord
     * 
     * @return failedObjectRecord */
    public FailedObjectRecordDto getFailedObjectRecord() {
        return failedObjectRecord;
    }

    public void setFailedObjectRecord(FailedObjectRecordDto failedObjectRecord) {
        this.failedObjectRecord = failedObjectRecord;
    }

    public ShowTaskResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 迁移任务组ID，当任务由迁移任务组创建时会包含迁移任务组的id信息。
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowTaskResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /** 任务ID。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return id */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowTaskResponse withIsQueryOver(Boolean isQueryOver) {
        this.isQueryOver = isQueryOver;
        return this;
    }

    /** 迁移任务是否完成源端对象统计数据扫描。
     * 
     * @return isQueryOver */
    public Boolean getIsQueryOver() {
        return isQueryOver;
    }

    public void setIsQueryOver(Boolean isQueryOver) {
        this.isQueryOver = isQueryOver;
    }

    public ShowTaskResponse withLeftTime(Long leftTime) {
        this.leftTime = leftTime;
        return this;
    }

    /** 任务剩余时间（毫秒）。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return leftTime */
    public Long getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
    }

    public ShowTaskResponse withMigrateSince(Long migrateSince) {
        this.migrateSince = migrateSince;
        return this;
    }

    /** 迁移指定时间（时间戳，毫秒），表示仅迁移在指定时间之后修改的源端待迁移对象。默认为0，表示不设置迁移指定时间。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return migrateSince */
    public Long getMigrateSince() {
        return migrateSince;
    }

    public void setMigrateSince(Long migrateSince) {
        this.migrateSince = migrateSince;
    }

    public ShowTaskResponse withMigrateSpeed(Long migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /** 任务迁移速度（Byte/s）。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return migrateSpeed */
    public Long getMigrateSpeed() {
        return migrateSpeed;
    }

    public void setMigrateSpeed(Long migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
    }

    public ShowTaskResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 任务名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowTaskResponse withProgress(Double progress) {
        this.progress = progress;
        return this;
    }

    /** 任务进度，例如：0.522代表任务进度为52.2%，1代表任务进度为100%。 minimum: 0 maximum: 1
     * 
     * @return progress */
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public ShowTaskResponse withRealSize(Long realSize) {
        this.realSize = realSize;
        return this;
    }

    /** 实际迁移对象总大小（Byte），忽略对象的大小不会统计在内。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return realSize */
    public Long getRealSize() {
        return realSize;
    }

    public void setRealSize(Long realSize) {
        this.realSize = realSize;
    }

    public ShowTaskResponse withSkippedNum(Long skippedNum) {
        this.skippedNum = skippedNum;
        return this;
    }

    /** 迁移忽略对象数（存在以下两种情况会自动跳过：1.源端对象最后修改时间在迁移指定时间前；2.目的端已有该对象。） minimum: 0 maximum: 9223372036854775807
     * 
     * @return skippedNum */
    public Long getSkippedNum() {
        return skippedNum;
    }

    public void setSkippedNum(Long skippedNum) {
        this.skippedNum = skippedNum;
    }

    public ShowTaskResponse withSrcNode(SrcNodeResp srcNode) {
        this.srcNode = srcNode;
        return this;
    }

    public ShowTaskResponse withSrcNode(Consumer<SrcNodeResp> srcNodeSetter) {
        if (this.srcNode == null) {
            this.srcNode = new SrcNodeResp();
            srcNodeSetter.accept(this.srcNode);
        }

        return this;
    }

    /** Get srcNode
     * 
     * @return srcNode */
    public SrcNodeResp getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(SrcNodeResp srcNode) {
        this.srcNode = srcNode;
    }

    public ShowTaskResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 任务启动时间（Unix时间戳，毫秒）。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return startTime */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowTaskResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 任务状态。 1：等待调度 2：正在执行 3：停止 4：失败 5：成功 minimum: 1 maximum: 5
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowTaskResponse withSuccessfulNum(Long successfulNum) {
        this.successfulNum = successfulNum;
        return this;
    }

    /** 迁移成功对象数量。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return successfulNum */
    public Long getSuccessfulNum() {
        return successfulNum;
    }

    public void setSuccessfulNum(Long successfulNum) {
        this.successfulNum = successfulNum;
    }

    public ShowTaskResponse withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /** 任务类型，为空默认设置为object。 list：对象列表迁移 object：文件/文件夹迁移 prefix：对象前缀迁移 url_list: url对象列表
     * 
     * @return taskType */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ShowTaskResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /** 迁移任务对象总数量。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return totalNum */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public ShowTaskResponse withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /** 任务迁移总大小（Byte）。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return totalSize */
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public ShowTaskResponse withTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /** 任务总耗时（毫秒）。 minimum: 0 maximum: 9223372036854775807
     * 
     * @return totalTime */
    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    public ShowTaskResponse withSmnInfo(SmnInfo smnInfo) {
        this.smnInfo = smnInfo;
        return this;
    }

    public ShowTaskResponse withSmnInfo(Consumer<SmnInfo> smnInfoSetter) {
        if (this.smnInfo == null) {
            this.smnInfo = new SmnInfo();
            smnInfoSetter.accept(this.smnInfo);
        }

        return this;
    }

    /** Get smnInfo
     * 
     * @return smnInfo */
    public SmnInfo getSmnInfo() {
        return smnInfo;
    }

    public void setSmnInfo(SmnInfo smnInfo) {
        this.smnInfo = smnInfo;
    }

    public ShowTaskResponse withSourceCdn(SourceCdnResp sourceCdn) {
        this.sourceCdn = sourceCdn;
        return this;
    }

    public ShowTaskResponse withSourceCdn(Consumer<SourceCdnResp> sourceCdnSetter) {
        if (this.sourceCdn == null) {
            this.sourceCdn = new SourceCdnResp();
            sourceCdnSetter.accept(this.sourceCdn);
        }

        return this;
    }

    /** Get sourceCdn
     * 
     * @return sourceCdn */
    public SourceCdnResp getSourceCdn() {
        return sourceCdn;
    }

    public void setSourceCdn(SourceCdnResp sourceCdn) {
        this.sourceCdn = sourceCdn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskResponse showTaskResponse = (ShowTaskResponse) o;
        return Objects.equals(this.bandwidthPolicy, showTaskResponse.bandwidthPolicy)
            && Objects.equals(this.completeSize, showTaskResponse.completeSize)
            && Objects.equals(this.description, showTaskResponse.description)
            && Objects.equals(this.dstNode, showTaskResponse.dstNode)
            && Objects.equals(this.enableFailedObjectRecording, showTaskResponse.enableFailedObjectRecording)
            && Objects.equals(this.enableKms, showTaskResponse.enableKms)
            && Objects.equals(this.enableRestore, showTaskResponse.enableRestore)
            && Objects.equals(this.errorReason, showTaskResponse.errorReason)
            && Objects.equals(this.failedNum, showTaskResponse.failedNum)
            && Objects.equals(this.failedObjectRecord, showTaskResponse.failedObjectRecord)
            && Objects.equals(this.groupId, showTaskResponse.groupId) && Objects.equals(this.id, showTaskResponse.id)
            && Objects.equals(this.isQueryOver, showTaskResponse.isQueryOver)
            && Objects.equals(this.leftTime, showTaskResponse.leftTime)
            && Objects.equals(this.migrateSince, showTaskResponse.migrateSince)
            && Objects.equals(this.migrateSpeed, showTaskResponse.migrateSpeed)
            && Objects.equals(this.name, showTaskResponse.name)
            && Objects.equals(this.progress, showTaskResponse.progress)
            && Objects.equals(this.realSize, showTaskResponse.realSize)
            && Objects.equals(this.skippedNum, showTaskResponse.skippedNum)
            && Objects.equals(this.srcNode, showTaskResponse.srcNode)
            && Objects.equals(this.startTime, showTaskResponse.startTime)
            && Objects.equals(this.status, showTaskResponse.status)
            && Objects.equals(this.successfulNum, showTaskResponse.successfulNum)
            && Objects.equals(this.taskType, showTaskResponse.taskType)
            && Objects.equals(this.totalNum, showTaskResponse.totalNum)
            && Objects.equals(this.totalSize, showTaskResponse.totalSize)
            && Objects.equals(this.totalTime, showTaskResponse.totalTime)
            && Objects.equals(this.smnInfo, showTaskResponse.smnInfo)
            && Objects.equals(this.sourceCdn, showTaskResponse.sourceCdn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPolicy,
            completeSize,
            description,
            dstNode,
            enableFailedObjectRecording,
            enableKms,
            enableRestore,
            errorReason,
            failedNum,
            failedObjectRecord,
            groupId,
            id,
            isQueryOver,
            leftTime,
            migrateSince,
            migrateSpeed,
            name,
            progress,
            realSize,
            skippedNum,
            srcNode,
            startTime,
            status,
            successfulNum,
            taskType,
            totalNum,
            totalSize,
            totalTime,
            smnInfo,
            sourceCdn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResponse {\n");
        sb.append("    bandwidthPolicy: ").append(toIndentedString(bandwidthPolicy)).append("\n");
        sb.append("    completeSize: ").append(toIndentedString(completeSize)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dstNode: ").append(toIndentedString(dstNode)).append("\n");
        sb.append("    enableFailedObjectRecording: ")
            .append(toIndentedString(enableFailedObjectRecording))
            .append("\n");
        sb.append("    enableKms: ").append(toIndentedString(enableKms)).append("\n");
        sb.append("    enableRestore: ").append(toIndentedString(enableRestore)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    failedObjectRecord: ").append(toIndentedString(failedObjectRecord)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isQueryOver: ").append(toIndentedString(isQueryOver)).append("\n");
        sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
        sb.append("    migrateSince: ").append(toIndentedString(migrateSince)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    realSize: ").append(toIndentedString(realSize)).append("\n");
        sb.append("    skippedNum: ").append(toIndentedString(skippedNum)).append("\n");
        sb.append("    srcNode: ").append(toIndentedString(srcNode)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successfulNum: ").append(toIndentedString(successfulNum)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    smnInfo: ").append(toIndentedString(smnInfo)).append("\n");
        sb.append("    sourceCdn: ").append(toIndentedString(sourceCdn)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
