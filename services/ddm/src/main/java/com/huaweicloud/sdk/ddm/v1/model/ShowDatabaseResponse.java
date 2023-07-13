package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDatabaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private GetDatabaseResponseBean database;

    public ShowDatabaseResponse withDatabase(GetDatabaseResponseBean database) {
        this.database = database;
        return this;
    }

    public ShowDatabaseResponse withDatabase(Consumer<GetDatabaseResponseBean> databaseSetter) {
        if (this.database == null) {
            this.database = new GetDatabaseResponseBean();
            databaseSetter.accept(this.database);
        }

        return this;
    }

    /**
     * Get database
     * @return database
     */
    public GetDatabaseResponseBean getDatabase() {
        return database;
    }

    public void setDatabase(GetDatabaseResponseBean database) {
        this.database = database;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatabaseResponse that = (ShowDatabaseResponse) obj;
        return Objects.equals(this.database, that.database);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatabaseResponse {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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
