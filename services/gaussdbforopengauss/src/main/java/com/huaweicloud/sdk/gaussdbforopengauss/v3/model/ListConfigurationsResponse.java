package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfigurationSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListConfigurationsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configurations")
    
    private List<ConfigurationSummary> configurations = null;
    
    public ListConfigurationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * Get count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListConfigurationsResponse withConfigurations(List<ConfigurationSummary> configurations) {
        this.configurations = configurations;
        return this;
    }

    
    public ListConfigurationsResponse addConfigurationsItem(ConfigurationSummary configurationsItem) {
        if(this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ListConfigurationsResponse withConfigurations(Consumer<List<ConfigurationSummary>> configurationsSetter) {
        if(this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * Get configurations
     * @return configurations
     */
    public List<ConfigurationSummary> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigurationSummary> configurations) {
        this.configurations = configurations;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConfigurationsResponse listConfigurationsResponse = (ListConfigurationsResponse) o;
        return Objects.equals(this.count, listConfigurationsResponse.count) &&
            Objects.equals(this.configurations, listConfigurationsResponse.configurations);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, configurations);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

