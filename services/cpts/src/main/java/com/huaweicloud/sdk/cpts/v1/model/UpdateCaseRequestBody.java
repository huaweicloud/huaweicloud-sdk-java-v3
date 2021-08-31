package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** UpdateCaseRequestBody */
public class UpdateCaseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<UpdateCaseRequestBodyContents> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "for_loop_params")

    private List<Object> forLoopParams = null;

    public UpdateCaseRequestBody withContents(List<UpdateCaseRequestBodyContents> contents) {
        this.contents = contents;
        return this;
    }

    public UpdateCaseRequestBody addContentsItem(UpdateCaseRequestBodyContents contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public UpdateCaseRequestBody withContents(Consumer<List<UpdateCaseRequestBodyContents>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /** contents
     * 
     * @return contents */
    public List<UpdateCaseRequestBodyContents> getContents() {
        return contents;
    }

    public void setContents(List<UpdateCaseRequestBodyContents> contents) {
        this.contents = contents;
    }

    public UpdateCaseRequestBody withForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
        return this;
    }

    public UpdateCaseRequestBody addForLoopParamsItem(Object forLoopParamsItem) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        this.forLoopParams.add(forLoopParamsItem);
        return this;
    }

    public UpdateCaseRequestBody withForLoopParams(Consumer<List<Object>> forLoopParamsSetter) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        forLoopParamsSetter.accept(this.forLoopParams);
        return this;
    }

    /** for_loop_params
     * 
     * @return forLoopParams */
    public List<Object> getForLoopParams() {
        return forLoopParams;
    }

    public void setForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCaseRequestBody updateCaseRequestBody = (UpdateCaseRequestBody) o;
        return Objects.equals(this.contents, updateCaseRequestBody.contents)
            && Objects.equals(this.forLoopParams, updateCaseRequestBody.forLoopParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents, forLoopParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCaseRequestBody {\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    forLoopParams: ").append(toIndentedString(forLoopParams)).append("\n");
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
