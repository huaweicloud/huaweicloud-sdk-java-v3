package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloseKibanaPublicReq
 */
public class CloseKibanaPublicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eipSize")

    private Integer eipSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elbWhiteList")

    private StartKibanaPublicReqElbWhitelist elbWhiteList;

    public CloseKibanaPublicReq withEipSize(Integer eipSize) {
        this.eipSize = eipSize;
        return this;
    }

    /**
     * 带宽。单位：Mbit/s
     * @return eipSize
     */
    public Integer getEipSize() {
        return eipSize;
    }

    public void setEipSize(Integer eipSize) {
        this.eipSize = eipSize;
    }

    public CloseKibanaPublicReq withElbWhiteList(StartKibanaPublicReqElbWhitelist elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
        return this;
    }

    public CloseKibanaPublicReq withElbWhiteList(Consumer<StartKibanaPublicReqElbWhitelist> elbWhiteListSetter) {
        if (this.elbWhiteList == null) {
            this.elbWhiteList = new StartKibanaPublicReqElbWhitelist();
            elbWhiteListSetter.accept(this.elbWhiteList);
        }

        return this;
    }

    /**
     * Get elbWhiteList
     * @return elbWhiteList
     */
    public StartKibanaPublicReqElbWhitelist getElbWhiteList() {
        return elbWhiteList;
    }

    public void setElbWhiteList(StartKibanaPublicReqElbWhitelist elbWhiteList) {
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
        CloseKibanaPublicReq closeKibanaPublicReq = (CloseKibanaPublicReq) o;
        return Objects.equals(this.eipSize, closeKibanaPublicReq.eipSize)
            && Objects.equals(this.elbWhiteList, closeKibanaPublicReq.elbWhiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipSize, elbWhiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloseKibanaPublicReq {\n");
        sb.append("    eipSize: ").append(toIndentedString(eipSize)).append("\n");
        sb.append("    elbWhiteList: ").append(toIndentedString(elbWhiteList)).append("\n");
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
