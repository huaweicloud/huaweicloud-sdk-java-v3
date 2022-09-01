package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckRulesetParametersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    @JacksonXmlProperty(localName = "data")

    private List<TaskCheckParamters> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public CheckRulesetParametersResponse withData(List<TaskCheckParamters> data) {
        this.data = data;
        return this;
    }

    public CheckRulesetParametersResponse addDataItem(TaskCheckParamters dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public CheckRulesetParametersResponse withData(Consumer<List<TaskCheckParamters>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 历史记录数据
     * @return data
     */
    public List<TaskCheckParamters> getData() {
        return data;
    }

    public void setData(List<TaskCheckParamters> data) {
        this.data = data;
    }

    public CheckRulesetParametersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
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
        CheckRulesetParametersResponse checkRulesetParametersResponse = (CheckRulesetParametersResponse) o;
        return Objects.equals(this.data, checkRulesetParametersResponse.data)
            && Objects.equals(this.total, checkRulesetParametersResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRulesetParametersResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
