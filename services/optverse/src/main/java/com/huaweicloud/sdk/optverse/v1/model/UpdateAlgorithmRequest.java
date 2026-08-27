package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAlgorithmRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_id")

    private String algorithmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAlgorithmDto body;

    public UpdateAlgorithmRequest withAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }

    /**
     * **参数解释**： 算法项目标识符。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
    }

    public UpdateAlgorithmRequest withBody(UpdateAlgorithmDto body) {
        this.body = body;
        return this;
    }

    public UpdateAlgorithmRequest withBody(Consumer<UpdateAlgorithmDto> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAlgorithmDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAlgorithmDto getBody() {
        return body;
    }

    public void setBody(UpdateAlgorithmDto body) {
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
        UpdateAlgorithmRequest that = (UpdateAlgorithmRequest) obj;
        return Objects.equals(this.algorithmId, that.algorithmId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithmId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlgorithmRequest {\n");
        sb.append("    algorithmId: ").append(toIndentedString(algorithmId)).append("\n");
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
