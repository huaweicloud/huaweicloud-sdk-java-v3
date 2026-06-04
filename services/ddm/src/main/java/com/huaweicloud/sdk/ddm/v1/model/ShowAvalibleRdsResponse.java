package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowAvalibleRdsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_data_nodes")

    private List<TargetDn4Restore> targetDataNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowAvalibleRdsResponse withTargetDataNodes(List<TargetDn4Restore> targetDataNodes) {
        this.targetDataNodes = targetDataNodes;
        return this;
    }

    public ShowAvalibleRdsResponse addTargetDataNodesItem(TargetDn4Restore targetDataNodesItem) {
        if (this.targetDataNodes == null) {
            this.targetDataNodes = new ArrayList<>();
        }
        this.targetDataNodes.add(targetDataNodesItem);
        return this;
    }

    public ShowAvalibleRdsResponse withTargetDataNodes(Consumer<List<TargetDn4Restore>> targetDataNodesSetter) {
        if (this.targetDataNodes == null) {
            this.targetDataNodes = new ArrayList<>();
        }
        targetDataNodesSetter.accept(this.targetDataNodes);
        return this;
    }

    /**
     * 可用目标DN。
     * @return targetDataNodes
     */
    public List<TargetDn4Restore> getTargetDataNodes() {
        return targetDataNodes;
    }

    public void setTargetDataNodes(List<TargetDn4Restore> targetDataNodes) {
        this.targetDataNodes = targetDataNodes;
    }

    public ShowAvalibleRdsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：  分页参数: 起始值。  **取值范围**：   大于等于0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowAvalibleRdsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：  分页参数: 每页记录数。  **取值范围**：  大于0且小于等于128。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowAvalibleRdsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：  总记录数。  **取值范围**：  不涉及。
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
        ShowAvalibleRdsResponse that = (ShowAvalibleRdsResponse) obj;
        return Objects.equals(this.targetDataNodes, that.targetDataNodes) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetDataNodes, offset, limit, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvalibleRdsResponse {\n");
        sb.append("    targetDataNodes: ").append(toIndentedString(targetDataNodes)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
