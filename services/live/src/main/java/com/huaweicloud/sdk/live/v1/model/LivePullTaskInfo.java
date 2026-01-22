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
 * 直播拉流转推任务信息
 */
public class LivePullTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_urls")

    private List<String> sourceUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_args")

    private String pushArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_url")

    private String destinationUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_events")

    private List<String> callbackEvents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_source_type")

    private String backupSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_source_urls")

    private List<String> backupSourceUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_loop_time")

    private String vodLoopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_start_video_index")

    private Integer vodStartVideoIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_start_video_time")

    private Integer vodStartVideoTime;

    /**
     * 修改任务时文件切换方式 immediate_new_source：立即播放新的拉流源内容 continue_from_file_start：从上次断流url文件重新开始推流 continue_from_break_point：从上次断流url文件断流位置开始推流（续上）
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

    public LivePullTaskInfo withTaskId(String taskId) {
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

    public LivePullTaskInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LivePullTaskInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public LivePullTaskInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 任务执行区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LivePullTaskInfo withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 拉流源类型 PullLivePushLive：拉转推（拉直播推直播） PullVodPushLive：轮播（拉点播推直播）
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public LivePullTaskInfo withSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
        return this;
    }

    public LivePullTaskInfo addSourceUrlsItem(String sourceUrlsItem) {
        if (this.sourceUrls == null) {
            this.sourceUrls = new ArrayList<>();
        }
        this.sourceUrls.add(sourceUrlsItem);
        return this;
    }

    public LivePullTaskInfo withSourceUrls(Consumer<List<String>> sourceUrlsSetter) {
        if (this.sourceUrls == null) {
            this.sourceUrls = new ArrayList<>();
        }
        sourceUrlsSetter.accept(this.sourceUrls);
        return this;
    }

    /**
     * 拉流源URL 当 source_type 为 PullLivePushLive 时，只能填写一个URL 当 source_type 为 PullVodPushLive 时，可以指定多个轮播源文件URL
     * @return sourceUrls
     */
    public List<String> getSourceUrls() {
        return sourceUrls;
    }

    public void setSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
    }

    public LivePullTaskInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public LivePullTaskInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 推流app
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public LivePullTaskInfo withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 推流流名
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public LivePullTaskInfo withPushArgs(String pushArgs) {
        this.pushArgs = pushArgs;
        return this;
    }

    /**
     * 推流参数
     * @return pushArgs
     */
    public String getPushArgs() {
        return pushArgs;
    }

    public void setPushArgs(String pushArgs) {
        this.pushArgs = pushArgs;
    }

    public LivePullTaskInfo withDestinationUrl(String destinationUrl) {
        this.destinationUrl = destinationUrl;
        return this;
    }

    /**
     * 完整的目标URL。 如果指定此参数，domain、app_name和stream_name需要传入空字符串或不传。
     * @return destinationUrl
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    public void setDestinationUrl(String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    public LivePullTaskInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务启动时间，时间格式： \"2006-01-02T15:04:05Z\"
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public LivePullTaskInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间，时间格式： \"2006-01-02T15:04:05Z\"  1. 结束时间必须大于开始时间； 2. 结束时间必须大于当前时间； 3. 结束时间 和 开始时间 间隔必须小于七天。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public LivePullTaskInfo withCallbackEvents(List<String> callbackEvents) {
        this.callbackEvents = callbackEvents;
        return this;
    }

    public LivePullTaskInfo addCallbackEventsItem(String callbackEventsItem) {
        if (this.callbackEvents == null) {
            this.callbackEvents = new ArrayList<>();
        }
        this.callbackEvents.add(callbackEventsItem);
        return this;
    }

    public LivePullTaskInfo withCallbackEvents(Consumer<List<String>> callbackEventsSetter) {
        if (this.callbackEvents == null) {
            this.callbackEvents = new ArrayList<>();
        }
        callbackEventsSetter.accept(this.callbackEvents);
        return this;
    }

    /**
     * 要回调的事件列表（不填则回调全部） - TaskStart：任务启动回调 - TaskExit：任务停止回调 - VodSourceFileStart：仅PullVodPushLive可用，文件启动切换 - VodSourceFileFinish：仅PullVodPushLive可用，文件播放完毕 - ResetTaskConfig：仅PullVodPushLive可用，任务更新 - TaskAlarm：用于告警事件通知
     * @return callbackEvents
     */
    public List<String> getCallbackEvents() {
        return callbackEvents;
    }

    public void setCallbackEvents(List<String> callbackEvents) {
        this.callbackEvents = callbackEvents;
    }

    public LivePullTaskInfo withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调接收地址
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public LivePullTaskInfo withBackupSourceType(String backupSourceType) {
        this.backupSourceType = backupSourceType;
        return this;
    }

    /**
     * 备源的类型 - PullLivePushLive：直播 注意事项： 1. 仅当source_type为PullVodPushLive生效。 2. 主直播源拉流中断时，自动使用备源进行拉流。
     * @return backupSourceType
     */
    public String getBackupSourceType() {
        return backupSourceType;
    }

    public void setBackupSourceType(String backupSourceType) {
        this.backupSourceType = backupSourceType;
    }

    public LivePullTaskInfo withBackupSourceUrls(List<String> backupSourceUrls) {
        this.backupSourceUrls = backupSourceUrls;
        return this;
    }

    public LivePullTaskInfo addBackupSourceUrlsItem(String backupSourceUrlsItem) {
        if (this.backupSourceUrls == null) {
            this.backupSourceUrls = new ArrayList<>();
        }
        this.backupSourceUrls.add(backupSourceUrlsItem);
        return this;
    }

    public LivePullTaskInfo withBackupSourceUrls(Consumer<List<String>> backupSourceUrlsSetter) {
        if (this.backupSourceUrls == null) {
            this.backupSourceUrls = new ArrayList<>();
        }
        backupSourceUrlsSetter.accept(this.backupSourceUrls);
        return this;
    }

    /**
     * 备源URL，仅当source_type为PullVodPushLive生效。
     * @return backupSourceUrls
     */
    public List<String> getBackupSourceUrls() {
        return backupSourceUrls;
    }

    public void setBackupSourceUrls(List<String> backupSourceUrls) {
        this.backupSourceUrls = backupSourceUrls;
    }

    public LivePullTaskInfo withVodLoopTime(String vodLoopTime) {
        this.vodLoopTime = vodLoopTime;
        return this;
    }

    /**
     * 缺省值”-1” -1：无限轮播，以结束时间为准；N：按文件列表播放N轮，以播放完成和结束时间先到为准。 不传、为空（\"\"）时按缺省值生效
     * @return vodLoopTime
     */
    public String getVodLoopTime() {
        return vodLoopTime;
    }

    public void setVodLoopTime(String vodLoopTime) {
        this.vodLoopTime = vodLoopTime;
    }

    public LivePullTaskInfo withVodStartVideoIndex(Integer vodStartVideoIndex) {
        this.vodStartVideoIndex = vodStartVideoIndex;
        return this;
    }

    /**
     * 指定播放文件的下标，从0开始表示第一个文件，最大值 len(source_urls)-1
     * minimum: 0
     * maximum: 8192
     * @return vodStartVideoIndex
     */
    public Integer getVodStartVideoIndex() {
        return vodStartVideoIndex;
    }

    public void setVodStartVideoIndex(Integer vodStartVideoIndex) {
        this.vodStartVideoIndex = vodStartVideoIndex;
    }

    public LivePullTaskInfo withVodStartVideoTime(Integer vodStartVideoTime) {
        this.vodStartVideoTime = vodStartVideoTime;
        return this;
    }

    /**
     * 指定从上述指定文件的第几秒开始播放
     * minimum: 0
     * maximum: 2100000000
     * @return vodStartVideoTime
     */
    public Integer getVodStartVideoTime() {
        return vodStartVideoTime;
    }

    public void setVodStartVideoTime(Integer vodStartVideoTime) {
        this.vodStartVideoTime = vodStartVideoTime;
    }

    public LivePullTaskInfo withVodRefreshType(VodRefreshTypeEnum vodRefreshType) {
        this.vodRefreshType = vodRefreshType;
        return this;
    }

    /**
     * 修改任务时文件切换方式 immediate_new_source：立即播放新的拉流源内容 continue_from_file_start：从上次断流url文件重新开始推流 continue_from_break_point：从上次断流url文件断流位置开始推流（续上）
     * @return vodRefreshType
     */
    public VodRefreshTypeEnum getVodRefreshType() {
        return vodRefreshType;
    }

    public void setVodRefreshType(VodRefreshTypeEnum vodRefreshType) {
        this.vodRefreshType = vodRefreshType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LivePullTaskInfo that = (LivePullTaskInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.region, that.region)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceUrls, that.sourceUrls)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.streamName, that.streamName) && Objects.equals(this.pushArgs, that.pushArgs)
            && Objects.equals(this.destinationUrl, that.destinationUrl)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.callbackEvents, that.callbackEvents)
            && Objects.equals(this.callbackUrl, that.callbackUrl)
            && Objects.equals(this.backupSourceType, that.backupSourceType)
            && Objects.equals(this.backupSourceUrls, that.backupSourceUrls)
            && Objects.equals(this.vodLoopTime, that.vodLoopTime)
            && Objects.equals(this.vodStartVideoIndex, that.vodStartVideoIndex)
            && Objects.equals(this.vodStartVideoTime, that.vodStartVideoTime)
            && Objects.equals(this.vodRefreshType, that.vodRefreshType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            status,
            createTime,
            region,
            sourceType,
            sourceUrls,
            domain,
            appName,
            streamName,
            pushArgs,
            destinationUrl,
            startTime,
            endTime,
            callbackEvents,
            callbackUrl,
            backupSourceType,
            backupSourceUrls,
            vodLoopTime,
            vodStartVideoIndex,
            vodStartVideoTime,
            vodRefreshType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LivePullTaskInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceUrls: ").append(toIndentedString(sourceUrls)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    pushArgs: ").append(toIndentedString(pushArgs)).append("\n");
        sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    callbackEvents: ").append(toIndentedString(callbackEvents)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    backupSourceType: ").append(toIndentedString(backupSourceType)).append("\n");
        sb.append("    backupSourceUrls: ").append(toIndentedString(backupSourceUrls)).append("\n");
        sb.append("    vodLoopTime: ").append(toIndentedString(vodLoopTime)).append("\n");
        sb.append("    vodStartVideoIndex: ").append(toIndentedString(vodStartVideoIndex)).append("\n");
        sb.append("    vodStartVideoTime: ").append(toIndentedString(vodStartVideoTime)).append("\n");
        sb.append("    vodRefreshType: ").append(toIndentedString(vodRefreshType)).append("\n");
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
