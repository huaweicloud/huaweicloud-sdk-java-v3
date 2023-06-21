package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启用禁用模板请求体。
 */
public class UpdatePersonalTemplateStateDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_state")

    private Integer tplState;

    public UpdatePersonalTemplateStateDataRequest withTplState(Integer tplState) {
        this.tplState = tplState;
        return this;
    }

    /**
     * 状态。 - 0：禁用 - 1：启用 
     * @return tplState
     */
    public Integer getTplState() {
        return tplState;
    }

    public void setTplState(Integer tplState) {
        this.tplState = tplState;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePersonalTemplateStateDataRequest updatePersonalTemplateStateDataRequest =
            (UpdatePersonalTemplateStateDataRequest) o;
        return Objects.equals(this.tplState, updatePersonalTemplateStateDataRequest.tplState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePersonalTemplateStateDataRequest {\n");
        sb.append("    tplState: ").append(toIndentedString(tplState)).append("\n");
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
