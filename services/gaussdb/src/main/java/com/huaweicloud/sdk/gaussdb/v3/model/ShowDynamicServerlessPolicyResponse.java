package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowDynamicServerlessPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_vcpus")

    private String currentVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_vcpus")

    private String minVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_vcpus")

    private String maxVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_vcpus")

    private List<String> availableVcpus = null;

    public ShowDynamicServerlessPolicyResponse withCurrentVcpus(String currentVcpus) {
        this.currentVcpus = currentVcpus;
        return this;
    }

    /**
     * **参数解释**：  当前动态Serverless算力。  **取值范围**：  available_vcpus中的可选算力，大于等于min_vcpus，并且小于等于max_vcpus。未开启动态Serverless时为null。
     * @return currentVcpus
     */
    public String getCurrentVcpus() {
        return currentVcpus;
    }

    public void setCurrentVcpus(String currentVcpus) {
        this.currentVcpus = currentVcpus;
    }

    public ShowDynamicServerlessPolicyResponse withMinVcpus(String minVcpus) {
        this.minVcpus = minVcpus;
        return this;
    }

    /**
     * **参数解释**：  最小动态Serverless算力。  **取值范围**：  available_vcpus中的可选算力，并且小于等于max_vcpus。未开启动态Serverless时为null。
     * @return minVcpus
     */
    public String getMinVcpus() {
        return minVcpus;
    }

    public void setMinVcpus(String minVcpus) {
        this.minVcpus = minVcpus;
    }

    public ShowDynamicServerlessPolicyResponse withMaxVcpus(String maxVcpus) {
        this.maxVcpus = maxVcpus;
        return this;
    }

    /**
     * **参数解释**：  最大动态Serverless算力。  **取值范围**：  available_vcpus中的可选算力，并且大于等于min_vcpus。未开启动态Serverless时为null。
     * @return maxVcpus
     */
    public String getMaxVcpus() {
        return maxVcpus;
    }

    public void setMaxVcpus(String maxVcpus) {
        this.maxVcpus = maxVcpus;
    }

    public ShowDynamicServerlessPolicyResponse withAvailableVcpus(List<String> availableVcpus) {
        this.availableVcpus = availableVcpus;
        return this;
    }

    public ShowDynamicServerlessPolicyResponse addAvailableVcpusItem(String availableVcpusItem) {
        if (this.availableVcpus == null) {
            this.availableVcpus = new ArrayList<>();
        }
        this.availableVcpus.add(availableVcpusItem);
        return this;
    }

    public ShowDynamicServerlessPolicyResponse withAvailableVcpus(Consumer<List<String>> availableVcpusSetter) {
        if (this.availableVcpus == null) {
            this.availableVcpus = new ArrayList<>();
        }
        availableVcpusSetter.accept(this.availableVcpus);
        return this;
    }

    /**
     * **参数解释**：  可选动态Serverless算力列表，不支持动态Serverless的实例该列表为空。  **取值范围**：  不涉及。
     * @return availableVcpus
     */
    public List<String> getAvailableVcpus() {
        return availableVcpus;
    }

    public void setAvailableVcpus(List<String> availableVcpus) {
        this.availableVcpus = availableVcpus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDynamicServerlessPolicyResponse that = (ShowDynamicServerlessPolicyResponse) obj;
        return Objects.equals(this.currentVcpus, that.currentVcpus) && Objects.equals(this.minVcpus, that.minVcpus)
            && Objects.equals(this.maxVcpus, that.maxVcpus) && Objects.equals(this.availableVcpus, that.availableVcpus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentVcpus, minVcpus, maxVcpus, availableVcpus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDynamicServerlessPolicyResponse {\n");
        sb.append("    currentVcpus: ").append(toIndentedString(currentVcpus)).append("\n");
        sb.append("    minVcpus: ").append(toIndentedString(minVcpus)).append("\n");
        sb.append("    maxVcpus: ").append(toIndentedString(maxVcpus)).append("\n");
        sb.append("    availableVcpus: ").append(toIndentedString(availableVcpus)).append("\n");
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
