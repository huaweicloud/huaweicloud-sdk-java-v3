package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RestoreClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    @JacksonXmlProperty(localName = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private RestoreClusterRequestBody body;

    public RestoreClusterRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 待恢复的快照ID。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public RestoreClusterRequest withBody(RestoreClusterRequestBody body) {
        this.body = body;
        return this;
    }

    public RestoreClusterRequest withBody(Consumer<RestoreClusterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RestoreClusterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RestoreClusterRequestBody getBody() {
        return body;
    }

    public void setBody(RestoreClusterRequestBody body) {
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
        RestoreClusterRequest restoreClusterRequest = (RestoreClusterRequest) o;
        return Objects.equals(this.snapshotId, restoreClusterRequest.snapshotId)
            && Objects.equals(this.body, restoreClusterRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreClusterRequest {\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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
