package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListTableVolumesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_volumes")

    private List<TableVolumeResult> tableVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListTableVolumesResponse withTableVolumes(List<TableVolumeResult> tableVolumes) {
        this.tableVolumes = tableVolumes;
        return this;
    }

    public ListTableVolumesResponse addTableVolumesItem(TableVolumeResult tableVolumesItem) {
        if (this.tableVolumes == null) {
            this.tableVolumes = new ArrayList<>();
        }
        this.tableVolumes.add(tableVolumesItem);
        return this;
    }

    public ListTableVolumesResponse withTableVolumes(Consumer<List<TableVolumeResult>> tableVolumesSetter) {
        if (this.tableVolumes == null) {
            this.tableVolumes = new ArrayList<>();
        }
        tableVolumesSetter.accept(this.tableVolumes);
        return this;
    }

    /**
     * **参数解释**: 数据库表占用空间列表。 
     * @return tableVolumes
     */
    public List<TableVolumeResult> getTableVolumes() {
        return tableVolumes;
    }

    public void setTableVolumes(List<TableVolumeResult> tableVolumes) {
        this.tableVolumes = tableVolumes;
    }

    public ListTableVolumesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总数。 **取值范围**: 不涉及。 
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableVolumesResponse that = (ListTableVolumesResponse) obj;
        return Objects.equals(this.tableVolumes, that.tableVolumes) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableVolumes, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableVolumesResponse {\n");
        sb.append("    tableVolumes: ").append(toIndentedString(tableVolumes)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
