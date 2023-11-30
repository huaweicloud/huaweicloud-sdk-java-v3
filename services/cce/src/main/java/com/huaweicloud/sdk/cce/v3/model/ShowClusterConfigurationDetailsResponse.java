package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterConfigurationDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responses")

    private Map<String, List<PackageOptions>> responses = null;

    public ShowClusterConfigurationDetailsResponse withResponses(Map<String, List<PackageOptions>> responses) {
        this.responses = responses;
        return this;
    }

    public ShowClusterConfigurationDetailsResponse putResponsesItem(String key, List<PackageOptions> responsesItem) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        this.responses.put(key, responsesItem);
        return this;
    }

    public ShowClusterConfigurationDetailsResponse withResponses(
        Consumer<Map<String, List<PackageOptions>>> responsesSetter) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        responsesSetter.accept(this.responses);
        return this;
    }

    /**
     * 指定集群配置项列表返回体，非实际返回参数
     * @return responses
     */
    public Map<String, List<PackageOptions>> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, List<PackageOptions>> responses) {
        this.responses = responses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterConfigurationDetailsResponse that = (ShowClusterConfigurationDetailsResponse) obj;
        return Objects.equals(this.responses, that.responses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterConfigurationDetailsResponse {\n");
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
