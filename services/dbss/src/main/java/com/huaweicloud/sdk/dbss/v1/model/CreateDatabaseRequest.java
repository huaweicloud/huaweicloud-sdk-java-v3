package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDatabaseRequest
 */
public class CreateDatabaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private CreateDatabaseRequestDatabase database;

    public CreateDatabaseRequest withDatabase(CreateDatabaseRequestDatabase database) {
        this.database = database;
        return this;
    }

    public CreateDatabaseRequest withDatabase(Consumer<CreateDatabaseRequestDatabase> databaseSetter) {
        if (this.database == null) {
            this.database = new CreateDatabaseRequestDatabase();
            databaseSetter.accept(this.database);
        }

        return this;
    }

    /**
     * Get database
     * @return database
     */
    public CreateDatabaseRequestDatabase getDatabase() {
        return database;
    }

    public void setDatabase(CreateDatabaseRequestDatabase database) {
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
        CreateDatabaseRequest that = (CreateDatabaseRequest) obj;
        return Objects.equals(this.database, that.database);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseRequest {\n");
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
