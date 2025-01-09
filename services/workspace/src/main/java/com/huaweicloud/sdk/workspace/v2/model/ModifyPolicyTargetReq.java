package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyPolicyTargetReq
 */
public class ModifyPolicyTargetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add")

    private List<Target> add = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private List<Target> delete = null;

    public ModifyPolicyTargetReq withAdd(List<Target> add) {
        this.add = add;
        return this;
    }

    public ModifyPolicyTargetReq addAddItem(Target addItem) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        this.add.add(addItem);
        return this;
    }

    public ModifyPolicyTargetReq withAdd(Consumer<List<Target>> addSetter) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        addSetter.accept(this.add);
        return this;
    }

    /**
     * 添加应用。
     * @return add
     */
    public List<Target> getAdd() {
        return add;
    }

    public void setAdd(List<Target> add) {
        this.add = add;
    }

    public ModifyPolicyTargetReq withDelete(List<Target> delete) {
        this.delete = delete;
        return this;
    }

    public ModifyPolicyTargetReq addDeleteItem(Target deleteItem) {
        if (this.delete == null) {
            this.delete = new ArrayList<>();
        }
        this.delete.add(deleteItem);
        return this;
    }

    public ModifyPolicyTargetReq withDelete(Consumer<List<Target>> deleteSetter) {
        if (this.delete == null) {
            this.delete = new ArrayList<>();
        }
        deleteSetter.accept(this.delete);
        return this;
    }

    /**
     * 删除应用。
     * @return delete
     */
    public List<Target> getDelete() {
        return delete;
    }

    public void setDelete(List<Target> delete) {
        this.delete = delete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyPolicyTargetReq that = (ModifyPolicyTargetReq) obj;
        return Objects.equals(this.add, that.add) && Objects.equals(this.delete, that.delete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(add, delete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPolicyTargetReq {\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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
