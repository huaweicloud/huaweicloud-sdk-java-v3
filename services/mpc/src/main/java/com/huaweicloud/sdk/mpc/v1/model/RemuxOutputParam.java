package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RemuxOutputParam
 */
public class RemuxOutputParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_duration")

    private Integer segmentDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_meta")

    private Boolean removeMeta;

    public RemuxOutputParam withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 输出格式。取值范围： - HLS - MP4 
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public RemuxOutputParam withSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }

    /**
     * 分片时长，仅当“format”为“HLS”时有效。  取值范围：[2，10]。  默认值： 5。  单位：秒。 
     * minimum: 0
     * maximum: 20
     * @return segmentDuration
     */
    public Integer getSegmentDuration() {
        return segmentDuration;
    }

    public void setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
    }

    public RemuxOutputParam withRemoveMeta(Boolean removeMeta) {
        this.removeMeta = removeMeta;
        return this;
    }

    /**
     * 输出媒体是否去除片源的中metadata自定义信息。默认值：false 
     * @return removeMeta
     */
    public Boolean getRemoveMeta() {
        return removeMeta;
    }

    public void setRemoveMeta(Boolean removeMeta) {
        this.removeMeta = removeMeta;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemuxOutputParam remuxOutputParam = (RemuxOutputParam) o;
        return Objects.equals(this.format, remuxOutputParam.format)
            && Objects.equals(this.segmentDuration, remuxOutputParam.segmentDuration)
            && Objects.equals(this.removeMeta, remuxOutputParam.removeMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, segmentDuration, removeMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemuxOutputParam {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    segmentDuration: ").append(toIndentedString(segmentDuration)).append("\n");
        sb.append("    removeMeta: ").append(toIndentedString(removeMeta)).append("\n");
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
