package com.huaweicloud.sdk.live.v1.model;

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
 * ModifyLivePullStreamTask
 */
public class ModifyLivePullStreamTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * pause停用/enable启用
     */
    public static final class StatusEnum {

        /**
         * Enum PAUSE for value: "pause"
         */
        public static final StatusEnum PAUSE = new StatusEnum("pause");

        /**
         * Enum ENABLE for value: "enable"
         */
        public static final StatusEnum ENABLE = new StatusEnum("enable");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("pause", PAUSE);
            map.put("enable", ENABLE);
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
    @JsonProperty(value = "source_urls")

    private List<String> sourceUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_loop_time")

    private String vodLoopTime;

    /**
     * 缺省值 immediate_new_source，可选 immediate_new_source、continue_from_file_start、continue_from_break_point
     */
    public static final class VodRefreshTypeEnum {

        /**
         * Enum IMMEDIATE_NEW_SOURCE for value: "immediate_new_source"
         */
        public static final VodRefreshTypeEnum IMMEDIATE_NEW_SOURCE = new VodRefreshTypeEnum("immediate_new_source");

        /**
         * Enum CONTINUE_FROM_FILE_START for value: "continue_from_file_start"
         */
        public static final VodRefreshTypeEnum CONTINUE_FROM_FILE_START =
            new VodRefreshTypeEnum("continue_from_file_start");

        /**
         * Enum CONTINUE_FROM_BREAK_POINT for value: "continue_from_break_point"
         */
        public static final VodRefreshTypeEnum CONTINUE_FROM_BREAK_POINT =
            new VodRefreshTypeEnum("continue_from_break_point");

        private static final Map<String, VodRefreshTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VodRefreshTypeEnum> createStaticFields() {
            Map<String, VodRefreshTypeEnum> map = new HashMap<>();
            map.put("immediate_new_source", IMMEDIATE_NEW_SOURCE);
            map.put("continue_from_file_start", CONTINUE_FROM_FILE_START);
            map.put("continue_from_break_point", CONTINUE_FROM_BREAK_POINT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VodRefreshTypeEnum(String value) {
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
        public static VodRefreshTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VodRefreshTypeEnum(value));
        }

        public static VodRefreshTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VodRefreshTypeEnum) {
                return this.value.equals(((VodRefreshTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_refresh_type")

    private VodRefreshTypeEnum vodRefreshType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_start_video_index")

    private Integer vodStartVideoIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_start_video_time")

    private Integer vodStartVideoTime;

    /**
     * Gets or Sets callbackEvents
     */
    public static final class CallbackEventsEnum {

        /**
         * Enum TASKSTART for value: "TaskStart"
         */
        public static final CallbackEventsEnum TASKSTART = new CallbackEventsEnum("TaskStart");

        /**
         * Enum VODSOURCEFILESTART for value: "VodSourceFileStart"
         */
        public static final CallbackEventsEnum VODSOURCEFILESTART = new CallbackEventsEnum("VodSourceFileStart");

        /**
         * Enum VODSOURCEFILEFINISH for value: "VodSourceFileFinish"
         */
        public static final CallbackEventsEnum VODSOURCEFILEFINISH = new CallbackEventsEnum("VodSourceFileFinish");

        /**
         * Enum RESETTASKCONFIG for value: "ResetTaskConfig"
         */
        public static final CallbackEventsEnum RESETTASKCONFIG = new CallbackEventsEnum("ResetTaskConfig");

        /**
         * Enum TASKEXIT for value: "TaskExit"
         */
        public static final CallbackEventsEnum TASKEXIT = new CallbackEventsEnum("TaskExit");

        /**
         * Enum TASKALARM for value: "TaskAlarm"
         */
        public static final CallbackEventsEnum TASKALARM = new CallbackEventsEnum("TaskAlarm");

        private static final Map<String, CallbackEventsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CallbackEventsEnum> createStaticFields() {
            Map<String, CallbackEventsEnum> map = new HashMap<>();
            map.put("TaskStart", TASKSTART);
            map.put("VodSourceFileStart", VODSOURCEFILESTART);
            map.put("VodSourceFileFinish", VODSOURCEFILEFINISH);
            map.put("ResetTaskConfig", RESETTASKCONFIG);
            map.put("TaskExit", TASKEXIT);
            map.put("TaskAlarm", TASKALARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CallbackEventsEnum(String value) {
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
        public static CallbackEventsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CallbackEventsEnum(value));
        }

        public static CallbackEventsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CallbackEventsEnum) {
                return this.value.equals(((CallbackEventsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_events")

    private List<CallbackEventsEnum> callbackEvents = null;

    public ModifyLivePullStreamTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ModifyLivePullStreamTask withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * pause停用/enable启用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ModifyLivePullStreamTask withSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
        return this;
    }

    public ModifyLivePullStreamTask addSourceUrlsItem(String sourceUrlsItem) {
        if (this.sourceUrls == null) {
            this.sourceUrls = new ArrayList<>();
        }
        this.sourceUrls.add(sourceUrlsItem);
        return this;
    }

    public ModifyLivePullStreamTask withSourceUrls(Consumer<List<String>> sourceUrlsSetter) {
        if (this.sourceUrls == null) {
            this.sourceUrls = new ArrayList<>();
        }
        sourceUrlsSetter.accept(this.sourceUrls);
        return this;
    }

    /**
     * 拉流源URL
     * @return sourceUrls
     */
    public List<String> getSourceUrls() {
        return sourceUrls;
    }

    public void setSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
    }

    public ModifyLivePullStreamTask withVodLoopTime(String vodLoopTime) {
        this.vodLoopTime = vodLoopTime;
        return this;
    }

    /**
     * 缺省值”-1”。-1：无限轮播，以结束时间为准；N：按文件列表播放N轮，以播放完成和结束时间先到的为准。不传、为空（\"\"）时按缺省值生效
     * @return vodLoopTime
     */
    public String getVodLoopTime() {
        return vodLoopTime;
    }

    public void setVodLoopTime(String vodLoopTime) {
        this.vodLoopTime = vodLoopTime;
    }

    public ModifyLivePullStreamTask withVodRefreshType(VodRefreshTypeEnum vodRefreshType) {
        this.vodRefreshType = vodRefreshType;
        return this;
    }

    /**
     * 缺省值 immediate_new_source，可选 immediate_new_source、continue_from_file_start、continue_from_break_point
     * @return vodRefreshType
     */
    public VodRefreshTypeEnum getVodRefreshType() {
        return vodRefreshType;
    }

    public void setVodRefreshType(VodRefreshTypeEnum vodRefreshType) {
        this.vodRefreshType = vodRefreshType;
    }

    public ModifyLivePullStreamTask withVodStartVideoIndex(Integer vodStartVideoIndex) {
        this.vodStartVideoIndex = vodStartVideoIndex;
        return this;
    }

    /**
     * 缺省值 0，指定播放文件的下标，从0开始表示第一个文件，最大值 len(source_urls)-1
     * minimum: 0
     * maximum: 2147483647
     * @return vodStartVideoIndex
     */
    public Integer getVodStartVideoIndex() {
        return vodStartVideoIndex;
    }

    public void setVodStartVideoIndex(Integer vodStartVideoIndex) {
        this.vodStartVideoIndex = vodStartVideoIndex;
    }

    public ModifyLivePullStreamTask withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务启动时间，时间格式： \"2006-01-02T15:04:05Z\" 必须小于结束时间，缺省为当前时间
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ModifyLivePullStreamTask withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间，时间格式： \"2006-01-02T15:04:05Z\" 必须大于开始时间，至多为开始时间+7天
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ModifyLivePullStreamTask withVodStartVideoTime(Integer vodStartVideoTime) {
        this.vodStartVideoTime = vodStartVideoTime;
        return this;
    }

    /**
     * 缺省值 0，指定从上述指定文件的第几秒开始播放
     * minimum: 0
     * maximum: 2147483647
     * @return vodStartVideoTime
     */
    public Integer getVodStartVideoTime() {
        return vodStartVideoTime;
    }

    public void setVodStartVideoTime(Integer vodStartVideoTime) {
        this.vodStartVideoTime = vodStartVideoTime;
    }

    public ModifyLivePullStreamTask withCallbackEvents(List<CallbackEventsEnum> callbackEvents) {
        this.callbackEvents = callbackEvents;
        return this;
    }

    public ModifyLivePullStreamTask addCallbackEventsItem(CallbackEventsEnum callbackEventsItem) {
        if (this.callbackEvents == null) {
            this.callbackEvents = new ArrayList<>();
        }
        this.callbackEvents.add(callbackEventsItem);
        return this;
    }

    public ModifyLivePullStreamTask withCallbackEvents(Consumer<List<CallbackEventsEnum>> callbackEventsSetter) {
        if (this.callbackEvents == null) {
            this.callbackEvents = new ArrayList<>();
        }
        callbackEventsSetter.accept(this.callbackEvents);
        return this;
    }

    /**
     * 要回调的事件列表（不填则回调全部） - TaskStart：任务启动回调 - TaskExit：任务停止回调 - VodSourceFileStart 仅PullVodPushLive可用，文件启动切换 - VodSourceFileFinish 仅PullVodPushLive可用，文件播放完毕 - ResetTaskConfig 仅PullVodPushLive可用，任务更新 - TaskAlarm: 用于告警事件通知
     * @return callbackEvents
     */
    public List<CallbackEventsEnum> getCallbackEvents() {
        return callbackEvents;
    }

    public void setCallbackEvents(List<CallbackEventsEnum> callbackEvents) {
        this.callbackEvents = callbackEvents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyLivePullStreamTask that = (ModifyLivePullStreamTask) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sourceUrls, that.sourceUrls) && Objects.equals(this.vodLoopTime, that.vodLoopTime)
            && Objects.equals(this.vodRefreshType, that.vodRefreshType)
            && Objects.equals(this.vodStartVideoIndex, that.vodStartVideoIndex)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.vodStartVideoTime, that.vodStartVideoTime)
            && Objects.equals(this.callbackEvents, that.callbackEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            status,
            sourceUrls,
            vodLoopTime,
            vodRefreshType,
            vodStartVideoIndex,
            startTime,
            endTime,
            vodStartVideoTime,
            callbackEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyLivePullStreamTask {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sourceUrls: ").append(toIndentedString(sourceUrls)).append("\n");
        sb.append("    vodLoopTime: ").append(toIndentedString(vodLoopTime)).append("\n");
        sb.append("    vodRefreshType: ").append(toIndentedString(vodRefreshType)).append("\n");
        sb.append("    vodStartVideoIndex: ").append(toIndentedString(vodStartVideoIndex)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    vodStartVideoTime: ").append(toIndentedString(vodStartVideoTime)).append("\n");
        sb.append("    callbackEvents: ").append(toIndentedString(callbackEvents)).append("\n");
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
