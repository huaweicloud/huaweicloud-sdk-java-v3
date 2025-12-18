package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAutopilotFeatureGatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private Map<String, Object> spec = null;

    public ShowAutopilotFeatureGatesResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释：** API类型。 **约束限制：** 该值不可修改 **取值范围：** - Configuration  **默认取值：** 不涉及 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowAutopilotFeatureGatesResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释：** API版本。 **约束限制：** 该值不可修改 **取值范围：** - v3.1  **默认取值：** 不涉及 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowAutopilotFeatureGatesResponse withSpec(Map<String, Object> spec) {
        this.spec = spec;
        return this;
    }

    public ShowAutopilotFeatureGatesResponse putSpecItem(String key, Object specItem) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        this.spec.put(key, specItem);
        return this;
    }

    public ShowAutopilotFeatureGatesResponse withSpec(Consumer<Map<String, Object>> specSetter) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        specSetter.accept(this.spec);
        return this;
    }

    /**
     * **参数解释：** 特性开关详情 **取值范围**: 不涉及 
     * @return spec
     */
    public Map<String, Object> getSpec() {
        return spec;
    }

    public void setSpec(Map<String, Object> spec) {
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
        ShowAutopilotFeatureGatesResponse that = (ShowAutopilotFeatureGatesResponse) obj;
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
        sb.append("class ShowAutopilotFeatureGatesResponse {\n");
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
