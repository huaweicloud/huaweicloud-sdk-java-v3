package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRtcHistoryScaleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale")

    private List<RtcHistoryScaleTimeValue> scale = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListRtcHistoryScaleResponse withScale(List<RtcHistoryScaleTimeValue> scale) {
        this.scale = scale;
        return this;
    }

    public ListRtcHistoryScaleResponse addScaleItem(RtcHistoryScaleTimeValue scaleItem) {
        if (this.scale == null) {
            this.scale = new ArrayList<>();
        }
        this.scale.add(scaleItem);
        return this;
    }

    public ListRtcHistoryScaleResponse withScale(Consumer<List<RtcHistoryScaleTimeValue>> scaleSetter) {
        if (this.scale == null) {
            this.scale = new ArrayList<>();
        }
        scaleSetter.accept(this.scale);
        return this;
    }

    /** 时间戳及相应时间的指标数值列表
     * 
     * @return scale */
    public List<RtcHistoryScaleTimeValue> getScale() {
        return scale;
    }

    public void setScale(List<RtcHistoryScaleTimeValue> scale) {
        this.scale = scale;
    }

    public ListRtcHistoryScaleResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** Get xRequestId
     * 
     * @return xRequestId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRtcHistoryScaleResponse listRtcHistoryScaleResponse = (ListRtcHistoryScaleResponse) o;
        return Objects.equals(this.scale, listRtcHistoryScaleResponse.scale)
            && Objects.equals(this.xRequestId, listRtcHistoryScaleResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scale, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcHistoryScaleResponse {\n");
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
