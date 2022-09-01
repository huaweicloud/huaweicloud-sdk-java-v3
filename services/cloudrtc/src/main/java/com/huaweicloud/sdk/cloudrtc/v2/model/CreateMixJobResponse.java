package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateMixJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    @JacksonXmlProperty(localName = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    @JacksonXmlProperty(localName = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mix_param")

    @JacksonXmlProperty(localName = "mix_param")

    private MixParam mixParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_param")

    @JacksonXmlProperty(localName = "record_param")

    private RecordParam recordParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

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

    @JacksonXmlProperty(localName = "state")

    private StateEnum state;

    /**
     * 任务结束原因
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

    @JacksonXmlProperty(localName = "stop_reason")

    private StopReasonEnum stopReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    @JacksonXmlProperty(localName = "stop_time")

    private String stopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")

    @JacksonXmlProperty(localName = "X-request-Id")

    private String xRequestId;

    public CreateMixJobResponse withJobId(String jobId) {
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

    public CreateMixJobResponse withStreamName(String streamName) {
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

    public CreateMixJobResponse withAppId(String appId) {
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

    public CreateMixJobResponse withRoomId(String roomId) {
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

    public CreateMixJobResponse withMixParam(MixParam mixParam) {
        this.mixParam = mixParam;
        return this;
    }

    public CreateMixJobResponse withMixParam(Consumer<MixParam> mixParamSetter) {
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

    public CreateMixJobResponse withRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
        return this;
    }

    public CreateMixJobResponse withRecordParam(Consumer<RecordParam> recordParamSetter) {
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

    public CreateMixJobResponse withCreateTime(String createTime) {
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

    public CreateMixJobResponse withUpdateTime(String updateTime) {
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

    public CreateMixJobResponse withState(StateEnum state) {
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

    public CreateMixJobResponse withStopReason(StopReasonEnum stopReason) {
        this.stopReason = stopReason;
        return this;
    }

    /**
     * 任务结束原因
     * @return stopReason
     */
    public StopReasonEnum getStopReason() {
        return stopReason;
    }

    public void setStopReason(StopReasonEnum stopReason) {
        this.stopReason = stopReason;
    }

    public CreateMixJobResponse withDescription(String description) {
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

    public CreateMixJobResponse withStartTime(String startTime) {
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

    public CreateMixJobResponse withStopTime(String stopTime) {
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

    public CreateMixJobResponse withXRequestId(String xRequestId) {
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
        CreateMixJobResponse createMixJobResponse = (CreateMixJobResponse) o;
        return Objects.equals(this.jobId, createMixJobResponse.jobId)
            && Objects.equals(this.streamName, createMixJobResponse.streamName)
            && Objects.equals(this.appId, createMixJobResponse.appId)
            && Objects.equals(this.roomId, createMixJobResponse.roomId)
            && Objects.equals(this.mixParam, createMixJobResponse.mixParam)
            && Objects.equals(this.recordParam, createMixJobResponse.recordParam)
            && Objects.equals(this.createTime, createMixJobResponse.createTime)
            && Objects.equals(this.updateTime, createMixJobResponse.updateTime)
            && Objects.equals(this.state, createMixJobResponse.state)
            && Objects.equals(this.stopReason, createMixJobResponse.stopReason)
            && Objects.equals(this.description, createMixJobResponse.description)
            && Objects.equals(this.startTime, createMixJobResponse.startTime)
            && Objects.equals(this.stopTime, createMixJobResponse.stopTime)
            && Objects.equals(this.xRequestId, createMixJobResponse.xRequestId);
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
        sb.append("class CreateMixJobResponse {\n");
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
