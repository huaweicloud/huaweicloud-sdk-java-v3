package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSpecIssueStayTimesResponseBodyData
 */
public class ListSpecIssueStayTimesResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stay_time")

    private Long stayTime;

    public ListSpecIssueStayTimesResponseBodyData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工作项id字符串
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSpecIssueStayTimesResponseBodyData withStayTime(Long stayTime) {
        this.stayTime = stayTime;
        return this;
    }

    /**
     * 停留时间（单位：秒）
     * @return stayTime
     */
    public Long getStayTime() {
        return stayTime;
    }

    public void setStayTime(Long stayTime) {
        this.stayTime = stayTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSpecIssueStayTimesResponseBodyData that = (ListSpecIssueStayTimesResponseBodyData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.stayTime, that.stayTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stayTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecIssueStayTimesResponseBodyData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    stayTime: ").append(toIndentedString(stayTime)).append("\n");
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
