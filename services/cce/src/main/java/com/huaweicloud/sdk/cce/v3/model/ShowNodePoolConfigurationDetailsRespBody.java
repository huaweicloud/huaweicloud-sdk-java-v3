package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取指定节点池配置参数列表返回体
 */
public class ShowNodePoolConfigurationDetailsRespBody extends HashMap<String, List> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubelet")

    private List<PackageOptions> kubelet = null;

    public ShowNodePoolConfigurationDetailsRespBody withKubelet(List<PackageOptions> kubelet) {
        this.kubelet = kubelet;
        return this;
    }

    public ShowNodePoolConfigurationDetailsRespBody addKubeletItem(PackageOptions kubeletItem) {
        if (this.kubelet == null) {
            this.kubelet = new ArrayList<>();
        }
        this.kubelet.add(kubeletItem);
        return this;
    }

    public ShowNodePoolConfigurationDetailsRespBody withKubelet(Consumer<List<PackageOptions>> kubeletSetter) {
        if (this.kubelet == null) {
            this.kubelet = new ArrayList<>();
        }
        kubeletSetter.accept(this.kubelet);
        return this;
    }

    /**
     * 配置参数，由key/value组成。
     * @return kubelet
     */
    public List<PackageOptions> getKubelet() {
        return kubelet;
    }

    public void setKubelet(List<PackageOptions> kubelet) {
        this.kubelet = kubelet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNodePoolConfigurationDetailsRespBody that = (ShowNodePoolConfigurationDetailsRespBody) obj;
        return Objects.equals(this.kubelet, that.kubelet) && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kubelet, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNodePoolConfigurationDetailsRespBody {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    kubelet: ").append(toIndentedString(kubelet)).append("\n");
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
