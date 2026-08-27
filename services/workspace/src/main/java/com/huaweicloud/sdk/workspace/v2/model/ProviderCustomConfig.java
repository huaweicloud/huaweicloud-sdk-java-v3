package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 供应商自定义配置，用于指定模型列表接口和认证参数。
 */
public class ProviderCustomConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_list_api")

    private String modelListApi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_header")

    private String authHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_prefix")

    private String authPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id_field")

    private String modelIdField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name_field")

    private String modelNameField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Map<String, String> headers = null;

    public ProviderCustomConfig withModelListApi(String modelListApi) {
        this.modelListApi = modelListApi;
        return this;
    }

    /**
     * 模型列表接口地址，用于查询供应商远程模型。
     * @return modelListApi
     */
    public String getModelListApi() {
        return modelListApi;
    }

    public void setModelListApi(String modelListApi) {
        this.modelListApi = modelListApi;
    }

    public ProviderCustomConfig withAuthHeader(String authHeader) {
        this.authHeader = authHeader;
        return this;
    }

    /**
     * 认证请求头名称。
     * @return authHeader
     */
    public String getAuthHeader() {
        return authHeader;
    }

    public void setAuthHeader(String authHeader) {
        this.authHeader = authHeader;
    }

    public ProviderCustomConfig withAuthPrefix(String authPrefix) {
        this.authPrefix = authPrefix;
        return this;
    }

    /**
     * 认证前缀（如Bearer）。
     * @return authPrefix
     */
    public String getAuthPrefix() {
        return authPrefix;
    }

    public void setAuthPrefix(String authPrefix) {
        this.authPrefix = authPrefix;
    }

    public ProviderCustomConfig withModelIdField(String modelIdField) {
        this.modelIdField = modelIdField;
        return this;
    }

    /**
     * 供应商模型列表中模型ID字段名。
     * @return modelIdField
     */
    public String getModelIdField() {
        return modelIdField;
    }

    public void setModelIdField(String modelIdField) {
        this.modelIdField = modelIdField;
    }

    public ProviderCustomConfig withModelNameField(String modelNameField) {
        this.modelNameField = modelNameField;
        return this;
    }

    /**
     * 供应商模型列表中模型名称字段名。
     * @return modelNameField
     */
    public String getModelNameField() {
        return modelNameField;
    }

    public void setModelNameField(String modelNameField) {
        this.modelNameField = modelNameField;
    }

    public ProviderCustomConfig withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public ProviderCustomConfig putHeadersItem(String key, String headersItem) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
        return this;
    }

    public ProviderCustomConfig withHeaders(Consumer<Map<String, String>> headersSetter) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }

    /**
     * 自定义HTTP请求头，调用供应商API时附加。
     * @return headers
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProviderCustomConfig that = (ProviderCustomConfig) obj;
        return Objects.equals(this.modelListApi, that.modelListApi) && Objects.equals(this.authHeader, that.authHeader)
            && Objects.equals(this.authPrefix, that.authPrefix) && Objects.equals(this.modelIdField, that.modelIdField)
            && Objects.equals(this.modelNameField, that.modelNameField) && Objects.equals(this.headers, that.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelListApi, authHeader, authPrefix, modelIdField, modelNameField, headers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderCustomConfig {\n");
        sb.append("    modelListApi: ").append(toIndentedString(modelListApi)).append("\n");
        sb.append("    authHeader: ").append(toIndentedString(authHeader)).append("\n");
        sb.append("    authPrefix: ").append(toIndentedString(authPrefix)).append("\n");
        sb.append("    modelIdField: ").append(toIndentedString(modelIdField)).append("\n");
        sb.append("    modelNameField: ").append(toIndentedString(modelNameField)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
