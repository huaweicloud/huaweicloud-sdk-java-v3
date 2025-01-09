package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 接口配置
 */
public class InterfacesConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_platform")

    private String applyPlatform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private Map<String, String> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagination")

    private Map<String, Object> pagination = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request")

    private InterfacesRequest request;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private String response;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_check")

    private String resultCheck;

    public InterfacesConfig withApplyPlatform(String applyPlatform) {
        this.applyPlatform = applyPlatform;
        return this;
    }

    /**
     * 应用平台
     * @return applyPlatform
     */
    public String getApplyPlatform() {
        return applyPlatform;
    }

    public void setApplyPlatform(String applyPlatform) {
        this.applyPlatform = applyPlatform;
    }

    public InterfacesConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InterfacesConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterfacesConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InterfacesConfig withResults(Map<String, String> results) {
        this.results = results;
        return this;
    }

    public InterfacesConfig putResultsItem(String key, String resultsItem) {
        if (this.results == null) {
            this.results = new HashMap<>();
        }
        this.results.put(key, resultsItem);
        return this;
    }

    public InterfacesConfig withResults(Consumer<Map<String, String>> resultsSetter) {
        if (this.results == null) {
            this.results = new HashMap<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 结果
     * @return results
     */
    public Map<String, String> getResults() {
        return results;
    }

    public void setResults(Map<String, String> results) {
        this.results = results;
    }

    public InterfacesConfig withPagination(Map<String, Object> pagination) {
        this.pagination = pagination;
        return this;
    }

    public InterfacesConfig putPaginationItem(String key, Object paginationItem) {
        if (this.pagination == null) {
            this.pagination = new HashMap<>();
        }
        this.pagination.put(key, paginationItem);
        return this;
    }

    public InterfacesConfig withPagination(Consumer<Map<String, Object>> paginationSetter) {
        if (this.pagination == null) {
            this.pagination = new HashMap<>();
        }
        paginationSetter.accept(this.pagination);
        return this;
    }

    /**
     * 分页信息
     * @return pagination
     */
    public Map<String, Object> getPagination() {
        return pagination;
    }

    public void setPagination(Map<String, Object> pagination) {
        this.pagination = pagination;
    }

    public InterfacesConfig withRequest(InterfacesRequest request) {
        this.request = request;
        return this;
    }

    public InterfacesConfig withRequest(Consumer<InterfacesRequest> requestSetter) {
        if (this.request == null) {
            this.request = new InterfacesRequest();
            requestSetter.accept(this.request);
        }

        return this;
    }

    /**
     * Get request
     * @return request
     */
    public InterfacesRequest getRequest() {
        return request;
    }

    public void setRequest(InterfacesRequest request) {
        this.request = request;
    }

    public InterfacesConfig withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * 响应
     * @return response
     */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public InterfacesConfig withResultCheck(String resultCheck) {
        this.resultCheck = resultCheck;
        return this;
    }

    /**
     * 检查结果
     * @return resultCheck
     */
    public String getResultCheck() {
        return resultCheck;
    }

    public void setResultCheck(String resultCheck) {
        this.resultCheck = resultCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfacesConfig that = (InterfacesConfig) obj;
        return Objects.equals(this.applyPlatform, that.applyPlatform) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.results, that.results) && Objects.equals(this.pagination, that.pagination)
            && Objects.equals(this.request, that.request) && Objects.equals(this.response, that.response)
            && Objects.equals(this.resultCheck, that.resultCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyPlatform, id, name, type, results, pagination, request, response, resultCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterfacesConfig {\n");
        sb.append("    applyPlatform: ").append(toIndentedString(applyPlatform)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    resultCheck: ").append(toIndentedString(resultCheck)).append("\n");
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
