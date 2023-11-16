package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流量定义
 */
public class CreateBussinessScene {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selector")

    private GovSelector selector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private CreateBussinessSceneSpec spec;

    public CreateBussinessScene withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流量名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBussinessScene withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 启用状态，支持enabled和disabled
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateBussinessScene withSelector(GovSelector selector) {
        this.selector = selector;
        return this;
    }

    public CreateBussinessScene withSelector(Consumer<GovSelector> selectorSetter) {
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

    public CreateBussinessScene withSpec(CreateBussinessSceneSpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateBussinessScene withSpec(Consumer<CreateBussinessSceneSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new CreateBussinessSceneSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public CreateBussinessSceneSpec getSpec() {
        return spec;
    }

    public void setSpec(CreateBussinessSceneSpec spec) {
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
        CreateBussinessScene that = (CreateBussinessScene) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.selector, that.selector) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, selector, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBussinessScene {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
