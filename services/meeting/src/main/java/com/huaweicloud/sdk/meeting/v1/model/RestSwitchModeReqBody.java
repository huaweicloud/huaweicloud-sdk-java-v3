package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 切换多画面模式消息体。
 */
public class RestSwitchModeReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchMode")

    private String switchMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageType")

    private Integer imageType;

    public RestSwitchModeReqBody withSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }

    /**
     * 会议显示策略。 - Fixed: 固定广播与会者。 - VAS: 声控切换。
     * @return switchMode
     */
    public String getSwitchMode() {
        return switchMode;
    }

    public void setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
    }

    public RestSwitchModeReqBody withImageType(Integer imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 画面类型。单画面设置只针对声控模式。 - 0: 单画面。 - 1: 多画面。
     * @return imageType
     */
    public Integer getImageType() {
        return imageType;
    }

    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestSwitchModeReqBody restSwitchModeReqBody = (RestSwitchModeReqBody) o;
        return Objects.equals(this.switchMode, restSwitchModeReqBody.switchMode)
            && Objects.equals(this.imageType, restSwitchModeReqBody.imageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchMode, imageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSwitchModeReqBody {\n");
        sb.append("    switchMode: ").append(toIndentedString(switchMode)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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
