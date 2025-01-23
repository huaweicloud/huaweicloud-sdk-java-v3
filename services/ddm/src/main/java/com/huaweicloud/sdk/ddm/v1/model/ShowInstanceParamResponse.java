package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowInstanceParamResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_parameter")

    private List<ConfigurationParameterList> configurationParameter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowInstanceParamResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数组id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInstanceParamResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceParamResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public ShowInstanceParamResponse withConfigurationParameter(
        List<ConfigurationParameterList> configurationParameter) {
        this.configurationParameter = configurationParameter;
        return this;
    }

    public ShowInstanceParamResponse addConfigurationParameterItem(
        ConfigurationParameterList configurationParameterItem) {
        if (this.configurationParameter == null) {
            this.configurationParameter = new ArrayList<>();
        }
        this.configurationParameter.add(configurationParameterItem);
        return this;
    }

    public ShowInstanceParamResponse withConfigurationParameter(
        Consumer<List<ConfigurationParameterList>> configurationParameterSetter) {
        if (this.configurationParameter == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceParamResponse that = (ShowInstanceParamResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.configurationParameter, that.configurationParameter)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, updated, configurationParameter, offset, limit, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceParamResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
