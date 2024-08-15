package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_id")

    private String datastoreId;

    public ShowFlavorsRequest withDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
        return this;
    }

    /**
     * 版本ID，获取方法请参见[CDM支持的版本](ShowDatastores.xml)。
     * @return datastoreId
     */
    public String getDatastoreId() {
        return datastoreId;
    }

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlavorsRequest that = (ShowFlavorsRequest) obj;
        return Objects.equals(this.datastoreId, that.datastoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlavorsRequest {\n");
        sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
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
