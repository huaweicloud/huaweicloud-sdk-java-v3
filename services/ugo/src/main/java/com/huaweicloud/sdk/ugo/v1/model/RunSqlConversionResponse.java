package com.huaweicloud.sdk.ugo.v1.model;

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
public class RunSqlConversionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_conversion")

    private Boolean isSupportConversion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "converted_sql_statement")

    private String convertedSqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsupported_items")

    private List<UnSupportedItem> unsupportedItems = null;

    public RunSqlConversionResponse withIsSupportConversion(Boolean isSupportConversion) {
        this.isSupportConversion = isSupportConversion;
        return this;
    }

    /**
     * 是否支持SQL语句转换。
     * @return isSupportConversion
     */
    public Boolean getIsSupportConversion() {
        return isSupportConversion;
    }

    public void setIsSupportConversion(Boolean isSupportConversion) {
        this.isSupportConversion = isSupportConversion;
    }

    public RunSqlConversionResponse withConvertedSqlStatement(String convertedSqlStatement) {
        this.convertedSqlStatement = convertedSqlStatement;
        return this;
    }

    /**
     * 转换后的SQL语句。
     * @return convertedSqlStatement
     */
    public String getConvertedSqlStatement() {
        return convertedSqlStatement;
    }

    public void setConvertedSqlStatement(String convertedSqlStatement) {
        this.convertedSqlStatement = convertedSqlStatement;
    }

    public RunSqlConversionResponse withUnsupportedItems(List<UnSupportedItem> unsupportedItems) {
        this.unsupportedItems = unsupportedItems;
        return this;
    }

    public RunSqlConversionResponse addUnsupportedItemsItem(UnSupportedItem unsupportedItemsItem) {
        if (this.unsupportedItems == null) {
            this.unsupportedItems = new ArrayList<>();
        }
        this.unsupportedItems.add(unsupportedItemsItem);
        return this;
    }

    public RunSqlConversionResponse withUnsupportedItems(Consumer<List<UnSupportedItem>> unsupportedItemsSetter) {
        if (this.unsupportedItems == null) {
            this.unsupportedItems = new ArrayList<>();
        }
        unsupportedItemsSetter.accept(this.unsupportedItems);
        return this;
    }

    /**
     * 不支持SQL语句转换的详情。
     * @return unsupportedItems
     */
    public List<UnSupportedItem> getUnsupportedItems() {
        return unsupportedItems;
    }

    public void setUnsupportedItems(List<UnSupportedItem> unsupportedItems) {
        this.unsupportedItems = unsupportedItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunSqlConversionResponse that = (RunSqlConversionResponse) obj;
        return Objects.equals(this.isSupportConversion, that.isSupportConversion)
            && Objects.equals(this.convertedSqlStatement, that.convertedSqlStatement)
            && Objects.equals(this.unsupportedItems, that.unsupportedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSupportConversion, convertedSqlStatement, unsupportedItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSqlConversionResponse {\n");
        sb.append("    isSupportConversion: ").append(toIndentedString(isSupportConversion)).append("\n");
        sb.append("    convertedSqlStatement: ").append(toIndentedString(convertedSqlStatement)).append("\n");
        sb.append("    unsupportedItems: ").append(toIndentedString(unsupportedItems)).append("\n");
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
