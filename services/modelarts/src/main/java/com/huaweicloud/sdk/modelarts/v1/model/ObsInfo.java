package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：obs信息。  **约束限制**：不涉及。
 */
public class ObsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cann_path")

    private String cannPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_path")

    private String devicePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_path")

    private String hostPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_or_infer_path")

    private String trainOrInferPath;

    public ObsInfo withCannPath(String cannPath) {
        this.cannPath = cannPath;
        return this;
    }

    /**
     * **参数解释**：CANN应用类日志路径。 **约束限制**：不涉及。 **取值范围**：[0,2048]。 **默认取值**：不涉及。
     * @return cannPath
     */
    public String getCannPath() {
        return cannPath;
    }

    public void setCannPath(String cannPath) {
        this.cannPath = cannPath;
    }

    public ObsInfo withDevicePath(String devicePath) {
        this.devicePath = devicePath;
        return this;
    }

    /**
     * **参数解释**：Device侧日志路径。  **约束限制**：不涉及。 **取值范围**：[0,2048]。 **默认取值**：不涉及。
     * @return devicePath
     */
    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public ObsInfo withHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * **参数解释**：Host OS日志路径。 **约束限制**：不涉及。  **取值范围**：[0,2048]。 **默认取值**：不涉及。
     * @return hostPath
     */
    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    public ObsInfo withTrainOrInferPath(String trainOrInferPath) {
        this.trainOrInferPath = trainOrInferPath;
        return this;
    }

    /**
     * **参数解释**：训练及推理日志路径。 **约束限制**：不涉及。 **取值范围**：[0,2048]。 **默认取值**：不涉及。
     * @return trainOrInferPath
     */
    public String getTrainOrInferPath() {
        return trainOrInferPath;
    }

    public void setTrainOrInferPath(String trainOrInferPath) {
        this.trainOrInferPath = trainOrInferPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsInfo that = (ObsInfo) obj;
        return Objects.equals(this.cannPath, that.cannPath) && Objects.equals(this.devicePath, that.devicePath)
            && Objects.equals(this.hostPath, that.hostPath)
            && Objects.equals(this.trainOrInferPath, that.trainOrInferPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cannPath, devicePath, hostPath, trainOrInferPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsInfo {\n");
        sb.append("    cannPath: ").append(toIndentedString(cannPath)).append("\n");
        sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
        sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
        sb.append("    trainOrInferPath: ").append(toIndentedString(trainOrInferPath)).append("\n");
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
