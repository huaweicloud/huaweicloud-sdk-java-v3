package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSqlPatchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_name")

    private String patchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint")

    private String hint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_status")

    private String patchStatus;

    public ShowSqlPatchResponse withPatchName(String patchName) {
        this.patchName = patchName;
        return this;
    }

    /**
     * **参数解释**: PATCH名称。 **取值范围**: 不涉及。
     * @return patchName
     */
    public String getPatchName() {
        return patchName;
    }

    public void setPatchName(String patchName) {
        this.patchName = patchName;
    }

    public ShowSqlPatchResponse withHint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * **参数解释**: PATCH内容（Hint文本）。对于abort 类型的SQL PATCH此字段为空。 **取值范围**: 不涉及。
     * @return hint
     */
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public ShowSqlPatchResponse withPatchStatus(String patchStatus) {
        this.patchStatus = patchStatus;
        return this;
    }

    /**
     * **参数解释**: PATCH状态。 **取值范围**: - enabled：表示SQL PATCH生效。 - disabled：表示SQL PATCH失效。
     * @return patchStatus
     */
    public String getPatchStatus() {
        return patchStatus;
    }

    public void setPatchStatus(String patchStatus) {
        this.patchStatus = patchStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlPatchResponse that = (ShowSqlPatchResponse) obj;
        return Objects.equals(this.patchName, that.patchName) && Objects.equals(this.hint, that.hint)
            && Objects.equals(this.patchStatus, that.patchStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patchName, hint, patchStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlPatchResponse {\n");
        sb.append("    patchName: ").append(toIndentedString(patchName)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
        sb.append("    patchStatus: ").append(toIndentedString(patchStatus)).append("\n");
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
