package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InspectionVpcInfo
 */
public class InspectionVpcInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_vpc_id")

    private String inspectionVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public InspectionVpcInfo withInspectionVpcId(String inspectionVpcId) {
        this.inspectionVpcId = inspectionVpcId;
        return this;
    }

    /**
     * **参数解释**： 引流VPC  **取值范围**： 不涉及
     * @return inspectionVpcId
     */
    public String getInspectionVpcId() {
        return inspectionVpcId;
    }

    public void setInspectionVpcId(String inspectionVpcId) {
        this.inspectionVpcId = inspectionVpcId;
    }

    public InspectionVpcInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 引流VPC  **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectionVpcInfo that = (InspectionVpcInfo) obj;
        return Objects.equals(this.inspectionVpcId, that.inspectionVpcId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspectionVpcId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectionVpcInfo {\n");
        sb.append("    inspectionVpcId: ").append(toIndentedString(inspectionVpcId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
