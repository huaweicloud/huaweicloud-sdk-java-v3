package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 节点内部ip信息 */
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

    /** 自定义后端服务livedta组件节点ip列表
     * 
     * @return livedata */
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

    /** API网关shubao组件节点ip列表
     * 
     * @return shubao */
    public List<String> getShubao() {
        return shubao;
    }

    public void setShubao(List<String> shubao) {
        this.shubao = shubao;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeIps nodeIps = (NodeIps) o;
        return Objects.equals(this.livedata, nodeIps.livedata) && Objects.equals(this.shubao, nodeIps.shubao);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
