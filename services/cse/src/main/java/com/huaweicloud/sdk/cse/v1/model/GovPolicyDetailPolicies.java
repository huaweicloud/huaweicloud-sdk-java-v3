package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GovPolicyDetailPolicies
 */
public class GovPolicyDetailPolicies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selector")

    private GovSelector selector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private Object spec;

    public GovPolicyDetailPolicies withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 治理策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GovPolicyDetailPolicies withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 治理策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GovPolicyDetailPolicies withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 治理类型，支持填写retry、rate-limiting、loadbalance、circuit-breaker、instance-isolation、fault-injection和bulkhead。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public GovPolicyDetailPolicies withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 启用状态，支持enabled和disabled。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GovPolicyDetailPolicies withSelector(GovSelector selector) {
        this.selector = selector;
        return this;
    }

    public GovPolicyDetailPolicies withSelector(Consumer<GovSelector> selectorSetter) {
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

    public GovPolicyDetailPolicies withSpec(Object spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 治理策略定义内容。
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
        GovPolicyDetailPolicies that = (GovPolicyDetailPolicies) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.kind, that.kind) && Objects.equals(this.status, that.status)
            && Objects.equals(this.selector, that.selector) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, kind, status, selector, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GovPolicyDetailPolicies {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
