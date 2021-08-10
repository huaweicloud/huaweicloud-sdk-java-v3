package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 配置云服务器的弹性IP信息 */
public class PublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private EipInfo eip;

    public PublicIp withEip(EipInfo eip) {
        this.eip = eip;
        return this;
    }

    public PublicIp withEip(Consumer<EipInfo> eipSetter) {
        if (this.eip == null) {
            this.eip = new EipInfo();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /** Get eip
     * 
     * @return eip */
    public EipInfo getEip() {
        return eip;
    }

    public void setEip(EipInfo eip) {
        this.eip = eip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicIp publicIp = (PublicIp) o;
        return Objects.equals(this.eip, publicIp.eip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
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
