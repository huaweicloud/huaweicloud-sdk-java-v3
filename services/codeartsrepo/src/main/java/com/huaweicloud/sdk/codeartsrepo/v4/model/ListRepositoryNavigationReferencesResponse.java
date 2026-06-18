package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRepositoryNavigationReferencesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defs")

    private List<DefEntryDto> defs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refs")

    private List<RefEntryDto> refs = null;

    public ListRepositoryNavigationReferencesResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释：** 结果标识。 **约束限制：** 不涉及。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ListRepositoryNavigationReferencesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 结果消息。 **约束限制：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListRepositoryNavigationReferencesResponse withDefs(List<DefEntryDto> defs) {
        this.defs = defs;
        return this;
    }

    public ListRepositoryNavigationReferencesResponse addDefsItem(DefEntryDto defsItem) {
        if (this.defs == null) {
            this.defs = new ArrayList<>();
        }
        this.defs.add(defsItem);
        return this;
    }

    public ListRepositoryNavigationReferencesResponse withDefs(Consumer<List<DefEntryDto>> defsSetter) {
        if (this.defs == null) {
            this.defs = new ArrayList<>();
        }
        defsSetter.accept(this.defs);
        return this;
    }

    /**
     * **参数解释：** def信息。 **约束限制：** 不涉及。
     * @return defs
     */
    public List<DefEntryDto> getDefs() {
        return defs;
    }

    public void setDefs(List<DefEntryDto> defs) {
        this.defs = defs;
    }

    public ListRepositoryNavigationReferencesResponse withRefs(List<RefEntryDto> refs) {
        this.refs = refs;
        return this;
    }

    public ListRepositoryNavigationReferencesResponse addRefsItem(RefEntryDto refsItem) {
        if (this.refs == null) {
            this.refs = new ArrayList<>();
        }
        this.refs.add(refsItem);
        return this;
    }

    public ListRepositoryNavigationReferencesResponse withRefs(Consumer<List<RefEntryDto>> refsSetter) {
        if (this.refs == null) {
            this.refs = new ArrayList<>();
        }
        refsSetter.accept(this.refs);
        return this;
    }

    /**
     * **参数解释：** 索引信息列表。 **约束限制：** 不涉及。
     * @return refs
     */
    public List<RefEntryDto> getRefs() {
        return refs;
    }

    public void setRefs(List<RefEntryDto> refs) {
        this.refs = refs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryNavigationReferencesResponse that = (ListRepositoryNavigationReferencesResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.message, that.message)
            && Objects.equals(this.defs, that.defs) && Objects.equals(this.refs, that.refs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, message, defs, refs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryNavigationReferencesResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    defs: ").append(toIndentedString(defs)).append("\n");
        sb.append("    refs: ").append(toIndentedString(refs)).append("\n");
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
