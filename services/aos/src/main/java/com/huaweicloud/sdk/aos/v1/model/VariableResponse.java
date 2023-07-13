package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VariableResponse
 */
public class VariableResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Object _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive")

    private Boolean sensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validations")

    private List<VariableValidationResponse> validations = null;

    public VariableResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数的名字  以HCL格式的模板为例，name 为 `my_hello_world_variable`  ```hcl variable \"my_hello_world_variable\" {   type = string   description = \"this is a variable\"   default = \"hello world\"   sensitive = false   nullable = false   validation {     condition     = length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \"hello\"     error_message = \"my_hello_world_variable should start with 'hello'.\"   } } ```  以json格式的模板为例，name 为 `my_hello_world_variable`  ```json {   \"variable\": {     \"my_hello_world_variable\": [       {         \"default\": \"hello world\",         \"description\": \"this is a variable\",         \"nullable\": false,         \"sensitive\": false,         \"type\": \"string\",         \"validation\": [           {             \"condition\": \"${length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \\\"hello\\\"}\",             \"error_message\": \"my_hello_world_variable should start with 'hello'.\"           }         ]       }     ]   } } ```
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数的类型  以HCL格式的模板为例，type 为 `string`  ```hcl variable \"my_hello_world_variable\" {   type = string   description = \"this is a variable\"   default = \"hello world\"   sensitive = false   nullable = false   validation {     condition     = length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \"hello\"     error_message = \"my_hello_world_variable should start with 'hello'.\"   } } ```  以json格式的模板为例，type 为 `string`  ```json {   \"variable\": {     \"my_hello_world_variable\": [       {         \"default\": \"hello world\",         \"description\": \"this is a variable\",         \"nullable\": false,         \"sensitive\": false,         \"type\": \"string\",         \"validation\": [           {             \"condition\": \"${length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \\\"hello\\\"}\",             \"error_message\": \"my_hello_world_variable should start with 'hello'.\"           }         ]       }     ]   } } ```
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VariableResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数的描述  以HCL格式的模板为例，description 为 `this is a variable`  ```hcl variable \"my_hello_world_variable\" {   type = string   description = \"this is a variable\"   default = \"hello world\"   sensitive = false   nullable = false   validation {     condition     = length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \"hello\"     error_message = \"my_hello_world_variable should start with 'hello'.\"   } } ```  以json格式的模板为例，description 为 `this is a variable`  ```json {   \"variable\": {     \"my_hello_world_variable\": [       {         \"default\": \"hello world\",         \"description\": \"this is a variable\",         \"nullable\": false,         \"sensitive\": false,         \"type\": \"string\",         \"validation\": [           {             \"condition\": \"${length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \\\"hello\\\"}\",             \"error_message\": \"my_hello_world_variable should start with 'hello'.\"           }         ]       }     ]   } } ```
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VariableResponse withDefault(Object _default) {
        this._default = _default;
        return this;
    }

    /**
     * 参数默认值。此返回值的类型将与type保持一致  例如，对于type为string的变量，此值的返回类型为string；对于type为number的变量，此值的返回类型为number  以HCL格式的模板为例，default 为 `hello world`  ```hcl variable \"my_hello_world_variable\" {   type = string   description = \"this is a variable\"   default = \"hello world\"   sensitive = false   nullable = false   validation {     condition     = length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \"hello\"     error_message = \"my_hello_world_variable should start with 'hello'.\"   } } ```  以json格式的模板为例，default 为 `hello world`  ```json {   \"variable\": {     \"my_hello_world_variable\": [       {         \"default\": \"hello world\",         \"description\": \"this is a variable\",         \"nullable\": false,         \"sensitive\": false,         \"type\": \"string\",         \"validation\": [           {             \"condition\": \"${length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \\\"hello\\\"}\",             \"error_message\": \"my_hello_world_variable should start with 'hello'.\"           }         ]       }     ]   } } ```
     * @return _default
     */
    public Object getDefault() {
        return _default;
    }

    public void setDefault(Object _default) {
        this._default = _default;
    }

    public VariableResponse withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * 参数是否为敏感字段  若variable中没有定义sensitive，默认返回false。  以HCL格式的模板为例，sensitive 为 `false`  ```hcl variable \"my_hello_world_variable\" {   type = string   description = \"this is a variable\"   default = \"hello world\"   sensitive = false   nullable = false   validation {     condition     = length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \"hello\"     error_message = \"my_hello_world_variable should start with 'hello'.\"   } } ```  以json格式的模板为例，sensitive 为 `false`  ```json {   \"variable\": {     \"my_hello_world_variable\": [       {         \"default\": \"hello world\",         \"description\": \"this is a variable\",         \"nullable\": false,         \"sensitive\": false,         \"type\": \"string\",         \"validation\": [           {             \"condition\": \"${length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \\\"hello\\\"}\",             \"error_message\": \"my_hello_world_variable should start with 'hello'.\"           }         ]       }     ]   } } ```
     * @return sensitive
     */
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    public VariableResponse withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 参数是否可设置为null。  若variable中没有定义nullable，默认返回true。  以HCL格式的模板为例，nullable 为 `false`  ```hcl variable \"my_hello_world_variable\" {   type = string   description = \"this is a variable\"   default = \"hello world\"   sensitive = false   nullable = false   validation {     condition     = length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \"hello\"     error_message = \"my_hello_world_variable should start with 'hello'.\"   } } ```  以json格式的模板为例，nullable 为 `false`  ```json {   \"variable\": {     \"my_hello_world_variable\": [       {         \"default\": \"hello world\",         \"description\": \"this is a variable\",         \"nullable\": false,         \"sensitive\": false,         \"type\": \"string\",         \"validation\": [           {             \"condition\": \"${length(var.my_hello_world_variable) > 0 && substr(var.my_hello_world_variable, 0, 5) == \\\"hello\\\"}\",             \"error_message\": \"my_hello_world_variable should start with 'hello'.\"           }         ]       }     ]   } } ```
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public VariableResponse withValidations(List<VariableValidationResponse> validations) {
        this.validations = validations;
        return this;
    }

    public VariableResponse addValidationsItem(VariableValidationResponse validationsItem) {
        if (this.validations == null) {
            this.validations = new ArrayList<>();
        }
        this.validations.add(validationsItem);
        return this;
    }

    public VariableResponse withValidations(Consumer<List<VariableValidationResponse>> validationsSetter) {
        if (this.validations == null) {
            this.validations = new ArrayList<>();
        }
        validationsSetter.accept(this.validations);
        return this;
    }

    /**
     * 参数的校验模块
     * @return validations
     */
    public List<VariableValidationResponse> getValidations() {
        return validations;
    }

    public void setValidations(List<VariableValidationResponse> validations) {
        this.validations = validations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VariableResponse that = (VariableResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this._default, that._default)
            && Objects.equals(this.sensitive, that.sensitive) && Objects.equals(this.nullable, that.nullable)
            && Objects.equals(this.validations, that.validations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, _default, sensitive, nullable, validations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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
