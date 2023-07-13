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
public class AddAgentPathResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added")

    private List<String> added = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existed")

    private List<String> existed = null;

    public AddAgentPathResponse withAdded(List<String> added) {
        this.added = added;
        return this;
    }

    public AddAgentPathResponse addAddedItem(String addedItem) {
        if (this.added == null) {
            this.added = new ArrayList<>();
        }
        this.added.add(addedItem);
        return this;
    }

    public AddAgentPathResponse withAdded(Consumer<List<String>> addedSetter) {
        if (this.added == null) {
            this.added = new ArrayList<>();
        }
        addedSetter.accept(this.added);
        return this;
    }

    /**
     * 新添加成功的路径列表
     * @return added
     */
    public List<String> getAdded() {
        return added;
    }

    public void setAdded(List<String> added) {
        this.added = added;
    }

    public AddAgentPathResponse withExisted(List<String> existed) {
        this.existed = existed;
        return this;
    }

    public AddAgentPathResponse addExistedItem(String existedItem) {
        if (this.existed == null) {
            this.existed = new ArrayList<>();
        }
        this.existed.add(existedItem);
        return this;
    }

    public AddAgentPathResponse withExisted(Consumer<List<String>> existedSetter) {
        if (this.existed == null) {
            this.existed = new ArrayList<>();
        }
        existedSetter.accept(this.existed);
        return this;
    }

    /**
     * 已经存在的路径列表
     * @return existed
     */
    public List<String> getExisted() {
        return existed;
    }

    public void setExisted(List<String> existed) {
        this.existed = existed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddAgentPathResponse that = (AddAgentPathResponse) obj;
        return Objects.equals(this.added, that.added) && Objects.equals(this.existed, that.existed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(added, existed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAgentPathResponse {\n");
        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    existed: ").append(toIndentedString(existed)).append("\n");
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
