package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRtcHistoryQualityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality")

    private List<RtcHistoryQualityTimeValue> quality = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListRtcHistoryQualityResponse withQuality(List<RtcHistoryQualityTimeValue> quality) {
        this.quality = quality;
        return this;
    }

    public ListRtcHistoryQualityResponse addQualityItem(RtcHistoryQualityTimeValue qualityItem) {
        if (this.quality == null) {
            this.quality = new ArrayList<>();
        }
        this.quality.add(qualityItem);
        return this;
    }

    public ListRtcHistoryQualityResponse withQuality(Consumer<List<RtcHistoryQualityTimeValue>> qualitySetter) {
        if (this.quality == null) {
            this.quality = new ArrayList<>();
        }
        qualitySetter.accept(this.quality);
        return this;
    }

    /**
     * 时间戳及相应时间的指标数值列表
     * @return quality
     */
    public List<RtcHistoryQualityTimeValue> getQuality() {
        return quality;
    }

    public void setQuality(List<RtcHistoryQualityTimeValue> quality) {
        this.quality = quality;
    }

    public ListRtcHistoryQualityResponse withXRequestId(String xRequestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRtcHistoryQualityResponse that = (ListRtcHistoryQualityResponse) obj;
        return Objects.equals(this.quality, that.quality) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quality, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcHistoryQualityResponse {\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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
