package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDrugDatabaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private String databaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDrugDatabaseReq body;

    public UpdateDrugDatabaseRequest withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * 数据库id
     * @return databaseId
     */
    public String getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    public UpdateDrugDatabaseRequest withBody(UpdateDrugDatabaseReq body) {
        this.body = body;
        return this;
    }

    public UpdateDrugDatabaseRequest withBody(Consumer<UpdateDrugDatabaseReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDrugDatabaseReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDrugDatabaseReq getBody() {
        return body;
    }

    public void setBody(UpdateDrugDatabaseReq body) {
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
        UpdateDrugDatabaseRequest that = (UpdateDrugDatabaseRequest) obj;
        return Objects.equals(this.databaseId, that.databaseId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDrugDatabaseRequest {\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
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
