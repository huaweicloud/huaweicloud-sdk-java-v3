package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ImportCheckpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    private SyncRespBody sync;

    public ImportCheckpointResponse withSync(SyncRespBody sync) {
        this.sync = sync;
        return this;
    }

    public ImportCheckpointResponse withSync(Consumer<SyncRespBody> syncSetter) {
        if (this.sync == null) {
            this.sync = new SyncRespBody();
            syncSetter.accept(this.sync);
        }

        return this;
    }

    /**
     * Get sync
     * @return sync
     */
    public SyncRespBody getSync() {
        return sync;
    }

    public void setSync(SyncRespBody sync) {
        this.sync = sync;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportCheckpointResponse importCheckpointResponse = (ImportCheckpointResponse) o;
        return Objects.equals(this.sync, importCheckpointResponse.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCheckpointResponse {\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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
