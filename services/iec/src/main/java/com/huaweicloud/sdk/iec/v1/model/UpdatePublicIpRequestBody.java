package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新弹性公网IP请求数据 */
public class UpdatePublicIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private UpdatePublicIpOption publicip;

    public UpdatePublicIpRequestBody withPublicip(UpdatePublicIpOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public UpdatePublicIpRequestBody withPublicip(Consumer<UpdatePublicIpOption> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new UpdatePublicIpOption();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /** Get publicip
     * 
     * @return publicip */
    public UpdatePublicIpOption getPublicip() {
        return publicip;
    }

    public void setPublicip(UpdatePublicIpOption publicip) {
        this.publicip = publicip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePublicIpRequestBody updatePublicIpRequestBody = (UpdatePublicIpRequestBody) o;
        return Objects.equals(this.publicip, updatePublicIpRequestBody.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicIpRequestBody {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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
