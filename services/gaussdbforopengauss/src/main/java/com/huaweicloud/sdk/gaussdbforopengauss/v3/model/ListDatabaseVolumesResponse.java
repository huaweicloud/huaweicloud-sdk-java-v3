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
public class ListDatabaseVolumesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_volumes")

    private List<DatabaseVolumeResult> databaseVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListDatabaseVolumesResponse withDatabaseVolumes(List<DatabaseVolumeResult> databaseVolumes) {
        this.databaseVolumes = databaseVolumes;
        return this;
    }

    public ListDatabaseVolumesResponse addDatabaseVolumesItem(DatabaseVolumeResult databaseVolumesItem) {
        if (this.databaseVolumes == null) {
            this.databaseVolumes = new ArrayList<>();
        }
        this.databaseVolumes.add(databaseVolumesItem);
        return this;
    }

    public ListDatabaseVolumesResponse withDatabaseVolumes(Consumer<List<DatabaseVolumeResult>> databaseVolumesSetter) {
        if (this.databaseVolumes == null) {
            this.databaseVolumes = new ArrayList<>();
        }
        databaseVolumesSetter.accept(this.databaseVolumes);
        return this;
    }

    /**
     * **参数解释**: 数据库占用空间列表。 
     * @return databaseVolumes
     */
    public List<DatabaseVolumeResult> getDatabaseVolumes() {
        return databaseVolumes;
    }

    public void setDatabaseVolumes(List<DatabaseVolumeResult> databaseVolumes) {
        this.databaseVolumes = databaseVolumes;
    }

    public ListDatabaseVolumesResponse withTotalCount(Integer totalCount) {
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
        ListDatabaseVolumesResponse that = (ListDatabaseVolumesResponse) obj;
        return Objects.equals(this.databaseVolumes, that.databaseVolumes)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseVolumes, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseVolumesResponse {\n");
        sb.append("    databaseVolumes: ").append(toIndentedString(databaseVolumes)).append("\n");
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
