package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSlowLogFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<SlowLogFile> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public ListSlowLogFileResponse withList(List<SlowLogFile> list) {
        this.list = list;
        return this;
    }

    public ListSlowLogFileResponse addListItem(SlowLogFile listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListSlowLogFileResponse withList(Consumer<List<SlowLogFile>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /** Get list
     * 
     * @return list */
    public List<SlowLogFile> getList() {
        return list;
    }

    public void setList(List<SlowLogFile> list) {
        this.list = list;
    }

    public ListSlowLogFileResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 文件总数。
     * 
     * @return totalCount */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSlowLogFileResponse listSlowLogFileResponse = (ListSlowLogFileResponse) o;
        return Objects.equals(this.list, listSlowLogFileResponse.list)
            && Objects.equals(this.totalCount, listSlowLogFileResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowLogFileResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
