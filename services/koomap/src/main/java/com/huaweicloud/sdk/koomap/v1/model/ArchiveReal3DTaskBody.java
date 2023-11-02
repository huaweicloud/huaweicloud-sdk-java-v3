package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 归档任务请求体。
 */
public class ArchiveReal3DTaskBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive")

    private Boolean archive;

    public ArchiveReal3DTaskBody withArchive(Boolean archive) {
        this.archive = archive;
        return this;
    }

    /**
     * 归档/取消归档标识。 - true：归档 - false：取消归档。
     * @return archive
     */
    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArchiveReal3DTaskBody that = (ArchiveReal3DTaskBody) obj;
        return Objects.equals(this.archive, that.archive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArchiveReal3DTaskBody {\n");
        sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
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
