package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ExtraInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private String item;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private List<String> note = null;

    public ExtraInfoList withItem(String item) {
        this.item = item;
        return this;
    }

    /** 表示key值，可能是qq, wechat, alipay及bank等。
     * 
     * @return item */
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public ExtraInfoList withValue(String value) {
        this.value = value;
        return this;
    }

    /** 表示value值，对应qq, wechat, alipay及bank等的账号。
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ExtraInfoList withNote(List<String> note) {
        this.note = note;
        return this;
    }

    public ExtraInfoList addNoteItem(String noteItem) {
        if (this.note == null) {
            this.note = new ArrayList<>();
        }
        this.note.add(noteItem);
        return this;
    }

    public ExtraInfoList withNote(Consumer<List<String>> noteSetter) {
        if (this.note == null) {
            this.note = new ArrayList<>();
        }
        noteSetter.accept(this.note);
        return this;
    }

    /** 对应item关联的额外信息，为bank时第一个默认为户名，第二个为开户行，为alipay时第一个默认为账号名。
     * 
     * @return note */
    public List<String> getNote() {
        return note;
    }

    public void setNote(List<String> note) {
        this.note = note;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtraInfoList extraInfoList = (ExtraInfoList) o;
        return Objects.equals(this.item, extraInfoList.item) && Objects.equals(this.value, extraInfoList.value)
            && Objects.equals(this.note, extraInfoList.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, value, note);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraInfoList {\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
