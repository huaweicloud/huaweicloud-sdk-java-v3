package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StorageDescriptor
 */
public class StorageDescriptor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<Column> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compressed")

    private Boolean compressed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_format")

    private String inputFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_format")

    private String outputFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_buckets")

    private Integer numberOfBuckets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_columns")

    private List<String> bucketColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_columns")

    private List<Order> sortColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serde_info")

    private SerDeInfo serdeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skewed_info")

    private SkewedInfo skewedInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stored_as_sub_directories")

    private Boolean storedAsSubDirectories;

    public StorageDescriptor withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    public StorageDescriptor addColumnsItem(Column columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public StorageDescriptor withColumns(Consumer<List<Column>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 分区列以外的所有字段
     * @return columns
     */
    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public StorageDescriptor withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 存储路径
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public StorageDescriptor withCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }

    /**
     * 是否启用数据压缩
     * @return compressed
     */
    public Boolean getCompressed() {
        return compressed;
    }

    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    public StorageDescriptor withInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }

    /**
     * 输入格式
     * @return inputFormat
     */
    public String getInputFormat() {
        return inputFormat;
    }

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    public StorageDescriptor withOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * 输出格式
     * @return outputFormat
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    public StorageDescriptor withNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        return this;
    }

    /**
     * 分桶的桶数量
     * @return numberOfBuckets
     */
    public Integer getNumberOfBuckets() {
        return numberOfBuckets;
    }

    public void setNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
    }

    public StorageDescriptor withBucketColumns(List<String> bucketColumns) {
        this.bucketColumns = bucketColumns;
        return this;
    }

    public StorageDescriptor addBucketColumnsItem(String bucketColumnsItem) {
        if (this.bucketColumns == null) {
            this.bucketColumns = new ArrayList<>();
        }
        this.bucketColumns.add(bucketColumnsItem);
        return this;
    }

    public StorageDescriptor withBucketColumns(Consumer<List<String>> bucketColumnsSetter) {
        if (this.bucketColumns == null) {
            this.bucketColumns = new ArrayList<>();
        }
        bucketColumnsSetter.accept(this.bucketColumns);
        return this;
    }

    /**
     * 分桶字段
     * @return bucketColumns
     */
    public List<String> getBucketColumns() {
        return bucketColumns;
    }

    public void setBucketColumns(List<String> bucketColumns) {
        this.bucketColumns = bucketColumns;
    }

    public StorageDescriptor withSortColumns(List<Order> sortColumns) {
        this.sortColumns = sortColumns;
        return this;
    }

    public StorageDescriptor addSortColumnsItem(Order sortColumnsItem) {
        if (this.sortColumns == null) {
            this.sortColumns = new ArrayList<>();
        }
        this.sortColumns.add(sortColumnsItem);
        return this;
    }

    public StorageDescriptor withSortColumns(Consumer<List<Order>> sortColumnsSetter) {
        if (this.sortColumns == null) {
            this.sortColumns = new ArrayList<>();
        }
        sortColumnsSetter.accept(this.sortColumns);
        return this;
    }

    /**
     * 指定表中的每个存储桶的排序顺序的列表
     * @return sortColumns
     */
    public List<Order> getSortColumns() {
        return sortColumns;
    }

    public void setSortColumns(List<Order> sortColumns) {
        this.sortColumns = sortColumns;
    }

    public StorageDescriptor withSerdeInfo(SerDeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
        return this;
    }

    public StorageDescriptor withSerdeInfo(Consumer<SerDeInfo> serdeInfoSetter) {
        if (this.serdeInfo == null) {
            this.serdeInfo = new SerDeInfo();
            serdeInfoSetter.accept(this.serdeInfo);
        }

        return this;
    }

    /**
     * Get serdeInfo
     * @return serdeInfo
     */
    public SerDeInfo getSerdeInfo() {
        return serdeInfo;
    }

    public void setSerdeInfo(SerDeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
    }

    public StorageDescriptor withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public StorageDescriptor putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public StorageDescriptor withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 存储描述符的参数。 key最小长度为1，最大长度为255. value最大长度为4000
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public StorageDescriptor withSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
        return this;
    }

    public StorageDescriptor withSkewedInfo(Consumer<SkewedInfo> skewedInfoSetter) {
        if (this.skewedInfo == null) {
            this.skewedInfo = new SkewedInfo();
            skewedInfoSetter.accept(this.skewedInfo);
        }

        return this;
    }

    /**
     * Get skewedInfo
     * @return skewedInfo
     */
    public SkewedInfo getSkewedInfo() {
        return skewedInfo;
    }

    public void setSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
    }

    public StorageDescriptor withStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
        return this;
    }

    /**
     * 数据是否会存放在子目录中
     * @return storedAsSubDirectories
     */
    public Boolean getStoredAsSubDirectories() {
        return storedAsSubDirectories;
    }

    public void setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageDescriptor storageDescriptor = (StorageDescriptor) o;
        return Objects.equals(this.columns, storageDescriptor.columns)
            && Objects.equals(this.location, storageDescriptor.location)
            && Objects.equals(this.compressed, storageDescriptor.compressed)
            && Objects.equals(this.inputFormat, storageDescriptor.inputFormat)
            && Objects.equals(this.outputFormat, storageDescriptor.outputFormat)
            && Objects.equals(this.numberOfBuckets, storageDescriptor.numberOfBuckets)
            && Objects.equals(this.bucketColumns, storageDescriptor.bucketColumns)
            && Objects.equals(this.sortColumns, storageDescriptor.sortColumns)
            && Objects.equals(this.serdeInfo, storageDescriptor.serdeInfo)
            && Objects.equals(this.parameters, storageDescriptor.parameters)
            && Objects.equals(this.skewedInfo, storageDescriptor.skewedInfo)
            && Objects.equals(this.storedAsSubDirectories, storageDescriptor.storedAsSubDirectories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns,
            location,
            compressed,
            inputFormat,
            outputFormat,
            numberOfBuckets,
            bucketColumns,
            sortColumns,
            serdeInfo,
            parameters,
            skewedInfo,
            storedAsSubDirectories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageDescriptor {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
        sb.append("    inputFormat: ").append(toIndentedString(inputFormat)).append("\n");
        sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
        sb.append("    numberOfBuckets: ").append(toIndentedString(numberOfBuckets)).append("\n");
        sb.append("    bucketColumns: ").append(toIndentedString(bucketColumns)).append("\n");
        sb.append("    sortColumns: ").append(toIndentedString(sortColumns)).append("\n");
        sb.append("    serdeInfo: ").append(toIndentedString(serdeInfo)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    skewedInfo: ").append(toIndentedString(skewedInfo)).append("\n");
        sb.append("    storedAsSubDirectories: ").append(toIndentedString(storedAsSubDirectories)).append("\n");
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
