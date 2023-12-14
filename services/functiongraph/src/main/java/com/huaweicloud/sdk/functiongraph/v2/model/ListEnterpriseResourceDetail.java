package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListEnterpriseResourceDetail
 */
public class ListEnterpriseResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detailId")

    private String detailId;

    public ListEnterpriseResourceDetail withDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }

    /**
     * 函数urn
     * @return detailId
     */
    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnterpriseResourceDetail that = (ListEnterpriseResourceDetail) obj;
        return Objects.equals(this.detailId, that.detailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseResourceDetail {\n");
        sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
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
