package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class MigrateServerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate")

    private MigrateServerOption migrate;

    public MigrateServerRequestBody withMigrate(MigrateServerOption migrate) {
        this.migrate = migrate;
        return this;
    }

    public MigrateServerRequestBody withMigrate(Consumer<MigrateServerOption> migrateSetter) {
        if (this.migrate == null) {
            this.migrate = new MigrateServerOption();
            migrateSetter.accept(this.migrate);
        }

        return this;
    }

    /**
     * Get migrate
     * @return migrate
     */
    public MigrateServerOption getMigrate() {
        return migrate;
    }

    public void setMigrate(MigrateServerOption migrate) {
        this.migrate = migrate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateServerRequestBody that = (MigrateServerRequestBody) obj;
        return Objects.equals(this.migrate, that.migrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateServerRequestBody {\n");
        sb.append("    migrate: ").append(toIndentedString(migrate)).append("\n");
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
