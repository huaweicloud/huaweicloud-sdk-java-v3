package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCesDimsInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private CesQueryRespQuery query;

    public ListCesDimsInfoResponse withQuery(CesQueryRespQuery query) {
        this.query = query;
        return this;
    }

    public ListCesDimsInfoResponse withQuery(Consumer<CesQueryRespQuery> querySetter) {
        if (this.query == null) {
            this.query = new CesQueryRespQuery();
            querySetter.accept(this.query);
        }

        return this;
    }

    /**
     * Get query
     * @return query
     */
    public CesQueryRespQuery getQuery() {
        return query;
    }

    public void setQuery(CesQueryRespQuery query) {
        this.query = query;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCesDimsInfoResponse that = (ListCesDimsInfoResponse) obj;
        return Objects.equals(this.query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCesDimsInfoResponse {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
