package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportTenantRepositoriesRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExportTenantRepositoryBody body;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public ExportTenantRepositoriesRequest withBody(ExportTenantRepositoryBody body) {
        this.body = body;
        return this;
    }

    public ExportTenantRepositoriesRequest withBody(Consumer<ExportTenantRepositoryBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExportTenantRepositoryBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExportTenantRepositoryBody getBody() {
        return body;
    }

    public void setBody(ExportTenantRepositoryBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTenantRepositoriesRequest that = (ExportTenantRepositoriesRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTenantRepositoriesRequest {\n");
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
