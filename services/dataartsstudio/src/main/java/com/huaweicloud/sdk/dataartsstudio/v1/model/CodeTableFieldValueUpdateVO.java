package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 码表属性值修改内容
 */
public class CodeTableFieldValueUpdateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_add")

    private List<CodeTableFieldVO> toAdd = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_modify")

    private List<CodeTableFieldVO> toModify = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_remove")

    private List<CodeTableFieldVO> toRemove = null;

    public CodeTableFieldValueUpdateVO withToAdd(List<CodeTableFieldVO> toAdd) {
        this.toAdd = toAdd;
        return this;
    }

    public CodeTableFieldValueUpdateVO addToAddItem(CodeTableFieldVO toAddItem) {
        if (this.toAdd == null) {
            this.toAdd = new ArrayList<>();
        }
        this.toAdd.add(toAddItem);
        return this;
    }

    public CodeTableFieldValueUpdateVO withToAdd(Consumer<List<CodeTableFieldVO>> toAddSetter) {
        if (this.toAdd == null) {
            this.toAdd = new ArrayList<>();
        }
        toAddSetter.accept(this.toAdd);
        return this;
    }

    /**
     * 新增码表属性、属性值列表
     * @return toAdd
     */
    public List<CodeTableFieldVO> getToAdd() {
        return toAdd;
    }

    public void setToAdd(List<CodeTableFieldVO> toAdd) {
        this.toAdd = toAdd;
    }

    public CodeTableFieldValueUpdateVO withToModify(List<CodeTableFieldVO> toModify) {
        this.toModify = toModify;
        return this;
    }

    public CodeTableFieldValueUpdateVO addToModifyItem(CodeTableFieldVO toModifyItem) {
        if (this.toModify == null) {
            this.toModify = new ArrayList<>();
        }
        this.toModify.add(toModifyItem);
        return this;
    }

    public CodeTableFieldValueUpdateVO withToModify(Consumer<List<CodeTableFieldVO>> toModifySetter) {
        if (this.toModify == null) {
            this.toModify = new ArrayList<>();
        }
        toModifySetter.accept(this.toModify);
        return this;
    }

    /**
     * 编辑码表属性值列表
     * @return toModify
     */
    public List<CodeTableFieldVO> getToModify() {
        return toModify;
    }

    public void setToModify(List<CodeTableFieldVO> toModify) {
        this.toModify = toModify;
    }

    public CodeTableFieldValueUpdateVO withToRemove(List<CodeTableFieldVO> toRemove) {
        this.toRemove = toRemove;
        return this;
    }

    public CodeTableFieldValueUpdateVO addToRemoveItem(CodeTableFieldVO toRemoveItem) {
        if (this.toRemove == null) {
            this.toRemove = new ArrayList<>();
        }
        this.toRemove.add(toRemoveItem);
        return this;
    }

    public CodeTableFieldValueUpdateVO withToRemove(Consumer<List<CodeTableFieldVO>> toRemoveSetter) {
        if (this.toRemove == null) {
            this.toRemove = new ArrayList<>();
        }
        toRemoveSetter.accept(this.toRemove);
        return this;
    }

    /**
     * 删除码表属性id列表
     * @return toRemove
     */
    public List<CodeTableFieldVO> getToRemove() {
        return toRemove;
    }

    public void setToRemove(List<CodeTableFieldVO> toRemove) {
        this.toRemove = toRemove;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeTableFieldValueUpdateVO that = (CodeTableFieldValueUpdateVO) obj;
        return Objects.equals(this.toAdd, that.toAdd) && Objects.equals(this.toModify, that.toModify)
            && Objects.equals(this.toRemove, that.toRemove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toAdd, toModify, toRemove);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeTableFieldValueUpdateVO {\n");
        sb.append("    toAdd: ").append(toIndentedString(toAdd)).append("\n");
        sb.append("    toModify: ").append(toIndentedString(toModify)).append("\n");
        sb.append("    toRemove: ").append(toIndentedString(toRemove)).append("\n");
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
