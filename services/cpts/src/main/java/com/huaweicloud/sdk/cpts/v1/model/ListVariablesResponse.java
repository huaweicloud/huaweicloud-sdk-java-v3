package com.huaweicloud.sdk.cpts.v1.model;

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
public class ListVariablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_list")

    private List<VariableDetail> variableList = null;

    public ListVariablesResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListVariablesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListVariablesResponse withVariableList(List<VariableDetail> variableList) {
        this.variableList = variableList;
        return this;
    }

    public ListVariablesResponse addVariableListItem(VariableDetail variableListItem) {
        if (this.variableList == null) {
            this.variableList = new ArrayList<>();
        }
        this.variableList.add(variableListItem);
        return this;
    }

    public ListVariablesResponse withVariableList(Consumer<List<VariableDetail>> variableListSetter) {
        if (this.variableList == null) {
            this.variableList = new ArrayList<>();
        }
        variableListSetter.accept(this.variableList);
        return this;
    }

    /**
     * variable_list
     * @return variableList
     */
    public List<VariableDetail> getVariableList() {
        return variableList;
    }

    public void setVariableList(List<VariableDetail> variableList) {
        this.variableList = variableList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVariablesResponse that = (ListVariablesResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message)
            && Objects.equals(this.variableList, that.variableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, variableList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVariablesResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    variableList: ").append(toIndentedString(variableList)).append("\n");
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
