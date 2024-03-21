package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerFormResult
 */
public class SmartDocumentRecognizerFormResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "form_count")

    private Integer formCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "form_list")

    private List<SmartDocumentRecognizerTableBlock> formList = null;

    public SmartDocumentRecognizerFormResult withFormCount(Integer formCount) {
        this.formCount = formCount;
        return this;
    }

    /**
     * 模型识别到的有线表单数量。 
     * @return formCount
     */
    public Integer getFormCount() {
        return formCount;
    }

    public void setFormCount(Integer formCount) {
        this.formCount = formCount;
    }

    public SmartDocumentRecognizerFormResult withFormList(List<SmartDocumentRecognizerTableBlock> formList) {
        this.formList = formList;
        return this;
    }

    public SmartDocumentRecognizerFormResult addFormListItem(SmartDocumentRecognizerTableBlock formListItem) {
        if (this.formList == null) {
            this.formList = new ArrayList<>();
        }
        this.formList.add(formListItem);
        return this;
    }

    public SmartDocumentRecognizerFormResult withFormList(
        Consumer<List<SmartDocumentRecognizerTableBlock>> formListSetter) {
        if (this.formList == null) {
            this.formList = new ArrayList<>();
        }
        formListSetter.accept(this.formList);
        return this;
    }

    /**
     * 有线表单识别结果列表。 
     * @return formList
     */
    public List<SmartDocumentRecognizerTableBlock> getFormList() {
        return formList;
    }

    public void setFormList(List<SmartDocumentRecognizerTableBlock> formList) {
        this.formList = formList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerFormResult that = (SmartDocumentRecognizerFormResult) obj;
        return Objects.equals(this.formCount, that.formCount) && Objects.equals(this.formList, that.formList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formCount, formList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerFormResult {\n");
        sb.append("    formCount: ").append(toIndentedString(formCount)).append("\n");
        sb.append("    formList: ").append(toIndentedString(formList)).append("\n");
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
