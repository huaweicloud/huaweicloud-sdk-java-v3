package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class PatchNetworkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_name")

    private String networkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NetworkUpdateRequest body;

    public PatchNetworkRequest withNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * **参数解释**：网络资源名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return networkName
     */
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public PatchNetworkRequest withBody(NetworkUpdateRequest body) {
        this.body = body;
        return this;
    }

    public PatchNetworkRequest withBody(Consumer<NetworkUpdateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new NetworkUpdateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NetworkUpdateRequest getBody() {
        return body;
    }

    public void setBody(NetworkUpdateRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PatchNetworkRequest that = (PatchNetworkRequest) obj;
        return Objects.equals(this.networkName, that.networkName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchNetworkRequest {\n");
        sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
