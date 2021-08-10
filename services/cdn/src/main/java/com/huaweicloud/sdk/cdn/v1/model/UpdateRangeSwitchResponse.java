package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateRangeSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_range")

    private OriginRangeBody originRange;

    public UpdateRangeSwitchResponse withOriginRange(OriginRangeBody originRange) {
        this.originRange = originRange;
        return this;
    }

    public UpdateRangeSwitchResponse withOriginRange(Consumer<OriginRangeBody> originRangeSetter) {
        if (this.originRange == null) {
            this.originRange = new OriginRangeBody();
            originRangeSetter.accept(this.originRange);
        }

        return this;
    }

    /** Get originRange
     * 
     * @return originRange */
    public OriginRangeBody getOriginRange() {
        return originRange;
    }

    public void setOriginRange(OriginRangeBody originRange) {
        this.originRange = originRange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRangeSwitchResponse updateRangeSwitchResponse = (UpdateRangeSwitchResponse) o;
        return Objects.equals(this.originRange, updateRangeSwitchResponse.originRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRangeSwitchResponse {\n");
        sb.append("    originRange: ").append(toIndentedString(originRange)).append("\n");
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
