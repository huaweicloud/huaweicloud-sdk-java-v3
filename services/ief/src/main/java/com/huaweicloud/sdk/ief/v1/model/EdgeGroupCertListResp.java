package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘节点组证书列表返回体
 */
public class EdgeGroupCertListResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupcerts")

    private List<EdgeGroupCert> groupcerts = null;

    public EdgeGroupCertListResp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 边缘节点组证书数目
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public EdgeGroupCertListResp withGroupcerts(List<EdgeGroupCert> groupcerts) {
        this.groupcerts = groupcerts;
        return this;
    }

    public EdgeGroupCertListResp addGroupcertsItem(EdgeGroupCert groupcertsItem) {
        if (this.groupcerts == null) {
            this.groupcerts = new ArrayList<>();
        }
        this.groupcerts.add(groupcertsItem);
        return this;
    }

    public EdgeGroupCertListResp withGroupcerts(Consumer<List<EdgeGroupCert>> groupcertsSetter) {
        if (this.groupcerts == null) {
            this.groupcerts = new ArrayList<>();
        }
        groupcertsSetter.accept(this.groupcerts);
        return this;
    }

    /**
     * 边缘节点证书详情
     * @return groupcerts
     */
    public List<EdgeGroupCert> getGroupcerts() {
        return groupcerts;
    }

    public void setGroupcerts(List<EdgeGroupCert> groupcerts) {
        this.groupcerts = groupcerts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeGroupCertListResp edgeGroupCertListResp = (EdgeGroupCertListResp) o;
        return Objects.equals(this.count, edgeGroupCertListResp.count)
            && Objects.equals(this.groupcerts, edgeGroupCertListResp.groupcerts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, groupcerts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeGroupCertListResp {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    groupcerts: ").append(toIndentedString(groupcerts)).append("\n");
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
