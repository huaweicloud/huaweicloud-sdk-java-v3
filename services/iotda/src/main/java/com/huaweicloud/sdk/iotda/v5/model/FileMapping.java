package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OBS文件中的列和流转数据的对应关系。
 */
public class FileMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csv_mappings")

    private List<CsvMappings> csvMappings = null;

    public FileMapping withCsvMappings(List<CsvMappings> csvMappings) {
        this.csvMappings = csvMappings;
        return this;
    }

    public FileMapping addCsvMappingsItem(CsvMappings csvMappingsItem) {
        if (this.csvMappings == null) {
            this.csvMappings = new ArrayList<>();
        }
        this.csvMappings.add(csvMappingsItem);
        return this;
    }

    public FileMapping withCsvMappings(Consumer<List<CsvMappings>> csvMappingsSetter) {
        if (this.csvMappings == null) {
            this.csvMappings = new ArrayList<>();
        }
        csvMappingsSetter.accept(this.csvMappings);
        return this;
    }

    /**
     * **参数说明**：csv文件格式转换列表。当file_type为csv时，必填。
     * @return csvMappings
     */
    public List<CsvMappings> getCsvMappings() {
        return csvMappings;
    }

    public void setCsvMappings(List<CsvMappings> csvMappings) {
        this.csvMappings = csvMappings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileMapping fileMapping = (FileMapping) o;
        return Objects.equals(this.csvMappings, fileMapping.csvMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csvMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileMapping {\n");
        sb.append("    csvMappings: ").append(toIndentedString(csvMappings)).append("\n");
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
