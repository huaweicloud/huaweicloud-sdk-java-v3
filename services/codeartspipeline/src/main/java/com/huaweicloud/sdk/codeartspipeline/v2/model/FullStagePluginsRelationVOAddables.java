package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FullStagePluginsRelationVOAddables
 */
public class FullStagePluginsRelationVOAddables {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additionalProp1")

    private Boolean additionalProp1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additionalProp2")

    private Boolean additionalProp2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additionalProp3")

    private Boolean additionalProp3;

    public FullStagePluginsRelationVOAddables withAdditionalProp1(Boolean additionalProp1) {
        this.additionalProp1 = additionalProp1;
        return this;
    }

    /**
     * **参数解释**： 额外属性1。 **取值范围**： 不涉及。 
     * @return additionalProp1
     */
    public Boolean getAdditionalProp1() {
        return additionalProp1;
    }

    public void setAdditionalProp1(Boolean additionalProp1) {
        this.additionalProp1 = additionalProp1;
    }

    public FullStagePluginsRelationVOAddables withAdditionalProp2(Boolean additionalProp2) {
        this.additionalProp2 = additionalProp2;
        return this;
    }

    /**
     * **参数解释**： 额外属性2。 **取值范围**： 不涉及。 
     * @return additionalProp2
     */
    public Boolean getAdditionalProp2() {
        return additionalProp2;
    }

    public void setAdditionalProp2(Boolean additionalProp2) {
        this.additionalProp2 = additionalProp2;
    }

    public FullStagePluginsRelationVOAddables withAdditionalProp3(Boolean additionalProp3) {
        this.additionalProp3 = additionalProp3;
        return this;
    }

    /**
     * **参数解释**： 额外属性3。 **取值范围**： 不涉及。 
     * @return additionalProp3
     */
    public Boolean getAdditionalProp3() {
        return additionalProp3;
    }

    public void setAdditionalProp3(Boolean additionalProp3) {
        this.additionalProp3 = additionalProp3;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullStagePluginsRelationVOAddables that = (FullStagePluginsRelationVOAddables) obj;
        return Objects.equals(this.additionalProp1, that.additionalProp1)
            && Objects.equals(this.additionalProp2, that.additionalProp2)
            && Objects.equals(this.additionalProp3, that.additionalProp3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalProp1, additionalProp2, additionalProp3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullStagePluginsRelationVOAddables {\n");
        sb.append("    additionalProp1: ").append(toIndentedString(additionalProp1)).append("\n");
        sb.append("    additionalProp2: ").append(toIndentedString(additionalProp2)).append("\n");
        sb.append("    additionalProp3: ").append(toIndentedString(additionalProp3)).append("\n");
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
