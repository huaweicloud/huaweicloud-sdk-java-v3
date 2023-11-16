package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ListFunctionTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_templates")

    private List<ShowFunctionTemplateResponseBody> funcTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Integer nextMarker;

    public ListFunctionTemplateResponse withFuncTemplates(List<ShowFunctionTemplateResponseBody> funcTemplates) {
        this.funcTemplates = funcTemplates;
        return this;
    }

    public ListFunctionTemplateResponse addFuncTemplatesItem(ShowFunctionTemplateResponseBody funcTemplatesItem) {
        if (this.funcTemplates == null) {
            this.funcTemplates = new ArrayList<>();
        }
        this.funcTemplates.add(funcTemplatesItem);
        return this;
    }

    public ListFunctionTemplateResponse withFuncTemplates(
        Consumer<List<ShowFunctionTemplateResponseBody>> funcTemplatesSetter) {
        if (this.funcTemplates == null) {
            this.funcTemplates = new ArrayList<>();
        }
        funcTemplatesSetter.accept(this.funcTemplates);
        return this;
    }

    /**
     * 函数模板列表
     * @return funcTemplates
     */
    public List<ShowFunctionTemplateResponseBody> getFuncTemplates() {
        return funcTemplates;
    }

    public void setFuncTemplates(List<ShowFunctionTemplateResponseBody> funcTemplates) {
        this.funcTemplates = funcTemplates;
    }

    public ListFunctionTemplateResponse withNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 函数下次记录读取位置。
     * @return nextMarker
     */
    public Integer getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFunctionTemplateResponse that = (ListFunctionTemplateResponse) obj;
        return Objects.equals(this.funcTemplates, that.funcTemplates)
            && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcTemplates, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionTemplateResponse {\n");
        sb.append("    funcTemplates: ").append(toIndentedString(funcTemplates)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
