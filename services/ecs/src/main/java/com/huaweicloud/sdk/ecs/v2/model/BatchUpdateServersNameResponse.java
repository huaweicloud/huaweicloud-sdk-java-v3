package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchUpdateServersNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private List<ServerId> response = null;

    public BatchUpdateServersNameResponse withResponse(List<ServerId> response) {
        this.response = response;
        return this;
    }

    public BatchUpdateServersNameResponse addResponseItem(ServerId responseItem) {
        if (this.response == null) {
            this.response = new ArrayList<>();
        }
        this.response.add(responseItem);
        return this;
    }

    public BatchUpdateServersNameResponse withResponse(Consumer<List<ServerId>> responseSetter) {
        if (this.response == null) {
            this.response = new ArrayList<>();
        }
        responseSetter.accept(this.response);
        return this;
    }

    /**
     * 提交请求成功后返回的响应列表。
     * @return response
     */
    public List<ServerId> getResponse() {
        return response;
    }

    public void setResponse(List<ServerId> response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateServersNameResponse that = (BatchUpdateServersNameResponse) obj;
        return Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateServersNameResponse {\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
