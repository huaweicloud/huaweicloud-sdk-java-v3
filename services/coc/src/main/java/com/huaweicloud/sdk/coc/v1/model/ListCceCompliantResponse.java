package com.huaweicloud.sdk.coc.v1.model;

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
public class ListCceCompliantResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_info_list")

    private List<CceInfo> cceInfoList = null;

    public ListCceCompliantResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListCceCompliantResponse withCceInfoList(List<CceInfo> cceInfoList) {
        this.cceInfoList = cceInfoList;
        return this;
    }

    public ListCceCompliantResponse addCceInfoListItem(CceInfo cceInfoListItem) {
        if (this.cceInfoList == null) {
            this.cceInfoList = new ArrayList<>();
        }
        this.cceInfoList.add(cceInfoListItem);
        return this;
    }

    public ListCceCompliantResponse withCceInfoList(Consumer<List<CceInfo>> cceInfoListSetter) {
        if (this.cceInfoList == null) {
            this.cceInfoList = new ArrayList<>();
        }
        cceInfoListSetter.accept(this.cceInfoList);
        return this;
    }

    /**
     * CCE信息列表
     * @return cceInfoList
     */
    public List<CceInfo> getCceInfoList() {
        return cceInfoList;
    }

    public void setCceInfoList(List<CceInfo> cceInfoList) {
        this.cceInfoList = cceInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCceCompliantResponse that = (ListCceCompliantResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.cceInfoList, that.cceInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, cceInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCceCompliantResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    cceInfoList: ").append(toIndentedString(cceInfoList)).append("\n");
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
