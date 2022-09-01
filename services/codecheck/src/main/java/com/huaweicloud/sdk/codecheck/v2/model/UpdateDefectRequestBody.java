package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateDefectRequestBody
 */
public class UpdateDefectRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_id")

    @JacksonXmlProperty(localName = "defect_id")

    private String defectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_status")

    @JacksonXmlProperty(localName = "defect_status")

    private String defectStatus;

    public UpdateDefectRequestBody withDefectId(String defectId) {
        this.defectId = defectId;
        return this;
    }

    /**
     * 问题id,多个时英文逗号分隔
     * @return defectId
     */
    public String getDefectId() {
        return defectId;
    }

    public void setDefectId(String defectId) {
        this.defectId = defectId;
    }

    public UpdateDefectRequestBody withDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
        return this;
    }

    /**
     * 状态2：已忽略 1：已解决 0：未解决
     * @return defectStatus
     */
    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDefectRequestBody updateDefectRequestBody = (UpdateDefectRequestBody) o;
        return Objects.equals(this.defectId, updateDefectRequestBody.defectId)
            && Objects.equals(this.defectStatus, updateDefectRequestBody.defectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defectId, defectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDefectRequestBody {\n");
        sb.append("    defectId: ").append(toIndentedString(defectId)).append("\n");
        sb.append("    defectStatus: ").append(toIndentedString(defectStatus)).append("\n");
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
