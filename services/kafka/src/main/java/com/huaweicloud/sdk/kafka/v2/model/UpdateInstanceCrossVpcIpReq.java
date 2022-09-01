package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateInstanceCrossVpcIpReq
 */
public class UpdateInstanceCrossVpcIpReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advertised_ip_contents")

    @JacksonXmlProperty(localName = "advertised_ip_contents")

    private Map<String, String> advertisedIpContents = null;

    public UpdateInstanceCrossVpcIpReq withAdvertisedIpContents(Map<String, String> advertisedIpContents) {
        this.advertisedIpContents = advertisedIpContents;
        return this;
    }

    public UpdateInstanceCrossVpcIpReq putAdvertisedIpContentsItem(String key, String advertisedIpContentsItem) {
        if (this.advertisedIpContents == null) {
            this.advertisedIpContents = new HashMap<>();
        }
        this.advertisedIpContents.put(key, advertisedIpContentsItem);
        return this;
    }

    public UpdateInstanceCrossVpcIpReq withAdvertisedIpContents(
        Consumer<Map<String, String>> advertisedIpContentsSetter) {
        if (this.advertisedIpContents == null) {
            this.advertisedIpContents = new HashMap<>();
        }
        advertisedIpContentsSetter.accept(this.advertisedIpContents);
        return this;
    }

    /**
     * 用户自定义的advertised_ip_contents键值对。  键是listeners IP。  值是advertised.listeners IP，或者域名。  > IP修改未修改项也需填上。
     * @return advertisedIpContents
     */
    public Map<String, String> getAdvertisedIpContents() {
        return advertisedIpContents;
    }

    public void setAdvertisedIpContents(Map<String, String> advertisedIpContents) {
        this.advertisedIpContents = advertisedIpContents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceCrossVpcIpReq updateInstanceCrossVpcIpReq = (UpdateInstanceCrossVpcIpReq) o;
        return Objects.equals(this.advertisedIpContents, updateInstanceCrossVpcIpReq.advertisedIpContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advertisedIpContents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceCrossVpcIpReq {\n");
        sb.append("    advertisedIpContents: ").append(toIndentedString(advertisedIpContents)).append("\n");
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
