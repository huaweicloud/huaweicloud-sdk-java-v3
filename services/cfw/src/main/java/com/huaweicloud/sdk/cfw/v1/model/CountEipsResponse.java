package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CountEipsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_total")

    private Integer eipTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_protected")

    private Integer eipProtected;

    public CountEipsResponse withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象ID
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public CountEipsResponse withEipTotal(Integer eipTotal) {
        this.eipTotal = eipTotal;
        return this;
    }

    /**
     * EIP总数
     * minimum: 0
     * @return eipTotal
     */
    public Integer getEipTotal() {
        return eipTotal;
    }

    public void setEipTotal(Integer eipTotal) {
        this.eipTotal = eipTotal;
    }

    public CountEipsResponse withEipProtected(Integer eipProtected) {
        this.eipProtected = eipProtected;
        return this;
    }

    /**
     * EIP防护数
     * minimum: 0
     * @return eipProtected
     */
    public Integer getEipProtected() {
        return eipProtected;
    }

    public void setEipProtected(Integer eipProtected) {
        this.eipProtected = eipProtected;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountEipsResponse countEipsResponse = (CountEipsResponse) o;
        return Objects.equals(this.objectId, countEipsResponse.objectId)
            && Objects.equals(this.eipTotal, countEipsResponse.eipTotal)
            && Objects.equals(this.eipProtected, countEipsResponse.eipProtected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, eipTotal, eipProtected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountEipsResponse {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    eipTotal: ").append(toIndentedString(eipTotal)).append("\n");
        sb.append("    eipProtected: ").append(toIndentedString(eipProtected)).append("\n");
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
