package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowProjectWatermarkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark")

    private Boolean watermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_update")

    private Boolean canUpdate;

    public ShowProjectWatermarkResponse withWatermark(Boolean watermark) {
        this.watermark = watermark;
        return this;
    }

    /**
     * **参数解释：** 水印设置状态。 - true，开启水印。 - false，关闭水印。 
     * @return watermark
     */
    public Boolean getWatermark() {
        return watermark;
    }

    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }

    public ShowProjectWatermarkResponse withCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
        return this;
    }

    /**
     * **参数解释：** 当前用户是否有权限更新水印设置。 - true，有权限更新。 - false，无权限更新。 
     * @return canUpdate
     */
    public Boolean getCanUpdate() {
        return canUpdate;
    }

    public void setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectWatermarkResponse that = (ShowProjectWatermarkResponse) obj;
        return Objects.equals(this.watermark, that.watermark) && Objects.equals(this.canUpdate, that.canUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermark, canUpdate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectWatermarkResponse {\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
        sb.append("    canUpdate: ").append(toIndentedString(canUpdate)).append("\n");
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
