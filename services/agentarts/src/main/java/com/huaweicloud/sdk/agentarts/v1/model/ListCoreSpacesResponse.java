package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListCoreSpacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spaces")

    private List<CoreSpaceSummary> spaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCoreSpacesResponse withSpaces(List<CoreSpaceSummary> spaces) {
        this.spaces = spaces;
        return this;
    }

    public ListCoreSpacesResponse addSpacesItem(CoreSpaceSummary spacesItem) {
        if (this.spaces == null) {
            this.spaces = new ArrayList<>();
        }
        this.spaces.add(spacesItem);
        return this;
    }

    public ListCoreSpacesResponse withSpaces(Consumer<List<CoreSpaceSummary>> spacesSetter) {
        if (this.spaces == null) {
            this.spaces = new ArrayList<>();
        }
        spacesSetter.accept(this.spaces);
        return this;
    }

    /**
     * **参数解释：** 记忆库列表。 **取值范围：** 0-100个。 
     * @return spaces
     */
    public List<CoreSpaceSummary> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<CoreSpaceSummary> spaces) {
        this.spaces = spaces;
    }

    public ListCoreSpacesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 返回的记忆库数量（个）。 **取值范围：** 0-100。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCoreSpacesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 记忆库总数（个）。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 1000000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreSpacesResponse that = (ListCoreSpacesResponse) obj;
        return Objects.equals(this.spaces, that.spaces) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaces, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreSpacesResponse {\n");
        sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
