package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryVariableGroupDetailRespVariables
 */
public class QueryVariableGroupDetailRespVariables {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_secret")

    private Boolean isSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public QueryVariableGroupDetailRespVariables withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 参数名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryVariableGroupDetailRespVariables withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释**： 参数序号。 **取值范围**： 不涉及。 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public QueryVariableGroupDetailRespVariables withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 参数类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QueryVariableGroupDetailRespVariables withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 参数默认值。 **取值范围**： 不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueryVariableGroupDetailRespVariables withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

    /**
     * **参数解释**： 是否私密。 **取值范围**： - true：是私密参数。 - false：不是私密参数。 
     * @return isSecret
     */
    public Boolean getIsSecret() {
        return isSecret;
    }

    public void setIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
    }

    public QueryVariableGroupDetailRespVariables withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryVariableGroupDetailRespVariables that = (QueryVariableGroupDetailRespVariables) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sequence, that.sequence)
            && Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.isSecret, that.isSecret) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sequence, type, value, isSecret, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryVariableGroupDetailRespVariables {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
