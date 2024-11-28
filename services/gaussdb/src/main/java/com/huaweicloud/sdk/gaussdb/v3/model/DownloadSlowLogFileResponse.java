package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class DownloadSlowLogFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<DownloadSlowLogFileItem> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public DownloadSlowLogFileResponse withList(List<DownloadSlowLogFileItem> list) {
        this.list = list;
        return this;
    }

    public DownloadSlowLogFileResponse addListItem(DownloadSlowLogFileItem listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public DownloadSlowLogFileResponse withList(Consumer<List<DownloadSlowLogFileItem>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 慢日志下载链接列表。
     * @return list
     */
    public List<DownloadSlowLogFileItem> getList() {
        return list;
    }

    public void setList(List<DownloadSlowLogFileItem> list) {
        this.list = list;
    }

    public DownloadSlowLogFileResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 条数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadSlowLogFileResponse that = (DownloadSlowLogFileResponse) obj;
        return Objects.equals(this.list, that.list) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadSlowLogFileResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
