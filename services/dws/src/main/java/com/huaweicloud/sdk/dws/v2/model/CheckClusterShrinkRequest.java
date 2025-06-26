package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CheckClusterShrinkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item")

    private String checkItem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrink_count")

    private Integer shrinkCount;

    public CheckClusterShrinkRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 必须是有效的dws集群ID。 **取值范围**： 36位UUID。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CheckClusterShrinkRequest withCheckItem(String checkItem) {
        this.checkItem = checkItem;
        return this;
    }

    /**
     * **参数解释**： 检查项，取值当前仅包含3种。 **约束限制**： 不涉及。 **取值范围**： guc：检查当前guc参数是否满足缩容条件。 schema：检查所有schema下有无影响缩容的表。 disk：检查缩容后磁盘容量是否满足要求。 **默认取值**： 不涉及。
     * @return checkItem
     */
    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public CheckClusterShrinkRequest withShrinkCount(Integer shrinkCount) {
        this.shrinkCount = shrinkCount;
        return this;
    }

    /**
     * **参数解释**： 待缩容节点数。 **约束限制**： 不涉及。 **取值范围**： 最小值为3，最大值为当前节点总数减3。 **默认取值**： 不涉及。
     * @return shrinkCount
     */
    public Integer getShrinkCount() {
        return shrinkCount;
    }

    public void setShrinkCount(Integer shrinkCount) {
        this.shrinkCount = shrinkCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckClusterShrinkRequest that = (CheckClusterShrinkRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.checkItem, that.checkItem)
            && Objects.equals(this.shrinkCount, that.shrinkCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, checkItem, shrinkCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckClusterShrinkRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    checkItem: ").append(toIndentedString(checkItem)).append("\n");
        sb.append("    shrinkCount: ").append(toIndentedString(shrinkCount)).append("\n");
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
