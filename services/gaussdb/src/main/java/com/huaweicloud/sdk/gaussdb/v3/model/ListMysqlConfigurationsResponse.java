package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ConfigurationSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMysqlConfigurationsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configurations")
    
    
    private List<ConfigurationSummary> configurations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListMysqlConfigurationsResponse withConfigurations(List<ConfigurationSummary> configurations) {
        this.configurations = configurations;
        return this;
    }

    
    public ListMysqlConfigurationsResponse addConfigurationsItem(ConfigurationSummary configurationsItem) {
        if(this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ListMysqlConfigurationsResponse withConfigurations(Consumer<List<ConfigurationSummary>> configurationsSetter) {
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

    

    public ListMysqlConfigurationsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 参数模板的总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMysqlConfigurationsResponse listMysqlConfigurationsResponse = (ListMysqlConfigurationsResponse) o;
        return Objects.equals(this.configurations, listMysqlConfigurationsResponse.configurations) &&
            Objects.equals(this.totalCount, listMysqlConfigurationsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configurations, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMysqlConfigurationsResponse {\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

