package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowElbDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverCertName")

    private String serverCertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverCertId")

    private String serverCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cacertName")

    private String cacertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cacertId")

    private String cacertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_enable")

    private Boolean elbEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_type")

    private String authenticationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadBalancer")

    private EsLoadBalancerResource loadBalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitors")

    private EsHealthmonitorsResource healthmonitors;

    public ShowElbDetailResponse withServerCertName(String serverCertName) {
        this.serverCertName = serverCertName;
        return this;
    }

    /**
     * 服务器证书名称。
     * @return serverCertName
     */
    public String getServerCertName() {
        return serverCertName;
    }

    public void setServerCertName(String serverCertName) {
        this.serverCertName = serverCertName;
    }

    public ShowElbDetailResponse withServerCertId(String serverCertId) {
        this.serverCertId = serverCertId;
        return this;
    }

    /**
     * 服务器证书ID。
     * @return serverCertId
     */
    public String getServerCertId() {
        return serverCertId;
    }

    public void setServerCertId(String serverCertId) {
        this.serverCertId = serverCertId;
    }

    public ShowElbDetailResponse withCacertName(String cacertName) {
        this.cacertName = cacertName;
        return this;
    }

    /**
     * ca证书名称。
     * @return cacertName
     */
    public String getCacertName() {
        return cacertName;
    }

    public void setCacertName(String cacertName) {
        this.cacertName = cacertName;
    }

    public ShowElbDetailResponse withCacertId(String cacertId) {
        this.cacertId = cacertId;
        return this;
    }

    /**
     * ca证书ID。
     * @return cacertId
     */
    public String getCacertId() {
        return cacertId;
    }

    public void setCacertId(String cacertId) {
        this.cacertId = cacertId;
    }

    public ShowElbDetailResponse withElbEnable(Boolean elbEnable) {
        this.elbEnable = elbEnable;
        return this;
    }

    /**
     * elb开关信息。
     * @return elbEnable
     */
    public Boolean getElbEnable() {
        return elbEnable;
    }

    public void setElbEnable(Boolean elbEnable) {
        this.elbEnable = elbEnable;
    }

    public ShowElbDetailResponse withAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * 认证方式。
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public ShowElbDetailResponse withLoadBalancer(EsLoadBalancerResource loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    public ShowElbDetailResponse withLoadBalancer(Consumer<EsLoadBalancerResource> loadBalancerSetter) {
        if (this.loadBalancer == null) {
            this.loadBalancer = new EsLoadBalancerResource();
            loadBalancerSetter.accept(this.loadBalancer);
        }

        return this;
    }

    /**
     * Get loadBalancer
     * @return loadBalancer
     */
    public EsLoadBalancerResource getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(EsLoadBalancerResource loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    public ShowElbDetailResponse withHealthmonitors(EsHealthmonitorsResource healthmonitors) {
        this.healthmonitors = healthmonitors;
        return this;
    }

    public ShowElbDetailResponse withHealthmonitors(Consumer<EsHealthmonitorsResource> healthmonitorsSetter) {
        if (this.healthmonitors == null) {
            this.healthmonitors = new EsHealthmonitorsResource();
            healthmonitorsSetter.accept(this.healthmonitors);
        }

        return this;
    }

    /**
     * Get healthmonitors
     * @return healthmonitors
     */
    public EsHealthmonitorsResource getHealthmonitors() {
        return healthmonitors;
    }

    public void setHealthmonitors(EsHealthmonitorsResource healthmonitors) {
        this.healthmonitors = healthmonitors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowElbDetailResponse that = (ShowElbDetailResponse) obj;
        return Objects.equals(this.serverCertName, that.serverCertName)
            && Objects.equals(this.serverCertId, that.serverCertId) && Objects.equals(this.cacertName, that.cacertName)
            && Objects.equals(this.cacertId, that.cacertId) && Objects.equals(this.elbEnable, that.elbEnable)
            && Objects.equals(this.authenticationType, that.authenticationType)
            && Objects.equals(this.loadBalancer, that.loadBalancer)
            && Objects.equals(this.healthmonitors, that.healthmonitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverCertName,
            serverCertId,
            cacertName,
            cacertId,
            elbEnable,
            authenticationType,
            loadBalancer,
            healthmonitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowElbDetailResponse {\n");
        sb.append("    serverCertName: ").append(toIndentedString(serverCertName)).append("\n");
        sb.append("    serverCertId: ").append(toIndentedString(serverCertId)).append("\n");
        sb.append("    cacertName: ").append(toIndentedString(cacertName)).append("\n");
        sb.append("    cacertId: ").append(toIndentedString(cacertId)).append("\n");
        sb.append("    elbEnable: ").append(toIndentedString(elbEnable)).append("\n");
        sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
        sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
        sb.append("    healthmonitors: ").append(toIndentedString(healthmonitors)).append("\n");
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
