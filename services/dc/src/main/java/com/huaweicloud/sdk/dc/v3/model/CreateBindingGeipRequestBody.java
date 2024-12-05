package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateBindingGeipRequestBody
 */
public class CreateBindingGeipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_id")

    private String gcbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eips")

    private List<BindingGeipBody> globalEips = null;

    public CreateBindingGeipRequestBody withGcbId(String gcbId) {
        this.gcbId = gcbId;
        return this;
    }

    /**
     * 带宽包id
     * @return gcbId
     */
    public String getGcbId() {
        return gcbId;
    }

    public void setGcbId(String gcbId) {
        this.gcbId = gcbId;
    }

    public CreateBindingGeipRequestBody withGlobalEips(List<BindingGeipBody> globalEips) {
        this.globalEips = globalEips;
        return this;
    }

    public CreateBindingGeipRequestBody addGlobalEipsItem(BindingGeipBody globalEipsItem) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        this.globalEips.add(globalEipsItem);
        return this;
    }

    public CreateBindingGeipRequestBody withGlobalEips(Consumer<List<BindingGeipBody>> globalEipsSetter) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        globalEipsSetter.accept(this.globalEips);
        return this;
    }

    /**
     * Get globalEips
     * @return globalEips
     */
    public List<BindingGeipBody> getGlobalEips() {
        return globalEips;
    }

    public void setGlobalEips(List<BindingGeipBody> globalEips) {
        this.globalEips = globalEips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBindingGeipRequestBody that = (CreateBindingGeipRequestBody) obj;
        return Objects.equals(this.gcbId, that.gcbId) && Objects.equals(this.globalEips, that.globalEips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gcbId, globalEips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBindingGeipRequestBody {\n");
        sb.append("    gcbId: ").append(toIndentedString(gcbId)).append("\n");
        sb.append("    globalEips: ").append(toIndentedString(globalEips)).append("\n");
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
