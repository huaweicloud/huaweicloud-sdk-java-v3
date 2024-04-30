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
    @JsonProperty(value = "cursor_name")
    @BsonProperty(value = "cursor_name")

    private String cursorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_names")
    @BsonProperty(value = "table_names")

    private List<String> tableNames = null;

    public ListTableResponse withCursorName(String cursorName) {
        this.cursorName = cursorName;
        return this;
    }

    /**
     * 本次响应后的游标位置，下次请求时携带，如果为空，表示后面无更多 - 长度：[3, 63] - 取值字符限制：[a-z0-9_-]+ > 如果为空，表示后面无更多。
     * @return cursorName
     */
    public String getCursorName() {
        return cursorName;
    }

    public void setCursorName(String cursorName) {
        this.cursorName = cursorName;
    }

    public ListTableResponse withTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    public ListTableResponse addTableNamesItem(String tableNamesItem) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        this.tableNames.add(tableNamesItem);
        return this;
    }

    public ListTableResponse withTableNames(Consumer<List<String>> tableNamesSetter) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        tableNamesSetter.accept(this.tableNames);
        return this;
    }

    /**
     * 返回的表名列表。 - 长度：最大100
     * @return tableNames
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
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
        return Objects.equals(this.cursorName, that.cursorName) && Objects.equals(this.tableNames, that.tableNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursorName, tableNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableResponse {\n");
        sb.append("    cursorName: ").append(toIndentedString(cursorName)).append("\n");
        sb.append("    tableNames: ").append(toIndentedString(tableNames)).append("\n");
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
