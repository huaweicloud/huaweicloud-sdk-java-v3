package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单流任务请求，转推和录制至少选一个
 */
public class IndividualStreamJobReq {

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

        private static final Map<String, VideoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoTypeEnum> createStaticFields() {
            Map<String, VideoTypeEnum> map = new HashMap<>();
            map.put("CAMERASTREAM", CAMERASTREAM);
            map.put("SCREENSTREAM", SCREENSTREAM);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VideoTypeEnum(value));
        }

        public static VideoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SelectStreamTypeEnum(value));
        }

        public static SelectStreamTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public IndividualStreamJobReq withRoomId(String roomId) {
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

    public IndividualStreamJobReq withUserId(String userId) {
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

    public IndividualStreamJobReq withIsRecordAudio(Boolean isRecordAudio) {
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

    public IndividualStreamJobReq withVideoType(VideoTypeEnum videoType) {
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

    public IndividualStreamJobReq withSelectStreamType(SelectStreamTypeEnum selectStreamType) {
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

    public IndividualStreamJobReq withMaxIdleTime(Integer maxIdleTime) {
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

    public IndividualStreamJobReq withRecordParam(RecordParam recordParam) {
        this.recordParam = recordParam;
        return this;
    }

    public IndividualStreamJobReq withRecordParam(Consumer<RecordParam> recordParamSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndividualStreamJobReq that = (IndividualStreamJobReq) obj;
        return Objects.equals(this.roomId, that.roomId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.isRecordAudio, that.isRecordAudio) && Objects.equals(this.videoType, that.videoType)
            && Objects.equals(this.selectStreamType, that.selectStreamType)
            && Objects.equals(this.maxIdleTime, that.maxIdleTime) && Objects.equals(this.recordParam, that.recordParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, userId, isRecordAudio, videoType, selectStreamType, maxIdleTime, recordParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndividualStreamJobReq {\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    isRecordAudio: ").append(toIndentedString(isRecordAudio)).append("\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    selectStreamType: ").append(toIndentedString(selectStreamType)).append("\n");
        sb.append("    maxIdleTime: ").append(toIndentedString(maxIdleTime)).append("\n");
        sb.append("    recordParam: ").append(toIndentedString(recordParam)).append("\n");
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
