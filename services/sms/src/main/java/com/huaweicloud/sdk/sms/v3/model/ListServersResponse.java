package com.huaweicloud.sdk.sms.v3.model;

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
public class ListServersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_servers")

    private List<SourceServersResponseBody> sourceServers = null;

    public ListServersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 符合查询条件的源端总数量，不受limit和offset影响
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListServersResponse withSourceServers(List<SourceServersResponseBody> sourceServers) {
        this.sourceServers = sourceServers;
        return this;
    }

    public ListServersResponse addSourceServersItem(SourceServersResponseBody sourceServersItem) {
        if (this.sourceServers == null) {
            this.sourceServers = new ArrayList<>();
        }
        this.sourceServers.add(sourceServersItem);
        return this;
    }

    public ListServersResponse withSourceServers(Consumer<List<SourceServersResponseBody>> sourceServersSetter) {
        if (this.sourceServers == null) {
            this.sourceServers = new ArrayList<>();
        }
        sourceServersSetter.accept(this.sourceServers);
        return this;
    }

    /**
     * 批量查询的源端服务器详列表
     * @return sourceServers
     */
    public List<SourceServersResponseBody> getSourceServers() {
        return sourceServers;
    }

    public void setSourceServers(List<SourceServersResponseBody> sourceServers) {
        this.sourceServers = sourceServers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServersResponse that = (ListServersResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.sourceServers, that.sourceServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, sourceServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    sourceServers: ").append(toIndentedString(sourceServers)).append("\n");
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
