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
public class ListQueryStructuredLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "struct_logs")

    private List<StructLogContents> structLogs = null;

    public ListQueryStructuredLogsResponse withStructLogs(List<StructLogContents> structLogs) {
        this.structLogs = structLogs;
        return this;
    }

    public ListQueryStructuredLogsResponse addStructLogsItem(StructLogContents structLogsItem) {
        if (this.structLogs == null) {
            this.structLogs = new ArrayList<>();
        }
        this.structLogs.add(structLogsItem);
        return this;
    }

    public ListQueryStructuredLogsResponse withStructLogs(Consumer<List<StructLogContents>> structLogsSetter) {
        if (this.structLogs == null) {
            this.structLogs = new ArrayList<>();
        }
        structLogsSetter.accept(this.structLogs);
        return this;
    }

    /**
     * 日志信息。
     * @return structLogs
     */
    public List<StructLogContents> getStructLogs() {
        return structLogs;
    }

    public void setStructLogs(List<StructLogContents> structLogs) {
        this.structLogs = structLogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQueryStructuredLogsResponse that = (ListQueryStructuredLogsResponse) obj;
        return Objects.equals(this.structLogs, that.structLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(structLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueryStructuredLogsResponse {\n");
        sb.append("    structLogs: ").append(toIndentedString(structLogs)).append("\n");
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
