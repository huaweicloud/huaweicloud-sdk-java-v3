package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建文件系统参数body
 */
public class CreateShareRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share")

    private Share share;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bss_param")

    private BssInfo bssParam;

    public CreateShareRequestBody withShare(Share share) {
        this.share = share;
        return this;
    }

    public CreateShareRequestBody withShare(Consumer<Share> shareSetter) {
        if (this.share == null) {
            this.share = new Share();
            shareSetter.accept(this.share);
        }

        return this;
    }

    /**
     * Get share
     * @return share
     */
    public Share getShare() {
        return share;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public CreateShareRequestBody withBssParam(BssInfo bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public CreateShareRequestBody withBssParam(Consumer<BssInfo> bssParamSetter) {
        if (this.bssParam == null) {
            this.bssParam = new BssInfo();
            bssParamSetter.accept(this.bssParam);
        }

        return this;
    }

    /**
     * Get bssParam
     * @return bssParam
     */
    public BssInfo getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssInfo bssParam) {
        this.bssParam = bssParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateShareRequestBody that = (CreateShareRequestBody) obj;
        return Objects.equals(this.share, that.share) && Objects.equals(this.bssParam, that.bssParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(share, bssParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShareRequestBody {\n");
        sb.append("    share: ").append(toIndentedString(share)).append("\n");
        sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
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
