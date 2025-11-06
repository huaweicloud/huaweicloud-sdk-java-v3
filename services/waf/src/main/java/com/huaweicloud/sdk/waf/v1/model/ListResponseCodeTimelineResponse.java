package com.huaweicloud.sdk.waf.v1.model;

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
public class ListResponseCodeTimelineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<StatisticsTimelineItem> body = null;

    public ListResponseCodeTimelineResponse withBody(List<StatisticsTimelineItem> body) {
        this.body = body;
        return this;
    }

    public ListResponseCodeTimelineResponse addBodyItem(StatisticsTimelineItem bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListResponseCodeTimelineResponse withBody(Consumer<List<StatisticsTimelineItem>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * **参数解释：** 安全统计的时间线，按时间顺序展示统计数据 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return body
     */
    public List<StatisticsTimelineItem> getBody() {
        return body;
    }

    public void setBody(List<StatisticsTimelineItem> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResponseCodeTimelineResponse that = (ListResponseCodeTimelineResponse) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResponseCodeTimelineResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
