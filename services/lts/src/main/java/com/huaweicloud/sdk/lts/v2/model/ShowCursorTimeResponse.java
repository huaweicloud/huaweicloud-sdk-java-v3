package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCursorTimeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cursor_time")

    private Long cursorTime;

    public ShowCursorTimeResponse withCursorTime(Long cursorTime) {
        this.cursorTime = cursorTime;
        return this;
    }

    /**
     * 游标时间值
     * @return cursorTime
     */
    public Long getCursorTime() {
        return cursorTime;
    }

    public void setCursorTime(Long cursorTime) {
        this.cursorTime = cursorTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCursorTimeResponse that = (ShowCursorTimeResponse) obj;
        return Objects.equals(this.cursorTime, that.cursorTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursorTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCursorTimeResponse {\n");
        sb.append("    cursorTime: ").append(toIndentedString(cursorTime)).append("\n");
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
