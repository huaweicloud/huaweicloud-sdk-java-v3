package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSubBusinessDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_business_id")

    private Long subBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    private Long xBusinessId;

    public ShowSubBusinessDetailRequest withSubBusinessId(Long subBusinessId) {
        this.subBusinessId = subBusinessId;
        return this;
    }

    /**
     * 子应用id。
     * @return subBusinessId
     */
    public Long getSubBusinessId() {
        return subBusinessId;
    }

    public void setSubBusinessId(Long subBusinessId) {
        this.subBusinessId = subBusinessId;
    }

    public ShowSubBusinessDetailRequest withXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * 应用id。
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Long getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSubBusinessDetailRequest showSubBusinessDetailRequest = (ShowSubBusinessDetailRequest) o;
        return Objects.equals(this.subBusinessId, showSubBusinessDetailRequest.subBusinessId)
            && Objects.equals(this.xBusinessId, showSubBusinessDetailRequest.xBusinessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subBusinessId, xBusinessId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubBusinessDetailRequest {\n");
        sb.append("    subBusinessId: ").append(toIndentedString(subBusinessId)).append("\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
