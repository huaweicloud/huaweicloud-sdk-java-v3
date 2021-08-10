package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class SearchQosParticipantDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    private String confUUID;

    /** 会议类别。 * online：在线会议，在召开的会议。 * history：历史会议，已召开的会议。 */
    public static final class ConfTypeEnum {

        /** Enum ONLINE for value: "online" */
        public static final ConfTypeEnum ONLINE = new ConfTypeEnum("online");

        /** Enum HISTORY for value: "history" */
        public static final ConfTypeEnum HISTORY = new ConfTypeEnum("history");

        private static final Map<String, ConfTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfTypeEnum> createStaticFields() {
            Map<String, ConfTypeEnum> map = new HashMap<>();
            map.put("online", ONLINE);
            map.put("history", HISTORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfTypeEnum(String value) {
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
        public static ConfTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConfTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConfTypeEnum(value);
            }
            return result;
        }

        public static ConfTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConfTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfTypeEnum) {
                return this.value.equals(((ConfTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confType")

    private ConfTypeEnum confType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    /** Qos类型。 - audio：音频。 - video：视频。 - screen：屏幕共享。 - cpu：cpu。 */
    public static final class QosTypeEnum {

        /** Enum AUDIO for value: "audio" */
        public static final QosTypeEnum AUDIO = new QosTypeEnum("audio");

        /** Enum VIDEO for value: "video" */
        public static final QosTypeEnum VIDEO = new QosTypeEnum("video");

        /** Enum SCREEN for value: "screen" */
        public static final QosTypeEnum SCREEN = new QosTypeEnum("screen");

        /** Enum CPU for value: "cpu" */
        public static final QosTypeEnum CPU = new QosTypeEnum("cpu");

        private static final Map<String, QosTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QosTypeEnum> createStaticFields() {
            Map<String, QosTypeEnum> map = new HashMap<>();
            map.put("audio", AUDIO);
            map.put("video", VIDEO);
            map.put("screen", SCREEN);
            map.put("cpu", CPU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QosTypeEnum(String value) {
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
        public static QosTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QosTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QosTypeEnum(value);
            }
            return result;
        }

        public static QosTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QosTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QosTypeEnum) {
                return this.value.equals(((QosTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qosType")

    private QosTypeEnum qosType;

    public SearchQosParticipantDetailRequest withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    /** 会议UUID。最大不超过64个字节。
     * 
     * @return confUUID */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    public SearchQosParticipantDetailRequest withConfType(ConfTypeEnum confType) {
        this.confType = confType;
        return this;
    }

    /** 会议类别。 * online：在线会议，在召开的会议。 * history：历史会议，已召开的会议。
     * 
     * @return confType */
    public ConfTypeEnum getConfType() {
        return confType;
    }

    public void setConfType(ConfTypeEnum confType) {
        this.confType = confType;
    }

    public SearchQosParticipantDetailRequest withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /** 与会者ID。最大不超过64个字节。
     * 
     * @return participantID */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public SearchQosParticipantDetailRequest withQosType(QosTypeEnum qosType) {
        this.qosType = qosType;
        return this;
    }

    /** Qos类型。 - audio：音频。 - video：视频。 - screen：屏幕共享。 - cpu：cpu。
     * 
     * @return qosType */
    public QosTypeEnum getQosType() {
        return qosType;
    }

    public void setQosType(QosTypeEnum qosType) {
        this.qosType = qosType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchQosParticipantDetailRequest searchQosParticipantDetailRequest = (SearchQosParticipantDetailRequest) o;
        return Objects.equals(this.confUUID, searchQosParticipantDetailRequest.confUUID)
            && Objects.equals(this.confType, searchQosParticipantDetailRequest.confType)
            && Objects.equals(this.participantID, searchQosParticipantDetailRequest.participantID)
            && Objects.equals(this.qosType, searchQosParticipantDetailRequest.qosType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confUUID, confType, participantID, qosType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQosParticipantDetailRequest {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    confType: ").append(toIndentedString(confType)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    qosType: ").append(toIndentedString(qosType)).append("\n");
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
