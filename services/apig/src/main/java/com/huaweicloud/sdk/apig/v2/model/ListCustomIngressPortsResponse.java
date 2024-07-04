package com.huaweicloud.sdk.apig.v2.model;

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
public class ListCustomIngressPortsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_port_infos")

    private List<IngressPortInfo> ingressPortInfos = null;

    public ListCustomIngressPortsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCustomIngressPortsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListCustomIngressPortsResponse withIngressPortInfos(List<IngressPortInfo> ingressPortInfos) {
        this.ingressPortInfos = ingressPortInfos;
        return this;
    }

    public ListCustomIngressPortsResponse addIngressPortInfosItem(IngressPortInfo ingressPortInfosItem) {
        if (this.ingressPortInfos == null) {
            this.ingressPortInfos = new ArrayList<>();
        }
        this.ingressPortInfos.add(ingressPortInfosItem);
        return this;
    }

    public ListCustomIngressPortsResponse withIngressPortInfos(Consumer<List<IngressPortInfo>> ingressPortInfosSetter) {
        if (this.ingressPortInfos == null) {
            this.ingressPortInfos = new ArrayList<>();
        }
        ingressPortInfosSetter.accept(this.ingressPortInfos);
        return this;
    }

    /**
     * 实例自定义入方向端口列表。
     * @return ingressPortInfos
     */
    public List<IngressPortInfo> getIngressPortInfos() {
        return ingressPortInfos;
    }

    public void setIngressPortInfos(List<IngressPortInfo> ingressPortInfos) {
        this.ingressPortInfos = ingressPortInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomIngressPortsResponse that = (ListCustomIngressPortsResponse) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.ingressPortInfos, that.ingressPortInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, ingressPortInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomIngressPortsResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    ingressPortInfos: ").append(toIndentedString(ingressPortInfos)).append("\n");
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
