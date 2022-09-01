package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_id")

    @JacksonXmlProperty(localName = "band_width_id")

    private String bandWidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateBandwidthRequestBody body;

    public UpdateBandwidthRequest withBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
        return this;
    }

    /**
     * 带宽id。
     * @return bandWidthId
     */
    public String getBandWidthId() {
        return bandWidthId;
    }

    public void setBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
    }

    public UpdateBandwidthRequest withBody(UpdateBandwidthRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateBandwidthRequest withBody(Consumer<UpdateBandwidthRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateBandwidthRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateBandwidthRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateBandwidthRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBandwidthRequest updateBandwidthRequest = (UpdateBandwidthRequest) o;
        return Objects.equals(this.bandWidthId, updateBandwidthRequest.bandWidthId)
            && Objects.equals(this.body, updateBandwidthRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthRequest {\n");
        sb.append("    bandWidthId: ").append(toIndentedString(bandWidthId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
