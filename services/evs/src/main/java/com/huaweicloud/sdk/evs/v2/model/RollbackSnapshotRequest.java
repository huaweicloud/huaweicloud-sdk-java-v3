package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class RollbackSnapshotRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot_id")
    
    private String snapshotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RollbackSnapshotRequestBody body = null;

    public RollbackSnapshotRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    


    /**
     * Get snapshotId
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public RollbackSnapshotRequest withBody(RollbackSnapshotRequestBody body) {
        this.body = body;
        return this;
    }

    public RollbackSnapshotRequest withBody(Consumer<RollbackSnapshotRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new RollbackSnapshotRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RollbackSnapshotRequestBody getBody() {
        return body;
    }

    public void setBody(RollbackSnapshotRequestBody body) {
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
        RollbackSnapshotRequest rollbackSnapshotRequest = (RollbackSnapshotRequest) o;
        return Objects.equals(this.snapshotId, rollbackSnapshotRequest.snapshotId) &&
            Objects.equals(this.body, rollbackSnapshotRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snapshotId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollbackSnapshotRequest {\n");
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

