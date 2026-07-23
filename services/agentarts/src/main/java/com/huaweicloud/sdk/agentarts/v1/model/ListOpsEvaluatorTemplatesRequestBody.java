package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 获取评估器模板请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class ListOpsEvaluatorTemplatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_option")

    private Object filterOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    public ListOpsEvaluatorTemplatesRequestBody withFilterOption(Object filterOption) {
        this.filterOption = filterOption;
        return this;
    }

    /**
     * **参数解释：** 用于设置获取评估器模板时的过滤条件，可以基于多个条件进行筛选。 **约束限制：** 过滤条件对象内包含逻辑操作和具体的条件列表。 **取值范围：** - 过滤条件数量不涉及最小数量限制，最大为10000。 - 逻辑操作（logic_op）长度不涉及最小值，最大长度为100。示例值为And。 - tag_key长度不涉及最小值，最大长度为100。示例值为Category。 - 操作（operator）长度不涉及最小值，最大长度为100。示例值为In。 - 值（value）长度不涉及最小值，最大长度为100。示例值为LLM。 **默认取值：** 不涉及。
     * @return filterOption
     */
    public Object getFilterOption() {
        return filterOption;
    }

    public void setFilterOption(Object filterOption) {
        this.filterOption = filterOption;
    }

    public ListOpsEvaluatorTemplatesRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释：** 指定每次请求返回的评估器模板数量，用于控制每次分页返回的数据量。 **约束限制：** 必须为0到10,000 之间的整数。 **取值范围：** 类型为整数，取值范围为0-10000的整数。 **默认取值：** 不涉及。
     * minimum: 0
     * maximum: 10000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListOpsEvaluatorTemplatesRequestBody withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * **参数解释：** 指定获取的页码，用于控制数据分页的页数定位。 **约束限制：** 必须为0到10,000之间的整数。 **取值范围：** 类型为整数，取值范围为0-10000的整数。 **默认取值：** 不涉及。
     * minimum: 0
     * maximum: 10000
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesRequestBody that = (ListOpsEvaluatorTemplatesRequestBody) obj;
        return Objects.equals(this.filterOption, that.filterOption) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNumber, that.pageNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterOption, pageSize, pageNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesRequestBody {\n");
        sb.append("    filterOption: ").append(toIndentedString(filterOption)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
