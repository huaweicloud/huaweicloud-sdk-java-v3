package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新函数最大实例数请求体
 */
public class UpdateFunctionMaxInstanceConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_instance_num")

    private Integer maxInstanceNum;

    public UpdateFunctionMaxInstanceConfigRequestBody withMaxInstanceNum(Integer maxInstanceNum) {
        this.maxInstanceNum = maxInstanceNum;
        return this;
    }

    /**
     * 最大实例数；-1代表该函数实例数无限制，0代表该函数被禁用
     * @return maxInstanceNum
     */
    public Integer getMaxInstanceNum() {
        return maxInstanceNum;
    }

    public void setMaxInstanceNum(Integer maxInstanceNum) {
        this.maxInstanceNum = maxInstanceNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFunctionMaxInstanceConfigRequestBody updateFunctionMaxInstanceConfigRequestBody =
            (UpdateFunctionMaxInstanceConfigRequestBody) o;
        return Objects.equals(this.maxInstanceNum, updateFunctionMaxInstanceConfigRequestBody.maxInstanceNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxInstanceNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionMaxInstanceConfigRequestBody {\n");
        sb.append("    maxInstanceNum: ").append(toIndentedString(maxInstanceNum)).append("\n");
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
