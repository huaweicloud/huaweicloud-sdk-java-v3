package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出数据的表头字段列表
 */
public class ExportAntiVirusResultRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_headers")

    private List<List<String>> exportHeaders = null;

    public ExportAntiVirusResultRequestBody withExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
        return this;
    }

    public ExportAntiVirusResultRequestBody addExportHeadersItem(List<String> exportHeadersItem) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        this.exportHeaders.add(exportHeadersItem);
        return this;
    }

    public ExportAntiVirusResultRequestBody withExportHeaders(Consumer<List<List<String>>> exportHeadersSetter) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        exportHeadersSetter.accept(this.exportHeaders);
        return this;
    }

    /**
     * 导出表头集合
     * @return exportHeaders
     */
    public List<List<String>> getExportHeaders() {
        return exportHeaders;
    }

    public void setExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportAntiVirusResultRequestBody that = (ExportAntiVirusResultRequestBody) obj;
        return Objects.equals(this.exportHeaders, that.exportHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportAntiVirusResultRequestBody {\n");
        sb.append("    exportHeaders: ").append(toIndentedString(exportHeaders)).append("\n");
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
