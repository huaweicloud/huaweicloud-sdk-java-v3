package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SslOptionRequest */
public class SslOptionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    private Boolean sslOption;

    public SslOptionRequest withSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /** - true, 打开ssl开关。 - false, 关闭ssl开关。
     * 
     * @return sslOption */
    public Boolean getSslOption() {
        return sslOption;
    }

    public void setSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SslOptionRequest sslOptionRequest = (SslOptionRequest) o;
        return Objects.equals(this.sslOption, sslOptionRequest.sslOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sslOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SslOptionRequest {\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
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
