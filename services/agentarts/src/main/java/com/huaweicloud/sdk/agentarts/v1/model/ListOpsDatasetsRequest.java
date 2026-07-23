package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOpsDatasetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListOpsDatasetsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评测集名称检索字段。用于根据评测集的显示名称进行过滤。 **约束限制：** 支持模糊匹配，字符串长度限制为0到100个字符。 **取值范围：** 中英文、数字及特殊字符组成的字符串。 **默认取值：** 无，不传则不进行名称筛选。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListOpsDatasetsRequest withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * **参数解释：** 最后更新人标识。支持通过执行最后一次修改操作的用户ID或用户名进行筛选，以便追踪特定人员管理的数据资产。 **约束限制：** 字符串长度限制为0到1200个字符。 **取值范围：** 系统中存在的有效用户ID或用户名。 **默认取值：** 无，不传则不进行更新人筛选。
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public ListOpsDatasetsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 分页查询的起始偏移量。用于指定从满足条件的第几条记录开始返回，常与 limit参数配合实现分页功能。 **约束限制：** 必须为整数，且大小在0到10,000之间。 **取值范围：** 0-10000。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListOpsDatasetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 单次查询返回的最大记录数量。用于控制分页查询时每页显示的数据条数。 **约束限制：** 必须为整数，且大小在1到100之间。 **取值范围：** 1-100。 **默认取值：** 10。 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsDatasetsRequest that = (ListOpsDatasetsRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.updatedBy, that.updatedBy)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, updatedBy, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsDatasetsRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
