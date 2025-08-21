package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListCesInstanceRequestBodyQuery
 */
public class ListCesInstanceRequestBodyQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_name")

    private String dimName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ListCesInstanceRequestBodyQuery withDimName(String dimName) {
        this.dimName = dimName;
        return this;
    }

    /**
     * 维度名称
     * @return dimName
     */
    public String getDimName() {
        return dimName;
    }

    public void setDimName(String dimName) {
        this.dimName = dimName;
    }

    public ListCesInstanceRequestBodyQuery withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 维度id
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
        ListCesInstanceRequestBodyQuery that = (ListCesInstanceRequestBodyQuery) obj;
        return Objects.equals(this.dimName, that.dimName) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimName, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCesInstanceRequestBodyQuery {\n");
        sb.append("    dimName: ").append(toIndentedString(dimName)).append("\n");
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
