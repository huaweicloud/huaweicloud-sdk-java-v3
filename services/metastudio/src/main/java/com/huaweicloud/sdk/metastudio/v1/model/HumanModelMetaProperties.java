package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HumanModelMetaProperties
 */
public class HumanModelMetaProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whole_model_base_file_id")

    private String wholeModelBaseFileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_model_file_id")

    private String loadModelFileId;

    public HumanModelMetaProperties withWholeModelBaseFileId(String wholeModelBaseFileId) {
        this.wholeModelBaseFileId = wholeModelBaseFileId;
        return this;
    }

    /**
     * **参数解释**： 用于生成WHOLE_MODEL的模型file_id **约束限制**： 如果当前记录的信息与MAIN文件的file_id一致，那就认为已经生成过，无需再进行全模型导出 **取值范围**： 字符长度0-64位。 **默认取值**： 不涉及。
     * @return wholeModelBaseFileId
     */
    public String getWholeModelBaseFileId() {
        return wholeModelBaseFileId;
    }

    public void setWholeModelBaseFileId(String wholeModelBaseFileId) {
        this.wholeModelBaseFileId = wholeModelBaseFileId;
    }

    public HumanModelMetaProperties withLoadModelFileId(String loadModelFileId) {
        this.loadModelFileId = loadModelFileId;
        return this;
    }

    /**
     * **参数解释**： 当前用于渲染加载的模型file_id **约束限制**： 若为空或未匹配到，则使用MAIN文件 **取值范围**： 字符长度0-64位。 **默认取值**： 不涉及。
     * @return loadModelFileId
     */
    public String getLoadModelFileId() {
        return loadModelFileId;
    }

    public void setLoadModelFileId(String loadModelFileId) {
        this.loadModelFileId = loadModelFileId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HumanModelMetaProperties that = (HumanModelMetaProperties) obj;
        return Objects.equals(this.wholeModelBaseFileId, that.wholeModelBaseFileId)
            && Objects.equals(this.loadModelFileId, that.loadModelFileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wholeModelBaseFileId, loadModelFileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HumanModelMetaProperties {\n");
        sb.append("    wholeModelBaseFileId: ").append(toIndentedString(wholeModelBaseFileId)).append("\n");
        sb.append("    loadModelFileId: ").append(toIndentedString(loadModelFileId)).append("\n");
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
