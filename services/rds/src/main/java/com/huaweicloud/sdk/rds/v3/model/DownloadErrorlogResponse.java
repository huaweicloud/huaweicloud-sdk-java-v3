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
public class DownloadErrorlogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<ErrorlogDownloadInfo> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public DownloadErrorlogResponse withList(List<ErrorlogDownloadInfo> list) {
        this.list = list;
        return this;
    }

    public DownloadErrorlogResponse addListItem(ErrorlogDownloadInfo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public DownloadErrorlogResponse withList(Consumer<List<ErrorlogDownloadInfo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 错误日志下载链接列表
     * @return list
     */
    public List<ErrorlogDownloadInfo> getList() {
        return list;
    }

    public void setList(List<ErrorlogDownloadInfo> list) {
        this.list = list;
    }

    public DownloadErrorlogResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * - 错误日志下载链接生成状态。FINISH，表示下载链接已经生成完成。CREATING，表示正在生成文件，准备下载链接。FAILED，表示存在日志文件准备失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DownloadErrorlogResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * - 错误日志链接数量。
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
        DownloadErrorlogResponse that = (DownloadErrorlogResponse) obj;
        return Objects.equals(this.list, that.list) && Objects.equals(this.status, that.status)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, status, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadErrorlogResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
