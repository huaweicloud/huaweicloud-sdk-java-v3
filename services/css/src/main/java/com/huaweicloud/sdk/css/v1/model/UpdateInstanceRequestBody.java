package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateInstanceRequestBody
 */
public class UpdateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_data")

    private String migrateData;

    public UpdateInstanceRequestBody withMigrateData(String migrateData) {
        this.migrateData = migrateData;
        return this;
    }

    /**
     * 是否迁移数据。 - \"true\"：迁移数据。 - \"false\"：不迁移数据。
     * @return migrateData
     */
    public String getMigrateData() {
        return migrateData;
    }

    public void setMigrateData(String migrateData) {
        this.migrateData = migrateData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceRequestBody that = (UpdateInstanceRequestBody) obj;
        return Objects.equals(this.migrateData, that.migrateData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrateData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRequestBody {\n");
        sb.append("    migrateData: ").append(toIndentedString(migrateData)).append("\n");
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
