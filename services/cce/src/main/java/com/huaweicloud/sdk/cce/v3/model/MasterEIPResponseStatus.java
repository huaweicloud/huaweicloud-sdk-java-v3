package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 状态信息 **约束限制**： 不涉及 
 */
public class MasterEIPResponseStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateEndpoint")

    private String privateEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicEndpoint")

    private String publicEndpoint;

    public MasterEIPResponseStatus withPrivateEndpoint(String privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * **参数解释**： 集群访问的PrivateIP(HA集群返回VIP) **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return privateEndpoint
     */
    public String getPrivateEndpoint() {
        return privateEndpoint;
    }

    public void setPrivateEndpoint(String privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
    }

    public MasterEIPResponseStatus withPublicEndpoint(String publicEndpoint) {
        this.publicEndpoint = publicEndpoint;
        return this;
    }

    /**
     * **参数解释**： 集群访问的PublicIP **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return publicEndpoint
     */
    public String getPublicEndpoint() {
        return publicEndpoint;
    }

    public void setPublicEndpoint(String publicEndpoint) {
        this.publicEndpoint = publicEndpoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MasterEIPResponseStatus that = (MasterEIPResponseStatus) obj;
        return Objects.equals(this.privateEndpoint, that.privateEndpoint)
            && Objects.equals(this.publicEndpoint, that.publicEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateEndpoint, publicEndpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MasterEIPResponseStatus {\n");
        sb.append("    privateEndpoint: ").append(toIndentedString(privateEndpoint)).append("\n");
        sb.append("    publicEndpoint: ").append(toIndentedString(publicEndpoint)).append("\n");
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
