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
public class GetLabelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private Map<String, Map<String, List<String>>> spec = null;

    public GetLabelsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： API类型 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： Labels 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public GetLabelsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： v3 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public GetLabelsResponse withSpec(Map<String, Map<String, List<String>>> spec) {
        this.spec = spec;
        return this;
    }

    public GetLabelsResponse putSpecItem(String key, Map<String, List<String>> specItem) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        this.spec.put(key, specItem);
        return this;
    }

    public GetLabelsResponse withSpec(Consumer<Map<String, Map<String, List<String>>>> specSetter) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        specSetter.accept(this.spec);
        return this;
    }

    /**
     * **参数解释：** 节点标签，按节点池分类。 - key表示节点池ID，默认节点池取值为\"DefaultPool\"。 - value表示标签，key/value对格式。其中key为标签的键，value为标签键对应的值列表。  **约束限制：** 不涉及 
     * @return spec
     */
    public Map<String, Map<String, List<String>>> getSpec() {
        return spec;
    }

    public void setSpec(Map<String, Map<String, List<String>>> spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetLabelsResponse that = (GetLabelsResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetLabelsResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
