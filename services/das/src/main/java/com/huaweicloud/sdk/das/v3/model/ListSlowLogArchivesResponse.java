package com.huaweicloud.sdk.das.v3.model;

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
public class ListSlowLogArchivesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_list")

    private List<SlowLogArchiveDto> archiveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListSlowLogArchivesResponse withArchiveList(List<SlowLogArchiveDto> archiveList) {
        this.archiveList = archiveList;
        return this;
    }

    public ListSlowLogArchivesResponse addArchiveListItem(SlowLogArchiveDto archiveListItem) {
        if (this.archiveList == null) {
            this.archiveList = new ArrayList<>();
        }
        this.archiveList.add(archiveListItem);
        return this;
    }

    public ListSlowLogArchivesResponse withArchiveList(Consumer<List<SlowLogArchiveDto>> archiveListSetter) {
        if (this.archiveList == null) {
            this.archiveList = new ArrayList<>();
        }
        archiveListSetter.accept(this.archiveList);
        return this;
    }

    /**
     * 慢日志归档文件列表
     * @return archiveList
     */
    public List<SlowLogArchiveDto> getArchiveList() {
        return archiveList;
    }

    public void setArchiveList(List<SlowLogArchiveDto> archiveList) {
        this.archiveList = archiveList;
    }

    public ListSlowLogArchivesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSlowLogArchivesResponse that = (ListSlowLogArchivesResponse) obj;
        return Objects.equals(this.archiveList, that.archiveList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archiveList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowLogArchivesResponse {\n");
        sb.append("    archiveList: ").append(toIndentedString(archiveList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
