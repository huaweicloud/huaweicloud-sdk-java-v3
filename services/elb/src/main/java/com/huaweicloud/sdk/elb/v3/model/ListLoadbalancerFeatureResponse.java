package com.huaweicloud.sdk.elb.v3.model;

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
public class ListLoadbalancerFeatureResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private List<LoadbalancerFeature> features = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListLoadbalancerFeatureResponse withFeatures(List<LoadbalancerFeature> features) {
        this.features = features;
        return this;
    }

    public ListLoadbalancerFeatureResponse addFeaturesItem(LoadbalancerFeature featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    public ListLoadbalancerFeatureResponse withFeatures(Consumer<List<LoadbalancerFeature>> featuresSetter) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        featuresSetter.accept(this.features);
        return this;
    }

    /**
     * **参数解释**：ELB实例特性信息列表。
     * @return features
     */
    public List<LoadbalancerFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<LoadbalancerFeature> features) {
        this.features = features;
    }

    public ListLoadbalancerFeatureResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLoadbalancerFeatureResponse that = (ListLoadbalancerFeatureResponse) obj;
        return Objects.equals(this.features, that.features) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoadbalancerFeatureResponse {\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
