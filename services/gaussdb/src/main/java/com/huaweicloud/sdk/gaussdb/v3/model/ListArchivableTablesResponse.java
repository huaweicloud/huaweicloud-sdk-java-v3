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
public class ListArchivableTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archivable_tables")

    private List<ArchivableTable> archivableTables = null;

    public ListArchivableTablesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  总记录数。  **取值范围**：  大于等于0。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListArchivableTablesResponse withArchivableTables(List<ArchivableTable> archivableTables) {
        this.archivableTables = archivableTables;
        return this;
    }

    public ListArchivableTablesResponse addArchivableTablesItem(ArchivableTable archivableTablesItem) {
        if (this.archivableTables == null) {
            this.archivableTables = new ArrayList<>();
        }
        this.archivableTables.add(archivableTablesItem);
        return this;
    }

    public ListArchivableTablesResponse withArchivableTables(Consumer<List<ArchivableTable>> archivableTablesSetter) {
        if (this.archivableTables == null) {
            this.archivableTables = new ArrayList<>();
        }
        archivableTablesSetter.accept(this.archivableTables);
        return this;
    }

    /**
     * **参数解释**：  可归档表信息。
     * @return archivableTables
     */
    public List<ArchivableTable> getArchivableTables() {
        return archivableTables;
    }

    public void setArchivableTables(List<ArchivableTable> archivableTables) {
        this.archivableTables = archivableTables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListArchivableTablesResponse that = (ListArchivableTablesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.archivableTables, that.archivableTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, archivableTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListArchivableTablesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    archivableTables: ").append(toIndentedString(archivableTables)).append("\n");
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
