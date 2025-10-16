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
public class ShowClusterSupportConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Map<String, List<PackageOptions>> body = null;

    public ShowClusterSupportConfigurationResponse withBody(Map<String, List<PackageOptions>> body) {
        this.body = body;
        return this;
    }

    public ShowClusterSupportConfigurationResponse putBodyItem(String key, List<PackageOptions> bodyItem) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    public ShowClusterSupportConfigurationResponse withBody(Consumer<Map<String, List<PackageOptions>>> bodySetter) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * **参数解释**： 集群支持的配置项详情
     * @return body
     */
    public Map<String, List<PackageOptions>> getBody() {
        return body;
    }

    public void setBody(Map<String, List<PackageOptions>> body) {
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
        ShowClusterSupportConfigurationResponse that = (ShowClusterSupportConfigurationResponse) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterSupportConfigurationResponse {\n");
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
