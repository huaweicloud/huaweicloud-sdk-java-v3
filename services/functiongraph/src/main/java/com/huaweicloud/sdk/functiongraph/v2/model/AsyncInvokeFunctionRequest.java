package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AsyncInvokeFunctionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cff-Instance-Memory")

    private String xCffInstanceMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Map<String, Object> body = null;

    public AsyncInvokeFunctionRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public AsyncInvokeFunctionRequest withXCffInstanceMemory(String xCffInstanceMemory) {
        this.xCffInstanceMemory = xCffInstanceMemory;
        return this;
    }

    /**
     * 设置本次执行函数使用的内存规格,取值： 128、256、512、768、1024、1280、1536、1792、2048、2560、3072、3584、4096、8192、10240
     * @return xCffInstanceMemory
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cff-Instance-Memory")
    public String getXCffInstanceMemory() {
        return xCffInstanceMemory;
    }

    public void setXCffInstanceMemory(String xCffInstanceMemory) {
        this.xCffInstanceMemory = xCffInstanceMemory;
    }

    public AsyncInvokeFunctionRequest withBody(Map<String, Object> body) {
        this.body = body;
        return this;
    }

    public AsyncInvokeFunctionRequest putBodyItem(String key, Object bodyItem) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    public AsyncInvokeFunctionRequest withBody(Consumer<Map<String, Object>> bodySetter) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 执行函数请求体，为json格式。
     * @return body
     */
    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsyncInvokeFunctionRequest that = (AsyncInvokeFunctionRequest) obj;
        return Objects.equals(this.functionUrn, that.functionUrn)
            && Objects.equals(this.xCffInstanceMemory, that.xCffInstanceMemory) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, xCffInstanceMemory, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncInvokeFunctionRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    xCffInstanceMemory: ").append(toIndentedString(xCffInstanceMemory)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
