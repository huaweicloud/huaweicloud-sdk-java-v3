package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCoreRuntimesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_ids")

    private String runtimeIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListCoreRuntimesRequest withRuntimeIds(String runtimeIds) {
        this.runtimeIds = runtimeIds;
        return this;
    }

    /**
     * **参数解释**：  运行时ID列表精确查询，可选参数，如果有多个ID，ID之间用逗号分隔。 **约束限制**: 支持批量查询多个运行时ID，最多支持10个ID。
     * @return runtimeIds
     */
    public String getRuntimeIds() {
        return runtimeIds;
    }

    public void setRuntimeIds(String runtimeIds) {
        this.runtimeIds = runtimeIds;
    }

    public ListCoreRuntimesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  Agent运行时名称，必须以字母开头，只包含字母数字和连字符。 **约束限制**: 不涉及。 **取值范围**： 以小写字母开头，以小写字母或数字结尾，可以包含小写字母、数字和中划线，长度为2-48个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCoreRuntimesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页查询偏移量，表示从第几条记录开始查询，从1开始。 **默认取值**: 1
     * minimum: 1
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCoreRuntimesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 每页返回的记录数。 **默认取值**: 10
     * minimum: 10
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
        ListCoreRuntimesRequest that = (ListCoreRuntimesRequest) obj;
        return Objects.equals(this.runtimeIds, that.runtimeIds) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeIds, name, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreRuntimesRequest {\n");
        sb.append("    runtimeIds: ").append(toIndentedString(runtimeIds)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
