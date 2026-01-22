package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EwPrivateNetworkSegmentsDto
 */
public class EwPrivateNetworkSegmentsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_network_segments")

    private List<PrivateNetworkSegmentVO> privateNetworkSegments = null;

    public EwPrivateNetworkSegmentsDto withPrivateNetworkSegments(
        List<PrivateNetworkSegmentVO> privateNetworkSegments) {
        this.privateNetworkSegments = privateNetworkSegments;
        return this;
    }

    public EwPrivateNetworkSegmentsDto addPrivateNetworkSegmentsItem(
        PrivateNetworkSegmentVO privateNetworkSegmentsItem) {
        if (this.privateNetworkSegments == null) {
            this.privateNetworkSegments = new ArrayList<>();
        }
        this.privateNetworkSegments.add(privateNetworkSegmentsItem);
        return this;
    }

    public EwPrivateNetworkSegmentsDto withPrivateNetworkSegments(
        Consumer<List<PrivateNetworkSegmentVO>> privateNetworkSegmentsSetter) {
        if (this.privateNetworkSegments == null) {
            this.privateNetworkSegments = new ArrayList<>();
        }
        privateNetworkSegmentsSetter.accept(this.privateNetworkSegments);
        return this;
    }

    /**
     * **参数解释**： 私网网段的信息列表，用于东西向VPC防护引流 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return privateNetworkSegments
     */
    public List<PrivateNetworkSegmentVO> getPrivateNetworkSegments() {
        return privateNetworkSegments;
    }

    public void setPrivateNetworkSegments(List<PrivateNetworkSegmentVO> privateNetworkSegments) {
        this.privateNetworkSegments = privateNetworkSegments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EwPrivateNetworkSegmentsDto that = (EwPrivateNetworkSegmentsDto) obj;
        return Objects.equals(this.privateNetworkSegments, that.privateNetworkSegments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateNetworkSegments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EwPrivateNetworkSegmentsDto {\n");
        sb.append("    privateNetworkSegments: ").append(toIndentedString(privateNetworkSegments)).append("\n");
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
