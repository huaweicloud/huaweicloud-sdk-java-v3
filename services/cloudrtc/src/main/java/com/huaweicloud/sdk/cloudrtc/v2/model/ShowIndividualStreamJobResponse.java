package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIndividualStreamJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_record_audio")

    private Boolean isRecordAudio;

    /**
     * 标识视频流的类型，可选摄像头流或者屏幕分享流，未填写表示不录制视频。  - CAMERASTREAM：摄像头视频流 - SCREENSTREAM：屏幕分享视频流  默认为CAMERASTREAM。 
     */
    public static final class VideoTypeEnum {

        /**
         * Enum CAMERASTREAM for value: "CAMERASTREAM"
         */
        public static final VideoTypeEnum CAMERASTREAM = new VideoTypeEnum("CAMERASTREAM");

        /**
         * Enum SCREENSTREAM for value: "SCREENSTREAM"
         */
        public static final VideoTypeEnum SCREENSTREAM = new VideoTypeEnum("SCREENSTREAM");

        /**
         * Enum EMPTY for value: ""
         */
        public static final VideoTypeEnum EMPTY = new VideoTypeEnum("");

        private static final Map<String, VideoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoTypeEnum> createStaticFields() {
            Map<String, VideoTypeEnum> map = new HashMap<>();
            map.put("CAMERASTREAM", CAMERASTREAM);
            map.put("SCREENSTREAM", SCREENSTREAM);
            map.put("", EMPTY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoTypeEnum(String value) {
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
        public static VideoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VideoTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VideoTypeEnum(value);
            }
            return result;
        }

        public static VideoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VideoTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VideoTypeEnum) {
                return this.value.equals(((VideoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_type")

    private VideoTypeEnum videoType;

    /**
     * 指定窗口拉取的分辨率档位。  - LD - SD - HD - FHD  缺省为FHD。 
     */
    public static final class SelectStreamTypeEnum {

        /**
         * Enum LD for value: "LD"
         */
        public static final SelectStreamTypeEnum LD = new SelectStreamTypeEnum("LD");

        /**
         * Enum SD for value: "SD"
         */
        public static final SelectStreamTypeEnum SD = new SelectStreamTypeEnum("SD");

        /**
         * Enum HD for value: "HD"
         */
        public static final SelectStreamTypeEnum HD = new SelectStreamTypeEnum("HD");

        /**
         * Enum FHD for value: "FHD"
         */
        public static final SelectStreamTypeEnum FHD = new SelectStreamTypeEnum("FHD");

        private static final Map<String, SelectStreamTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SelectStreamTypeEnum> createStaticFields() {
            Map<String, SelectStreamTypeEnum> map = new HashMap<>();
            map.put("LD", LD);
            map.put("SD", SD);
            map.put("HD", HD);
            map.put("FHD", FHD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SelectStreamTypeEnum(String value) {
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
        public static SelectStreamTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SelectStreamTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SelectStreamTypeEnum(value);
            }
            return result;
        }

        public static SelectStreamTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SelectStreamTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SelectStreamTypeEnum) {
                return this.value.equals(((SelectStreamTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_stream_type")

    private SelectStreamTypeEnum selectStreamType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_idle_time")

    private Integer maxIdleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_param")

    private RecordParam recordParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    /**
     * 任务状态。  - INIT：任务正在初始化 - RUNNING：任务正在运行 - STOPPED：任务已停止 
     */
    public static final class StateEnum {

        /**
         * Enum INIT for value: "INIT"
         */
        public static final StateEnum INIT = new StateEnum("INIT");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StateEnum STOPPED = new StateEnum("STOPPED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("INIT", INIT);
            map.put("RUNNING", RUNNING);
            map.put("STOPPED", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    /**
     * 任务结束原因 - TENANT_STOP - EXCEED_MAX_IDLE_TIME - INTERNAL_ERROR
     */
    public static final class StopReasonEnum {

        /**
         * Enum TENANT_STOP for value: "TENANT_STOP"
         */
        public static final StopReasonEnum TENANT_STOP = new StopReasonEnum("TENANT_STOP");

        /**
         * Enum EXCEED_MAX_IDLE_TIME for value: "EXCEED_MAX_IDLE_TIME"
         */
        public static final StopReasonEnum EXCEED_MAX_IDLE_TIME = new StopReasonEnum("EXCEED_MAX_IDLE_TIME");

        /**
         * Enum INTERNAL_ERROR for value: "INTERNAL_ERROR"
         */
        public static final StopReasonEnum INTERNAL_ERROR = new StopReasonEnum("INTERNAL_ERROR");

        private static final Map<String, StopReasonEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StopReasonEnum> createStaticFields() {
            Map<String, StopReasonEnum> map = new HashMap<>();
            map.put("TENANT_STOP", TENANT_STOP);
            map.put("EXCEED_MAX_IDLE_TIME", EXCEED_MAX_IDLE_TIME);
            map.put("INTERNAL_ERROR", INTERNAL_ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StopReasonEnum(String value) {
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
        public static StopReasonEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StopReasonEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StopReasonEnum(value);
            }
            return result;
        }

        public static StopReasonEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StopReasonEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StopReasonEnum) {
                return this.value.equals(((StopReasonEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_reason")

    private StopReasonEnum stopReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    private String stopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")

    private String xRequestId;

    public ShowIndividualStreamJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务编号
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowIndividualStreamJobResponse withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 流名
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ShowIndividualStreamJobResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowIndividualStreamJobResponse withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 房间id
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public ShowIndividualStreamJobResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 选看的用户id，单个录制任务内保证唯一
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowIndividualStreamJobResponse withIsRecordAudio(Boolean isRecordAudio) {
        this.isRecordAudio = isRecordAudio;
        return this;
    }

    /**
     *  是否录制音频。  - true：录制音频 - false：不录制音频  缺省为true。 
     * @return isRecordAudio
     */
    public Boolean getIsRecordAudio() {
        return isRecordAudio;
    }

    public void setIsRecordAudio(Boolean isRecordAudio) {
        this.isRecordAudio = isRecordAudio;
    }

    public ShowIndividualStreamJobResponse withVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
        return this;
    }

    /**
     * 标识视频流的类型，可选摄像头流或者屏幕分享流，未填写表示不录制视频。  - CAMERASTREAM：摄像头视频流 - SCREENSTREAM：屏幕分享视频流  默认为CAMERASTREAM。 
     * @return videoType
     */
    public VideoTypeEnum getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
    }

    public ShowIndividualStreamJobResponse withSelectStreamType(SelectStreamTypeEnum selectStreamType) {
        this.selectStreamType = selectStreamType;
        return this;
    }

    /**
     * 指定窗口拉取的分辨率档位。  - LD - SD - HD - FHD  缺省为FHD。 
     * @return selectStreamType
     */
    public SelectStreamTypeEnum getSelectStreamType() {
        return selectStreamType;
    }

    public void setSelectStreamType(SelectStreamTypeEnum selectStreamType) {
        this.selectStreamType = selectStreamType;
    }

    public ShowIndividualStreamJobResponse withMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }

    /**
     * 最长空闲频道时间。  取值范围：[5，43200]，默认值为30。  单位：秒。  如果频道内无连麦方的状态持续超过该时间，录制程序会自动退出。退出后，再次调用start请求，会产生新的录制任务。  连麦方指：joiner或者publisher的用户。 
     * minimum: 5
     * maximum: 43200
     * @return maxIdleTime
     */
    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }

    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    public ShowIndividualStreamJobResponse withRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
        return this;
    }

    public ShowIndividualStreamJobResponse withRecordParam(Consumer<RecordParam> recordParamSetter) {
        if (this.recordParam == null) {
            this.recordParam = new RecordParam();
            recordParamSetter.accept(this.recordParam);
        }

        return this;
    }

    /**
     * Get recordParam
     * @return recordParam
     */
    public RecordParam getRecordParam() {
        return recordParam;
    }

    public void setRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
    }

    public ShowIndividualStreamJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowIndividualStreamJobResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowIndividualStreamJobResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态。  - INIT：任务正在初始化 - RUNNING：任务正在运行 - STOPPED：任务已停止 
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowIndividualStreamJobResponse withStopReason(StopReasonEnum stopReason) {
        this.stopReason = stopReason;
        return this;
    }

    /**
     * 任务结束原因 - TENANT_STOP - EXCEED_MAX_IDLE_TIME - INTERNAL_ERROR
     * @return stopReason
     */
    public StopReasonEnum getStopReason() {
        return stopReason;
    }

    public void setStopReason(StopReasonEnum stopReason) {
        this.stopReason = stopReason;
    }

    public ShowIndividualStreamJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 针对任务状态的详细信息描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowIndividualStreamJobResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowIndividualStreamJobResponse withStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 任务完成时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public ShowIndividualStreamJobResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIndividualStreamJobResponse showIndividualStreamJobResponse = (ShowIndividualStreamJobResponse) o;
        return Objects.equals(this.jobId, showIndividualStreamJobResponse.jobId)
            && Objects.equals(this.streamName, showIndividualStreamJobResponse.streamName)
            && Objects.equals(this.appId, showIndividualStreamJobResponse.appId)
            && Objects.equals(this.roomId, showIndividualStreamJobResponse.roomId)
            && Objects.equals(this.userId, showIndividualStreamJobResponse.userId)
            && Objects.equals(this.isRecordAudio, showIndividualStreamJobResponse.isRecordAudio)
            && Objects.equals(this.videoType, showIndividualStreamJobResponse.videoType)
            && Objects.equals(this.selectStreamType, showIndividualStreamJobResponse.selectStreamType)
            && Objects.equals(this.maxIdleTime, showIndividualStreamJobResponse.maxIdleTime)
            && Objects.equals(this.recordParam, showIndividualStreamJobResponse.recordParam)
            && Objects.equals(this.createTime, showIndividualStreamJobResponse.createTime)
            && Objects.equals(this.updateTime, showIndividualStreamJobResponse.updateTime)
            && Objects.equals(this.state, showIndividualStreamJobResponse.state)
            && Objects.equals(this.stopReason, showIndividualStreamJobResponse.stopReason)
            && Objects.equals(this.description, showIndividualStreamJobResponse.description)
            && Objects.equals(this.startTime, showIndividualStreamJobResponse.startTime)
            && Objects.equals(this.stopTime, showIndividualStreamJobResponse.stopTime)
            && Objects.equals(this.xRequestId, showIndividualStreamJobResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            streamName,
            appId,
            roomId,
            userId,
            isRecordAudio,
            videoType,
            selectStreamType,
            maxIdleTime,
            recordParam,
            createTime,
            updateTime,
            state,
            stopReason,
            description,
            startTime,
            stopTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIndividualStreamJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    isRecordAudio: ").append(toIndentedString(isRecordAudio)).append("\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    selectStreamType: ").append(toIndentedString(selectStreamType)).append("\n");
        sb.append("    maxIdleTime: ").append(toIndentedString(maxIdleTime)).append("\n");
        sb.append("    recordParam: ").append(toIndentedString(recordParam)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stopReason: ").append(toIndentedString(stopReason)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
