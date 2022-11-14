package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSourceIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private List<IpsItem> sourceIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modify")

    private Long lastModify;

    public ShowSourceIpResponse withSourceIp(List<IpsItem> sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    public ShowSourceIpResponse addSourceIpItem(IpsItem sourceIpItem) {
        if (this.sourceIp == null) {
            this.sourceIp = new ArrayList<>();
        }
        this.sourceIp.add(sourceIpItem);
        return this;
    }

    public ShowSourceIpResponse withSourceIp(Consumer<List<IpsItem>> sourceIpSetter) {
        if (this.sourceIp == null) {
            this.sourceIp = new ArrayList<>();
        }
        sourceIpSetter.accept(this.sourceIp);
        return this;
    }

    /**
     * 源站信息列表
     * @return sourceIp
     */
    public List<IpsItem> getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(List<IpsItem> sourceIp) {
        this.sourceIp = sourceIp;
    }

    public ShowSourceIpResponse withLastModify(Long lastModify) {
        this.lastModify = lastModify;
        return this;
    }

    /**
     * 回源Ip最后更新时间
     * @return lastModify
     */
    public Long getLastModify() {
        return lastModify;
    }

    public void setLastModify(Long lastModify) {
        this.lastModify = lastModify;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSourceIpResponse showSourceIpResponse = (ShowSourceIpResponse) o;
        return Objects.equals(this.sourceIp, showSourceIpResponse.sourceIp)
            && Objects.equals(this.lastModify, showSourceIpResponse.lastModify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceIp, lastModify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSourceIpResponse {\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    lastModify: ").append(toIndentedString(lastModify)).append("\n");
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
