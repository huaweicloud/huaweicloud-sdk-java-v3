package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportRisksRequestBody
 */
public class ExportRisksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_headers")

    private List<List<String>> exportHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iac_items")

    private IacRequestInfo iacItems;

    public ExportRisksRequestBody withExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
        return this;
    }

    public ExportRisksRequestBody addExportHeadersItem(List<String> exportHeadersItem) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        this.exportHeaders.add(exportHeadersItem);
        return this;
    }

    public ExportRisksRequestBody withExportHeaders(Consumer<List<List<String>>> exportHeadersSetter) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        exportHeadersSetter.accept(this.exportHeaders);
        return this;
    }

    /**
     * **参数解释**: 导出集群环境安全数据的表头信息列表 **取值范围**: 最小值1，最大值10000 
     * @return exportHeaders
     */
    public List<List<String>> getExportHeaders() {
        return exportHeaders;
    }

    public void setExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
    }

    public ExportRisksRequestBody withIacItems(IacRequestInfo iacItems) {
        this.iacItems = iacItems;
        return this;
    }

    public ExportRisksRequestBody withIacItems(Consumer<IacRequestInfo> iacItemsSetter) {
        if (this.iacItems == null) {
            this.iacItems = new IacRequestInfo();
            iacItemsSetter.accept(this.iacItems);
        }

        return this;
    }

    /**
     * Get iacItems
     * @return iacItems
     */
    public IacRequestInfo getIacItems() {
        return iacItems;
    }

    public void setIacItems(IacRequestInfo iacItems) {
        this.iacItems = iacItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportRisksRequestBody that = (ExportRisksRequestBody) obj;
        return Objects.equals(this.exportHeaders, that.exportHeaders) && Objects.equals(this.iacItems, that.iacItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportHeaders, iacItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportRisksRequestBody {\n");
        sb.append("    exportHeaders: ").append(toIndentedString(exportHeaders)).append("\n");
        sb.append("    iacItems: ").append(toIndentedString(iacItems)).append("\n");
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
