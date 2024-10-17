package com.huaweicloud.sdk.ecs.v2.model;

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
public class NovaShowFlavorExtraSpecsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_specs")

    private Map<String, String> extraSpecs = null;

    public NovaShowFlavorExtraSpecsResponse withExtraSpecs(Map<String, String> extraSpecs) {
        this.extraSpecs = extraSpecs;
        return this;
    }

    public NovaShowFlavorExtraSpecsResponse putExtraSpecsItem(String key, String extraSpecsItem) {
        if (this.extraSpecs == null) {
            this.extraSpecs = new HashMap<>();
        }
        this.extraSpecs.put(key, extraSpecsItem);
        return this;
    }

    public NovaShowFlavorExtraSpecsResponse withExtraSpecs(Consumer<Map<String, String>> extraSpecsSetter) {
        if (this.extraSpecs == null) {
            this.extraSpecs = new HashMap<>();
        }
        extraSpecsSetter.accept(this.extraSpecs);
        return this;
    }

    /**
     * 描述弹性云服务器规格的键值对。
     * @return extraSpecs
     */
    public Map<String, String> getExtraSpecs() {
        return extraSpecs;
    }

    public void setExtraSpecs(Map<String, String> extraSpecs) {
        this.extraSpecs = extraSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaShowFlavorExtraSpecsResponse that = (NovaShowFlavorExtraSpecsResponse) obj;
        return Objects.equals(this.extraSpecs, that.extraSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaShowFlavorExtraSpecsResponse {\n");
        sb.append("    extraSpecs: ").append(toIndentedString(extraSpecs)).append("\n");
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
