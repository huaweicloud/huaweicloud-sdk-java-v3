package com.huaweicloud.sdk.smn.v2.model;

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
public class ListLogtankResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtanks")

    private List<LogtankItem> logtanks = null;

    public ListLogtankResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListLogtankResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 云日志信息数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListLogtankResponse withLogtanks(List<LogtankItem> logtanks) {
        this.logtanks = logtanks;
        return this;
    }

    public ListLogtankResponse addLogtanksItem(LogtankItem logtanksItem) {
        if (this.logtanks == null) {
            this.logtanks = new ArrayList<>();
        }
        this.logtanks.add(logtanksItem);
        return this;
    }

    public ListLogtankResponse withLogtanks(Consumer<List<LogtankItem>> logtanksSetter) {
        if (this.logtanks == null) {
            this.logtanks = new ArrayList<>();
        }
        logtanksSetter.accept(this.logtanks);
        return this;
    }

    /**
     * 云日志信息列表
     * @return logtanks
     */
    public List<LogtankItem> getLogtanks() {
        return logtanks;
    }

    public void setLogtanks(List<LogtankItem> logtanks) {
        this.logtanks = logtanks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogtankResponse that = (ListLogtankResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.logtanks, that.logtanks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, count, logtanks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogtankResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    logtanks: ").append(toIndentedString(logtanks)).append("\n");
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
