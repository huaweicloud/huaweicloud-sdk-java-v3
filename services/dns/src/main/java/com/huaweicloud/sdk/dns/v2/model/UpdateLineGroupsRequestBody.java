package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateLineGroupsRequestBody
 */
public class UpdateLineGroupsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    private List<String> lines = null;

    public UpdateLineGroupsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 线路分组名称。 不能与自定义线路名称、预制线路名称重复。 取值范围：1-64个字符，支持数字、字母、中文、_（下划线）、-（中划线）、.（点）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateLineGroupsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 线路分组的描述信息。长度不超过255个字符。默认值为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateLineGroupsRequestBody withLines(List<String> lines) {
        this.lines = lines;
        return this;
    }

    public UpdateLineGroupsRequestBody addLinesItem(String linesItem) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        this.lines.add(linesItem);
        return this;
    }

    public UpdateLineGroupsRequestBody withLines(Consumer<List<String>> linesSetter) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        linesSetter.accept(this.lines);
        return this;
    }

    /**
     * 线路列表。
     * @return lines
     */
    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLineGroupsRequestBody that = (UpdateLineGroupsRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.lines, that.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, lines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLineGroupsRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
