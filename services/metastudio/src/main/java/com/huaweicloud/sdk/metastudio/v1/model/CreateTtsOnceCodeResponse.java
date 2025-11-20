package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateTtsOnceCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "once_code")

    private String onceCode;

    public CreateTtsOnceCodeResponse withOnceCode(String onceCode) {
        this.onceCode = onceCode;
        return this;
    }

    /**
     * 获取到的一次性token
     * @return onceCode
     */
    public String getOnceCode() {
        return onceCode;
    }

    public void setOnceCode(String onceCode) {
        this.onceCode = onceCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTtsOnceCodeResponse that = (CreateTtsOnceCodeResponse) obj;
        return Objects.equals(this.onceCode, that.onceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onceCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTtsOnceCodeResponse {\n");
        sb.append("    onceCode: ").append(toIndentedString(onceCode)).append("\n");
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
