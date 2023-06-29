package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckWeakPasswordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak")

    private Boolean weak;

    public CheckWeakPasswordResponse withWeak(Boolean weak) {
        this.weak = weak;
        return this;
    }

    /**
     * 是否弱密码，true:是弱密码 false:不是弱密码
     * @return weak
     */
    public Boolean getWeak() {
        return weak;
    }

    public void setWeak(Boolean weak) {
        this.weak = weak;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckWeakPasswordResponse that = (CheckWeakPasswordResponse) obj;
        return Objects.equals(this.weak, that.weak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weak);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckWeakPasswordResponse {\n");
        sb.append("    weak: ").append(toIndentedString(weak)).append("\n");
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
