package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListRtcAbnormalEventDimensionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    /** 分组类型，支持同时指定两种类型 - abnormal_type：异常类型 - abnormal_factor：异常因素 */
    public static final class DimensionEnum {

        /** Enum ABNORMAL_TYPE for value: "abnormal_type" */
        public static final DimensionEnum ABNORMAL_TYPE = new DimensionEnum("abnormal_type");

        /** Enum ABNORMAL_FACTOR for value: "abnormal_factor" */
        public static final DimensionEnum ABNORMAL_FACTOR = new DimensionEnum("abnormal_factor");

        private static final Map<String, DimensionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimensionEnum> createStaticFields() {
            Map<String, DimensionEnum> map = new HashMap<>();
            map.put("abnormal_type", ABNORMAL_TYPE);
            map.put("abnormal_factor", ABNORMAL_FACTOR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimensionEnum(String value) {
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
        public static DimensionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DimensionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DimensionEnum(value);
            }
            return result;
        }

        public static DimensionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DimensionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimensionEnum) {
                return this.value.equals(((DimensionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private DimensionEnum dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListRtcAbnormalEventDimensionRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /** 应用ID
     * 
     * @return app */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListRtcAbnormalEventDimensionRequest withRoomId(String roomId) {
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

    public ListRtcAbnormalEventDimensionRequest withDimension(DimensionEnum dimension) {
        this.dimension = dimension;
        return this;
    }

    /** 分组类型，支持同时指定两种类型 - abnormal_type：异常类型 - abnormal_factor：异常因素
     * 
     * @return dimension */
    public DimensionEnum getDimension() {
        return dimension;
    }

    public void setDimension(DimensionEnum dimension) {
        this.dimension = dimension;
    }

    public ListRtcAbnormalEventDimensionRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 查询起始时间。UTC时间，格式：YYYY-MM-DDThh:mm:ssZ，如2020-04-23T06:00:00Z，不填写则默认读取过去1小时数据数据。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListRtcAbnormalEventDimensionRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 查询结束时间。UTC时间，格式：YYYY-MM-DDThh:mm:ssZ，如2020-04-23T07:00:00Z，不填写则默认为当前时间。
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
        ListRtcAbnormalEventDimensionRequest listRtcAbnormalEventDimensionRequest =
            (ListRtcAbnormalEventDimensionRequest) o;
        return Objects.equals(this.app, listRtcAbnormalEventDimensionRequest.app)
            && Objects.equals(this.roomId, listRtcAbnormalEventDimensionRequest.roomId)
            && Objects.equals(this.dimension, listRtcAbnormalEventDimensionRequest.dimension)
            && Objects.equals(this.startTime, listRtcAbnormalEventDimensionRequest.startTime)
            && Objects.equals(this.endTime, listRtcAbnormalEventDimensionRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, roomId, dimension, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcAbnormalEventDimensionRequest {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
