package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** RtcServerRoomInfo */
public class RtcServerRoomInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    /** 房间状态，取值如下： - RUNNING：开启中 - CLOSED：已关闭 */
    public static final class StateEnum {

        /** Enum RUNNING for value: "RUNNING" */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /** Enum CLOSED for value: "CLOSED" */
        public static final StateEnum CLOSED = new StateEnum("CLOSED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("CLOSED", CLOSED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public RtcServerRoomInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 域名
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public RtcServerRoomInfo withApp(String app) {
        this.app = app;
        return this;
    }

    /** 应用标识
     * 
     * @return app */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public RtcServerRoomInfo withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /** 房间ID
     * 
     * @return roomId */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public RtcServerRoomInfo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /** 房间状态，取值如下： - RUNNING：开启中 - CLOSED：已关闭
     * 
     * @return state */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public RtcServerRoomInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /** 房间持续时长 minimum: 0 maximum: 1844674407
     * 
     * @return duration */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public RtcServerRoomInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 房间开始时间，即第一个用户加入房间时间，UTC时间，格式：YYYY-MM-DDThh:mm:ssZ，如2020-04-23T07:00:00Z
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public RtcServerRoomInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 房间关闭时间，即最后一个room_uuid关闭的时间，UTC时间，格式：YYYY-MM-DDThh:mm:ssZ，如2020-04-23T07:00:00Z，若房间未关闭，则返回 “-”
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RtcServerRoomInfo rtcServerRoomInfo = (RtcServerRoomInfo) o;
        return Objects.equals(this.domain, rtcServerRoomInfo.domain) && Objects.equals(this.app, rtcServerRoomInfo.app)
            && Objects.equals(this.roomId, rtcServerRoomInfo.roomId)
            && Objects.equals(this.state, rtcServerRoomInfo.state)
            && Objects.equals(this.duration, rtcServerRoomInfo.duration)
            && Objects.equals(this.startTime, rtcServerRoomInfo.startTime)
            && Objects.equals(this.endTime, rtcServerRoomInfo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, app, roomId, state, duration, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RtcServerRoomInfo {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
