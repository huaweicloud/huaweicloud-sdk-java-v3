package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 伸缩组存量节点统计信息
 */
public class ScaleGroupStatusExistingNodeCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postPaid")

    private Integer postPaid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prePaid")

    private Integer prePaid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ScaleGroupStatusExistingNodeCount withPostPaid(Integer postPaid) {
        this.postPaid = postPaid;
        return this;
    }

    /**
     * 按需计费节点个数
     * @return postPaid
     */
    public Integer getPostPaid() {
        return postPaid;
    }

    public void setPostPaid(Integer postPaid) {
        this.postPaid = postPaid;
    }

    public ScaleGroupStatusExistingNodeCount withPrePaid(Integer prePaid) {
        this.prePaid = prePaid;
        return this;
    }

    /**
     * 包年包月节点个数
     * @return prePaid
     */
    public Integer getPrePaid() {
        return prePaid;
    }

    public void setPrePaid(Integer prePaid) {
        this.prePaid = prePaid;
    }

    public ScaleGroupStatusExistingNodeCount withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 按需计费和包年包月节点总数
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
        ScaleGroupStatusExistingNodeCount that = (ScaleGroupStatusExistingNodeCount) obj;
        return Objects.equals(this.postPaid, that.postPaid) && Objects.equals(this.prePaid, that.prePaid)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postPaid, prePaid, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleGroupStatusExistingNodeCount {\n");
        sb.append("    postPaid: ").append(toIndentedString(postPaid)).append("\n");
        sb.append("    prePaid: ").append(toIndentedString(prePaid)).append("\n");
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
