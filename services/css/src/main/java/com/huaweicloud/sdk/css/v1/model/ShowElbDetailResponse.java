package com.huaweicloud.sdk.css.v1.model;

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

    private LoadBalancer loadBalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private Elbv3Listener listener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitors")

    private List<Member> healthmonitors = null;

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
     * 是否开启elb。 - true: 打开elb - false： 关闭elb
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

    public ShowElbDetailResponse withLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    public ShowElbDetailResponse withLoadBalancer(Consumer<LoadBalancer> loadBalancerSetter) {
        if (this.loadBalancer == null) {
            this.loadBalancer = new LoadBalancer();
            loadBalancerSetter.accept(this.loadBalancer);
        }

        return this;
    }

    /**
     * Get loadBalancer
     * @return loadBalancer
     */
    public LoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    public ShowElbDetailResponse withListener(Elbv3Listener listener) {
        this.listener = listener;
        return this;
    }

    public ShowElbDetailResponse withListener(Consumer<Elbv3Listener> listenerSetter) {
        if (this.listener == null) {
            this.listener = new Elbv3Listener();
            listenerSetter.accept(this.listener);
        }

        return this;
    }

    /**
     * Get listener
     * @return listener
     */
    public Elbv3Listener getListener() {
        return listener;
    }

    public void setListener(Elbv3Listener listener) {
        this.listener = listener;
    }

    public ShowElbDetailResponse withHealthmonitors(List<Member> healthmonitors) {
        this.healthmonitors = healthmonitors;
        return this;
    }

    public ShowElbDetailResponse addHealthmonitorsItem(Member healthmonitorsItem) {
        if (this.healthmonitors == null) {
            this.healthmonitors = new ArrayList<>();
        }
        this.healthmonitors.add(healthmonitorsItem);
        return this;
    }

    public ShowElbDetailResponse withHealthmonitors(Consumer<List<Member>> healthmonitorsSetter) {
        if (this.healthmonitors == null) {
            this.healthmonitors = new ArrayList<>();
        }
        healthmonitorsSetter.accept(this.healthmonitors);
        return this;
    }

    /**
     * 健康检查结果集合。
     * @return healthmonitors
     */
    public List<Member> getHealthmonitors() {
        return healthmonitors;
    }

    public void setHealthmonitors(List<Member> healthmonitors) {
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
            && Objects.equals(this.loadBalancer, that.loadBalancer) && Objects.equals(this.listener, that.listener)
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
            listener,
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
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
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
