package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建字典请求体
 */
public class CreateDictionaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_list")

    private List<DictionaryCreate> dictList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    public CreateDictionaryRequest withDictList(List<DictionaryCreate> dictList) {
        this.dictList = dictList;
        return this;
    }

    public CreateDictionaryRequest addDictListItem(DictionaryCreate dictListItem) {
        if (this.dictList == null) {
            this.dictList = new ArrayList<>();
        }
        this.dictList.add(dictListItem);
        return this;
    }

    public CreateDictionaryRequest withDictList(Consumer<List<DictionaryCreate>> dictListSetter) {
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
    public List<DictionaryCreate> getDictList() {
        return dictList;
    }

    public void setDictList(List<DictionaryCreate> dictList) {
        this.dictList = dictList;
    }

    public CreateDictionaryRequest withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否创建内置字典
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
        CreateDictionaryRequest that = (CreateDictionaryRequest) obj;
        return Objects.equals(this.dictList, that.dictList) && Objects.equals(this.isBuiltIn, that.isBuiltIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictList, isBuiltIn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDictionaryRequest {\n");
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
