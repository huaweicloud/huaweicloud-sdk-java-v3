package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VersionModelVersionMasterQueryDTO
 */
public class VersionModelVersionMasterQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decrypt")

    private Boolean decrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private Integer iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterId")

    private String masterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public VersionModelVersionMasterQueryDTO withDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
        return this;
    }

    /**
     * **参数解释：**  是否加密。  **取值范围：**  - true：加密。 - false：不加密。  **默认取值：**  false。 
     * @return decrypt
     */
    public Boolean getDecrypt() {
        return decrypt;
    }

    public void setDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
    }

    public VersionModelVersionMasterQueryDTO withIteration(Integer iteration) {
        this.iteration = iteration;
        return this;
    }

    /**
     * **参数解释：**  迭代版本。如果此参数为空，则返回M-V模型实例的最新版本信息。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return iteration
     */
    public Integer getIteration() {
        return iteration;
    }

    public void setIteration(Integer iteration) {
        this.iteration = iteration;
    }

    public VersionModelVersionMasterQueryDTO withMasterId(String masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * **参数解释：**  主对象ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return masterId
     */
    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public VersionModelVersionMasterQueryDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：**  版本号。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionModelVersionMasterQueryDTO that = (VersionModelVersionMasterQueryDTO) obj;
        return Objects.equals(this.decrypt, that.decrypt) && Objects.equals(this.iteration, that.iteration)
            && Objects.equals(this.masterId, that.masterId) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decrypt, iteration, masterId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelVersionMasterQueryDTO {\n");
        sb.append("    decrypt: ").append(toIndentedString(decrypt)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
