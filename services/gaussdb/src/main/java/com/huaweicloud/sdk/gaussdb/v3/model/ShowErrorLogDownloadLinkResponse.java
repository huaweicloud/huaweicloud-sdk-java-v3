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
public class ShowErrorLogDownloadLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<RDSErrorLogDownload> list = null;

    public ShowErrorLogDownloadLinkResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：  数量。  **取值范围**：  不涉及。 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowErrorLogDownloadLinkResponse withList(List<RDSErrorLogDownload> list) {
        this.list = list;
        return this;
    }

    public ShowErrorLogDownloadLinkResponse addListItem(RDSErrorLogDownload listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ShowErrorLogDownloadLinkResponse withList(Consumer<List<RDSErrorLogDownload>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * **参数解释**：  错误日志下载链接列表。 
     * @return list
     */
    public List<RDSErrorLogDownload> getList() {
        return list;
    }

    public void setList(List<RDSErrorLogDownload> list) {
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
        ShowErrorLogDownloadLinkResponse that = (ShowErrorLogDownloadLinkResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowErrorLogDownloadLinkResponse {\n");
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
