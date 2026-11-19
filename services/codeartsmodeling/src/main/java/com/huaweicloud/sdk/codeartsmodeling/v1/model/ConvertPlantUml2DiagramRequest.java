package com.huaweicloud.sdk.codeartsmodeling.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ConvertPlantUml2DiagramRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagramUUID")

    private String diagramUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_clear")

    private Boolean isClear;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConvertPlantUml2DiagramRequestBody body;

    public ConvertPlantUml2DiagramRequest withDiagramUUID(String diagramUUID) {
        this.diagramUUID = diagramUUID;
        return this;
    }

    /**
     * diagramUUID
     * @return diagramUUID
     */
    public String getDiagramUUID() {
        return diagramUUID;
    }

    public void setDiagramUUID(String diagramUUID) {
        this.diagramUUID = diagramUUID;
    }

    public ConvertPlantUml2DiagramRequest withIsClear(Boolean isClear) {
        this.isClear = isClear;
        return this;
    }

    /**
     * 是否清空图中元素
     * @return isClear
     */
    public Boolean getIsClear() {
        return isClear;
    }

    public void setIsClear(Boolean isClear) {
        this.isClear = isClear;
    }

    public ConvertPlantUml2DiagramRequest withBody(ConvertPlantUml2DiagramRequestBody body) {
        this.body = body;
        return this;
    }

    public ConvertPlantUml2DiagramRequest withBody(Consumer<ConvertPlantUml2DiagramRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ConvertPlantUml2DiagramRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConvertPlantUml2DiagramRequestBody getBody() {
        return body;
    }

    public void setBody(ConvertPlantUml2DiagramRequestBody body) {
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
        ConvertPlantUml2DiagramRequest that = (ConvertPlantUml2DiagramRequest) obj;
        return Objects.equals(this.diagramUUID, that.diagramUUID) && Objects.equals(this.isClear, that.isClear)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagramUUID, isClear, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertPlantUml2DiagramRequest {\n");
        sb.append("    diagramUUID: ").append(toIndentedString(diagramUUID)).append("\n");
        sb.append("    isClear: ").append(toIndentedString(isClear)).append("\n");
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
