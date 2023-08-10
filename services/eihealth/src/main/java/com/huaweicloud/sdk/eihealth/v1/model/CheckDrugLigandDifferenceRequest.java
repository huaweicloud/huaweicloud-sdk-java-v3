package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CheckDrugLigandDifferenceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CheckLigandDifferenceReq body;

    public CheckDrugLigandDifferenceRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public CheckDrugLigandDifferenceRequest withBody(CheckLigandDifferenceReq body) {
        this.body = body;
        return this;
    }

    public CheckDrugLigandDifferenceRequest withBody(Consumer<CheckLigandDifferenceReq> bodySetter) {
        if (this.body == null) {
            this.body = new CheckLigandDifferenceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CheckLigandDifferenceReq getBody() {
        return body;
    }

    public void setBody(CheckLigandDifferenceReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckDrugLigandDifferenceRequest that = (CheckDrugLigandDifferenceRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDrugLigandDifferenceRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
