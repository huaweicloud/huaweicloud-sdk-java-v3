package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVirsubnetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet")

    private Virsubnet virsubnet;

    public ShowVirsubnetResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **取值范围**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowVirsubnetResponse withVirsubnet(Virsubnet virsubnet) {
        this.virsubnet = virsubnet;
        return this;
    }

    public ShowVirsubnetResponse withVirsubnet(Consumer<Virsubnet> virsubnetSetter) {
        if (this.virsubnet == null) {
            this.virsubnet = new Virsubnet();
            virsubnetSetter.accept(this.virsubnet);
        }

        return this;
    }

    /**
     * Get virsubnet
     * @return virsubnet
     */
    public Virsubnet getVirsubnet() {
        return virsubnet;
    }

    public void setVirsubnet(Virsubnet virsubnet) {
        this.virsubnet = virsubnet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVirsubnetResponse that = (ShowVirsubnetResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.virsubnet, that.virsubnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, virsubnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVirsubnetResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    virsubnet: ").append(toIndentedString(virsubnet)).append("\n");
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
