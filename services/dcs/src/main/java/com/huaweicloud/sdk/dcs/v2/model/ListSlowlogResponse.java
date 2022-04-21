package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListSlowlogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slowlogs")

    private List<SlowlogItem> slowlogs = null;

    public ListSlowlogResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSlowlogResponse withSlowlogs(List<SlowlogItem> slowlogs) {
        this.slowlogs = slowlogs;
        return this;
    }

    public ListSlowlogResponse addSlowlogsItem(SlowlogItem slowlogsItem) {
        if (this.slowlogs == null) {
            this.slowlogs = new ArrayList<>();
        }
        this.slowlogs.add(slowlogsItem);
        return this;
    }

    public ListSlowlogResponse withSlowlogs(Consumer<List<SlowlogItem>> slowlogsSetter) {
        if (this.slowlogs == null) {
            this.slowlogs = new ArrayList<>();
        }
        slowlogsSetter.accept(this.slowlogs);
        return this;
    }

    /**
     * 慢日志列表
     * @return slowlogs
     */
    public List<SlowlogItem> getSlowlogs() {
        return slowlogs;
    }

    public void setSlowlogs(List<SlowlogItem> slowlogs) {
        this.slowlogs = slowlogs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSlowlogResponse listSlowlogResponse = (ListSlowlogResponse) o;
        return Objects.equals(this.count, listSlowlogResponse.count)
            && Objects.equals(this.slowlogs, listSlowlogResponse.slowlogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, slowlogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowlogResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    slowlogs: ").append(toIndentedString(slowlogs)).append("\n");
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
