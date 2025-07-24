package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 按需转包周期请求体参数
 */
public class ChangeShareChargeModeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bss_param")

    private BssInfo bssParam;

    public ChangeShareChargeModeRequestBody withBssParam(BssInfo bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public ChangeShareChargeModeRequestBody withBssParam(Consumer<BssInfo> bssParamSetter) {
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
        ChangeShareChargeModeRequestBody that = (ChangeShareChargeModeRequestBody) obj;
        return Objects.equals(this.bssParam, that.bssParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bssParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeShareChargeModeRequestBody {\n");
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
