package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateInstructionLibraryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction_library_id")

    private String instructionLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateInstructionLibraryResponse withInstructionLibraryId(String instructionLibraryId) {
        this.instructionLibraryId = instructionLibraryId;
        return this;
    }

    /**
     * 指令集ID。
     * @return instructionLibraryId
     */
    public String getInstructionLibraryId() {
        return instructionLibraryId;
    }

    public void setInstructionLibraryId(String instructionLibraryId) {
        this.instructionLibraryId = instructionLibraryId;
    }

    public CreateInstructionLibraryResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstructionLibraryResponse that = (CreateInstructionLibraryResponse) obj;
        return Objects.equals(this.instructionLibraryId, that.instructionLibraryId)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionLibraryId, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstructionLibraryResponse {\n");
        sb.append("    instructionLibraryId: ").append(toIndentedString(instructionLibraryId)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
