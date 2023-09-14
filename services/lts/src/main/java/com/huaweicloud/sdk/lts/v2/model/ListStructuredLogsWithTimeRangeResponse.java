package com.huaweicloud.sdk.lts.v2.model;

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
public class ListStructuredLogsWithTimeRangeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context")

    private List<String> context = null;

    public ListStructuredLogsWithTimeRangeResponse withContext(List<String> context) {
        this.context = context;
        return this;
    }

    public ListStructuredLogsWithTimeRangeResponse addContextItem(String contextItem) {
        if (this.context == null) {
            this.context = new ArrayList<>();
        }
        this.context.add(contextItem);
        return this;
    }

    public ListStructuredLogsWithTimeRangeResponse withContext(Consumer<List<String>> contextSetter) {
        if (this.context == null) {
            this.context = new ArrayList<>();
        }
        contextSetter.accept(this.context);
        return this;
    }

    /**
     * 查询结构化日志结果信息。 此处仅为示例，具体参数名称取决于查询的字段。
     * @return context
     */
    public List<String> getContext() {
        return context;
    }

    public void setContext(List<String> context) {
        this.context = context;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStructuredLogsWithTimeRangeResponse that = (ListStructuredLogsWithTimeRangeResponse) obj;
        return Objects.equals(this.context, that.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStructuredLogsWithTimeRangeResponse {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
