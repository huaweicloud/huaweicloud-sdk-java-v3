package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群详情
 */
public class CreateClusterReqBodyClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_map")

    private Map<String, String> featureMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_instance_info")

    private List<CreateClusterInstanceBody> clusterInstanceInfo = null;

    public CreateClusterReqBodyClusterInfo withFeatureMap(Map<String, String> featureMap) {
        this.featureMap = featureMap;
        return this;
    }

    public CreateClusterReqBodyClusterInfo putFeatureMapItem(String key, String featureMapItem) {
        if (this.featureMap == null) {
            this.featureMap = new HashMap<>();
        }
        this.featureMap.put(key, featureMapItem);
        return this;
    }

    public CreateClusterReqBodyClusterInfo withFeatureMap(Consumer<Map<String, String>> featureMapSetter) {
        if (this.featureMap == null) {
            this.featureMap = new HashMap<>();
        }
        featureMapSetter.accept(this.featureMap);
        return this;
    }

    /**
     * 特性属性开关      * 属性开关必须以enable开头，value必须为true|false      * doris: enable_broker      * hbase: storage_io_type（COMMON，ULTRAHIGH，两种取值），enable_open_tsdb（默认false，若为true需要在集群节点信息列表中指定tsd节点个数），enable_broker      示例：      \"feature_map\":{\"enable_broker\":\"false\"}       \"feature_map\":{\"enable_lemon\":\"false\",\"enable_open_tsdb\":\"false\",\"storage_io_type\": \"COMMON\"}
     * @return featureMap
     */
    public Map<String, String> getFeatureMap() {
        return featureMap;
    }

    public void setFeatureMap(Map<String, String> featureMap) {
        this.featureMap = featureMap;
    }

    public CreateClusterReqBodyClusterInfo withClusterInstanceInfo(
        List<CreateClusterInstanceBody> clusterInstanceInfo) {
        this.clusterInstanceInfo = clusterInstanceInfo;
        return this;
    }

    public CreateClusterReqBodyClusterInfo addClusterInstanceInfoItem(
        CreateClusterInstanceBody clusterInstanceInfoItem) {
        if (this.clusterInstanceInfo == null) {
            this.clusterInstanceInfo = new ArrayList<>();
        }
        this.clusterInstanceInfo.add(clusterInstanceInfoItem);
        return this;
    }

    public CreateClusterReqBodyClusterInfo withClusterInstanceInfo(
        Consumer<List<CreateClusterInstanceBody>> clusterInstanceInfoSetter) {
        if (this.clusterInstanceInfo == null) {
            this.clusterInstanceInfo = new ArrayList<>();
        }
        clusterInstanceInfoSetter.accept(this.clusterInstanceInfo);
        return this;
    }

    /**
     * 集群节点信息类
     * @return clusterInstanceInfo
     */
    public List<CreateClusterInstanceBody> getClusterInstanceInfo() {
        return clusterInstanceInfo;
    }

    public void setClusterInstanceInfo(List<CreateClusterInstanceBody> clusterInstanceInfo) {
        this.clusterInstanceInfo = clusterInstanceInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterReqBodyClusterInfo that = (CreateClusterReqBodyClusterInfo) obj;
        return Objects.equals(this.featureMap, that.featureMap)
            && Objects.equals(this.clusterInstanceInfo, that.clusterInstanceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureMap, clusterInstanceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterReqBodyClusterInfo {\n");
        sb.append("    featureMap: ").append(toIndentedString(featureMap)).append("\n");
        sb.append("    clusterInstanceInfo: ").append(toIndentedString(clusterInstanceInfo)).append("\n");
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
