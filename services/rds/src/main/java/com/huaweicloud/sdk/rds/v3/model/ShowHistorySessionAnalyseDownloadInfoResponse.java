package com.huaweicloud.sdk.rds.v3.model;

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
public class ShowHistorySessionAnalyseDownloadInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<DownloadInfo> list = null;

    public ShowHistorySessionAnalyseDownloadInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 记录个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowHistorySessionAnalyseDownloadInfoResponse withList(List<DownloadInfo> list) {
        this.list = list;
        return this;
    }

    public ShowHistorySessionAnalyseDownloadInfoResponse addListItem(DownloadInfo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ShowHistorySessionAnalyseDownloadInfoResponse withList(Consumer<List<DownloadInfo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 下载信息
     * @return list
     */
    public List<DownloadInfo> getList() {
        return list;
    }

    public void setList(List<DownloadInfo> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHistorySessionAnalyseDownloadInfoResponse that = (ShowHistorySessionAnalyseDownloadInfoResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistorySessionAnalyseDownloadInfoResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
