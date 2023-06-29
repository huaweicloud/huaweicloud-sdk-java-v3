package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库列信息。
 */
public class ColumnObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_type")

    private String syncType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key_for_data_filtering")

    private String primaryKeyForDataFiltering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_for_data_filtering")

    private String indexForDataFiltering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key_for_column_filtering")

    private String primaryKeyForColumnFiltering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filtered")

    private Boolean filtered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional")

    private Boolean additional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ColumnObject withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * 该列在实时同步场景下的类型。取值： - config：当该列作为数据过滤高级设置的关联列时，需要填写，同时如果该列是主建或优化查询所需的索引，则需要填写primary_key_for_data_filtering或index_for_data_filtering。（注意：是否同步该列到目标库由“filtered”属性控制，与库级、模式级、表级控制方式不同。）
     * @return syncType
     */
    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public ColumnObject withPrimaryKeyForDataFiltering(String primaryKeyForDataFiltering) {
        this.primaryKeyForDataFiltering = primaryKeyForDataFiltering;
        return this;
    }

    /**
     * 该列是否在数据过滤高级设置场景下为主键，如果是主建则填该列列名，否则不填。
     * @return primaryKeyForDataFiltering
     */
    public String getPrimaryKeyForDataFiltering() {
        return primaryKeyForDataFiltering;
    }

    public void setPrimaryKeyForDataFiltering(String primaryKeyForDataFiltering) {
        this.primaryKeyForDataFiltering = primaryKeyForDataFiltering;
    }

    public ColumnObject withIndexForDataFiltering(String indexForDataFiltering) {
        this.indexForDataFiltering = indexForDataFiltering;
        return this;
    }

    /**
     * 优化查询所需的索引，将会为缓存数据增加索引，不会影响源表，当该列作为数据过滤高级设置的关联索引时，需要填写，否则不填。
     * @return indexForDataFiltering
     */
    public String getIndexForDataFiltering() {
        return indexForDataFiltering;
    }

    public void setIndexForDataFiltering(String indexForDataFiltering) {
        this.indexForDataFiltering = indexForDataFiltering;
    }

    public ColumnObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 该列在目标库的名称（列名映射），当该列为“附加列”时须与数据库表级对象中列名保持一致。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColumnObject withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 该列字段的数据类型。 列过滤：填写源列字段的数据类型。 附加列：新填充的列指定字段的数据类型，根据不同操作类型来决定取值范围与约束。取值： - 以默认值方式，支持：int,long,varchar(256),datetime,timestamp。 - 以create_time为列，支持：long,datetime,timestamp。 - 以update_time为列，支持：long,datetime,timestamp。 - 以表达式为列，支持：varchar(256)，且列值仅为：concat(__current_database, '@', __current_table) - 以serverName@database@table为列，支持：varchar(256)。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ColumnObject withPrimaryKeyForColumnFiltering(String primaryKeyForColumnFiltering) {
        this.primaryKeyForColumnFiltering = primaryKeyForColumnFiltering;
        return this;
    }

    /**
     * 该列是否在列映射场景下为主键，如果是主建则填PRI，否则填空。
     * @return primaryKeyForColumnFiltering
     */
    public String getPrimaryKeyForColumnFiltering() {
        return primaryKeyForColumnFiltering;
    }

    public void setPrimaryKeyForColumnFiltering(String primaryKeyForColumnFiltering) {
        this.primaryKeyForColumnFiltering = primaryKeyForColumnFiltering;
    }

    public ColumnObject withFiltered(Boolean filtered) {
        this.filtered = filtered;
        return this;
    }

    /**
     * 该列是否进列过滤，不能与附加列additional同时使用。取值： - true：表示同步该列。 - false：表示过滤该列不同步。
     * @return filtered
     */
    public Boolean getFiltered() {
        return filtered;
    }

    public void setFiltered(Boolean filtered) {
        this.filtered = filtered;
    }

    public ColumnObject withAdditional(Boolean additional) {
        this.additional = additional;
        return this;
    }

    /**
     * 该列是否为附加列，当该列为附加列时：name必须与表级对象中列名一致，并且不能与列过滤filtered同时使用。
     * @return additional
     */
    public Boolean getAdditional() {
        return additional;
    }

    public void setAdditional(Boolean additional) {
        this.additional = additional;
    }

    public ColumnObject withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类型，以特定的操作类型填充新加的列。取值： - 以默认值方式：\"operation_type\":\"ADDITIONALCOLUMN,default_value\" - 以create_time为列：\"operation_type\":\"ADDITIONALCOLUMN,create_time\" - 以update_time为列：\"operation_type\":\"ADDITIONALCOLUMN,update_time\" - 以表达式为列：\"operation_type\":\"ADDITIONALCOLUMN,expression\" - 以serverName@database@table为列：\"operation_type\":\"ADDITIONALCOLUMN,server_database_table\"
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ColumnObject withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 附加列的值。约束： - 当操作类型仅“以默认值方式”，“以serverName@database@table为列”时，才支持输入对应字段类型的值。 - 当操作类型为“以表达式为列”时，该字段为固定值\"concat(__current_database, '@', __current_table)\"，不需要填写。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnObject that = (ColumnObject) obj;
        return Objects.equals(this.syncType, that.syncType)
            && Objects.equals(this.primaryKeyForDataFiltering, that.primaryKeyForDataFiltering)
            && Objects.equals(this.indexForDataFiltering, that.indexForDataFiltering)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.primaryKeyForColumnFiltering, that.primaryKeyForColumnFiltering)
            && Objects.equals(this.filtered, that.filtered) && Objects.equals(this.additional, that.additional)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncType,
            primaryKeyForDataFiltering,
            indexForDataFiltering,
            name,
            type,
            primaryKeyForColumnFiltering,
            filtered,
            additional,
            operationType,
            value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnObject {\n");
        sb.append("    syncType: ").append(toIndentedString(syncType)).append("\n");
        sb.append("    primaryKeyForDataFiltering: ").append(toIndentedString(primaryKeyForDataFiltering)).append("\n");
        sb.append("    indexForDataFiltering: ").append(toIndentedString(indexForDataFiltering)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    primaryKeyForColumnFiltering: ")
            .append(toIndentedString(primaryKeyForColumnFiltering))
            .append("\n");
        sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
        sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
