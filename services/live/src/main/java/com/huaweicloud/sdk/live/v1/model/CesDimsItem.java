package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CES查询维度信息
 */
public class CesDimsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<String> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private CesDimsItemDisplay display;

    public CesDimsItem withParams(List<String> params) {
        this.params = params;
        return this;
    }

    public CesDimsItem addParamsItem(String paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public CesDimsItem withParams(Consumer<List<String>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 查询参数
     * @return params
     */
    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public CesDimsItem withDisplay(CesDimsItemDisplay display) {
        this.display = display;
        return this;
    }

    public CesDimsItem withDisplay(Consumer<CesDimsItemDisplay> displaySetter) {
        if (this.display == null) {
            this.display = new CesDimsItemDisplay();
            displaySetter.accept(this.display);
        }

        return this;
    }

    /**
     * Get display
     * @return display
     */
    public CesDimsItemDisplay getDisplay() {
        return display;
    }

    public void setDisplay(CesDimsItemDisplay display) {
        this.display = display;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CesDimsItem that = (CesDimsItem) obj;
        return Objects.equals(this.params, that.params) && Objects.equals(this.display, that.display);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params, display);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CesDimsItem {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
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
