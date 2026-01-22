package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 查询域名解析的ip列表 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
 */
public class ParseIpListResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excess_ip")

    private List<String> excessIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parsed_success_ip")

    private List<String> parsedSuccessIp = null;

    public ParseIpListResponse withExcessIp(List<String> excessIp) {
        this.excessIp = excessIp;
        return this;
    }

    public ParseIpListResponse addExcessIpItem(String excessIpItem) {
        if (this.excessIp == null) {
            this.excessIp = new ArrayList<>();
        }
        this.excessIp.add(excessIpItem);
        return this;
    }

    public ParseIpListResponse withExcessIp(Consumer<List<String>> excessIpSetter) {
        if (this.excessIp == null) {
            this.excessIp = new ArrayList<>();
        }
        excessIpSetter.accept(this.excessIp);
        return this;
    }

    /**
     * **参数解释**： 超过限制的ip列表 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return excessIp
     */
    public List<String> getExcessIp() {
        return excessIp;
    }

    public void setExcessIp(List<String> excessIp) {
        this.excessIp = excessIp;
    }

    public ParseIpListResponse withParsedSuccessIp(List<String> parsedSuccessIp) {
        this.parsedSuccessIp = parsedSuccessIp;
        return this;
    }

    public ParseIpListResponse addParsedSuccessIpItem(String parsedSuccessIpItem) {
        if (this.parsedSuccessIp == null) {
            this.parsedSuccessIp = new ArrayList<>();
        }
        this.parsedSuccessIp.add(parsedSuccessIpItem);
        return this;
    }

    public ParseIpListResponse withParsedSuccessIp(Consumer<List<String>> parsedSuccessIpSetter) {
        if (this.parsedSuccessIp == null) {
            this.parsedSuccessIp = new ArrayList<>();
        }
        parsedSuccessIpSetter.accept(this.parsedSuccessIp);
        return this;
    }

    /**
     * **参数解释**： 成功解析的ip列表 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return parsedSuccessIp
     */
    public List<String> getParsedSuccessIp() {
        return parsedSuccessIp;
    }

    public void setParsedSuccessIp(List<String> parsedSuccessIp) {
        this.parsedSuccessIp = parsedSuccessIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParseIpListResponse that = (ParseIpListResponse) obj;
        return Objects.equals(this.excessIp, that.excessIp)
            && Objects.equals(this.parsedSuccessIp, that.parsedSuccessIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excessIp, parsedSuccessIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseIpListResponse {\n");
        sb.append("    excessIp: ").append(toIndentedString(excessIp)).append("\n");
        sb.append("    parsedSuccessIp: ").append(toIndentedString(parsedSuccessIp)).append("\n");
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
