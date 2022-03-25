package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 节点操作详情 */
public class Action {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_ref")

    private FunctionRef functionRef;

    public Action withFunctionRef(FunctionRef functionRef) {
        this.functionRef = functionRef;
        return this;
    }

    public Action withFunctionRef(Consumer<FunctionRef> functionRefSetter) {
        if (this.functionRef == null) {
            this.functionRef = new FunctionRef();
            functionRefSetter.accept(this.functionRef);
        }

        return this;
    }

    /** Get functionRef
     * 
     * @return functionRef */
    public FunctionRef getFunctionRef() {
        return functionRef;
    }

    public void setFunctionRef(FunctionRef functionRef) {
        this.functionRef = functionRef;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Action action = (Action) o;
        return Objects.equals(this.functionRef, action.functionRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionRef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Action {\n");
        sb.append("    functionRef: ").append(toIndentedString(functionRef)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
