package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue")

    private String _continue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "since")

    private Integer since;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "until")

    private Integer until;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ListEventsRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * **参数解释**：事件所属资源类型。可选值为pools，表示资源池。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ListEventsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：事件所属资源名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：单页查询最大数量，该值为空或者0时默认返回500条记录，单页最大允许查询500条记录。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEventsRequest withContinue(String _continue) {
        this._continue = _continue;
        return this;
    }

    /**
     * **参数解释**：分页查询的上一页标记，内容为UUID字符串，查询第一页时为空。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return _continue
     */
    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    public ListEventsRequest withSince(Integer since) {
        this.since = since;
        return this;
    }

    /**
     * **参数解释**：事件开始时间戳。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return since
     */
    public Integer getSince() {
        return since;
    }

    public void setSince(Integer since) {
        this.since = since;
    }

    public ListEventsRequest withUntil(Integer until) {
        this.until = until;
        return this;
    }

    /**
     * **参数解释**：事件结束时间戳。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return until
     */
    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public ListEventsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：事件类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Normal：正常 - Warning：异常 **默认取值**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventsRequest that = (ListEventsRequest) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.name, that.name)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this._continue, that._continue)
            && Objects.equals(this.since, that.since) && Objects.equals(this.until, that.until)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, name, limit, _continue, since, until, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsRequest {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    until: ").append(toIndentedString(until)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
