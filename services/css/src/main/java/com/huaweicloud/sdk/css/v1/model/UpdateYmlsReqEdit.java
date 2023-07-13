package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置文件信息。
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateYmlsReqEdit that = (UpdateYmlsReqEdit) obj;
        return Objects.equals(this.modify, that.modify);
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
