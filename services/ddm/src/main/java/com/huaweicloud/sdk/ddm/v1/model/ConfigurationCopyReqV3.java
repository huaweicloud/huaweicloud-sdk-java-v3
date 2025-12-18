package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体
 */
public class ConfigurationCopyReqV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_para")

    private ParaGroupCopy copyPara;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    public ConfigurationCopyReqV3 withCopyPara(ParaGroupCopy copyPara) {
        this.copyPara = copyPara;
        return this;
    }

    public ConfigurationCopyReqV3 withCopyPara(Consumer<ParaGroupCopy> copyParaSetter) {
        if (this.copyPara == null) {
            this.copyPara = new ParaGroupCopy();
            copyParaSetter.accept(this.copyPara);
        }

        return this;
    }

    /**
     * Get copyPara
     * @return copyPara
     */
    public ParaGroupCopy getCopyPara() {
        return copyPara;
    }

    public void setCopyPara(ParaGroupCopy copyPara) {
        this.copyPara = copyPara;
    }

    public ConfigurationCopyReqV3 withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释**：  目标参数组ID。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，长度为36个字符。  **默认取值**：  不涉及。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationCopyReqV3 that = (ConfigurationCopyReqV3) obj;
        return Objects.equals(this.copyPara, that.copyPara) && Objects.equals(this.sourceId, that.sourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(copyPara, sourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationCopyReqV3 {\n");
        sb.append("    copyPara: ").append(toIndentedString(copyPara)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
