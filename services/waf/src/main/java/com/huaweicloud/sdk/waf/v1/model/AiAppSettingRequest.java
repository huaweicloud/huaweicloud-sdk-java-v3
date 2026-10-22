package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AI应用配置请求体
 */
public class AiAppSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_sign")

    private ApiSign apiSign;

    public AiAppSettingRequest withApiSign(ApiSign apiSign) {
        this.apiSign = apiSign;
        return this;
    }

    public AiAppSettingRequest withApiSign(Consumer<ApiSign> apiSignSetter) {
        if (this.apiSign == null) {
            this.apiSign = new ApiSign();
            apiSignSetter.accept(this.apiSign);
        }

        return this;
    }

    /**
     * Get apiSign
     * @return apiSign
     */
    public ApiSign getApiSign() {
        return apiSign;
    }

    public void setApiSign(ApiSign apiSign) {
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
        AiAppSettingRequest that = (AiAppSettingRequest) obj;
        return Objects.equals(this.apiSign, that.apiSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiSign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiAppSettingRequest {\n");
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
