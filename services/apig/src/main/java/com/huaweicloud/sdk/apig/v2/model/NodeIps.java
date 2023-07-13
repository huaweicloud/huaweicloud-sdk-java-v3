package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeIps
 */
public class NodeIps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "livedata")

    private List<String> livedata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shubao")

    private List<String> shubao = null;

    public NodeIps withLivedata(List<String> livedata) {
        this.livedata = livedata;
        return this;
    }

    public NodeIps addLivedataItem(String livedataItem) {
        if (this.livedata == null) {
            this.livedata = new ArrayList<>();
        }
        this.livedata.add(livedataItem);
        return this;
    }

    public NodeIps withLivedata(Consumer<List<String>> livedataSetter) {
        if (this.livedata == null) {
            this.livedata = new ArrayList<>();
        }
        livedataSetter.accept(this.livedata);
        return this;
    }

    /**
     * livedata节点IP地址列表
     * @return livedata
     */
    public List<String> getLivedata() {
        return livedata;
    }

    public void setLivedata(List<String> livedata) {
        this.livedata = livedata;
    }

    public NodeIps withShubao(List<String> shubao) {
        this.shubao = shubao;
        return this;
    }

    public NodeIps addShubaoItem(String shubaoItem) {
        if (this.shubao == null) {
            this.shubao = new ArrayList<>();
        }
        this.shubao.add(shubaoItem);
        return this;
    }

    public NodeIps withShubao(Consumer<List<String>> shubaoSetter) {
        if (this.shubao == null) {
            this.shubao = new ArrayList<>();
        }
        shubaoSetter.accept(this.shubao);
        return this;
    }

    /**
     * shubao节点IP地址列表
     * @return shubao
     */
    public List<String> getShubao() {
        return shubao;
    }

    public void setShubao(List<String> shubao) {
        this.shubao = shubao;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeIps that = (NodeIps) obj;
        return Objects.equals(this.livedata, that.livedata) && Objects.equals(this.shubao, that.shubao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livedata, shubao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeIps {\n");
        sb.append("    livedata: ").append(toIndentedString(livedata)).append("\n");
        sb.append("    shubao: ").append(toIndentedString(shubao)).append("\n");
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
