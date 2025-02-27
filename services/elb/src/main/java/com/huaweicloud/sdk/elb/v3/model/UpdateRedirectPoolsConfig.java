package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转发策略主机组的权重配置。当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。  使用说明： - 当action为REDIRECT_TO_POOL时，redirect_pool_id和redirect_pools_config必须指定一个，两个都指定时按redirect_pools_config生效。 - 当action是REDIRECT_TO_LISTENER和REDIRECT_TO_URL时，传入该字段会报错。 - 一个policy最多支持配置5个pool。Pool不允许重复。 - 仅支持全量覆盖。  [共享型负载均衡器下的转发策略不支持该字段，传入会报错。](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,srg,fcs,dt)  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt)
 */
public class UpdateRedirectPoolsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private String weight;

    public UpdateRedirectPoolsConfig withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 参数解释：所在后端服务器组ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public UpdateRedirectPoolsConfig withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 参数解释：转发策略主机组的权重。请求将根据该权重进行负载分发到不同的主机组。权重值越大，分发的请求越多。权重为0的后端不再接受新的请求。  取值范围：0-100
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRedirectPoolsConfig that = (UpdateRedirectPoolsConfig) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRedirectPoolsConfig {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
