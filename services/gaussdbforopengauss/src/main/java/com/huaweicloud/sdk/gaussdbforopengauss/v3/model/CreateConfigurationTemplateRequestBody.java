package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DatastoreOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateConfigurationTemplateRequestBody
 */
public class CreateConfigurationTemplateRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter_values")
    
    
    private Map<String, String> parameterValues = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    
    private DatastoreOption datastore;

    public CreateConfigurationTemplateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数模板名称。 取值范围：长度1到64位之间，区分大小写字母，可包含字母、数字、中划线、下划线或句点，不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateConfigurationTemplateRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数模板描述，默认为空。 取值范围：长度不超过256，不能包含回车<>!&等特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateConfigurationTemplateRequestBody withParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    

    public CreateConfigurationTemplateRequestBody putParameterValuesItem(String key, String parameterValuesItem) {
        if(this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        this.parameterValues.put(key, parameterValuesItem);
        return this;
    }

    public CreateConfigurationTemplateRequestBody withParameterValues(Consumer<Map<String, String>> parameterValuesSetter) {
        if(this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        parameterValuesSetter.accept(this.parameterValues);
        return this;
    }
    /**
     * 参数名和参数值映射关系。用户可以基于默认参数模板的参数，自定义参数值。
     * @return parameterValues
     */
    public Map<String, String> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
    }

    

    public CreateConfigurationTemplateRequestBody withDatastore(DatastoreOption datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateConfigurationTemplateRequestBody withDatastore(Consumer<DatastoreOption> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new DatastoreOption();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public DatastoreOption getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreOption datastore) {
        this.datastore = datastore;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfigurationTemplateRequestBody createConfigurationTemplateRequestBody = (CreateConfigurationTemplateRequestBody) o;
        return Objects.equals(this.name, createConfigurationTemplateRequestBody.name) &&
            Objects.equals(this.description, createConfigurationTemplateRequestBody.description) &&
            Objects.equals(this.parameterValues, createConfigurationTemplateRequestBody.parameterValues) &&
            Objects.equals(this.datastore, createConfigurationTemplateRequestBody.datastore);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, parameterValues, datastore);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationTemplateRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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

