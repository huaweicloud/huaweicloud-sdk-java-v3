package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 交通参与者
 */
public class EventParticipant {

    /**
     * **参数说明**：交通参与者的具体类型描述。  **取值范围**：  - unknown：未知  - motor：机动车  - non-motor：非机动车  - pedestrian：行人 
     */
    public static final class PtcTypeEnum {

        /**
         * Enum UNKNOWN for value: "unknown"
         */
        public static final PtcTypeEnum UNKNOWN = new PtcTypeEnum("unknown");

        /**
         * Enum MOTOR for value: "motor"
         */
        public static final PtcTypeEnum MOTOR = new PtcTypeEnum("motor");

        /**
         * Enum NON_MOTOR for value: "non-motor"
         */
        public static final PtcTypeEnum NON_MOTOR = new PtcTypeEnum("non-motor");

        /**
         * Enum PEDESTRIAN for value: "pedestrian"
         */
        public static final PtcTypeEnum PEDESTRIAN = new PtcTypeEnum("pedestrian");

        private static final Map<String, PtcTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PtcTypeEnum> createStaticFields() {
            Map<String, PtcTypeEnum> map = new HashMap<>();
            map.put("unknown", UNKNOWN);
            map.put("motor", MOTOR);
            map.put("non-motor", NON_MOTOR);
            map.put("pedestrian", PEDESTRIAN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PtcTypeEnum(String value) {
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
        public static PtcTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PtcTypeEnum(value));
        }

        public static PtcTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PtcTypeEnum) {
                return this.value.equals(((PtcTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptc_type")

    private PtcTypeEnum ptcType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_no")

    private String plateNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_class")

    private Integer vehicleClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gat_vehicle_class")

    private String gatVehicleClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "track_id")

    private Long trackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lane_no")

    private Integer laneNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_rects")

    private List<TargetRect> targetRects = null;

    public EventParticipant withPtcType(PtcTypeEnum ptcType) {
        this.ptcType = ptcType;
        return this;
    }

    /**
     * **参数说明**：交通参与者的具体类型描述。  **取值范围**：  - unknown：未知  - motor：机动车  - non-motor：非机动车  - pedestrian：行人 
     * @return ptcType
     */
    public PtcTypeEnum getPtcType() {
        return ptcType;
    }

    public void setPtcType(PtcTypeEnum ptcType) {
        this.ptcType = ptcType;
    }

    public EventParticipant withPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }

    /**
     * **参数说明**：车牌号。
     * @return plateNo
     */
    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public EventParticipant withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * **参数说明**：对应车辆被检测到超速或者慢行时的速度小。单位为0.02米每秒。值为8191时代表无效数值。
     * minimum: 0
     * maximum: 8191
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public EventParticipant withVehicleClass(Integer vehicleClass) {
        this.vehicleClass = vehicleClass;
        return this;
    }

    /**
     * **参数说明**：车辆类型。参考 [车辆基本类型参数说明](https://support.huaweicloud.com/api-v2x/v2x_04_0162.html)。
     * minimum: 0
     * maximum: 255
     * @return vehicleClass
     */
    public Integer getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(Integer vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public EventParticipant withGatVehicleClass(String gatVehicleClass) {
        this.gatVehicleClass = gatVehicleClass;
        return this;
    }

    /**
     * **参数说明**：机动车车辆类型。参考[机动车车辆类型](https://support.huaweicloud.com/api-v2x/v2x_04_0179.html)。
     * @return gatVehicleClass
     */
    public String getGatVehicleClass() {
        return gatVehicleClass;
    }

    public void setGatVehicleClass(String gatVehicleClass) {
        this.gatVehicleClass = gatVehicleClass;
    }

    public EventParticipant withTrackId(Long trackId) {
        this.trackId = trackId;
        return this;
    }

    /**
     * **参数说明**：感知设备识别的id，具体表示为机动车轨迹ID。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return trackId
     */
    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public EventParticipant withLaneNo(Integer laneNo) {
        this.laneNo = laneNo;
        return this;
    }

    /**
     * **参数说明**：事件发生的所在车道
     * minimum: 0
     * maximum: 99
     * @return laneNo
     */
    public Integer getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(Integer laneNo) {
        this.laneNo = laneNo;
    }

    public EventParticipant withTargetRects(List<TargetRect> targetRects) {
        this.targetRects = targetRects;
        return this;
    }

    public EventParticipant addTargetRectsItem(TargetRect targetRectsItem) {
        if (this.targetRects == null) {
            this.targetRects = new ArrayList<>();
        }
        this.targetRects.add(targetRectsItem);
        return this;
    }

    public EventParticipant withTargetRects(Consumer<List<TargetRect>> targetRectsSetter) {
        if (this.targetRects == null) {
            this.targetRects = new ArrayList<>();
        }
        targetRectsSetter.accept(this.targetRects);
        return this;
    }

    /**
     * **参数说明**：目标检测框信息列表。
     * @return targetRects
     */
    public List<TargetRect> getTargetRects() {
        return targetRects;
    }

    public void setTargetRects(List<TargetRect> targetRects) {
        this.targetRects = targetRects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventParticipant that = (EventParticipant) obj;
        return Objects.equals(this.ptcType, that.ptcType) && Objects.equals(this.plateNo, that.plateNo)
            && Objects.equals(this.speed, that.speed) && Objects.equals(this.vehicleClass, that.vehicleClass)
            && Objects.equals(this.gatVehicleClass, that.gatVehicleClass) && Objects.equals(this.trackId, that.trackId)
            && Objects.equals(this.laneNo, that.laneNo) && Objects.equals(this.targetRects, that.targetRects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ptcType, plateNo, speed, vehicleClass, gatVehicleClass, trackId, laneNo, targetRects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventParticipant {\n");
        sb.append("    ptcType: ").append(toIndentedString(ptcType)).append("\n");
        sb.append("    plateNo: ").append(toIndentedString(plateNo)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    vehicleClass: ").append(toIndentedString(vehicleClass)).append("\n");
        sb.append("    gatVehicleClass: ").append(toIndentedString(gatVehicleClass)).append("\n");
        sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
        sb.append("    laneNo: ").append(toIndentedString(laneNo)).append("\n");
        sb.append("    targetRects: ").append(toIndentedString(targetRects)).append("\n");
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
