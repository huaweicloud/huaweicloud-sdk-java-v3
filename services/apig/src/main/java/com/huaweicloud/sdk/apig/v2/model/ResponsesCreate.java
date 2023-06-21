package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponsesCreate
 */
public class ResponsesCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responses")

    private Map<String, ResponseInfo> responses = null;

    public ResponsesCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 响应名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResponsesCreate withResponses(Map<String, ResponseInfo> responses) {
        this.responses = responses;
        return this;
    }

    public ResponsesCreate putResponsesItem(String key, ResponseInfo responsesItem) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        this.responses.put(key, responsesItem);
        return this;
    }

    public ResponsesCreate withResponses(Consumer<Map<String, ResponseInfo>> responsesSetter) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        responsesSetter.accept(this.responses);
        return this;
    }

    /**
     * 错误类型的响应定义，其中key为错误类型。key的枚举值为： - AUTH_FAILURE：认证失败 - AUTH_HEADER_MISSING：认证身份来源缺失 - AUTHORIZER_FAILURE：自定义认证失败 - AUTHORIZER_CONF_FAILURE：自定义认证配置错误 - AUTHORIZER_IDENTITIES_FAILURE：自定义认证身份来源错误 - BACKEND_UNAVAILABLE：后端不可用 - BACKEND_TIMEOUT：后端超时 - THROTTLED：调用次数超出阈值 - UNAUTHORIZED：应用未授权 - ACCESS_DENIED：拒绝访问 - NOT_FOUND：未找到匹配的API - REQUEST_PARAMETERS_FAILURE：请求参数错误 - DEFAULT_4XX：默认4XX - DEFAULT_5XX：默认5XX - THIRD_AUTH_FAILURE: 第三方认证失败 - THIRD_AUTH_IDENTITIES_FAILURE: 第三方认证身份来源错误 - THIRD_AUTH_CONF_FAILURE: 第三方认证配置错误  每项错误类型均为一个JSON体
     * @return responses
     */
    public Map<String, ResponseInfo> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, ResponseInfo> responses) {
        this.responses = responses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponsesCreate responsesCreate = (ResponsesCreate) o;
        return Objects.equals(this.name, responsesCreate.name)
            && Objects.equals(this.responses, responsesCreate.responses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, responses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponsesCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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
