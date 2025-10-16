package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListSessionMemoryContextResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_context_info")

    private List<SessionMemoryContextInfoResult> memoryContextInfo = null;

    public ListSessionMemoryContextResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 总数。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSessionMemoryContextResponse withMemoryContextInfo(
        List<SessionMemoryContextInfoResult> memoryContextInfo) {
        this.memoryContextInfo = memoryContextInfo;
        return this;
    }

    public ListSessionMemoryContextResponse addMemoryContextInfoItem(
        SessionMemoryContextInfoResult memoryContextInfoItem) {
        if (this.memoryContextInfo == null) {
            this.memoryContextInfo = new ArrayList<>();
        }
        this.memoryContextInfo.add(memoryContextInfoItem);
        return this;
    }

    public ListSessionMemoryContextResponse withMemoryContextInfo(
        Consumer<List<SessionMemoryContextInfoResult>> memoryContextInfoSetter) {
        if (this.memoryContextInfo == null) {
            this.memoryContextInfo = new ArrayList<>();
        }
        memoryContextInfoSetter.accept(this.memoryContextInfo);
        return this;
    }

    /**
     * **参数解释**: 会话内存上下文列表。
     * @return memoryContextInfo
     */
    public List<SessionMemoryContextInfoResult> getMemoryContextInfo() {
        return memoryContextInfo;
    }

    public void setMemoryContextInfo(List<SessionMemoryContextInfoResult> memoryContextInfo) {
        this.memoryContextInfo = memoryContextInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSessionMemoryContextResponse that = (ListSessionMemoryContextResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.memoryContextInfo, that.memoryContextInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, memoryContextInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionMemoryContextResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    memoryContextInfo: ").append(toIndentedString(memoryContextInfo)).append("\n");
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
