package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 可用区。 */
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

    public AvailabilityZone withCode(String code) {
        this.code = code;
        return this;
    }

    /** 可用区唯一编码。
     * 
     * @return code */
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

    /** 可用区状态。 取值：ACTIVE。
     * 
     * @return state */
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

    /** 未售罄的LB规格类别。取值： - L4：表示网络型LB未售罄。 - L7：表示应用型LB未售罄。
     * 
     * @return protocol */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailabilityZone availabilityZone = (AvailabilityZone) o;
        return Objects.equals(this.code, availabilityZone.code) && Objects.equals(this.state, availabilityZone.state)
            && Objects.equals(this.protocol, availabilityZone.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, state, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZone {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
