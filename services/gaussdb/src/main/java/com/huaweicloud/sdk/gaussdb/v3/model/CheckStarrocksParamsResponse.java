package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class CheckStarrocksParamsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_starrocks_params_responce")

    private List<ParamGroupParameterDifferences> checkStarrocksParamsResponce = null;

    public CheckStarrocksParamsResponse withCheckStarrocksParamsResponce(
        List<ParamGroupParameterDifferences> checkStarrocksParamsResponce) {
        this.checkStarrocksParamsResponce = checkStarrocksParamsResponce;
        return this;
    }

    public CheckStarrocksParamsResponse addCheckStarrocksParamsResponceItem(
        ParamGroupParameterDifferences checkStarrocksParamsResponceItem) {
        if (this.checkStarrocksParamsResponce == null) {
            this.checkStarrocksParamsResponce = new ArrayList<>();
        }
        this.checkStarrocksParamsResponce.add(checkStarrocksParamsResponceItem);
        return this;
    }

    public CheckStarrocksParamsResponse withCheckStarrocksParamsResponce(
        Consumer<List<ParamGroupParameterDifferences>> checkStarrocksParamsResponceSetter) {
        if (this.checkStarrocksParamsResponce == null) {
            this.checkStarrocksParamsResponce = new ArrayList<>();
        }
        checkStarrocksParamsResponceSetter.accept(this.checkStarrocksParamsResponce);
        return this;
    }

    /**
     * 参数之间区别的集合。
     * @return checkStarrocksParamsResponce
     */
    public List<ParamGroupParameterDifferences> getCheckStarrocksParamsResponce() {
        return checkStarrocksParamsResponce;
    }

    public void setCheckStarrocksParamsResponce(List<ParamGroupParameterDifferences> checkStarrocksParamsResponce) {
        this.checkStarrocksParamsResponce = checkStarrocksParamsResponce;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckStarrocksParamsResponse that = (CheckStarrocksParamsResponse) obj;
        return Objects.equals(this.checkStarrocksParamsResponce, that.checkStarrocksParamsResponce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkStarrocksParamsResponce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckStarrocksParamsResponse {\n");
        sb.append("    checkStarrocksParamsResponce: ")
            .append(toIndentedString(checkStarrocksParamsResponce))
            .append("\n");
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
