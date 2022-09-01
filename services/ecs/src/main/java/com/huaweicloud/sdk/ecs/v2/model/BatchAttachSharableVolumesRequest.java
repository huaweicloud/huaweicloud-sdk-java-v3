package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAttachSharableVolumesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    @JacksonXmlProperty(localName = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private BatchAttachSharableVolumesRequestBody body;

    public BatchAttachSharableVolumesRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 共享磁盘ID。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public BatchAttachSharableVolumesRequest withBody(BatchAttachSharableVolumesRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchAttachSharableVolumesRequest withBody(Consumer<BatchAttachSharableVolumesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAttachSharableVolumesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchAttachSharableVolumesRequestBody getBody() {
        return body;
    }

    public void setBody(BatchAttachSharableVolumesRequestBody body) {
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
        BatchAttachSharableVolumesRequest batchAttachSharableVolumesRequest = (BatchAttachSharableVolumesRequest) o;
        return Objects.equals(this.volumeId, batchAttachSharableVolumesRequest.volumeId)
            && Objects.equals(this.body, batchAttachSharableVolumesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAttachSharableVolumesRequest {\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
