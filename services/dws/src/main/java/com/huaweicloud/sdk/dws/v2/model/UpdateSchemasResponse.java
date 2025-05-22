package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateSchemasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_code")

    private Integer retCode;

    public UpdateSchemasResponse withRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * **参数解释**： 响应编码。 **取值范围**： 不涉及。
     * @return retCode
     */
    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSchemasResponse that = (UpdateSchemasResponse) obj;
        return Objects.equals(this.retCode, that.retCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSchemasResponse {\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
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
