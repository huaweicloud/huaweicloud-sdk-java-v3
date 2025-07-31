package com.huaweicloud.sdk.hss.v5.model;

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
public class ListClusterProtectionItemResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuls")

    private List<String> vuls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baselines")

    private List<ClusterBaselineResponseInfo> baselines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malwares")

    private List<ClusterMalwareResponseInfo> malwares = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images")

    private List<ClusterImageResponseInfo> images = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<ClusterItemResponseInfo> clusters = null;

    public ListClusterProtectionItemResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListClusterProtectionItemResponse withVuls(List<String> vuls) {
        this.vuls = vuls;
        return this;
    }

    public ListClusterProtectionItemResponse addVulsItem(String vulsItem) {
        if (this.vuls == null) {
            this.vuls = new ArrayList<>();
        }
        this.vuls.add(vulsItem);
        return this;
    }

    public ListClusterProtectionItemResponse withVuls(Consumer<List<String>> vulsSetter) {
        if (this.vuls == null) {
            this.vuls = new ArrayList<>();
        }
        vulsSetter.accept(this.vuls);
        return this;
    }

    /**
     * 漏洞信息
     * @return vuls
     */
    public List<String> getVuls() {
        return vuls;
    }

    public void setVuls(List<String> vuls) {
        this.vuls = vuls;
    }

    public ListClusterProtectionItemResponse withBaselines(List<ClusterBaselineResponseInfo> baselines) {
        this.baselines = baselines;
        return this;
    }

    public ListClusterProtectionItemResponse addBaselinesItem(ClusterBaselineResponseInfo baselinesItem) {
        if (this.baselines == null) {
            this.baselines = new ArrayList<>();
        }
        this.baselines.add(baselinesItem);
        return this;
    }

    public ListClusterProtectionItemResponse withBaselines(
        Consumer<List<ClusterBaselineResponseInfo>> baselinesSetter) {
        if (this.baselines == null) {
            this.baselines = new ArrayList<>();
        }
        baselinesSetter.accept(this.baselines);
        return this;
    }

    /**
     * 基线信息
     * @return baselines
     */
    public List<ClusterBaselineResponseInfo> getBaselines() {
        return baselines;
    }

    public void setBaselines(List<ClusterBaselineResponseInfo> baselines) {
        this.baselines = baselines;
    }

    public ListClusterProtectionItemResponse withMalwares(List<ClusterMalwareResponseInfo> malwares) {
        this.malwares = malwares;
        return this;
    }

    public ListClusterProtectionItemResponse addMalwaresItem(ClusterMalwareResponseInfo malwaresItem) {
        if (this.malwares == null) {
            this.malwares = new ArrayList<>();
        }
        this.malwares.add(malwaresItem);
        return this;
    }

    public ListClusterProtectionItemResponse withMalwares(Consumer<List<ClusterMalwareResponseInfo>> malwaresSetter) {
        if (this.malwares == null) {
            this.malwares = new ArrayList<>();
        }
        malwaresSetter.accept(this.malwares);
        return this;
    }

    /**
     * 恶意文件信息
     * @return malwares
     */
    public List<ClusterMalwareResponseInfo> getMalwares() {
        return malwares;
    }

    public void setMalwares(List<ClusterMalwareResponseInfo> malwares) {
        this.malwares = malwares;
    }

    public ListClusterProtectionItemResponse withImages(List<ClusterImageResponseInfo> images) {
        this.images = images;
        return this;
    }

    public ListClusterProtectionItemResponse addImagesItem(ClusterImageResponseInfo imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public ListClusterProtectionItemResponse withImages(Consumer<List<ClusterImageResponseInfo>> imagesSetter) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * 镜像信息
     * @return images
     */
    public List<ClusterImageResponseInfo> getImages() {
        return images;
    }

    public void setImages(List<ClusterImageResponseInfo> images) {
        this.images = images;
    }

    public ListClusterProtectionItemResponse withClusters(List<ClusterItemResponseInfo> clusters) {
        this.clusters = clusters;
        return this;
    }

    public ListClusterProtectionItemResponse addClustersItem(ClusterItemResponseInfo clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public ListClusterProtectionItemResponse withClusters(Consumer<List<ClusterItemResponseInfo>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * 集群信息
     * @return clusters
     */
    public List<ClusterItemResponseInfo> getClusters() {
        return clusters;
    }

    public void setClusters(List<ClusterItemResponseInfo> clusters) {
        this.clusters = clusters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterProtectionItemResponse that = (ListClusterProtectionItemResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.vuls, that.vuls)
            && Objects.equals(this.baselines, that.baselines) && Objects.equals(this.malwares, that.malwares)
            && Objects.equals(this.images, that.images) && Objects.equals(this.clusters, that.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, vuls, baselines, malwares, images, clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterProtectionItemResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    vuls: ").append(toIndentedString(vuls)).append("\n");
        sb.append("    baselines: ").append(toIndentedString(baselines)).append("\n");
        sb.append("    malwares: ").append(toIndentedString(malwares)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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
