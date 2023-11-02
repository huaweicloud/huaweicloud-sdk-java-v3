package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可用区。
 */
public class AvailabilityZone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private List<String> protocol = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Integer category;

    public AvailabilityZone withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 可用区唯一编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AvailabilityZone withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 可用区状态。  取值：ACTIVE。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AvailabilityZone withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    public AvailabilityZone addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public AvailabilityZone withProtocol(Consumer<List<String>> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * [当前可用区可用的LB规格类别列表。](tag:,hws_hk,ctc,hcs,cmcc,hws_ocb,tm,hws_eu,hcso_dt,dt,dt_test,hws_ocb,ocb,fcs,g42,hk_g42,hws_g42) [当前可用区未售罄的LB规格类别列表。](tag:hws)  取值：L4-表示当前可用区可创建网络型的LB；L7-表示当前可用区可创建应用型的LB。
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public AvailabilityZone withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 可用区组，如：center
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public AvailabilityZone withCategory(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * 范围编码，0表示center，21表示homezone
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailabilityZone that = (AvailabilityZone) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.state, that.state)
            && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, state, protocol, publicBorderGroup, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZone {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
