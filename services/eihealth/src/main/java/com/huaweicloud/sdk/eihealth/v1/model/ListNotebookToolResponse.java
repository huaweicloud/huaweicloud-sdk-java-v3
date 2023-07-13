package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListNotebookToolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tools")

    private List<NotebookToolDto> tools = null;

    public ListNotebookToolResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListNotebookToolResponse withTools(List<NotebookToolDto> tools) {
        this.tools = tools;
        return this;
    }

    public ListNotebookToolResponse addToolsItem(NotebookToolDto toolsItem) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        this.tools.add(toolsItem);
        return this;
    }

    public ListNotebookToolResponse withTools(Consumer<List<NotebookToolDto>> toolsSetter) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        toolsSetter.accept(this.tools);
        return this;
    }

    /**
     * tool详情列表
     * @return tools
     */
    public List<NotebookToolDto> getTools() {
        return tools;
    }

    public void setTools(List<NotebookToolDto> tools) {
        this.tools = tools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotebookToolResponse that = (ListNotebookToolResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.tools, that.tools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, tools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotebookToolResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
