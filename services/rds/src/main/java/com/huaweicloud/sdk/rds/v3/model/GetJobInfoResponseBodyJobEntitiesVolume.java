package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 调整实例容量任务时返回。
 */
public class GetJobInfoResponseBodyJobEntitiesVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_size")

    private String originalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_size")

    private String targetSize;

    public GetJobInfoResponseBodyJobEntitiesVolume withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 磁盘类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetJobInfoResponseBodyJobEntitiesVolume withOriginalSize(String originalSize) {
        this.originalSize = originalSize;
        return this;
    }

    /**
     * 实例原本的磁盘大小（单位：GB）。
     * @return originalSize
     */
    public String getOriginalSize() {
        return originalSize;
    }

    public void setOriginalSize(String originalSize) {
        this.originalSize = originalSize;
    }

    public GetJobInfoResponseBodyJobEntitiesVolume withTargetSize(String targetSize) {
        this.targetSize = targetSize;
        return this;
    }

    /**
     * 任务的目标磁盘大小（单位：GB）。
     * @return targetSize
     */
    public String getTargetSize() {
        return targetSize;
    }

    public void setTargetSize(String targetSize) {
        this.targetSize = targetSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetJobInfoResponseBodyJobEntitiesVolume that = (GetJobInfoResponseBodyJobEntitiesVolume) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.originalSize, that.originalSize)
            && Objects.equals(this.targetSize, that.targetSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, originalSize, targetSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetJobInfoResponseBodyJobEntitiesVolume {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
        sb.append("    targetSize: ").append(toIndentedString(targetSize)).append("\n");
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
