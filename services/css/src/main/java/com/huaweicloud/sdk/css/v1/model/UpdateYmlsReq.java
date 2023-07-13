package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateYmlsReq
 */
public class UpdateYmlsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit")

    private UpdateYmlsReqEdit edit;

    public UpdateYmlsReq withEdit(UpdateYmlsReqEdit edit) {
        this.edit = edit;
        return this;
    }

    public UpdateYmlsReq withEdit(Consumer<UpdateYmlsReqEdit> editSetter) {
        if (this.edit == null) {
            this.edit = new UpdateYmlsReqEdit();
            editSetter.accept(this.edit);
        }

        return this;
    }

    /**
     * Get edit
     * @return edit
     */
    public UpdateYmlsReqEdit getEdit() {
        return edit;
    }

    public void setEdit(UpdateYmlsReqEdit edit) {
        this.edit = edit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateYmlsReq that = (UpdateYmlsReq) obj;
        return Objects.equals(this.edit, that.edit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateYmlsReq {\n");
        sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
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
