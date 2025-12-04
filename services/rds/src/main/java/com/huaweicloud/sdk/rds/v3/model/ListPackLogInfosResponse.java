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
public class ListPackLogInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pack_log_infos")

    private List<PackLogInfo> packLogInfos = null;

    public ListPackLogInfosResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  binlog合并下载文件数量。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 1000000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListPackLogInfosResponse withPackLogInfos(List<PackLogInfo> packLogInfos) {
        this.packLogInfos = packLogInfos;
        return this;
    }

    public ListPackLogInfosResponse addPackLogInfosItem(PackLogInfo packLogInfosItem) {
        if (this.packLogInfos == null) {
            this.packLogInfos = new ArrayList<>();
        }
        this.packLogInfos.add(packLogInfosItem);
        return this;
    }

    public ListPackLogInfosResponse withPackLogInfos(Consumer<List<PackLogInfo>> packLogInfosSetter) {
        if (this.packLogInfos == null) {
            this.packLogInfos = new ArrayList<>();
        }
        packLogInfosSetter.accept(this.packLogInfos);
        return this;
    }

    /**
     * **参数解释**：  binlog合并下载文件信息。  **约束限制**：  不涉及。
     * @return packLogInfos
     */
    public List<PackLogInfo> getPackLogInfos() {
        return packLogInfos;
    }

    public void setPackLogInfos(List<PackLogInfo> packLogInfos) {
        this.packLogInfos = packLogInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPackLogInfosResponse that = (ListPackLogInfosResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.packLogInfos, that.packLogInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, packLogInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPackLogInfosResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    packLogInfos: ").append(toIndentedString(packLogInfos)).append("\n");
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
