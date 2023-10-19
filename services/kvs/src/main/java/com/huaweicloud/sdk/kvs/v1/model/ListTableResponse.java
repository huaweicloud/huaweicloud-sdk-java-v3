package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTableResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CursorName")
    @BsonProperty(value = "CursorName")

    private String cursorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableNameList")
    @BsonProperty(value = "TableNameList")

    private List<String> tableNameList = null;

    public ListTableResponse withCursorName(String cursorName) {
        this.cursorName = cursorName;
        return this;
    }

    /**
     * Get cursorName
     * @return cursorName
     */
    public String getCursorName() {
        return cursorName;
    }

    public void setCursorName(String cursorName) {
        this.cursorName = cursorName;
    }

    public ListTableResponse withTableNameList(List<String> tableNameList) {
        this.tableNameList = tableNameList;
        return this;
    }

    public ListTableResponse addTableNameListItem(String tableNameListItem) {
        if (this.tableNameList == null) {
            this.tableNameList = new ArrayList<>();
        }
        this.tableNameList.add(tableNameListItem);
        return this;
    }

    public ListTableResponse withTableNameList(Consumer<List<String>> tableNameListSetter) {
        if (this.tableNameList == null) {
            this.tableNameList = new ArrayList<>();
        }
        tableNameListSetter.accept(this.tableNameList);
        return this;
    }

    /**
     * Get tableNameList
     * @return tableNameList
     */
    public List<String> getTableNameList() {
        return tableNameList;
    }

    public void setTableNameList(List<String> tableNameList) {
        this.tableNameList = tableNameList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableResponse that = (ListTableResponse) obj;
        return Objects.equals(this.cursorName, that.cursorName)
            && Objects.equals(this.tableNameList, that.tableNameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursorName, tableNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableResponse {\n");
        sb.append("    cursorName: ").append(toIndentedString(cursorName)).append("\n");
        sb.append("    tableNameList: ").append(toIndentedString(tableNameList)).append("\n");
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

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(ListTableResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
