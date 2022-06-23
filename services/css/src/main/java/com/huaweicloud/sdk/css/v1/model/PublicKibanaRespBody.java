package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Kibana公网访问信息。
 */
public class PublicKibanaRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eipSize")

    private Integer eipSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elbWhiteList")

    private KibanaElbWhiteListResp elbWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicKibanaIp")

    private String publicKibanaIp;

    public PublicKibanaRespBody withEipSize(Integer eipSize) {
        this.eipSize = eipSize;
        return this;
    }

    /**
     * 带宽大小。
     * @return eipSize
     */
    public Integer getEipSize() {
        return eipSize;
    }

    public void setEipSize(Integer eipSize) {
        this.eipSize = eipSize;
    }

    public PublicKibanaRespBody withElbWhiteList(KibanaElbWhiteListResp elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
        return this;
    }

    public PublicKibanaRespBody withElbWhiteList(Consumer<KibanaElbWhiteListResp> elbWhiteListSetter) {
        if (this.elbWhiteList == null) {
            this.elbWhiteList = new KibanaElbWhiteListResp();
            elbWhiteListSetter.accept(this.elbWhiteList);
        }

        return this;
    }

    /**
     * Get elbWhiteList
     * @return elbWhiteList
     */
    public KibanaElbWhiteListResp getElbWhiteList() {
        return elbWhiteList;
    }

    public void setElbWhiteList(KibanaElbWhiteListResp elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
    }

    public PublicKibanaRespBody withPublicKibanaIp(String publicKibanaIp) {
        this.publicKibanaIp = publicKibanaIp;
        return this;
    }

    /**
     * kibana访问IP。
     * @return publicKibanaIp
     */
    public String getPublicKibanaIp() {
        return publicKibanaIp;
    }

    public void setPublicKibanaIp(String publicKibanaIp) {
        this.publicKibanaIp = publicKibanaIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicKibanaRespBody publicKibanaRespBody = (PublicKibanaRespBody) o;
        return Objects.equals(this.eipSize, publicKibanaRespBody.eipSize)
            && Objects.equals(this.elbWhiteList, publicKibanaRespBody.elbWhiteList)
            && Objects.equals(this.publicKibanaIp, publicKibanaRespBody.publicKibanaIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipSize, elbWhiteList, publicKibanaIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicKibanaRespBody {\n");
        sb.append("    eipSize: ").append(toIndentedString(eipSize)).append("\n");
        sb.append("    elbWhiteList: ").append(toIndentedString(elbWhiteList)).append("\n");
        sb.append("    publicKibanaIp: ").append(toIndentedString(publicKibanaIp)).append("\n");
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
