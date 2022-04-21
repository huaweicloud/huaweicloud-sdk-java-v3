package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作配置信息。
 */
public class UpdateYmlsReqEdit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify")

    private UpdateYmlsReqEditModify modify;

    public UpdateYmlsReqEdit withModify(UpdateYmlsReqEditModify modify) {
        this.modify = modify;
        return this;
    }

    public UpdateYmlsReqEdit withModify(Consumer<UpdateYmlsReqEditModify> modifySetter) {
        if (this.modify == null) {
            this.modify = new UpdateYmlsReqEditModify();
            modifySetter.accept(this.modify);
        }

        return this;
    }

    /**
     * Get modify
     * @return modify
     */
    public UpdateYmlsReqEditModify getModify() {
        return modify;
    }

    public void setModify(UpdateYmlsReqEditModify modify) {
        this.modify = modify;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateYmlsReqEdit updateYmlsReqEdit = (UpdateYmlsReqEdit) o;
        return Objects.equals(this.modify, updateYmlsReqEdit.modify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateYmlsReqEdit {\n");
        sb.append("    modify: ").append(toIndentedString(modify)).append("\n");
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
