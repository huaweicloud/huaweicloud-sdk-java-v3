package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSloDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slo_id")

    private String sloId;

    public ShowSloDetailRequest withSloId(String sloId) {
        this.sloId = sloId;
        return this;
    }

    /**
     * SLO的ID
     * @return sloId
     */
    public String getSloId() {
        return sloId;
    }

    public void setSloId(String sloId) {
        this.sloId = sloId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSloDetailRequest that = (ShowSloDetailRequest) obj;
        return Objects.equals(this.sloId, that.sloId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sloId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSloDetailRequest {\n");
        sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
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
