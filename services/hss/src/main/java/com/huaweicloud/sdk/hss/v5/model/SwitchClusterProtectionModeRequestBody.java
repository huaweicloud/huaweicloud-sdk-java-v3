package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SwitchClusterProtectionModeRequestBody
 */
public class SwitchClusterProtectionModeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_ids")

    private List<String> clusterIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opr")

    private Integer opr;

    public SwitchClusterProtectionModeRequestBody withClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }

    public SwitchClusterProtectionModeRequestBody addClusterIdsItem(String clusterIdsItem) {
        if (this.clusterIds == null) {
            this.clusterIds = new ArrayList<>();
        }
        this.clusterIds.add(clusterIdsItem);
        return this;
    }

    public SwitchClusterProtectionModeRequestBody withClusterIds(Consumer<List<String>> clusterIdsSetter) {
        if (this.clusterIds == null) {
            this.clusterIds = new ArrayList<>();
        }
        clusterIdsSetter.accept(this.clusterIds);
        return this;
    }

    /**
     * 集群ID列表
     * @return clusterIds
     */
    public List<String> getClusterIds() {
        return clusterIds;
    }

    public void setClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
    }

    public SwitchClusterProtectionModeRequestBody withOpr(Integer opr) {
        this.opr = opr;
        return this;
    }

    /**
     * - 1：开 - 0：关 - 2：关闭并卸载插件
     * minimum: 0
     * maximum: 10
     * @return opr
     */
    public Integer getOpr() {
        return opr;
    }

    public void setOpr(Integer opr) {
        this.opr = opr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchClusterProtectionModeRequestBody that = (SwitchClusterProtectionModeRequestBody) obj;
        return Objects.equals(this.clusterIds, that.clusterIds) && Objects.equals(this.opr, that.opr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterIds, opr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchClusterProtectionModeRequestBody {\n");
        sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
        sb.append("    opr: ").append(toIndentedString(opr)).append("\n");
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
