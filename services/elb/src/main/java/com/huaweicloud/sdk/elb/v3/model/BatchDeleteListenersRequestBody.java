package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchDeleteListenersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_ids")

    private List<String> listenerIds = null;

    public BatchDeleteListenersRequestBody withListenerIds(List<String> listenerIds) {
        this.listenerIds = listenerIds;
        return this;
    }

    public BatchDeleteListenersRequestBody addListenerIdsItem(String listenerIdsItem) {
        if (this.listenerIds == null) {
            this.listenerIds = new ArrayList<>();
        }
        this.listenerIds.add(listenerIdsItem);
        return this;
    }

    public BatchDeleteListenersRequestBody withListenerIds(Consumer<List<String>> listenerIdsSetter) {
        if (this.listenerIds == null) {
            this.listenerIds = new ArrayList<>();
        }
        listenerIdsSetter.accept(this.listenerIds);
        return this;
    }

    /**
     * **参数解释**：待删除的监听器id列表。 **约束限制**：一次最多删除10个监听器。 **取值范围**：不涉及 **默认取值**：不涉及
     * @return listenerIds
     */
    public List<String> getListenerIds() {
        return listenerIds;
    }

    public void setListenerIds(List<String> listenerIds) {
        this.listenerIds = listenerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteListenersRequestBody that = (BatchDeleteListenersRequestBody) obj;
        return Objects.equals(this.listenerIds, that.listenerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteListenersRequestBody {\n");
        sb.append("    listenerIds: ").append(toIndentedString(listenerIds)).append("\n");
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
