package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件列表元信息。
 */
public class EventListMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue")

    private String _continue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remainingItemCount")

    private Integer remainingItemCount;

    public EventListMeta withContinue(String _continue) {
        this._continue = _continue;
        return this;
    }

    /**
     * **参数描述**：分页标记。 **取值范围**：不涉及。
     * @return _continue
     */
    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    public EventListMeta withRemainingItemCount(Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
        return this;
    }

    /**
     * **参数描述**：分页剩余数量。 **取值范围**：不涉及。
     * @return remainingItemCount
     */
    public Integer getRemainingItemCount() {
        return remainingItemCount;
    }

    public void setRemainingItemCount(Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventListMeta that = (EventListMeta) obj;
        return Objects.equals(this._continue, that._continue)
            && Objects.equals(this.remainingItemCount, that.remainingItemCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_continue, remainingItemCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventListMeta {\n");
        sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
        sb.append("    remainingItemCount: ").append(toIndentedString(remainingItemCount)).append("\n");
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
