package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CCE集群配置请求
 */
public class CCEClusterIdListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id_list")

    private List<String> clusterIdList = null;

    public CCEClusterIdListRequestBody withClusterIdList(List<String> clusterIdList) {
        this.clusterIdList = clusterIdList;
        return this;
    }

    public CCEClusterIdListRequestBody addClusterIdListItem(String clusterIdListItem) {
        if (this.clusterIdList == null) {
            this.clusterIdList = new ArrayList<>();
        }
        this.clusterIdList.add(clusterIdListItem);
        return this;
    }

    public CCEClusterIdListRequestBody withClusterIdList(Consumer<List<String>> clusterIdListSetter) {
        if (this.clusterIdList == null) {
            this.clusterIdList = new ArrayList<>();
        }
        clusterIdListSetter.accept(this.clusterIdList);
        return this;
    }

    /**
     * 集群id列表
     * @return clusterIdList
     */
    public List<String> getClusterIdList() {
        return clusterIdList;
    }

    public void setClusterIdList(List<String> clusterIdList) {
        this.clusterIdList = clusterIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CCEClusterIdListRequestBody that = (CCEClusterIdListRequestBody) obj;
        return Objects.equals(this.clusterIdList, that.clusterIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CCEClusterIdListRequestBody {\n");
        sb.append("    clusterIdList: ").append(toIndentedString(clusterIdList)).append("\n");
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
