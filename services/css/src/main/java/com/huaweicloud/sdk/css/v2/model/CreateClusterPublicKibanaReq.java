package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Kibana公网访问信息 */
public class CreateClusterPublicKibanaReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eipSize")

    private Integer eipSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elbWhiteList")

    private CreateClusterPublicKibanaElbWhiteList elbWhiteList;

    public CreateClusterPublicKibanaReq withEipSize(Integer eipSize) {
        this.eipSize = eipSize;
        return this;
    }

    /** 带宽大小。
     * 
     * @return eipSize */
    public Integer getEipSize() {
        return eipSize;
    }

    public void setEipSize(Integer eipSize) {
        this.eipSize = eipSize;
    }

    public CreateClusterPublicKibanaReq withElbWhiteList(CreateClusterPublicKibanaElbWhiteList elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
        return this;
    }

    public CreateClusterPublicKibanaReq withElbWhiteList(
        Consumer<CreateClusterPublicKibanaElbWhiteList> elbWhiteListSetter) {
        if (this.elbWhiteList == null) {
            this.elbWhiteList = new CreateClusterPublicKibanaElbWhiteList();
            elbWhiteListSetter.accept(this.elbWhiteList);
        }

        return this;
    }

    /** Get elbWhiteList
     * 
     * @return elbWhiteList */
    public CreateClusterPublicKibanaElbWhiteList getElbWhiteList() {
        return elbWhiteList;
    }

    public void setElbWhiteList(CreateClusterPublicKibanaElbWhiteList elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterPublicKibanaReq createClusterPublicKibanaReq = (CreateClusterPublicKibanaReq) o;
        return Objects.equals(this.eipSize, createClusterPublicKibanaReq.eipSize)
            && Objects.equals(this.elbWhiteList, createClusterPublicKibanaReq.elbWhiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipSize, elbWhiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterPublicKibanaReq {\n");
        sb.append("    eipSize: ").append(toIndentedString(eipSize)).append("\n");
        sb.append("    elbWhiteList: ").append(toIndentedString(elbWhiteList)).append("\n");
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
