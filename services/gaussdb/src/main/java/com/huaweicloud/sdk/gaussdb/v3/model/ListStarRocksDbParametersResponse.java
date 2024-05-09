package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListStarRocksDbParametersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_parameters")

    private List<DbParameter> dbParameters = null;

    public ListStarRocksDbParametersResponse withDbParameters(List<DbParameter> dbParameters) {
        this.dbParameters = dbParameters;
        return this;
    }

    public ListStarRocksDbParametersResponse addDbParametersItem(DbParameter dbParametersItem) {
        if (this.dbParameters == null) {
            this.dbParameters = new ArrayList<>();
        }
        this.dbParameters.add(dbParametersItem);
        return this;
    }

    public ListStarRocksDbParametersResponse withDbParameters(Consumer<List<DbParameter>> dbParametersSetter) {
        if (this.dbParameters == null) {
            this.dbParameters = new ArrayList<>();
        }
        dbParametersSetter.accept(this.dbParameters);
        return this;
    }

    /**
     * 库参数信息。
     * @return dbParameters
     */
    public List<DbParameter> getDbParameters() {
        return dbParameters;
    }

    public void setDbParameters(List<DbParameter> dbParameters) {
        this.dbParameters = dbParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStarRocksDbParametersResponse that = (ListStarRocksDbParametersResponse) obj;
        return Objects.equals(this.dbParameters, that.dbParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStarRocksDbParametersResponse {\n");
        sb.append("    dbParameters: ").append(toIndentedString(dbParameters)).append("\n");
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
