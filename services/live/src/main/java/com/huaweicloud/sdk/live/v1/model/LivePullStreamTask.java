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
 * LivePullStreamTask
 */
public class LivePullStreamTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    /**
     * 拉流源类型 PullLivePushLive：拉转推（拉直播推直播） PullVodPushLive：轮播（拉点播推直播）
     */
    public static final class SourceTypeEnum {

        /**
         * Enum PULLLIVEPUSHLIVE for value: "PullLivePushLive"
         */
        public static final SourceTypeEnum PULLLIVEPUSHLIVE = new SourceTypeEnum("PullLivePushLive");

        /**
         * Enum PULLVODPUSHLIVE for value: "PullVodPushLive"
         */
        public static final SourceTypeEnum PULLVODPUSHLIVE = new SourceTypeEnum("PullVodPushLive");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("PullLivePushLive", PULLLIVEPUSHLIVE);
            map.put("PullVodPushLive", PULLVODPUSHLIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

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

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_loop_time")

    private String vodLoopTime;

    /**
     * 轮播文件播放形式，仅当source_type为PullVodPushLive生效。缺省值immediate_new_source immediate_new_source：立即播放新的文件源 continue_from_file_start：从上次断流URL文件重新播放（更新任务时有效） continue_from_break_point：从上次断流URL文件断流位置重新播放（更新任务时有效）
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
    @JsonProperty(value = "vod_start_video_time")

    private Integer vodStartVideoTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_source_type")

    private String backupSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_source_urls")

    private List<String> backupSourceUrls = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    public LivePullStreamTask withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 任务执行区域，如果指定推流域名，则region需要与推流域名直播源站一致，缺省为租户归属region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LivePullStreamTask withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 拉流源类型 PullLivePushLive：拉转推（拉直播推直播） PullVodPushLive：轮播（拉点播推直播）
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public LivePullStreamTask withSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
        return this;
    }

    public LivePullStreamTask addSourceUrlsItem(String sourceUrlsItem) {
        if (this.sourceUrls == null) {
            this.sourceUrls = new ArrayList<>();
        }
        this.sourceUrls.add(sourceUrlsItem);
        return this;
    }

    public LivePullStreamTask withSourceUrls(Consumer<List<String>> sourceUrlsSetter) {
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

    public LivePullStreamTask withDomain(String domain) {
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

    public LivePullStreamTask withAppName(String appName) {
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

    public LivePullStreamTask withStreamName(String streamName) {
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

    public LivePullStreamTask withPushArgs(String pushArgs) {
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

    public LivePullStreamTask withDestinationUrl(String destinationUrl) {
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

    public LivePullStreamTask withStartTime(OffsetDateTime startTime) {
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

    public LivePullStreamTask withEndTime(OffsetDateTime endTime) {
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

    public LivePullStreamTask withVodLoopTime(String vodLoopTime) {
        this.vodLoopTime = vodLoopTime;
        return this;
    }

    /**
     * 轮播播放次数，仅当source_type为PullVodPushLive生效。缺省值”-1”。-1：无限轮播，以结束时间为准；N：按文件列表播放N轮，以播放完成和结束时间先到的为准。不传、为空（\"\"）时按缺省值生效
     * @return vodLoopTime
     */
    public String getVodLoopTime() {
        return vodLoopTime;
    }

    public void setVodLoopTime(String vodLoopTime) {
        this.vodLoopTime = vodLoopTime;
    }

    public LivePullStreamTask withVodRefreshType(VodRefreshTypeEnum vodRefreshType) {
        this.vodRefreshType = vodRefreshType;
        return this;
    }

    /**
     * 轮播文件播放形式，仅当source_type为PullVodPushLive生效。缺省值immediate_new_source immediate_new_source：立即播放新的文件源 continue_from_file_start：从上次断流URL文件重新播放（更新任务时有效） continue_from_break_point：从上次断流URL文件断流位置重新播放（更新任务时有效）
     * @return vodRefreshType
     */
    public VodRefreshTypeEnum getVodRefreshType() {
        return vodRefreshType;
    }

    public void setVodRefreshType(VodRefreshTypeEnum vodRefreshType) {
        this.vodRefreshType = vodRefreshType;
    }

    public LivePullStreamTask withVodStartVideoIndex(Integer vodStartVideoIndex) {
        this.vodStartVideoIndex = vodStartVideoIndex;
        return this;
    }

    /**
     * 指定播放文件的下标，仅当source_type为PullVodPushLive生效。缺省值 0，从0开始表示第一个文件，最大值 len(source_urls)-1
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

    public LivePullStreamTask withVodStartVideoTime(Integer vodStartVideoTime) {
        this.vodStartVideoTime = vodStartVideoTime;
        return this;
    }

    /**
     * 缺省值 0，指定从上述指定文件的第几秒开始播放，仅当source_type为PullVodPushLive生效
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

    public LivePullStreamTask withBackupSourceType(String backupSourceType) {
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

    public LivePullStreamTask withBackupSourceUrls(List<String> backupSourceUrls) {
        this.backupSourceUrls = backupSourceUrls;
        return this;
    }

    public LivePullStreamTask addBackupSourceUrlsItem(String backupSourceUrlsItem) {
        if (this.backupSourceUrls == null) {
            this.backupSourceUrls = new ArrayList<>();
        }
        this.backupSourceUrls.add(backupSourceUrlsItem);
        return this;
    }

    public LivePullStreamTask withBackupSourceUrls(Consumer<List<String>> backupSourceUrlsSetter) {
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

    public LivePullStreamTask withCallbackEvents(List<CallbackEventsEnum> callbackEvents) {
        this.callbackEvents = callbackEvents;
        return this;
    }

    public LivePullStreamTask addCallbackEventsItem(CallbackEventsEnum callbackEventsItem) {
        if (this.callbackEvents == null) {
            this.callbackEvents = new ArrayList<>();
        }
        this.callbackEvents.add(callbackEventsItem);
        return this;
    }

    public LivePullStreamTask withCallbackEvents(Consumer<List<CallbackEventsEnum>> callbackEventsSetter) {
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
    public List<CallbackEventsEnum> getCallbackEvents() {
        return callbackEvents;
    }

    public void setCallbackEvents(List<CallbackEventsEnum> callbackEvents) {
        this.callbackEvents = callbackEvents;
    }

    public LivePullStreamTask withCallbackUrl(String callbackUrl) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LivePullStreamTask that = (LivePullStreamTask) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.sourceUrls, that.sourceUrls) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.streamName, that.streamName)
            && Objects.equals(this.pushArgs, that.pushArgs) && Objects.equals(this.destinationUrl, that.destinationUrl)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.vodLoopTime, that.vodLoopTime)
            && Objects.equals(this.vodRefreshType, that.vodRefreshType)
            && Objects.equals(this.vodStartVideoIndex, that.vodStartVideoIndex)
            && Objects.equals(this.vodStartVideoTime, that.vodStartVideoTime)
            && Objects.equals(this.backupSourceType, that.backupSourceType)
            && Objects.equals(this.backupSourceUrls, that.backupSourceUrls)
            && Objects.equals(this.callbackEvents, that.callbackEvents)
            && Objects.equals(this.callbackUrl, that.callbackUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            sourceType,
            sourceUrls,
            domain,
            appName,
            streamName,
            pushArgs,
            destinationUrl,
            startTime,
            endTime,
            vodLoopTime,
            vodRefreshType,
            vodStartVideoIndex,
            vodStartVideoTime,
            backupSourceType,
            backupSourceUrls,
            callbackEvents,
            callbackUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LivePullStreamTask {\n");
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
        sb.append("    vodLoopTime: ").append(toIndentedString(vodLoopTime)).append("\n");
        sb.append("    vodRefreshType: ").append(toIndentedString(vodRefreshType)).append("\n");
        sb.append("    vodStartVideoIndex: ").append(toIndentedString(vodStartVideoIndex)).append("\n");
        sb.append("    vodStartVideoTime: ").append(toIndentedString(vodStartVideoTime)).append("\n");
        sb.append("    backupSourceType: ").append(toIndentedString(backupSourceType)).append("\n");
        sb.append("    backupSourceUrls: ").append(toIndentedString(backupSourceUrls)).append("\n");
        sb.append("    callbackEvents: ").append(toIndentedString(callbackEvents)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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
