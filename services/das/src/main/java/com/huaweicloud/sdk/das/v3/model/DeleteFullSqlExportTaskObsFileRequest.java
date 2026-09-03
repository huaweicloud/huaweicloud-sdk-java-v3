package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteFullSqlExportTaskObsFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteFullSqlExportTaskObsFileRequestBody body;

    public DeleteFullSqlExportTaskObsFileRequest withBody(DeleteFullSqlExportTaskObsFileRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteFullSqlExportTaskObsFileRequest withBody(
        Consumer<DeleteFullSqlExportTaskObsFileRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteFullSqlExportTaskObsFileRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteFullSqlExportTaskObsFileRequestBody getBody() {
        return body;
    }

    public void setBody(DeleteFullSqlExportTaskObsFileRequestBody body) {
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
        DeleteFullSqlExportTaskObsFileRequest that = (DeleteFullSqlExportTaskObsFileRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFullSqlExportTaskObsFileRequest {\n");
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
