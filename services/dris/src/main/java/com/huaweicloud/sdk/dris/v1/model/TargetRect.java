package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 目标检测框信息。
 */
public class TargetRect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_code")

    private String cameraCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_ip")

    private String cameraIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_pos")

    private TargetPos targetPos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_stamp_diff")

    private Long timeStampDiff;

    public TargetRect withCameraCode(String cameraCode) {
        this.cameraCode = cameraCode;
        return this;
    }

    /**
     * **参数说明**：摄像头编码。
     * @return cameraCode
     */
    public String getCameraCode() {
        return cameraCode;
    }

    public void setCameraCode(String cameraCode) {
        this.cameraCode = cameraCode;
    }

    public TargetRect withCameraIp(String cameraIp) {
        this.cameraIp = cameraIp;
        return this;
    }

    /**
     * **参数说明**：摄像头IP地址。
     * @return cameraIp
     */
    public String getCameraIp() {
        return cameraIp;
    }

    public void setCameraIp(String cameraIp) {
        this.cameraIp = cameraIp;
    }

    public TargetRect withTargetPos(TargetPos targetPos) {
        this.targetPos = targetPos;
        return this;
    }

    public TargetRect withTargetPos(Consumer<TargetPos> targetPosSetter) {
        if (this.targetPos == null) {
            this.targetPos = new TargetPos();
            targetPosSetter.accept(this.targetPos);
        }

        return this;
    }

    /**
     * Get targetPos
     * @return targetPos
     */
    public TargetPos getTargetPos() {
        return targetPos;
    }

    public void setTargetPos(TargetPos targetPos) {
        this.targetPos = targetPos;
    }

    public TargetRect withTimeStampDiff(Long timeStampDiff) {
        this.timeStampDiff = timeStampDiff;
        return this;
    }

    /**
     * **参数说明**：与SnapTime的时间差值：当前检测框所在相机的时间戳减去雷视拟合轨迹中的SnapTime的差值。
     * @return timeStampDiff
     */
    public Long getTimeStampDiff() {
        return timeStampDiff;
    }

    public void setTimeStampDiff(Long timeStampDiff) {
        this.timeStampDiff = timeStampDiff;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetRect that = (TargetRect) obj;
        return Objects.equals(this.cameraCode, that.cameraCode) && Objects.equals(this.cameraIp, that.cameraIp)
            && Objects.equals(this.targetPos, that.targetPos) && Objects.equals(this.timeStampDiff, that.timeStampDiff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cameraCode, cameraIp, targetPos, timeStampDiff);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetRect {\n");
        sb.append("    cameraCode: ").append(toIndentedString(cameraCode)).append("\n");
        sb.append("    cameraIp: ").append(toIndentedString(cameraIp)).append("\n");
        sb.append("    targetPos: ").append(toIndentedString(targetPos)).append("\n");
        sb.append("    timeStampDiff: ").append(toIndentedString(timeStampDiff)).append("\n");
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
