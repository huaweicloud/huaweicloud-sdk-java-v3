package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateFields
 */
public class UpdateFields {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set")
    @BsonProperty(value = "set")

    private Document set;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add")
    @BsonProperty(value = "add")

    private Document add;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rmv")
    @BsonProperty(value = "rmv")

    private List<String> rmv = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert")
    @BsonProperty(value = "insert")

    private Document insert;

    public UpdateFields withSet(Document set) {
        this.set = set;
        return this;
    }

    /**
     * 新增或覆盖更新1个或多个字段的值。 > 禁止修改sortkey的字段。
     * @return set
     */
    public Document getSet() {
        return set;
    }

    public void setSet(Document set) {
        this.set = set;
    }

    public UpdateFields withAdd(Document add) {
        this.add = add;
        return this;
    }

    /**
     * 对1个或多个字段做加法运算，并更新为运算后的值。
     * @return add
     */
    public Document getAdd() {
        return add;
    }

    public void setAdd(Document add) {
        this.add = add;
    }

    public UpdateFields withRmv(List<String> rmv) {
        this.rmv = rmv;
        return this;
    }

    public UpdateFields addRmvItem(String rmvItem) {
        if (this.rmv == null) {
            this.rmv = new ArrayList<>();
        }
        this.rmv.add(rmvItem);
        return this;
    }

    public UpdateFields withRmv(Consumer<List<String>> rmvSetter) {
        if (this.rmv == null) {
            this.rmv = new ArrayList<>();
        }
        rmvSetter.accept(this.rmv);
        return this;
    }

    /**
     * 删除1个或多个字段。 - 数组元素为待删除字段名。
     * @return rmv
     */
    public List<String> getRmv() {
        return rmv;
    }

    public void setRmv(List<String> rmv) {
        this.rmv = rmv;
    }

    public UpdateFields withInsert(Document insert) {
        this.insert = insert;
        return this;
    }

    /**
     * 插入元素到数组中 > 非数组返回失败。
     * @return insert
     */
    public Document getInsert() {
        return insert;
    }

    public void setInsert(Document insert) {
        this.insert = insert;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFields that = (UpdateFields) obj;
        return Objects.equals(this.set, that.set) && Objects.equals(this.add, that.add)
            && Objects.equals(this.rmv, that.rmv) && Objects.equals(this.insert, that.insert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set, add, rmv, insert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFields {\n");
        sb.append("    set: ").append(toIndentedString(set)).append("\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
        sb.append("    rmv: ").append(toIndentedString(rmv)).append("\n");
        sb.append("    insert: ").append(toIndentedString(insert)).append("\n");
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
