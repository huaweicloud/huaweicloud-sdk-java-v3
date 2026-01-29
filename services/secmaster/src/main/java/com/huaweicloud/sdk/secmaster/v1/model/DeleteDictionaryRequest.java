package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除字典请求体
 */
public class DeleteDictionaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_list")

    private List<DictionaryDelete> dictList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    public DeleteDictionaryRequest withDictList(List<DictionaryDelete> dictList) {
        this.dictList = dictList;
        return this;
    }

    public DeleteDictionaryRequest addDictListItem(DictionaryDelete dictListItem) {
        if (this.dictList == null) {
            this.dictList = new ArrayList<>();
        }
        this.dictList.add(dictListItem);
        return this;
    }

    public DeleteDictionaryRequest withDictList(Consumer<List<DictionaryDelete>> dictListSetter) {
        if (this.dictList == null) {
            this.dictList = new ArrayList<>();
        }
        dictListSetter.accept(this.dictList);
        return this;
    }

    /**
     * 字典列表
     * @return dictList
     */
    public List<DictionaryDelete> getDictList() {
        return dictList;
    }

    public void setDictList(List<DictionaryDelete> dictList) {
        this.dictList = dictList;
    }

    public DeleteDictionaryRequest withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否删除内置字典，默认不对外开放删除内置字典工具
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDictionaryRequest that = (DeleteDictionaryRequest) obj;
        return Objects.equals(this.dictList, that.dictList) && Objects.equals(this.isBuiltIn, that.isBuiltIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictList, isBuiltIn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDictionaryRequest {\n");
        sb.append("    dictList: ").append(toIndentedString(dictList)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
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
