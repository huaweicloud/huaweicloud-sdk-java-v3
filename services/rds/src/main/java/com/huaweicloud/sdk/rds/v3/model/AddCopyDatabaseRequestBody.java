package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddCopyDatabaseRequestBody
 */
public class AddCopyDatabaseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "procedure_name")

    private String procedureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Object params;

    public AddCopyDatabaseRequestBody withProcedureName(String procedureName) {
        this.procedureName = procedureName;
        return this;
    }

    /**
     * 操作名称(copy_database)
     * @return procedureName
     */
    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public AddCopyDatabaseRequestBody withParams(Object params) {
        this.params = params;
        return this;
    }

    /**
     * 源库和目的库信息
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddCopyDatabaseRequestBody that = (AddCopyDatabaseRequestBody) obj;
        return Objects.equals(this.procedureName, that.procedureName) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procedureName, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCopyDatabaseRequestBody {\n");
        sb.append("    procedureName: ").append(toIndentedString(procedureName)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
