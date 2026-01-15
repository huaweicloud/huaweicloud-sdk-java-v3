package com.huaweicloud.sdk.css.v1.model;

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
public class ShowAiOpsDetectorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_detection")

    private List<AiOpsDetector> fullDetection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailability_detection")

    private List<AiOpsDetector> unavailabilityDetection = null;

    public ShowAiOpsDetectorResponse withFullDetection(List<AiOpsDetector> fullDetection) {
        this.fullDetection = fullDetection;
        return this;
    }

    public ShowAiOpsDetectorResponse addFullDetectionItem(AiOpsDetector fullDetectionItem) {
        if (this.fullDetection == null) {
            this.fullDetection = new ArrayList<>();
        }
        this.fullDetection.add(fullDetectionItem);
        return this;
    }

    public ShowAiOpsDetectorResponse withFullDetection(Consumer<List<AiOpsDetector>> fullDetectionSetter) {
        if (this.fullDetection == null) {
            this.fullDetection = new ArrayList<>();
        }
        fullDetectionSetter.accept(this.fullDetection);
        return this;
    }

    /**
     * **参数解释**： 全量检测项，返回所有可用检测项ID、名称，以及检测描述。 **取值范围**： 不涉及
     * @return fullDetection
     */
    public List<AiOpsDetector> getFullDetection() {
        return fullDetection;
    }

    public void setFullDetection(List<AiOpsDetector> fullDetection) {
        this.fullDetection = fullDetection;
    }

    public ShowAiOpsDetectorResponse withUnavailabilityDetection(List<AiOpsDetector> unavailabilityDetection) {
        this.unavailabilityDetection = unavailabilityDetection;
        return this;
    }

    public ShowAiOpsDetectorResponse addUnavailabilityDetectionItem(AiOpsDetector unavailabilityDetectionItem) {
        if (this.unavailabilityDetection == null) {
            this.unavailabilityDetection = new ArrayList<>();
        }
        this.unavailabilityDetection.add(unavailabilityDetectionItem);
        return this;
    }

    public ShowAiOpsDetectorResponse withUnavailabilityDetection(
        Consumer<List<AiOpsDetector>> unavailabilityDetectionSetter) {
        if (this.unavailabilityDetection == null) {
            this.unavailabilityDetection = new ArrayList<>();
        }
        unavailabilityDetectionSetter.accept(this.unavailabilityDetection);
        return this;
    }

    /**
     * **参数解释**： 集群不可用检测项，返回所有集群不可用分类的检测项ID、名称，以及检测描述。 **取值范围**： 不涉及
     * @return unavailabilityDetection
     */
    public List<AiOpsDetector> getUnavailabilityDetection() {
        return unavailabilityDetection;
    }

    public void setUnavailabilityDetection(List<AiOpsDetector> unavailabilityDetection) {
        this.unavailabilityDetection = unavailabilityDetection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAiOpsDetectorResponse that = (ShowAiOpsDetectorResponse) obj;
        return Objects.equals(this.fullDetection, that.fullDetection)
            && Objects.equals(this.unavailabilityDetection, that.unavailabilityDetection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullDetection, unavailabilityDetection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAiOpsDetectorResponse {\n");
        sb.append("    fullDetection: ").append(toIndentedString(fullDetection)).append("\n");
        sb.append("    unavailabilityDetection: ").append(toIndentedString(unavailabilityDetection)).append("\n");
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
