package com.huaweicloud.sdk.ddm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.ConfigurationParameterList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceParamResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_parameter")
    
    private List<ConfigurationParameterList> configurationParameter = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ShowInstanceParamResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * DDM参数最后更新时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public ShowInstanceParamResponse withConfigurationParameter(List<ConfigurationParameterList> configurationParameter) {
        this.configurationParameter = configurationParameter;
        return this;
    }

    
    public ShowInstanceParamResponse addConfigurationParameterItem(ConfigurationParameterList configurationParameterItem) {
        if(this.configurationParameter == null) {
            this.configurationParameter = new ArrayList<>();
        }
        this.configurationParameter.add(configurationParameterItem);
        return this;
    }

    public ShowInstanceParamResponse withConfigurationParameter(Consumer<List<ConfigurationParameterList>> configurationParameterSetter) {
        if(this.configurationParameter == null) {
            this.configurationParameter = new ArrayList<>();
        }
        configurationParameterSetter.accept(this.configurationParameter);
        return this;
    }

    /**
     * DDM实例参数信息列表的集合。
     * @return configurationParameter
     */
    public List<ConfigurationParameterList> getConfigurationParameter() {
        return configurationParameter;
    }

    public void setConfigurationParameter(List<ConfigurationParameterList> configurationParameter) {
        this.configurationParameter = configurationParameter;
    }

    

    public ShowInstanceParamResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 分页参数: 起始值。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ShowInstanceParamResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 分页参数：每页多少条。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ShowInstanceParamResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 集合总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceParamResponse showInstanceParamResponse = (ShowInstanceParamResponse) o;
        return Objects.equals(this.updated, showInstanceParamResponse.updated) &&
            Objects.equals(this.configurationParameter, showInstanceParamResponse.configurationParameter) &&
            Objects.equals(this.offset, showInstanceParamResponse.offset) &&
            Objects.equals(this.limit, showInstanceParamResponse.limit) &&
            Objects.equals(this.total, showInstanceParamResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(updated, configurationParameter, offset, limit, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceParamResponse {\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    configurationParameter: ").append(toIndentedString(configurationParameter)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

