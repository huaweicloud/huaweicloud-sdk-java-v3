package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * FunctionUrlRequestBody
 */
public class FunctionUrlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cors")

    private CorsConfig cors;

    public FunctionUrlRequestBody withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 函数URL鉴权方式
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public FunctionUrlRequestBody withCors(CorsConfig cors) {
        this.cors = cors;
        return this;
    }

    public FunctionUrlRequestBody withCors(Consumer<CorsConfig> corsSetter) {
        if (this.cors == null) {
            this.cors = new CorsConfig();
            corsSetter.accept(this.cors);
        }

        return this;
    }

    /**
     * Get cors
     * @return cors
     */
    public CorsConfig getCors() {
        return cors;
    }

    public void setCors(CorsConfig cors) {
        this.cors = cors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FunctionUrlRequestBody that = (FunctionUrlRequestBody) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.cors, that.cors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, cors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionUrlRequestBody {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    cors: ").append(toIndentedString(cors)).append("\n");
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
