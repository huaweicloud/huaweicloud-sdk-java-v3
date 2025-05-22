package com.huaweicloud.sdk.dws.v2.model;

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
public class ListClusterEndpointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_endpoints")

    private PublicEndpointResponse publicEndpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_endpoints")

    private PrivateEndpointResponse privateEndpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_infos")

    private List<PublicIpInfoResponse> publicIpInfos = null;

    public ListClusterEndpointsResponse withPublicEndpoints(PublicEndpointResponse publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
        return this;
    }

    public ListClusterEndpointsResponse withPublicEndpoints(Consumer<PublicEndpointResponse> publicEndpointsSetter) {
        if (this.publicEndpoints == null) {
            this.publicEndpoints = new PublicEndpointResponse();
            publicEndpointsSetter.accept(this.publicEndpoints);
        }

        return this;
    }

    /**
     * Get publicEndpoints
     * @return publicEndpoints
     */
    public PublicEndpointResponse getPublicEndpoints() {
        return publicEndpoints;
    }

    public void setPublicEndpoints(PublicEndpointResponse publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
    }

    public ListClusterEndpointsResponse withPrivateEndpoints(PrivateEndpointResponse privateEndpoints) {
        this.privateEndpoints = privateEndpoints;
        return this;
    }

    public ListClusterEndpointsResponse withPrivateEndpoints(Consumer<PrivateEndpointResponse> privateEndpointsSetter) {
        if (this.privateEndpoints == null) {
            this.privateEndpoints = new PrivateEndpointResponse();
            privateEndpointsSetter.accept(this.privateEndpoints);
        }

        return this;
    }

    /**
     * Get privateEndpoints
     * @return privateEndpoints
     */
    public PrivateEndpointResponse getPrivateEndpoints() {
        return privateEndpoints;
    }

    public void setPrivateEndpoints(PrivateEndpointResponse privateEndpoints) {
        this.privateEndpoints = privateEndpoints;
    }

    public ListClusterEndpointsResponse withPublicIpInfos(List<PublicIpInfoResponse> publicIpInfos) {
        this.publicIpInfos = publicIpInfos;
        return this;
    }

    public ListClusterEndpointsResponse addPublicIpInfosItem(PublicIpInfoResponse publicIpInfosItem) {
        if (this.publicIpInfos == null) {
            this.publicIpInfos = new ArrayList<>();
        }
        this.publicIpInfos.add(publicIpInfosItem);
        return this;
    }

    public ListClusterEndpointsResponse withPublicIpInfos(Consumer<List<PublicIpInfoResponse>> publicIpInfosSetter) {
        if (this.publicIpInfos == null) {
            this.publicIpInfos = new ArrayList<>();
        }
        publicIpInfosSetter.accept(this.publicIpInfos);
        return this;
    }

    /**
     * **参数解释**： 公网IP详细信息，显示每个节点当前是否绑定公网IP及对应状态。 **取值范围**： 不涉及。
     * @return publicIpInfos
     */
    public List<PublicIpInfoResponse> getPublicIpInfos() {
        return publicIpInfos;
    }

    public void setPublicIpInfos(List<PublicIpInfoResponse> publicIpInfos) {
        this.publicIpInfos = publicIpInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterEndpointsResponse that = (ListClusterEndpointsResponse) obj;
        return Objects.equals(this.publicEndpoints, that.publicEndpoints)
            && Objects.equals(this.privateEndpoints, that.privateEndpoints)
            && Objects.equals(this.publicIpInfos, that.publicIpInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicEndpoints, privateEndpoints, publicIpInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterEndpointsResponse {\n");
        sb.append("    publicEndpoints: ").append(toIndentedString(publicEndpoints)).append("\n");
        sb.append("    privateEndpoints: ").append(toIndentedString(privateEndpoints)).append("\n");
        sb.append("    publicIpInfos: ").append(toIndentedString(publicIpInfos)).append("\n");
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
