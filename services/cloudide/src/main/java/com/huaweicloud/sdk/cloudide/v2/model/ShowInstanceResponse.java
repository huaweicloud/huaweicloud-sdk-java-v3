package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    @JacksonXmlProperty(localName = "instance")

    private InstancesVO instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bundle_url")

    @JacksonXmlProperty(localName = "bundle_url")

    private String bundleUrl;

    public ShowInstanceResponse withInstance(InstancesVO instance) {
        this.instance = instance;
        return this;
    }

    public ShowInstanceResponse withInstance(Consumer<InstancesVO> instanceSetter) {
        if (this.instance == null) {
            this.instance = new InstancesVO();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public InstancesVO getInstance() {
        return instance;
    }

    public void setInstance(InstancesVO instance) {
        this.instance = instance;
    }

    public ShowInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceResponse withBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
        return this;
    }

    /**
     * 静态资源链接
     * @return bundleUrl
     */
    public String getBundleUrl() {
        return bundleUrl;
    }

    public void setBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceResponse showInstanceResponse = (ShowInstanceResponse) o;
        return Objects.equals(this.instance, showInstanceResponse.instance)
            && Objects.equals(this.status, showInstanceResponse.status)
            && Objects.equals(this.bundleUrl, showInstanceResponse.bundleUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, status, bundleUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResponse {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bundleUrl: ").append(toIndentedString(bundleUrl)).append("\n");
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
