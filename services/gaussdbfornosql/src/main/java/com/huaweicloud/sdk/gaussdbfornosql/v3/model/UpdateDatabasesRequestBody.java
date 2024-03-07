package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDatabasesRequestBody
 */
public class UpdateDatabasesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private Integer dbId;

    public UpdateDatabasesRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 对实例的操作: - flush:清理数据
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpdateDatabasesRequestBody withDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 指定需要清理的DB_ID,当action为flush时,才会生效。
     * @return dbId
     */
    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDatabasesRequestBody that = (UpdateDatabasesRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.dbId, that.dbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, dbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabasesRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
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
