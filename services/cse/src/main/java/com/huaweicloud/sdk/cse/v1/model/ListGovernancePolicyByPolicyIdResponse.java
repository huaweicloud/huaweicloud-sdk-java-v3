package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGovernancePolicyByPolicyIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selector")

    private GovSelector selector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private Object spec;

    public ListGovernancePolicyByPolicyIdResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 治理策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListGovernancePolicyByPolicyIdResponse withSelector(GovSelector selector) {
        this.selector = selector;
        return this;
    }

    public ListGovernancePolicyByPolicyIdResponse withSelector(Consumer<GovSelector> selectorSetter) {
        if (this.selector == null) {
            this.selector = new GovSelector();
            selectorSetter.accept(this.selector);
        }

        return this;
    }

    /**
     * Get selector
     * @return selector
     */
    public GovSelector getSelector() {
        return selector;
    }

    public void setSelector(GovSelector selector) {
        this.selector = selector;
    }

    public ListGovernancePolicyByPolicyIdResponse withSpec(Object spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 治理策略定义内容
     * @return spec
     */
    public Object getSpec() {
        return spec;
    }

    public void setSpec(Object spec) {
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
        ListGovernancePolicyByPolicyIdResponse that = (ListGovernancePolicyByPolicyIdResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.selector, that.selector)
            && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, selector, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGovernancePolicyByPolicyIdResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
