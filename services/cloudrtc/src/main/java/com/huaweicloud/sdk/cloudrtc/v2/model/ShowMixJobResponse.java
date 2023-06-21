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
public class ShowMixJobResponse extends SdkResponse {

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
    @JsonProperty(value = "mix_param")

    private MixParam mixParam;

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

    public ShowMixJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务编号，可以用于修改、查看和停止合流任务
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowMixJobResponse withStreamName(String streamName) {
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

    public ShowMixJobResponse withAppId(String appId) {
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

    public ShowMixJobResponse withRoomId(String roomId) {
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

    public ShowMixJobResponse withMixParam(MixParam mixParam) {
        this.mixParam = mixParam;
        return this;
    }

    public ShowMixJobResponse withMixParam(Consumer<MixParam> mixParamSetter) {
        if (this.mixParam == null) {
            this.mixParam = new MixParam();
            mixParamSetter.accept(this.mixParam);
        }

        return this;
    }

    /**
     * Get mixParam
     * @return mixParam
     */
    public MixParam getMixParam() {
        return mixParam;
    }

    public void setMixParam(MixParam mixParam) {
        this.mixParam = mixParam;
    }

    public ShowMixJobResponse withRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
        return this;
    }

    public ShowMixJobResponse withRecordParam(Consumer<RecordParam> recordParamSetter) {
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

    public ShowMixJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建的时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowMixJobResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 任务中的布局更新的时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowMixJobResponse withState(StateEnum state) {
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

    public ShowMixJobResponse withStopReason(StopReasonEnum stopReason) {
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

    public ShowMixJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 状态描述，对state字段的一些补充说明，可用于人工查阅。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowMixJobResponse withStartTime(String startTime) {
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

    public ShowMixJobResponse withStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 任务结束时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public ShowMixJobResponse withXRequestId(String xRequestId) {
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
        ShowMixJobResponse showMixJobResponse = (ShowMixJobResponse) o;
        return Objects.equals(this.jobId, showMixJobResponse.jobId)
            && Objects.equals(this.streamName, showMixJobResponse.streamName)
            && Objects.equals(this.appId, showMixJobResponse.appId)
            && Objects.equals(this.roomId, showMixJobResponse.roomId)
            && Objects.equals(this.mixParam, showMixJobResponse.mixParam)
            && Objects.equals(this.recordParam, showMixJobResponse.recordParam)
            && Objects.equals(this.createTime, showMixJobResponse.createTime)
            && Objects.equals(this.updateTime, showMixJobResponse.updateTime)
            && Objects.equals(this.state, showMixJobResponse.state)
            && Objects.equals(this.stopReason, showMixJobResponse.stopReason)
            && Objects.equals(this.description, showMixJobResponse.description)
            && Objects.equals(this.startTime, showMixJobResponse.startTime)
            && Objects.equals(this.stopTime, showMixJobResponse.stopTime)
            && Objects.equals(this.xRequestId, showMixJobResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            streamName,
            appId,
            roomId,
            mixParam,
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
        sb.append("class ShowMixJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    mixParam: ").append(toIndentedString(mixParam)).append("\n");
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
