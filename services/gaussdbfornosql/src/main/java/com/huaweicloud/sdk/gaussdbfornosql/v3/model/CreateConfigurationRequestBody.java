package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** CreateConfigurationRequestBody */
public class CreateConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private CreateConfigurationDatastoreOption datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Map<String, String> values = null;

    public CreateConfigurationRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 参数模板名称。最长64个字符，只允许大写字母、小写字母、数字、和“-_.”特殊字符。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConfigurationRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 参数模板描述。最长256个字符，不支持>!<\"&'=特殊字符。默认为空。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateConfigurationRequestBody withDatastore(CreateConfigurationDatastoreOption datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateConfigurationRequestBody withDatastore(Consumer<CreateConfigurationDatastoreOption> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new CreateConfigurationDatastoreOption();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /** Get datastore
     * 
     * @return datastore */
    public CreateConfigurationDatastoreOption getDatastore() {
        return datastore;
    }

    public void setDatastore(CreateConfigurationDatastoreOption datastore) {
        this.datastore = datastore;
    }

    public CreateConfigurationRequestBody withValues(Map<String, String> values) {
        this.values = values;
        return this;
    }

    public CreateConfigurationRequestBody putValuesItem(String key, String valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public CreateConfigurationRequestBody withValues(Consumer<Map<String, String>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /** 参数值对象，用户基于默认参数模板自定义的参数值。默认不修改参数值。
     * 
     * @return values */
    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfigurationRequestBody createConfigurationRequestBody = (CreateConfigurationRequestBody) o;
        return Objects.equals(this.name, createConfigurationRequestBody.name)
            && Objects.equals(this.description, createConfigurationRequestBody.description)
            && Objects.equals(this.datastore, createConfigurationRequestBody.datastore)
            && Objects.equals(this.values, createConfigurationRequestBody.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, datastore, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
