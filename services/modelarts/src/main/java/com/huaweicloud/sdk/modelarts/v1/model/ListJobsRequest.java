package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "since")

    private Long since;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "until")

    private Long until;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListJobsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：任务类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - replace-node：故障节点替换任务。 - reboot-node：节点重启任务。 - reset-nodes：节点重置任务。 **默认取值**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：单页查询最大数量，该值为空时默认返回100条记录，单页最大允许查询500条记录。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：分页查询的偏移量，查询第一页时为空。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListJobsRequest withSince(Long since) {
        this.since = since;
        return this;
    }

    /**
     * **参数解释**：查询起始时间，单位毫秒。默认从30天前开始查询。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return since
     */
    public Long getSince() {
        return since;
    }

    public void setSince(Long since) {
        this.since = since;
    }

    public ListJobsRequest withUntil(Long until) {
        this.until = until;
        return this;
    }

    /**
     * **参数解释**：查询终止时间，单位毫秒。默认当前时间。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return until
     */
    public Long getUntil() {
        return until;
    }

    public void setUntil(Long until) {
        this.until = until;
    }

    public ListJobsRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * **参数解释**：任务关联的资源类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - pools：资源池 **默认取值**：不涉及。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ListJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：关联的资源名称，与resource配合使用。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobsRequest that = (ListJobsRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.since, that.since)
            && Objects.equals(this.until, that.until) && Objects.equals(this.resource, that.resource)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, limit, offset, since, until, resource, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    until: ").append(toIndentedString(until)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
