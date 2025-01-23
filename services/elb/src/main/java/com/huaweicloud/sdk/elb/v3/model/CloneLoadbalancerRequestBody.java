package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 复制负载均衡器接口请求体。
 */
public class CloneLoadbalancerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_loadbalancer_param")

    private TargetLoadbalancerParam targetLoadbalancerParam;

    public CloneLoadbalancerRequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 参数解释：单次最大复制数量。  取值范围：1-10  默认取值：1
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CloneLoadbalancerRequestBody withTargetLoadbalancerParam(TargetLoadbalancerParam targetLoadbalancerParam) {
        this.targetLoadbalancerParam = targetLoadbalancerParam;
        return this;
    }

    public CloneLoadbalancerRequestBody withTargetLoadbalancerParam(
        Consumer<TargetLoadbalancerParam> targetLoadbalancerParamSetter) {
        if (this.targetLoadbalancerParam == null) {
            this.targetLoadbalancerParam = new TargetLoadbalancerParam();
            targetLoadbalancerParamSetter.accept(this.targetLoadbalancerParam);
        }

        return this;
    }

    /**
     * Get targetLoadbalancerParam
     * @return targetLoadbalancerParam
     */
    public TargetLoadbalancerParam getTargetLoadbalancerParam() {
        return targetLoadbalancerParam;
    }

    public void setTargetLoadbalancerParam(TargetLoadbalancerParam targetLoadbalancerParam) {
        this.targetLoadbalancerParam = targetLoadbalancerParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneLoadbalancerRequestBody that = (CloneLoadbalancerRequestBody) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.targetLoadbalancerParam, that.targetLoadbalancerParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, targetLoadbalancerParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneLoadbalancerRequestBody {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    targetLoadbalancerParam: ").append(toIndentedString(targetLoadbalancerParam)).append("\n");
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
