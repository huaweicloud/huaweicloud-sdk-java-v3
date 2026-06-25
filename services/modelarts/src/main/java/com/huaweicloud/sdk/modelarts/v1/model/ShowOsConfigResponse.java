package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowOsConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkCidrs")

    private List<String> networkCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkQuota")

    private Integer networkQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolQuota")

    private Integer poolQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolHighAvailable")

    private Boolean poolHighAvailable;

    public ShowOsConfigResponse withNetworkCidrs(List<String> networkCidrs) {
        this.networkCidrs = networkCidrs;
        return this;
    }

    public ShowOsConfigResponse addNetworkCidrsItem(String networkCidrsItem) {
        if (this.networkCidrs == null) {
            this.networkCidrs = new ArrayList<>();
        }
        this.networkCidrs.add(networkCidrsItem);
        return this;
    }

    public ShowOsConfigResponse withNetworkCidrs(Consumer<List<String>> networkCidrsSetter) {
        if (this.networkCidrs == null) {
            this.networkCidrs = new ArrayList<>();
        }
        networkCidrsSetter.accept(this.networkCidrs);
        return this;
    }

    /**
     * **参数解释**：网络配置项。
     * @return networkCidrs
     */
    public List<String> getNetworkCidrs() {
        return networkCidrs;
    }

    public void setNetworkCidrs(List<String> networkCidrs) {
        this.networkCidrs = networkCidrs;
    }

    public ShowOsConfigResponse withNetworkQuota(Integer networkQuota) {
        this.networkQuota = networkQuota;
        return this;
    }

    /**
     * **参数解释**：用户可创建网络个数配额。 **取值范围**：不涉及
     * @return networkQuota
     */
    public Integer getNetworkQuota() {
        return networkQuota;
    }

    public void setNetworkQuota(Integer networkQuota) {
        this.networkQuota = networkQuota;
    }

    public ShowOsConfigResponse withPoolQuota(Integer poolQuota) {
        this.poolQuota = poolQuota;
        return this;
    }

    /**
     * **参数解释**：用户可创建资源池个数配额。 **取值范围**：不涉及
     * @return poolQuota
     */
    public Integer getPoolQuota() {
        return poolQuota;
    }

    public void setPoolQuota(Integer poolQuota) {
        this.poolQuota = poolQuota;
    }

    public ShowOsConfigResponse withPoolHighAvailable(Boolean poolHighAvailable) {
        this.poolHighAvailable = poolHighAvailable;
        return this;
    }

    /**
     * **参数解释**：当前环境/局点是否支持创建高可用资源池。 **取值范围**： - true：支持 - false：不支持
     * @return poolHighAvailable
     */
    public Boolean getPoolHighAvailable() {
        return poolHighAvailable;
    }

    public void setPoolHighAvailable(Boolean poolHighAvailable) {
        this.poolHighAvailable = poolHighAvailable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOsConfigResponse that = (ShowOsConfigResponse) obj;
        return Objects.equals(this.networkCidrs, that.networkCidrs)
            && Objects.equals(this.networkQuota, that.networkQuota) && Objects.equals(this.poolQuota, that.poolQuota)
            && Objects.equals(this.poolHighAvailable, that.poolHighAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkCidrs, networkQuota, poolQuota, poolHighAvailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOsConfigResponse {\n");
        sb.append("    networkCidrs: ").append(toIndentedString(networkCidrs)).append("\n");
        sb.append("    networkQuota: ").append(toIndentedString(networkQuota)).append("\n");
        sb.append("    poolQuota: ").append(toIndentedString(poolQuota)).append("\n");
        sb.append("    poolHighAvailable: ").append(toIndentedString(poolHighAvailable)).append("\n");
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
