package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数解释 搭建双活的目标实例信息。 约束限制 不涉及。 取值范围 不涉及。 默认取值 不涉及。
 */
public class DualActiveRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_instance_id")

    private String destinationInstanceId;

    public DualActiveRequestBody withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 参数解释 搭建双活目标实例所在的region。 约束限制 不涉及。 取值范围 不涉及。 默认取值 不涉及。
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public DualActiveRequestBody withDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }

    /**
     * 参数解释 搭建双活目标实例ID。 约束限制 不涉及。 取值范围 不涉及。 默认取值 不涉及。
     * @return destinationInstanceId
     */
    public String getDestinationInstanceId() {
        return destinationInstanceId;
    }

    public void setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DualActiveRequestBody that = (DualActiveRequestBody) obj;
        return Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.destinationInstanceId, that.destinationInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationRegion, destinationInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DualActiveRequestBody {\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationInstanceId: ").append(toIndentedString(destinationInstanceId)).append("\n");
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
