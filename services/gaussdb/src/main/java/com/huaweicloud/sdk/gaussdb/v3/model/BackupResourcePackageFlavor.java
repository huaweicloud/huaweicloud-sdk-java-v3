package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**:  备份资源包规格。
 */
public class BackupResourcePackageFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spce_code")

    private String spceCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private String volume;

    public BackupResourcePackageFlavor withSpceCode(String spceCode) {
        this.spceCode = spceCode;
        return this;
    }

    /**
     * **参数解释**：  备份资源包规格码。  **取值范围**：  不涉及。 
     * @return spceCode
     */
    public String getSpceCode() {
        return spceCode;
    }

    public void setSpceCode(String spceCode) {
        this.spceCode = spceCode;
    }

    public BackupResourcePackageFlavor withVolume(String volume) {
        this.volume = volume;
        return this;
    }

    /**
     * **参数解释**：  备份资源包规格。  **取值范围**：  不涉及。 
     * @return volume
     */
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupResourcePackageFlavor that = (BackupResourcePackageFlavor) obj;
        return Objects.equals(this.spceCode, that.spceCode) && Objects.equals(this.volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spceCode, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupResourcePackageFlavor {\n");
        sb.append("    spceCode: ").append(toIndentedString(spceCode)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
