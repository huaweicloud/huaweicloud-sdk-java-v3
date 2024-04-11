package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据加工对象信息
 */
public class CreateDataCompareDatabaseObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public CreateDataCompareDatabaseObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 两层数据库场景： 数据库名称和数据库表名称，例如格式为t_auto_db-*-*-users，其中t_auto_db为数据库名称，users为表名称。  三层数据库场景： 数据库名称、数据库schema名称、数据库表名称，例如格式为t_auto_db-*-*-schema1-*-*-users，其中t_auto_db为数据库名称，schema1为数据库schema名称，users为表名称。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDataCompareDatabaseObject that = (CreateDataCompareDatabaseObject) obj;
        return Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataCompareDatabaseObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
