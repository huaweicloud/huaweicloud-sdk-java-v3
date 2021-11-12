package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 结构化配置 */
public class DeleteStructTemplateReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "struct_template_id")

    private String structTemplateId;

    public DeleteStructTemplateReqBody withStructTemplateId(String structTemplateId) {
        this.structTemplateId = structTemplateId;
        return this;
    }

    /** 结构化规则ID
     * 
     * @return structTemplateId */
    public String getStructTemplateId() {
        return structTemplateId;
    }

    public void setStructTemplateId(String structTemplateId) {
        this.structTemplateId = structTemplateId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteStructTemplateReqBody deleteStructTemplateReqBody = (DeleteStructTemplateReqBody) o;
        return Objects.equals(this.structTemplateId, deleteStructTemplateReqBody.structTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(structTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteStructTemplateReqBody {\n");
        sb.append("    structTemplateId: ").append(toIndentedString(structTemplateId)).append("\n");
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
