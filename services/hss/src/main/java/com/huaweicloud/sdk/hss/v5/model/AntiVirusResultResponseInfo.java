package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 病毒查杀结果列表响应详情
 */
public class AntiVirusResultResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    private String resultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_type")

    private String malwareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_name")

    private String malwareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_info")

    private ResultFileResponseInfo fileInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_info")

    private ResultResourceResponseInfo resourceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_method")

    private String handleMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")

    private String memo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_accept_list")

    private List<String> operateAcceptList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_detail_list")

    private List<ResultDetailResponseInfo> operateDetailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolate_tag")

    private String isolateTag;

    public AntiVirusResultResponseInfo withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * **参数解释**： 病毒查杀结果ID **取值范围**： 字符长度1-64位 
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public AntiVirusResultResponseInfo withMalwareType(String malwareType) {
        this.malwareType = malwareType;
        return this;
    }

    /**
     * **参数解释**： 病毒类型 **取值范围**： Trojan（木马）、Virus（病毒）、Worm（蠕虫）等 
     * @return malwareType
     */
    public String getMalwareType() {
        return malwareType;
    }

    public void setMalwareType(String malwareType) {
        this.malwareType = malwareType;
    }

    public AntiVirusResultResponseInfo withMalwareName(String malwareName) {
        this.malwareName = malwareName;
        return this;
    }

    /**
     * **参数解释**： 病毒名称 **取值范围**： 字符长度1-128位 
     * @return malwareName
     */
    public String getMalwareName() {
        return malwareName;
    }

    public void setMalwareName(String malwareName) {
        this.malwareName = malwareName;
    }

    public AntiVirusResultResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 威胁等级 **取值范围**: 包含如下:   - Low：低危   - Medium：中危   - High：高危   - Critical：致命 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public AntiVirusResultResponseInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**： 任务ID **取值范围**: 字符长度1-64位 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public AntiVirusResultResponseInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**: 任务名称 **取值范围**: 最大长度255个unicode字符。 
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public AntiVirusResultResponseInfo withFileInfo(ResultFileResponseInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    public AntiVirusResultResponseInfo withFileInfo(Consumer<ResultFileResponseInfo> fileInfoSetter) {
        if (this.fileInfo == null) {
            this.fileInfo = new ResultFileResponseInfo();
            fileInfoSetter.accept(this.fileInfo);
        }

        return this;
    }

    /**
     * Get fileInfo
     * @return fileInfo
     */
    public ResultFileResponseInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(ResultFileResponseInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public AntiVirusResultResponseInfo withResourceInfo(ResultResourceResponseInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }

    public AntiVirusResultResponseInfo withResourceInfo(Consumer<ResultResourceResponseInfo> resourceInfoSetter) {
        if (this.resourceInfo == null) {
            this.resourceInfo = new ResultResourceResponseInfo();
            resourceInfoSetter.accept(this.resourceInfo);
        }

        return this;
    }

    /**
     * Get resourceInfo
     * @return resourceInfo
     */
    public ResultResourceResponseInfo getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(ResultResourceResponseInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public AntiVirusResultResponseInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释**: 病毒查杀结果对应的事件类型标识 **取值范围**: 0-10（具体含义：0=文件病毒事件、1=内存病毒事件...，详见产品错误码/枚举文档） 
     * minimum: 0
     * maximum: 6000
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public AntiVirusResultResponseInfo withOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * **参数解释**： 发生时间，毫秒 **取值范围**： 最小值0，最大值9223372036854775807，时间格式：毫秒级时间戳（UTC时区，从1970-01-01 00:00:00开始计算），单位：ms 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return occurTime
     */
    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public AntiVirusResultResponseInfo withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**： 处理状态 **取值范围**： - unhandled：未处理 - handled：已处理 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public AntiVirusResultResponseInfo withHandleMethod(String handleMethod) {
        this.handleMethod = handleMethod;
        return this;
    }

    /**
     * **参数解释**: 处理方式 **取值范围**: 包含如下:   - mark_as_handled：手动处理   - ignore：忽略   - add_to_alarm_whitelist：加入告警白名单   - isolate_and_kill：隔离文件   - unhandle：取消手动处理   - do_not_ignore：取消忽略   - remove_from_alarm_whitelist：删除告警白名单   - do_not_isolate_or_kill：取消隔离文件 
     * @return handleMethod
     */
    public String getHandleMethod() {
        return handleMethod;
    }

    public void setHandleMethod(String handleMethod) {
        this.handleMethod = handleMethod;
    }

    public AntiVirusResultResponseInfo withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * **参数解释** 备注信息 **取值范围** 字符长度0-512位 
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public AntiVirusResultResponseInfo withOperateAcceptList(List<String> operateAcceptList) {
        this.operateAcceptList = operateAcceptList;
        return this;
    }

    public AntiVirusResultResponseInfo addOperateAcceptListItem(String operateAcceptListItem) {
        if (this.operateAcceptList == null) {
            this.operateAcceptList = new ArrayList<>();
        }
        this.operateAcceptList.add(operateAcceptListItem);
        return this;
    }

    public AntiVirusResultResponseInfo withOperateAcceptList(Consumer<List<String>> operateAcceptListSetter) {
        if (this.operateAcceptList == null) {
            this.operateAcceptList = new ArrayList<>();
        }
        operateAcceptListSetter.accept(this.operateAcceptList);
        return this;
    }

    /**
     * **参数解释**: 后续处置操作列表 **取值范围**: 数组元素为处置操作枚举字符串（如“isolate_and_kill”“ignore”等），数组长度0-4（具体支持操作因结果状态而异） 
     * @return operateAcceptList
     */
    public List<String> getOperateAcceptList() {
        return operateAcceptList;
    }

    public void setOperateAcceptList(List<String> operateAcceptList) {
        this.operateAcceptList = operateAcceptList;
    }

    public AntiVirusResultResponseInfo withOperateDetailList(List<ResultDetailResponseInfo> operateDetailList) {
        this.operateDetailList = operateDetailList;
        return this;
    }

    public AntiVirusResultResponseInfo addOperateDetailListItem(ResultDetailResponseInfo operateDetailListItem) {
        if (this.operateDetailList == null) {
            this.operateDetailList = new ArrayList<>();
        }
        this.operateDetailList.add(operateDetailListItem);
        return this;
    }

    public AntiVirusResultResponseInfo withOperateDetailList(
        Consumer<List<ResultDetailResponseInfo>> operateDetailListSetter) {
        if (this.operateDetailList == null) {
            this.operateDetailList = new ArrayList<>();
        }
        operateDetailListSetter.accept(this.operateDetailList);
        return this;
    }

    /**
     * **参数解释**: 操作详情信息列表（页面不展示） **取值范围**: 数组长度0-100 
     * @return operateDetailList
     */
    public List<ResultDetailResponseInfo> getOperateDetailList() {
        return operateDetailList;
    }

    public void setOperateDetailList(List<ResultDetailResponseInfo> operateDetailList) {
        this.operateDetailList = operateDetailList;
    }

    public AntiVirusResultResponseInfo withIsolateTag(String isolateTag) {
        this.isolateTag = isolateTag;
        return this;
    }

    /**
     * **参数解释**: 自动隔离查杀标识 **取值范围**: 字符长度1-16位，枚举值为“auto_isolate”（自动隔离）、“manual”（手动操作）、“none”（未隔离） 
     * @return isolateTag
     */
    public String getIsolateTag() {
        return isolateTag;
    }

    public void setIsolateTag(String isolateTag) {
        this.isolateTag = isolateTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusResultResponseInfo that = (AntiVirusResultResponseInfo) obj;
        return Objects.equals(this.resultId, that.resultId) && Objects.equals(this.malwareType, that.malwareType)
            && Objects.equals(this.malwareName, that.malwareName) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.fileInfo, that.fileInfo) && Objects.equals(this.resourceInfo, that.resourceInfo)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.occurTime, that.occurTime)
            && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.handleMethod, that.handleMethod) && Objects.equals(this.memo, that.memo)
            && Objects.equals(this.operateAcceptList, that.operateAcceptList)
            && Objects.equals(this.operateDetailList, that.operateDetailList)
            && Objects.equals(this.isolateTag, that.isolateTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId,
            malwareType,
            malwareName,
            severity,
            taskId,
            taskName,
            fileInfo,
            resourceInfo,
            eventType,
            occurTime,
            handleStatus,
            handleMethod,
            memo,
            operateAcceptList,
            operateDetailList,
            isolateTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusResultResponseInfo {\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
        sb.append("    malwareType: ").append(toIndentedString(malwareType)).append("\n");
        sb.append("    malwareName: ").append(toIndentedString(malwareName)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
        sb.append("    resourceInfo: ").append(toIndentedString(resourceInfo)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    handleMethod: ").append(toIndentedString(handleMethod)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    operateAcceptList: ").append(toIndentedString(operateAcceptList)).append("\n");
        sb.append("    operateDetailList: ").append(toIndentedString(operateDetailList)).append("\n");
        sb.append("    isolateTag: ").append(toIndentedString(isolateTag)).append("\n");
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
