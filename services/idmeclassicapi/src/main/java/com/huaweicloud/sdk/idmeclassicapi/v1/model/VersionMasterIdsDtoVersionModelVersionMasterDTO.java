package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionMasterIdsDtoVersionModelVersionMasterDTO
 */
public class VersionMasterIdsDtoVersionModelVersionMasterDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterIds")

    private List<VersionModelMasterIdsDTO> masterIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    public VersionMasterIdsDtoVersionModelVersionMasterDTO withMasterIds(List<VersionModelMasterIdsDTO> masterIds) {
        this.masterIds = masterIds;
        return this;
    }

    public VersionMasterIdsDtoVersionModelVersionMasterDTO addMasterIdsItem(VersionModelMasterIdsDTO masterIdsItem) {
        if (this.masterIds == null) {
            this.masterIds = new ArrayList<>();
        }
        this.masterIds.add(masterIdsItem);
        return this;
    }

    public VersionMasterIdsDtoVersionModelVersionMasterDTO withMasterIds(
        Consumer<List<VersionModelMasterIdsDTO>> masterIdsSetter) {
        if (this.masterIds == null) {
            this.masterIds = new ArrayList<>();
        }
        masterIdsSetter.accept(this.masterIds);
        return this;
    }

    /**
     * **参数解释：**  主对象集合。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return masterIds
     */
    public List<VersionModelMasterIdsDTO> getMasterIds() {
        return masterIds;
    }

    public void setMasterIds(List<VersionModelMasterIdsDTO> masterIds) {
        this.masterIds = masterIds;
    }

    public VersionMasterIdsDtoVersionModelVersionMasterDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  更新者。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionMasterIdsDtoVersionModelVersionMasterDTO that = (VersionMasterIdsDtoVersionModelVersionMasterDTO) obj;
        return Objects.equals(this.masterIds, that.masterIds) && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterIds, modifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionMasterIdsDtoVersionModelVersionMasterDTO {\n");
        sb.append("    masterIds: ").append(toIndentedString(masterIds)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
