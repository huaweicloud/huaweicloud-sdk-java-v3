package com.huaweicloud.sdk.cbr.v1.model;

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
public class RemoveAgentPathResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed")

    private List<String> removed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_existed")

    private List<String> notExisted = null;

    public RemoveAgentPathResponse withRemoved(List<String> removed) {
        this.removed = removed;
        return this;
    }

    public RemoveAgentPathResponse addRemovedItem(String removedItem) {
        if (this.removed == null) {
            this.removed = new ArrayList<>();
        }
        this.removed.add(removedItem);
        return this;
    }

    public RemoveAgentPathResponse withRemoved(Consumer<List<String>> removedSetter) {
        if (this.removed == null) {
            this.removed = new ArrayList<>();
        }
        removedSetter.accept(this.removed);
        return this;
    }

    /**
     * 移除的路径列表 
     * @return removed
     */
    public List<String> getRemoved() {
        return removed;
    }

    public void setRemoved(List<String> removed) {
        this.removed = removed;
    }

    public RemoveAgentPathResponse withNotExisted(List<String> notExisted) {
        this.notExisted = notExisted;
        return this;
    }

    public RemoveAgentPathResponse addNotExistedItem(String notExistedItem) {
        if (this.notExisted == null) {
            this.notExisted = new ArrayList<>();
        }
        this.notExisted.add(notExistedItem);
        return this;
    }

    public RemoveAgentPathResponse withNotExisted(Consumer<List<String>> notExistedSetter) {
        if (this.notExisted == null) {
            this.notExisted = new ArrayList<>();
        }
        notExistedSetter.accept(this.notExisted);
        return this;
    }

    /**
     * 不存在的路径
     * @return notExisted
     */
    public List<String> getNotExisted() {
        return notExisted;
    }

    public void setNotExisted(List<String> notExisted) {
        this.notExisted = notExisted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveAgentPathResponse that = (RemoveAgentPathResponse) obj;
        return Objects.equals(this.removed, that.removed) && Objects.equals(this.notExisted, that.notExisted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removed, notExisted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveAgentPathResponse {\n");
        sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
        sb.append("    notExisted: ").append(toIndentedString(notExisted)).append("\n");
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
