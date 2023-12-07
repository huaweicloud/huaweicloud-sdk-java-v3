package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开关数据库代理SSL加密请求体。
 */
public class SwitchProxySSLRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    private Boolean sslOption;

    public SwitchProxySSLRequest withSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /**
     * SSL数据加密开关设置。    取值范围： - true: 开启SSL数据加密。 - false: 关闭SSL数据加密。
     * @return sslOption
     */
    public Boolean getSslOption() {
        return sslOption;
    }

    public void setSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchProxySSLRequest that = (SwitchProxySSLRequest) obj;
        return Objects.equals(this.sslOption, that.sslOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sslOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchProxySSLRequest {\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
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
