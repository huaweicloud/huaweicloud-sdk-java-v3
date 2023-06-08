package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowFuncSnapshotStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public ShowFuncSnapshotStateResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 快照制作状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowFuncSnapshotStateResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 快照制作响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFuncSnapshotStateResponse showFuncSnapshotStateResponse = (ShowFuncSnapshotStateResponse) o;
        return Objects.equals(this.state, showFuncSnapshotStateResponse.state)
            && Objects.equals(this.code, showFuncSnapshotStateResponse.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFuncSnapshotStateResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
