package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 容器网页防篡改相关配置信息 **约束限制**: type值为“container_wtp”容器网页防篡改时有效 **取值范围**: 不涉及 **默认取值**: 不涉及 
 */
public class UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_label_list")

    private List<ClusterLabelInfo> clusterLabelList = null;

    public UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo withClusterLabelList(
        List<ClusterLabelInfo> clusterLabelList) {
        this.clusterLabelList = clusterLabelList;
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo addClusterLabelListItem(
        ClusterLabelInfo clusterLabelListItem) {
        if (this.clusterLabelList == null) {
            this.clusterLabelList = new ArrayList<>();
        }
        this.clusterLabelList.add(clusterLabelListItem);
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo withClusterLabelList(
        Consumer<List<ClusterLabelInfo>> clusterLabelListSetter) {
        if (this.clusterLabelList == null) {
            this.clusterLabelList = new ArrayList<>();
        }
        clusterLabelListSetter.accept(this.clusterLabelList);
        return this;
    }

    /**
     * **参数解释**: 集群标签列表 **约束限制**: protect_type值为“cluster”时生效 **取值范围**: 最少0条，最多10条 **默认取值**: 不涉及 
     * @return clusterLabelList
     */
    public List<ClusterLabelInfo> getClusterLabelList() {
        return clusterLabelList;
    }

    public void setClusterLabelList(List<ClusterLabelInfo> clusterLabelList) {
        this.clusterLabelList = clusterLabelList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo that =
            (UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo) obj;
        return Objects.equals(this.clusterLabelList, that.clusterLabelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterLabelList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo {\n");
        sb.append("    clusterLabelList: ").append(toIndentedString(clusterLabelList)).append("\n");
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
