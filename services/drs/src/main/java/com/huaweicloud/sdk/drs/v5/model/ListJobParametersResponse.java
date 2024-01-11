package com.huaweicloud.sdk.drs.v5.model;

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
public class ListJobParametersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_config_list")

    private List<ParameterConfig> parameterConfigList = null;

    public ListJobParametersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListJobParametersResponse withParameterConfigList(List<ParameterConfig> parameterConfigList) {
        this.parameterConfigList = parameterConfigList;
        return this;
    }

    public ListJobParametersResponse addParameterConfigListItem(ParameterConfig parameterConfigListItem) {
        if (this.parameterConfigList == null) {
            this.parameterConfigList = new ArrayList<>();
        }
        this.parameterConfigList.add(parameterConfigListItem);
        return this;
    }

    public ListJobParametersResponse withParameterConfigList(
        Consumer<List<ParameterConfig>> parameterConfigListSetter) {
        if (this.parameterConfigList == null) {
            this.parameterConfigList = new ArrayList<>();
        }
        parameterConfigListSetter.accept(this.parameterConfigList);
        return this;
    }

    /**
     * 任务参数列表
     * @return parameterConfigList
     */
    public List<ParameterConfig> getParameterConfigList() {
        return parameterConfigList;
    }

    public void setParameterConfigList(List<ParameterConfig> parameterConfigList) {
        this.parameterConfigList = parameterConfigList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobParametersResponse that = (ListJobParametersResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.parameterConfigList, that.parameterConfigList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, parameterConfigList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobParametersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    parameterConfigList: ").append(toIndentedString(parameterConfigList)).append("\n");
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
