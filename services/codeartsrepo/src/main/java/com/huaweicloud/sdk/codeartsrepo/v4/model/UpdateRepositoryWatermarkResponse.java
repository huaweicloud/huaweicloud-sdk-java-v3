package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateRepositoryWatermarkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark")

    private Boolean watermark;

    public UpdateRepositoryWatermarkResponse withWatermark(Boolean watermark) {
        this.watermark = watermark;
        return this;
    }

    /**
     * **参数解释：** 水印开启状态。 - true，开启水印。 - false，关闭水印。 
     * @return watermark
     */
    public Boolean getWatermark() {
        return watermark;
    }

    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRepositoryWatermarkResponse that = (UpdateRepositoryWatermarkResponse) obj;
        return Objects.equals(this.watermark, that.watermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepositoryWatermarkResponse {\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
