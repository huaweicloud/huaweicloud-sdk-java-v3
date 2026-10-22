package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SetAiAppSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_sign")

    private ApiInfo apiSign;

    public SetAiAppSettingResponse withApiSign(ApiInfo apiSign) {
        this.apiSign = apiSign;
        return this;
    }

    public SetAiAppSettingResponse withApiSign(Consumer<ApiInfo> apiSignSetter) {
        if (this.apiSign == null) {
            this.apiSign = new ApiInfo();
            apiSignSetter.accept(this.apiSign);
        }

        return this;
    }

    /**
     * Get apiSign
     * @return apiSign
     */
    public ApiInfo getApiSign() {
        return apiSign;
    }

    public void setApiSign(ApiInfo apiSign) {
        this.apiSign = apiSign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAiAppSettingResponse that = (SetAiAppSettingResponse) obj;
        return Objects.equals(this.apiSign, that.apiSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiSign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAiAppSettingResponse {\n");
        sb.append("    apiSign: ").append(toIndentedString(apiSign)).append("\n");
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
