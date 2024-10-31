package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateHttpReferenceTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateHttpReferenceTableRequestBody body;

    public UpdateHttpReferenceTableRequest withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 引用表id
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public UpdateHttpReferenceTableRequest withBody(UpdateHttpReferenceTableRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateHttpReferenceTableRequest withBody(Consumer<UpdateHttpReferenceTableRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateHttpReferenceTableRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateHttpReferenceTableRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateHttpReferenceTableRequestBody body) {
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
        UpdateHttpReferenceTableRequest that = (UpdateHttpReferenceTableRequest) obj;
        return Objects.equals(this.tableId, that.tableId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpReferenceTableRequest {\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
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
