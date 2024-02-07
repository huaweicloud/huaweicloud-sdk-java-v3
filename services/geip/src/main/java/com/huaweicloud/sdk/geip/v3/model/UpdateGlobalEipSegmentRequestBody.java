package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateGlobalEipSegmentRequestBody
 */
public class UpdateGlobalEipSegmentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_segment")

    private UpdateGlobalEipSegmentRequestBodyGlobalEipSegment globalEipSegment;

    public UpdateGlobalEipSegmentRequestBody withGlobalEipSegment(
        UpdateGlobalEipSegmentRequestBodyGlobalEipSegment globalEipSegment) {
        this.globalEipSegment = globalEipSegment;
        return this;
    }

    public UpdateGlobalEipSegmentRequestBody withGlobalEipSegment(
        Consumer<UpdateGlobalEipSegmentRequestBodyGlobalEipSegment> globalEipSegmentSetter) {
        if (this.globalEipSegment == null) {
            this.globalEipSegment = new UpdateGlobalEipSegmentRequestBodyGlobalEipSegment();
            globalEipSegmentSetter.accept(this.globalEipSegment);
        }

        return this;
    }

    /**
     * Get globalEipSegment
     * @return globalEipSegment
     */
    public UpdateGlobalEipSegmentRequestBodyGlobalEipSegment getGlobalEipSegment() {
        return globalEipSegment;
    }

    public void setGlobalEipSegment(UpdateGlobalEipSegmentRequestBodyGlobalEipSegment globalEipSegment) {
        this.globalEipSegment = globalEipSegment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGlobalEipSegmentRequestBody that = (UpdateGlobalEipSegmentRequestBody) obj;
        return Objects.equals(this.globalEipSegment, that.globalEipSegment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipSegment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalEipSegmentRequestBody {\n");
        sb.append("    globalEipSegment: ").append(toIndentedString(globalEipSegment)).append("\n");
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
