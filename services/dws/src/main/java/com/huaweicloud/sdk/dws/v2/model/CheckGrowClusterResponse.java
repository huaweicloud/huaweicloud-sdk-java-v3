package com.huaweicloud.sdk.dws.v2.model;

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
public class CheckGrowClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<GrowCheckResult> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private NoteInfo note;

    public CheckGrowClusterResponse withData(List<GrowCheckResult> data) {
        this.data = data;
        return this;
    }

    public CheckGrowClusterResponse addDataItem(GrowCheckResult dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public CheckGrowClusterResponse withData(Consumer<List<GrowCheckResult>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**： 扩容前检查信息。 **取值范围**： 不涉及。
     * @return data
     */
    public List<GrowCheckResult> getData() {
        return data;
    }

    public void setData(List<GrowCheckResult> data) {
        this.data = data;
    }

    public CheckGrowClusterResponse withNote(NoteInfo note) {
        this.note = note;
        return this;
    }

    public CheckGrowClusterResponse withNote(Consumer<NoteInfo> noteSetter) {
        if (this.note == null) {
            this.note = new NoteInfo();
            noteSetter.accept(this.note);
        }

        return this;
    }

    /**
     * Get note
     * @return note
     */
    public NoteInfo getNote() {
        return note;
    }

    public void setNote(NoteInfo note) {
        this.note = note;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckGrowClusterResponse that = (CheckGrowClusterResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, note);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckGrowClusterResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
