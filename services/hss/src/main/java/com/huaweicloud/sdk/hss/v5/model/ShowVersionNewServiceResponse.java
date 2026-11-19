package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVersionNewServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_version")

    private String containerVersion;

    public ShowVersionNewServiceResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 租户最高主机版本 **取值范围**: - hss.version.basic：基础版 - hss.version.advanced：高级版 - hss.version.enterprise：企业版 - hss.version.premium：旗舰版 - hss.version.wtp：网页防篡改版 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowVersionNewServiceResponse withContainerVersion(String containerVersion) {
        this.containerVersion = containerVersion;
        return this;
    }

    /**
     * **参数解释**: 租户最高容器版本 **取值范围**: - hss.version.container：容器版 
     * @return containerVersion
     */
    public String getContainerVersion() {
        return containerVersion;
    }

    public void setContainerVersion(String containerVersion) {
        this.containerVersion = containerVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVersionNewServiceResponse that = (ShowVersionNewServiceResponse) obj;
        return Objects.equals(this.version, that.version)
            && Objects.equals(this.containerVersion, that.containerVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, containerVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVersionNewServiceResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    containerVersion: ").append(toIndentedString(containerVersion)).append("\n");
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
