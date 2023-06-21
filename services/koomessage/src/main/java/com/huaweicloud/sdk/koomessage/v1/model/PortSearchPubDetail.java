package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PortSearchPubDetail
 */
public class PortSearchPubDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_reference")

    private String pubReference;

    public PortSearchPubDetail withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称。
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public PortSearchPubDetail withPubReference(String pubReference) {
        this.pubReference = pubReference;
        return this;
    }

    /**
     * 服务号备注。
     * @return pubReference
     */
    public String getPubReference() {
        return pubReference;
    }

    public void setPubReference(String pubReference) {
        this.pubReference = pubReference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortSearchPubDetail portSearchPubDetail = (PortSearchPubDetail) o;
        return Objects.equals(this.pubName, portSearchPubDetail.pubName)
            && Objects.equals(this.pubReference, portSearchPubDetail.pubReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubName, pubReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortSearchPubDetail {\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    pubReference: ").append(toIndentedString(pubReference)).append("\n");
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
