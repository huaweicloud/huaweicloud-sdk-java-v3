package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRtcRealtimeScaleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale")

    @JacksonXmlProperty(localName = "scale")

    private List<TimeValueData> scale = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    @JacksonXmlProperty(localName = "X-request-id")

    private String xRequestId;

    public ListRtcRealtimeScaleResponse withScale(List<TimeValueData> scale) {
        this.scale = scale;
        return this;
    }

    public ListRtcRealtimeScaleResponse addScaleItem(TimeValueData scaleItem) {
        if (this.scale == null) {
            this.scale = new ArrayList<>();
        }
        this.scale.add(scaleItem);
        return this;
    }

    public ListRtcRealtimeScaleResponse withScale(Consumer<List<TimeValueData>> scaleSetter) {
        if (this.scale == null) {
            this.scale = new ArrayList<>();
        }
        scaleSetter.accept(this.scale);
        return this;
    }

    /**
     * 时间戳及相应时间的指标数值列表
     * @return scale
     */
    public List<TimeValueData> getScale() {
        return scale;
    }

    public void setScale(List<TimeValueData> scale) {
        this.scale = scale;
    }

    public ListRtcRealtimeScaleResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
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
        ListRtcRealtimeScaleResponse listRtcRealtimeScaleResponse = (ListRtcRealtimeScaleResponse) o;
        return Objects.equals(this.scale, listRtcRealtimeScaleResponse.scale)
            && Objects.equals(this.xRequestId, listRtcRealtimeScaleResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scale, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcRealtimeScaleResponse {\n");
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
