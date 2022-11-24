package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowClobDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clob_string")

    private String clobString;

    public ShowClobDetailResponse withClobString(String clobString) {
        this.clobString = clobString;
        return this;
    }

    /**
     * clob详情。
     * @return clobString
     */
    public String getClobString() {
        return clobString;
    }

    public void setClobString(String clobString) {
        this.clobString = clobString;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClobDetailResponse showClobDetailResponse = (ShowClobDetailResponse) o;
        return Objects.equals(this.clobString, showClobDetailResponse.clobString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clobString);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClobDetailResponse {\n");
        sb.append("    clobString: ").append(toIndentedString(clobString)).append("\n");
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
