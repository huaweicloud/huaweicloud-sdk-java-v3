package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFlavorDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    public ShowFlavorDetailRequest withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 参数解释： 规格id。 约束限制： 不涉及 取值范围： 实例规格列表接口返回的id。 默认取值： 不涉及
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlavorDetailRequest that = (ShowFlavorDetailRequest) obj;
        return Objects.equals(this.flavorId, that.flavorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlavorDetailRequest {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
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
