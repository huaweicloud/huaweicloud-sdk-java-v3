package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsRespValues;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListProductsRespHourly
 */
public class ListProductsRespHourly  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private List<ListProductsRespValues> values = null;
    
    public ListProductsRespHourly withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 消息引擎的名称，该字段显示为kafka。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListProductsRespHourly withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 消息引擎的版本，当前仅支持1.1.0和2.3.0。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListProductsRespHourly withValues(List<ListProductsRespValues> values) {
        this.values = values;
        return this;
    }

    
    public ListProductsRespHourly addValuesItem(ListProductsRespValues valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ListProductsRespHourly withValues(Consumer<List<ListProductsRespValues>> valuesSetter) {
        if(this.values == null ){
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 产品规格列表。
     * @return values
     */
    public List<ListProductsRespValues> getValues() {
        return values;
    }

    public void setValues(List<ListProductsRespValues> values) {
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
        ListProductsRespHourly listProductsRespHourly = (ListProductsRespHourly) o;
        return Objects.equals(this.name, listProductsRespHourly.name) &&
            Objects.equals(this.version, listProductsRespHourly.version) &&
            Objects.equals(this.values, listProductsRespHourly.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, version, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRespHourly {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

