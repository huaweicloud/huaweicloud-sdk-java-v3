package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 解绑GEIP请求体
 */
public class CreateUnbindingGeipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eips")

    private List<UnbindingGeipBody> globalEips = null;

    public CreateUnbindingGeipRequestBody withGlobalEips(List<UnbindingGeipBody> globalEips) {
        this.globalEips = globalEips;
        return this;
    }

    public CreateUnbindingGeipRequestBody addGlobalEipsItem(UnbindingGeipBody globalEipsItem) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        this.globalEips.add(globalEipsItem);
        return this;
    }

    public CreateUnbindingGeipRequestBody withGlobalEips(Consumer<List<UnbindingGeipBody>> globalEipsSetter) {
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
    public List<UnbindingGeipBody> getGlobalEips() {
        return globalEips;
    }

    public void setGlobalEips(List<UnbindingGeipBody> globalEips) {
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
        CreateUnbindingGeipRequestBody that = (CreateUnbindingGeipRequestBody) obj;
        return Objects.equals(this.globalEips, that.globalEips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUnbindingGeipRequestBody {\n");
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
