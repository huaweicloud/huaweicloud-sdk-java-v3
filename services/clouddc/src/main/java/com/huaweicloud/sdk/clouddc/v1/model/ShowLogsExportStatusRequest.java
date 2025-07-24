package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowLogsExportStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_id")

    private String exportId;

    public ShowLogsExportStatusRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * imetal server id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowLogsExportStatusRequest withExportId(String exportId) {
        this.exportId = exportId;
        return this;
    }

    /**
     * 日志导出id
     * @return exportId
     */
    public String getExportId() {
        return exportId;
    }

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLogsExportStatusRequest that = (ShowLogsExportStatusRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.exportId, that.exportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, exportId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogsExportStatusRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
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
