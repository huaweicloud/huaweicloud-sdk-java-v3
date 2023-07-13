package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApiTestDTO
 */
public class ApiTestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paras")

    private ApiTestParas paras;

    public ApiTestDTO withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 请求体
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ApiTestDTO withParas(ApiTestParas paras) {
        this.paras = paras;
        return this;
    }

    public ApiTestDTO withParas(Consumer<ApiTestParas> parasSetter) {
        if (this.paras == null) {
            this.paras = new ApiTestParas();
            parasSetter.accept(this.paras);
        }

        return this;
    }

    /**
     * Get paras
     * @return paras
     */
    public ApiTestParas getParas() {
        return paras;
    }

    public void setParas(ApiTestParas paras) {
        this.paras = paras;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiTestDTO that = (ApiTestDTO) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.paras, that.paras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, paras);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiTestDTO {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
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
