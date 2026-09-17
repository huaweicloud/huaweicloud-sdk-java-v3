package com.huaweicloud.sdk.dws.v2.model;

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
public class ListActionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_info")

    private List<ActionDomainInfoDetail> actionInfo = null;

    public ListActionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总条数。 **取值范围**： 大于0。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListActionsResponse withActionInfo(List<ActionDomainInfoDetail> actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public ListActionsResponse addActionInfoItem(ActionDomainInfoDetail actionInfoItem) {
        if (this.actionInfo == null) {
            this.actionInfo = new ArrayList<>();
        }
        this.actionInfo.add(actionInfoItem);
        return this;
    }

    public ListActionsResponse withActionInfo(Consumer<List<ActionDomainInfoDetail>> actionInfoSetter) {
        if (this.actionInfo == null) {
            this.actionInfo = new ArrayList<>();
        }
        actionInfoSetter.accept(this.actionInfo);
        return this;
    }

    /**
     * **参数解释**： 白名单详情。 **取值范围**： 大于0。
     * @return actionInfo
     */
    public List<ActionDomainInfoDetail> getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(List<ActionDomainInfoDetail> actionInfo) {
        this.actionInfo = actionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListActionsResponse that = (ListActionsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.actionInfo, that.actionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, actionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListActionsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    actionInfo: ").append(toIndentedString(actionInfo)).append("\n");
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
