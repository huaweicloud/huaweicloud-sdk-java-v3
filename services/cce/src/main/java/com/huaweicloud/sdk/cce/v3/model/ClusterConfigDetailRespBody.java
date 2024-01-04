package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取指定集群配置项列表返回体
 */
public class ClusterConfigDetailRespBody extends HashMap<String, List> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kube-apiserver")

    private List<PackageOptions> kubeApiserver = null;

    public ClusterConfigDetailRespBody withKubeApiserver(List<PackageOptions> kubeApiserver) {
        this.kubeApiserver = kubeApiserver;
        return this;
    }

    public ClusterConfigDetailRespBody addKubeApiserverItem(PackageOptions kubeApiserverItem) {
        if (this.kubeApiserver == null) {
            this.kubeApiserver = new ArrayList<>();
        }
        this.kubeApiserver.add(kubeApiserverItem);
        return this;
    }

    public ClusterConfigDetailRespBody withKubeApiserver(Consumer<List<PackageOptions>> kubeApiserverSetter) {
        if (this.kubeApiserver == null) {
            this.kubeApiserver = new ArrayList<>();
        }
        kubeApiserverSetter.accept(this.kubeApiserver);
        return this;
    }

    /**
     * 配置参数，由key/value组成。
     * @return kubeApiserver
     */
    public List<PackageOptions> getKubeApiserver() {
        return kubeApiserver;
    }

    public void setKubeApiserver(List<PackageOptions> kubeApiserver) {
        this.kubeApiserver = kubeApiserver;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterConfigDetailRespBody that = (ClusterConfigDetailRespBody) obj;
        return Objects.equals(this.kubeApiserver, that.kubeApiserver) && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kubeApiserver, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterConfigDetailRespBody {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    kubeApiserver: ").append(toIndentedString(kubeApiserver)).append("\n");
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
