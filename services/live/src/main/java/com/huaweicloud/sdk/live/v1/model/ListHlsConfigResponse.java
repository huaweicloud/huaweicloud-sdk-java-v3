package com.huaweicloud.sdk.live.v1.model;

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
public class ListHlsConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_domain")

    private String pushDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private List<PushDomainApplication> application = null;

    public ListHlsConfigResponse withPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }

    /**
     * 推流域名
     * @return pushDomain
     */
    public String getPushDomain() {
        return pushDomain;
    }

    public void setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
    }

    public ListHlsConfigResponse withApplication(List<PushDomainApplication> application) {
        this.application = application;
        return this;
    }

    public ListHlsConfigResponse addApplicationItem(PushDomainApplication applicationItem) {
        if (this.application == null) {
            this.application = new ArrayList<>();
        }
        this.application.add(applicationItem);
        return this;
    }

    public ListHlsConfigResponse withApplication(Consumer<List<PushDomainApplication>> applicationSetter) {
        if (this.application == null) {
            this.application = new ArrayList<>();
        }
        applicationSetter.accept(this.application);
        return this;
    }

    /**
     * 推流域名APP配置
     * @return application
     */
    public List<PushDomainApplication> getApplication() {
        return application;
    }

    public void setApplication(List<PushDomainApplication> application) {
        this.application = application;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHlsConfigResponse that = (ListHlsConfigResponse) obj;
        return Objects.equals(this.pushDomain, that.pushDomain) && Objects.equals(this.application, that.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pushDomain, application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHlsConfigResponse {\n");
        sb.append("    pushDomain: ").append(toIndentedString(pushDomain)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
