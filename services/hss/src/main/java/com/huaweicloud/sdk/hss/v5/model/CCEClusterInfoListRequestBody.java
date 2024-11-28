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
public class CCEClusterInfoListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info_list")

    private List<CCEClusterInfoListRequestBodyClusterInfoList> clusterInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id_list")

    private List<String> clusterIdList = null;

    public CCEClusterInfoListRequestBody withClusterInfoList(
        List<CCEClusterInfoListRequestBodyClusterInfoList> clusterInfoList) {
        this.clusterInfoList = clusterInfoList;
        return this;
    }

    public CCEClusterInfoListRequestBody addClusterInfoListItem(
        CCEClusterInfoListRequestBodyClusterInfoList clusterInfoListItem) {
        if (this.clusterInfoList == null) {
            this.clusterInfoList = new ArrayList<>();
        }
        this.clusterInfoList.add(clusterInfoListItem);
        return this;
    }

    public CCEClusterInfoListRequestBody withClusterInfoList(
        Consumer<List<CCEClusterInfoListRequestBodyClusterInfoList>> clusterInfoListSetter) {
        if (this.clusterInfoList == null) {
            this.clusterInfoList = new ArrayList<>();
        }
        clusterInfoListSetter.accept(this.clusterInfoList);
        return this;
    }

    /**
     * 集群id列表
     * @return clusterInfoList
     */
    public List<CCEClusterInfoListRequestBodyClusterInfoList> getClusterInfoList() {
        return clusterInfoList;
    }

    public void setClusterInfoList(List<CCEClusterInfoListRequestBodyClusterInfoList> clusterInfoList) {
        this.clusterInfoList = clusterInfoList;
    }

    public CCEClusterInfoListRequestBody withClusterIdList(List<String> clusterIdList) {
        this.clusterIdList = clusterIdList;
        return this;
    }

    public CCEClusterInfoListRequestBody addClusterIdListItem(String clusterIdListItem) {
        if (this.clusterIdList == null) {
            this.clusterIdList = new ArrayList<>();
        }
        this.clusterIdList.add(clusterIdListItem);
        return this;
    }

    public CCEClusterInfoListRequestBody withClusterIdList(Consumer<List<String>> clusterIdListSetter) {
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
        CCEClusterInfoListRequestBody that = (CCEClusterInfoListRequestBody) obj;
        return Objects.equals(this.clusterInfoList, that.clusterInfoList)
            && Objects.equals(this.clusterIdList, that.clusterIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterInfoList, clusterIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CCEClusterInfoListRequestBody {\n");
        sb.append("    clusterInfoList: ").append(toIndentedString(clusterInfoList)).append("\n");
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
