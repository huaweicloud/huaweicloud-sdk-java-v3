package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TransactGetKvRequestBody
 */
public class TransactGetKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_opers")
    @BsonProperty(value = "kv_opers")

    private List<TransGetKvOfTable> kvOpers = null;

    public TransactGetKvRequestBody withKvOpers(List<TransGetKvOfTable> kvOpers) {
        this.kvOpers = kvOpers;
        return this;
    }

    public TransactGetKvRequestBody addKvOpersItem(TransGetKvOfTable kvOpersItem) {
        if (this.kvOpers == null) {
            this.kvOpers = new ArrayList<>();
        }
        this.kvOpers.add(kvOpersItem);
        return this;
    }

    public TransactGetKvRequestBody withKvOpers(Consumer<List<TransGetKvOfTable>> kvOpersSetter) {
        if (this.kvOpers == null) {
            this.kvOpers = new ArrayList<>();
        }
        kvOpersSetter.accept(this.kvOpers);
        return this;
    }

    /**
     * 行操作数组，行操作类型可以是多个文档的查询kv操作
     * @return kvOpers
     */
    public List<TransGetKvOfTable> getKvOpers() {
        return kvOpers;
    }

    public void setKvOpers(List<TransGetKvOfTable> kvOpers) {
        this.kvOpers = kvOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransactGetKvRequestBody that = (TransactGetKvRequestBody) obj;
        return Objects.equals(this.kvOpers, that.kvOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kvOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactGetKvRequestBody {\n");
        sb.append("    kvOpers: ").append(toIndentedString(kvOpers)).append("\n");
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
