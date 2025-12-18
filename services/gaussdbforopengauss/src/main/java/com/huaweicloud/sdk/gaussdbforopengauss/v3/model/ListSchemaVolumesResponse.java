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
public class ListSchemaVolumesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_volumes")

    private List<SchemaVolumeResult> schemaVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListSchemaVolumesResponse withSchemaVolumes(List<SchemaVolumeResult> schemaVolumes) {
        this.schemaVolumes = schemaVolumes;
        return this;
    }

    public ListSchemaVolumesResponse addSchemaVolumesItem(SchemaVolumeResult schemaVolumesItem) {
        if (this.schemaVolumes == null) {
            this.schemaVolumes = new ArrayList<>();
        }
        this.schemaVolumes.add(schemaVolumesItem);
        return this;
    }

    public ListSchemaVolumesResponse withSchemaVolumes(Consumer<List<SchemaVolumeResult>> schemaVolumesSetter) {
        if (this.schemaVolumes == null) {
            this.schemaVolumes = new ArrayList<>();
        }
        schemaVolumesSetter.accept(this.schemaVolumes);
        return this;
    }

    /**
     * **参数解释**: 数据库schema占用空间列表 
     * @return schemaVolumes
     */
    public List<SchemaVolumeResult> getSchemaVolumes() {
        return schemaVolumes;
    }

    public void setSchemaVolumes(List<SchemaVolumeResult> schemaVolumes) {
        this.schemaVolumes = schemaVolumes;
    }

    public ListSchemaVolumesResponse withTotalCount(Integer totalCount) {
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
        ListSchemaVolumesResponse that = (ListSchemaVolumesResponse) obj;
        return Objects.equals(this.schemaVolumes, that.schemaVolumes)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaVolumes, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSchemaVolumesResponse {\n");
        sb.append("    schemaVolumes: ").append(toIndentedString(schemaVolumes)).append("\n");
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
