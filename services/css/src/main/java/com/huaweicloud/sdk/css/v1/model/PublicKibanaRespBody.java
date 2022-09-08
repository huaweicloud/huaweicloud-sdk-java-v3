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
    @JsonProperty(value = "elbWhiteListResp")

    private KibanaElbWhiteListResp elbWhiteListResp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicKibanaIp")

    private String publicKibanaIp;

    public PublicKibanaRespBody withEipSize(Integer eipSize) {
        this.eipSize = eipSize;
        return this;
    }

    /**
     * 带宽大小。单位：Mbit/s
     * @return eipSize
     */
    public Integer getEipSize() {
        return eipSize;
    }

    public void setEipSize(Integer eipSize) {
        this.eipSize = eipSize;
    }

    public PublicKibanaRespBody withElbWhiteListResp(KibanaElbWhiteListResp elbWhiteListResp) {
        this.elbWhiteListResp = elbWhiteListResp;
        return this;
    }

    public PublicKibanaRespBody withElbWhiteListResp(Consumer<KibanaElbWhiteListResp> elbWhiteListRespSetter) {
        if (this.elbWhiteListResp == null) {
            this.elbWhiteListResp = new KibanaElbWhiteListResp();
            elbWhiteListRespSetter.accept(this.elbWhiteListResp);
        }

        return this;
    }

    /**
     * Get elbWhiteListResp
     * @return elbWhiteListResp
     */
    public KibanaElbWhiteListResp getElbWhiteListResp() {
        return elbWhiteListResp;
    }

    public void setElbWhiteListResp(KibanaElbWhiteListResp elbWhiteListResp) {
        this.elbWhiteListResp = elbWhiteListResp;
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
            && Objects.equals(this.elbWhiteListResp, publicKibanaRespBody.elbWhiteListResp)
            && Objects.equals(this.publicKibanaIp, publicKibanaRespBody.publicKibanaIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipSize, elbWhiteListResp, publicKibanaIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicKibanaRespBody {\n");
        sb.append("    eipSize: ").append(toIndentedString(eipSize)).append("\n");
        sb.append("    elbWhiteListResp: ").append(toIndentedString(elbWhiteListResp)).append("\n");
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
