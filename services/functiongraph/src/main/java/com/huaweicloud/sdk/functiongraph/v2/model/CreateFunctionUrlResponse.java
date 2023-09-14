package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateFunctionUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cors")

    private CorsConfig cors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_url")

    private String functionUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private String lastModifiedTime;

    public CreateFunctionUrlResponse withAuthType(String authType) {
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

    public CreateFunctionUrlResponse withCors(CorsConfig cors) {
        this.cors = cors;
        return this;
    }

    public CreateFunctionUrlResponse withCors(Consumer<CorsConfig> corsSetter) {
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

    public CreateFunctionUrlResponse withFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
        return this;
    }

    /**
     * 函数URL地址
     * @return functionUrl
     */
    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
    }

    public CreateFunctionUrlResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 函数URL创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateFunctionUrlResponse withLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * 函数URL上次修改时间
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFunctionUrlResponse that = (CreateFunctionUrlResponse) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.cors, that.cors)
            && Objects.equals(this.functionUrl, that.functionUrl) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastModifiedTime, that.lastModifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, cors, functionUrl, createTime, lastModifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFunctionUrlResponse {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    cors: ").append(toIndentedString(cors)).append("\n");
        sb.append("    functionUrl: ").append(toIndentedString(functionUrl)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
